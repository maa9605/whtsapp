package X;

import android.graphics.Bitmap;

/* renamed from: X.1Y1  reason: invalid class name */
/* loaded from: classes.dex */
public class C1Y1 extends AbstractC19590vg {
    public AbstractC19030uj A00;
    public volatile Bitmap A01;

    public C1Y1(AbstractC19030uj abstractC19030uj) {
        AbstractC19030uj clone;
        synchronized (abstractC19030uj) {
            clone = abstractC19030uj.A05() ? abstractC19030uj.clone() : null;
        }
        C07K.A1N(clone);
        this.A00 = clone;
        this.A01 = (Bitmap) clone.A04();
    }

    @Override // X.AbstractC19590vg
    public int A00() {
        return C0w6.A01(this.A01);
    }

    @Override // X.AbstractC19590vg
    public synchronized boolean A01() {
        return this.A00 == null;
    }

    @Override // X.AbstractC19590vg, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC19030uj abstractC19030uj;
        synchronized (this) {
            abstractC19030uj = this.A00;
            this.A00 = null;
            this.A01 = null;
        }
        if (abstractC19030uj != null) {
            abstractC19030uj.close();
        }
    }
}
