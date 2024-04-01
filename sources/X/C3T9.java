package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.whatsapp.profile.ViewProfilePhoto;

/* renamed from: X.3T9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3T9 extends Fade {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewProfilePhoto A01;

    public C3T9(ViewProfilePhoto viewProfilePhoto, int i) {
        this.A01 = viewProfilePhoto;
        this.A00 = i;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        final int i;
        final ObjectAnimator objectAnimator = (ObjectAnimator) super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (objectAnimator != null && (i = this.A00) != 0) {
            final int statusBarColor = this.A01.getWindow().getStatusBarColor();
            objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3T0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C3T9.this.A01.getWindow().setStatusBarColor(C09990f7.A04(i, statusBarColor, ((Number) objectAnimator.getAnimatedValue()).floatValue()));
                }
            });
        }
        return objectAnimator;
    }
}
