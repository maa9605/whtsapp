package X;

/* renamed from: X.2Lo  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2Lo {
    public static volatile C2Lo A01;
    public final C01B A00;

    public C2Lo(C01B c01b) {
        this.A00 = c01b;
    }

    public static C2Lo A00() {
        if (A01 == null) {
            synchronized (C2Lo.class) {
                if (A01 == null) {
                    A01 = new C2Lo(C01B.A00());
                }
            }
        }
        return A01;
    }
}
