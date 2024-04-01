package X;

/* renamed from: X.26S  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C26S {
    public static volatile C26S A00;

    public static C26S A00() {
        if (A00 == null) {
            synchronized (C26S.class) {
                if (A00 == null) {
                    if (C469128t.A00 == null) {
                        synchronized (C469128t.class) {
                            if (C469128t.A00 == null) {
                                C469128t.A00 = new C469128t();
                            }
                        }
                    }
                    A00 = C469128t.A00;
                }
            }
        }
        return A00;
    }
}
