package X;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0mB */
/* loaded from: classes.dex */
public abstract class AbstractC13990mB {
    public static HandlerC13970m9 A05;
    public static final BlockingQueue A06;
    public static final Executor A07;
    public static final ThreadFactory A08 = new ThreadFactory() { // from class: X.0m6
        public final AtomicInteger A00 = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder A0P = C000200d.A0P("ModernAsyncTask #");
            A0P.append(this.A00.getAndIncrement());
            return new Thread(runnable, A0P.toString());
        }
    };
    public final CallableC28731Tj A00;
    public final FutureTask A01;
    public volatile EnumC13980mA A04 = EnumC13980mA.PENDING;
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final AtomicBoolean A03 = new AtomicBoolean();

    static {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        A06 = linkedBlockingQueue;
        A07 = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, A08);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.Callable, X.1Tj] */
    public AbstractC13990mB() {
        ?? r1 = new Callable() { // from class: X.1Tj
            {
                AbstractC13990mB.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                AbstractC13990mB abstractC13990mB = AbstractC13990mB.this;
                abstractC13990mB.A03.set(true);
                Object obj = null;
                try {
                    Process.setThreadPriority(10);
                    RunnableC28711Th runnableC28711Th = (RunnableC28711Th) abstractC13990mB;
                    if (runnableC28711Th != null) {
                        try {
                            obj = runnableC28711Th.A01.A07();
                        } catch (C0S2 e) {
                            if (!runnableC28711Th.A02.get()) {
                                throw e;
                            }
                        }
                        Binder.flushPendingCommands();
                        return obj;
                    }
                    throw null;
                } finally {
                }
            }
        };
        this.A00 = r1;
        this.A01 = new FutureTask(r1) { // from class: X.0m7
            {
                AbstractC13990mB.this = this;
            }

            @Override // java.util.concurrent.FutureTask
            public void done() {
                try {
                    Object obj = get();
                    AbstractC13990mB abstractC13990mB = AbstractC13990mB.this;
                    if (abstractC13990mB.A03.get()) {
                        return;
                    }
                    abstractC13990mB.A00(obj);
                } catch (InterruptedException e) {
                    Log.w("AsyncTask", e);
                } catch (CancellationException unused) {
                    AbstractC13990mB abstractC13990mB2 = AbstractC13990mB.this;
                    if (abstractC13990mB2.A03.get()) {
                        return;
                    }
                    abstractC13990mB2.A00(null);
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0m9] */
    public void A00(Object obj) {
        HandlerC13970m9 handlerC13970m9;
        synchronized (AbstractC13990mB.class) {
            HandlerC13970m9 handlerC13970m92 = A05;
            handlerC13970m9 = handlerC13970m92;
            if (handlerC13970m92 == null) {
                ?? r3 = new Handler() { // from class: X.0m9
                    {
                        Looper.getMainLooper();
                    }

                    @Override // android.os.Handler
                    public void handleMessage(Message message) {
                        RunnableC28711Th runnableC28711Th;
                        C13960m8 c13960m8 = (C13960m8) message.obj;
                        int i = message.what;
                        if (i != 1) {
                            if (i == 2 && c13960m8.A00 == null) {
                                throw null;
                            }
                            return;
                        }
                        AbstractC13990mB abstractC13990mB = c13960m8.A00;
                        Object obj2 = c13960m8.A01[0];
                        if (abstractC13990mB.A02.get()) {
                            runnableC28711Th = (RunnableC28711Th) abstractC13990mB;
                            try {
                                runnableC28711Th.A01.A0A(runnableC28711Th, obj2);
                                runnableC28711Th.A00.countDown();
                            } finally {
                            }
                        } else {
                            runnableC28711Th = (RunnableC28711Th) abstractC13990mB;
                            try {
                                AbstractC28721Ti abstractC28721Ti = runnableC28711Th.A01;
                                if (abstractC28721Ti.A03 != runnableC28711Th) {
                                    abstractC28721Ti.A0A(runnableC28711Th, obj2);
                                } else if (((C13930m5) abstractC28721Ti).A02) {
                                    abstractC28721Ti.A0B(obj2);
                                } else {
                                    abstractC28721Ti.A04 = false;
                                    abstractC28721Ti.A00 = SystemClock.uptimeMillis();
                                    abstractC28721Ti.A03 = null;
                                    abstractC28721Ti.A04(obj2);
                                }
                            } finally {
                            }
                        }
                        abstractC13990mB.A04 = EnumC13980mA.FINISHED;
                    }
                };
                A05 = r3;
                handlerC13970m9 = r3;
            }
        }
        handlerC13970m9.obtainMessage(1, new C13960m8(this, obj)).sendToTarget();
    }
}
