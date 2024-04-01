package X;

import android.os.Bundle;

/* renamed from: X.1bG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30841bG implements InterfaceC227813z, AnonymousClass140 {
    public InterfaceC30851bH A00;
    public final C227413u A01;
    public final boolean A02;

    public C30841bG(C227413u c227413u, boolean z) {
        this.A01 = c227413u;
        this.A02 = z;
    }

    @Override // X.InterfaceC227813z
    public final void AIu(Bundle bundle) {
        C07K.A1Q(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.AIu(bundle);
    }

    @Override // X.AnonymousClass140
    public final void AIv(C30451ab c30451ab) {
        C07K.A1Q(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.AWL(c30451ab, this.A01, this.A02);
    }

    @Override // X.InterfaceC227813z
    public final void AIw(int i) {
        C07K.A1Q(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.AIw(i);
    }
}
