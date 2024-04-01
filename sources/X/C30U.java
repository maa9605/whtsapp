package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.30U  reason: invalid class name */
/* loaded from: classes2.dex */
public class C30U {
    public void A00(final C30T c30t) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new OvershootInterpolator(1.2f));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.30S
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                C30T.this.A01();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                C30T c30t2 = C30T.this;
                c30t2.A01 = true;
                c30t2.A00 = -1.0f;
            }
        });
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.30P
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C30T c30t2 = C30T.this;
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                valueAnimator.getCurrentPlayTime();
                c30t2.A01 = true;
                c30t2.A00 = floatValue;
            }
        });
        ofFloat.start();
    }
}
