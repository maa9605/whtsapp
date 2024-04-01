package androidx.lifecycle;

import X.AbstractC02530Bu;
import X.C02520Bt;
import X.C07750Zs;
import X.C0C1;
import X.C0MU;
import X.C0U6;
import X.C0UA;
import X.EnumC02560Bx;
import X.InterfaceC02360Aw;
import java.util.Map;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements C0UA {
    public boolean A00 = false;
    public final C07750Zs A01;
    public final String A02;

    public SavedStateHandleController(String str, C07750Zs c07750Zs) {
        this.A02 = str;
        this.A01 = c07750Zs;
    }

    public static void A00(C0MU c0mu, C0U6 c0u6, AbstractC02530Bu abstractC02530Bu) {
        Object obj;
        Map map = c0mu.A00;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = map.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.A00) {
            return;
        }
        savedStateHandleController.A02(c0u6, abstractC02530Bu);
        A01(c0u6, abstractC02530Bu);
    }

    public static void A01(final C0U6 c0u6, final AbstractC02530Bu abstractC02530Bu) {
        EnumC02560Bx enumC02560Bx = ((C02520Bt) abstractC02530Bu).A02;
        if (enumC02560Bx == EnumC02560Bx.INITIALIZED || enumC02560Bx.compareTo(EnumC02560Bx.STARTED) >= 0) {
            c0u6.A01();
        } else {
            abstractC02530Bu.A02(new C0UA() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // X.C0UA
                public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
                    if (c0c1 == C0C1.ON_START) {
                        ((C02520Bt) abstractC02530Bu).A01.A01(this);
                        c0u6.A01();
                    }
                }
            });
        }
    }

    public void A02(C0U6 c0u6, AbstractC02530Bu abstractC02530Bu) {
        if (!this.A00) {
            this.A00 = true;
            abstractC02530Bu.A02(this);
            if (c0u6.A01.A02(this.A02, this.A01.A00) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // X.C0UA
    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        if (c0c1 == C0C1.ON_DESTROY) {
            this.A00 = false;
            ((C02520Bt) interfaceC02360Aw.AAs()).A01.A01(this);
        }
    }
}
