package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: X.0SV */
/* loaded from: classes.dex */
public abstract class C0SV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C14640nL A05;
    public AbstractC15270oM A06;
    public RecyclerView A07;
    public C15400oZ A08;
    public C15400oZ A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final InterfaceC15390oY A0G;
    public final InterfaceC15390oY A0H;

    public void A0M(int i, InterfaceC15150oA interfaceC15150oA) {
    }

    public boolean A0Z() {
        return false;
    }

    public int A0c(int i, C15230oI c15230oI, C0Y0 c0y0) {
        return 0;
    }

    public int A0d(int i, C15230oI c15230oI, C0Y0 c0y0) {
        return 0;
    }

    public int A0g(C0Y0 c0y0) {
        return 0;
    }

    public int A0h(C0Y0 c0y0) {
        return 0;
    }

    public int A0i(C0Y0 c0y0) {
        return 0;
    }

    public int A0j(C0Y0 c0y0) {
        return 0;
    }

    public int A0k(C0Y0 c0y0) {
        return 0;
    }

    public int A0l(C0Y0 c0y0) {
        return 0;
    }

    public Parcelable A0m() {
        return null;
    }

    public View A0n(View view, int i, C15230oI c15230oI, C0Y0 c0y0) {
        return null;
    }

    public abstract C15170oC A0o();

    public void A0t(int i) {
    }

    public void A0u(int i) {
    }

    public void A0v(int i, int i2, C0Y0 c0y0, InterfaceC15150oA interfaceC15150oA) {
    }

    public void A0x(Parcelable parcelable) {
    }

    public void A11(C0Y0 c0y0) {
    }

    public void A12(RecyclerView recyclerView) {
    }

    public void A13(RecyclerView recyclerView, int i, int i2) {
    }

    public void A14(RecyclerView recyclerView, int i, int i2) {
    }

    public void A15(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    public boolean A1A() {
        return false;
    }

    public boolean A1B() {
        return false;
    }

    public boolean A1D() {
        return false;
    }

    public boolean A1E(C15170oC c15170oC) {
        return c15170oC != null;
    }

    public C0SV() {
        InterfaceC15390oY interfaceC15390oY = new InterfaceC15390oY() { // from class: X.1UU
            {
                C0SV.this = this;
            }

            @Override // X.InterfaceC15390oY
            public View A8p(int i) {
                return C0SV.this.A0H(i);
            }

            @Override // X.InterfaceC15390oY
            public int A8r(View view) {
                return C0SV.A04(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
            }

            @Override // X.InterfaceC15390oY
            public int A8s(View view) {
                return C0SV.A03(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
            }

            @Override // X.InterfaceC15390oY
            public int ABs() {
                C0SV c0sv = C0SV.this;
                return c0sv.A03 - c0sv.A0E();
            }

            @Override // X.InterfaceC15390oY
            public int ABt() {
                return C0SV.this.A0D();
            }
        };
        this.A0G = interfaceC15390oY;
        InterfaceC15390oY interfaceC15390oY2 = new InterfaceC15390oY() { // from class: X.1UV
            {
                C0SV.this = this;
            }

            @Override // X.InterfaceC15390oY
            public View A8p(int i) {
                return C0SV.this.A0H(i);
            }

            @Override // X.InterfaceC15390oY
            public int A8r(View view) {
                return C0SV.A02(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
            }

            @Override // X.InterfaceC15390oY
            public int A8s(View view) {
                return C0SV.A05(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
            }

            @Override // X.InterfaceC15390oY
            public int ABs() {
                C0SV c0sv = C0SV.this;
                return c0sv.A00 - c0sv.A0C();
            }

            @Override // X.InterfaceC15390oY
            public int ABt() {
                return C0SV.this.A0F();
            }
        };
        this.A0H = interfaceC15390oY2;
        this.A08 = new C15400oZ(interfaceC15390oY);
        this.A09 = new C15400oZ(interfaceC15390oY2);
        this.A0F = false;
        this.A0B = false;
        this.A0A = false;
        this.A0D = true;
        this.A0C = true;
    }

    public static int A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0016, code lost:
        if (r5 == 1073741824) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0029, code lost:
        if (r5 == 1073741824) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1f
            if (r7 >= 0) goto L2f
            if (r7 != r2) goto L18
            if (r5 == r0) goto L2d
            if (r5 == 0) goto L18
            if (r5 == r1) goto L2d
        L18:
            r5 = 0
            r7 = 0
        L1a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L1f:
            if (r7 >= 0) goto L2f
            if (r7 == r2) goto L2d
            if (r7 != r3) goto L18
            if (r5 == r0) goto L2b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L2d
        L2b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L2d:
            r7 = r4
            goto L1a
        L2f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SV.A01(int, int, int, int, boolean):int");
    }

    public static int A02(View view) {
        return view.getBottom() + ((C15170oC) view.getLayoutParams()).A03.bottom;
    }

    public static int A03(View view) {
        return view.getLeft() - ((C15170oC) view.getLayoutParams()).A03.left;
    }

    public static int A04(View view) {
        return view.getRight() + ((C15170oC) view.getLayoutParams()).A03.right;
    }

    public static int A05(View view) {
        return view.getTop() - ((C15170oC) view.getLayoutParams()).A03.top;
    }

    public static int A06(View view) {
        return ((C15170oC) view.getLayoutParams()).A00.A01();
    }

    public static C15160oB A07(Context context, AttributeSet attributeSet, int i, int i2) {
        C15160oB c15160oB = new C15160oB();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14530nA.A07, i, i2);
        c15160oB.A00 = obtainStyledAttributes.getInt(0, 1);
        c15160oB.A01 = obtainStyledAttributes.getInt(9, 1);
        c15160oB.A02 = obtainStyledAttributes.getBoolean(8, false);
        c15160oB.A03 = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c15160oB;
    }

    public static void A08(View view, int i, int i2, int i3, int i4) {
        C15170oC c15170oC = (C15170oC) view.getLayoutParams();
        Rect rect = c15170oC.A03;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c15170oC).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c15170oC).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c15170oC).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c15170oC).bottomMargin);
    }

    public static boolean A09(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i;
            } else {
                return true;
            }
        }
        return false;
    }

    public int A0A() {
        C14640nL c14640nL = this.A05;
        if (c14640nL != null) {
            return c14640nL.A00();
        }
        return 0;
    }

    public int A0B() {
        AbstractC04890Mh abstractC04890Mh;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (abstractC04890Mh = recyclerView.A0N) == null) {
            return 0;
        }
        return abstractC04890Mh.A0C();
    }

    public int A0C() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int A0D() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int A0E() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int A0F() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public View A0G(int i) {
        int A0A = A0A();
        for (int i2 = 0; i2 < A0A; i2++) {
            View A0H = A0H(i2);
            C0TS A01 = RecyclerView.A01(A0H);
            if (A01 != null && A01.A01() == i && !A01.A0B() && (this.A07.A0z.A09 || !A01.A09())) {
                return A0H;
            }
        }
        return null;
    }

    public View A0H(int i) {
        C14640nL c14640nL = this.A05;
        if (c14640nL != null) {
            return ((C1UR) c14640nL.A01).A00.getChildAt(c14640nL.A02(i));
        }
        return null;
    }

    public void A0I() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0J(int i) {
        if (A0H(i) != null) {
            C14640nL c14640nL = this.A05;
            int A02 = c14640nL.A02(i);
            C1UR c1ur = (C1UR) c14640nL.A01;
            View childAt = c1ur.A00.getChildAt(A02);
            if (childAt != null) {
                if (c14640nL.A00.A07(A02)) {
                    c14640nL.A07(childAt);
                }
                c1ur.A00(A02);
            }
        }
    }

    public void A0K(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0 && !RecyclerView.A1D) {
            this.A03 = 0;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 != 0 || RecyclerView.A1D) {
            return;
        }
        this.A00 = 0;
    }

    public void A0L(int i, int i2) {
        int A0A = A0A();
        if (A0A == 0) {
            this.A07.A0b(i, i2);
            return;
        }
        int i3 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        int i4 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < A0A; i7++) {
            View A0H = A0H(i7);
            Rect rect = this.A07.A0t;
            RecyclerView.A03(A0H, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0t.set(i5, i6, i3, i4);
        A0w(this.A07.A0t, i, i2);
    }

    public final void A0N(View view, int i, boolean z) {
        int i2;
        C0TS A01 = RecyclerView.A01(view);
        if (!z && !A01.A09()) {
            this.A07.A12.A01(A01);
        } else {
            C006702y c006702y = this.A07.A12.A00;
            C15410oa c15410oa = (C15410oa) c006702y.getOrDefault(A01, null);
            if (c15410oa == null) {
                c15410oa = C15410oa.A00();
                c006702y.put(A01, c15410oa);
            }
            c15410oa.A00 |= 1;
        }
        C15170oC c15170oC = (C15170oC) view.getLayoutParams();
        int i3 = A01.A00;
        if (!((i3 & 32) != 0) && A01.A09 == null) {
            if (view.getParent() != this.A07) {
                this.A05.A09(view, i, false);
                c15170oC.A01 = true;
                AbstractC15270oM abstractC15270oM = this.A06;
                if (abstractC15270oM != null && abstractC15270oM.A05) {
                    if (abstractC15270oM.A03 != null) {
                        C0TS A012 = RecyclerView.A01(view);
                        if (A012 != null) {
                            i2 = A012.A01();
                        } else {
                            i2 = -1;
                        }
                        if (i2 == abstractC15270oM.A00) {
                            abstractC15270oM.A01 = view;
                        }
                    } else {
                        throw null;
                    }
                }
            } else {
                C14640nL c14640nL = this.A05;
                int indexOfChild = ((C1UR) c14640nL.A01).A00.indexOfChild(view);
                int i4 = -1;
                if (indexOfChild != -1) {
                    C14620nJ c14620nJ = c14640nL.A00;
                    if (!c14620nJ.A06(indexOfChild)) {
                        i4 = indexOfChild - c14620nJ.A00(indexOfChild);
                    }
                }
                if (i == -1) {
                    i = this.A05.A00();
                }
                if (i4 == -1) {
                    StringBuilder A0P = C000200d.A0P("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    A0P.append(this.A07.indexOfChild(view));
                    throw new IllegalStateException(C000200d.A0C(this.A07, A0P));
                } else if (i4 != i) {
                    C0SV c0sv = this.A07.A0S;
                    View A0H = c0sv.A0H(i4);
                    if (A0H != null) {
                        c0sv.A0H(i4);
                        c0sv.A05.A05(i4);
                        ViewGroup.LayoutParams layoutParams = A0H.getLayoutParams();
                        C0TS A013 = RecyclerView.A01(A0H);
                        if (A013.A09()) {
                            C006702y c006702y2 = c0sv.A07.A12.A00;
                            C15410oa c15410oa2 = (C15410oa) c006702y2.getOrDefault(A013, null);
                            if (c15410oa2 == null) {
                                c15410oa2 = C15410oa.A00();
                                c006702y2.put(A013, c15410oa2);
                            }
                            c15410oa2.A00 |= 1;
                        } else {
                            c0sv.A07.A12.A01(A013);
                        }
                        c0sv.A05.A08(A0H, i, layoutParams, A013.A09());
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
                        sb.append(i4);
                        sb.append(c0sv.A07.toString());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        } else {
            C15230oI c15230oI = A01.A09;
            if (c15230oI != null) {
                c15230oI.A09(A01);
            } else {
                A01.A00 = i3 & (-33);
            }
            this.A05.A08(view, i, view.getLayoutParams(), false);
        }
        if (c15170oC.A02) {
            A01.A0H.invalidate();
            c15170oC.A02 = false;
        }
    }

    public void A0O(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0A(view));
        }
    }

    public void A0P(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C15170oC) view.getLayoutParams()).A03;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.A07 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.A07.A0v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void A0Q(View view, C08420bS c08420bS) {
        C0TS A01 = RecyclerView.A01(view);
        if (A01 == null || A01.A09()) {
            return;
        }
        C14640nL c14640nL = this.A05;
        if (c14640nL.A02.contains(A01.A0H)) {
            return;
        }
        RecyclerView recyclerView = this.A07;
        A10(recyclerView.A0x, recyclerView.A0z, view, c08420bS);
    }

    public void A0R(View view, C15230oI c15230oI) {
        C14640nL c14640nL = this.A05;
        int indexOfChild = ((C1UR) c14640nL.A01).A00.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (c14640nL.A00.A07(indexOfChild)) {
                c14640nL.A07(view);
            }
            ((C1UR) c14640nL.A01).A00(indexOfChild);
        }
        c15230oI.A05(view);
    }

    public void A0S(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        AbstractC04890Mh abstractC04890Mh = this.A07.A0N;
        if (abstractC04890Mh != null) {
            accessibilityEvent.setItemCount(abstractC04890Mh.A0C());
        }
    }

    public void A0T(C15230oI c15230oI) {
        int A0A = A0A();
        while (true) {
            A0A--;
            if (A0A < 0) {
                return;
            }
            View A0H = A0H(A0A);
            C0TS A01 = RecyclerView.A01(A0H);
            if (!A01.A0B()) {
                if (A01.A08() && !A01.A09() && !this.A07.A0N.A00) {
                    A0J(A0A);
                    c15230oI.A08(A01);
                } else {
                    A0H(A0A);
                    this.A05.A05(A0A);
                    c15230oI.A06(A0H);
                    this.A07.A12.A01(A01);
                }
            }
        }
    }

    public void A0U(C15230oI c15230oI) {
        for (int A0A = A0A() - 1; A0A >= 0; A0A--) {
            if (!RecyclerView.A01(A0H(A0A)).A0B()) {
                View A0H = A0H(A0A);
                A0J(A0A);
                c15230oI.A05(A0H);
            }
        }
    }

    public void A0V(C15230oI c15230oI) {
        ArrayList arrayList = c15230oI.A04;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((C0TS) arrayList.get(i)).A0H;
            C0TS A01 = RecyclerView.A01(view);
            if (!A01.A0B()) {
                A01.A07(false);
                if (A01.A0A()) {
                    this.A07.removeDetachedView(view, false);
                }
                C0TR c0tr = this.A07.A0R;
                if (c0tr != null) {
                    c0tr.A07(A01);
                }
                A01.A07(true);
                C0TS A012 = RecyclerView.A01(view);
                A012.A09 = null;
                A012.A0G = false;
                A012.A00 &= -33;
                c15230oI.A08(A012);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = c15230oI.A03;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0W(AbstractC15270oM abstractC15270oM) {
        AbstractC15270oM abstractC15270oM2 = this.A06;
        if (abstractC15270oM2 != null && abstractC15270oM != abstractC15270oM2 && abstractC15270oM2.A05) {
            abstractC15270oM2.A01();
        }
        this.A06 = abstractC15270oM;
        RecyclerView recyclerView = this.A07;
        if (abstractC15270oM.A06) {
            StringBuilder A0P = C000200d.A0P("An instance of ");
            String simpleName = abstractC15270oM.getClass().getSimpleName();
            A0P.append(simpleName);
            A0P.append(" was started ");
            A0P.append("more than once. Each instance of");
            A0P.append(simpleName);
            A0P.append(" ");
            A0P.append("is intended to only be used once. You should create a new instance for ");
            A0P.append("each use.");
            Log.w("RecyclerView", A0P.toString());
        }
        abstractC15270oM.A03 = recyclerView;
        abstractC15270oM.A02 = this;
        int i = abstractC15270oM.A00;
        if (i != -1) {
            recyclerView.A0z.A07 = i;
            abstractC15270oM.A05 = true;
            abstractC15270oM.A04 = true;
            abstractC15270oM.A01 = recyclerView.A0S.A0G(i);
            abstractC15270oM.A03.A10.A01();
            abstractC15270oM.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void A0X(RecyclerView recyclerView) {
        A0K(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public boolean A0Y() {
        RecyclerView recyclerView = this.A07;
        return recyclerView != null && recyclerView.A0d;
    }

    public boolean A0a(View view, int i, int i2, C15170oC c15170oC) {
        return (!view.isLayoutRequested() && A09(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c15170oC).width) && A09(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c15170oC).height)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
        if ((r1.bottom - r5) > r7) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0b(androidx.recyclerview.widget.RecyclerView r12, android.view.View r13, android.graphics.Rect r14, boolean r15, boolean r16) {
        /*
            r11 = this;
            r0 = 2
            int[] r9 = new int[r0]
            int r5 = r11.A0D()
            int r4 = r11.A0F()
            int r2 = r11.A03
            int r0 = r11.A0E()
            int r2 = r2 - r0
            int r1 = r11.A00
            int r0 = r11.A0C()
            int r1 = r1 - r0
            int r8 = r13.getLeft()
            int r0 = r14.left
            int r8 = r8 + r0
            int r0 = r13.getScrollX()
            int r8 = r8 - r0
            int r7 = r13.getTop()
            int r0 = r14.top
            int r7 = r7 + r0
            int r0 = r13.getScrollY()
            int r7 = r7 - r0
            int r3 = r14.width()
            int r3 = r3 + r8
            int r0 = r14.height()
            int r0 = r0 + r7
            int r8 = r8 - r5
            r6 = 0
            int r10 = java.lang.Math.min(r6, r8)
            int r7 = r7 - r4
            int r5 = java.lang.Math.min(r6, r7)
            int r3 = r3 - r2
            int r2 = java.lang.Math.max(r6, r3)
            int r0 = r0 - r1
            int r1 = java.lang.Math.max(r6, r0)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            int r0 = X.C0AT.A05(r0)
            r4 = 1
            if (r0 != r4) goto Laf
            if (r2 != 0) goto L5f
            int r2 = java.lang.Math.max(r10, r3)
        L5f:
            if (r5 != 0) goto L65
            int r5 = java.lang.Math.min(r7, r1)
        L65:
            r9[r6] = r2
            r9[r4] = r5
            r3 = r9[r6]
            if (r16 == 0) goto La5
            android.view.View r10 = r12.getFocusedChild()
            if (r10 == 0) goto La4
            int r8 = r11.A0D()
            int r7 = r11.A0F()
            int r9 = r11.A03
            int r0 = r11.A0E()
            int r9 = r9 - r0
            int r2 = r11.A00
            int r0 = r11.A0C()
            int r2 = r2 - r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A07
            android.graphics.Rect r1 = r0.A0t
            androidx.recyclerview.widget.RecyclerView.A03(r10, r1)
            int r0 = r1.left
            int r0 = r0 - r3
            if (r0 >= r9) goto La4
            int r0 = r1.right
            int r0 = r0 - r3
            if (r0 <= r8) goto La4
            int r0 = r1.top
            int r0 = r0 - r5
            if (r0 >= r2) goto La4
            int r0 = r1.bottom
            int r0 = r0 - r5
            if (r0 > r7) goto La5
        La4:
            return r6
        La5:
            if (r3 != 0) goto La9
            if (r5 == 0) goto La4
        La9:
            if (r15 == 0) goto Lb7
            r12.scrollBy(r3, r5)
            return r4
        Laf:
            if (r10 != 0) goto Lb5
            int r10 = java.lang.Math.min(r8, r2)
        Lb5:
            r2 = r10
            goto L5f
        Lb7:
            r12.A0d(r3, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SV.A0b(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public int A0e(C15230oI c15230oI, C0Y0 c0y0) {
        AbstractC04890Mh abstractC04890Mh;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (abstractC04890Mh = recyclerView.A0N) == null || !A1A()) {
            return 1;
        }
        return abstractC04890Mh.A0C();
    }

    public int A0f(C15230oI c15230oI, C0Y0 c0y0) {
        AbstractC04890Mh abstractC04890Mh;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (abstractC04890Mh = recyclerView.A0N) == null || !A1B()) {
            return 1;
        }
        return abstractC04890Mh.A0C();
    }

    public C15170oC A0p(Context context, AttributeSet attributeSet) {
        return new C15170oC(context, attributeSet);
    }

    public C15170oC A0q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C15170oC) {
            return new C15170oC((C15170oC) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C15170oC((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C15170oC(layoutParams);
    }

    public void A0r(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A00 = recyclerView.A0K.A00();
            for (int i2 = 0; i2 < A00; i2++) {
                recyclerView.A0K.A03(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A0s(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A00 = recyclerView.A0K.A00();
            for (int i2 = 0; i2 < A00; i2++) {
                recyclerView.A0K.A03(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A0w(Rect rect, int i, int i2) {
        int width = rect.width();
        int A0E = A0E() + A0D() + width;
        int A0C = A0C() + A0F() + rect.height();
        this.A07.setMeasuredDimension(A00(i, A0E, this.A07.getMinimumWidth()), A00(i2, A0C, this.A07.getMinimumHeight()));
    }

    public void A0y(AccessibilityEvent accessibilityEvent) {
        A0S(accessibilityEvent);
    }

    public void A0z(C15230oI c15230oI, C0Y0 c0y0) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void A10(C15230oI c15230oI, C0Y0 c0y0, View view, C08420bS c08420bS) {
        c08420bS.A0A(C13240kp.A00(A1B() ? A06(view) : 0, 1, A1A() ? A06(view) : 0, 1, false, false));
    }

    public void A16(RecyclerView recyclerView, int i, int i2, Object obj) {
    }

    public void A17(RecyclerView recyclerView, C15230oI c15230oI) {
    }

    public void A18(RecyclerView recyclerView, C0Y0 c0y0, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void A19(String str) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.A0s(str);
        }
    }

    public boolean A1C() {
        return this.A0A;
    }
}
