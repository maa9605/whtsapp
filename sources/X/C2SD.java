package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2SD  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2SD {
    public Object A00;
    public final Condition A01;
    public final ReentrantLock A02;

    public C2SD() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.A02 = reentrantLock;
        this.A01 = reentrantLock.newCondition();
    }

    public boolean A00(Object obj) {
        boolean z;
        if (obj != null) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (this.A00 == null) {
                    this.A00 = obj;
                    this.A01.signal();
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                reentrantLock.unlock();
            }
        }
        throw null;
    }
}
