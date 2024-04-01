package X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: X.0ns  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14970ns implements Animator.AnimatorListener {
    public float A00;
    public float A01;
    public float A02;
    public boolean A04;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final ValueAnimator A0B;
    public final C0TS A0C;
    public boolean A05 = false;
    public boolean A03 = false;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public C14970ns(C0TS c0ts, int i, float f, float f2, float f3, float f4) {
        this.A0A = i;
        this.A0C = c0ts;
        this.A06 = f;
        this.A07 = f2;
        this.A08 = f3;
        this.A09 = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0B = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0nr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14970ns.this.A00 = valueAnimator.getAnimatedFraction();
            }
        });
        this.A0B.setTarget(c0ts.A0H);
        this.A0B.addListener(this);
        this.A00 = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.A00 = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.A03) {
            this.A0C.A07(true);
        }
        this.A03 = true;
    }
}
