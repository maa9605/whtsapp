package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0uV  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18890uV extends AbstractExecutorService {
    public final BlockingQueue A02;
    public final Executor A03;
    public final String A01 = "SerialExecutor";
    public volatile int A06 = 1;
    public final RunnableC18880uU A00 = new Runnable() { // from class: X.0uU
        @Override // java.lang.Runnable
        public void run() {
            try {
                C18890uV c18890uV = C18890uV.this;
                BlockingQueue blockingQueue = c18890uV.A02;
                Runnable runnable = (Runnable) blockingQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
                c18890uV.A05.decrementAndGet();
                if (!blockingQueue.isEmpty()) {
                    c18890uV.A00();
                }
            } catch (Throwable th) {
                C18890uV c18890uV2 = C18890uV.this;
                c18890uV2.A05.decrementAndGet();
                if (!c18890uV2.A02.isEmpty()) {
                    c18890uV2.A00();
                }
                throw th;
            }
        }
    };
    public final AtomicInteger A05 = new AtomicInteger(0);
    public final AtomicInteger A04 = new AtomicInteger(0);

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0uU] */
    public C18890uV(Executor executor, BlockingQueue blockingQueue) {
        this.A03 = executor;
        this.A02 = blockingQueue;
    }

    public final void A00() {
        AtomicInteger atomicInteger = this.A05;
        for (int i = atomicInteger.get(); i < this.A06; i = atomicInteger.get()) {
            if (atomicInteger.compareAndSet(i, i + 1)) {
                this.A03.execute(this.A00);
                return;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.A02;
            if (blockingQueue.offer(runnable)) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.A04;
                int i = atomicInteger.get();
                if (size > i) {
                    atomicInteger.compareAndSet(i, size);
                }
                A00();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.A01);
            sb.append(" queue is full, size=");
            sb.append(blockingQueue.size());
            throw new RejectedExecutionException(sb.toString());
        }
        throw new NullPointerException("runnable parameter is null");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
