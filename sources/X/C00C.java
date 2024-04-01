package X;

/* renamed from: X.00C  reason: invalid class name */
/* loaded from: classes.dex */
public class C00C {
    public static volatile C00C A02;
    public final C01B A00;
    public volatile boolean A01 = true;

    public C00C(C01B c01b) {
        this.A00 = c01b;
    }

    public static C00C A00() {
        if (A02 == null) {
            synchronized (C00C.class) {
                if (A02 == null) {
                    A02 = new C00C(C01B.A00());
                }
            }
        }
        return A02;
    }

    public boolean A01() {
        return this.A00.A0E(C01C.A2L);
    }
}
