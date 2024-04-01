package com.whatsapp.payments;

import X.C000200d;
import X.C007203d;
import X.C00J;
import X.C03650Gn;
import X.C0DW;
import X.C0DX;
import X.C0GR;
import X.C895447k;
import X.InterfaceC007103c;
import X.InterfaceC013706o;
import X.InterfaceC03570Gf;
import X.InterfaceC03590Gh;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes3.dex */
public class PaymentConfiguration implements InterfaceC03570Gf {
    public static volatile PaymentConfiguration INSTANCE;
    public InterfaceC03590Gh cachedPaymentFactory;
    public final C895447k paymentConfigurationMap;
    public final C0GR paymentsCountryManager;
    public final C0DW paymentsGatingManager;

    public PaymentConfiguration(C0DW c0dw, C0GR c0gr, C895447k c895447k) {
        this.paymentsGatingManager = c0dw;
        this.paymentsCountryManager = c0gr;
        this.paymentConfigurationMap = c895447k;
    }

    public static InterfaceC03570Gf getInstance() {
        if (INSTANCE == null) {
            synchronized (PaymentConfiguration.class) {
                if (INSTANCE == null) {
                    C0DW A00 = C0DW.A00();
                    C0GR A002 = C0GR.A00();
                    if (C895447k.A01 == null) {
                        synchronized (C895447k.class) {
                            if (C895447k.A01 == null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("BR", C007203d.A00(new InterfaceC007103c() { // from class: X.3he
                                    @Override // X.InterfaceC007103c
                                    public final Object get() {
                                        return C92294Ii.A00();
                                    }
                                }));
                                hashMap.put("IN", C007203d.A00(new InterfaceC007103c() { // from class: X.3hQ
                                    @Override // X.InterfaceC007103c
                                    public final Object get() {
                                        return C92304Ij.A00();
                                    }
                                }));
                                C895447k.A01 = new C895447k(hashMap);
                            }
                        }
                    }
                    INSTANCE = new PaymentConfiguration(A00, A002, C895447k.A01);
                }
            }
        }
        return INSTANCE;
    }

    @Override // X.InterfaceC03570Gf
    public String getPaymentCountryFromCurrency(String str) {
        if (this.paymentConfigurationMap != null) {
            if (str != null) {
                str = str.toUpperCase(Locale.US);
            }
            if (!TextUtils.isEmpty(str)) {
                int hashCode = str.hashCode();
                if (hashCode != 66044) {
                    if (hashCode == 72653 && str.equals("INR")) {
                        return "IN";
                    }
                } else if (str.equals("BRL")) {
                    return "BR";
                }
                return C03650Gn.A0F.A02;
            }
            return C03650Gn.A0F.A02;
        }
        throw null;
    }

    @Override // X.InterfaceC03570Gf
    public C0DX getPaymentService(String str, String str2) {
        C895447k c895447k = this.paymentConfigurationMap;
        if (c895447k != null) {
            if (str != null) {
                str = str.toUpperCase(Locale.US);
            }
            if (!c895447k.A00.containsKey(str)) {
                C000200d.A13("PAY: PaymentConfigurationMap/getPaymentFactory/unmapped service for country code=", str);
                return null;
            }
            if (str2 != null) {
                str2 = str2.toUpperCase(Locale.US);
            }
            if (!TextUtils.isEmpty(str2)) {
                int hashCode = str2.hashCode();
                if (hashCode != 66044) {
                    if (hashCode == 72653 && str2.equals("INR")) {
                        return (C0DX) ((C00J) c895447k.A00.get("IN")).get();
                    }
                } else if (str2.equals("BRL")) {
                    return (C0DX) ((C00J) c895447k.A00.get("BR")).get();
                }
                Log.e("PAY: PaymentConfigurationMap/getPaymentService/currency set/unmapped service for currency");
            }
            if (!TextUtils.isEmpty(str)) {
                int hashCode2 = str.hashCode();
                if (hashCode2 != 2128) {
                    if (hashCode2 == 2341 && str.equals("IN")) {
                        return (C0DX) ((C00J) c895447k.A00.get("IN")).get();
                    }
                } else if (str.equals("BR")) {
                    return (C0DX) ((C00J) c895447k.A00.get("BR")).get();
                }
                StringBuilder sb = new StringBuilder("PAY: PaymentConfigurationMap/getPaymentService/country=");
                sb.append(str);
                sb.append("/unmapped service");
                Log.e(sb.toString());
            }
            Log.e("PAY: PaymentConfigurationMap/getPaymentService/unmapped service for country and currency");
            return null;
        }
        throw null;
    }

