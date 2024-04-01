package X;

/* renamed from: X.1Zd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29951Zd implements InterfaceC220210s {
    public boolean A00;
    public final InterfaceC220210s A01;
    public final /* synthetic */ C39251pp A02;

    public C29951Zd(C39251pp c39251pp, InterfaceC220210s interfaceC220210s) {
        this.A02 = c39251pp;
        this.A01 = interfaceC220210s;
    }

    @Override // X.InterfaceC220210s
    public boolean AFf() {
        return !this.A02.A00() && this.A01.AFf();
    }

    @Override // X.InterfaceC220210s
    public void AGS() {
        this.A01.AGS();
    }

    @Override // X.InterfaceC220210s
    public int AR6(C21040yh c21040yh, C1ZK c1zk, boolean z) {
        C39251pp c39251pp = this.A02;
        if (c39251pp.A00()) {
            return -3;
        }
        if (this.A00) {
            ((AbstractC21590za) c1zk).A00 = 4;
            return -4;
        }
        int AR6 = this.A01.AR6(c21040yh, c1zk, z);
        if (AR6 == -5) {
            C21030yg c21030yg = c21040yh.A00;
            int i = c21030yg.A06;
            if (i != 0 || c21030yg.A07 != 0) {
                c21040yh.A00 = c21030yg.A01(i, c39251pp.A00 == Long.MIN_VALUE ? c21030yg.A07 : 0);
            }
            return -5;
        }
        long j = c39251pp.A00;
        if (j == Long.MIN_VALUE || (AR6 != -4 ? AR6 != -3 || c39251pp.A8c() != Long.MIN_VALUE : c1zk.A00 < j)) {
            return AR6;
        }
        c1zk.A03();
        ((AbstractC21590za) c1zk).A00 = 4;
        this.A00 = true;
        return -4;
    }

    @Override // X.InterfaceC220210s
    public int AUu(long j) {
        if (this.A02.A00()) {
            return -3;
        }
        return this.A01.AUu(j);
    }
}
