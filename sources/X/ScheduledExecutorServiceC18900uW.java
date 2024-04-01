package X;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0uW  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ScheduledExecutorServiceC18900uW extends AbstractExecutorService implements ScheduledExecutorService {
    public final Handler A00;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    public ScheduledExecutorServiceC18900uW(Handler handler) {
        this.A00 = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC18910uX(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC18910uX(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableFutureC18910uX runnableFutureC18910uX = new RunnableFutureC18910uX(runnable, null);
        handler.postDelayed(runnableFutureC18910uX, timeUnit.toMillis(j));
        return runnableFutureC18910uX;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Handler handler = this.A00;
        RunnableFutureC18910uX runnableFutureC18910uX = new RunnableFutureC18910uX(callable);
        handler.postDelayed(runnableFutureC18910uX, timeUnit.toMillis(j));
        return runnableFutureC18910uX;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (runnable != null) {
            RunnableFutureC18910uX runnableFutureC18910uX = new RunnableFutureC18910uX(runnable, null);
            execute(runnableFutureC18910uX);
            return runnableFutureC18910uX;
        }
        throw null;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        if (runnable != null) {
            RunnableFutureC18910uX runnableFutureC18910uX = new RunnableFutureC18910uX(runnable, obj);
            execute(runnableFutureC18910uX);
            return runnableFutureC18910uX;
        }
        throw null;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        if (callable != null) {
            RunnableFutureC18910uX runnableFutureC18910uX = new RunnableFutureC18910uX(callable);
            execute(runnableFutureC18910uX);
            return runnableFutureC18910uX;
        }
        throw null;
    }
}
