package com.google.android.material.appbar;

import X.AbstractC08910cJ;
import X.C07110Wv;
import X.C07O;
import X.C08930cL;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    public int A00;
    public int A01;
    public final Rect A02;
    public final Rect A03;

    public HeaderScrollingViewBehavior() {
        this.A02 = new Rect();
        this.A03 = new Rect();
        this.A01 = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Rect();
        this.A03 = new Rect();
        this.A01 = 0;
    }

    @Override // X.AbstractC08910cJ
    public boolean A09(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AppBarLayout A00;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (A00 = AppBarLayout.ScrollingViewBehavior.A00(coordinatorLayout.A06(view))) != null) {
            if (A00.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                view.setFitsSystemWindows(true);
                if (view.getFitsSystemWindows()) {
                    view.requestLayout();
                    return true;
                }
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size == 0) {
                size = coordinatorLayout.getHeight();
            }
            int measuredHeight = (size - A00.getMeasuredHeight()) + A00.getTotalScrollRange();
            int i6 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            if (i5 == -1) {
                i6 = 1073741824;
            }
            coordinatorLayout.A0C(view, i, i2, View.MeasureSpec.makeMeasureSpec(measuredHeight, i6), i4);
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void A0I(CoordinatorLayout coordinatorLayout, View view, int i) {
        AppBarLayout A00 = AppBarLayout.ScrollingViewBehavior.A00(coordinatorLayout.A06(view));
        if (A00 != null) {
            C08930cL c08930cL = (C08930cL) view.getLayoutParams();
            Rect rect = this.A02;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c08930cL).leftMargin, A00.getBottom() + ((ViewGroup.MarginLayoutParams) c08930cL).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c08930cL).rightMargin, ((A00.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c08930cL).bottomMargin);
            C07110Wv c07110Wv = coordinatorLayout.A06;
            if (c07110Wv != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = c07110Wv.A02() + rect.left;
                rect.right -= c07110Wv.A03();
            }
            Rect rect2 = this.A03;
            int i2 = c08930cL.A02;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C07O.A0T(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int A0J = A0J(A00);
            view.layout(rect2.left, rect2.top - A0J, rect2.right, rect2.bottom - A0J);
            this.A01 = rect2.top - A00.getBottom();
            return;
        }
        coordinatorLayout.A0B(view, i);
        this.A01 = 0;
    }

    public final int A0J(View view) {
        int i;
        int i2 = 0;
        if (this.A00 != 0) {
            float f = 0.0f;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                AbstractC08910cJ abstractC08910cJ = ((C08930cL) appBarLayout.getLayoutParams()).A0A;
                int A0J = abstractC08910cJ instanceof AppBarLayout.BaseBehavior ? ((HeaderBehavior) abstractC08910cJ).A0J() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + A0J > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    f = 1.0f + (A0J / i);
                }
            }
            int i3 = this.A00;
            int i4 = (int) (f * i3);
            if (i4 >= 0) {
                i2 = i4;
                if (i4 > i3) {
                    return i3;
                }
            }
        }
        return i2;
    }
}
