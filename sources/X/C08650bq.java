package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: X.0bq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08650bq {
    public final ArrayList A03 = new ArrayList();
    public C08690bu A01 = null;
    public ValueAnimator A00 = null;
    public final Animator.AnimatorListener A02 = new AnimatorListenerAdapter() { // from class: X.0br
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C08650bq c08650bq = C08650bq.this;
            if (c08650bq.A00 == animator) {
                c08650bq.A00 = null;
            }
        }
    };

    public void A00(int[] iArr, ValueAnimator valueAnimator) {
        C08690bu c08690bu = new C08690bu(iArr, valueAnimator);
        valueAnimator.addListener(this.A02);
        this.A03.add(c08690bu);
    }
}
