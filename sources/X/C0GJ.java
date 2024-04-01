package X;

/* renamed from: X.0GJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0GJ extends AnonymousClass009 {
    public static volatile C0GJ A00;

    public static C0GJ A00() {
        if (A00 == null) {
            synchronized (C0GJ.class) {
                if (A00 == null) {
                    A00 = new C0GJ();
                }
            }
        }
        return A00;
    }
}
