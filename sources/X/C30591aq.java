package X;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1aq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30591aq implements C14K {
    public final C39591qN A00;

    public C30591aq(C39591qN c39591qN) {
        this.A00 = c39591qN;
    }

    @Override // X.C14K
    public final void A5f() {
    }

    @Override // X.C14K
    public final void AIu(Bundle bundle) {
    }

    @Override // X.C14K
    public final void AWL(C30451ab c30451ab, C227413u c227413u, boolean z) {
    }

    @Override // X.C14K
    public final boolean A7J() {
        C39591qN c39591qN = this.A00;
        Lock lock = c39591qN.A05.A0L;
        lock.lock();
        lock.unlock();
        c39591qN.A00(null);
        return true;
    }

    @Override // X.C14K
    public final C0NH A7f(C0NH c0nh) {
        A7i(c0nh);
        return c0nh;
    }

    @Override // X.C14K
    public final C0NH A7i(C0NH c0nh) {
        try {
            C39591qN c39591qN = this.A00;
            C30691b1 c30691b1 = c39591qN.A05;
            C227914a c227914a = c30691b1.A0D;
            c227914a.A02.add(c0nh);
            c0nh.A0B.set(c227914a.A00);
            C227213r c227213r = c0nh.A00;
            InterfaceC30511ah interfaceC30511ah = (InterfaceC30511ah) c30691b1.A0J.get(c227213r);
            C07K.A1Q(interfaceC30511ah, "Appropriate Api was not requested.");
            if (!interfaceC30511ah.isConnected() && c39591qN.A0B.containsKey(c227213r)) {
                c0nh.A0D(new Status(1, 17, null, null));
                return c0nh;
            }
            c0nh.A0B(interfaceC30511ah);
            return c0nh;
        } catch (DeadObjectException unused) {
            C39591qN c39591qN2 = this.A00;
            C14L c14l = new C14L(this) { // from class: X.1ar
                @Override // X.C14L
                public final void A00() {
                    C39591qN c39591qN3 = C30591aq.this.A00;
                    c39591qN3.A00(null);
                    c39591qN3.A07.AWS(1, false);
                }
            };
            HandlerC30761b8 handlerC30761b8 = c39591qN2.A06;
            handlerC30761b8.sendMessage(handlerC30761b8.obtainMessage(1, c14l));
            return c0nh;
        }
    }

    @Override // X.C14K
    public final void AIw(int i) {
        C39591qN c39591qN = this.A00;
        c39591qN.A00(null);
        c39591qN.A07.AWS(i, false);
    }

    @Override // X.C14K
    public final void connect() {
    }
}
