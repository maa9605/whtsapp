package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.1UM */
/* loaded from: classes.dex */
public class C1UM extends AbstractC15270oM {
    public PointF A02;
    public final float A03;
    public final LinearInterpolator A05 = new LinearInterpolator();
    public final DecelerateInterpolator A04 = new DecelerateInterpolator();
    public int A00 = 0;
    public int A01 = 0;

    public C1UM(Context context) {
        this.A03 = A04(context.getResources().getDisplayMetrics());
    }

    @Override // X.AbstractC15270oM
    public void A03(View view, C0Y0 c0y0, C15260oL c15260oL) {
        int i;
        int A05 = A05();
        C0SV c0sv = super.A02;
        int i2 = 0;
        if (c0sv != null && c0sv.A1A()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            i = A08(C0SV.A03(view) - marginLayoutParams.leftMargin, C0SV.A04(view) + marginLayoutParams.rightMargin, c0sv.A0D(), c0sv.A03 - c0sv.A0E(), A05);
        } else {
            i = 0;
        }
        int A06 = A06();
        C0SV c0sv2 = super.A02;
        if (c0sv2 != null && c0sv2.A1B()) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            i2 = A08(C0SV.A05(view) - marginLayoutParams2.topMargin, C0SV.A02(view) + marginLayoutParams2.bottomMargin, c0sv2.A0F(), c0sv2.A00 - c0sv2.A0C(), A06);
        }
        int ceil = (int) Math.ceil(A07((int) Math.sqrt((i2 * i2) + (i * i))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.A04;
            c15260oL.A02 = -i;
            c15260oL.A03 = -i2;
            c15260oL.A01 = ceil;
            c15260oL.A05 = decelerateInterpolator;
            c15260oL.A06 = true;
        }
    }

    public float A04(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int A05() {
        PointF pointF = this.A02;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
            return 0;
        }
        return 0;
    }

    public int A06() {
        PointF pointF = this.A02;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
            return 0;
        }
        return 0;
    }

    public int A07(int i) {
        return (int) Math.ceil(Math.abs(i) * this.A03);
    }

    public int A08(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }
}
