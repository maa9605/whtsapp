package X;

/* renamed from: X.2K7  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2K7 {
    public final int A00;
    public final C24R A01;
    public final String A02;
    public final String A03;

    public C2K7(int i, String str, String str2, C24R c24r) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = c24r;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("CollectionError{code=");
        A0P.append(this.A00);
        A0P.append(", text='");
        A0P.append(this.A03);
        A0P.append(", collection='");
        A0P.append(this.A02);
        A0P.append('}');
        return A0P.toString();
    }
}
