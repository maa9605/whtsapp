package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1b0  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1b0 implements C14K {
    public final C39591qN A00;

    public C1b0(C39591qN c39591qN) {
        this.A00 = c39591qN;
    }

    @Override // X.C14K
    public final boolean A7J() {
        return true;
    }

    @Override // X.C14K
    public final void AIu(Bundle bundle) {
    }

    @Override // X.C14K
    public final void AIw(int i) {
    }

    @Override // X.C14K
    public final void AWL(C30451ab c30451ab, C227413u c227413u, boolean z) {
    }

    @Override // X.C14K
    public final void A5f() {
        C39591qN c39591qN = this.A00;
        for (InterfaceC30511ah interfaceC30511ah : c39591qN.A0A.values()) {
            interfaceC30511ah.A7H();
        }
        c39591qN.A05.A05 = Collections.emptySet();
    }

    @Override // X.C14K
    public final C0NH A7f(C0NH c0nh) {
        this.A00.A05.A0K.add(c0nh);
        return c0nh;
    }

    @Override // X.C14K
    public final C0NH A7i(C0NH c0nh) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // X.C14K
    public final void connect() {
        C39591qN c39591qN = this.A00;
        Lock lock = c39591qN.A0D;
        lock.lock();
        try {
            c39591qN.A0E = new C30611as(c39591qN, c39591qN.A08, c39591qN.A09, c39591qN.A03, c39591qN.A04, lock, c39591qN.A02);
            c39591qN.A0E.A5f();
            c39591qN.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
