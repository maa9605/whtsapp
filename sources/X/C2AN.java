package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2AN  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2AN {
    public int A00;
    public C2BV A01;
    public final Comparator A02 = new Comparator() { // from class: X.2wI
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C2BY) obj2).AE0(), ((C2BY) obj).AE0());
        }
    };
    public volatile List A03;

    public C2AN(C2BV c2bv, int i) {
        this.A01 = c2bv;
        this.A00 = i;
    }

    public int A00() {
        int min;
        A07();
        synchronized (this) {
            min = Math.min(this.A00, this.A03.size());
        }
        return min;
    }

    public Object A01(int i) {
        Object AAN;
        A07();
        synchronized (this) {
            AAN = ((C2BY) this.A03.get(i)).AAN();
        }
        return AAN;
    }

    public List A02() {
        List A06;
        A07();
        synchronized (this) {
            A06 = A06(this.A03.size());
        }
        return A06;
    }

    public Map A03() {
        HashMap hashMap;
        A07();
        synchronized (this) {
            hashMap = new HashMap();
            for (C2BY c2by : this.A03) {
                hashMap.put(c2by.AAN(), Float.valueOf(c2by.AE0()));
            }
        }
        return hashMap;
    }

    public final void A04() {
        if (this.A03 != null) {
            for (int size = this.A03.size() - 1; size >= this.A00; size--) {
                if (((C2BY) this.A03.get(size)).AE0() < 0.1f) {
                    A08(size);
                }
            }
            return;
        }
        throw null;
    }

    public void A05(Object obj) {
        A07();
        synchronized (this) {
            for (int size = this.A03.size() - 1; size >= 0; size--) {
                if (((C2BY) this.A03.get(size)).A6K(obj)) {
                    A08(size);
                }
            }
            this.A01.AQl(this.A03);
        }
    }

    public List A06(int i) {
        A07();
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i2 = 0; i2 < Math.min(i, this.A03.size()); i2++) {
                arrayList.add(((C2BY) this.A03.get(i2)).AAN());
            }
        }
        return arrayList;
    }

    public void A07() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    this.A03 = Collections.synchronizedList(this.A01.AEi());
                }
            }
        }
    }

    public void A08(int i) {
        A07();
        synchronized (this) {
            this.A03.remove(i);
        }
    }

    public void A09(C2BY c2by) {
        A07();
        synchronized (this) {
            this.A03.add(c2by);
        }
    }

    public boolean A0A(Object obj) {
        boolean z;
        A07();
        synchronized (this) {
            z = false;
            for (C2BY c2by : this.A03) {
                float AE0 = c2by.AE0();
                if (!c2by.A6K(obj)) {
                    c2by.AUB(AE0 * 0.9f);
                } else {
                    c2by.AUB(AE0 + 1.0f);
                    z = true;
                }
            }
            if (!z) {
                A09(this.A01.A6l(obj, 1.0f));
            }
            Collections.sort(this.A03, this.A02);
            A04();
            this.A01.AQl(this.A03);
        }
        return z;
    }
}
