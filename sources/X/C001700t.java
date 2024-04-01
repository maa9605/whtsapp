package X;

/* renamed from: X.00t  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C001700t {
    public static volatile C001700t A01;
    public final C001800u A00;

    public C001700t(AnonymousClass012 anonymousClass012, InterfaceC004201y interfaceC004201y, C008103m c008103m) {
        this.A00 = new C001800u(anonymousClass012, interfaceC004201y, c008103m, "ApplicationCreatePerfTracker", new C004301z(703926783));
    }

    public static C001700t A00() {
        if (A01 == null) {
            synchronized (C001700t.class) {
                if (A01 == null) {
                    A01 = new C001700t(AnonymousClass012.A00(), C03U.A00(), C008103m.A00());
                }
            }
        }
        return A01;
    }
}
