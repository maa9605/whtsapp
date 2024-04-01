package X;

/* renamed from: X.0G2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0G2 extends AnonymousClass009 {
    public static volatile C0G2 A01;
    public C0G3 A00 = new C0G3();

    public static C0G2 A00() {
        if (A01 == null) {
            synchronized (C0G2.class) {
                if (A01 == null) {
                    A01 = new C0G2();
                }
            }
        }
        return A01;
    }
}
