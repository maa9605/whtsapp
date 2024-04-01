package X;

import android.os.Process;
import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.13E  reason: invalid class name */
/* loaded from: classes.dex */
public final class C13E extends ThreadPoolExecutor {
    public final /* synthetic */ C13H A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13E(C13H c13h) {
        super(1, 1, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue());
        this.A00 = c13h;
        setThreadFactory(new ThreadFactory() { // from class: X.13F
            public static final AtomicInteger A00 = new AtomicInteger();

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                final String A07 = C000200d.A07(23, "measurement-", A00.incrementAndGet());
                return new Thread(runnable, A07) { // from class: X.13G
                    @Override // java.lang.Thread, java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(10);
                        super.run();
                    }
                };
            }
        });
        allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(final Runnable runnable, final Object obj) {
        return new FutureTask(runnable, obj) { // from class: X.13I
            @Override // java.util.concurrent.FutureTask
            public final void setException(Throwable th) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = C13E.this.A00.A00;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                } else if (Log.isLoggable("GAv4", 6)) {
                    String valueOf = String.valueOf(th);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                    sb.append("MeasurementExecutor: job failed with ");
                    sb.append(valueOf);
                    Log.e("GAv4", sb.toString());
                }
                super.setException(th);
            }
        };
    }
}
