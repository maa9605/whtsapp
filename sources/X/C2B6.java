package X;

/* renamed from: X.2B6  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2B6 implements InterfaceC05440Ot {
    public C0I8 A00;

    public C2B6(C04h c04h) {
        c04h.A02.A00(new C0SP() { // from class: X.3Dh
            @Override // X.C0SP
            public final void AK4(Object obj) {
                C0I8 c0i8 = C2B6.this.A00;
                if (c0i8 != null) {
                    c0i8.A00();
                }
            }
        });
    }

    @Override // X.InterfaceC05440Ot
    public void ATE(C0I8 c0i8) {
        this.A00 = c0i8;
    }
}
