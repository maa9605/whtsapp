package X;

/* renamed from: X.1Y9  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y9 implements InterfaceC19780vz {
    public static C1Y9 A00;

    public static synchronized C1Y9 A00() {
        C1Y9 c1y9;
        synchronized (C1Y9.class) {
            c1y9 = A00;
            if (c1y9 == null) {
                c1y9 = new C1Y9();
                A00 = c1y9;
            }
        }
        return c1y9;
    }
}
