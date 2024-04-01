package X;

/* renamed from: X.2Qp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50202Qp {
    public static volatile C50202Qp A01;
    public final C000500h A00;

    public C50202Qp(C000500h c000500h) {
        this.A00 = c000500h;
    }

    public static C50202Qp A00() {
        if (A01 == null) {
            synchronized (C50202Qp.class) {
                if (A01 == null) {
                    A01 = new C50202Qp(C000500h.A00());
                }
            }
        }
        return A01;
    }
}
