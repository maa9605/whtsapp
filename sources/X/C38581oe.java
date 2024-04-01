package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.1oe  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38581oe extends AbstractC28841Ub {
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
        View view;
        int A06;
        PointF A6O;
        int A0B = c0sv.A0B();
        if (A0B == 0) {
            return -1;
        }
        if (c0sv.A1B()) {
            C0Y1 c0y1 = this.A01;
            if (c0y1 == null || c0y1.A02 != c0sv) {
                c0y1 = new C1UP(c0sv);
                this.A01 = c0y1;
            }
            int A0A = c0sv.A0A();
            view = null;
            if (A0A != 0) {
                int i3 = Integer.MAX_VALUE;
                for (int i4 = 0; i4 < A0A; i4++) {
                    View A0H = c0sv.A0H(i4);
                    int A0B2 = c0y1.A0B(A0H);
                    if (A0B2 < i3) {
                        view = A0H;
                        i3 = A0B2;
                    }
                }
                if (view != null || (A06 = C0SV.A06(view)) == -1) {
                    return -1;
                }
                boolean z = !c0sv.A1A() ? i2 <= 0 : i <= 0;
                return (!(c0sv instanceof C0SX) || (A6O = ((C0SX) c0sv).A6O(A0B - 1)) == null || (A6O.x >= 0.0f && A6O.y >= 0.0f)) ? z ? A06 + 1 : A06 : z ? A06 - 1 : A06;
            }
            return -1;
        }
        if (c0sv.A1A()) {
            C0Y1 c0y12 = this.A00;
            if (c0y12 == null || c0y12.A02 != c0sv) {
                c0y12 = new C1UO(c0sv);
                this.A00 = c0y12;
            }
            int A0A2 = c0sv.A0A();
            view = null;
            if (A0A2 != 0) {
                int i5 = Integer.MAX_VALUE;
                for (int i6 = 0; i6 < A0A2; i6++) {
                    View A0H2 = c0sv.A0H(i6);
                    int A0B3 = c0y12.A0B(A0H2);
                    if (A0B3 < i5) {
                        view = A0H2;
                        i5 = A0B3;
                    }
                }
                if (view != null) {
                    return -1;
                }
            }
        }
        return -1;
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
    public C1UM A04(C0SV c0sv) {
        if (c0sv instanceof C0SX) {
            final Context context = super.A01.getContext();
            return new C1UM(context) { // from class: X.1od
                @Override // X.C1UM, X.AbstractC15270oM
                public void A03(View view, C0Y0 c0y0, C15260oL c15260oL) {
                    C38581oe c38581oe = C38581oe.this;
                    int[] A05 = c38581oe.A05(((AbstractC28841Ub) c38581oe).A01.A0S, view);
                    int i = A05[0];
                    int i2 = A05[1];
                    int ceil = (int) Math.ceil(A07(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                    if (ceil > 0) {
                        DecelerateInterpolator decelerateInterpolator = ((C1UM) this).A04;
                        c15260oL.A02 = i;
                        c15260oL.A03 = i2;
                        c15260oL.A01 = ceil;
                        c15260oL.A05 = decelerateInterpolator;
                        c15260oL.A06 = true;
                    }
                }

                @Override // X.C1UM
                public float A04(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // X.C1UM
                public int A07(int i) {
                    return Math.min(100, super.A07(i));
                }
            };
        }
        return null;
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
}
