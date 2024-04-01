package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

/* renamed from: X.1Aa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C24241Aa extends AnimatorListenerAdapter {
    public final /* synthetic */ HideBottomViewOnScrollBehavior A00;

    public C24241Aa(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.A00 = hideBottomViewOnScrollBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.A00.A02 = null;
    }
}
