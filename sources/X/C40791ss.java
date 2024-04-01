package X;

/* renamed from: X.1ss  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40791ss extends C40801st {
    public final C40891t2 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C40791ss(String str, String str2, String str3, String str4, String str5, C40891t2 c40891t2) {
        super(str4);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str5;
        this.A00 = c40891t2;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("UserNoticeBanner{text='");
        C000200d.A1P(A0P, this.A04, '\'', ", lightUrl='");
        C000200d.A1P(A0P, this.A03, '\'', ", lightIconFile='");
        A0P.append(super.A01);
        A0P.append('\'');
        A0P.append(", darkUrl='");
        C000200d.A1P(A0P, this.A02, '\'', ", darkIconFile='");
        A0P.append(super.A00);
        A0P.append('\'');
        A0P.append(", iconDescription='");
        C000200d.A1P(A0P, super.A02, '\'', ", action='");
        C000200d.A1P(A0P, this.A01, '\'', ", timing=");
        A0P.append(this.A00);
        A0P.append('}');
        return A0P.toString();
    }
}
