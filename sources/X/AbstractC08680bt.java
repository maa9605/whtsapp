package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.0bt  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC08680bt extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public float A01;
    public boolean A02;
    public final /* synthetic */ C08640bp A03;

    public abstract float A00();

    public AbstractC08680bt(C08640bp c08640bp) {
        this.A03 = c08640bp;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C08770c2 c08770c2 = this.A03.A0H;
        c08770c2.A00(this.A00, c08770c2.A01);
        this.A02 = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (!this.A02) {
            this.A01 = this.A03.A0H.A02;
            this.A00 = A00();
            this.A02 = true;
        }
        C08770c2 c08770c2 = this.A03.A0H;
        float f = this.A01;
        c08770c2.A00((valueAnimator.getAnimatedFraction() * (this.A00 - f)) + f, c08770c2.A01);
    }
}
