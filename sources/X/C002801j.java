package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.01j */
/* loaded from: classes.dex */
public final class C002801j implements InterfaceC002901k {
    public static AbstractC000600i A03;
    public static Executor A04;
    public static ThreadPoolExecutor A05;
    public static ThreadPoolExecutor A06;
    public static final C02Q A07;
    public static final BlockingQueue A08 = new LinkedBlockingQueue<Runnable>() { // from class: X.02P
        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(Object obj) {
            if (size() == 0) {
                return super.offer(obj);
            }
            return false;
        }
    };
    public static volatile InterfaceC002901k A09;
    public Handler A00;
    public final HashMap A01 = new HashMap();
    public final Set A02 = new HashSet();

    static {
        ExecutorC28121Qc executorC28121Qc = new Executor() { // from class: X.1Qc
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                new Thread(runnable, "AnomalyExecutorThread").start();
            }
        };
        A04 = executorC28121Qc;
        A07 = new C02Q(executorC28121Qc);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(timeUnit, A08, new C02V(10, "WhatsApp Worker")) { // from class: X.02W
            @Override // java.util.concurrent.ThreadPoolExecutor
            public void afterExecute(Runnable runnable, Throwable th) {
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public void beforeExecute(Thread thread, Runnable runnable) {
            }
        };
        A06 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: X.02X
            public final boolean A01 = true;
            public final AtomicBoolean A00 = new AtomicBoolean();

            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                AbstractC000600i abstractC000600i;
                try {
                    threadPoolExecutor2.getQueue().put(runnable);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                if (!this.A01 || this.A00.getAndSet(true) || (abstractC000600i = C002801j.A03) == null) {
                    return;
                }
                abstractC000600i.A09("waworkers-task-queued", String.valueOf(threadPoolExecutor2.getActiveCount()), true);
            }
        });
        C02Q c02q = A07;
        ThreadPoolExecutor threadPoolExecutor2 = A06;
        synchronized (c02q) {
            c02q.A00(threadPoolExecutor2, C02Y.A01);
        }
        A05 = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 120L, timeUnit, new SynchronousQueue(), new C02V(0, "High Pri Worker"));
    }

    public static InterfaceC002901k A00() {
        if (A09 == null) {
            synchronized (C002801j.class) {
                if (A09 == null) {
                    A09 = new C002801j();
                }
            }
        }
        return A09;
    }

    @Override // X.InterfaceC002901k
    public ThreadPoolExecutor A6y(String str, int i, int i2, long j, int i3, BlockingQueue blockingQueue) {
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str)) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, j, TimeUnit.SECONDS, blockingQueue, new C02V(i3, str)) { // from class: X.0LL
                @Override // java.util.concurrent.ThreadPoolExecutor
                public void afterExecute(Runnable runnable, Throwable th) {
                }

                @Override // java.util.concurrent.ThreadPoolExecutor
                public void beforeExecute(Thread thread, Runnable runnable) {
                }
            };
            C02Q c02q = A07;
            synchronized (c02q) {
                c02q.A00(threadPoolExecutor, C02Y.A01);
            }
            hashMap.put(str, threadPoolExecutor);
            return threadPoolExecutor;
        }
        throw new IllegalArgumentException(C000200d.A0H("A thread pool with this prefix already exists: ", str));
    }

    @Override // X.InterfaceC002901k
    public Executor AGj() {
        return Executors.newSingleThreadExecutor();
    }

    @Override // X.InterfaceC002901k
    public synchronized void ART(Runnable runnable) {
        Handler handler = this.A00;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }

    @Override // X.InterfaceC002901k
    public final void ARy(C0HS c0hs, Object... objArr) {
        c0hs.A02(A06, objArr);
    }

    @Override // X.InterfaceC002901k
    public void AS1(Runnable runnable) {
        A06.execute(runnable);
    }

    @Override // X.InterfaceC002901k
    public void AS3(final Runnable runnable, final String str) {
        Set set = this.A02;
        synchronized (set) {
            if (set.add(str)) {
                A06.execute(new Runnable() { // from class: X.1Qe
                    {
                        C002801j.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C002801j c002801j = C002801j.this;
                        Runnable runnable2 = runnable;
                        String str2 = str;
                        try {
                            runnable2.run();
                            Set set2 = c002801j.A02;
                            synchronized (set2) {
                                set2.remove(str2);
                            }
                        } catch (Throwable th) {
                            Set set3 = c002801j.A02;
                            synchronized (set3) {
                                set3.remove(str2);
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC002901k
    public final void AS4(C0HS c0hs, Object... objArr) {
        c0hs.A02(A05, objArr);
    }

    @Override // X.InterfaceC002901k
    public void AS5(Runnable runnable) {
        A05.execute(runnable);
    }

    @Override // X.InterfaceC002901k
    public synchronized Runnable ASB(final Runnable runnable, long j) {
        Runnable runnable2;
        Handler handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("WhatsApp Worker Scheduler", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        runnable2 = new Runnable() { // from class: X.1Qf
            {
                C002801j.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C002801j.this.AS1(runnable);
            }
        };
        handler.postDelayed(runnable2, j);
        return runnable2;
    }
}
