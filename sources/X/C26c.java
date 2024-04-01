package X;

/* renamed from: X.26c  reason: invalid class name */
/* loaded from: classes2.dex */
public class C26c {
    public static volatile C26c A00;

    public static C26c A00() {
        if (A00 == null) {
            synchronized (C26c.class) {
                if (A00 == null) {
                    A00 = new C26c();
                }
            }
        }
        return A00;
    }
}
