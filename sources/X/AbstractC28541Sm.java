package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1Sm */
/* loaded from: classes.dex */
public abstract class AbstractC28541Sm implements InterfaceFutureC09630eS {
    public static final AbstractC12030ik A00;
    public static final Object A01;
    public volatile C12070io listeners;
    public volatile Object value;
    public volatile C12080ip waiters;
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger A02 = Logger.getLogger(AbstractC28541Sm.class.getName());

    static {
        AbstractC12030ik abstractC12030ik;
        try {
            abstractC12030ik = new AbstractC12030ik(AtomicReferenceFieldUpdater.newUpdater(C12080ip.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C12080ip.class, C12080ip.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC28541Sm.class, C12080ip.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC28541Sm.class, C12070io.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC28541Sm.class, Object.class, "value")) { // from class: X.1Sk
                public final AtomicReferenceFieldUpdater A00;
                public final AtomicReferenceFieldUpdater A01;
                public final AtomicReferenceFieldUpdater A02;
                public final AtomicReferenceFieldUpdater A03;
                public final AtomicReferenceFieldUpdater A04;

                {
                    this.A03 = r1;
                    this.A02 = r2;
                    this.A04 = r3;
                    this.A00 = r4;
                    this.A01 = r5;
                }

                @Override // X.AbstractC12030ik
                public void A00(C12080ip c12080ip, C12080ip c12080ip2) {
                    this.A02.lazySet(c12080ip, c12080ip2);
                }

                @Override // X.AbstractC12030ik
                public void A01(C12080ip c12080ip, Thread thread) {
                    this.A03.lazySet(c12080ip, thread);
                }

                @Override // X.AbstractC12030ik
                public boolean A02(AbstractC28541Sm abstractC28541Sm, C12070io c12070io, C12070io c12070io2) {
                    return this.A00.compareAndSet(abstractC28541Sm, c12070io, c12070io2);
                }

                @Override // X.AbstractC12030ik
                public boolean A03(AbstractC28541Sm abstractC28541Sm, C12080ip c12080ip, C12080ip c12080ip2) {
                    return this.A04.compareAndSet(abstractC28541Sm, c12080ip, c12080ip2);
                }

                @Override // X.AbstractC12030ik
                public boolean A04(AbstractC28541Sm abstractC28541Sm, Object obj, Object obj2) {
                    return this.A01.compareAndSet(abstractC28541Sm, obj, obj2);
                }
            };
            th = null;
        } catch (Throwable th) {
            th = th;
            abstractC12030ik = new AbstractC12030ik() { // from class: X.1Sl
                @Override // X.AbstractC12030ik
                public void A00(C12080ip c12080ip, C12080ip c12080ip2) {
                    c12080ip.next = c12080ip2;
                }

                @Override // X.AbstractC12030ik
                public void A01(C12080ip c12080ip, Thread thread) {
                    c12080ip.thread = thread;
                }

                @Override // X.AbstractC12030ik
                public boolean A02(AbstractC28541Sm abstractC28541Sm, C12070io c12070io, C12070io c12070io2) {
                    synchronized (abstractC28541Sm) {
                        if (abstractC28541Sm.listeners == c12070io) {
                            abstractC28541Sm.listeners = c12070io2;
                            return true;
                        }
                        return false;
                    }
                }

                @Override // X.AbstractC12030ik
                public boolean A03(AbstractC28541Sm abstractC28541Sm, C12080ip c12080ip, C12080ip c12080ip2) {
                    synchronized (abstractC28541Sm) {
                        if (abstractC28541Sm.waiters == c12080ip) {
                            abstractC28541Sm.waiters = c12080ip2;
                            return true;
                        }
                        return false;
                    }
                }

                @Override // X.AbstractC12030ik
                public boolean A04(AbstractC28541Sm abstractC28541Sm, Object obj, Object obj2) {
                    synchronized (abstractC28541Sm) {
                        if (abstractC28541Sm.value == obj) {
                            abstractC28541Sm.value = obj2;
                            return true;
                        }
                        return false;
                    }
                }
            };
        }
        A00 = abstractC12030ik;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        A01 = new Object();
    }

