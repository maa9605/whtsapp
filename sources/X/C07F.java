package X;

/* renamed from: X.07F  reason: invalid class name */
/* loaded from: classes.dex */
public class C07F {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C07F(boolean z, String str, int i, String str2) {
        this.A03 = z;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C07F.class != obj.getClass()) {
            return false;
        }
        C07F c07f = (C07F) obj;
        return this.A03 == c07f.A03 && this.A00 == c07f.A00 && this.A01.equals(c07f.A01) && this.A02.equals(c07f.A02);
    }

    public String toString() {
        if (this.A03) {
            StringBuilder A0P = C000200d.A0P("Trusted callers: uid=");
            A0P.append(this.A00);
            A0P.append(", package=");
            A0P.append(this.A01);
            return A0P.toString();
        }
        StringBuilder A0P2 = C000200d.A0P("Untrusted caller: uid=");
        A0P2.append(this.A00);
        A0P2.append(", package=");
        A0P2.append(this.A01);
        return A0P2.toString();
    }
}
