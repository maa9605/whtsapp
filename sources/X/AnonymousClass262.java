package X;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.262  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass262 {
    public boolean A00;
    public final AnonymousClass028 A01;
    public final InterfaceC002901k A02;
    public final Lock A03 = new ReentrantLock();

    public AnonymousClass262(AnonymousClass028 anonymousClass028, InterfaceC002901k interfaceC002901k) {
        this.A01 = anonymousClass028;
        this.A02 = interfaceC002901k;
    }

    public void A00() {
        Lock lock = this.A03;
        lock.lock();
        if (this.A00) {
            lock.unlock();
            return;
        }
        lock.unlock();
        this.A02.AS1(new RunnableEBaseShape7S0100000_I0_7(this, 26));
    }
}
