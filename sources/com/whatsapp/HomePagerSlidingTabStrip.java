package com.whatsapp;

import X.AbstractC08500bb;
import X.ViewGroup$OnHierarchyChangeListenerC08520bd;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.HomePagerSlidingTabStrip;

/* loaded from: classes.dex */
public class HomePagerSlidingTabStrip extends AbstractC08500bb {
    public HomePagerSlidingTabStrip(final Context context, final AttributeSet attributeSet) {
        new PagerSlidingTabStrip(context, attributeSet) { // from class: X.0bb
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC07780Zw
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                generatedComponent();
            }
        };
    }

    @Override // com.whatsapp.PagerSlidingTabStrip
    public LinearLayout A01(Context context) {
        return new ViewGroup$OnHierarchyChangeListenerC08520bd(context);
    }

    @Override // com.whatsapp.PagerSlidingTabStrip
    public void A03(int i, View view) {
        LayoutTransition layoutTransition;
        super.A03(i, view);
        if (view instanceof ViewGroup) {
            View childAt = ((ViewGroup) view).getChildAt(0);
            if (!(childAt instanceof ViewGroup) || (layoutTransition = ((ViewGroup) childAt).getLayoutTransition()) == null) {
                return;
            }
            layoutTransition.addTransitionListener(new LayoutTransition.TransitionListener() { // from class: X.0cR
                @Override // android.animation.LayoutTransition.TransitionListener
                public void startTransition(LayoutTransition layoutTransition2, ViewGroup viewGroup, View view2, int i2) {
                }

                @Override // android.animation.LayoutTransition.TransitionListener
                public void endTransition(LayoutTransition layoutTransition2, ViewGroup viewGroup, View view2, int i2) {
                    HomePagerSlidingTabStrip.this.invalidate();
                }
            });
        }
    }
}
