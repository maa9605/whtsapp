package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0J7  reason: invalid class name */
/* loaded from: classes.dex */
public class C0J7 {
    public C1QK A00;
    public AtomicInteger A01 = new AtomicInteger();

    public C0J7(C1QK c1qk) {
        this.A00 = c1qk;
    }

    public Object A00(C0SC c0sc) {
        C1QK c1qk;
        C05080Nf A9V = this.A00.A9V();
        if (A9V == null) {
            return null;
        }
        C1PV c1pv = null;
        boolean z = false;
        while (A9V != null) {
            c1pv = c0sc.ARu(A9V);
            if (z) {
                this.A01.incrementAndGet();
            }
            if (c1pv.A05) {
                return c1pv.A02;
            }
            int i = c1pv.A00;
            z = true;
            if (i == 1 && (c1qk = c1pv.A01) != null) {
                this.A00 = c1qk;
                z = false;
            } else {
                this.A00.AK0(c1pv.A04, i);
                if (!c1pv.A03) {
                    return c1pv.A02;
                }
            }
            try {
                Thread.sleep(this.A00.A8V());
                A9V = this.A00.A9V();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (c1pv != null) {
            return c1pv.A02;
        }
        return null;
    }
}
