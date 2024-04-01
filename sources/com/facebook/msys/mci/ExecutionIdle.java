package com.facebook.msys.mci;

import X.C003601s;
import com.facebook.msys.mci.ExecutionIdle;

/* loaded from: classes.dex */
public class ExecutionIdle {
    public static volatile boolean sInitialized;

    public static native void nativeInitialize();

    public static native void nativeStartIdleExecutor();

    public static synchronized boolean initialize() {
        synchronized (ExecutionIdle.class) {
            if (sInitialized) {
                return false;
            }
            C003601s.A01("ExecutionIdle.initialize");
            nativeInitialize();
            new Thread(new Runnable() { // from class: X.0Sm
                @Override // java.lang.Runnable
                public void run() {
                    ExecutionIdle.nativeStartIdleExecutor();
                }
            }).start();
            sInitialized = true;
            C003601s.A00();
            return true;
        }
    }
}
