package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0uX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableFutureC18910uX implements RunnableFuture, ScheduledFuture {
    public final FutureTask A00;

    public RunnableFutureC18910uX(Runnable runnable, Object obj) {
        this.A00 = new FutureTask(runnable, obj);
    }

    public RunnableFutureC18910uX(Callable callable) {
        this.A00 = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.A00.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.A00.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.A00.run();
    }
}
