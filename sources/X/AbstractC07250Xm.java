package X;

/* renamed from: X.0Xm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07250Xm {
    public int A00 = -1;
    public boolean A01;
    public final InterfaceC05620Pl A02;
    public final /* synthetic */ C0HL A03;

    public void A00() {
    }

    public abstract boolean A02();

    public boolean A03(InterfaceC02360Aw interfaceC02360Aw) {
        return false;
    }

    public AbstractC07250Xm(C0HL c0hl, InterfaceC05620Pl interfaceC05620Pl) {
        this.A03 = c0hl;
        this.A02 = interfaceC05620Pl;
    }

    public void A01(boolean z) {
        if (z == this.A01) {
            return;
        }
        this.A01 = z;
        C0HL c0hl = this.A03;
        int i = c0hl.A00;
        boolean z2 = i == 0;
        c0hl.A00 = i + (z ? 1 : -1);
        if (z2 && z) {
            c0hl.A02();
        }
        if (c0hl.A00 == 0 && !this.A01) {
            c0hl.A03();
        }
        if (this.A01) {
            c0hl.A06(this);
        }
    }
}
