package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4Bk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C90544Bk extends C0K9 {
    public static final HashSet A01 = new HashSet(Arrays.asList("vpa", "keys", "vpaName", "balance", "usableBalance", "updatedSenderVpa"));
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: X.47e
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            Bundle readBundle = parcel.readBundle(C894847e.class.getClassLoader());
            C90544Bk c90544Bk = new C90544Bk();
            c90544Bk.A00 = readBundle;
            return c90544Bk;
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new C90544Bk[i];
        }
    };
    public Bundle A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public static final String A00(C02590Ca c02590Ca, String str) {
        C02590Ca A0D = c02590Ca.A0D(str);
        if (A0D == null) {
            C04P A0A = c02590Ca.A0A(str);
            if (A0A != null) {
                return A0A.A03;
            }
            return null;
        }
        try {
            C02590Ca A0E = A0D.A0E("money");
            return String.valueOf(A0E.A04("value") / A0E.A04("offset"));
        } catch (C0L4 unused) {
            Log.e("PAY: IndiaUpiPaymentData parseBalance failure");
            return null;
        }
    }

    @Override // X.C0K9
    public String A01() {
        throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support toDBString");
    }

    @Override // X.C0K9
    public void A02(int i, List list) {
        throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support toNetwork");
    }

    @Override // X.C0K9
    public void A03(C013606n c013606n, int i, C02590Ca c02590Ca) {
        ArrayList<String> arrayList;
        String str;
        String str2;
        ArrayList<String> arrayList2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        if (i == 4) {
            C04P A0A = c02590Ca.A0A("credential-id");
            if (A0A != null && (str15 = A0A.A03) != null) {
                Bundle bundle = new Bundle();
                this.A00 = bundle;
                bundle.putString("credentialId", str15);
            }
        } else if (i == 5) {
            C04P A0A2 = c02590Ca.A0A("keys");
            if (A0A2 == null || (str14 = A0A2.A03) == null) {
                return;
            }
            Bundle bundle2 = new Bundle();
            this.A00 = bundle2;
            bundle2.putString("keys", str14);
        } else if (i == 6) {
            this.A00 = new Bundle();
            C04P A0A3 = c02590Ca.A0A("vpa-mismatch");
            if (A0A3 != null && (str11 = A0A3.A03) != null) {
                this.A00.putString("updatedVpaFor", str11);
                C04P A0A4 = c02590Ca.A0A("vpa-mismatch");
                if (A0A4 != null) {
                    str12 = A0A4.A03;
                } else {
                    str12 = null;
                }
                if (!"sender".equals(str12)) {
                    return;
                }
                Bundle bundle3 = this.A00;
                C04P A0A5 = c02590Ca.A0A("vpa");
                if (A0A5 != null) {
                    str13 = A0A5.A03;
                } else {
                    str13 = null;
                }
                bundle3.putString("updatedSenderVpa", str13);
                Bundle bundle4 = this.A00;
                C04P A0A6 = c02590Ca.A0A("vpa-id");
                bundle4.putString("updatedSenderVpaId", A0A6 != null ? A0A6.A03 : null);
                return;
            }
            C04P A0A7 = c02590Ca.A0A("valid");
            if (A0A7 != null && (str10 = A0A7.A03) != null) {
                this.A00.putString("valid", str10);
            }
            String A00 = A00(c02590Ca, "balance");
            if (A00 != null) {
                this.A00.putString("balance", A00);
            }
            Bundle bundle5 = this.A00;
            C04P A0A8 = c02590Ca.A0A("sufficient-balance");
            bundle5.putString("sufficientBalance", A0A8 != null ? A0A8.A03 : null);
            String A002 = A00(c02590Ca, "usable-balance");
            if (A002 == null) {
                return;
            }
            this.A00.putString("usableBalance", A002);
        } else if (i == 7) {
            this.A00 = new Bundle();
            C04P A0A9 = c02590Ca.A0A("vpa");
            if (A0A9 != null) {
                str4 = A0A9.A03;
            } else {
                str4 = null;
            }
            this.A00.putString("vpa", str4);
            C04P A0A10 = c02590Ca.A0A("vpa-id");
            if (A0A10 != null) {
                str5 = A0A10.A03;
            } else {
                str5 = null;
            }
            this.A00.putString("vpaId", str5);
            C04P A0A11 = c02590Ca.A0A("vpa-name");
            if (A0A11 != null) {
                str6 = A0A11.A03;
            } else {
                str6 = null;
            }
            this.A00.putString("vpaName", str6);
            C04P A0A12 = c02590Ca.A0A("valid");
            if (A0A12 != null) {
                str7 = A0A12.A03;
            } else {
                str7 = null;
            }
            this.A00.putString("vpaValid", str7);
            C04P A0A13 = c02590Ca.A0A("user");
            if (A0A13 != null) {
                str8 = A0A13.A03;
            } else {
                str8 = null;
            }
            this.A00.putString("jid", str8);
            C04P A0A14 = c02590Ca.A0A("blocked");
            if (A0A14 != null) {
                str9 = A0A14.A03;
            } else {
                str9 = null;
            }
            this.A00.putString("blocked", str9);
            C04P A0A15 = c02590Ca.A0A("verified-merchant");
            this.A00.putString("verifiedMerchant", A0A15 != null ? A0A15.A03 : null);
        } else if (i != 2) {
        } else {
            Bundle bundle6 = new Bundle();
            this.A00 = bundle6;
            String str16 = c02590Ca.A00;
            if ("psp".equals(str16)) {
                C04P A0A16 = c02590Ca.A0A("provider-type");
                if (A0A16 != null) {
                    str = A0A16.A03;
                } else {
                    str = null;
                }
                bundle6.putString("providerType", str);
                Bundle bundle7 = this.A00;
                C04P A0A17 = c02590Ca.A0A("sms-gateways");
                if (A0A17 != null) {
                    str2 = A0A17.A03;
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    arrayList2 = new ArrayList<>(Arrays.asList(str2.split(",")));
                } else {
                    arrayList2 = new ArrayList<>();
                }
                bundle7.putStringArrayList("smsGateways", arrayList2);
                Bundle bundle8 = this.A00;
                C04P A0A18 = c02590Ca.A0A("sms-prefix");
                if (A0A18 != null) {
                    str3 = A0A18.A03;
                } else {
                    str3 = null;
                }
                bundle8.putString("smsPrefix", str3);
                Bundle bundle9 = this.A00;
                C04P A0A19 = c02590Ca.A0A("transaction-prefix");
                bundle9.putString("transactionPrefix", A0A19 != null ? A0A19.A03 : null);
            } else if (!"psp-routing".equals(str16)) {
            } else {
                C04P A0A20 = c02590Ca.A0A("providers");
                String str17 = A0A20 != null ? A0A20.A03 : null;
                if (!TextUtils.isEmpty(str17)) {
                    arrayList = new ArrayList<>(Arrays.asList(str17.split(",")));
                } else {
                    arrayList = new ArrayList<>();
                }
                bundle6.putStringArrayList("pspRouting", arrayList);
            }
        }
    }

    @Override // X.C0K9
    public void A04(String str) {
        throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support fromDBString");
    }

    public String A05() {
        Bundle bundle = this.A00;
        if (bundle != null) {
            return bundle.getString("providerType");
        }
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.A00.keySet()) {
            if (!A01.contains(str)) {
                StringBuilder A0V = C000200d.A0V(str, "=");
                A0V.append(this.A00.get(str));
                arrayList.add(A0V.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("=SCRUBBED");
                arrayList.add(sb.toString());
            }
        }
        StringBuilder A0P = C000200d.A0P(" [ bundle: {");
        A0P.append(TextUtils.join(", ", arrayList));
        A0P.append("}]");
        return A0P.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }
}
