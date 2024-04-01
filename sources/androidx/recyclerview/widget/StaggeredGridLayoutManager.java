package androidx.recyclerview.widget;

import X.AbstractC15270oM;
import X.C07O;
import X.C08420bS;
import X.C0AT;
import X.C0SV;
import X.C0SX;
import X.C0Y0;
import X.C0Y1;
import X.C13240kp;
import X.C14980nt;
import X.C15160oB;
import X.C15170oC;
import X.C15230oI;
import X.C15310oQ;
import X.C15330oS;
import X.C15340oT;
import X.C15360oV;
import X.C15370oW;
import X.C1UF;
import X.C1UM;
import X.C28851Uc;
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
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends C0SV implements C0SX {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public C0Y1 A07;
    public C0Y1 A08;
    public C15340oT A09;
    public C15360oV A0A;
    public BitSet A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int[] A0I;
    public C15370oW[] A0J;
    public final Rect A0K;
    public final C14980nt A0L;
    public final C15310oQ A0M;
    public final Runnable A0N;

    public StaggeredGridLayoutManager() {
        this.A06 = -1;
        this.A0F = false;
        this.A0G = false;
        this.A03 = -1;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A09 = new C15340oT();
        this.A01 = 2;
        this.A0K = new Rect();
        this.A0M = new C15310oQ(this);
        this.A0C = false;
        this.A0H = true;
        this.A0N = new Runnable() { // from class: X.0oP
            {
                StaggeredGridLayoutManager.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                StaggeredGridLayoutManager.this.A1g();
            }
        };
        this.A02 = 1;
        A1S(2);
        this.A0L = new C14980nt();
        this.A07 = C0Y1.A00(this, this.A02);
        this.A08 = C0Y1.A00(this, 1 - this.A02);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A06 = -1;
        this.A0F = false;
        this.A0G = false;
        this.A03 = -1;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A09 = new C15340oT();
        this.A01 = 2;
        this.A0K = new Rect();
        this.A0M = new C15310oQ(this);
        this.A0C = false;
        this.A0H = true;
        this.A0N = new Runnable() { // from class: X.0oP
            {
                StaggeredGridLayoutManager.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                StaggeredGridLayoutManager.this.A1g();
            }
        };
        C15160oB A07 = C0SV.A07(context, attributeSet, i, i2);
        int i3 = A07.A00;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        A19(null);
        if (i3 != this.A02) {
            this.A02 = i3;
            C0Y1 c0y1 = this.A07;
            this.A07 = this.A08;
            this.A08 = c0y1;
            A0I();
        }
        A1S(A07.A01);
        boolean z = A07.A02;
        A19(null);
        C15360oV c15360oV = this.A0A;
        if (c15360oV != null && c15360oV.A07 != z) {
            c15360oV.A07 = z;
        }
        this.A0F = z;
        A0I();
        this.A0L = new C14980nt();
        this.A07 = C0Y1.A00(this, this.A02);
        this.A08 = C0Y1.A00(this, 1 - this.A02);
    }

    public static final int A0A(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // X.C0SV
    public int A0c(int i, C15230oI c15230oI, C0Y0 c0y0) {
        return A1J(i, c15230oI, c0y0);
    }

    @Override // X.C0SV
    public int A0d(int i, C15230oI c15230oI, C0Y0 c0y0) {
        return A1J(i, c15230oI, c0y0);
    }

    @Override // X.C0SV
    public int A0e(C15230oI c15230oI, C0Y0 c0y0) {
        if (this.A02 == 1) {
            return this.A06;
        }
        return super.A0e(c15230oI, c0y0);
    }

    @Override // X.C0SV
    public int A0f(C15230oI c15230oI, C0Y0 c0y0) {
        if (this.A02 == 0) {
            return this.A06;
        }
        return super.A0f(c15230oI, c0y0);
    }

    @Override // X.C0SV
    public int A0g(C0Y0 c0y0) {
        return A1L(c0y0);
    }

    @Override // X.C0SV
    public int A0h(C0Y0 c0y0) {
        return A1M(c0y0);
    }

    @Override // X.C0SV
    public int A0i(C0Y0 c0y0) {
        return A1N(c0y0);
    }

    @Override // X.C0SV
    public int A0j(C0Y0 c0y0) {
        return A1L(c0y0);
    }

    @Override // X.C0SV
    public int A0k(C0Y0 c0y0) {
        return A1M(c0y0);
    }

    @Override // X.C0SV
    public int A0l(C0Y0 c0y0) {
        return A1N(c0y0);
    }

    @Override // X.C0SV
    public Parcelable A0m() {
        int A03;
        int A06;
        int[] iArr;
        C15360oV c15360oV = this.A0A;
        if (c15360oV != null) {
            return new C15360oV(c15360oV);
        }
        C15360oV c15360oV2 = new C15360oV();
        c15360oV2.A07 = this.A0F;
        c15360oV2.A05 = this.A0D;
        c15360oV2.A06 = this.A0E;
        C15340oT c15340oT = this.A09;
        if (c15340oT != null && (iArr = c15340oT.A01) != null) {
            c15360oV2.A08 = iArr;
            c15360oV2.A01 = iArr.length;
            c15360oV2.A04 = c15340oT.A00;
        } else {
            c15360oV2.A01 = 0;
        }
        if (A0A() > 0) {
            c15360oV2.A00 = this.A0D ? A1G() : A1F();
            View A1P = this.A0G ? A1P(true) : A1Q(true);
            c15360oV2.A03 = A1P != null ? C0SV.A06(A1P) : -1;
            int i = this.A06;
            c15360oV2.A02 = i;
            c15360oV2.A09 = new int[i];
            for (int i2 = 0; i2 < this.A06; i2++) {
                if (this.A0D) {
                    A03 = this.A0J[i2].A02(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                    if (A03 != Integer.MIN_VALUE) {
                        A06 = this.A07.A02();
                        A03 -= A06;
                        c15360oV2.A09[i2] = A03;
                    } else {
                        c15360oV2.A09[i2] = A03;
                    }
                } else {
                    A03 = this.A0J[i2].A03(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                    if (A03 == Integer.MIN_VALUE) {
                        c15360oV2.A09[i2] = A03;
                    } else {
                        A06 = this.A07.A06();
                        A03 -= A06;
                        c15360oV2.A09[i2] = A03;
                    }
                }
            }
        } else {
            c15360oV2.A00 = -1;
            c15360oV2.A03 = -1;
            c15360oV2.A02 = 0;
        }
        return c15360oV2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0089, code lost:
        if (r11.A02 == 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0094, code lost:
        if (A1h() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x009f, code lost:
        if (A1h() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00a4, code lost:
        if (r11.A02 == 1) goto L116;
     */
    @Override // X.C0SV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A0n(android.view.View r12, int r13, X.C15230oI r14, X.C0Y0 r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0n(android.view.View, int, X.0oI, X.0Y0):android.view.View");
    }

    @Override // X.C0SV
    public C15170oC A0o() {
        if (this.A02 == 0) {
            return new C28851Uc(-2, -1);
        }
        return new C28851Uc(-1, -2);
    }

    @Override // X.C0SV
    public C15170oC A0p(Context context, AttributeSet attributeSet) {
        return new C28851Uc(context, attributeSet);
    }

    @Override // X.C0SV
    public C15170oC A0q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C28851Uc((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C28851Uc(layoutParams);
    }

    @Override // X.C0SV
    public void A0r(int i) {
        super.A0r(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C15370oW c15370oW = this.A0J[i2];
            int i3 = c15370oW.A01;
            if (i3 != Integer.MIN_VALUE) {
                c15370oW.A01 = i3 + i;
            }
            int i4 = c15370oW.A00;
            if (i4 != Integer.MIN_VALUE) {
                c15370oW.A00 = i4 + i;
            }
        }
    }

    @Override // X.C0SV
    public void A0s(int i) {
        super.A0s(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C15370oW c15370oW = this.A0J[i2];
            int i3 = c15370oW.A01;
            if (i3 != Integer.MIN_VALUE) {
                c15370oW.A01 = i3 + i;
            }
            int i4 = c15370oW.A00;
            if (i4 != Integer.MIN_VALUE) {
                c15370oW.A00 = i4 + i;
            }
        }
    }

    @Override // X.C0SV
    public void A0t(int i) {
        if (i == 0) {
            A1g();
        }
    }

    @Override // X.C0SV
    public void A0u(int i) {
        C15360oV c15360oV = this.A0A;
        if (c15360oV != null && c15360oV.A00 != i) {
            c15360oV.A09 = null;
            c15360oV.A02 = 0;
            c15360oV.A00 = -1;
            c15360oV.A03 = -1;
        }
        this.A03 = i;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        A0I();
    }

    @Override // X.C0SV
    public void A0v(int i, int i2, C0Y0 c0y0, InterfaceC15150oA interfaceC15150oA) {
        int A02;
        int i3;
        if (this.A02 != 0) {
            i = i2;
        }
        if (A0A() == 0 || i == 0) {
            return;
        }
        A1W(i, c0y0);
        int[] iArr = this.A0I;
        if (iArr == null || iArr.length < this.A06) {
            this.A0I = new int[this.A06];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A06; i5++) {
            C14980nt c14980nt = this.A0L;
            if (c14980nt.A03 == -1) {
                A02 = c14980nt.A05;
                i3 = this.A0J[i5].A03(A02);
            } else {
                A02 = this.A0J[i5].A02(c14980nt.A02);
                i3 = c14980nt.A02;
            }
            int i6 = A02 - i3;
            if (i6 >= 0) {
                this.A0I[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.A0I, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            C14980nt c14980nt2 = this.A0L;
            int i8 = c14980nt2.A01;
            if (i8 < 0 || i8 >= c0y0.A00()) {
                return;
            }
            ((C1UF) interfaceC15150oA).A00(i8, this.A0I[i7]);
            c14980nt2.A01 += c14980nt2.A03;
        }
    }

    @Override // X.C0SV
    public void A0w(Rect rect, int i, int i2) {
        int A00;
        int A002;
        int A0E = A0E() + A0D();
        int A0C = A0C() + A0F();
        if (this.A02 == 1) {
            A002 = C0SV.A00(i2, rect.height() + A0C, super.A07.getMinimumHeight());
            A00 = C0SV.A00(i, (this.A05 * this.A06) + A0E, super.A07.getMinimumWidth());
        } else {
            A00 = C0SV.A00(i, rect.width() + A0E, super.A07.getMinimumWidth());
            A002 = C0SV.A00(i2, (this.A05 * this.A06) + A0C, super.A07.getMinimumHeight());
        }
        super.A07.setMeasuredDimension(A00, A002);
    }

    @Override // X.C0SV
    public void A0x(Parcelable parcelable) {
        if (parcelable instanceof C15360oV) {
            this.A0A = (C15360oV) parcelable;
            A0I();
        }
    }

    @Override // X.C0SV
    public void A0y(AccessibilityEvent accessibilityEvent) {
        A0S(accessibilityEvent);
        if (A0A() > 0) {
            View A1Q = A1Q(false);
            View A1P = A1P(false);
            if (A1Q != null && A1P != null) {
                int A06 = C0SV.A06(A1Q);
                int A062 = C0SV.A06(A1P);
                if (A06 < A062) {
                    accessibilityEvent.setFromIndex(A06);
                    accessibilityEvent.setToIndex(A062);
                    return;
                }
                accessibilityEvent.setFromIndex(A062);
                accessibilityEvent.setToIndex(A06);
            }
        }
    }

    @Override // X.C0SV
    public void A0z(C15230oI c15230oI, C0Y0 c0y0) {
        A1e(c15230oI, c0y0, true);
    }

    @Override // X.C0SV
    public void A10(C15230oI c15230oI, C0Y0 c0y0, View view, C08420bS c08420bS) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C28851Uc)) {
            super.A0Q(view, c08420bS);
            return;
        }
        C28851Uc c28851Uc = (C28851Uc) layoutParams;
        if (this.A02 == 0) {
            C15370oW c15370oW = c28851Uc.A00;
            int i = c15370oW == null ? -1 : c15370oW.A04;
            boolean z = c28851Uc.A01;
            c08420bS.A0A(C13240kp.A00(i, z ? this.A06 : 1, -1, -1, z, false));
            return;
        }
        C15370oW c15370oW2 = c28851Uc.A00;
        int i2 = c15370oW2 == null ? -1 : c15370oW2.A04;
        boolean z2 = c28851Uc.A01;
        c08420bS.A0A(C13240kp.A00(-1, -1, i2, z2 ? this.A06 : 1, z2, false));
    }

    @Override // X.C0SV
    public void A11(C0Y0 c0y0) {
        this.A03 = -1;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A0A = null;
        this.A0M.A00();
    }

    @Override // X.C0SV
    public void A12(RecyclerView recyclerView) {
        this.A09.A02();
        A0I();
    }

    @Override // X.C0SV
    public void A13(RecyclerView recyclerView, int i, int i2) {
        A1V(i, i2, 1);
    }

    @Override // X.C0SV
    public void A14(RecyclerView recyclerView, int i, int i2) {
        A1V(i, i2, 2);
    }

    @Override // X.C0SV
    public void A15(RecyclerView recyclerView, int i, int i2, int i3) {
        A1V(i, i2, 8);
    }

    @Override // X.C0SV
    public void A16(RecyclerView recyclerView, int i, int i2, Object obj) {
        A1V(i, i2, 4);
    }

    @Override // X.C0SV
    public void A17(RecyclerView recyclerView, C15230oI c15230oI) {
        Runnable runnable = this.A0N;
        RecyclerView recyclerView2 = super.A07;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.A06; i++) {
            this.A0J[i].A08();
        }
        recyclerView.requestLayout();
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
        if (this.A0A != null || (recyclerView = super.A07) == null) {
            return;
        }
        recyclerView.A0s(str);
    }

    @Override // X.C0SV
    public boolean A1A() {
        return this.A02 == 0;
    }

    @Override // X.C0SV
    public boolean A1B() {
        return this.A02 == 1;
    }

    @Override // X.C0SV
    public boolean A1C() {
        return this.A01 != 0;
    }

    @Override // X.C0SV
    public boolean A1D() {
        return this.A0A == null;
    }

    @Override // X.C0SV
    public boolean A1E(C15170oC c15170oC) {
        return c15170oC instanceof C28851Uc;
    }

    public int A1F() {
        if (A0A() != 0) {
            return C0SV.A06(A0H(0));
        }
        return 0;
    }

    public int A1G() {
        int A0A = A0A();
        if (A0A == 0) {
            return 0;
        }
        return C0SV.A06(A0H(A0A - 1));
    }

    public final int A1H(int i) {
        int A02 = this.A0J[0].A02(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A022 = this.A0J[i2].A02(i);
            if (A022 > A02) {
                A02 = A022;
            }
        }
        return A02;
    }

    public final int A1I(int i) {
        int A03 = this.A0J[0].A03(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A032 = this.A0J[i2].A03(i);
            if (A032 < A03) {
                A03 = A032;
            }
        }
        return A03;
    }

    public int A1J(int i, C15230oI c15230oI, C0Y0 c0y0) {
        if (A0A() == 0 || i == 0) {
            return 0;
        }
        A1W(i, c0y0);
        C14980nt c14980nt = this.A0L;
        int A1K = A1K(c15230oI, c14980nt, c0y0);
        if (c14980nt.A00 >= A1K) {
            i = A1K;
            if (i < 0) {
                i = -A1K;
            }
        }
        this.A07.A0E(-i);
        this.A0D = this.A0G;
        c14980nt.A00 = 0;
        A1b(c15230oI, c14980nt);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x0033, code lost:
        if (r6 >= r22.A00()) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:294:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1K(X.C15230oI r20, X.C14980nt r21, X.C0Y0 r22) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1K(X.0oI, X.0nt, X.0Y0):int");
    }

    public final int A1L(C0Y0 c0y0) {
        if (A0A() == 0) {
            return 0;
        }
        return C07O.A0A(c0y0, this.A07, A1Q(!this.A0H), A1P(!this.A0H), this, this.A0H);
    }

    public final int A1M(C0Y0 c0y0) {
        if (A0A() == 0) {
            return 0;
        }
        return C07O.A0C(c0y0, this.A07, A1Q(!this.A0H), A1P(!this.A0H), this, this.A0H, this.A0G);
    }

    public final int A1N(C0Y0 c0y0) {
        if (A0A() == 0) {
            return 0;
        }
        return C07O.A0B(c0y0, this.A07, A1Q(!this.A0H), A1P(!this.A0H), this, this.A0H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x001b, code lost:
        if (A1h() == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View A1O() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1O():android.view.View");
    }

    public View A1P(boolean z) {
        int A06 = this.A07.A06();
        int A02 = this.A07.A02();
        View view = null;
        for (int A0A = A0A() - 1; A0A >= 0; A0A--) {
            View A0H = A0H(A0A);
            int A0B = this.A07.A0B(A0H);
            int A08 = this.A07.A08(A0H);
            if (A08 > A06 && A0B < A02) {
                if (A08 <= A02 || !z) {
                    return A0H;
                }
                if (view == null) {
                    view = A0H;
                }
            }
        }
        return view;
    }

    public View A1Q(boolean z) {
        int A06 = this.A07.A06();
        int A02 = this.A07.A02();
        int A0A = A0A();
        View view = null;
        for (int i = 0; i < A0A; i++) {
            View A0H = A0H(i);
            int A0B = this.A07.A0B(A0H);
            if (this.A07.A08(A0H) > A06 && A0B < A02) {
                if (A0B >= A06 || !z) {
                    return A0H;
                }
                if (view == null) {
                    view = A0H;
                }
            }
        }
        return view;
    }

    public final void A1R() {
        if (this.A02 == 1 || !A1h()) {
            this.A0G = this.A0F;
        } else {
            this.A0G = !this.A0F;
        }
    }

    public void A1S(int i) {
        A19(null);
        if (i != this.A06) {
            this.A09.A02();
            A0I();
            this.A06 = i;
            this.A0B = new BitSet(i);
            C15370oW[] c15370oWArr = new C15370oW[i];
            this.A0J = c15370oWArr;
            for (int i2 = 0; i2 < i; i2++) {
                c15370oWArr[i2] = new C15370oW(this, i2);
            }
            A0I();
        }
    }

    public final void A1T(int i) {
        C14980nt c14980nt = this.A0L;
        c14980nt.A04 = i;
        c14980nt.A03 = this.A0G != (i == -1) ? -1 : 1;
    }

    public final void A1U(int i, int i2) {
        for (int i3 = 0; i3 < this.A06; i3++) {
            C15370oW[] c15370oWArr = this.A0J;
            if (!c15370oWArr[i3].A03.isEmpty()) {
                A1f(c15370oWArr[i3], i, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1V(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A0G
            if (r0 == 0) goto L3d
            int r5 = r6.A1G()
        L8:
            r4 = 8
            if (r9 != r4) goto L39
            int r3 = r8 + 1
            if (r7 < r8) goto L3b
            int r3 = r7 + 1
            r2 = r8
        L13:
            X.0oT r0 = r6.A09
            r0.A05(r2)
            r1 = 1
            if (r9 == r1) goto L33
            r0 = 2
            if (r9 == r0) goto L2d
            if (r9 != r4) goto L2a
            X.0oT r0 = r6.A09
            r0.A07(r7, r1)
            X.0oT r0 = r6.A09
            r0.A06(r8, r1)
        L2a:
            if (r3 > r5) goto L42
            return
        L2d:
            X.0oT r0 = r6.A09
            r0.A07(r7, r8)
            goto L2a
        L33:
            X.0oT r0 = r6.A09
            r0.A06(r7, r8)
            goto L2a
        L39:
            int r3 = r7 + r8
        L3b:
            r2 = r7
            goto L13
        L3d:
            int r5 = r6.A1F()
            goto L8
        L42:
            boolean r0 = r6.A0G
            if (r0 == 0) goto L50
            int r0 = r6.A1F()
        L4a:
            if (r2 > r0) goto L4f
            r6.A0I()
        L4f:
            return
        L50:
            int r0 = r6.A1G()
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1V(int, int, int):void");
    }

    public void A1W(int i, C0Y0 c0y0) {
        int A1F;
        int i2;
        if (i > 0) {
            A1F = A1G();
            i2 = 1;
        } else {
            A1F = A1F();
            i2 = -1;
        }
        C14980nt c14980nt = this.A0L;
        c14980nt.A07 = true;
        A1X(A1F, c0y0);
        A1T(i2);
        c14980nt.A01 = A1F + c14980nt.A03;
        c14980nt.A00 = Math.abs(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1X(int r8, X.C0Y0 r9) {
        /*
            r7 = this;
            X.0nt r3 = r7.A0L
            r2 = 0
            r3.A00 = r2
            r3.A01 = r8
            X.0oM r0 = r7.A06
            r6 = 1
            if (r0 == 0) goto L65
            boolean r0 = r0.A05
            if (r0 == 0) goto L65
            int r4 = r9.A07
            r0 = -1
            if (r4 == r0) goto L65
            boolean r1 = r7.A0G
            r0 = 0
            if (r4 >= r8) goto L1b
            r0 = 1
        L1b:
            if (r1 != r0) goto L5d
            X.0Y1 r0 = r7.A07
            int r5 = r0.A07()
        L23:
            r0 = 0
        L24:
            boolean r4 = r7.A0Y()
            X.0Y1 r1 = r7.A07
            if (r4 == 0) goto L52
            int r1 = r1.A06()
            int r1 = r1 - r0
            r3.A05 = r1
            X.0Y1 r0 = r7.A07
            int r0 = r0.A02()
            int r0 = r0 + r5
            r3.A02 = r0
        L3c:
            r3.A08 = r2
            r3.A07 = r6
            X.0Y1 r1 = r7.A07
            int r0 = r1.A04()
            if (r0 != 0) goto L4f
            int r0 = r1.A01()
            if (r0 != 0) goto L4f
            r2 = 1
        L4f:
            r3.A06 = r2
            return
        L52:
            int r1 = r1.A01()
            int r1 = r1 + r5
            r3.A02 = r1
            int r0 = -r0
            r3.A05 = r0
            goto L3c
        L5d:
            X.0Y1 r0 = r7.A07
            int r0 = r0.A07()
            r5 = 0
            goto L24
        L65:
            r5 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1X(int, X.0Y0):void");
    }

    public final void A1Y(View view, int i, int i2) {
        Rect rect = this.A0K;
        A0O(view, rect);
        C15170oC c15170oC = (C15170oC) view.getLayoutParams();
        int A0A = A0A(i, ((ViewGroup.MarginLayoutParams) c15170oC).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c15170oC).rightMargin + rect.right);
        int A0A2 = A0A(i2, ((ViewGroup.MarginLayoutParams) c15170oC).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c15170oC).bottomMargin + rect.bottom);
        if (A0a(view, A0A, A0A2, c15170oC)) {
            view.measure(A0A, A0A2);
        }
    }

    public final void A1Z(C15230oI c15230oI, int i) {
        for (int A0A = A0A() - 1; A0A >= 0; A0A--) {
            View A0H = A0H(A0A);
            if (this.A07.A0B(A0H) < i || this.A07.A0D(A0H) < i) {
                return;
            }
            C28851Uc c28851Uc = (C28851Uc) A0H.getLayoutParams();
            if (c28851Uc.A01) {
                for (int i2 = 0; i2 < this.A06; i2++) {
                    if (this.A0J[i2].A03.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.A06; i3++) {
                    this.A0J[i3].A09();
                }
            } else if (c28851Uc.A00.A03.size() == 1) {
                return;
            } else {
                c28851Uc.A00.A09();
            }
            A0R(A0H, c15230oI);
        }
    }

    public final void A1a(C15230oI c15230oI, int i) {
        while (A0A() > 0) {
            View A0H = A0H(0);
            if (this.A07.A08(A0H) > i || this.A07.A0C(A0H) > i) {
                return;
            }
            C28851Uc c28851Uc = (C28851Uc) A0H.getLayoutParams();
            if (c28851Uc.A01) {
                for (int i2 = 0; i2 < this.A06; i2++) {
                    if (this.A0J[i2].A03.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.A06; i3++) {
                    this.A0J[i3].A0A();
                }
            } else {
                C15370oW c15370oW = c28851Uc.A00;
                if (c15370oW.A03.size() == 1) {
                    return;
                }
                c15370oW.A0A();
            }
            A0R(A0H, c15230oI);
        }
    }

    public final void A1b(C15230oI c15230oI, C14980nt c14980nt) {
        int min;
        int min2;
        if (c14980nt.A07 && !c14980nt.A06) {
            if (c14980nt.A00 == 0) {
                if (c14980nt.A04 == -1) {
                    A1Z(c15230oI, c14980nt.A02);
                    return;
                } else {
                    A1a(c15230oI, c14980nt.A05);
                    return;
                }
            }
            int i = 1;
            if (c14980nt.A04 == -1) {
                int i2 = c14980nt.A05;
                int A03 = this.A0J[0].A03(i2);
                while (i < this.A06) {
                    int A032 = this.A0J[i].A03(i2);
                    if (A032 > A03) {
                        A03 = A032;
                    }
                    i++;
                }
                int i3 = i2 - A03;
                if (i3 < 0) {
                    min2 = c14980nt.A02;
                } else {
                    min2 = c14980nt.A02 - Math.min(i3, c14980nt.A00);
                }
                A1Z(c15230oI, min2);
                return;
            }
            int i4 = c14980nt.A02;
            int A02 = this.A0J[0].A02(i4);
            while (i < this.A06) {
                int A022 = this.A0J[i].A02(i4);
                if (A022 < A02) {
                    A02 = A022;
                }
                i++;
            }
            int i5 = A02 - c14980nt.A02;
            if (i5 < 0) {
                min = c14980nt.A05;
            } else {
                min = Math.min(i5, c14980nt.A00) + c14980nt.A05;
            }
            A1a(c15230oI, min);
        }
    }

    public final void A1c(C15230oI c15230oI, C0Y0 c0y0, boolean z) {
        int A02;
        int A1H = A1H(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        if (A1H != Integer.MIN_VALUE && (A02 = this.A07.A02() - A1H) > 0) {
            int i = A02 - (-A1J(-A02, c15230oI, c0y0));
            if (!z || i <= 0) {
                return;
            }
            this.A07.A0E(i);
        }
    }

    public final void A1d(C15230oI c15230oI, C0Y0 c0y0, boolean z) {
        int A06;
        int A1I = A1I(Integer.MAX_VALUE);
        if (A1I != Integer.MAX_VALUE && (A06 = A1I - this.A07.A06()) > 0) {
            int A1J = A06 - A1J(A06, c15230oI, c0y0);
            if (!z || A1J <= 0) {
                return;
            }
            this.A07.A0E(-A1J);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:300:0x0023, code lost:
        if (r2 != null) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01c9, code lost:
        if (r11.A0G != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01cb, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x01ed, code lost:
        if ((r4 < A1F()) != r11.A0G) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x01ef, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0404, code lost:
        if (A1g() != false) goto L267;
     */
    /* JADX WARN: Removed duplicated region for block: B:456:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1e(X.C15230oI r12, X.C0Y0 r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1e(X.0oI, X.0Y0, boolean):void");
    }

    public final void A1f(C15370oW c15370oW, int i, int i2) {
        int i3 = c15370oW.A02;
        if (i == -1) {
            int i4 = c15370oW.A01;
            if (i4 == Integer.MIN_VALUE) {
                c15370oW.A07();
                i4 = c15370oW.A01;
            }
            if (i4 + i3 <= i2) {
                this.A0B.set(c15370oW.A04, false);
                return;
            }
            return;
        }
        int i5 = c15370oW.A00;
        if (i5 == Integer.MIN_VALUE) {
            c15370oW.A06();
            i5 = c15370oW.A00;
        }
        if (i5 - i3 < i2) {
            return;
        }
        this.A0B.set(c15370oW.A04, false);
    }

    public boolean A1g() {
        int A1F;
        int A1G;
        if (A0A() == 0 || this.A01 == 0 || !super.A0B) {
            return false;
        }
        if (this.A0G) {
            A1F = A1G();
            A1G = A1F();
        } else {
            A1F = A1F();
            A1G = A1G();
        }
        if (A1F == 0 && A1O() != null) {
            this.A09.A02();
            super.A0F = true;
            A0I();
            return true;
        } else if (this.A0C) {
            int i = this.A0G ? -1 : 1;
            int i2 = A1G + 1;
            C15330oS A01 = this.A09.A01(A1F, i2, i);
            if (A01 == null) {
                this.A0C = false;
                this.A09.A04(i2);
                return false;
            }
            C15330oS A012 = this.A09.A01(A1F, A01.A01, -i);
            if (A012 != null) {
                this.A09.A04(A012.A01 + 1);
            } else {
                this.A09.A04(A01.A01);
            }
            super.A0F = true;
            A0I();
            return true;
        } else {
            return false;
        }
    }

    public boolean A1h() {
        return C0AT.A05(super.A07) == 1;
    }

    public final boolean A1i(int i) {
        if (this.A02 == 0) {
            return (i == -1) != this.A0G;
        }
        return ((i == -1) == this.A0G) == A1h();
    }

    @Override // X.C0SX
    public PointF A6O(int i) {
        int i2 = -1;
        if (A0A() == 0) {
            if (this.A0G) {
                i2 = 1;
            }
        } else {
            if ((i < A1F()) == this.A0G) {
                i2 = 1;
            }
        }
        PointF pointF = new PointF();
        if (this.A02 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }
}
