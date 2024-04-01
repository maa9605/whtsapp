package com.google.android.material.appbar;

import X.AbstractC08910cJ;
import X.C1AY;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class ViewOffsetBehavior extends AbstractC08910cJ {
    public int A00;
    public C1AY A01;

    public ViewOffsetBehavior() {
        this.A00 = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
    }

    @Override // X.AbstractC08910cJ
    public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
        A0I(coordinatorLayout, view, i);
        C1AY c1ay = this.A01;
        if (c1ay == null) {
            c1ay = new C1AY(view);
            this.A01 = c1ay;
        }
        View view2 = c1ay.A03;
        c1ay.A01 = view2.getTop();
        c1ay.A00 = view2.getLeft();
        c1ay.A00();
        int i2 = this.A00;
        if (i2 != 0) {
            this.A01.A01(i2);
            this.A00 = 0;
            return true;
        }
        return true;
    }

    public void A0I(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.A0B(view, i);
    }
}
