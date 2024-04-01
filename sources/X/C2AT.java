package X;

/* renamed from: X.2AT  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2AT {
    public static volatile C2AT A00;

    public static C2AT A00() {
        if (A00 == null) {
            synchronized (C2AT.class) {
                if (A00 == null) {
                    if (C51172Uv.A00 == null) {
                        synchronized (C51172Uv.class) {
                            if (C51172Uv.A00 == null) {
                                C51172Uv.A00 = new C51172Uv();
                            }
                        }
                    }
                    A00 = C51172Uv.A00;
                }
            }
        }
        return A00;
    }
}
