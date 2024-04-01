package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.whatsapp.profile.ViewProfilePhoto;

/* renamed from: X.3T8  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3T8 extends Fade {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewProfilePhoto A02;

    public C3T8(ViewProfilePhoto viewProfilePhoto, float f, int i) {
        this.A02 = viewProfilePhoto;
        this.A00 = f;
        this.A01 = i;
    }

    @Override // android.transition.Fade, android.transition.Visibility, android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        float f = this.A00;
        if (f != 0.0f) {
            transitionValues.values.put("android:fade:transitionAlpha", Float.valueOf(f));
        }
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        final int i;
        final ObjectAnimator objectAnimator = (ObjectAnimator) super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (objectAnimator != null && (i = this.A01) != 0) {
            final float f = this.A00;
            objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Sz
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C3T8 c3t8 = C3T8.this;
                    ObjectAnimator objectAnimator2 = objectAnimator;
                    float f2 = f;
                    c3t8.A02.getWindow().setStatusBarColor(C09990f7.A04(i, -16777216, (((Number) objectAnimator2.getAnimatedValue()).floatValue() - f2) / (1.0f - f2)));
                }
            });
        }
        return objectAnimator;
    }
}
