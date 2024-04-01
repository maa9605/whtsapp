package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Outline;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;

/* renamed from: X.1M4  reason: invalid class name */
/* loaded from: classes.dex */
public class C1M4 extends Transition {
    public static final String[] A02 = {"circleTransition:transforms"};
    public final boolean A00;
    public final boolean A01;

    public C1M4(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    @Override // android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        transitionValues.values.put("circleTransition:transforms", new C1M3(transitionValues.view));
    }

    @Override // android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        transitionValues.values.put("circleTransition:transforms", new C1M3(transitionValues.view));
    }

    @Override // android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, final TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            C1M3 c1m3 = (C1M3) transitionValues.values.get("circleTransition:transforms");
            final C1M3 c1m32 = (C1M3) transitionValues2.values.get("circleTransition:transforms");
            if (c1m3 != null && c1m32 != null && !c1m3.equals(c1m32)) {
                float f = c1m3.A05 * c1m3.A00;
                int i = c1m32.A05;
                float f2 = i;
                float f3 = c1m32.A00;
                float f4 = ((f - (f2 * f3)) / 2.0f) + (-c1m32.A06) + c1m3.A06 + c1m3.A02;
                float f5 = (-c1m32.A07) + c1m3.A07;
                float f6 = c1m3.A04 * c1m3.A01;
                int i2 = c1m32.A04;
                float f7 = i2;
                float f8 = c1m32.A01;
                float f9 = ((f6 - (f7 * f8)) / 2.0f) + f5 + c1m3.A03;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues2.view, View.TRANSLATION_X, View.TRANSLATION_Y, getPathMotion().getPath(f4, f9, c1m32.A02, c1m32.A03));
                transitionValues2.view.setTranslationX(f4);
                transitionValues2.view.setTranslationY(f9);
                float min = Math.min(f / f2, f6 / f7);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(transitionValues2.view, View.SCALE_X, min, f3);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(transitionValues2.view, View.SCALE_Y, min, f8);
                float min2 = Math.min(i, i2) / 2;
                float sqrt = (float) (Math.sqrt((i2 * i2) + (i * i)) / 2.0d);
                View view = transitionValues2.view;
                int i3 = i / 2;
                int i4 = i2 / 2;
                float f10 = sqrt;
                if (this.A01) {
                    f10 = min2;
                }
                boolean z = this.A00;
                if (!z) {
                    min2 = sqrt;
                }
                C1M5 c1m5 = new C1M5(ViewAnimationUtils.createCircularReveal(view, i3, i4, f10, min2));
                transitionValues2.view.setAlpha(0.0f);
                c1m5.addListener(new AnimatorListenerAdapter() { // from class: X.1M1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        transitionValues2.view.setAlpha(1.0f);
                    }
                });
                if (z) {
                    transitionValues2.view.setOutlineProvider(new ViewOutlineProvider() { // from class: X.1M2
                        @Override // android.view.ViewOutlineProvider
                        public void getOutline(View view2, Outline outline) {
                            C1M3 c1m33 = c1m32;
                            outline.setOval(0, 0, c1m33.A05, c1m33.A04);
                        }
                    });
                    transitionValues2.view.setClipToOutline(true);
                    transitionValues2.view.invalidateOutline();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, c1m5, ofFloat2, ofFloat3);
                animatorSet.setInterpolator(getInterpolator());
                return animatorSet;
            }
        }
        return null;
    }

    @Override // android.transition.Transition
    public String[] getTransitionProperties() {
        return A02;
    }
}
