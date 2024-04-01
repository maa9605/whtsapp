package X;

/* renamed from: X.1t5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40921t5 {
    public final String A00;
    public final String A01;
    public final String A02;

    public C40921t5(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("Bullet{text='");
        C000200d.A1P(A0P, this.A02, '\'', ", iconLightUrl='");
        C000200d.A1P(A0P, this.A01, '\'', ", iconDarkUrl='");
        A0P.append(this.A00);
        A0P.append('\'');
        A0P.append('}');
        return A0P.toString();
    }
}
