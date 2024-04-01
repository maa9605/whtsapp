package X;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* renamed from: X.02d */
/* loaded from: classes.dex */
public class ExecutorC004702d implements Executor {
    public Runnable A00;
    public final InterfaceC002901k A01;
    public final Object A02 = new Object();
    public final Queue A03 = new ArrayDeque();
    public final boolean A04;
    public volatile long A05;

    public ExecutorC004702d(InterfaceC002901k interfaceC002901k, boolean z) {
        this.A01 = interfaceC002901k;
        this.A04 = z;
    }

    public void A00() {
        C000700j.A08(this.A05 == Thread.currentThread().getId(), "Not running on this SerialExecutor");
    }

    public final synchronized void A01() {
        Runnable runnable = (Runnable) this.A03.poll();
        this.A00 = runnable;
        if (runnable != null) {
            if (this.A04) {
                this.A01.AS5(runnable);
            } else {
                this.A01.AS1(runnable);
            }
        }
    }

    public synchronized void A02(final Runnable runnable, long j) {
        this.A01.ASB(new Runnable() { // from class: X.1QZ
            {
                ExecutorC004702d.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC004702d.this.execute(runnable);
            }
        }, j);
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(final Runnable runnable) {
        this.A03.offer(new Runnable() { // from class: X.1Qa
            {
                ExecutorC004702d.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC004702d executorC004702d = ExecutorC004702d.this;
                Runnable runnable2 = runnable;
                try {
                    executorC004702d.A05 = Thread.currentThread().getId();
                    synchronized (executorC004702d.A02) {
                        runnable2.run();
                    }
                } finally {
                    executorC004702d.A05 = -1L;
                    executorC004702d.A01();
                }
            }
        });
        if (this.A00 == null) {
            A01();
        }
    }
}
