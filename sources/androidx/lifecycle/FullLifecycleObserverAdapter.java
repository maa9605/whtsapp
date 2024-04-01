package androidx.lifecycle;

import X.C0C1;
import X.C0UA;
import X.InterfaceC02360Aw;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements C0UA {
    public final C0UA A00;

    @Override // X.C0UA
    public void AOy(InterfaceC02360Aw interfaceC02360Aw, C0C1 c0c1) {
        switch (c0c1.ordinal()) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                C0UA c0ua = this.A00;
                if (c0ua != null) {
                    c0ua.AOy(interfaceC02360Aw, c0c1);
                    return;
                }
                return;
        }
    }
}
