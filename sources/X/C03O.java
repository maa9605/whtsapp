package X;

/* renamed from: X.03O  reason: invalid class name */
/* loaded from: classes.dex */
public class C03O {
    public static C03O A00;

    public static synchronized C03O A00() {
        C03O c03o;
        synchronized (C03O.class) {
            c03o = A00;
            if (c03o == null) {
                c03o = new C03O();
                A00 = c03o;
            }
        }
        return c03o;
    }
}
