package X;

/* renamed from: X.25C  reason: invalid class name */
/* loaded from: classes2.dex */
public class C25C extends AnonymousClass009 {
    public static volatile C25C A04;
    public int A00;
    public int A01;
    public Runnable A02 = new RunnableEBaseShape5S0100000_I0_5(this, 40);
    public final C018508q A03;

    public C25C(C018508q c018508q) {
        this.A03 = c018508q;
    }

    public static C25C A00() {
        if (A04 == null) {
            synchronized (C03020Dv.class) {
                if (A04 == null) {
                    A04 = new C25C(C018508q.A00());
                }
            }
        }
        return A04;
    }
}
