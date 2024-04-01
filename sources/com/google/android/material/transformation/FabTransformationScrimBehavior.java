package com.google.android.material.transformation;

import X.AnonymousClass088;
import X.C08280bA;
import X.C08590bk;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final C08590bk A00;
    public final C08590bk A01;

    public FabTransformationScrimBehavior() {
        this.A01 = new C08590bk(75L);
        this.A00 = new C08590bk(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new C08590bk(75L);
        this.A00 = new C08590bk(0L);
    }

    @Override // X.AbstractC08910cJ
    public boolean A0H(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof C08280bA;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet A0J(View view, final View view2, final boolean z, boolean z2) {
        C08590bk c08590bk;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        if (z) {
            c08590bk = this.A01;
        } else {
            c08590bk = this.A00;
        }
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f);
        }
        c08590bk.A00(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        AnonymousClass088.A1B(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.1Bf
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }
        });
        return animatorSet;
    }
}
