package X;

/* renamed from: X.1uW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC41791uW {
    public static volatile AbstractC41791uW A00;

    public static AbstractC41791uW A00() {
        if (A00 == null) {
            synchronized (AbstractC41791uW.class) {
                if (A00 == null) {
                    if (C2UA.A00 == null) {
                        synchronized (C2UA.class) {
                            if (C2UA.A00 == null) {
                                C2UA.A00 = new C2UA();
                            }
                        }
                    }
                    A00 = C2UA.A00;
                }
            }
        }
        return A00;
    }
}
