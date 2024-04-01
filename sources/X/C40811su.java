package X;

import java.util.List;

/* renamed from: X.1su */
/* loaded from: classes2.dex */
public class C40811su extends C40801st {
    public final C40891t2 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C40811su(String str, String str2, String str3, String str4, List list, String str5, C40891t2 c40891t2, String str6, String str7, String str8) {
        super(str3);
        this.A06 = str;
        this.A05 = str2;
        this.A08 = list;
        this.A07 = str4;
        this.A01 = str5;
        this.A00 = c40891t2;
        this.A02 = str6;
        this.A04 = str7;
        this.A03 = str8;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("UserNoticeModal{iconLightUrl='");
        C000200d.A1P(A0P, this.A06, '\'', ", iconDarkUrl='");
        C000200d.A1P(A0P, this.A05, '\'', ", iconDescription='");
        C000200d.A1P(A0P, super.A02, '\'', ", title='");
        C000200d.A1P(A0P, this.A07, '\'', ", bulletPoints=");
        A0P.append(this.A08);
        A0P.append(", agreeButtonText='");
        C000200d.A1P(A0P, this.A01, '\'', ", timing=");
        A0P.append(this.A00);
        A0P.append(", body='");
        C000200d.A1P(A0P, this.A02, '\'', ", footer='");
        C000200d.A1P(A0P, this.A04, '\'', ", dismissButtonText='");
        A0P.append(this.A03);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
