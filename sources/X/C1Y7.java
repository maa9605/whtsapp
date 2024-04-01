package X;

import java.io.Closeable;

/* renamed from: X.1Y7  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y7 implements Closeable {
    public AbstractC19030uj A00;
    public final int A01;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r4 > ((X.InterfaceC19710vs) r3.A04()).ADA()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1Y7(X.AbstractC19030uj r3, int r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L21
            if (r4 < 0) goto L14
            java.lang.Object r0 = r3.A04()
            X.0vs r0 = (X.InterfaceC19710vs) r0
            int r1 = r0.ADA()
            r0 = 1
            if (r4 <= r1) goto L15
        L14:
            r0 = 0
        L15:
            X.C07K.A1X(r0)
            X.0uj r0 = r3.clone()
            r2.A00 = r0
            r2.A01 = r4
            return
        L21:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Y7.<init>(X.0uj, int):void");
    }

    public synchronized byte A00(int i) {
        A02();
        C07K.A1X(i >= 0);
        C07K.A1X(i < this.A01);
        return ((InterfaceC19710vs) this.A00.A04()).AR3(i);
    }

    public synchronized int A01() {
        A02();
        return this.A01;
    }

    public synchronized void A02() {
        if (!AbstractC19030uj.A02(this.A00)) {
            throw new RuntimeException() { // from class: X.0uf
            };
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        AbstractC19030uj abstractC19030uj = this.A00;
        if (abstractC19030uj != null) {
            abstractC19030uj.close();
        }
        this.A00 = null;
    }
}
