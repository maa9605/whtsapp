package X;

/* renamed from: X.26T  reason: invalid class name */
/* loaded from: classes2.dex */
public class C26T {
    public static volatile C26T A01;
    public final C05E A00;

    public C26T(C05E c05e) {
        this.A00 = c05e;
    }

    public static C26T A00() {
        if (A01 == null) {
            synchronized (C26T.class) {
                if (A01 == null) {
                    A01 = new C26T(C05E.A00());
                }
            }
        }
        return A01;
    }
}
