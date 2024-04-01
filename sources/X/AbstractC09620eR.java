package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0eR */
/* loaded from: classes.dex */
public abstract class AbstractC09620eR implements InterfaceFutureC09630eS {
    public static final AbstractC17220rk A00;
    public static final Object A01;
    public volatile C17260ro listeners;
    public volatile Object value;
    public volatile C17280rq waiters;
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A02 = Logger.getLogger(AbstractC09620eR.class.getName());

    static {
        AbstractC17220rk abstractC17220rk;
        try {
            abstractC17220rk = new AbstractC17220rk(AtomicReferenceFieldUpdater.newUpdater(C17280rq.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C17280rq.class, C17280rq.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC09620eR.class, C17280rq.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC09620eR.class, C17260ro.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC09620eR.class, Object.class, "value")) { // from class: X.1WF
                public final AtomicReferenceFieldUpdater A00;
                public final AtomicReferenceFieldUpdater A01;
                public final AtomicReferenceFieldUpdater A02;
                public final AtomicReferenceFieldUpdater A03;
                public final AtomicReferenceFieldUpdater A04;

                {
                    this.A03 = waiterThreadUpdater;
                    this.A02 = waiterNextUpdater;
                    this.A04 = waitersUpdater;
                    this.A00 = listenersUpdater;
                    this.A01 = valueUpdater;
                }

                @Override // X.AbstractC17220rk
                public void A00(C17280rq waiter, C17280rq newValue) {
                    this.A02.lazySet(waiter, newValue);
                }

                @Override // X.AbstractC17220rk
                public void A01(C17280rq waiter, Thread newValue) {
                    this.A03.lazySet(waiter, newValue);
                }

                @Override // X.AbstractC17220rk
                public boolean A02(AbstractC09620eR future, C17260ro expect, C17260ro update) {
                    return this.A00.compareAndSet(future, expect, update);
                }

                @Override // X.AbstractC17220rk
                public boolean A03(AbstractC09620eR future, C17280rq expect, C17280rq update) {
                    return this.A04.compareAndSet(future, expect, update);
                }

                @Override // X.AbstractC17220rk
                public boolean A04(AbstractC09620eR future, Object expect, Object update) {
                    return this.A01.compareAndSet(future, expect, update);
                }
            };
            th = null;
        } catch (Throwable th) {
            th = th;
            abstractC17220rk = new AbstractC17220rk() { // from class: X.1WG
                @Override // X.AbstractC17220rk
                public void A00(C17280rq waiter, C17280rq newValue) {
                    waiter.next = newValue;
                }

                @Override // X.AbstractC17220rk
                public void A01(C17280rq waiter, Thread newValue) {
                    waiter.thread = newValue;
                }

                @Override // X.AbstractC17220rk
                public boolean A02(AbstractC09620eR future, C17260ro expect, C17260ro update) {
                    synchronized (future) {
                        if (future.listeners == expect) {
                            future.listeners = update;
                            return true;
                        }
                        return false;
                    }
                }

                @Override // X.AbstractC17220rk
                public boolean A03(AbstractC09620eR future, C17280rq expect, C17280rq update) {
                    synchronized (future) {
                        if (future.waiters == expect) {
                            future.waiters = update;
                            return true;
                        }
                        return false;
                    }
                }

                @Override // X.AbstractC17220rk
                public boolean A04(AbstractC09620eR future, Object expect, Object update) {
                    synchronized (future) {
                        if (future.value == expect) {
                            future.value = update;
                            return true;
                        }
                        return false;
                    }
                }
            };
        }
        A00 = abstractC17220rk;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A01 = new Object();
    }

