package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* loaded from: classes.dex */
public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public final Rect A00;

    public BottomAppBar$Behavior() {
        this.A00 = new Rect();
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new Rect();
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, X.AbstractC08910cJ
    public boolean A08(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw null;
    }

    @Override // X.AbstractC08910cJ
    public boolean A0F(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
    public void A0I(View view) {
        super.A0I(null);
        throw null;
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
    public void A0J(View view) {
        super.A0J(null);
        throw null;
    }
}
