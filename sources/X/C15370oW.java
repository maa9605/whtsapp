package X;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: X.0oW */
/* loaded from: classes.dex */
public class C15370oW {
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;
    public ArrayList A03 = new ArrayList();
    public int A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A02 = 0;

    public C15370oW(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i;
    }

    public int A00() {
        if (this.A05.A0F) {
            return A04(this.A03.size() - 1, -1);
        }
        return A04(0, this.A03.size());
    }

    public int A01() {
        if (this.A05.A0F) {
            return A04(0, this.A03.size());
        }
        return A04(this.A03.size() - 1, -1);
    }

    public int A02(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A06();
        return this.A00;
    }

    public int A03(int i) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A07();
        return this.A01;
    }

    public int A04(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        int A06 = staggeredGridLayoutManager.A07.A06();
        int A02 = staggeredGridLayoutManager.A07.A02();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.A03.get(i);
            int A0B = staggeredGridLayoutManager.A07.A0B(view);
            int A08 = staggeredGridLayoutManager.A07.A08(view);
            boolean z = A0B <= A02;
            boolean z2 = A08 >= A06;
            if (z && z2 && (A0B < A06 || A08 > A02)) {
                return C0SV.A06(view);
            }
            i += i3;
        }
        return -1;
    }

    public View A05(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.A03.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) this.A03.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if ((staggeredGridLayoutManager.A0F && C0SV.A06(view2) <= i) || ((!staggeredGridLayoutManager.A0F && C0SV.A06(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.A03.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) this.A03.get(size2);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if (staggeredGridLayoutManager2.A0F && C0SV.A06(view3) >= i) {
                    break;
                } else if (!staggeredGridLayoutManager2.A0F && C0SV.A06(view3) <= i) {
                    return view;
                } else {
                    if (!view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
        }
        return view;
    }

    public void A06() {
        C15330oS A00;
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C28851Uc c28851Uc = (C28851Uc) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A00 = staggeredGridLayoutManager.A07.A08(view);
        if (c28851Uc.A01 && (A00 = staggeredGridLayoutManager.A09.A00(((C15170oC) c28851Uc).A00.A01())) != null && A00.A00 == 1) {
            int i = this.A00;
            int i2 = this.A04;
            int[] iArr = A00.A03;
            this.A00 = i + (iArr == null ? 0 : iArr[i2]);
        }
    }

    public void A07() {
        C15330oS A00;
        View view = (View) this.A03.get(0);
        C28851Uc c28851Uc = (C28851Uc) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A01 = staggeredGridLayoutManager.A07.A0B(view);
        if (c28851Uc.A01 && (A00 = staggeredGridLayoutManager.A09.A00(((C15170oC) c28851Uc).A00.A01())) != null && A00.A00 == -1) {
            int i = this.A01;
            int i2 = this.A04;
            int[] iArr = A00.A03;
            this.A01 = i - (iArr != null ? iArr[i2] : 0);
        }
    }

    public void A08() {
        this.A03.clear();
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A02 = 0;
    }

    public void A09() {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C28851Uc c28851Uc = (C28851Uc) view.getLayoutParams();
        c28851Uc.A00 = null;
        if (((C15170oC) c28851Uc).A00.A09() || c28851Uc.A00()) {
            this.A02 -= this.A05.A07.A09(view);
        }
        if (size == 1) {
            this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public void A0A() {
        View view = (View) this.A03.remove(0);
        C28851Uc c28851Uc = (C28851Uc) view.getLayoutParams();
        c28851Uc.A00 = null;
        if (this.A03.size() == 0) {
            this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (((C15170oC) c28851Uc).A00.A09() || c28851Uc.A00()) {
            this.A02 -= this.A05.A07.A09(view);
        }
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public void A0B(View view) {
        C28851Uc c28851Uc = (C28851Uc) view.getLayoutParams();
        c28851Uc.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(view);
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        if (arrayList.size() == 1) {
            this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (((C15170oC) c28851Uc).A00.A09() || c28851Uc.A00()) {
            this.A02 = this.A05.A07.A09(view) + this.A02;
        }
    }

    public void A0C(View view) {
        C28851Uc c28851Uc = (C28851Uc) view.getLayoutParams();
        c28851Uc.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        if (arrayList.size() == 1) {
            this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (((C15170oC) c28851Uc).A00.A09() || c28851Uc.A00()) {
            this.A02 = this.A05.A07.A09(view) + this.A02;
        }
    }
}