    @Override // X.InterfaceC03580Gg
    public C0DX getService() {
        String str;
        C03650Gn A02 = this.paymentsCountryManager.A02();
        if (A02 == null) {
            Log.e("PAY: PaymentConfiguration/getService/null country");
            return null;
        }
        InterfaceC03590Gh initializeFactory = initializeFactory(A02.A02);
        InterfaceC013706o A01 = this.paymentsCountryManager.A01();
        if (A01 != null) {
            str = A01.A9K();
        } else {
            str = null;
        }
        C000200d.A1M(C000200d.A0P("PAY: PaymentConfiguration/getService/defaulted to countryCode="), A02.A02);
        if (initializeFactory != null) {
            return initializeFactory.ACJ(str);
        }
        return null;
    }

    @Override // X.InterfaceC03580Gg
    public C0DX getServiceBy(String str, String str2) {
        InterfaceC03590Gh initializeFactory = initializeFactory(str);
        if (initializeFactory != null) {
            return initializeFactory.ACJ(str2);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.3Nk] */
    @Override // X.InterfaceC03570Gf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.InterfaceC03590Gh initializeFactory(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r8 = 0
            if (r0 != 0) goto L11
            X.0Gn r0 = X.C03650Gn.A0F
            java.lang.String r0 = r0.A02
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L2c
        L11:
            X.0GR r0 = r9.paymentsCountryManager
            X.0Gn r2 = r0.A02()
            if (r2 != 0) goto L1f
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/null default country"
            com.whatsapp.util.Log.e(r0)
            return r8
        L1f:
            java.lang.String r0 = "PAY: PaymentConfiguration/initializeFactory/null country code/default country code="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            java.lang.String r0 = r2.A02
            X.C000200d.A1M(r1, r0)
            java.lang.String r10 = r2.A02
        L2c:
            X.0Gh r4 = r9.cachedPaymentFactory
            if (r4 == 0) goto L36
            boolean r0 = r4.A7g(r10)
            if (r0 != 0) goto L48
        L36:
            X.47k r1 = r9.paymentConfigurationMap
            if (r1 == 0) goto Le0
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L4b
            java.lang.String r0 = "PAY: PaymentConfigurationMap/getPaymentFactory/empty country code"
            com.whatsapp.util.Log.e(r0)
        L45:
            r4 = r8
        L46:
            r9.cachedPaymentFactory = r4
        L48:
            if (r4 != 0) goto Ld0
            return r8
        L4b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r10.toUpperCase(r0)
            java.util.Map r6 = r1.A00
            boolean r0 = r6.containsKey(r7)
            java.lang.String r5 = "PAY: PaymentConfigurationMap/getPaymentFactory/unmapped factory for country code="
            if (r0 != 0) goto L5f
            X.C000200d.A13(r5, r7)
            goto L45
        L5f:
            X.3i6 r4 = new X.3i6
            r4.<init>(r7)
            int r3 = r7.hashCode()
            r0 = 2128(0x850, float:2.982E-42)
            java.lang.String r2 = "IN"
            java.lang.String r1 = "BR"
            if (r3 == r0) goto L9f
            r0 = 2341(0x925, float:3.28E-42)
            if (r3 != r0) goto Lcb
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto Lcb
            X.4Gy r3 = new X.4Gy
            r3.<init>()
            java.lang.Object r0 = r6.get(r2)
            X.00J r0 = (X.C00J) r0
            java.lang.Object r2 = r0.get()
            X.0DX r2 = (X.C0DX) r2
            java.lang.String r0 = "INR"
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r3.A00(r2, r0)
            java.util.List r0 = r4.A01
            r0.add(r3)
            goto L46
        L9f:
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto Lcb
            X.4Gx r3 = new X.4Gx
            r3.<init>()
            java.lang.Object r0 = r6.get(r1)
            X.00J r0 = (X.C00J) r0
            java.lang.Object r2 = r0.get()
            X.0DX r2 = (X.C0DX) r2
            java.lang.String r0 = "BRL"
            java.util.Set r1 = java.util.Collections.singleton(r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r1)
            r3.A00(r2, r0)
            java.util.List r0 = r4.A01
            r0.add(r3)
            goto L46
        Lcb:
            X.C000200d.A13(r5, r7)
            goto L45
        Ld0:
            X.0DW r0 = r9.paymentsGatingManager
            if (r0 == 0) goto Ldf
            X.3Nk r0 = new X.3Nk
            r0.<init>()
            r4.A7n(r0)
            X.0Gh r0 = r9.cachedPaymentFactory
            return r0
        Ldf:
            throw r8
        Le0:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.PaymentConfiguration.initializeFactory(java.lang.String):X.0Gh");
    }
}
