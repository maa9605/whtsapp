package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.43e */
/* loaded from: classes3.dex */
public class C884543e {
    public InterfaceC884443d A01;
    public Condition A02;
    public long A00 = 5000;
    public final ReentrantLock A03 = new ReentrantLock();

    public void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            try {
                Condition condition = this.A02;
                if (condition != null) {
                    condition.await(this.A00, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e) {
                throw new AnonymousClass435("Operation blocker interrupted. ", e);
            }
        } finally {
            if (this.A02 != null) {
                this.A02 = null;
                InterfaceC884443d interfaceC884443d = this.A01;
                if (interfaceC884443d != null) {
                    interfaceC884443d.APe();
                }
            }
            reentrantLock.unlock();
        }
    }

    public void A01() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            Condition condition = this.A02;
            if (condition != null) {
                condition.signal();
            }
        } finally {
            this.A02 = null;
            reentrantLock.unlock();
        }
    }

    public void A02(long j) {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        if (this.A02 == null) {
            this.A02 = reentrantLock.newCondition();
            if (j <= 0) {
                j = 5000;
            }
            this.A00 = j;
            reentrantLock.unlock();
            return;
        }
        throw new IllegalStateException("There is already a block condition being used.");
    }
}
