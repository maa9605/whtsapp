package X;

import X.C0C1;
import X.C0U6;
import X.InterfaceC02360Aw;
import android.os.Bundle;
import androidx.savedstate.Recreator;

/* renamed from: X.0U5  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U5 {
    public final C0U6 A00 = new C0U6();
    public final InterfaceC02390Az A01;

    public C0U5(InterfaceC02390Az interfaceC02390Az) {
        this.A01 = interfaceC02390Az;
    }

    public void A00(Bundle bundle) {
        InterfaceC02390Az interfaceC02390Az = this.A01;
        AbstractC02530Bu AAs = interfaceC02390Az.AAs();
        if (((C02520Bt) AAs).A02 == EnumC02560Bx.INITIALIZED) {
            AAs.A02(new Recreator(interfaceC02390Az));
            final C0U6 c0u6 = this.A00;
            if (!c0u6.A04) {
                if (bundle != null) {
                    c0u6.A00 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                AAs.A02(new C0UA() { // from class: androidx.savedstate.SavedStateRegistry$1
                    @Override // X.C0UA
                    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
                        if (c0c1 == C0C1.ON_START) {
                            C0U6.this.A03 = true;
                        } else if (c0c1 != C0C1.ON_STOP) {
                        } else {
                            C0U6.this.A03 = false;
                        }
                    }
                });
                c0u6.A04 = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
