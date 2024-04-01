package X;

/* renamed from: X.00F  reason: invalid class name */
/* loaded from: classes.dex */
public class C00F {
    public static volatile C00F A02;
    public final C001200o A00;
    public final C00G A01;

    public C00F(C001200o c001200o, C00G c00g) {
        this.A00 = c001200o;
        this.A01 = c00g;
    }

    public static C00F A00() {
        if (A02 == null) {
            synchronized (C00F.class) {
                if (A02 == null) {
                    A02 = new C00F(C001200o.A01, C00G.A00());
                }
            }
        }
        return A02;
    }
}
