package X;

/* renamed from: X.0H3  reason: invalid class name */
/* loaded from: classes.dex */
public class C0H3 {
    public static volatile C0H3 A02;
    public final C0H4 A00;
    public final C0H6 A01;

    public C0H3(C0H4 c0h4, C0H6 c0h6) {
        this.A00 = c0h4;
        this.A01 = c0h6;
    }

    public static C0H3 A00() {
        if (A02 == null) {
            synchronized (C0H3.class) {
                if (A02 == null) {
                    C0H4 A00 = C0H4.A00();
                    if (C0H6.A00 == null) {
                        synchronized (C0H6.class) {
                            if (C0H6.A00 == null) {
                                C0H6.A00 = new C0H6();
                            }
                        }
                    }
                    A02 = new C0H3(A00, C0H6.A00);
                }
            }
        }
        return A02;
    }
}
