package X;

/* renamed from: X.48H  reason: invalid class name */
/* loaded from: classes3.dex */
public class C48H {
    public static volatile C48H A04;
    public final C018508q A00;
    public final C0E7 A01;
    public final C28S A02;
    public final C463026g A03;

    public C48H(C018508q c018508q, C0E7 c0e7, C463026g c463026g, C28S c28s) {
        this.A00 = c018508q;
        this.A01 = c0e7;
        this.A03 = c463026g;
        this.A02 = c28s;
    }

    public static C48H A00() {
        if (A04 == null) {
            synchronized (C48H.class) {
                if (A04 == null) {
                    A04 = new C48H(C018508q.A00(), C0E7.A00(), C463026g.A00(), C28S.A00());
                }
            }
        }
        return A04;
    }
}
