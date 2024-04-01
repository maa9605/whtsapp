package androidx.lifecycle;

import X.AbstractC07250Xm;
import X.C02520Bt;
import X.C0C1;
import X.C0HL;
import X.C0UA;
import X.EnumC02560Bx;
import X.InterfaceC02360Aw;
import X.InterfaceC05620Pl;

/* loaded from: classes.dex */
public class LiveData$LifecycleBoundObserver extends AbstractC07250Xm implements C0UA {
    public final InterfaceC02360Aw A00;
    public final /* synthetic */ C0HL A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(C0HL c0hl, InterfaceC02360Aw interfaceC02360Aw, InterfaceC05620Pl interfaceC05620Pl) {
        super(c0hl, interfaceC05620Pl);
        this.A01 = c0hl;
        this.A00 = interfaceC02360Aw;
    }

    @Override // X.AbstractC07250Xm
    public void A00() {
        ((C02520Bt) this.A00.AAs()).A01.A01(this);
    }

    @Override // X.AbstractC07250Xm
    public boolean A02() {
        return ((C02520Bt) this.A00.AAs()).A02.compareTo(EnumC02560Bx.STARTED) >= 0;
    }

    @Override // X.AbstractC07250Xm
    public boolean A03(InterfaceC02360Aw interfaceC02360Aw) {
        return this.A00 == interfaceC02360Aw;
    }

    @Override // X.C0UA
    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        if (((C02520Bt) this.A00.AAs()).A02 == EnumC02560Bx.DESTROYED) {
            this.A01.A09(this.A02);
        } else {
            A01(A02());
        }
    }
}
