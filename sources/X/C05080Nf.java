package X;

/* renamed from: X.0Nf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05080Nf {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C05080Nf(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A05 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A03 = str5;
        this.A00 = i;
        this.A06 = z;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("SelectedRoute{authority='");
        C000200d.A1T(A0P, this.A02, "' ", "authorityType='");
        A0P.append(this.A00);
        A0P.append("'");
        A0P.append('}');
        return A0P.toString();
    }
}
