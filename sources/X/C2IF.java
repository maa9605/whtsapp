package X;

/* renamed from: X.2IF */
/* loaded from: classes2.dex */
public class C2IF implements InterfaceC05620Pl {
    public C0HE A00;
    public final /* synthetic */ InterfaceC04240Jk A01;
    public final /* synthetic */ C04880Mg A02;
    public final /* synthetic */ C2M6 A03;
    public final /* synthetic */ boolean A04 = true;

    public C2IF(C2M6 c2m6, InterfaceC04240Jk interfaceC04240Jk, C04880Mg c04880Mg) {
        this.A03 = c2m6;
        this.A01 = interfaceC04240Jk;
        this.A02 = c04880Mg;
    }

    @Override // X.InterfaceC05620Pl
    public void AIK(Object obj) {
        C0HE c0he = this.A00;
        if (c0he != null) {
            c0he.A01();
        }
        RunnableEBaseShape4S0200000_I0_4 runnableEBaseShape4S0200000_I0_4 = new RunnableEBaseShape4S0200000_I0_4(this, obj);
        this.A00 = ((C2IH) runnableEBaseShape4S0200000_I0_4.A00).A00;
        if (this.A04) {
            this.A03.A00.AS5(runnableEBaseShape4S0200000_I0_4);
        } else {
            this.A03.A00.AS1(runnableEBaseShape4S0200000_I0_4);
        }
    }
}
