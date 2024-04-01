package X;

/* renamed from: X.0GZ  reason: invalid class name */
/* loaded from: classes.dex */
public class C0GZ extends AbstractC03520Ga {
    public static volatile C0GZ A00;

    public C0GZ(C0EU c0eu, C0GR c0gr) {
        this.A00 = c0eu;
        this.A01 = c0gr;
        this.A02 = true;
    }

    public static C0GZ A00() {
        if (A00 == null) {
            synchronized (C0GZ.class) {
                if (A00 == null) {
                    A00 = new C0GZ(C0EU.A00(), C0GR.A00());
                }
            }
        }
        return A00;
    }
}
