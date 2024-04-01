package X;

/* renamed from: X.02q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C005902q {
    public static volatile C005902q A03;
    public final ExecutorC004702d A00;
    public final ExecutorC004702d A01;
    public final ExecutorC004702d A02;

    public C005902q(InterfaceC002901k interfaceC002901k) {
        this.A00 = new ExecutorC004702d(interfaceC002901k, false);
        this.A01 = new ExecutorC004702d(interfaceC002901k, false);
        this.A02 = new ExecutorC004702d(interfaceC002901k, false);
    }

    public static C005902q A00() {
        if (A03 == null) {
            synchronized (C005902q.class) {
                if (A03 == null) {
                    A03 = new C005902q(C002801j.A00());
                }
            }
        }
        return A03;
    }
}
