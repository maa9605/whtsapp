package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4Ij  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C92304Ij extends AbstractC91964Gz {
    public static volatile C92304Ij A0M;
    public final C018508q A00;
    public final C01B A01;
    public final C0E7 A02;
    public final AnonymousClass012 A03;
    public final C001200o A04;
    public final C002301c A05;
    public final C013306k A06;
    public final C013606n A07;
    public final C45A A08;
    public final C894947f A09;
    public final C90564Bm A0A;
    public final C0GZ A0B;
    public final C28S A0C;
    public final C2OU A0D;
    public final C0EX A0E;
    public final C463026g A0F;
    public final C4CV A0G;
    public final C90944Da A0H;
    public final C0VZ A0I;
    public final C49682Lx A0J;
    public final C03750Gx A0K;
    public final InterfaceC002901k A0L;

    @Override // X.C0DX
    public String AC1() {
        return null;
    }

    @Override // X.C0DX
    public C49H ACD() {
        return null;
    }

    @Override // X.C0DX
    public int AD6() {
        return 1;
    }

    @Override // X.C0DX
    public boolean AFA() {
        return true;
    }

    @Override // X.C0DX
    public boolean AFy(C69173Nk c69173Nk) {
        return true;
    }

    public C92304Ij(AnonymousClass012 anonymousClass012, C018508q c018508q, C001200o c001200o, InterfaceC002901k interfaceC002901k, C01B c01b, C03750Gx c03750Gx, C002301c c002301c, C49682Lx c49682Lx, C0DV c0dv, C0VZ c0vz, C90944Da c90944Da, C0E7 c0e7, C0GZ c0gz, C894947f c894947f, C463026g c463026g, C013606n c013606n, C013306k c013306k, C45A c45a, C4CV c4cv, C28S c28s, C90564Bm c90564Bm, C2OU c2ou, C0EX c0ex) {
        super(c0dv);
        this.A03 = anonymousClass012;
        this.A00 = c018508q;
        this.A04 = c001200o;
        this.A0L = interfaceC002901k;
        this.A01 = c01b;
        this.A0K = c03750Gx;
        this.A05 = c002301c;
        this.A0J = c49682Lx;
        this.A0I = c0vz;
        this.A0H = c90944Da;
        this.A02 = c0e7;
        this.A0B = c0gz;
        this.A09 = c894947f;
        this.A0F = c463026g;
        this.A07 = c013606n;
        this.A06 = c013306k;
        this.A08 = c45a;
        this.A0G = c4cv;
        this.A0C = c28s;
        this.A0A = c90564Bm;
        this.A0D = c2ou;
        this.A0E = c0ex;
    }

    public static C92304Ij A00() {
        if (A0M == null) {
            synchronized (C92304Ij.class) {
                if (A0M == null) {
                    A0M = new C92304Ij(AnonymousClass012.A00(), C018508q.A00(), C001200o.A01, C002801j.A00(), C01B.A00(), C03750Gx.A02(), C002301c.A00(), C49682Lx.A00(), C0DV.A00(), C0VZ.A00(), C90944Da.A01(), C0E7.A00(), C0GZ.A00(), C894947f.A00(), C463026g.A00(), C013606n.A03(), C013306k.A07(), C45A.A00(), C4CV.A00(), C28S.A00(), C90564Bm.A00(), C2OU.A00(), C0EX.A00);
                }
            }
        }
        return A0M;
    }

    @Override // X.C0DX
    public Class A8G() {
        return IndiaUpiBankAccountDetailsActivity.class;
    }

    @Override // X.C0DX
    public InterfaceC03660Go A9B() {
        return this.A0A;
    }

    @Override // X.C0DX
    public InterfaceC06790Va A9D() {
        return this.A0H;
    }

    @Override // X.C0DY
    public C2GP A9E() {
        final C001200o c001200o = this.A04;
        final C0DV c0dv = super.A00;
        final C0GZ c0gz = this.A0B;
        final C90564Bm c90564Bm = this.A0A;
        return new C2GP(c001200o, c0dv, c0gz, c90564Bm) { // from class: X.4Bq
            public final C001200o A00;
            public final C90564Bm A01;
            public final C0GZ A02;
            public final C0DV A03;

            @Override // X.C2GP
            public byte[] AKz(C0N2 c0n2) {
                return null;
            }

            {
                this.A00 = c001200o;
                this.A03 = c0dv;
                this.A02 = c0gz;
                this.A01 = c90564Bm;
            }

            @Override // X.C2GP
            public void A5L(List list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0N0 c0n0 = ((C0N2) it.next()).A06;
                    if ((c0n0 instanceof C4IA) && ((C4IA) c0n0).A0G) {
                        C0GZ c0gz2 = this.A02;
                        synchronized (c0gz2) {
                            c0gz2.A05(c0gz2.A01("2fa"));
                        }
                    }
                }
            }

            @Override // X.C2GP
            public C0N2 A5e(C0N2 c0n2) {
                String str;
                C0N0 c0n0;
                C4IA c4ia = (C4IA) c0n2.A06;
                StringBuilder A0P = C000200d.A0P("PAY: beforeMethodAdded got methodData: ");
                if (c4ia != null) {
                    StringBuilder A0P2 = C000200d.A0P("vpa: ");
                    A0P2.append(C40841sx.A0Q(c4ia.A0D));
                    A0P2.append(" image: ");
                    A0P2.append(((C0N5) c4ia).A01);
                    A0P2.append(" supportPhoneNumber: ");
                    A0P2.append(c4ia.A0B);
                    str = A0P2.toString();
                } else {
                    str = "null";
                }
                C000200d.A1N(A0P, str);
                if (c4ia != null) {
                    if (!TextUtils.isEmpty(((C0N5) c4ia).A01)) {
                        String str2 = ((C0N5) c4ia).A01;
                        C001200o c001200o2 = this.A00;
                        File file = new File(c001200o2.A00.getCacheDir(), "BankLogos");
                        if (!file.mkdirs() && !file.isDirectory()) {
                            Log.w("PAY: IndiaUpiStorageObserver/imageUrlToByteArray unable to create bank logos cache directory");
                        }
                        C55922mP c55922mP = new C55922mP(file, 1048576L);
                        String A01 = C02A.A01(str2);
                        if (A01 != null) {
                            Bitmap A00 = c55922mP.A00(A01, c001200o2.A00.getResources().getDimensionPixelSize(R.dimen.payment_bitmap_image_url_max_size), c001200o2.A00.getResources().getDimensionPixelSize(R.dimen.payment_bitmap_image_url_max_size));
                            c55922mP.A03(false);
                            if (A00 != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                A00.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                if (byteArray != null) {
                                    c0n2.A0B = byteArray;
                                }
                            }
                            c0n2.A0B = C40841sx.A0o(((C0N5) c4ia).A01);
                        } else {
                            throw null;
                        }
                    }
                    C0DV c0dv2 = this.A03;
                    c0dv2.A04();
                    C0N2 A08 = c0dv2.A08.A08(c0n2.A07);
                    if (A08 != null && (c0n0 = A08.A06) != null) {
                        C4IA c4ia2 = (C4IA) c0n0;
                        if (TextUtils.isEmpty(c4ia.A0D)) {
                            c4ia.A0D = c4ia2.A0D;
                        }
                        if (TextUtils.isEmpty(c4ia.A0E)) {
                            c4ia.A0E = c4ia2.A0E;
                        }
                        if (TextUtils.isEmpty(c4ia.A06)) {
                            c4ia.A06 = c4ia2.A06();
                        }
                    }
                    if (TextUtils.isEmpty(c4ia.A0D)) {
                        String A05 = this.A01.A05();
                        if (!TextUtils.isEmpty(A05)) {
                            c4ia.A0D = A05;
                        }
                    }
                    if (TextUtils.isEmpty(c4ia.A0E)) {
                        String A09 = this.A01.A09();
                        if (!TextUtils.isEmpty(A09)) {
                            c4ia.A0E = A09;
                        }
                    }
                    C90564Bm c90564Bm2 = this.A01;
                    String str3 = c4ia.A0D;
                    String str4 = c4ia.A0E;
                    String str5 = c4ia.A07;
                    String str6 = c4ia.A0C;
                    synchronized (c90564Bm2) {
                        try {
                            C0EU c0eu = c90564Bm2.A02;
                            String A06 = c0eu.A06();
                            JSONObject jSONObject = TextUtils.isEmpty(A06) ? new JSONObject() : new JSONObject(A06);
                            if (!TextUtils.isEmpty(str3)) {
                                c90564Bm2.A0I(jSONObject, str3, str4);
                                StringBuilder sb = new StringBuilder();
                                sb.append("PAY: IndiaUpiPaymentSharedPrefs updated handle: ");
                                sb.append(C40841sx.A0Q(str3));
                                Log.i(sb.toString());
                            }
                            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                                c90564Bm2.A0H(jSONObject, str5, str6);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("PAY: IndiaUpiPaymentSharedPrefs updated psp: ");
                                sb2.append(str5);
                                sb2.append(" transactionPrefix: ");
                                sb2.append(str6);
                                Log.i(sb2.toString());
                            }
                            c0eu.A0H(jSONObject.toString());
                        } catch (JSONException e) {
                            Log.w("PAY: IndiaUpiPaymentSharedPrefs updateHandleDeviceBinding threw: ", e);
                        }
                    }
                }
                return c0n2;
            }
        };
    }

    @Override // X.C0DX
    public C28T AA9() {
        return this.A0G;
    }

    @Override // X.C0DX
    public C2EG ABu() {
        return new C2EG() { // from class: X.4Be
            public static final void A00(int i, C02590Ca c02590Ca, C02590Ca c02590Ca2, ArrayList arrayList, C013606n c013606n) {
                int length;
                int i2 = 0;
                if (i == 2) {
                    C02590Ca[] c02590CaArr = c02590Ca2.A03;
                    if (c02590CaArr == null) {
                        return;
                    }
                    int length2 = c02590CaArr.length;
                    while (i2 < length2) {
                        C02590Ca c02590Ca3 = c02590CaArr[i2];
                        if (c02590Ca3 != null) {
                            if ("bank".equals(c02590Ca3.A00)) {
                                C4IA c4ia = new C4IA();
                                c4ia.A03(c013606n, 2, c02590Ca);
                                c4ia.A03(c013606n, 2, c02590Ca3);
                                arrayList.add(c4ia);
                            } else if ("psp".equals(c02590Ca3.A00) || "psp-routing".equals(c02590Ca3.A00)) {
                                C90544Bk c90544Bk = new C90544Bk();
                                c90544Bk.A03(c013606n, 2, c02590Ca3);
                                arrayList.add(c90544Bk);
                            }
                        }
                        i2++;
                    }
                } else if (i != 4) {
                    if (i != 5) {
                        StringBuilder sb = new StringBuilder("PAY: IndiaProtoParser got action: ");
                        sb.append(i);
                        sb.append("; nothing to do");
                        Log.i(sb.toString());
                        return;
                    }
                    C90544Bk c90544Bk2 = new C90544Bk();
                    c90544Bk2.A03(c013606n, 5, c02590Ca2);
                    arrayList.add(c90544Bk2);
                } else {
                    C02590Ca[] c02590CaArr2 = c02590Ca2.A03;
                    if (c02590CaArr2 == null || (length = c02590CaArr2.length) <= 0) {
                        return;
                    }
                    while (i2 < length) {
                        C02590Ca c02590Ca4 = c02590CaArr2[i2];
                        if (c02590Ca4 != null) {
                            C4IA c4ia2 = new C4IA();
                            c4ia2.A03(c013606n, 4, c02590Ca4);
                            arrayList.add(c4ia2);
                        }
                        i2++;
                    }
                }
            }

            @Override // X.C2EG
            public /* synthetic */ int ADO() {
                return 0;
            }

            @Override // X.C2EG
            public ArrayList AQa(C013606n c013606n, C02590Ca c02590Ca) {
                String str;
                int i;
                C02590Ca A0D = c02590Ca.A0D("account");
                ArrayList arrayList = new ArrayList();
                if (A0D == null) {
                    Log.w("PAY: IndiaProtoParser empty account node");
                    return arrayList;
                }
                C04P A0A = A0D.A0A("action");
                if (A0A != null) {
                    str = A0A.A03;
                } else {
                    str = null;
                }
                if ("upi-batch".equalsIgnoreCase(str)) {
                    i = 1;
                } else if ("upi-get-banks".equalsIgnoreCase(str)) {
                    i = 2;
                } else if ("upi-register-vpa".equalsIgnoreCase(str)) {
                    i = 4;
                } else if ("upi-list-keys".equalsIgnoreCase(str)) {
                    i = 5;
                } else {
                    i = 0;
                    if ("upi-check-mpin".equalsIgnoreCase(str)) {
                        i = 6;
                    }
                }
                if (i == 1) {
                    C02590Ca[] c02590CaArr = A0D.A03;
                    if (c02590CaArr != null) {
                        for (C02590Ca c02590Ca2 : c02590CaArr) {
                            if (c02590Ca2 != null) {
                                String str2 = c02590Ca2.A00;
                                int hashCode = str2.hashCode();
                                if (hashCode == -384112062) {
                                    if (!str2.equals("psp-config")) {
                                    }
                                    A00(2, A0D, c02590Ca2, arrayList, c013606n);
                                } else if (hashCode != 3288564) {
                                    if (hashCode == 93503927) {
                                        if (!str2.equals("banks")) {
                                        }
                                        A00(2, A0D, c02590Ca2, arrayList, c013606n);
                                    }
                                } else if (str2.equals("keys")) {
                                    A00(5, A0D, c02590Ca2, arrayList, c013606n);
                                }
                            }
                        }
                    }
                } else if (i == 2) {
                    A00(i, A0D, A0D, arrayList, c013606n);
                    C02590Ca[] c02590CaArr2 = A0D.A03;
                    if (c02590CaArr2 != null) {
                        for (C02590Ca c02590Ca3 : c02590CaArr2) {
                            if (c02590Ca3 != null && "psp-config".equals(c02590Ca3.A00)) {
                                A00(i, A0D, c02590Ca3, arrayList, c013606n);
                            }
                        }
                    }
                } else {
                    A00(i, A0D, A0D, arrayList, c013606n);
                }
                return arrayList;
            }

            @Override // X.C2EG
            public /* synthetic */ C0CI AQb(C02590Ca c02590Ca) {
                throw new UnsupportedOperationException("Asynchronous parsing is not supported in Sync Mode");
            }
        };
    }

    @Override // X.C0DX
    public InterfaceC467528c AC0() {
        return new C90504Bg(this.A00, this.A04, this.A0L, this.A0J, super.A00, this.A02, this.A09, this.A0F, this.A07, this.A06, this.A08, this.A0C);
    }

    @Override // X.C0DX
    public C3NT AC2(final C001200o c001200o, final C0EU c0eu) {
        return new C90684Ca(c001200o, c0eu) { // from class: X.4H3
            @Override // X.C90684Ca
            public String A00() {
                if (this.A01.A04().getInt("payments_device_id_algorithm", 0) >= 2) {
                    return super.A00();
                }
                return Settings.Secure.getString(this.A00.A00.getContentResolver(), "android_id");
            }
        };
    }

    @Override // X.C0DX
    public int AC3() {
        return R.string.india_upi_short_name;
    }

    @Override // X.C0DX
    public InterfaceC55152jx AC5() {
        return new C90694Cb() { // from class: X.4H2
            @Override // X.InterfaceC55152jx
            public View A5p(Context context, C0N2 c0n2, String str) {
                C4FX c4fx = new C4FX(context);
                String str2 = this.A02;
                String str3 = this.A00;
                String string = c4fx.A03.A04().getString("payments_support_phone_number", null);
                if (!TextUtils.isEmpty(string) && AnonymousClass093.A0A(str2)) {
                    c4fx.setWhatsAppContactDetails(string, str2);
                    return c4fx;
                } else if (c0n2 != null && AnonymousClass093.A0A(str3)) {
                    if (!TextUtils.isEmpty(str)) {
                        String A0D = c4fx.A02.A0D(R.string.upi_contact_bank_with_name_and_phone_number, c0n2.A08, str, str3);
                        SpannableString spannableString = new SpannableString(A0D);
                        URLSpan uRLSpan = new URLSpan(C000200d.A0H("tel:", str));
                        int indexOf = A0D.indexOf(str);
                        spannableString.setSpan(uRLSpan, indexOf, str.length() + indexOf, 33);
                        c4fx.A01.setText(spannableString);
                    } else {
                        c4fx.A01.setText(c4fx.A02.A0D(R.string.upi_contact_support_for_payment, c0n2.A08, str3));
                    }
                    Bitmap A04 = c0n2.A04();
                    if (A04 != null) {
                        c4fx.A00.setImageBitmap(A04);
                        c4fx.A00.setVisibility(0);
                    }
                    c4fx.A01.setVisibility(0);
                    return c4fx;
                } else if (!TextUtils.isEmpty(string)) {
                    c4fx.setWhatsAppContactDetails(string, null);
                    return c4fx;
                } else {
                    c4fx.setVisibility(8);
                    return c4fx;
                }
            }
        };
    }

    @Override // X.C0DX
    public Class ACK() {
        return IndiaUpiPaymentSettingsActivity.class;
    }

    @Override // X.C0DX
    public Class ACL() {
        return IndiaUpiPaymentTransactionDetailsActivity.class;
    }

    @Override // X.C0DX
    public Class AD3() {
        return IndiaUpiPaymentActivity.class;
    }

    @Override // X.C0DY
    public C0N5 AEl() {
        return new C4IA();
    }

    @Override // X.C0DY
    public C0TN AEn() {
        return new C4GI();
    }

    @Override // X.C0DY
    public C0K8 AEp() {
        return new C4GJ();
    }

    @Override // X.C0DX
    public void AUJ(C0GR c0gr) {
        C03650Gn A02 = c0gr.A02();
        if (A02 != null) {
            String str = A02.A02;
            InterfaceC013706o interfaceC013706o = C03650Gn.A00(str).A09;
            if (str.equals(C03650Gn.A0E.A02) && interfaceC013706o.A9K().equals(C013806p.A05.A9K())) {
                interfaceC013706o.ATK(new C014006r(new BigDecimal(this.A01.A07(C01C.A3l)), interfaceC013706o.A9i()));
            }
        }
    }
}
