package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.42o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C882942o {
    public final ReentrantLock A01 = new ReentrantLock();
    public int A00 = 0;

    public boolean A00() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            boolean z = true;
            boolean z2 = (this.A00 & 2) == 2;
            reentrantLock.unlock();
            if (!z2) {
                reentrantLock.lock();
                boolean z3 = (this.A00 & 4) == 4;
                reentrantLock.unlock();
                if (!z3) {
                    z = false;
                }
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public boolean A01() {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            return this.A00 == 0;
        } finally {
            reentrantLock.unlock();
        }
    }
}
