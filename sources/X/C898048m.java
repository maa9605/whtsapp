package X;

/* renamed from: X.48m  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C898048m {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public C898048m() {
    }

    public C898048m(C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11 = c02590Ca.A00;
        if (str11.equals("otp")) {
            this.A0A = "otp";
            C04P A0A = c02590Ca.A0A("type");
            if (A0A != null) {
                str7 = A0A.A03;
            } else {
                str7 = null;
            }
            this.A04 = str7;
            C04P A0A2 = c02590Ca.A0A("value");
            if (A0A2 != null) {
                str8 = A0A2.A03;
            } else {
                str8 = null;
            }
            this.A03 = str8;
            C04P A0A3 = c02590Ca.A0A("length");
            if (A0A3 != null) {
                str9 = A0A3.A03;
            } else {
                str9 = null;
            }
            this.A00 = AnonymousClass024.A01(str9, 6);
            C04P A0A4 = c02590Ca.A0A("resend-interval-sec");
            if (A0A4 != null) {
                str10 = A0A4.A03;
            } else {
                str10 = null;
            }
            this.A01 = AnonymousClass024.A01(str10, 60);
        } else if (str11.equals("app-to-app")) {
            this.A0A = "app-to-app";
            C04P A0A5 = c02590Ca.A0A("value");
            if (A0A5 != null) {
                str2 = A0A5.A03;
            } else {
                str2 = null;
            }
            this.A05 = str2;
            C04P A0A6 = c02590Ca.A0A("request-payload");
            if (A0A6 != null) {
                str3 = A0A6.A03;
            } else {
                str3 = null;
            }
            this.A08 = str3;
            C04P A0A7 = c02590Ca.A0A("source");
            if (A0A7 != null) {
                str4 = A0A7.A03;
            } else {
                str4 = null;
            }
            this.A06 = str4;
            C04P A0A8 = c02590Ca.A0A("intent-action");
            if (A0A8 != null) {
                str5 = A0A8.A03;
            } else {
                str5 = null;
            }
            this.A07 = str5;
        } else if (str11.equals("customer-service")) {
            this.A0A = "customer-service";
            C04P A0A9 = c02590Ca.A0A("value");
            if (A0A9 != null) {
                str = A0A9.A03;
            } else {
                str = null;
            }
            this.A09 = str;
        }
        C04P A0A10 = c02590Ca.A0A("disabled");
        if (A0A10 != null) {
            str6 = A0A10.A03;
        } else {
            str6 = null;
        }
        this.A0B = "1".equals(str6);
        C04P A0A11 = c02590Ca.A0A("identifier");
        this.A02 = A0A11 != null ? A0A11.A03 : null;
    }
}
