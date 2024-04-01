package com.whatsapp.voipcalling;

import X.C74393dC;
import X.RunnableC73693c3;

/* loaded from: classes.dex */
public class MultiNetworkCallback {
    public final C74393dC provider;

    public MultiNetworkCallback(C74393dC c74393dC) {
        this.provider = c74393dC;
    }

    public void closeAlternativeSocket(boolean z) {
        C74393dC c74393dC = this.provider;
        c74393dC.A06.execute(new RunnableEBaseShape1S0110000_I1(c74393dC, z, 2));
    }

    public void createAlternativeSocket(boolean z, boolean z2) {
        C74393dC c74393dC = this.provider;
        c74393dC.A06.execute(new RunnableC73693c3(c74393dC, z, z2));
    }
}
