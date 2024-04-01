package com.facebook.common.time;

import X.InterfaceC19090up;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class RealtimeSinceBootClock implements InterfaceC19090up {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    @Override // X.InterfaceC19090up
    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
