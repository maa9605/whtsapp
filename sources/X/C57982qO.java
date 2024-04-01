package X;

import android.animation.Animator;

/* renamed from: X.2qO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C57982qO implements Animator.AnimatorListener {
    public final /* synthetic */ AbstractActivityC40691si A00;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    public C57982qO(AbstractActivityC40691si abstractActivityC40691si) {
        this.A00 = abstractActivityC40691si;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        AbstractActivityC40691si abstractActivityC40691si = this.A00;
        if (!abstractActivityC40691si.A0h.isEmpty()) {
            abstractActivityC40691si.A06.setVisibility(0);
        } else {
            abstractActivityC40691si.A05.setVisibility(4);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        AbstractActivityC40691si abstractActivityC40691si = this.A00;
        if (!abstractActivityC40691si.A0h.isEmpty()) {
            abstractActivityC40691si.A05.setVisibility(0);
        } else {
            abstractActivityC40691si.A06.setVisibility(8);
        }
    }
}
