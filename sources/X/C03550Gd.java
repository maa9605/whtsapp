package X;

/* renamed from: X.0Gd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03550Gd extends AbstractC03520Ga {
    public static volatile C03550Gd A00;

    public C03550Gd(C0EU c0eu, C0GR c0gr) {
        this.A00 = c0eu;
        this.A01 = c0gr;
        this.A02 = false;
    }

    public static C03550Gd A00() {
        if (A00 == null) {
            synchronized (C03550Gd.class) {
                if (A00 == null) {
                    A00 = new C03550Gd(C0EU.A00(), C0GR.A00());
                }
            }
        }
        return A00;
    }
}
