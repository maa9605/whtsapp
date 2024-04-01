package X;

/* renamed from: X.1aF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30301aF implements InterfaceC223312a {
    public long A00;
    public long A01;
    public C21120yp A02 = C21120yp.A04;
    public boolean A03;
    public final C12Q A04;

    public C30301aF(C12Q c12q) {
        this.A04 = c12q;
    }

    public void A00(long j) {
        this.A01 = j;
        if (this.A03) {
            this.A00 = this.A04.A7X();
        }
    }

    @Override // X.InterfaceC223312a
    public C21120yp ACS() {
        return this.A02;
    }

    @Override // X.InterfaceC223312a
    public long ACX() {
        long j = this.A01;
        if (this.A03) {
            long A7X = this.A04.A7X() - this.A00;
            C21120yp c21120yp = this.A02;
            if (c21120yp.A01 == 1.0f) {
                return j + C20910yU.A00(A7X);
            }
            return j + (A7X * c21120yp.A02);
        }
        return j;
    }

    @Override // X.InterfaceC223312a
    public C21120yp ATd(C21120yp c21120yp) {
        if (this.A03) {
            A00(ACX());
        }
        this.A02 = c21120yp;
        return c21120yp;
    }
}
