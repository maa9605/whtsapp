package com.facebook.profilo.provider.threadmetadata;

import X.AbstractC20060wj;
import X.C1YO;
import X.C20180wy;

/* loaded from: classes.dex */
public final class ThreadMetadataProvider extends AbstractC20060wj {
    public static native void nativeLogThreadMetadata();

    @Override // X.AbstractC20060wj
    public void disable() {
    }

    @Override // X.AbstractC20060wj
    public void enable() {
    }

    @Override // X.AbstractC20060wj
    public int getSupportedProviders() {
        return -1;
    }

    @Override // X.AbstractC20060wj
    public int getTracingProviders() {
        return 0;
    }

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    @Override // X.AbstractC20060wj
    public void onTraceEnded(C20180wy c20180wy, C1YO c1yo) {
        if (c20180wy.A00 == 2) {
            return;
        }
        nativeLogThreadMetadata();
    }
}
