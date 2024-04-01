package X;

/* renamed from: X.2J0  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2J0 implements InterfaceC43021wi {
    public final /* synthetic */ C20R A00;

    @Override // X.InterfaceC43021wi
    public void AQU(int i) {
    }

    public C2J0(C20R c20r) {
        this.A00 = c20r;
    }

    @Override // X.InterfaceC43021wi
    public void AQV() {
        C20R c20r = this.A00;
        if (c20r.isFinishing()) {
            return;
        }
        C018508q c018508q = ((ActivityC02290Ap) c20r).A0A;
        c018508q.A02.post(new RunnableEBaseShape1S0100000_I0_1(this, 20));
    }
}
