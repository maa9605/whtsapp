package X;

/* renamed from: X.0oc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15430oc {
    public final C006702y A00 = new C006702y();
    public final C05I A01 = new C05I();

    public final C15140o9 A00(C0TS c0ts, int i) {
        C15410oa c15410oa;
        C15140o9 c15140o9;
        C006702y c006702y = this.A00;
        int A02 = c006702y.A02(c0ts);
        if (A02 >= 0 && (c15410oa = (C15410oa) c006702y.A02[(A02 << 1) + 1]) != null) {
            int i2 = c15410oa.A00;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                c15410oa.A00 = i3;
                if (i == 4) {
                    c15140o9 = c15410oa.A02;
                } else if (i == 8) {
                    c15140o9 = c15410oa.A01;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    c006702y.A05(A02);
                    c15410oa.A00 = 0;
                    c15410oa.A02 = null;
                    c15410oa.A01 = null;
                    C15410oa.A03.A01(c15410oa);
                }
                return c15140o9;
            }
        }
        return null;
    }

    public void A01(C0TS c0ts) {
        C15410oa c15410oa = (C15410oa) this.A00.getOrDefault(c0ts, null);
        if (c15410oa == null) {
            return;
        }
        c15410oa.A00 &= -2;
    }

    public void A02(C0TS c0ts) {
        C05I c05i = this.A01;
        int A00 = c05i.A00() - 1;
        while (true) {
            if (A00 < 0) {
                break;
            } else if (c0ts == c05i.A03(A00)) {
                Object[] objArr = c05i.A03;
                Object obj = objArr[A00];
                Object obj2 = C05I.A04;
                if (obj != obj2) {
                    objArr[A00] = obj2;
                    c05i.A01 = true;
                }
            } else {
                A00--;
            }
        }
        C15410oa c15410oa = (C15410oa) this.A00.remove(c0ts);
        if (c15410oa != null) {
            c15410oa.A00 = 0;
            c15410oa.A02 = null;
            c15410oa.A01 = null;
            C15410oa.A03.A01(c15410oa);
        }
    }

    public void A03(C0TS c0ts, C15140o9 c15140o9) {
        C006702y c006702y = this.A00;
        C15410oa c15410oa = (C15410oa) c006702y.getOrDefault(c0ts, null);
        if (c15410oa == null) {
            c15410oa = C15410oa.A00();
            c006702y.put(c0ts, c15410oa);
        }
        c15410oa.A01 = c15140o9;
        c15410oa.A00 |= 8;
    }
}
