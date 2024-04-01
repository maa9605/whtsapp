package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    public static native boolean nativeInitialize(int i);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, boolean z, int i3, boolean z2);

    public static native void nativeStopProfiling();

    static {
        SoLoader.A03("profilo_stacktrace");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        if (r1.equals("5.0.2") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
        if (r1.equals("5.1.1") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
        if (r1.equals("6.0.1") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
        if (r1.equals("7.1.0") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
        if (r0 == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean init(android.content.Context r4) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.CPUProfiler.init(android.content.Context):boolean");
    }
}
