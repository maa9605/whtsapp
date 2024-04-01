package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0nL  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14640nL {
    public final InterfaceC14630nK A01;
    public final C14620nJ A00 = new C14620nJ();
    public final List A02 = new ArrayList();

    public C14640nL(InterfaceC14630nK interfaceC14630nK) {
        this.A01 = interfaceC14630nK;
    }

    public int A00() {
        return ((C1UR) this.A01).A00.getChildCount() - this.A02.size();
    }

    public int A01() {
        return ((C1UR) this.A01).A00.getChildCount();
    }

    public final int A02(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C1UR) this.A01).A00.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C14620nJ c14620nJ = this.A00;
            int A00 = i - (i2 - c14620nJ.A00(i2));
            if (A00 == 0) {
                while (c14620nJ.A06(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += A00;
        }
        return -1;
    }

    public View A03(int i) {
        return ((C1UR) this.A01).A00.getChildAt(A02(i));
    }

    public View A04(int i) {
        return ((C1UR) this.A01).A00.getChildAt(i);
    }

    public void A05(int i) {
        C0TS A01;
        int A02 = A02(i);
        this.A00.A07(A02);
        RecyclerView recyclerView = ((C1UR) this.A01).A00;
        View childAt = recyclerView.getChildAt(A02);
        if (childAt != null && (A01 = RecyclerView.A01(childAt)) != null) {
            if (A01.A0A() && !A01.A0B()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(A01);
                throw new IllegalArgumentException(C000200d.A0C(recyclerView, sb));
            }
            A01.A04(256);
        }
        recyclerView.detachViewFromParent(A02);
    }

    public final void A06(View view) {
        this.A02.add(view);
        C1UR c1ur = (C1UR) this.A01;
        if (c1ur != null) {
            C0TS A01 = RecyclerView.A01(view);
            if (A01 != null) {
                RecyclerView recyclerView = c1ur.A00;
                int i = A01.A04;
                if (i != -1) {
                    A01.A07 = i;
                } else {
                    A01.A07 = A01.A0H.getImportantForAccessibility();
                }
                recyclerView.A0q(A01, 4);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A07(View view) {
        if (this.A02.remove(view)) {
            C1UR c1ur = (C1UR) this.A01;
            if (c1ur != null) {
                C0TS A01 = RecyclerView.A01(view);
                if (A01 != null) {
                    c1ur.A00.A0q(A01, A01.A07);
                    A01.A07 = 0;
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public void A08(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int A02;
        if (i < 0) {
            A02 = ((C1UR) this.A01).A00.getChildCount();
        } else {
            A02 = A02(i);
        }
        this.A00.A05(A02, z);
        if (z) {
            A06(view);
        }
        C1UR c1ur = (C1UR) this.A01;
        if (c1ur != null) {
            C0TS A01 = RecyclerView.A01(view);
            if (A01 != null) {
                if (!A01.A0A() && !A01.A0B()) {
                    StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                    sb.append(A01);
                    throw new IllegalArgumentException(C000200d.A0C(c1ur.A00, sb));
                }
                A01.A00 &= -257;
            }
            c1ur.A00.attachViewToParent(view, A02, layoutParams);
            return;
        }
        throw null;
    }

    public void A09(View view, int i, boolean z) {
        int A02;
        if (i < 0) {
            A02 = ((C1UR) this.A01).A00.getChildCount();
        } else {
            A02 = A02(i);
        }
        this.A00.A05(A02, z);
        if (z) {
            A06(view);
        }
        RecyclerView recyclerView = ((C1UR) this.A01).A00;
        recyclerView.addView(view, A02);
        C0TS A01 = RecyclerView.A01(view);
        AbstractC04890Mh abstractC04890Mh = recyclerView.A0N;
        if (abstractC04890Mh != null && A01 != null) {
            abstractC04890Mh.A05(A01);
        }
        List list = recyclerView.A0a;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((InterfaceC09590eN) recyclerView.A0a.get(size)).AIQ(view);
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.toString());
        sb.append(", hidden list:");
        sb.append(this.A02.size());
        return sb.toString();
    }
}
