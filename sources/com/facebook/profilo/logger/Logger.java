package com.facebook.profilo.logger;

import X.InterfaceC20250x6;
import android.os.Process;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class Logger {
    public static String sFilePrefix;
    public static volatile boolean sInitialized;
    public static InterfaceC20250x6 sLoggerCallbacks;
    public static NativeTraceWriterCallbacks sNativeTraceWriterCallbacks;
    public static int sRingBufferSize;
    public static File sTraceDirectory;
    public static volatile NativeTraceWriter sTraceWriter;
    public static AtomicReference sWorker;

    public static native int loggerWriteAndWakeupTraceWriter(NativeTraceWriter nativeTraceWriter, long j, int i, int i2, int i3, long j2);

    public static native int loggerWriteBytesEntry(int i, int i2, int i3, String str);

    public static native int loggerWriteStandardEntry(int i, int i2, long j, int i3, int i4, int i5, long j2);

    public static native void nativeInitRingBuffer(int i);

    public static native void stopTraceWriter(NativeTraceWriter nativeTraceWriter);

    public static void postFinishTrace(int i, long j) {
        writeStandardEntry(0, 7, i, 0L, 0, 0, 0, j);
    }

    public static void startWorkerThreadIfNecessary() {
        if (sWorker.get() != null) {
            return;
        }
        try {
            NativeTraceWriter nativeTraceWriter = new NativeTraceWriter(sTraceDirectory.getCanonicalPath(), sFilePrefix, sNativeTraceWriterCallbacks);
            Thread thread = new Thread(nativeTraceWriter) { // from class: X.0x7
                public final NativeTraceWriter A00;

                {
                    super("Prflo:Logger");
                    this.A00 = nativeTraceWriter;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Process.setThreadPriority(5);
                    this.A00.loop();
                }
            };
            if (sWorker.compareAndSet(null, thread)) {
                sTraceWriter = nativeTraceWriter;
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0x4
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public void uncaughtException(Thread thread2, Throwable th) {
                        InterfaceC20250x6 interfaceC20250x6 = Logger.sLoggerCallbacks;
                        if (interfaceC20250x6 != null) {
                            interfaceC20250x6.ALe(th);
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("Could not get canonical path of trace directory");
        }
    }

    public static int writeBytesEntry(int i, int i2, int i3, int i4, String str) {
        if (str == null) {
            str = "null";
        }
        if (sInitialized) {
            return loggerWriteBytesEntry(1, i3, i4, str);
        }
        return -1;
    }

    public static int writeStandardEntry(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2) {
        if (sInitialized) {
            if ((i2 & 1) == 0 && (i & TraceEvents.sProviders) == 0) {
                return -1;
            }
            return loggerWriteStandardEntry(i2, i3, j, 0, i5, 0, j2);
        }
        return -1;
    }
}
