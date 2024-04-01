package X;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.44I */
/* loaded from: classes3.dex */
public class C44I {
    public static final UUID A07 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;
    public final boolean A06 = true;

    public C44I() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        this.A05 = handlerThread;
        handlerThread.start();
        this.A03 = new Handler(this.A05.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        this.A04 = handlerThread2;
        handlerThread2.start();
        this.A02 = new Handler(this.A04.getLooper());
    }

    public synchronized C44H A00(Callable callable, String str, long j) {
        C44H c44h;
        c44h = new C44H(this, this.A01, callable, str);
        this.A03.postAtTime(c44h, this.A01, SystemClock.uptimeMillis() + j);
        return c44h;
    }

    public synchronized C44H A01(Callable callable, String str, final AbstractC886844b abstractC886844b) {
        C44H c44h;
        c44h = new C44H(this, this.A01, callable, str);
        if (abstractC886844b != null) {
            synchronized (c44h) {
                if (c44h.isDone()) {
                    try {
                        final Object obj = c44h.get();
                        c44h.A03.A05(c44h.A02, new Runnable() { // from class: X.44F
                            @Override // java.lang.Runnable
                            public void run() {
                                if (r1) {
                                    abstractC886844b.A01(obj);
                                    return;
                                }
                                Exception exc = r4;
                                if (exc instanceof CancellationException) {
                                    abstractC886844b.A00(exc);
                                } else {
                                    abstractC886844b.A00(exc);
                                }
                            }
                        });
                    } catch (InterruptedException e) {
                        e = e;
                        c44h.A03.A05(c44h.A02, new Runnable() { // from class: X.44F
                            @Override // java.lang.Runnable
                            public void run() {
                                if (r1) {
                                    abstractC886844b.A01(obj);
                                    return;
                                }
                                Exception exc = e;
                                if (exc instanceof CancellationException) {
                                    abstractC886844b.A00(exc);
                                } else {
                                    abstractC886844b.A00(exc);
                                }
                            }
                        });
                    } catch (CancellationException e2) {
                        c44h.A03.A05(c44h.A02, new Runnable() { // from class: X.44F
                            @Override // java.lang.Runnable
                            public void run() {
                                if (r1) {
                                    abstractC886844b.A01(obj);
                                    return;
                                }
                                Exception exc = e2;
                                if (exc instanceof CancellationException) {
                                    abstractC886844b.A00(exc);
                                } else {
                                    abstractC886844b.A00(exc);
                                }
                            }
                        });
                    } catch (ExecutionException e3) {
                        e = e3;
                        c44h.A03.A05(c44h.A02, new Runnable() { // from class: X.44F
                            @Override // java.lang.Runnable
                            public void run() {
                                if (r1) {
                                    abstractC886844b.A01(obj);
                                    return;
                                }
                                Exception exc = e;
                                if (exc instanceof CancellationException) {
                                    abstractC886844b.A00(exc);
                                } else {
                                    abstractC886844b.A00(exc);
                                }
                            }
                        });
                    }
                } else {
                    c44h.A01.add(abstractC886844b);
                }
            }
        }
        this.A03.postAtTime(c44h, this.A01, SystemClock.uptimeMillis());
        return c44h;
    }

    public Object A02(Callable callable, String str) {
        C44H c44h;
        synchronized (this) {
            c44h = new C44H(this, this.A01, callable, str);
            this.A02.post(c44h);
        }
        return c44h.get();
    }

    public Object A03(Callable callable, String str) {
        C44H c44h;
        synchronized (this) {
            c44h = new C44H(this, this.A01, callable, str);
            this.A02.post(c44h);
        }
        C44C c44c = (C44C) c44h.get();
        c44c.A5k();
        return c44c.ACt();
    }

    public void A04(String str) {
        if (A08()) {
            return;
        }
        StringBuilder A0V = C000200d.A0V(str, " Current thread: ");
        A0V.append(Thread.currentThread().getName());
        throw new RuntimeException(A0V.toString());
    }

    public synchronized void A05(UUID uuid, Runnable runnable) {
        UUID uuid2 = this.A01;
        if ((uuid2 == null || !uuid2.equals(uuid)) && !A07.equals(uuid)) {
            return;
        }
        Handler handler = this.A00;
        if (handler != null) {
            handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
        } else {
            C44J.A00.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
        }
    }

    public synchronized void A06(Callable callable, String str) {
        A01(callable, str, null);
    }

    public synchronized void A07(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public boolean A08() {
        return this.A03.getLooper().getThread() == Thread.currentThread();
    }

    public void finalize() {
        super.finalize();
        HandlerThread handlerThread = this.A04;
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            handlerThread.quitSafely();
        } else {
            handlerThread.quit();
        }
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        HandlerThread handlerThread2 = this.A05;
        if (i >= 18) {
            handlerThread2.quitSafely();
        } else {
            handlerThread2.quit();
        }
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }
}
