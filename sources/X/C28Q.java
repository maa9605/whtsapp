package X;

import android.text.TextUtils;

/* renamed from: X.28Q */
/* loaded from: classes2.dex */
public class C28Q {
    public int A00;
    public int A01;
    public long A02;
    public C02590Ca A03;
    public C02590Ca A04;
    public String A05;
    public String A06;

    public C28Q() {
        this.A00 = 0;
    }

    public C28Q(int i) {
        this.A00 = i;
    }

    public C28Q(C02590Ca c02590Ca) {
        String str;
        String str2;
        String str3;
        String str4;
        C04P A0A = c02590Ca.A0A("error-code");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        this.A00 = AnonymousClass024.A01(str, 0);
        C04P A0A2 = c02590Ca.A0A("error-text");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        this.A06 = str2;
        c02590Ca.A0A("display_title");
        c02590Ca.A0A("display_text");
        C04P A0A3 = c02590Ca.A0A("remaining-retries");
        if (A0A3 != null) {
            str3 = A0A3.A03;
        } else {
            str3 = null;
        }
        this.A01 = AnonymousClass024.A01(str3, -1);
        C04P A0A4 = c02590Ca.A0A("next-retry-ts");
        if (A0A4 != null) {
            str4 = A0A4.A03;
        } else {
            str4 = null;
        }
        this.A02 = AnonymousClass024.A03(str4, 0L);
        C04P A0A5 = c02590Ca.A0A("auth-ticket-fp");
        this.A05 = A0A5 != null ? A0A5.A03 : null;
        int i = this.A00;
        if (i == 1448) {
            this.A03 = c02590Ca.A0D("key");
        } else if (i == 10718) {
            this.A01 = 0;
        } else if (i != 454) {
        } else {
            this.A04 = c02590Ca.A0D("step_up");
        }
    }

    public static C28Q A00(C02590Ca c02590Ca) {
        String str;
        C04P A0A = c02590Ca.A0A("error-code");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return new C28Q(c02590Ca);
        }
        C02590Ca A0D = c02590Ca.A0D("pin");
        if (A0D != null) {
            return new C28Q(A0D);
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder A0P = C000200d.A0P("[ code: ");
        A0P.append(this.A00);
        A0P.append(" text: ");
        A0P.append(this.A06);
        A0P.append(" remaining-retries: ");
        A0P.append(this.A01);
        A0P.append(" next-attempt-ts: ");
        A0P.append(this.A02);
        String str2 = this.A05;
        if (str2 != null) {
            StringBuilder A0P2 = C000200d.A0P(" auth-ticket-fp: ");
            A0P2.append(str2);
            str = A0P2.toString();
        } else {
            str = "";
        }
        A0P.append(str);
        A0P.append(" key-node: ");
        return C000200d.A0L(A0P, this.A03 != null ? "set" : "null", " ]");
    }
}
