package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1pd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39131pd extends C1YV {
    public static final int[] A01 = new int[2];
    public final C1YZ A00;

    public C39131pd(Context context) {
        super(context);
        this.A00 = new C1YZ(this);
    }

    @Override // X.C1YV
    public void A03(boolean z, int i, int i2, int i3, int i4) {
        C20540xh c20540xh;
        C1YZ c1yz = this.A00;
        if (c1yz.A02 && (c20540xh = c1yz.A00) != null) {
            c20540xh.A01(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), null);
            c1yz.A02 = false;
        }
        C08T c08t = c1yz.A01;
        if (c08t != null) {
            c1yz.A04.A02(c08t);
        }
        C1YV.A00(this);
    }

    @Override // android.view.View
    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
    }

    @Override // android.view.View
    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C1YZ c1yz = this.A00;
        int[] iArr = A01;
        if (c1yz != null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
                c1yz.A02 = true;
                iArr[0] = size;
                iArr[1] = size2;
            } else {
                C20540xh c20540xh = c1yz.A00;
                if (c20540xh != null) {
                    c20540xh.A01(i, i2, iArr);
                    c1yz.A02 = false;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
            setMeasuredDimension(iArr[0], iArr[1]);
            return;
        }
        throw null;
    }

    public void setRenderState(C20540xh c20540xh) {
        C1YZ c1yz = this.A00;
        C20540xh c20540xh2 = c1yz.A00;
        if (c20540xh2 != c20540xh) {
            if (c20540xh2 != null) {
                c20540xh2.A09 = null;
            }
            c1yz.A00 = c20540xh;
            if (c20540xh != null) {
                C1YZ c1yz2 = c20540xh.A09;
                if (c1yz2 != null && c1yz2 != c1yz) {
                    throw new RuntimeException("Must detach from previous host listener first");
                }
                c20540xh.A09 = c1yz;
                C08S c08s = c20540xh.A06;
                c1yz.A00(c08s != null ? c08s.A02 : null);
                return;
            }
            c1yz.A00(null);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }
}
