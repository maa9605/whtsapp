package com.facebook.imagepipeline.memory;

import X.AbstractC24731Cq;
import X.C19770vy;
import X.C1Y3;
import X.InterfaceC18980ue;
import X.InterfaceC19710vs;
import X.InterfaceC19780vz;

/* loaded from: classes.dex */
public class AshmemMemoryChunkPool extends AbstractC24731Cq {
    public AshmemMemoryChunkPool(InterfaceC18980ue interfaceC18980ue, C19770vy c19770vy, InterfaceC19780vz interfaceC19780vz) {
        super(interfaceC18980ue, c19770vy, interfaceC19780vz);
    }

    @Override // X.AbstractC24731Cq, X.AbstractC39061pV
    public Object A04(int i) {
        return new C1Y3(i);
    }

    @Override // X.AbstractC24731Cq
    public InterfaceC19710vs A0A(int i) {
        return new C1Y3(i);
    }
}
