package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.25l  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C461825l extends C0HK {
    public final AtomicBoolean A00 = new AtomicBoolean(false);

    @Override // X.C0HL
    public void A05(InterfaceC02360Aw interfaceC02360Aw, final InterfaceC05620Pl interfaceC05620Pl) {
        if (super.A00 > 0) {
            throw new IllegalStateException("Can not register multiple observers for a *Single*LiveEvent");
        }
        super.A05(interfaceC02360Aw, new InterfaceC05620Pl() { // from class: X.3sR
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C461825l c461825l = C461825l.this;
                InterfaceC05620Pl interfaceC05620Pl2 = interfaceC05620Pl;
                if (c461825l.A00.compareAndSet(true, false)) {
                    interfaceC05620Pl2.AIK(obj);
                }
            }
        });
    }

    @Override // X.C0HL
    public void A0B(Object obj) {
        this.A00.set(true);
        super.A0B(obj);
    }
}
