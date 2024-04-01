package X;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0qM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16410qM extends C237517y {
    public final C235817h A00;

    public C16410qM(Context context, Looper looper, InterfaceC227813z interfaceC227813z, AnonymousClass140 anonymousClass140, C230114w c230114w) {
        super(context, looper, interfaceC227813z, anonymousClass140, c230114w);
        this.A00 = new C235817h(context, ((C237517y) this).A00);
    }

    @Override // X.AbstractC229914u, X.InterfaceC30511ah
    public final void A7H() {
        C235817h c235817h = this.A00;
        synchronized (c235817h) {
            if (isConnected()) {
                try {
                    Map map = c235817h.A02;
                    synchronized (map) {
                        for (BinderC39901qu binderC39901qu : map.values()) {
                            if (binderC39901qu != null) {
                                ((InterfaceC235717g) c235817h.A01.A00.A02()).AWv(new C31661cd(2, null, binderC39901qu.asBinder(), null, null, null));
                            }
                        }
                        map.clear();
                    }
                    Map map2 = c235817h.A04;
                    synchronized (map2) {
                        Iterator it = map2.values().iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        map2.clear();
                    }
                    Map map3 = c235817h.A03;
                    synchronized (map3) {
                        Iterator it2 = map3.values().iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        map3.clear();
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.A7H();
        }
    }
}
