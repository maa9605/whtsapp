package X;

/* renamed from: X.48o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C898248o {
    public final C28Q A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C898248o(C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C04P A0A = c02590Ca.A0A("owner-name");
        if (A0A != null && (str = A0A.A03) != null) {
            this.A04 = str;
            C04P A0A2 = c02590Ca.A0A("business-name");
            if (A0A2 != null && (str2 = A0A2.A03) != null) {
                this.A02 = str2;
                C04P A0A3 = c02590Ca.A0A("verify-type");
                if (A0A3 != null && (str3 = A0A3.A03) != null) {
                    this.A05 = str3;
                    C04P A0A4 = c02590Ca.A0A("bank-name");
                    if (A0A4 != null) {
                        str4 = A0A4.A03;
                    } else {
                        str4 = null;
                    }
                    this.A01 = str4;
                    C02590Ca A0D = c02590Ca.A0D("merchant");
                    if (A0D != null) {
                        C04P A0A5 = A0D.A0A("credential-id");
                        if (A0A5 != null && (str5 = A0A5.A03) != null) {
                            this.A03 = str5;
                            C04P A0A6 = c02590Ca.A0A("error-code");
                            if (A0A6 != null && A0A6.A03 != null) {
                                C28Q c28q = new C28Q();
                                this.A00 = c28q;
                                C04P A0A7 = c02590Ca.A0A("error-code");
                                if (A0A7 != null) {
                                    str6 = A0A7.A03;
                                } else {
                                    str6 = null;
                                }
                                int A01 = AnonymousClass024.A01(str6, 0);
                                C04P A0A8 = c02590Ca.A0A("error-text");
                                String str7 = A0A8 != null ? A0A8.A03 : null;
                                c28q.A00 = A01;
                                c28q.A06 = str7;
                                return;
                            }
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