    public static final Object A00(Object obj) {
        if (!(obj instanceof C12040il)) {
            if (!(obj instanceof C12060in)) {
                if (obj == A01) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C12060in) obj).A00);
        }
        Throwable th = ((C12040il) obj).A00;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static void A01(AbstractC28541Sm abstractC28541Sm) {
        C12080ip c12080ip;
        AbstractC12030ik abstractC12030ik;
        C12070io c12070io;
        C12070io c12070io2 = null;
        do {
            c12080ip = abstractC28541Sm.waiters;
            abstractC12030ik = A00;
        } while (!abstractC12030ik.A03(abstractC28541Sm, c12080ip, C12080ip.A00));
        while (c12080ip != null) {
            Thread thread = c12080ip.thread;
            if (thread != null) {
                c12080ip.thread = null;
                LockSupport.unpark(thread);
            }
            c12080ip = c12080ip.next;
        }
        do {
            c12070io = abstractC28541Sm.listeners;
        } while (!abstractC12030ik.A02(abstractC28541Sm, c12070io, C12070io.A03));
        while (c12070io != null) {
            C12070io c12070io3 = c12070io.A00;
            c12070io.A00 = c12070io2;
            c12070io2 = c12070io;
            c12070io = c12070io3;
        }
        while (c12070io2 != null) {
            C12070io c12070io4 = c12070io2.A00;
            A02(c12070io2.A01, c12070io2.A02);
            c12070io2 = c12070io4;
        }
    }

    public static void A02(Runnable runnable, Executor executor) {
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

    public String A03() {
        if (this instanceof ScheduledFuture) {
            StringBuilder A0P = C000200d.A0P("remaining delay=[");
            A0P.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            A0P.append(" ms]");
            return A0P.toString();
        }
        return null;
    }

    public final void A04(C12080ip c12080ip) {
        c12080ip.thread = null;
        while (true) {
            C12080ip c12080ip2 = this.waiters;
            if (c12080ip2 == C12080ip.A00) {
                return;
            }
            C12080ip c12080ip3 = null;
            while (c12080ip2 != null) {
                C12080ip c12080ip4 = c12080ip2.next;
                if (c12080ip2.thread != null) {
                    c12080ip3 = c12080ip2;
                } else if (c12080ip3 != null) {
                    c12080ip3.next = c12080ip4;
                    if (c12080ip3.thread == null) {
                        break;
                    }
                } else if (!A00.A03(this, c12080ip2, c12080ip4)) {
                    break;
                }
                c12080ip2 = c12080ip4;
            }
            return;
        }
    }

    public final void A05(StringBuilder sb) {
        Object obj;
        String valueOf;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj != this) {
            valueOf = String.valueOf(obj);
        } else {
            valueOf = "this future";
        }
        sb.append(valueOf);
        sb.append("]");
    }

    public void A06(Throwable th) {
        if (A00.A04(this, null, new C12060in(th))) {
            A01(this);
        }
    }

    public boolean A07(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (A00.A04(this, null, obj)) {
            A01(this);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceFutureC09630eS
    public final void A5E(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw null;
        }
        if (executor != null) {
            C12070io c12070io = this.listeners;
            C12070io c12070io2 = C12070io.A03;
            if (c12070io != c12070io2) {
                C12070io c12070io3 = new C12070io(runnable, executor);
                do {
                    c12070io3.A00 = c12070io;
                    if (A00.A02(this, c12070io, c12070io3)) {
                        return;
                    }
                    c12070io = this.listeners;
                } while (c12070io != c12070io2);
                A02(runnable, executor);
                return;
            }
            A02(runnable, executor);
            return;
        }
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C12040il c12040il;
        Object obj = this.value;
        if (obj == null) {
            if (A03) {
                c12040il = new C12040il(z, new CancellationException("Future.cancel() was called."));
            } else {
                c12040il = z ? C12040il.A03 : C12040il.A02;
            }
            if (A00.A04(this, obj, c12040il)) {
                A01(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if (obj2 != null) {
                return A00(obj2);
            }
            C12080ip c12080ip = this.waiters;
            C12080ip c12080ip2 = C12080ip.A00;
            if (c12080ip != c12080ip2) {
                C12080ip c12080ip3 = new C12080ip();
                do {
                    AbstractC12030ik abstractC12030ik = A00;
                    abstractC12030ik.A00(c12080ip3, c12080ip);
                    if (!abstractC12030ik.A03(this, c12080ip, c12080ip3)) {
                        c12080ip = this.waiters;
                    } else {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                A04(c12080ip3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return A00(obj);
                    }
                } while (c12080ip != c12080ip2);
                return A00(this.value);
            }
            return A00(this.value);
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00ca, code lost:
        if (r2 > 1000) goto L68;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28541Sm.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C12040il;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true & (this.value != null);
    }

    public String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.value instanceof C12040il) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            A05(sb);
        } else {
            try {
                obj = A03();
            } catch (RuntimeException e) {
                StringBuilder A0P = C000200d.A0P("Exception thrown from implementation: ");
                A0P.append(e.getClass());
                obj = A0P.toString();
            }
            if (obj != null && !obj.isEmpty()) {
                C000200d.A1T(sb, "PENDING, info=[", obj, "]");
            } else if (isDone()) {
                A05(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
