package X;

/* renamed from: X.1Y0  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y0 extends AbstractC19590vg {
    public C19310vD A00;

    public C1Y0(C19310vD c19310vD) {
        this.A00 = c19310vD;
    }

    @Override // X.AbstractC19590vg
    public synchronized int A00() {
        return A01() ? 0 : this.A00.A00.getSizeInBytes();
    }

    @Override // X.AbstractC19590vg
    public synchronized boolean A01() {
        return this.A00 == null;
    }

    @Override // X.AbstractC19590vg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            C19310vD c19310vD = this.A00;
            if (c19310vD == null) {
                return;
            }
            AutoCloseable autoCloseable = null;
            this.A00 = null;
            synchronized (c19310vD) {
                if (0 != 0) {
                    autoCloseable.close();
                }
            }
        }
    }
}
