package X;

/* renamed from: X.01M  reason: invalid class name */
/* loaded from: classes.dex */
public class C01M {
    public static volatile C01M A00;

    public static C01M A00() {
        if (A00 == null) {
            synchronized (C01M.class) {
                if (A00 == null) {
                    A00 = new C01M();
                }
            }
        }
        return A00;
    }
}
