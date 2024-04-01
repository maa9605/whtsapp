package X;

/* renamed from: X.05G  reason: invalid class name */
/* loaded from: classes.dex */
public class C05G {
    public static volatile C05G A01;
    public final C000500h A00;

    public C05G(C000500h c000500h) {
        this.A00 = c000500h;
    }

    public static C05G A00() {
        if (A01 == null) {
            synchronized (C05G.class) {
                if (A01 == null) {
                    A01 = new C05G(C000500h.A00());
                }
            }
        }
        return A01;
    }

    public int A01() {
        return this.A00.A00.getInt("registration_state", 0);
    }

    public boolean A02() {
        return A01() == 3;
    }
}
