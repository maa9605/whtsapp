package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.0cJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08910cJ {
    public void A00(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
    }

    public boolean A01(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
        return false;
    }

    public boolean A02(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return false;
    }

    public void A04(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
    }

    public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean A09(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean A0A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean A0B(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean A0C(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean A0D(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public boolean A0E(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    public void A0G(C08930cL c08930cL) {
    }

    public boolean A0H(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return false;
    }

    public AbstractC08910cJ() {
    }

    public AbstractC08910cJ(Context context, AttributeSet attributeSet) {
    }

    public Parcelable A03(CoordinatorLayout coordinatorLayout, View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public void A05(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public void A06(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            A00(coordinatorLayout, view, view2, i, i2, i3, i4);
        }
    }

    public void A07(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        if (i2 == 0) {
            return A02(coordinatorLayout, view, view2, view3, i);
        }
        return false;
    }
}
