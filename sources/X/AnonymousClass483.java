package X;

/* renamed from: X.483  reason: invalid class name */
/* loaded from: classes3.dex */
public class AnonymousClass483 {
    public static volatile AnonymousClass483 A09;
    public final C018508q A00;
    public final C0E7 A01;
    public final C001200o A02;
    public final C013606n A03;
    public final C45A A04;
    public final C894947f A05;
    public final C28S A06;
    public final C463026g A07;
    public final C49682Lx A08;

    public AnonymousClass483(C001200o c001200o, C018508q c018508q, C49682Lx c49682Lx, C0E7 c0e7, C894947f c894947f, C463026g c463026g, C013606n c013606n, C45A c45a, C28S c28s) {
        this.A02 = c001200o;
        this.A00 = c018508q;
        this.A08 = c49682Lx;
        this.A01 = c0e7;
        this.A05 = c894947f;
        this.A07 = c463026g;
        this.A03 = c013606n;
        this.A04 = c45a;
        this.A06 = c28s;
    }

    public static AnonymousClass483 A00() {
        if (A09 == null) {
            synchronized (AnonymousClass483.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass483(C001200o.A01, C018508q.A00(), C49682Lx.A00(), C0E7.A00(), C894947f.A00(), C463026g.A00(), C013606n.A03(), C45A.A00(), C28S.A00());
                }
            }
        }
        return A09;
    }
}
