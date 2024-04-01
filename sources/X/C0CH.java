package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0CH  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0CH extends C0CI implements Runnable, C0CJ {
    public final C0CK A00 = new C0CK();
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final FutureTask A02;

    public abstract Object A04();

    public C0CH() {
        final Callable callable = new Callable() { // from class: X.1MV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0CH.this.A04();
            }
        };
        this.A02 = new FutureTask(callable) { // from class: X.1MW
            @Override // java.util.concurrent.FutureTask
            public void done() {
                C0CH c0ch = C0CH.this;
                if (c0ch.A02.isCancelled()) {
                    c0ch.A00.A04(Boolean.TRUE);
                }
                c0ch.A01.countDown();
            }
        };
    }

    @Override // X.C0CI
    public void A03() {
        super.A03();
        this.A00.A01();
    }

    public void A05() {
        if (this.A02.isCancelled()) {
            throw new CancellationException();
        }
    }

    @Override // X.C0CJ
    public void cancel() {
        this.A02.cancel(true);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            FutureTask futureTask = this.A02;
            futureTask.run();
            try {
                boolean interrupted = Thread.interrupted();
                this.A01.await();
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
                Object obj = futureTask.get();
                if (obj == null) {
                    throw null;
                }
                A00(obj);
            } catch (InterruptedException e) {
                e = e;
                A01(e);
            } catch (CancellationException e2) {
                e = e2;
                A01(e);
            } catch (ExecutionException e3) {
                A01(e3.getCause());
            }
        } catch (Throwable th) {
            try {
                boolean interrupted2 = Thread.interrupted();
                this.A01.await();
                if (interrupted2) {
                    Thread.currentThread().interrupt();
                }
                Object obj2 = this.A02.get();
                if (obj2 == null) {
                    throw null;
                }
                A00(obj2);
                throw th;
            } catch (InterruptedException e4) {
                e = e4;
                A01(e);
                throw th;
            } catch (CancellationException e5) {
                e = e5;
                A01(e);
                throw th;
            } catch (ExecutionException e6) {
                A01(e6.getCause());
                throw th;
            }
        }
    }
}
