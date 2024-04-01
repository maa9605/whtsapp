package X;

/* renamed from: X.1Z5  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Z5 implements InterfaceC223312a {
    public C1Z6 A00;
    public InterfaceC223312a A01;
    public final InterfaceC20920yV A02;
    public final C30301aF A03;

    public C1Z5(InterfaceC20920yV interfaceC20920yV, C12Q c12q) {
        this.A02 = interfaceC20920yV;
        this.A03 = new C30301aF(c12q);
    }

    public final void A00() {
        long ACX = this.A01.ACX();
        C30301aF c30301aF = this.A03;
        c30301aF.A00(ACX);
        C21120yp ACS = this.A01.ACS();
        if (ACS.equals(c30301aF.A02)) {
            return;
        }
        if (c30301aF.A03) {
            c30301aF.A00(c30301aF.ACX());
        }
        c30301aF.A02 = ACS;
        ((C39201pk) this.A02).A0Q.A00.obtainMessage(16, ACS).sendToTarget();
    }

    @Override // X.InterfaceC223312a
    public C21120yp ACS() {
        InterfaceC223312a interfaceC223312a = this.A01;
        return interfaceC223312a != null ? interfaceC223312a.ACS() : this.A03.A02;
    }

    @Override // X.InterfaceC223312a
    public long ACX() {
        C1Z6 c1z6 = this.A00;
        if ((c1z6 == null || c1z6.AFE() || (!this.A00.AFf() && this.A00.AEW())) ? false : true) {
            return this.A01.ACX();
        }
        return this.A03.ACX();
    }

    @Override // X.InterfaceC223312a
    public C21120yp ATd(C21120yp c21120yp) {
        InterfaceC223312a interfaceC223312a = this.A01;
        if (interfaceC223312a != null) {
            c21120yp = interfaceC223312a.ATd(c21120yp);
        }
        this.A03.ATd(c21120yp);
        ((C39201pk) this.A02).A0Q.A00.obtainMessage(16, c21120yp).sendToTarget();
        return c21120yp;
    }
}
