package X;

import java.util.concurrent.locks.Lock;

/* renamed from: X.14I  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C14I implements Runnable {
    public final /* synthetic */ C30611as A00;

    public abstract void A00();

    public C14I(C30611as c30611as) {
        this.A00 = c30611as;
    }

    @Override // java.lang.Runnable
    public void run() {
        C30611as c30611as = this.A00;
        Lock lock = c30611as.A0K;
        lock.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            A00();
        } catch (RuntimeException e) {
            HandlerC30761b8 handlerC30761b8 = c30611as.A0G.A06;
            handlerC30761b8.sendMessage(handlerC30761b8.obtainMessage(2, e));
        } finally {
            lock.unlock();
        }
    }
}
