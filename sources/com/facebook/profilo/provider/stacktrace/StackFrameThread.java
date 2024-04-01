package com.facebook.profilo.provider.stacktrace;

import X.AbstractC20060wj;
import X.C1YO;
import X.C20070wk;
import X.C20180wy;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.Logger;

/* loaded from: classes.dex */
public final class StackFrameThread extends AbstractC20060wj {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public C20180wy mSavedTraceContext;
    public int mSystemClockTimeIntervalMs;

    public static native int nativeSystemClockTickIntervalMs();

    static {
        C20070wk c20070wk = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = c20070wk.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = c20070wk.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = c20070wk.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        this.mSystemClockTimeIntervalMs = -1;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null && (context instanceof Application)) {
            this.mContext = context;
        } else {
            this.mContext = applicationContext;
        }
    }

    @Override // X.AbstractC20060wj
    public void disable() {
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            return;
        }
        this.mSavedTraceContext = null;
        this.mEnabled = false;
        synchronized (CPUProfiler.class) {
            if (CPUProfiler.sInitialized) {
                CPUProfiler.nativeStopProfiling();
            }
        }
        Thread thread = this.mProfilerThread;
        if (thread != null) {
            try {
                thread.join();
                this.mProfilerThread = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
        if (com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r1, r6, r8, r9, r7) == false) goto L41;
     */
    @Override // X.AbstractC20060wj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    @Override // X.AbstractC20060wj
    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if ((r2 & r1) != 0) goto L11;
     */
    @Override // X.AbstractC20060wj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getTracingProviders() {
        /*
            r4 = this;
            X.0wy r1 = r4.mSavedTraceContext
            boolean r0 = r4.mEnabled
            r3 = 0
            if (r0 == 0) goto L1d
            if (r1 == 0) goto L1d
            int r2 = r1.A02
            int r1 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_WALL_TIME_STACK_TRACE
            r0 = r2 & r1
            if (r0 != 0) goto L17
            int r1 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_STACK_FRAME
            r0 = r2 & r1
            if (r0 == 0) goto L18
        L17:
            r3 = r3 | r1
        L18:
            int r0 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_NATIVE_STACK_TRACE
            r2 = r2 & r0
            r2 = r2 | r3
            return r2
        L1d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    public static void logAnnotation(String str, String str2) {
        int writeStandardEntry = Logger.writeStandardEntry(PROVIDER_STACK_FRAME, 7, 52, 0L, 0, 0, 0, 0L);
        int i = PROVIDER_STACK_FRAME;
        Logger.writeBytesEntry(i, 1, 57, Logger.writeBytesEntry(i, 1, 56, writeStandardEntry, str), str2);
    }

    @Override // X.AbstractC20060wj
    public void onTraceEnded(C20180wy c20180wy, C1YO c1yo) {
        int i;
        if ((c20180wy.A02 & PROVIDER_STACK_FRAME) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int providersToTracers = providersToTracers(c20180wy.A02);
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(providersToTracers & i));
        }
    }

    @Override // X.AbstractC20060wj
    public void onTraceStarted(C20180wy c20180wy, C1YO c1yo) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }

    public static int providersToTracers(int i) {
        int i2 = ((PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE) & i) != 0 ? 16369 : 0;
        return (i & PROVIDER_NATIVE_STACK_TRACE) != 0 ? i2 | 4 : i2;
    }
}
