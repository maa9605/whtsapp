package X;

/* renamed from: X.1Qp  reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1Qp implements Runnable {
    public final /* synthetic */ C001400q A00;

    public /* synthetic */ C1Qp(C001400q c001400q) {
        this.A00 = c001400q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C001400q c001400q = this.A00;
        if (c001400q.A00 == null) {
            InterfaceC001000m interfaceC001000m = new InterfaceC001000m() { // from class: X.1nV
                @Override // X.InterfaceC001000m
                public final void AIx(C05050Nc c05050Nc) {
                    C001400q c001400q2 = C001400q.this;
                    if (c05050Nc.A02) {
                        c001400q2.A0E.AS1(new RunnableC28181Qn(c001400q2));
                    }
                }
            };
            c001400q.A00 = interfaceC001000m;
            c001400q.A05.A01(interfaceC001000m);
        }
    }
}
