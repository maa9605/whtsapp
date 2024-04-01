package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0nj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC14880nj implements Runnable {
    public long A00;
    public long A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public static final ThreadLocal A05 = new ThreadLocal();
    public static Comparator A04 = new Comparator() { // from class: X.0nh
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            C14870ni c14870ni = (C14870ni) obj;
            C14870ni c14870ni2 = (C14870ni) obj2;
            RecyclerView recyclerView = c14870ni.A03;
            if ((recyclerView == null) != (c14870ni2.A03 == null)) {
                if (recyclerView != null) {
                    return -1;
                }
            } else {
                boolean z = c14870ni.A04;
                if (z == c14870ni2.A04) {
                    int i = c14870ni2.A02 - c14870ni.A02;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = c14870ni.A00 - c14870ni2.A00;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                }
            }
            return 1;
        }
    };

    public static final C0TS A00(RecyclerView recyclerView, int i, long j) {
        int A01 = recyclerView.A0K.A01();
        for (int i2 = 0; i2 < A01; i2++) {
            C0TS A012 = RecyclerView.A01(recyclerView.A0K.A04(i2));
            if (A012.A05 == i && !A012.A08()) {
                return null;
            }
        }
        C15230oI c15230oI = recyclerView.A0x;
        try {
            recyclerView.A09++;
            C0TS A013 = c15230oI.A01(i, j);
            if (A013 != null) {
                if ((A013.A00 & 1) != 0 && !A013.A08()) {
                    c15230oI.A05(A013.A0H);
                } else {
                    c15230oI.A0A(A013, false);
                }
            }
            return A013;
        } finally {
            recyclerView.A0t(false);
        }
    }

    public void A01(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C1UF c1uf = recyclerView.A0L;
        c1uf.A01 = i;
        c1uf.A02 = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        WeakReference weakReference;
        RecyclerView recyclerView;
        C14870ni c14870ni;
        try {
            C003601s.A01("RV Prefetch");
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = (RecyclerView) this.A02.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView2.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j) + this.A00;
                    int size2 = this.A02.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = (RecyclerView) this.A02.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.A0L.A01(recyclerView3, false);
                            i2 += recyclerView3.A0L.A00;
                        }
                    }
                    this.A03.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.A02.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C1UF c1uf = recyclerView4.A0L;
                            int abs = Math.abs(c1uf.A02) + Math.abs(c1uf.A01);
                            for (int i6 = 0; i6 < (c1uf.A00 << 1); i6 += 2) {
                                ArrayList arrayList2 = this.A03;
                                if (i4 >= arrayList2.size()) {
                                    c14870ni = new C14870ni();
                                    arrayList2.add(c14870ni);
                                } else {
                                    c14870ni = (C14870ni) arrayList2.get(i4);
                                }
                                int[] iArr = c1uf.A03;
                                int i7 = iArr[i6 + 1];
                                boolean z = false;
                                if (i7 <= abs) {
                                    z = true;
                                }
                                c14870ni.A04 = z;
                                c14870ni.A02 = abs;
                                c14870ni.A00 = i7;
                                c14870ni.A03 = recyclerView4;
                                c14870ni.A01 = iArr[i6];
                                i4++;
                            }
                        }
                    }
                    Collections.sort(this.A03, A04);
                    int i8 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.A03;
                        if (i8 >= arrayList3.size()) {
                            break;
                        }
                        C14870ni c14870ni2 = (C14870ni) arrayList3.get(i8);
                        if (c14870ni2.A03 == null) {
                            break;
                        }
                        C0TS A00 = A00(c14870ni2.A03, c14870ni2.A01, c14870ni2.A04 ? Long.MAX_VALUE : nanos);
                        if (A00 != null && (weakReference = A00.A0D) != null && (A00.A00 & 1) != 0 && !A00.A08() && (recyclerView = (RecyclerView) weakReference.get()) != null) {
                            if (recyclerView.A0e && recyclerView.A0K.A01() != 0) {
                                recyclerView.A0Q();
                            }
                            C1UF c1uf2 = recyclerView.A0L;
                            c1uf2.A01(recyclerView, true);
                            if (c1uf2.A00 != 0) {
                                C003601s.A01("RV Nested Prefetch");
                                C0Y0 c0y0 = recyclerView.A0z;
                                AbstractC04890Mh abstractC04890Mh = recyclerView.A0N;
                                c0y0.A04 = 1;
                                c0y0.A03 = abstractC04890Mh.A0C();
                                c0y0.A09 = false;
                                c0y0.A0E = false;
                                c0y0.A0A = false;
                                for (int i9 = 0; i9 < (c1uf2.A00 << 1); i9 += 2) {
                                    A00(recyclerView, c1uf2.A03[i9], nanos);
                                }
                                C003601s.A00();
                            }
                        }
                        c14870ni2.A04 = false;
                        c14870ni2.A02 = 0;
                        c14870ni2.A00 = 0;
                        c14870ni2.A03 = null;
                        c14870ni2.A01 = 0;
                        i8++;
                    }
                }
            }
        } finally {
            this.A01 = 0L;
            C003601s.A00();
        }
    }
}
