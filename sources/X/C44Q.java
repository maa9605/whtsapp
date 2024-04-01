package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.44Q  reason: invalid class name */
/* loaded from: classes3.dex */
public class C44Q {
    public C42C A00;
    public C42C A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;

    public C44Q() {
        this.A03 = 0;
        this.A02 = 0;
        this.A04 = 0;
        this.A05 = true;
    }

    public C44Q(int i, int i2, int i3) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A05 = false;
    }

    public static List A00(List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        C42C c42c = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C42C c42c2 = (C42C) list.get(i2);
            if (c42c2.A01 * c42c2.A00 <= i) {
                arrayList.add(c42c2);
            }
            if (c42c == null || c42c2.A01 * c42c2.A00 < c42c.A01 * c42c.A00) {
                c42c = c42c2;
            }
        }
        if (arrayList.isEmpty() && c42c != null) {
            arrayList.add(c42c);
        }
        return arrayList;
    }

    public final C42D A01(List list, List list2, List list3, int i, int i2) {
        int i3;
        int i4;
        int i5;
        HashSet hashSet;
        int i6;
        C42C c42c;
        int i7;
        List<C42C> list4 = list;
        List list5 = list2;
        C42C c42c2 = new C42C(Math.max(i, i2), Math.min(i, i2));
        int i8 = this.A03;
        if (i8 > 0) {
            float f = i8;
            i4 = (int) (0.8f * f);
            i3 = (int) (f * 1.2f);
        } else {
            i3 = 3145728;
            i4 = 0;
        }
        List A00 = A00(list3, i3);
        if (list != null) {
            list4 = A00(list4, 10485760);
        }
        if (list2 != null) {
            list5 = A00(list5, 2097152);
        }
        if (list4 == null || ((i5 = this.A02) <= 0 && (i5 = c42c2.A01 * c42c2.A00) <= 0)) {
            i5 = 0;
        } else {
            Iterator it = list4.iterator();
            int i9 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = i9;
                    break;
                }
                C42C A0k = C07K.A0k((C42C) it.next(), c42c2);
                int i10 = A0k.A01 * A0k.A00;
                if (i10 > i9) {
                    if (i10 >= i5) {
                        break;
                    }
                    i9 = i10;
                }
            }
        }
        int i11 = this.A04;
        boolean z = this.A05;
        if (i4 != 0) {
            c42c2 = C07K.A0j(i4, C07K.A01(c42c2.A01, c42c2.A00));
        }
        C42C c42c3 = null;
        if (i5 > 0 && list4 != null) {
            i6 = (int) (i5 * 0.75d);
            if (z) {
                hashSet = new HashSet();
                for (C42C c42c4 : list4) {
                    C42C A0k2 = C07K.A0k(c42c4, c42c2);
                    if (A0k2.A01 * A0k2.A00 >= i6) {
                        hashSet.add(Double.valueOf(C07K.A01(c42c4.A01, c42c4.A00)));
                    }
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
            i6 = 0;
        }
        double d = 0.0d;
        C42C A0l = C07K.A0l(A00, c42c2, 0.0d, hashSet);
        if (A0l == null && (A0l = C07K.A0l(A00, c42c2, 0.0d, null)) == null) {
            throw new RuntimeException("Could not calculate preview size.");
        }
        double A01 = C07K.A01(A0l.A01, A0l.A00);
        if (list4 != null) {
            if (i5 > 0) {
                c42c2 = C07K.A0j(i6, A01);
            }
            c42c = C07K.A0l(list4, c42c2, A01, null);
        } else {
            c42c = null;
        }
        if (list5 != null) {
            if (i11 == 0) {
                c42c3 = C07K.A0l(list5, A0l, A01, null);
            } else if (A01 != 0.0d) {
                int i12 = 0;
                while (i7 < list5.size()) {
                    C42C c42c5 = (C42C) list5.get(i7);
                    int i13 = c42c5.A01;
                    int i14 = c42c5.A00;
                    int i15 = i13 * i14;
                    double A012 = C07K.A01(i13, i14);
                    int abs = Math.abs(i11 - i15);
                    double abs2 = Math.abs(A01 - A012);
                    if (c42c3 != null) {
                        double d2 = i15;
                        i7 = ((double) (((int) (abs2 * d2)) + abs)) >= ((double) (((int) (d2 * d)) + i12)) ? i7 + 1 : 0;
                    }
                    c42c3 = c42c5;
                    d = abs2;
                    i12 = abs;
                }
            }
        }
        this.A00 = c42c;
        this.A01 = c42c3;
        return new C42D(A0l, c42c, c42c3);
    }
}
