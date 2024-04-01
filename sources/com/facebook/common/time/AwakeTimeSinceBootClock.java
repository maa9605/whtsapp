package com.facebook.common.time;

import X.InterfaceC19090up;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class AwakeTimeSinceBootClock implements InterfaceC19090up {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @Override // X.InterfaceC19090up
    public long now() {
        return SystemClock.uptimeMillis();
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
