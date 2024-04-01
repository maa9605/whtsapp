package com.facebook.msys.mci;

import X.AbstractRunnableC19880wM;
import X.C000200d;
import X.C003601s;
import com.facebook.msys.mci.Execution;

/* loaded from: classes.dex */
public class Execution {
    public static volatile boolean sInitialized;
    public static final ThreadLocal sThreadLocalExecutionContext = new ThreadLocal() { // from class: X.0Sg
        @Override // java.lang.ThreadLocal
        public Object initialValue() {
            Execution.assertInitialized();
            return Integer.valueOf(Execution.nativeGetExecutionContext());
        }
    };

    public static native int nativeGetExecutionContext();

    public static native void nativeInitialize();

    public static native void nativeInitializeExecutors(int[] iArr);

    public static native boolean nativeScheduleTask(Runnable runnable, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(int i);

    public static void assertInitialized() {
        if (!sInitialized) {
            throw new RuntimeException("This class has to be initialized before it can be used");
        }
    }

    public static boolean callingThreadMatchesExecutionContext(int i) {
        try {
            return getExecutionContext() == i;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static void ensureNotOnDiskIoThread() {
        if (sInitialized && getExecutionContext() == 2) {
            throw new IllegalStateException("The task can not run on DiskIO thread");
        }
    }

    public static void ensureNotOnMsysThread() {
        if (sInitialized && getExecutionContext() != 0) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
    }

    public static void executeAfter(AbstractRunnableC19880wM abstractRunnableC19880wM, int i, long j) {
        executeAfterWithPriority(abstractRunnableC19880wM, i, 0, j);
    }

    public static void executeAfterWithPriority(AbstractRunnableC19880wM abstractRunnableC19880wM, int i, int i2, long j) {
        assertInitialized();
        if (abstractRunnableC19880wM != null) {
            if (!nativeScheduleTask(abstractRunnableC19880wM, i, i2, j / 1000.0d, abstractRunnableC19880wM.toString())) {
                throw new RuntimeException(C000200d.A0D("UNKNOWN execution context ", i));
            }
            return;
        }
        throw null;
    }

    public static void executeAsync(AbstractRunnableC19880wM abstractRunnableC19880wM, int i) {
        executeAsyncWithPriority(abstractRunnableC19880wM, i, 0);
    }

    public static void executeAsyncWithPriority(AbstractRunnableC19880wM abstractRunnableC19880wM, int i, int i2) {
        assertInitialized();
        if (abstractRunnableC19880wM != null) {
            executeAfterWithPriority(abstractRunnableC19880wM, i, i2, 0L);
            return;
        }
        throw null;
    }

    public static void executePossiblySync(AbstractRunnableC19880wM abstractRunnableC19880wM, int i) {
        assertInitialized();
        if (abstractRunnableC19880wM != null) {
            if (callingThreadMatchesExecutionContext(i)) {
                abstractRunnableC19880wM.run();
                return;
            } else {
                executeAsyncWithPriority(abstractRunnableC19880wM, i, 0);
                return;
            }
        }
        throw null;
    }

    public static int getExecutionContext() {
        return ((Number) sThreadLocalExecutionContext.get()).intValue();
    }

    public static synchronized boolean initialize() {
        synchronized (Execution.class) {
            C003601s.A01("Execution.initialize");
            int i = 0;
            if (sInitialized) {
                C003601s.A00();
                return false;
            }
            int[] iArr = {1, 2, 3, 4};
            String[] strArr = {"Main", "Disk", "Network", "Decoding", "Crypto"};
            nativeInitializeExecutors(iArr);
            do {
                final int i2 = iArr[i];
                String str = strArr[i];
                Runnable runnable = new Runnable() { // from class: X.0Sh
                    @Override // java.lang.Runnable
                    public void run() {
                        Execution.nativeStartExecutor(i2);
                    }
                };
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("Context");
                new Thread(runnable, sb.toString()).start();
                i++;
            } while (i < 4);
            nativeInitialize();
            ExecutionIdle.initialize();
            synchronized (TaskTracker.class) {
                int i3 = 0;
                if (!TaskTracker.sInitialized) {
                    TaskTracker[] taskTrackerArr = {TaskTracker.TRACKER_MAIN, TaskTracker.TRACKER_DISK_IO, TaskTracker.TRACKER_NETWORK, TaskTracker.TRACKER_DECODING, TaskTracker.TRACKER_CRYPTO};
                    do {
                        TaskTracker taskTracker = taskTrackerArr[i3];
                        taskTracker.mNativeHolder = TaskTracker.initNativeHolder(taskTracker.mExecutionContext, taskTracker.mQueueName);
                        i3++;
                    } while (i3 < 5);
                    TaskTracker.sInitialized = true;
                }
            }
            sInitialized = true;
            C003601s.A00();
            return true;
        }
    }

    public static boolean setInitializedForTestingOnly(boolean z) {
        boolean z2 = sInitialized;
        sInitialized = z;
        return z2;
    }
}
