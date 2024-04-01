package X;

import android.os.Looper;
import java.util.Iterator;

/* renamed from: X.2Ll  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2Ll extends C0MU {
    public final C0VS A00;

    public C2Ll(C0VS component) {
        this.A00 = component;
    }

    @Override // X.C0MU
    public void A01() {
        C2Lm A01 = ((C0VS) C02180Ae.A0f(this.A00, C0VS.class)).A01();
        if (A01 != null) {
            Thread thread = C02180Ae.A03;
            if (thread == null) {
                thread = Looper.getMainLooper().getThread();
                C02180Ae.A03 = thread;
            }
            if (Thread.currentThread() == thread) {
                Iterator it = A01.A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw null;
                }
                return;
            }
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        throw null;
    }
}
