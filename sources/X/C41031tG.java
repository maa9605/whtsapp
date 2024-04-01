package X;

/* renamed from: X.1tG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41031tG {
    public final String A00;
    public final String A01;

    public C41031tG(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public C41031tG(C41031tG... c41031tGArr) {
        String str = "";
        String str2 = "";
        for (C41031tG c41031tG : c41031tGArr) {
            StringBuilder A0P = C000200d.A0P(str);
            A0P.append(c41031tG.A01);
            str = A0P.toString();
            StringBuilder A0P2 = C000200d.A0P(str2);
            A0P2.append(c41031tG.A00);
            str2 = A0P2.toString();
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean A00(char c, char c2) {
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i >= str.length()) {
                return false;
            }
            if (str.charAt(i) == c && this.A00.charAt(i) == c2) {
                return true;
            }
            i++;
        }
    }
}
