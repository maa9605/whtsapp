package X;

/* renamed from: X.04h  reason: invalid class name */
/* loaded from: classes.dex */
public class C04h {
    public static volatile C04h A03;
    public final C04i A01 = new C04i();
    public final C04i A02 = new C04i();
    public final C04i A00 = new C04i();

    public static C04h A00() {
        if (A03 == null) {
            synchronized (C04h.class) {
                if (A03 == null) {
                    A03 = new C04h();
                }
            }
        }
        return A03;
    }
}
