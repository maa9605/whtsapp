package androidx.recyclerview.widget;

import X.AbstractC15270oM;
import X.C000200d;
import X.C07O;
import X.C0AT;
import X.C0SV;
import X.C0SX;
import X.C0SY;
import X.C0Y0;
import X.C0Y1;
import X.C14990nu;
import X.C15000nv;
import X.C15010nw;
import X.C15030ny;
import X.C15160oB;
import X.C15170oC;
import X.C15230oI;
import X.C1UF;
import X.C1UM;
import X.InterfaceC15150oA;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: classes.dex */
public class LinearLayoutManager extends C0SV implements C0SX, C0SY {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C15010nw A04;
    public C15030ny A05;
    public C0Y1 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final C14990nu A0C;
    public final C15000nv A0D;

    @Override // X.C0SV
    public boolean A1C() {
        return true;
    }

    public void A1f(C15230oI c15230oI, C0Y0 c0y0, C14990nu c14990nu, int i) {
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A05 = null;
        this.A0C = new C14990nu();
        this.A0D = new C15000nv();
        this.A00 = 2;
        A1Y(i);
        A1i(false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A01 = 1;
        this.A08 = false;
        this.A09 = false;
        this.A0B = false;
        this.A0A = true;
        this.A02 = -1;
        this.A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A05 = null;
        this.A0C = new C14990nu();
        this.A0D = new C15000nv();
        this.A00 = 2;
        C15160oB A07 = C0SV.A07(context, attributeSet, i, i2);
        A1Y(A07.A00);
        A1i(A07.A02);
        A1j(A07.A03);
    }

    @Override // X.C0SV
    public View A0G(int i) {
        int A0A = A0A();
        if (A0A == 0) {
            return null;
        }
        int A06 = i - C0SV.A06(A0H(0));
        if (A06 >= 0 && A06 < A0A) {
            View A0H = A0H(A06);
            if (C0SV.A06(A0H) == i) {
                return A0H;
            }
        }
        return super.A0G(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x000c, code lost:
        if (r0 != false) goto L7;
     */
    @Override // X.C0SV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0M(int r6, X.InterfaceC15150oA r7) {
        /*
            r5 = this;
            X.0ny r0 = r5.A05
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L21
            int r2 = r0.A01
            if (r2 < 0) goto L21
            boolean r0 = r0.A02
        Lc:
            if (r0 == 0) goto L30
        Le:
            r1 = 0
        Lf:
            int r0 = r5.A00
            if (r1 >= r0) goto L32
            if (r2 < 0) goto L32
            if (r2 >= r6) goto L32
            r0 = r7
            X.1UF r0 = (X.C1UF) r0
            r0.A00(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto Lf
        L21:
            r5.A1X()
            boolean r0 = r5.A09
            int r2 = r5.A02
            if (r2 != r4) goto Lc
            r2 = 0
            if (r0 == 0) goto L30
            int r2 = r6 + (-1)
            goto Le
        L30:
            r4 = 1
            goto Le
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0M(int, X.0oA):void");
    }

    @Override // X.C0SV
    public boolean A0Z() {
        if (super.A01 == 1073741824 || super.A04 == 1073741824) {
            return false;
        }
        int A0A = A0A();
        for (int i = 0; i < A0A; i++) {
            ViewGroup.LayoutParams layoutParams = A0H(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C0SV
    public int A0c(int i, C15230oI c15230oI, C0Y0 c0y0) {
        if (this.A01 == 1) {
            return 0;
        }
        return A1K(i, c15230oI, c0y0);
    }

    @Override // X.C0SV
    public int A0d(int i, C15230oI c15230oI, C0Y0 c0y0) {
        if (this.A01 == 0) {
            return 0;
        }
        return A1K(i, c15230oI, c0y0);
    }

    @Override // X.C0SV
    public int A0g(C0Y0 c0y0) {
        return A1M(c0y0);
    }

    @Override // X.C0SV
    public int A0h(C0Y0 c0y0) {
        return A1N(c0y0);
    }

    @Override // X.C0SV
    public int A0i(C0Y0 c0y0) {
        return A1O(c0y0);
    }

    @Override // X.C0SV
    public int A0j(C0Y0 c0y0) {
        return A1M(c0y0);
    }

    @Override // X.C0SV
    public int A0k(C0Y0 c0y0) {
        return A1N(c0y0);
    }

    @Override // X.C0SV
    public int A0l(C0Y0 c0y0) {
        return A1O(c0y0);
    }

    @Override // X.C0SV
    public Parcelable A0m() {
        C15030ny c15030ny = this.A05;
        if (c15030ny != null) {
            return new C15030ny(c15030ny);
        }
        C15030ny c15030ny2 = new C15030ny();
        if (A0A() > 0) {
            A1W();
            boolean z = this.A07 ^ this.A09;
            c15030ny2.A02 = z;
            if (z) {
                View A1P = A1P();
                c15030ny2.A00 = this.A06.A02() - this.A06.A08(A1P);
                c15030ny2.A01 = C0SV.A06(A1P);
                return c15030ny2;
            }
            View A1Q = A1Q();
            c15030ny2.A01 = C0SV.A06(A1Q);
            c15030ny2.A00 = this.A06.A0B(A1Q) - this.A06.A06();
            return c15030ny2;
        }
        c15030ny2.A01 = -1;
        return c15030ny2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c A[RETURN] */
    @Override // X.C0SV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A0n(android.view.View r7, int r8, X.C15230oI r9, X.C0Y0 r10) {
        /*
            r6 = this;
            r6.A1X()
            int r0 = r6.A0A()
            r5 = 0
            if (r0 != 0) goto Lb
            return r5
        Lb:
            int r4 = r6.A1J(r8)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r3) goto L14
            return r5
        L14:
            r6.A1W()
            r6.A1W()
            r1 = 1051372203(0x3eaaaaab, float:0.33333334)
            X.0Y1 r0 = r6.A06
            int r0 = r0.A07()
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r2 = 0
            r6.A1c(r4, r0, r2, r10)
            X.0nw r1 = r6.A04
            r1.A07 = r3
            r1.A0B = r2
            r0 = 1
            r6.A1L(r9, r1, r10, r0)
            r3 = -1
            boolean r1 = r6.A09
            int r0 = r6.A0A()
            if (r4 != r3) goto L57
            if (r1 == 0) goto L52
            int r0 = r0 + (-1)
            android.view.View r2 = r6.A1R(r0, r3)
        L45:
            android.view.View r1 = r6.A1Q()
        L49:
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L6c
            if (r2 != 0) goto L6b
            return r5
        L52:
            android.view.View r2 = r6.A1R(r2, r0)
            goto L45
        L57:
            if (r1 == 0) goto L64
            android.view.View r2 = r6.A1R(r2, r0)
        L5d:
            if (r4 == r3) goto L45
            android.view.View r1 = r6.A1P()
            goto L49
        L64:
            int r0 = r0 + (-1)
            android.view.View r2 = r6.A1R(r0, r3)
            goto L5d
        L6b:
            return r1
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0n(android.view.View, int, X.0oI, X.0Y0):android.view.View");
    }

    @Override // X.C0SV
    public C15170oC A0o() {
        return new C15170oC(-2, -2);
    }

    @Override // X.C0SV
    public void A0u(int i) {
        this.A02 = i;
        this.A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        C15030ny c15030ny = this.A05;
        if (c15030ny != null) {
            c15030ny.A01 = -1;
        }
        A0I();
    }

    @Override // X.C0SV
    public void A0v(int i, int i2, C0Y0 c0y0, InterfaceC15150oA interfaceC15150oA) {
        if (this.A01 != 0) {
            i = i2;
        }
        if (A0A() == 0 || i == 0) {
            return;
        }
        A1W();
        A1c(i > 0 ? 1 : -1, Math.abs(i), true, c0y0);
        A1h(c0y0, this.A04, interfaceC15150oA);
    }

    @Override // X.C0SV
    public void A0x(Parcelable parcelable) {
        if (parcelable instanceof C15030ny) {
            this.A05 = (C15030ny) parcelable;
            A0I();
        }
    }

    @Override // X.C0SV
    public void A0y(AccessibilityEvent accessibilityEvent) {
        A0S(accessibilityEvent);
        if (A0A() > 0) {
            accessibilityEvent.setFromIndex(A1G());
            accessibilityEvent.setToIndex(A1I());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x00d0, code lost:
        if (r4.A01() != 0) goto L133;
     */
    @Override // X.C0SV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0z(X.C15230oI r18, X.C0Y0 r19) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0z(X.0oI, X.0Y0):void");
    }

    @Override // X.C0SV
    public void A11(C0Y0 c0y0) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A0C.A01();
    }

    @Override // X.C0SV
    public void A18(RecyclerView recyclerView, C0Y0 c0y0, int i) {
        C1UM c1um = new C1UM(recyclerView.getContext());
        ((AbstractC15270oM) c1um).A00 = i;
        A0W(c1um);
    }

    @Override // X.C0SV
    public void A19(String str) {
        RecyclerView recyclerView;
        if (this.A05 != null || (recyclerView = super.A07) == null) {
            return;
        }
        recyclerView.A0s(str);
    }

    @Override // X.C0SV
    public boolean A1A() {
        return this.A01 == 0;
    }

    @Override // X.C0SV
    public boolean A1B() {
        return this.A01 == 1;
    }

    @Override // X.C0SV
    public boolean A1D() {
        return this.A05 == null && this.A07 == this.A0B;
    }

    public int A1F() {
        View A1S = A1S(0, A0A(), true, false);
        if (A1S == null) {
            return -1;
        }
        return C0SV.A06(A1S);
    }

    public int A1G() {
        View A1S = A1S(0, A0A(), false, true);
        if (A1S == null) {
            return -1;
        }
        return C0SV.A06(A1S);
    }

    public int A1H() {
        View A1S = A1S(A0A() - 1, -1, true, false);
        if (A1S != null) {
            return C0SV.A06(A1S);
        }
        return -1;
    }

    public int A1I() {
        View A1S = A1S(A0A() - 1, -1, false, true);
        if (A1S != null) {
            return C0SV.A06(A1S);
        }
        return -1;
    }

    public int A1J(int i) {
        if (i == 1) {
            return (this.A01 != 1 && A1k()) ? 1 : -1;
        } else if (i == 2) {
            return (this.A01 != 1 && A1k()) ? -1 : 1;
        } else if (i == 17) {
            if (this.A01 != 0) {
                return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            return -1;
        } else if (i == 33) {
            if (this.A01 != 1) {
                return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            }
            return -1;
        } else if (i != 66) {
            if (i == 130 && this.A01 == 1) {
                return 1;
            }
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        } else if (this.A01 != 0) {
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        } else {
            return 1;
        }
    }

    public int A1K(int i, C15230oI c15230oI, C0Y0 c0y0) {
        if (A0A() == 0 || i == 0) {
            return 0;
        }
        this.A04.A0B = true;
        A1W();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        A1c(i2, abs, true, c0y0);
        C15010nw c15010nw = this.A04;
        int A1L = A1L(c15230oI, c15010nw, c0y0, false) + c15010nw.A07;
        if (A1L < 0) {
            return 0;
        }
        if (abs > A1L) {
            i = i2 * A1L;
        }
        this.A06.A0E(-i);
        this.A04.A04 = i;
        return i;
    }

    public int A1L(C15230oI c15230oI, C15010nw c15010nw, C0Y0 c0y0, boolean z) {
        int i;
        int i2 = c15010nw.A00;
        int i3 = c15010nw.A07;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c15010nw.A07 = i3 + i2;
            }
            A1e(c15230oI, c15010nw);
        }
        int i4 = c15010nw.A00 + c15010nw.A02;
        C15000nv c15000nv = this.A0D;
        while (true) {
            if ((!c15010nw.A09 && i4 <= 0) || (i = c15010nw.A01) < 0 || i >= c0y0.A00()) {
                break;
            }
            c15000nv.A00 = 0;
            c15000nv.A01 = false;
            c15000nv.A03 = false;
            c15000nv.A02 = false;
            A1g(c15230oI, c0y0, c15010nw, c15000nv);
            if (!c15000nv.A01) {
                int i5 = c15010nw.A06;
                int i6 = c15000nv.A00;
                c15010nw.A06 = (c15010nw.A05 * i6) + i5;
                if (!c15000nv.A03 || this.A04.A08 != null || !c0y0.A09) {
                    c15010nw.A00 -= i6;
                    i4 -= i6;
                }
                int i7 = c15010nw.A07;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c15010nw.A07 = i8;
                    int i9 = c15010nw.A00;
                    if (i9 < 0) {
                        c15010nw.A07 = i8 + i9;
                    }
                    A1e(c15230oI, c15010nw);
                }
                if (z && c15000nv.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c15010nw.A00;
    }

    public final int A1M(C0Y0 c0y0) {
        if (A0A() == 0) {
            return 0;
        }
        A1W();
        return C07O.A0A(c0y0, this.A06, A1V(!this.A0A), A1U(!this.A0A), this, this.A0A);
    }

    public final int A1N(C0Y0 c0y0) {
        if (A0A() == 0) {
            return 0;
        }
        A1W();
        return C07O.A0C(c0y0, this.A06, A1V(!this.A0A), A1U(!this.A0A), this, this.A0A, this.A09);
    }

    public final int A1O(C0Y0 c0y0) {
        if (A0A() == 0) {
            return 0;
        }
        A1W();
        return C07O.A0B(c0y0, this.A06, A1V(!this.A0A), A1U(!this.A0A), this, this.A0A);
    }

    public final View A1P() {
        return A0H(this.A09 ? 0 : A0A() - 1);
    }

    public final View A1Q() {
        return A0H(this.A09 ? A0A() - 1 : 0);
    }

    public View A1R(int i, int i2) {
        A1W();
        if (i2 <= i && i2 >= i) {
            return A0H(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A0B(A0H(i)) < this.A06.A06()) {
            i3 = 16644;
            i4 = 16388;
        }
        if (this.A01 == 0) {
            return super.A08.A00(i, i2, i3, i4);
        }
        return super.A09.A00(i, i2, i3, i4);
    }

    public View A1S(int i, int i2, boolean z, boolean z2) {
        A1W();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.A01 == 0) {
            return super.A08.A00(i, i2, i3, i4);
        }
        return super.A09.A00(i, i2, i3, i4);
    }

    public View A1T(C15230oI c15230oI, C0Y0 c0y0, int i, int i2, int i3) {
        A1W();
        int A06 = this.A06.A06();
        int A02 = this.A06.A02();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View A0H = A0H(i);
            int A062 = C0SV.A06(A0H);
            if (A062 >= 0 && A062 < i3) {
                if (((C15170oC) A0H.getLayoutParams()).A00.A09()) {
                    if (view2 == null) {
                        view2 = A0H;
                    }
                } else if (this.A06.A0B(A0H) < A02 && this.A06.A08(A0H) >= A06) {
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

    public final View A1U(boolean z) {
        if (this.A09) {
            return A1S(0, A0A(), z, true);
        }
        return A1S(A0A() - 1, -1, z, true);
    }

    public final View A1V(boolean z) {
        if (this.A09) {
            return A1S(A0A() - 1, -1, z, true);
        }
        return A1S(0, A0A(), z, true);
    }

    public void A1W() {
        if (this.A04 == null) {
            this.A04 = new C15010nw();
        }
    }

    public final void A1X() {
        if (this.A01 == 1 || !A1k()) {
            this.A09 = this.A08;
        } else {
            this.A09 = !this.A08;
        }
    }

    public void A1Y(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C000200d.A0D("invalid orientation:", i));
        }
        A19(null);
        if (i != this.A01 || this.A06 == null) {
            C0Y1 A00 = C0Y1.A00(this, i);
            this.A06 = A00;
            this.A0C.A02 = A00;
            this.A01 = i;
            A0I();
        }
    }

    public void A1Z(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        C15030ny c15030ny = this.A05;
        if (c15030ny != null) {
            c15030ny.A01 = -1;
        }
        A0I();
    }

    public final void A1a(int i, int i2) {
        this.A04.A00 = this.A06.A02() - i2;
        C15010nw c15010nw = this.A04;
        c15010nw.A03 = this.A09 ? -1 : 1;
        c15010nw.A01 = i;
        c15010nw.A05 = 1;
        c15010nw.A06 = i2;
        c15010nw.A07 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public final void A1b(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A06();
        C15010nw c15010nw = this.A04;
        c15010nw.A01 = i;
        c15010nw.A03 = this.A09 ? 1 : -1;
        c15010nw.A05 = -1;
        c15010nw.A06 = i2;
        c15010nw.A07 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x000f, code lost:
        if (r2.A01() != 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1c(int r7, int r8, boolean r9, X.C0Y0 r10) {
        /*
            r6 = this;
            X.0nw r3 = r6.A04
            X.0Y1 r2 = r6.A06
            int r0 = r2.A04()
            if (r0 != 0) goto L11
            int r1 = r2.A01()
            r0 = 1
            if (r1 == 0) goto L12
        L11:
            r0 = 0
        L12:
            r3.A09 = r0
            int r1 = r10.A07
            r0 = -1
            if (r1 == r0) goto La7
            int r0 = r2.A07()
        L1d:
            r3.A02 = r0
            X.0nw r2 = r6.A04
            r2.A05 = r7
            r5 = -1
            r0 = 1
            if (r7 != r0) goto L6b
            int r1 = r2.A02
            X.0Y1 r0 = r6.A06
            int r0 = r0.A03()
            int r0 = r0 + r1
            r2.A02 = r0
            android.view.View r4 = r6.A1P()
            X.0nw r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 != 0) goto L3d
            r5 = 1
        L3d:
            r3.A03 = r5
            int r2 = X.C0SV.A06(r4)
            X.0nw r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.0Y1 r0 = r6.A06
            int r0 = r0.A08(r4)
            r1.A06 = r0
            X.0Y1 r0 = r6.A06
            int r1 = r0.A08(r4)
            X.0Y1 r0 = r6.A06
            int r0 = r0.A02()
            int r1 = r1 - r0
        L5f:
            X.0nw r0 = r6.A04
            r0.A00 = r8
            if (r9 == 0) goto L68
            int r8 = r8 - r1
            r0.A00 = r8
        L68:
            r0.A07 = r1
            return
        L6b:
            android.view.View r4 = r6.A1Q()
            X.0nw r2 = r6.A04
            int r1 = r2.A02
            X.0Y1 r0 = r6.A06
            int r0 = r0.A06()
            int r0 = r0 + r1
            r2.A02 = r0
            X.0nw r3 = r6.A04
            boolean r0 = r6.A09
            if (r0 == 0) goto L83
            r5 = 1
        L83:
            r3.A03 = r5
            int r2 = X.C0SV.A06(r4)
            X.0nw r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.0Y1 r0 = r6.A06
            int r0 = r0.A0B(r4)
            r1.A06 = r0
            X.0Y1 r0 = r6.A06
            int r0 = r0.A0B(r4)
            int r1 = -r0
            X.0Y1 r0 = r6.A06
            int r0 = r0.A06()
            int r1 = r1 + r0
            goto L5f
        La7:
            r0 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1c(int, int, boolean, X.0Y0):void");
    }

    public final void A1d(C15230oI c15230oI, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View A0H = A0H(i);
                A0J(i);
                c15230oI.A05(A0H);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View A0H2 = A0H(i3);
            A0J(i3);
            c15230oI.A05(A0H2);
        }
    }

    public final void A1e(C15230oI c15230oI, C15010nw c15010nw) {
        if (!c15010nw.A0B || c15010nw.A09) {
            return;
        }
        int i = c15010nw.A05;
        int i2 = c15010nw.A07;
        if (i == -1) {
            int A0A = A0A();
            if (i2 >= 0) {
                int A01 = this.A06.A01() - i2;
                if (!this.A09) {
                    int i3 = A0A - 1;
                    for (int i4 = i3; i4 >= 0; i4--) {
                        View A0H = A0H(i4);
                        if (this.A06.A0B(A0H) < A01 || this.A06.A0D(A0H) < A01) {
                            A1d(c15230oI, i3, i4);
                            return;
                        }
                    }
                    return;
                }
                for (int i5 = 0; i5 < A0A; i5++) {
                    View A0H2 = A0H(i5);
                    if (this.A06.A0B(A0H2) < A01 || this.A06.A0D(A0H2) < A01) {
                        A1d(c15230oI, 0, i5);
                        return;
                    }
                }
            }
        } else if (i2 >= 0) {
            int A0A2 = A0A();
            if (!this.A09) {
                for (int i6 = 0; i6 < A0A2; i6++) {
                    View A0H3 = A0H(i6);
                    if (this.A06.A08(A0H3) > i2 || this.A06.A0C(A0H3) > i2) {
                        A1d(c15230oI, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = A0A2 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View A0H4 = A0H(i8);
                if (this.A06.A08(A0H4) > i2 || this.A06.A0C(A0H4) > i2) {
                    A1d(c15230oI, i7, i8);
                    return;
                }
            }
        }
    }

    public void A1g(C15230oI c15230oI, C0Y0 c0y0, C15010nw c15010nw, C15000nv c15000nv) {
        int A0F;
        int A0A;
        int i;
        int i2;
        View A00 = c15010nw.A00(c15230oI);
        if (A00 == null) {
            c15000nv.A01 = true;
            return;
        }
        C15170oC c15170oC = (C15170oC) A00.getLayoutParams();
        if (c15010nw.A08 == null) {
            if (this.A09 == (c15010nw.A05 == -1)) {
                A0N(A00, -1, false);
            } else {
                A0N(A00, 0, false);
            }
        } else {
            if (this.A09 == (c15010nw.A05 == -1)) {
                A0N(A00, -1, true);
            } else {
                A0N(A00, 0, true);
            }
        }
        C15170oC c15170oC2 = (C15170oC) A00.getLayoutParams();
        Rect A0A2 = super.A07.A0A(A00);
        int A01 = C0SV.A01(super.A03, super.A04, A0E() + A0D() + ((ViewGroup.MarginLayoutParams) c15170oC2).leftMargin + ((ViewGroup.MarginLayoutParams) c15170oC2).rightMargin + A0A2.left + A0A2.right + 0, ((ViewGroup.MarginLayoutParams) c15170oC2).width, A1A());
        int A012 = C0SV.A01(super.A00, super.A01, A0C() + A0F() + ((ViewGroup.MarginLayoutParams) c15170oC2).topMargin + ((ViewGroup.MarginLayoutParams) c15170oC2).bottomMargin + A0A2.top + A0A2.bottom + 0, ((ViewGroup.MarginLayoutParams) c15170oC2).height, A1B());
        if (A0a(A00, A01, A012, c15170oC2)) {
            A00.measure(A01, A012);
        }
        c15000nv.A00 = this.A06.A09(A00);
        if (this.A01 == 1) {
            if (A1k()) {
                i = super.A03 - A0E();
                i2 = i - this.A06.A0A(A00);
            } else {
                i2 = A0D();
                i = this.A06.A0A(A00) + i2;
            }
            int i3 = c15010nw.A05;
            A0A = c15010nw.A06;
            if (i3 == -1) {
                A0F = A0A - c15000nv.A00;
            } else {
                A0F = A0A;
                A0A = c15000nv.A00 + A0A;
            }
        } else {
            A0F = A0F();
            A0A = this.A06.A0A(A00) + A0F;
            int i4 = c15010nw.A05;
            int i5 = c15010nw.A06;
            if (i4 == -1) {
                i2 = i5 - c15000nv.A00;
                i = i5;
            } else {
                i = c15000nv.A00 + i5;
                i2 = i5;
            }
        }
        C0SV.A08(A00, i2, A0F, i, A0A);
        if (c15170oC.A00.A09() || c15170oC.A00()) {
            c15000nv.A03 = true;
        }
        c15000nv.A02 = A00.hasFocusable();
    }

    public void A1h(C0Y0 c0y0, C15010nw c15010nw, InterfaceC15150oA interfaceC15150oA) {
        int i = c15010nw.A01;
        if (i < 0 || i >= c0y0.A00()) {
            return;
        }
        ((C1UF) interfaceC15150oA).A00(i, Math.max(0, c15010nw.A07));
    }

    public void A1i(boolean z) {
        A19(null);
        if (z == this.A08) {
            return;
        }
        this.A08 = z;
        A0I();
    }

    public void A1j(boolean z) {
        A19(null);
        if (this.A0B == z) {
            return;
        }
        this.A0B = z;
        A0I();
    }

    public boolean A1k() {
        return C0AT.A05(super.A07) == 1;
    }

    @Override // X.C0SX
    public PointF A6O(int i) {
        if (A0A() == 0) {
            return null;
        }
        float f = (i < C0SV.A06(A0H(0))) != this.A09 ? -1 : 1;
        if (this.A01 == 0) {
            return new PointF(f, 0.0f);
        }
        return new PointF(0.0f, f);
    }

    @Override // X.C0SY
    public void AQp(View view, View view2, int i, int i2) {
        RecyclerView recyclerView;
        if (this.A05 == null && (recyclerView = super.A07) != null) {
            recyclerView.A0s("Cannot drop a view during a scroll or layout calculation");
        }
        A1W();
        A1X();
        int A06 = C0SV.A06(view);
        int A062 = C0SV.A06(view2);
        char c = A06 < A062 ? (char) 1 : (char) 65535;
        if (this.A09) {
            if (c == 1) {
                A1Z(A062, this.A06.A02() - (this.A06.A09(view) + this.A06.A0B(view2)));
            } else {
                A1Z(A062, this.A06.A02() - this.A06.A08(view2));
            }
        } else if (c == 65535) {
            A1Z(A062, this.A06.A0B(view2));
        } else {
            A1Z(A062, this.A06.A08(view2) - this.A06.A09(view));
        }
    }
}
