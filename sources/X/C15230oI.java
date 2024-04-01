package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0oI */
/* loaded from: classes.dex */
public final class C15230oI {
    public int A00;
    public int A01;
    public C15220oH A02;
    public ArrayList A03;
    public final ArrayList A04;
    public final ArrayList A05;
    public final List A06;
    public final /* synthetic */ RecyclerView A07;

    public C15230oI(RecyclerView recyclerView) {
        this.A07 = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A03 = null;
        this.A05 = new ArrayList();
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A00 = 2;
        this.A01 = 2;
    }

    public int A00(int i) {
        if (i >= 0) {
            RecyclerView recyclerView = this.A07;
            C0Y0 c0y0 = recyclerView.A0z;
            if (i < c0y0.A00()) {
                return !c0y0.A09 ? i : recyclerView.A0J.A00(i, 0);
            }
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State ");
        sb.append("item count is ");
        RecyclerView recyclerView2 = this.A07;
        sb.append(recyclerView2.A0z.A00());
        throw new IndexOutOfBoundsException(C000200d.A0C(recyclerView2, sb));
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x0071, code lost:
        if (r8.A09() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0075, code lost:
        if (r9.A09 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0077, code lost:
        r8.A04(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x007d, code lost:
        if (r8.A09 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x007f, code lost:
        r5.removeDetachedView(r8.A0H, false);
        r8.A09.A09(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0089, code lost:
        A08(r8);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0177, code lost:
        if ((r0 + r15) >= r22) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0285, code lost:
        if (r19 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02f7, code lost:
        r1 = r8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02fb, code lost:
        if ((r1 & 32) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02fd, code lost:
        r8.A00 = r1 & (-33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0303, code lost:
        r1 = r8.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0305, code lost:
        if (r1 < 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x030d, code lost:
        if (r1 >= r5.A0N.A0C()) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0311, code lost:
        if (r9.A09 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x031d, code lost:
        if (r5.A0N.A0D(r8.A05) == r8.A02) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0321, code lost:
        r12 = r5.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0325, code lost:
        if (r12.A00 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0331, code lost:
        if (r8.A08 != r12.A00(r8.A05)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0333, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x03bd, code lost:
        r12 = r20.A05;
        r11 = r12.size();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x03c4, code lost:
        if (r1 >= r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x03c6, code lost:
        r8 = (X.C0TS) r12.get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x03d0, code lost:
        if (r8.A08() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x03d6, code lost:
        if (r8.A01() != r21) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x03d8, code lost:
        r12.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x03dd, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x03e0, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0456, code lost:
        r0 = new java.lang.StringBuilder("Inconsistency detected. Invalid view holder adapter position");
        r0.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0469, code lost:
        throw new java.lang.IndexOutOfBoundsException(X.C000200d.A0C(r5, r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:324:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C0TS A01(int r21, long r22) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15230oI.A01(int, long):X.0TS");
    }

    public void A02() {
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            A04(size);
        }
        arrayList.clear();
        if (RecyclerView.A1E) {
            C1UF c1uf = this.A07.A0L;
            int[] iArr = c1uf.A03;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1uf.A00 = 0;
        }
    }

    public void A03() {
        C0SV c0sv = this.A07.A0S;
        this.A01 = this.A00 + (c0sv != null ? c0sv.A02 : 0);
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.A01; size--) {
            A04(size);
        }
    }

    public void A04(int i) {
        ArrayList arrayList = this.A05;
        A0A((C0TS) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public void A05(View view) {
        C0TS A01 = RecyclerView.A01(view);
        if (A01.A0A()) {
            this.A07.removeDetachedView(view, false);
        }
        C15230oI c15230oI = A01.A09;
        if (c15230oI != null) {
            c15230oI.A09(A01);
        } else {
            int i = A01.A00;
            if ((i & 32) != 0) {
                A01.A00 = i & (-33);
            }
        }
        A08(A01);
    }

    public void A06(View view) {
        C0TR c0tr;
        C0TS A01 = RecyclerView.A01(view);
        int i = A01.A00;
        if (!((12 & i) != 0) && (i & 2) != 0 && (c0tr = this.A07.A0R) != null && !c0tr.A09(A01, A01.A02())) {
            ArrayList arrayList = this.A03;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.A03 = arrayList;
            }
            A01.A09 = this;
            A01.A0G = true;
            arrayList.add(A01);
            return;
        }
        if (A01.A08() && !A01.A09()) {
            RecyclerView recyclerView = this.A07;
            if (!recyclerView.A0N.A00) {
                throw new IllegalArgumentException(C000200d.A0C(recyclerView, C000200d.A0P("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
        }
        A01.A09 = this;
        A01.A0G = false;
        this.A04.add(A01);
    }

    public final void A07(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A07((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0029, code lost:
        if (r1.hasTransientState() == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A08(X.C0TS r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15230oI.A08(X.0TS):void");
    }

    public void A09(C0TS c0ts) {
        if (c0ts.A0G) {
            this.A03.remove(c0ts);
        } else {
            this.A04.remove(c0ts);
        }
        c0ts.A09 = null;
        c0ts.A0G = false;
        c0ts.A00 &= -33;
    }

    public void A0A(C0TS c0ts, boolean z) {
        RecyclerView.A04(c0ts);
        if ((16384 & c0ts.A00) != 0) {
            c0ts.A05(0, 16384);
            C0AT.A0c(c0ts.A0H, null);
        }
        if (z) {
            RecyclerView recyclerView = this.A07;
            AbstractC04890Mh abstractC04890Mh = recyclerView.A0N;
            if (abstractC04890Mh != null) {
                abstractC04890Mh.A07(c0ts);
            }
            if (recyclerView.A0z != null) {
                recyclerView.A12.A02(c0ts);
            }
        }
        c0ts.A0C = null;
        C15220oH c15220oH = this.A02;
        if (c15220oH == null) {
            c15220oH = new C15220oH();
            this.A02 = c15220oH;
        }
        if (c15220oH != null) {
            int i = c0ts.A02;
            ArrayList arrayList = c15220oH.A00(i).A03;
            if (((C15210oG) c15220oH.A01.get(i)).A00 > arrayList.size()) {
                c0ts.A03();
                arrayList.add(c0ts);
                return;
            }
            return;
        }
        throw null;
    }
}
