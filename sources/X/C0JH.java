package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.0JH  reason: invalid class name */
/* loaded from: classes.dex */
public class C0JH {
    public final C06F A00;

    public int A00(Object obj, Object obj2) {
        throw null;
    }

    public void A02() {
        throw null;
    }

    public void A06(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public C0JH(final int i) {
        this.A00 = new C06F(i) { // from class: X.1yj
            @Override // X.C06F
            public int A02(Object obj, Object obj2) {
                return C0JH.this.A00(obj, ((C44241yk) obj2).A01);
            }

            @Override // X.C06F
            public void A09(boolean z, Object obj, Object obj2, Object obj3) {
                C44241yk c44241yk = (C44241yk) obj3;
                C0JH.this.A06(z, obj, ((C44241yk) obj2).A01, c44241yk != null ? c44241yk.A01 : null);
            }
        };
    }

    public Object A01(Object obj) {
        C44241yk c44241yk = (C44241yk) this.A00.A04(obj);
        if (c44241yk == null) {
            return null;
        }
        A02();
        c44241yk.A00 = System.currentTimeMillis();
        return c44241yk.A01;
    }

    public void A03(int i) {
        long currentTimeMillis = System.currentTimeMillis() - i;
        C06F c06f = this.A00;
        for (Map.Entry entry : ((AbstractMap) c06f.A06()).entrySet()) {
            synchronized (c06f) {
                if (((C44241yk) entry.getValue()).A00 >= currentTimeMillis) {
                    return;
                }
                A04(entry.getKey());
                A00(entry.getKey(), ((C44241yk) entry.getValue()).A01);
            }
        }
    }

    public void A04(Object obj) {
        if (this.A00.A05(obj) != null) {
        }
    }

    public void A05(Object obj, Object obj2) {
        this.A00.A08(obj, new C44241yk(obj2, System.currentTimeMillis()));
        A02();
    }
}
