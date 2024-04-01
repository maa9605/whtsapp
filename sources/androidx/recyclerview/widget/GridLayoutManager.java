package androidx.recyclerview.widget;

import X.AbstractC14890nk;
import X.C000200d;
import X.C0SV;
import X.C0Y0;
import X.C14990nu;
import X.C15000nv;
import X.C15010nw;
import X.C15170oC;
import X.C15230oI;
import X.C1UF;
import X.C1UH;
import X.InterfaceC15150oA;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public int A00;
    public AbstractC14890nk A01;
    public boolean A02;
    public int[] A03;
    public View[] A04;
    public final Rect A05;
    public final SparseIntArray A06;
    public final SparseIntArray A07;

    public GridLayoutManager(int i) {
        super(1);
        this.A02 = false;
        this.A00 = -1;
        this.A07 = new SparseIntArray();
        this.A06 = new SparseIntArray();
        this.A01 = new AbstractC14890nk() { // from class: X.1UG
            @Override // X.AbstractC14890nk
            public int A00(int i2) {
                return 1;
            }

            @Override // X.AbstractC14890nk
            public int A01(int i2, int i3) {
                return i2 % i3;
            }
        };
        this.A05 = new Rect();
        A1q(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = false;
        this.A00 = -1;
        this.A07 = new SparseIntArray();
        this.A06 = new SparseIntArray();
        this.A01 = new AbstractC14890nk() { // from class: X.1UG
            @Override // X.AbstractC14890nk
            public int A00(int i22) {
                return 1;
            }

            @Override // X.AbstractC14890nk
            public int A01(int i22, int i3) {
                return i22 % i3;
            }
        };
        this.A05 = new Rect();
        A1q(C0SV.A07(context, attributeSet, i, i2).A01);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public int A0c(int i, C15230oI c15230oI, C0Y0 c0y0) {
        A1p();
        A1o();
        if (((LinearLayoutManager) this).A01 == 1) {
            return 0;
        }
        return A1K(i, c15230oI, c0y0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public int A0d(int i, C15230oI c15230oI, C0Y0 c0y0) {
        A1p();
        A1o();
        if (((LinearLayoutManager) this).A01 == 0) {
            return 0;
        }
        return A1K(i, c15230oI, c0y0);
    }

    @Override // X.C0SV
    public int A0e(C15230oI c15230oI, C0Y0 c0y0) {
        if (((LinearLayoutManager) this).A01 == 1) {
            return this.A00;
        }
        int A00 = c0y0.A00();
        if (A00 < 1) {
            return 0;
        }
        return A1l(c15230oI, c0y0, A00 - 1) + 1;
    }

    @Override // X.C0SV
    public int A0f(C15230oI c15230oI, C0Y0 c0y0) {
        if (((LinearLayoutManager) this).A01 == 0) {
            return this.A00;
        }
        int A00 = c0y0.A00();
        if (A00 < 1) {
            return 0;
        }
        return A1l(c15230oI, c0y0, A00 - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0061, code lost:
        if (A1k() == false) goto L81;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A0n(android.view.View r24, int r25, X.C15230oI r26, X.C0Y0 r27) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A0n(android.view.View, int, X.0oI, X.0Y0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public C15170oC A0o() {
        if (((LinearLayoutManager) this).A01 == 0) {
            return new C1UH(-2, -1);
        }
        return new C1UH(-1, -2);
    }

    @Override // X.C0SV
    public C15170oC A0p(Context context, AttributeSet attributeSet) {
        return new C1UH(context, attributeSet);
    }

    @Override // X.C0SV
    public C15170oC A0q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1UH((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1UH(layoutParams);
    }

    @Override // X.C0SV
    public void A0w(Rect rect, int i, int i2) {
        int A00;
        int A002;
        if (this.A03 == null) {
            super.A0w(rect, i, i2);
        }
        int A0E = A0E() + A0D();
        int A0C = A0C() + A0F();
        if (((LinearLayoutManager) this).A01 == 1) {
            A002 = C0SV.A00(i2, rect.height() + A0C, ((C0SV) this).A07.getMinimumHeight());
            int[] iArr = this.A03;
            A00 = C0SV.A00(i, iArr[iArr.length - 1] + A0E, ((C0SV) this).A07.getMinimumWidth());
        } else {
            A00 = C0SV.A00(i, rect.width() + A0E, ((C0SV) this).A07.getMinimumWidth());
            int[] iArr2 = this.A03;
            A002 = C0SV.A00(i2, iArr2[iArr2.length - 1] + A0C, ((C0SV) this).A07.getMinimumHeight());
        }
        ((C0SV) this).A07.setMeasuredDimension(A00, A002);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public void A0z(C15230oI c15230oI, C0Y0 c0y0) {
        if (c0y0.A09) {
            int A0A = A0A();
            for (int i = 0; i < A0A; i++) {
                C1UH c1uh = (C1UH) A0H(i).getLayoutParams();
                int A01 = ((C15170oC) c1uh).A00.A01();
                this.A07.put(A01, c1uh.A01);
                this.A06.put(A01, c1uh.A00);
            }
        }
        super.A0z(c15230oI, c0y0);
        this.A07.clear();
        this.A06.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0027, code lost:
        if (r4 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003d, code lost:
        if (r8 != r0) goto L21;
     */
    @Override // X.C0SV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A10(X.C15230oI r12, X.C0Y0 r13, android.view.View r14, X.C08420bS r15) {
        /*
            r11 = this;
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            boolean r0 = r2 instanceof X.C1UH
            if (r0 != 0) goto Lc
            super.A0Q(r14, r15)
            return
        Lc:
            X.1UH r2 = (X.C1UH) r2
            X.0TS r0 = r2.A00
            int r0 = r0.A01()
            int r5 = r11.A1l(r12, r13, r0)
            int r0 = r11.A01
            r1 = 1
            if (r0 != 0) goto L33
            int r3 = r2.A00
            int r4 = r2.A01
            r6 = 1
            int r0 = r11.A00
            if (r0 <= r1) goto L29
            r7 = 1
            if (r4 == r0) goto L2a
        L29:
            r7 = 0
        L2a:
            r8 = 0
            X.0kp r0 = X.C13240kp.A00(r3, r4, r5, r6, r7, r8)
            r15.A0A(r0)
            return
        L33:
            r6 = 1
            int r7 = r2.A00
            int r8 = r2.A01
            int r0 = r11.A00
            if (r0 <= r1) goto L3f
            r9 = 1
            if (r8 == r0) goto L40
        L3f:
            r9 = 0
        L40:
            r10 = 0
            X.0kp r0 = X.C13240kp.A00(r5, r6, r7, r8, r9, r10)
            r15.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A10(X.0oI, X.0Y0, android.view.View, X.0bS):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public void A11(C0Y0 c0y0) {
        ((LinearLayoutManager) this).A05 = null;
        ((LinearLayoutManager) this).A02 = -1;
        ((LinearLayoutManager) this).A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        ((LinearLayoutManager) this).A0C.A01();
        this.A02 = false;
    }

    @Override // X.C0SV
    public void A12(RecyclerView recyclerView) {
        this.A01.A00.clear();
    }

    @Override // X.C0SV
    public void A13(RecyclerView recyclerView, int i, int i2) {
        this.A01.A00.clear();
    }

    @Override // X.C0SV
    public void A14(RecyclerView recyclerView, int i, int i2) {
        this.A01.A00.clear();
    }

    @Override // X.C0SV
    public void A15(RecyclerView recyclerView, int i, int i2, int i3) {
        this.A01.A00.clear();
    }

    @Override // X.C0SV
    public void A16(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.A01.A00.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0SV
    public boolean A1D() {
        return ((LinearLayoutManager) this).A05 == null && !this.A02;
    }

    @Override // X.C0SV
    public boolean A1E(C15170oC c15170oC) {
        return c15170oC instanceof C1UH;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View A1T(C15230oI c15230oI, C0Y0 c0y0, int i, int i2, int i3) {
        A1W();
        int A06 = ((LinearLayoutManager) this).A06.A06();
        int A02 = ((LinearLayoutManager) this).A06.A02();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0H = A0H(i);
            int A062 = C0SV.A06(A0H);
            if (A062 >= 0 && A062 < i3 && A1m(c15230oI, c0y0, A062) == 0) {
                if (((C15170oC) A0H.getLayoutParams()).A00.A09()) {
                    if (view2 == null) {
                        view2 = A0H;
                    }
                } else if (((LinearLayoutManager) this).A06.A0B(A0H) < A02 && ((LinearLayoutManager) this).A06.A08(A0H) >= A06) {
                    return A0H;
                } else {
                    if (view == null) {
                        view = A0H;
                    }
                }
            }
            i += i4;
        }
        return view == null ? view2 : view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1f(C15230oI c15230oI, C0Y0 c0y0, C14990nu c14990nu, int i) {
        A1p();
        if (c0y0.A00() > 0 && !c0y0.A09) {
            boolean z = i == 1;
            int A1m = A1m(c15230oI, c0y0, c14990nu.A01);
            if (!z) {
                int A00 = c0y0.A00() - 1;
                int i2 = c14990nu.A01;
                while (i2 < A00) {
                    int i3 = i2 + 1;
                    int A1m2 = A1m(c15230oI, c0y0, i3);
                    if (A1m2 <= A1m) {
                        break;
                    }
                    i2 = i3;
                    A1m = A1m2;
                }
                c14990nu.A01 = i2;
            } else {
                while (A1m > 0) {
                    int i4 = c14990nu.A01;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    c14990nu.A01 = i5;
                    A1m = A1m(c15230oI, c0y0, i5);
                }
            }
        }
        A1o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1g(C15230oI c15230oI, C0Y0 c0y0, C15010nw c15010nw, C15000nv c15000nv) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        int A01;
        int i7;
        View A00;
        int A05 = ((LinearLayoutManager) this).A06.A05();
        ?? r13 = 0;
        boolean z = A05 != 1073741824;
        if (A0A() > 0) {
            i = this.A03[this.A00];
        } else {
            i = 0;
        }
        if (z) {
            A1p();
        }
        boolean z2 = c15010nw.A03 == 1;
        int i8 = this.A00;
        if (!z2) {
            i8 = A1m(c15230oI, c0y0, c15010nw.A01) + A1n(c15230oI, c0y0, c15010nw.A01);
        }
        int i9 = 0;
        while (i9 < this.A00 && (i7 = c15010nw.A01) >= 0 && i7 < c0y0.A00() && i8 > 0) {
            int A1n = A1n(c15230oI, c0y0, i7);
            int i10 = this.A00;
            if (A1n > i10) {
                throw new IllegalArgumentException(C000200d.A0K(C000200d.A0R("Item at position ", i7, " requires ", A1n, " spans but GridLayoutManager has only "), i10, " spans."));
            }
            i8 -= A1n;
            if (i8 < 0 || (A00 = c15010nw.A00(c15230oI)) == null) {
                break;
            }
            this.A04[i9] = A00;
            i9++;
        }
        if (i9 == 0) {
            c15000nv.A01 = true;
            return;
        }
        float f = 0.0f;
        int i11 = 0;
        int i12 = -1;
        int i13 = i9 - 1;
        int i14 = -1;
        if (z2) {
            i12 = i9;
            i14 = 1;
            View view = this.A04[0];
            C1UH c1uh = (C1UH) view.getLayoutParams();
            int A1n2 = A1n(c15230oI, c0y0, C0SV.A06(view));
            c1uh.A01 = A1n2;
            c1uh.A00 = 0;
            i11 = 0 + A1n2;
            i13 = 0 + 1;
        }
        while (i13 != i12) {
            View view2 = this.A04[i13];
            C1UH c1uh2 = (C1UH) view2.getLayoutParams();
            int A1n3 = A1n(c15230oI, c0y0, C0SV.A06(view2));
            c1uh2.A01 = A1n3;
            c1uh2.A00 = i11;
            i11 += A1n3;
            i13 += i14;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < i9) {
            View view3 = this.A04[i15];
            if (c15010nw.A08 == null) {
                if (z2) {
                    A0N(view3, -1, r13);
                } else {
                    A0N(view3, r13, r13);
                }
            } else if (z2) {
                A0N(view3, -1, true);
            } else {
                A0N(view3, r13, true);
            }
            A0O(view3, this.A05);
            A1t(view3, A05, r13);
            int A09 = ((LinearLayoutManager) this).A06.A09(view3);
            if (A09 > i16) {
                i16 = A09;
            }
            float A0A = (((LinearLayoutManager) this).A06.A0A(view3) * 1.0f) / ((C1UH) view3.getLayoutParams()).A01;
            if (A0A > f) {
                f = A0A;
            }
            i15++;
            r13 = 0;
        }
        if (z) {
            A1r(Math.max(Math.round(f * this.A00), i));
            i16 = 0;
            for (int i17 = 0; i17 < i9; i17++) {
                View view4 = this.A04[i17];
                A1t(view4, 1073741824, true);
                int A092 = ((LinearLayoutManager) this).A06.A09(view4);
                if (A092 > i16) {
                    i16 = A092;
                }
            }
        }
        for (int i18 = 0; i18 < i9; i18++) {
            View view5 = this.A04[i18];
            if (((LinearLayoutManager) this).A06.A09(view5) != i16) {
                C1UH c1uh3 = (C1UH) view5.getLayoutParams();
                Rect rect = c1uh3.A03;
                int i19 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1uh3).topMargin + ((ViewGroup.MarginLayoutParams) c1uh3).bottomMargin;
                int i20 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1uh3).leftMargin + ((ViewGroup.MarginLayoutParams) c1uh3).rightMargin;
                int i21 = c1uh3.A00;
                int i22 = c1uh3.A01;
                if (((LinearLayoutManager) this).A01 == 1 && A1k()) {
                    int[] iArr = this.A03;
                    int i23 = this.A00 - i21;
                    i6 = iArr[i23] - iArr[i23 - i22];
                } else {
                    int[] iArr2 = this.A03;
                    i6 = iArr2[i22 + i21] - iArr2[i21];
                }
                if (((LinearLayoutManager) this).A01 == 1) {
                    makeMeasureSpec = C0SV.A01(i6, 1073741824, i20, ((ViewGroup.MarginLayoutParams) c1uh3).width, false);
                    A01 = View.MeasureSpec.makeMeasureSpec(i16 - i19, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                    A01 = C0SV.A01(i6, 1073741824, i19, ((ViewGroup.MarginLayoutParams) c1uh3).height, false);
                }
                A1s(view5, makeMeasureSpec, A01, true);
            }
        }
        c15000nv.A00 = i16;
        if (((LinearLayoutManager) this).A01 == 1) {
            int i24 = c15010nw.A05;
            i4 = c15010nw.A06;
            if (i24 == -1) {
                i5 = i4 - i16;
            } else {
                i5 = i4;
                i4 = i16 + i4;
            }
            i3 = 0;
            i2 = 0;
        } else {
            int i25 = c15010nw.A05;
            int i26 = c15010nw.A06;
            if (i25 == -1) {
                i3 = i26 - i16;
                i2 = i26;
            } else {
                i2 = i16 + i26;
                i3 = i26;
            }
            i4 = 0;
            i5 = 0;
        }
        int i27 = 0;
        while (true) {
            View[] viewArr = this.A04;
            if (i27 < i9) {
                View view6 = viewArr[i27];
                C1UH c1uh4 = (C1UH) view6.getLayoutParams();
                if (((LinearLayoutManager) this).A01 != 1) {
                    i5 = this.A03[c1uh4.A00] + A0F();
                    i4 = ((LinearLayoutManager) this).A06.A0A(view6) + i5;
                } else if (A1k()) {
                    i2 = A0D() + this.A03[this.A00 - c1uh4.A00];
                    i3 = i2 - ((LinearLayoutManager) this).A06.A0A(view6);
                } else {
                    i3 = A0D() + this.A03[c1uh4.A00];
                    i2 = ((LinearLayoutManager) this).A06.A0A(view6) + i3;
                }
                C0SV.A08(view6, i3, i5, i2, i4);
                if (((C15170oC) c1uh4).A00.A09() || c1uh4.A00()) {
                    c15000nv.A03 = true;
                }
                c15000nv.A02 |= view6.hasFocusable();
                i27++;
            } else {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1h(C0Y0 c0y0, C15010nw c15010nw, InterfaceC15150oA interfaceC15150oA) {
        int i;
        int i2 = this.A00;
        for (int i3 = 0; i3 < this.A00 && (i = c15010nw.A01) >= 0 && i < c0y0.A00() && i2 > 0; i3++) {
            ((C1UF) interfaceC15150oA).A00(i, Math.max(0, c15010nw.A07));
            i2 -= this.A01.A00(i);
            c15010nw.A01 += c15010nw.A03;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A1j(boolean z) {
        if (!z) {
            A19(null);
            if (((LinearLayoutManager) this).A0B) {
                ((LinearLayoutManager) this).A0B = false;
                A0I();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int A1l(C15230oI c15230oI, C0Y0 c0y0, int i) {
        if (!c0y0.A09) {
            AbstractC14890nk abstractC14890nk = this.A01;
            int i2 = this.A00;
            int A00 = abstractC14890nk.A00(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int A002 = abstractC14890nk.A00(i5);
                i3 += A002;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = A002;
                }
            }
            return i3 + A00 > i2 ? i4 + 1 : i4;
        }
        int A003 = c15230oI.A00(i);
        if (A003 == -1) {
            C000200d.A0s("Cannot find span size for pre layout position. ", i, "GridLayoutManager");
            return 0;
        }
        AbstractC14890nk abstractC14890nk2 = this.A01;
        int i6 = this.A00;
        int A004 = abstractC14890nk2.A00(A003);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < A003; i9++) {
            int A005 = abstractC14890nk2.A00(i9);
            i7 += A005;
            if (i7 == i6) {
                i8++;
                i7 = 0;
            } else if (i7 > i6) {
                i8++;
                i7 = A005;
            }
        }
        return i7 + A004 > i6 ? i8 + 1 : i8;
    }

    public final int A1m(C15230oI c15230oI, C0Y0 c0y0, int i) {
        if (!c0y0.A09) {
            return this.A01.A01(i, this.A00);
        }
        int i2 = this.A06.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A00 = c15230oI.A00(i);
        if (A00 == -1) {
            C000200d.A0s("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
            return 0;
        }
        return this.A01.A01(A00, this.A00);
    }

    public final int A1n(C15230oI c15230oI, C0Y0 c0y0, int i) {
        if (!c0y0.A09) {
            return this.A01.A00(i);
        }
        int i2 = this.A07.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A00 = c15230oI.A00(i);
        if (A00 == -1) {
            C000200d.A0s("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
            return 1;
        }
        return this.A01.A00(A00);
    }

    public final void A1o() {
        View[] viewArr = this.A04;
        if (viewArr == null || viewArr.length != this.A00) {
            this.A04 = new View[this.A00];
        }
    }

    public final void A1p() {
        int A0C;
        int A0F;
        if (((LinearLayoutManager) this).A01 == 1) {
            A0C = ((C0SV) this).A03 - A0E();
            A0F = A0D();
        } else {
            A0C = ((C0SV) this).A00 - A0C();
            A0F = A0F();
        }
        A1r(A0C - A0F);
    }

    public void A1q(int i) {
        if (i == this.A00) {
            return;
        }
        this.A02 = true;
        if (i >= 1) {
            this.A00 = i;
            this.A01.A00.clear();
            A0I();
            return;
        }
        throw new IllegalArgumentException(C000200d.A0D("Span count should be at least 1. Provided ", i));
    }

    public final void A1r(int i) {
        int i2;
        int length;
        int[] iArr = this.A03;
        int i3 = this.A00;
        if (iArr == null || (length = iArr.length) != i3 + 1 || iArr[length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A03 = iArr;
    }

    public final void A1s(View view, int i, int i2, boolean z) {
        C15170oC c15170oC = (C15170oC) view.getLayoutParams();
        if (z) {
            if (C0SV.A09(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c15170oC).width) && C0SV.A09(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c15170oC).height)) {
                return;
            }
        } else if (!A0a(view, i, i2, c15170oC)) {
            return;
        }
        view.measure(i, i2);
    }

    public final void A1t(View view, int i, boolean z) {
        int i2;
        int A01;
        int A012;
        C1UH c1uh = (C1UH) view.getLayoutParams();
        Rect rect = c1uh.A03;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1uh).topMargin + ((ViewGroup.MarginLayoutParams) c1uh).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1uh).leftMargin + ((ViewGroup.MarginLayoutParams) c1uh).rightMargin;
        int i5 = c1uh.A00;
        int i6 = c1uh.A01;
        if (((LinearLayoutManager) this).A01 == 1 && A1k()) {
            int[] iArr = this.A03;
            int i7 = this.A00 - i5;
            i2 = iArr[i7] - iArr[i7 - i6];
        } else {
            int[] iArr2 = this.A03;
            i2 = iArr2[i6 + i5] - iArr2[i5];
        }
        if (((LinearLayoutManager) this).A01 == 1) {
            A012 = C0SV.A01(i2, i, i4, ((ViewGroup.MarginLayoutParams) c1uh).width, false);
            A01 = C0SV.A01(((LinearLayoutManager) this).A06.A07(), ((C0SV) this).A01, i3, ((ViewGroup.MarginLayoutParams) c1uh).height, true);
        } else {
            A01 = C0SV.A01(i2, i, i3, ((ViewGroup.MarginLayoutParams) c1uh).height, false);
            A012 = C0SV.A01(((LinearLayoutManager) this).A06.A07(), ((C0SV) this).A04, i4, ((ViewGroup.MarginLayoutParams) c1uh).width, true);
        }
        A1s(view, A012, A01, z);
    }
}
