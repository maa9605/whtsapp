package X;

/* renamed from: X.075 */
/* loaded from: classes.dex */
public class AnonymousClass075 extends AnonymousClass076 {
    public static volatile AnonymousClass075 A00;

    public AnonymousClass075(AnonymousClass011 anonymousClass011, C01B c01b, C05W c05w, C01R c01r, AnonymousClass008 anonymousClass008, C01J c01j, AnonymousClass060 anonymousClass060) {
        super(anonymousClass011, c01b, c05w, c01r, anonymousClass008, c01j, anonymousClass060);
    }

    public static AnonymousClass075 A00() {
        if (A00 == null) {
            synchronized (AnonymousClass075.class) {
                if (A00 == null) {
                    C02L.A00();
                    AnonymousClass011 A002 = AnonymousClass011.A00();
                    C01B A003 = C01B.A00();
                    C05W A004 = C05W.A00();
                    C01R c01r = C01R.A02;
                    C002301c.A00();
                    AnonymousClass008 anonymousClass008 = AnonymousClass008.A01;
                    C01J A005 = C01J.A00();
                    C000500h.A00();
                    A00 = new AnonymousClass075(A002, A003, A004, c01r, anonymousClass008, A005, AnonymousClass060.A00());
                }
            }
        }
        return A00;
    }
}
