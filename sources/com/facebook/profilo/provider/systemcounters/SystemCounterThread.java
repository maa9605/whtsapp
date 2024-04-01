package com.facebook.profilo.provider.systemcounters;

import X.AbstractC20060wj;
import X.C20070wk;
import X.C20180wy;
import X.C20310xH;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.systemcounters.SystemCounterThread;
import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public final class SystemCounterThread extends AbstractC20060wj {
    public static final int PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    public static final int PROVIDER_SYSTEM_COUNTERS;
    public boolean mAllThreadsMode;
    public boolean mEnabled;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public volatile boolean mHighFrequencyMode;
    public HybridData mHybridData;
    public C20310xH mSystemCounterLogger;

    public static native HybridData initHybrid();

    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    public native void logCounters();

    public native void logHighFrequencyThreadCounters();

    public native void logTraceAnnotations();

    public native void nativeSetHighFrequencyMode(boolean z);

    /* loaded from: classes.dex */
    public class WhitelistApi {
        static {
            SoLoader.A03("profilo_systemcounters");
        }

        public static void add(int i) {
            SystemCounterThread.nativeAddToWhitelist(i);
        }

        public static void remove(int i) {
            SystemCounterThread.nativeRemoveFromWhitelist(i);
        }
    }

    static {
        C20070wk c20070wk = ProvidersRegistry.A00;
        PROVIDER_SYSTEM_COUNTERS = c20070wk.A02("system_counters");
        PROVIDER_HIGH_FREQ_THREAD_COUNTERS = c20070wk.A02("high_freq_main_thread_counters");
    }

    public SystemCounterThread() {
        super("profilo_systemcounters");
        this.mSystemCounterLogger = new C20310xH();
    }

    @Override // X.AbstractC20060wj
    public synchronized void disable() {
        if (this.mEnabled) {
            this.mSystemCounterLogger.A02();
            if (this.mAllThreadsMode) {
                logCounters();
            }
            if (this.mHighFrequencyMode) {
                logHighFrequencyThreadCounters();
                logTraceAnnotations();
            }
        }
        this.mEnabled = false;
        this.mAllThreadsMode = false;
        this.mHighFrequencyMode = false;
        nativeSetHighFrequencyMode(false);
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mHandler = null;
        Debug.stopAllocCounting();
    }

    @Override // X.AbstractC20060wj
    public synchronized void enable() {
        this.mHybridData = initHybrid();
        this.mEnabled = true;
        if (this.mHandler == null) {
            HandlerThread handlerThread = new HandlerThread("Prflo:Counters");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: X.0xI
                {
                    SystemCounterThread.this = this;
                }

                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    SystemCounterThread systemCounterThread = SystemCounterThread.this;
                    int i = message.what;
                    int i2 = message.arg1;
                    synchronized (systemCounterThread) {
                        if (!systemCounterThread.mEnabled) {
                            return;
                        }
                        if (i == 1) {
                            systemCounterThread.mSystemCounterLogger.A02();
                            systemCounterThread.logCounters();
                        } else if (i == 2) {
                            systemCounterThread.logHighFrequencyThreadCounters();
                        } else {
                            throw new IllegalArgumentException("Unknown message type");
                        }
                        systemCounterThread.mHandler.sendMessageDelayed(systemCounterThread.mHandler.obtainMessage(i, i2, 0), i2);
                    }
                }
            };
        }
        C20180wy c20180wy = this.A01;
        if ((PROVIDER_SYSTEM_COUNTERS & TraceEvents.sProviders) != 0) {
            this.mHighFrequencyMode = false;
            nativeSetHighFrequencyMode(false);
            this.mAllThreadsMode = true;
            Debug.startAllocCounting();
            C20310xH c20310xH = this.mSystemCounterLogger;
            c20310xH.A00 = 0L;
            c20310xH.A01 = 0L;
            c20310xH.A04 = 0L;
            c20310xH.A05 = 0L;
            c20310xH.A02 = 0L;
            c20310xH.A03 = 0L;
            c20310xH.A06 = 0L;
            c20310xH.A07 = 0L;
            c20310xH.A08 = 0L;
            c20310xH.A09 = 0L;
            this.mHandler.obtainMessage(1, c20180wy != null ? c20180wy.A07.A00("provider.system_counters.sampling_rate_ms", 50) : 50, 0).sendToTarget();
        }
        if ((PROVIDER_HIGH_FREQ_THREAD_COUNTERS & TraceEvents.sProviders) != 0) {
            nativeAddToWhitelist(Process.myPid());
            this.mHighFrequencyMode = true;
            nativeSetHighFrequencyMode(true);
            this.mHandler.obtainMessage(2, c20180wy != null ? c20180wy.A07.A00("provider.high_freq_main_thread_counters.sampling_rate_ms", 7) : 7, 0).sendToTarget();
        }
    }

    @Override // X.AbstractC20060wj
    public int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    }

    @Override // X.AbstractC20060wj
    public int getTracingProviders() {
        if (this.mEnabled) {
            int i = this.mAllThreadsMode ? 0 | PROVIDER_SYSTEM_COUNTERS : 0;
            return this.mHighFrequencyMode ? i | PROVIDER_HIGH_FREQ_THREAD_COUNTERS : i;
        }
        return 0;
    }
}
