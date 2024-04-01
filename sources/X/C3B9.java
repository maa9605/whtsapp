package X;

import android.database.ContentObserver;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3B9 */
/* loaded from: classes2.dex */
public class C3B9 implements InterfaceC52142a8 {
    public C40481sK A01;
    public final C0C9 A02;
    public final C40411sD A03;
    public final AbstractC005302j A04;
    public final C42471vn A05;
    public final Map A06 = new HashMap();
    public int A00 = 0;

    public C3B9(C0C9 c0c9, C40411sD c40411sD, C42471vn c42471vn, AbstractC005302j abstractC005302j) {
        this.A02 = c0c9;
        this.A03 = c40411sD;
        this.A05 = c42471vn;
        this.A04 = abstractC005302j;
    }

    public Cursor A00() {
        if (!(this instanceof C86543xj)) {
            C40411sD c40411sD = this.A03;
            AbstractC005302j abstractC005302j = this.A04;
            if (abstractC005302j == null) {
                throw null;
            }
            if (c40411sD != null) {
                C000200d.A0v("mediamsgstore/getMediaMessagesCursor:", abstractC005302j);
                try {
                    return c40411sD.A0C.A03().A02.A07(C0HD.A0a, new String[]{String.valueOf(c40411sD.A06.A05(abstractC005302j))});
                } finally {
                }
            } else {
                throw null;
            }
        } else {
            C86543xj c86543xj = (C86543xj) this;
            return C40731sm.A08(c86543xj.A00, c86543xj.A01, c86543xj.A04, c86543xj.A03);
        }
    }

    @Override // X.InterfaceC52142a8
    /* renamed from: A01 */
    public AbstractC53492h0 AB8(int i) {
        AbstractC53492h0 abstractC53492h0;
        Map map = this.A06;
        Integer valueOf = Integer.valueOf(i);
        AbstractC53492h0 abstractC53492h02 = (AbstractC53492h0) map.get(valueOf);
        if (this.A01 == null || abstractC53492h02 != null) {
            return abstractC53492h02;
        }
        synchronized (this) {
            if (this.A01.moveToPosition(i)) {
                C40481sK c40481sK = this.A01;
                C42471vn c42471vn = this.A05;
                AnonymousClass097 A00 = c40481sK.A00();
                if (A00 != null) {
                    abstractC53492h0 = C43981yK.A05(A00, c42471vn);
                    if (abstractC53492h0 != null) {
                        map.put(valueOf, abstractC53492h0);
                    }
                } else {
                    throw null;
                }
            } else {
                abstractC53492h0 = null;
            }
        }
        return abstractC53492h0;
    }

    @Override // X.InterfaceC52142a8
    public HashMap A8a() {
        return new HashMap();
    }

    @Override // X.InterfaceC52142a8
    public void ARb() {
        C40481sK c40481sK = this.A01;
        if (c40481sK != null) {
            Cursor A00 = A00();
            c40481sK.A01.close();
            c40481sK.A01 = A00;
            c40481sK.A00 = -1;
            c40481sK.moveToPosition(-1);
        }
        this.A06.clear();
        this.A00 = 0;
    }

    @Override // X.InterfaceC52142a8
    public void close() {
        C40481sK c40481sK = this.A01;
        if (c40481sK != null) {
            c40481sK.close();
        }
    }

    @Override // X.InterfaceC52142a8
    public int getCount() {
        C40481sK c40481sK = this.A01;
        if (c40481sK == null) {
            return 0;
        }
        return c40481sK.getCount() - this.A00;
    }

    @Override // X.InterfaceC52142a8
    public boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // X.InterfaceC52142a8
    public void registerContentObserver(ContentObserver contentObserver) {
        C40481sK c40481sK = this.A01;
        if (c40481sK != null) {
            c40481sK.registerContentObserver(contentObserver);
        }
    }

    @Override // X.InterfaceC52142a8
    public void unregisterContentObserver(ContentObserver contentObserver) {
        C40481sK c40481sK = this.A01;
        if (c40481sK != null) {
            c40481sK.unregisterContentObserver(contentObserver);
        }
    }
}
