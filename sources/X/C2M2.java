package X;

/* renamed from: X.2M2  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2M2 {
    public static volatile C2M2 A00;

    public static C2M2 A00() {
        if (A00 == null) {
            synchronized (C2M2.class) {
                if (A00 == null) {
                    if (C2TV.A00 == null) {
                        synchronized (C2TV.class) {
                            if (C2TV.A00 == null) {
                                C2TV.A00 = new C2TV();
                            }
                        }
                    }
                    A00 = C2TV.A00;
                }
            }
        }
        return A00;
    }
}
