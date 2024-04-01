package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AccelerateInterpolator;

/* renamed from: X.3NK  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3NK {
    public float A00;
    public int A01;
    public ValueAnimator A02;
    public ValueAnimator A03;
    public PointF A04;
    public boolean A05;

    public C3NK(final long j, PointF pointF, final int i, final float f, final float f2, final C76913hM c76913hM) {
        this.A04 = pointF;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(1.2f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A02 = ofFloat;
        ofFloat.setDuration(250L);
        this.A02.setInterpolator(accelerateInterpolator);
        this.A02.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3ND
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3NK c3nk = C3NK.this;
                float f3 = f;
                float f4 = f2;
                int i2 = i;
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                c3nk.A00 = Math.max(f3, ((f4 - f3) * floatValue) + f3);
                float f5 = i2;
                c3nk.A01 = (int) Math.min(f5, Math.min(1.2f * floatValue, floatValue) * f5);
            }
        });
        this.A02.addListener(new AnimatorListenerAdapter() { // from class: X.3NI
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C3NK c3nk = C3NK.this;
                if (c3nk.A03.isRunning() || !c3nk.A05) {
                    return;
                }
                c3nk.A03.start();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C76913hM c76913hM2 = c76913hM;
                Handler handler = c76913hM2.A00;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    c76913hM2.A00 = handler;
                }
                handler.post(c76913hM2.A01);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A03 = ofFloat2;
        ofFloat2.setDuration(200L);
        this.A03.setInterpolator(accelerateInterpolator);
        this.A03.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3NC
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3NK c3nk = C3NK.this;
                float f3 = f;
                float f4 = f2;
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                c3nk.A00 = Math.min(c3nk.A00, Math.max(f3, f4 - ((0.5f * floatValue) * (f4 - f3))));
                float f5 = c3nk.A01;
                c3nk.A01 = (int) Math.max(f5 - (floatValue * f5), 0.0f);
            }
        });
        this.A03.addListener(new AnimatorListenerAdapter() { // from class: X.3NJ
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C76913hM.this.A02.A0C.remove(Long.valueOf(j));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C76913hM c76913hM2 = C76913hM.this;
                Handler handler = c76913hM2.A00;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    c76913hM2.A00 = handler;
                }
                handler.post(c76913hM2.A01);
            }
        });
    }
}
