package X;

/* renamed from: X.20o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C451420o implements InterfaceC010405f {
    public C07D A00;
    public final C451320n A01;
    public final C05Y A02;

    public C451420o(C05Y c05y, C451320n c451320n) {
        this.A02 = c05y;
        this.A01 = c451320n;
    }

    @Override // X.InterfaceC010405f
    public void AJI(String str) {
        this.A01.A00(this.A00, -1);
    }

    @Override // X.InterfaceC010405f
    public void AJx(String str, C02590Ca c02590Ca) {
        this.A01.A00(this.A00, C40731sm.A01(c02590Ca));
    }

    @Override // X.InterfaceC010405f
    public void APJ(String str, C02590Ca c02590Ca) {
        C451320n c451320n = this.A01;
        C07D c07d = this.A00;
        C41711uO c41711uO = c451320n.A00;
        c41711uO.A0I.execute(new RunnableEBaseShape0S0210000_I0(c41711uO, c07d, true, 6));
    }
}
