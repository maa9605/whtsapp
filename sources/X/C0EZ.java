package X;

/* renamed from: X.0EZ  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0EZ {
    public static volatile C0EZ A00;

    public static C0EZ A00() {
        if (A00 == null) {
            synchronized (C0EZ.class) {
                if (A00 == null) {
                    if (C0LE.A00 == null) {
                        synchronized (C0LE.class) {
                            if (C0LE.A00 == null) {
                                C0LE.A00 = new C0LE();
                            }
                        }
                    }
                    A00 = C0LE.A00;
                }
            }
        }
        return A00;
    }
}
