package com.whatsapp.components;

import X.C36E;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.components.AnimatingArrowsLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class AnimatingArrowsLayout extends C36E {
    public List A00;
    public final AnimatorSet A01;

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new AnimatorSet();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.A01;
        animatorSet.removeAllListeners();
        animatorSet.end();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = 0;
        this.A00 = Arrays.asList(getChildAt(3), getChildAt(2), getChildAt(1), getChildAt(0));
        ArrayList arrayList = new ArrayList(4);
        do {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A00.get(i), "alpha", 0.0f, 0.6f, 0.0f);
            ofFloat.setDuration(750L);
            ofFloat.setStartDelay(i * 100);
            arrayList.add(ofFloat);
            i++;
        } while (i < 4);
        AnimatorSet animatorSet = this.A01;
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.2pc
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AnimatingArrowsLayout animatingArrowsLayout = AnimatingArrowsLayout.this;
                animatingArrowsLayout.post(new RunnableEBaseShape8S0100000_I1_0(animatingArrowsLayout.A01, 16));
            }
        });
        animatorSet.start();
    }
}
