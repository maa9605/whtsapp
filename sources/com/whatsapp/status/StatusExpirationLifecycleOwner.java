package com.whatsapp.status;

import X.C018508q;
import X.C0C1;
import X.C0EB;
import X.C0MW;
import X.C22X;
import X.InterfaceC002901k;
import X.InterfaceC02360Aw;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes.dex */
public class StatusExpirationLifecycleOwner implements C0MW {
    public final C018508q A00;
    public final C22X A01;
    public final C0EB A02;
    public final InterfaceC002901k A03;
    public final Runnable A04 = new RunnableEBaseShape6S0100000_I0_6(this, 29);

    public StatusExpirationLifecycleOwner(InterfaceC02360Aw interfaceC02360Aw, C018508q c018508q, InterfaceC002901k interfaceC002901k, C0EB c0eb, C22X c22x) {
        this.A00 = c018508q;
        this.A03 = interfaceC002901k;
        this.A02 = c0eb;
        this.A01 = c22x;
        interfaceC02360Aw.AAs().A02(this);
    }

    public void A00() {
        C018508q c018508q = this.A00;
        c018508q.A02.removeCallbacks(this.A04);
        this.A03.AS1(new RunnableEBaseShape6S0100000_I0_6(this, 26));
    }

    @OnLifecycleEvent(C0C1.ON_DESTROY)
    public void onDestroy() {
        C018508q c018508q = this.A00;
        c018508q.A02.removeCallbacks(this.A04);
    }

    @OnLifecycleEvent(C0C1.ON_START)
    public void onStart() {
        A00();
    }
}
