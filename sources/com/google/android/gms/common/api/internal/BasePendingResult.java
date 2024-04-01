package com.google.android.gms.common.api.internal;

import X.AnonymousClass141;
import X.C07K;
import X.C08H;
import X.C0NE;
import X.C0NJ;
import X.C0NT;
import X.HandlerC234416q;
import X.HandlerC30531ak;
import X.InterfaceC228014b;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult extends C0NJ {
    public static final ThreadLocal A0D = new ThreadLocal() { // from class: X.14g
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Object initialValue() {
            return Boolean.FALSE;
        }
    };
    public C08H A00;
    public AnonymousClass141 A01;
    public Status A02;
    public boolean A03;
    public boolean A04;
    public final HandlerC30531ak A06;
    public final WeakReference A08;
    public volatile boolean A0C;
    public final Object A07 = new Object();
    public final CountDownLatch A0A = new CountDownLatch(1);
    public final ArrayList A09 = new ArrayList();
    public final AtomicReference A0B = new AtomicReference();
    public boolean A05 = false;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1ak] */
    public BasePendingResult() {
        this.A07 = new Object();
        this.A0A = new CountDownLatch(1);
        this.A09 = new ArrayList();
        this.A0B = new AtomicReference();
        this.A05 = false;
        this.A06 = new HandlerC234416q(Looper.getMainLooper()) { // from class: X.1ak
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("BasePendingResult", C000200d.A07(45, "Don't know how to handle message: ", i), new Exception());
                        return;
                    } else {
                        ((BasePendingResult) message.obj).A09(Status.A08);
                        return;
                    }
                }
                Pair pair = (Pair) message.obj;
                try {
                    ((AnonymousClass141) pair.first).AO4((C08H) pair.second);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        };
        this.A08 = new WeakReference(null);
    }

    public abstract C08H A04(Status status);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1ak] */
    public BasePendingResult(C0NE c0ne) {
        Looper mainLooper;
        this.A07 = new Object();
        this.A0A = new CountDownLatch(1);
        this.A09 = new ArrayList();
        this.A0B = new AtomicReference();
        this.A05 = false;
        if (c0ne != null) {
            mainLooper = c0ne.A02();
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.A06 = new HandlerC234416q(mainLooper) { // from class: X.1ak
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("BasePendingResult", C000200d.A07(45, "Don't know how to handle message: ", i), new Exception());
                        return;
                    } else {
                        ((BasePendingResult) message.obj).A09(Status.A08);
                        return;
                    }
                }
                Pair pair = (Pair) message.obj;
                try {
                    ((AnonymousClass141) pair.first).AO4((C08H) pair.second);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        };
        this.A08 = new WeakReference(c0ne);
    }

    @Override // X.C0NJ
    public final C08H A00() {
        C07K.A1U("await must not be called on the UI thread");
        C07K.A1c(!this.A0C, "Result has already been consumed");
        C07K.A1c(true, "Cannot await if then() has been called.");
        try {
            this.A0A.await();
        } catch (InterruptedException unused) {
            A09(Status.A06);
        }
        C07K.A1c(A0A(), "Result is not ready.");
        return A03();
    }

    @Override // X.C0NJ
    public final void A01(C0NT c0nt) {
        C07K.A1b(true, "Callback cannot be null.");
        synchronized (this.A07) {
            if (A0A()) {
                c0nt.AIl(this.A02);
            } else {
                this.A09.add(c0nt);
            }
        }
    }

    @Override // X.C0NJ
    public final void A02(AnonymousClass141 anonymousClass141) {
        synchronized (this.A07) {
            C07K.A1c(this.A0C ? false : true, "Result has already been consumed.");
            C07K.A1c(true, "Cannot set callbacks if then() has been called.");
            if (this.A03) {
                return;
            }
            if (A0A()) {
                HandlerC30531ak handlerC30531ak = this.A06;
                C08H A03 = A03();
                if (handlerC30531ak != null) {
                    handlerC30531ak.sendMessage(handlerC30531ak.obtainMessage(1, new Pair(anonymousClass141, A03)));
                } else {
                    throw null;
                }
            } else {
                this.A01 = anonymousClass141;
            }
        }
    }

    public final C08H A03() {
        C08H c08h;
        synchronized (this.A07) {
            C07K.A1c(this.A0C ? false : true, "Result has already been consumed.");
            C07K.A1c(A0A(), "Result is not ready.");
            c08h = this.A00;
            this.A00 = null;
            this.A01 = null;
            this.A0C = true;
        }
        InterfaceC228014b interfaceC228014b = (InterfaceC228014b) this.A0B.getAndSet(null);
        if (interfaceC228014b != null) {
            interfaceC228014b.AWW(this);
        }
        return c08h;
    }

    public void A05() {
        synchronized (this.A07) {
            if (this.A03 || this.A0C) {
                return;
            }
            this.A03 = true;
            A08(A04(Status.A04));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0011, code lost:
        if (((java.lang.Boolean) com.google.android.gms.common.api.internal.BasePendingResult.A0D.get()).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06() {
        /*
            r2 = this;
            boolean r0 = r2.A05
            if (r0 != 0) goto L13
            java.lang.ThreadLocal r0 = com.google.android.gms.common.api.internal.BasePendingResult.A0D
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L14
        L13:
            r0 = 1
        L14:
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.A06():void");
    }

    public final void A07(C08H c08h) {
        synchronized (this.A07) {
            if (this.A04 || this.A03) {
                return;
            }
            A0A();
            C07K.A1c(A0A() ? false : true, "Results have already been set");
            C07K.A1c(this.A0C ? false : true, "Result has already been consumed");
            A08(c08h);
        }
    }

    public final void A08(C08H c08h) {
        this.A00 = c08h;
        this.A0A.countDown();
        this.A02 = this.A00.ADG();
        if (this.A03) {
            this.A01 = null;
        } else if (this.A01 != null) {
            HandlerC30531ak handlerC30531ak = this.A06;
            handlerC30531ak.removeMessages(2);
            AnonymousClass141 anonymousClass141 = this.A01;
            C08H A03 = A03();
            if (handlerC30531ak != null) {
                handlerC30531ak.sendMessage(handlerC30531ak.obtainMessage(1, new Pair(anonymousClass141, A03)));
            } else {
                throw null;
            }
        }
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C0NT) obj).AIl(this.A02);
        }
        arrayList.clear();
    }

    public final void A09(Status status) {
        synchronized (this.A07) {
            if (!A0A()) {
                A07(A04(status));
                this.A04 = true;
            }
        }
    }

    public final boolean A0A() {
        return this.A0A.getCount() == 0;
    }
}
