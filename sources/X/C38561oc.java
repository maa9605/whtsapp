package X;

import android.graphics.PointF;
import android.view.View;
import android.widget.Scroller;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1oc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38561oc extends AbstractC28841Ub {
    public C0Y1 A00;
    public C0Y1 A01;

    public static final int A00(C0SV c0sv, View view, C0Y1 c0y1) {
        int A01;
        int A09 = (c0y1.A09(view) >> 1) + c0y1.A0B(view);
        if (c0sv.A0Y()) {
            A01 = (c0y1.A07() >> 1) + c0y1.A06();
        } else {
            A01 = c0y1.A01() >> 1;
        }
        return A09 - A01;
    }

    public static final View A01(C0SV c0sv, C0Y1 c0y1) {
        int A01;
        int A0A = c0sv.A0A();
        View view = null;
        if (A0A == 0) {
            return null;
        }
        if (c0sv.A0Y()) {
            A01 = (c0y1.A07() >> 1) + c0y1.A06();
        } else {
            A01 = c0y1.A01() >> 1;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0A; i2++) {
            View A0H = c0sv.A0H(i2);
            int abs = Math.abs(((c0y1.A09(A0H) >> 1) + c0y1.A0B(A0H)) - A01);
            if (abs < i) {
                view = A0H;
                i = abs;
            }
        }
        return view;
    }

    @Override // X.AbstractC28841Ub
    public int A02(C0SV c0sv, int i, int i2) {
        int A0B;
        View A03;
        int A06;
        int i3;
        PointF A6O;
        int i4;
        int i5;
        if (!(c0sv instanceof C0SX) || (A0B = c0sv.A0B()) == 0 || (A03 = A03(c0sv)) == null || (A06 = C0SV.A06(A03)) == -1 || (A6O = ((C0SX) c0sv).A6O(A0B - 1)) == null) {
            return -1;
        }
        if (c0sv.A1A()) {
            C0Y1 c0y1 = this.A00;
            if (c0y1 == null || c0y1.A02 != c0sv) {
                c0y1 = new C1UO(c0sv);
                this.A00 = c0y1;
            }
            i4 = A06(c0sv, c0y1, i, 0);
            if (A6O.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (c0sv.A1B()) {
            C0Y1 c0y12 = this.A01;
            if (c0y12 == null || c0y12.A02 != c0sv) {
                c0y12 = new C1UP(c0sv);
                this.A01 = c0y12;
            }
            i5 = A06(c0sv, c0y12, 0, i2);
            if (A6O.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (c0sv.A1B()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = A06 + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 < A0B ? i7 : i3;
    }

    @Override // X.AbstractC28841Ub
    public View A03(C0SV c0sv) {
        if (c0sv.A1B()) {
            C0Y1 c0y1 = this.A01;
            if (c0y1 == null || c0y1.A02 != c0sv) {
                c0y1 = new C1UP(c0sv);
                this.A01 = c0y1;
            }
            return A01(c0sv, c0y1);
        } else if (c0sv.A1A()) {
            C0Y1 c0y12 = this.A00;
            if (c0y12 == null || c0y12.A02 != c0sv) {
                c0y12 = new C1UO(c0sv);
                this.A00 = c0y12;
            }
            return A01(c0sv, c0y12);
        } else {
            return null;
        }
    }

    @Override // X.AbstractC28841Ub
    public int[] A05(C0SV c0sv, View view) {
        int[] iArr = new int[2];
        if (c0sv.A1A()) {
            C0Y1 c0y1 = this.A00;
            if (c0y1 == null || c0y1.A02 != c0sv) {
                c0y1 = new C1UO(c0sv);
                this.A00 = c0y1;
            }
            iArr[0] = A00(c0sv, view, c0y1);
        } else {
            iArr[0] = 0;
        }
        if (c0sv.A1B()) {
            C0Y1 c0y12 = this.A01;
            if (c0y12 == null || c0y12.A02 != c0sv) {
                c0y12 = new C1UP(c0sv);
                this.A01 = c0y12;
            }
            iArr[1] = A00(c0sv, view, c0y12);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final int A06(C0SV c0sv, C0Y1 c0y1, int i, int i2) {
        int max;
        Scroller scroller = super.A00;
        int i3 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        scroller.fling(0, 0, i, i2, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
        int[] iArr = {super.A00.getFinalX(), super.A00.getFinalY()};
        int A0A = c0sv.A0A();
        float f = 1.0f;
        if (A0A != 0) {
            View view = null;
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < A0A; i5++) {
                View A0H = c0sv.A0H(i5);
                int A06 = C0SV.A06(A0H);
                if (A06 != -1) {
                    if (A06 < i4) {
                        view = A0H;
                        i4 = A06;
                    }
                    if (A06 > i3) {
                        view2 = A0H;
                        i3 = A06;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(c0y1.A08(view), c0y1.A08(view2)) - Math.min(c0y1.A0B(view), c0y1.A0B(view2))) != 0) {
                f = (max * 1.0f) / ((i3 - i4) + 1);
                if (f <= 0.0f) {
                    return 0;
                }
            }
        }
        int i6 = iArr[0];
        int abs = Math.abs(i6);
        int i7 = iArr[1];
        if (abs > Math.abs(i7)) {
            i7 = i6;
        }
        return Math.round(i7 / f);
    }
}
