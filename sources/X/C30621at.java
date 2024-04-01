package X;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1at  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30621at implements InterfaceC229514q {
    public final C227413u A00;
    public final WeakReference A01;
    public final boolean A02;

    public C30621at(C30611as c30611as, C227413u c227413u, boolean z) {
        this.A01 = new WeakReference(c30611as);
        this.A00 = c227413u;
        this.A02 = z;
    }

    @Override // X.InterfaceC229514q
    public final void ANu(C30451ab c30451ab) {
        C30611as c30611as = (C30611as) this.A01.get();
        if (c30611as == null) {
            return;
        }
        C07K.A1c(Looper.myLooper() == c30611as.A0G.A05.A08, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        Lock lock = c30611as.A0K;
        lock.lock();
        try {
            if (c30611as.A07(0)) {
                if (!c30451ab.A02()) {
                    c30611as.A04(c30451ab, this.A00, this.A02);
                }
                if (c30611as.A06()) {
                    c30611as.A00();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
