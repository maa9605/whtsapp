package X;

/* renamed from: X.2D9 */
/* loaded from: classes2.dex */
public class C2D9 {
    public static volatile C2D9 A02;
    public final C05B A00;
    public final C05E A01;

    public C2D9(C05B c05b, C05E c05e) {
        this.A01 = c05e;
        this.A00 = c05b;
    }

    public static C2D9 A00() {
        if (A02 == null) {
            synchronized (C2D9.class) {
                if (A02 == null) {
                    A02 = new C2D9(C05B.A00(), C05E.A00());
                }
            }
        }
        return A02;
    }
}
