package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.48q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C898448q {
    public final int A00;
    public final C28Q A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public C898448q(C02590Ca c02590Ca, C013606n c013606n) {
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
        C04P A0A = c02590Ca.A0A("status");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        this.A00 = AnonymousClass024.A01(str, 0);
        C04P A0A2 = c02590Ca.A0A("verify-type");
        if (A0A2 != null) {
            str2 = A0A2.A03;
        } else {
            str2 = null;
        }
        this.A08 = str2;
        C04P A0A3 = c02590Ca.A0A("verify-id");
        if (A0A3 != null) {
            str3 = A0A3.A03;
        } else {
            str3 = null;
        }
        this.A07 = str3;
        C04P A0A4 = c02590Ca.A0A("last4");
        if (A0A4 != null) {
            str4 = A0A4.A03;
        } else {
            str4 = null;
        }
        this.A04 = str4;
        C04P A0A5 = c02590Ca.A0A("masked-account-number");
        if (A0A5 != null) {
            str5 = A0A5.A03;
        } else {
            str5 = null;
        }
        this.A05 = str5;
        C04P A0A6 = c02590Ca.A0A("bank-name");
        if (A0A6 != null) {
            str6 = A0A6.A03;
        } else {
            str6 = null;
        }
        this.A03 = str6;
        C04P A0A7 = c02590Ca.A0A("bank-code");
        if (A0A7 != null) {
            str7 = A0A7.A03;
        } else {
            str7 = null;
        }
        this.A02 = str7;
        C04P A0A8 = c02590Ca.A0A("support-phone-number");
        if (A0A8 != null) {
            str8 = A0A8.A03;
        } else {
            str8 = null;
        }
        this.A06 = str8;
        C04P A0A9 = c02590Ca.A0A("remaining-retries");
        if (A0A9 != null) {
            str9 = A0A9.A03;
        } else {
            str9 = null;
        }
        AnonymousClass024.A01(str9, -1);
        this.A09 = new ArrayList();
        for (C02590Ca c02590Ca2 : c02590Ca.A0H("bank")) {
            C92214Ia c92214Ia = new C92214Ia();
            c92214Ia.A03(c013606n, 0, c02590Ca2);
            this.A09.add(c92214Ia);
        }
        C04P A0A10 = c02590Ca.A0A("error-code");
        if (A0A10 != null && A0A10.A03 != null) {
            C28Q c28q = new C28Q();
            this.A01 = c28q;
            C04P A0A11 = c02590Ca.A0A("error-code");
            if (A0A11 != null) {
                str10 = A0A11.A03;
            } else {
                str10 = null;
            }
            int A01 = AnonymousClass024.A01(str10, 0);
            C04P A0A12 = c02590Ca.A0A("error-text");
            String str11 = A0A12 != null ? A0A12.A03 : null;
            c28q.A00 = A01;
            c28q.A06 = str11;
        }
    }
}
