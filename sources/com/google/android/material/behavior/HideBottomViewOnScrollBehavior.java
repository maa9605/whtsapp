package com.google.android.material.behavior;

import X.AbstractC08910cJ;
import X.C08580bj;
import X.C24241Aa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends AbstractC08910cJ {
    public int A00;
    public int A01;
    public ViewPropertyAnimator A02;

    @Override // X.AbstractC08910cJ
    public boolean A02(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.A01 = 0;
        this.A00 = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // X.AbstractC08910cJ
    public void A00(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        int i5 = this.A00;
        if (i5 != 1 && i2 > 0) {
            A0I(view);
        } else if (i5 == 2 || i2 >= 0) {
        } else {
            A0J(view);
        }
    }

    @Override // X.AbstractC08910cJ
    public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A01 = view.getMeasuredHeight();
        return false;
    }

    public void A0I(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 1;
        int i = this.A01;
        this.A02 = view.animate().translationY(i).setInterpolator(C08580bj.A01).setDuration(175L).setListener(new C24241Aa(this));
    }

    public void A0J(View view) {
        ViewPropertyAnimator viewPropertyAnimator = this.A02;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.A00 = 2;
        this.A02 = view.animate().translationY(0).setInterpolator(C08580bj.A04).setDuration(225L).setListener(new C24241Aa(this));
    }
}
