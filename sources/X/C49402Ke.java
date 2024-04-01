package X;

/* renamed from: X.2Ke  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49402Ke implements InterfaceC010405f {
    public C2KY A00;
    public final C018508q A01;
    public final C2Kf A02;
    public final C05Y A03;

    public C49402Ke(C018508q c018508q, C05Y c05y, C2Kf c2Kf) {
        this.A02 = c2Kf;
        this.A01 = c018508q;
        this.A03 = c05y;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        C018508q c018508q = this.A01;
        c018508q.A02.post(new RunnableEBaseShape0S0100000_I0_0(this, 35));
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        C018508q c018508q = this.A01;
        c018508q.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, c02590Ca, 25));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C018508q c018508q = this.A01;
        c018508q.A02.post(new RunnableEBaseShape0S0200000_I0_0(this, c02590Ca, 26));
    }
}