    public static Object A00(InterfaceFutureC09630eS future) {
        if (future instanceof AbstractC09620eR) {
            Object obj = ((AbstractC09620eR) future).value;
            if (obj instanceof C17230rl) {
                C17230rl c17230rl = (C17230rl) obj;
                if (c17230rl.A01) {
                    Throwable th = c17230rl.A00;
                    return th != null ? new C17230rl(false, th) : C17230rl.A02;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = future.isCancelled();
        if ((!A03) & isCancelled) {
            return C17230rl.A02;
        }
        try {
            Object A022 = A02(future);
            return A022 == null ? A01 : A022;
        } catch (CancellationException e) {
            if (!isCancelled) {
                StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(future);
                return new C17250rn(new IllegalArgumentException(sb.toString(), e));
            }
            return new C17230rl(false, e);
        } catch (ExecutionException e2) {
            return new C17250rn(e2.getCause());
        } catch (Throwable th2) {
            return new C17250rn(th2);
        }
    }

    public static final Object A01(Object obj) {
        if (!(obj instanceof C17230rl)) {
            if (!(obj instanceof C17250rn)) {
                if (obj == A01) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C17250rn) obj).A00);
        }
        Throwable th = ((C17230rl) obj).A00;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static Object A02(Future future) {
        boolean z = false;
        ?? r1 = future;
        while (true) {
            try {
                r1 = r1.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
                r1 = r1;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return r1;
    }

    public static void A03(AbstractC09620eR future) {
        C17260ro c17260ro;
        C17260ro c17260ro2;
        C17260ro c17260ro3 = null;
        while (true) {
            C17280rq c17280rq = future.waiters;
            AbstractC17220rk abstractC17220rk = A00;
            if (abstractC17220rk.A03(future, c17280rq, C17280rq.A00)) {
                while (c17280rq != null) {
                    Thread thread = c17280rq.thread;
                    if (thread != null) {
                        c17280rq.thread = null;
                        LockSupport.unpark(thread);
                    }
                    c17280rq = c17280rq.next;
                }
                do {
                    c17260ro = future.listeners;
                } while (!abstractC17220rk.A02(future, c17260ro, C17260ro.A03));
                while (true) {
                    c17260ro2 = c17260ro3;
                    c17260ro3 = c17260ro;
                    if (c17260ro == null) {
                        break;
                    }
                    c17260ro = c17260ro.A00;
                    c17260ro3.A00 = c17260ro2;
                }
                while (c17260ro2 != null) {
                    c17260ro3 = c17260ro2.A00;
                    Runnable runnable = c17260ro2.A01;
                    if (runnable instanceof RunnableC17270rp) {
                        RunnableC17270rp runnableC17270rp = (RunnableC17270rp) runnable;
                        future = runnableC17270rp.A00;
                        if (future.value == runnableC17270rp && abstractC17220rk.A04(future, runnableC17270rp, A00(runnableC17270rp.A01))) {
                            break;
                        }
                    } else {
                        A04(runnable, c17260ro2.A02);
                    }
                    c17260ro2 = c17260ro3;
                }
                return;
            }
        }
    }

    public static void A04(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    public final void A05(C17280rq node) {
        node.thread = null;
        while (true) {
            C17280rq c17280rq = this.waiters;
            if (c17280rq == C17280rq.A00) {
                return;
            }
            C17280rq c17280rq2 = null;
            while (c17280rq != null) {
                C17280rq c17280rq3 = c17280rq.next;
                if (c17280rq.thread != null) {
                    c17280rq2 = c17280rq;
                } else if (c17280rq2 != null) {
                    c17280rq2.next = c17280rq3;
                    if (c17280rq2.thread == null) {
                        break;
                    }
                } else if (!A00.A03(this, c17280rq, c17280rq3)) {
                    break;
                }
                c17280rq = c17280rq3;
            }
            return;
        }
    }

    public final void A06(StringBuilder builder) {
        String valueOf;
        try {
            Object A022 = A02(this);
            builder.append("SUCCESS, result=[");
            if (A022 != this) {
                valueOf = String.valueOf(A022);
            } else {
                valueOf = "this future";
            }
            builder.append(valueOf);
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            builder.append("FAILURE, cause=[");
            builder.append(e2.getCause());
            builder.append("]");
        }
    }

    @Override // X.InterfaceFutureC09630eS
    public final void A5E(Runnable listener, Executor executor) {
        if (executor != null) {
            C17260ro c17260ro = this.listeners;
            C17260ro c17260ro2 = C17260ro.A03;
            if (c17260ro != c17260ro2) {
                C17260ro c17260ro3 = new C17260ro(listener, executor);
                do {
                    c17260ro3.A00 = c17260ro;
                    if (A00.A02(this, c17260ro, c17260ro3)) {
                        return;
                    }
                    c17260ro = this.listeners;
                } while (c17260ro != c17260ro2);
                A04(listener, executor);
                return;
            }
            A04(listener, executor);
            return;
        }
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        C17230rl c17230rl;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof RunnableC17270rp)) {
            if (A03) {
                c17230rl = new C17230rl(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
            } else if (mayInterruptIfRunning) {
                c17230rl = C17230rl.A03;
            } else {
                c17230rl = C17230rl.A02;
            }
            boolean z = false;
            AbstractC09620eR abstractC09620eR = this;
            while (true) {
                if (A00.A04(abstractC09620eR, obj, c17230rl)) {
                    A03(abstractC09620eR);
                    if (!(obj instanceof RunnableC17270rp)) {
                        break;
                    }
                    InterfaceFutureC09630eS interfaceFutureC09630eS = ((RunnableC17270rp) obj).A01;
                    if (interfaceFutureC09630eS instanceof AbstractC09620eR) {
                        abstractC09620eR = (AbstractC09620eR) interfaceFutureC09630eS;
                        obj = abstractC09620eR.value;
                        if (!(obj == null) && !(obj instanceof RunnableC17270rp)) {
                            break;
                        }
                        z = true;
                    } else {
                        interfaceFutureC09630eS.cancel(mayInterruptIfRunning);
                        break;
                    }
                } else {
                    obj = abstractC09620eR.value;
                    if (!(obj instanceof RunnableC17270rp)) {
                        return z;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC17270rp))) {
                return A01(obj2);
            }
            C17280rq c17280rq = this.waiters;
            C17280rq c17280rq2 = C17280rq.A00;
            if (c17280rq != c17280rq2) {
                C17280rq c17280rq3 = new C17280rq();
                do {
                    AbstractC17220rk abstractC17220rk = A00;
                    abstractC17220rk.A00(c17280rq3, c17280rq);
                    if (!abstractC17220rk.A03(this, c17280rq, c17280rq3)) {
                        c17280rq = this.waiters;
                    } else {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                A05(c17280rq3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC17270rp))));
                        return A01(obj);
                    }
                } while (c17280rq != c17280rq2);
                return A01(this.value);
            }
            return A01(this.value);
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x00e5, code lost:
        if (r2 > 1000) goto L77;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09620eR.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C17230rl;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof RunnableC17270rp)) & (obj != null);
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.value instanceof C17230rl) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            A06(sb);
        } else {
            try {
                Object obj2 = this.value;
                if (obj2 instanceof RunnableC17270rp) {
                    StringBuilder A0P = C000200d.A0P("setFuture=[");
                    InterfaceFutureC09630eS interfaceFutureC09630eS = ((RunnableC17270rp) obj2).A01;
                    obj = C000200d.A0L(A0P, interfaceFutureC09630eS == this ? "this future" : String.valueOf(interfaceFutureC09630eS), "]");
                } else if (this instanceof ScheduledFuture) {
                    StringBuilder A0P2 = C000200d.A0P("remaining delay=[");
                    A0P2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
                    A0P2.append(" ms]");
                    obj = A0P2.toString();
                } else {
                    obj = null;
                }
            } catch (RuntimeException e) {
                StringBuilder A0P3 = C000200d.A0P("Exception thrown from implementation: ");
                A0P3.append(e.getClass());
                obj = A0P3.toString();
            }
            if (obj != null && !obj.isEmpty()) {
                C000200d.A1T(sb, "PENDING, info=[", obj, "]");
            } else if (isDone()) {
                A06(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
