package X;

/* renamed from: X.06P  reason: invalid class name */
/* loaded from: classes.dex */
public class C06P {
    public static volatile C06P A01;
    public final C05E A00;

    public C06P(C05E c05e) {
        this.A00 = c05e;
    }

    public static C06P A00() {
        if (A01 == null) {
            synchronized (C06P.class) {
                if (A01 == null) {
                    A01 = new C06P(C05E.A00());
                }
            }
        }
        return A01;
    }
}
