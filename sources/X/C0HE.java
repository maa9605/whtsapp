package X;

import android.os.CancellationSignal;

/* renamed from: X.0HE */
/* loaded from: classes.dex */
public final class C0HE {
    public InterfaceC12940kL A00;
    public Object A01;
    public boolean A02;
    public boolean A03;

    public Object A00() {
        Object obj;
        synchronized (this) {
            if (this.A01 == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.A01 = cancellationSignal;
                if (this.A03) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.A01;
        }
        return obj;
    }

    public void A01() {
        synchronized (this) {
            if (this.A03) {
                return;
            }
            this.A03 = true;
            this.A02 = true;
            InterfaceC12940kL interfaceC12940kL = this.A00;
            Object obj = this.A01;
            if (interfaceC12940kL != null) {
                try {
                    ((C1TX) interfaceC12940kL).A00();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.A02 = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.A02 = false;
                notifyAll();
            }
        }
    }

    public void A02() {
        if (A03()) {
            throw new C0S2();
        }
    }

    public boolean A03() {
        boolean z;
        synchronized (this) {
            z = this.A03;
        }
        return z;
    }
}
