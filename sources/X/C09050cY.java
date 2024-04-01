package X;

import androidx.lifecycle.SavedStateHandleController;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0cY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09050cY implements InterfaceC09060cZ {
    @Override // X.InterfaceC09060cZ
    public void ANi(InterfaceC02390Az interfaceC02390Az) {
        if (interfaceC02390Az instanceof InterfaceC02380Ay) {
            C0VW ADv = ((InterfaceC02380Ay) interfaceC02390Az).ADv();
            C0U6 ACx = interfaceC02390Az.ACx();
            if (ADv != null) {
                HashMap hashMap = ADv.A00;
                Iterator it = new HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.A00((C0MU) hashMap.get(it.next()), ACx, interfaceC02390Az.AAs());
                }
                if (new HashSet(hashMap.keySet()).isEmpty()) {
                    return;
                }
                ACx.A01();
                return;
            }
            throw null;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
    }
}
