package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1V6  reason: invalid class name */
/* loaded from: classes.dex */
public class C1V6 extends AnimatorListenerAdapter implements InterfaceC16110pr, InterfaceC15920pY {
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public boolean A00 = false;
    public final boolean A05 = true;

    @Override // X.InterfaceC16110pr
    public void APx(AbstractC16120ps abstractC16120ps) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public C1V6(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        A00(true);
    }

    public final void A00(boolean z) {
        ViewGroup viewGroup;
        if (!this.A05 || this.A01 == z || (viewGroup = this.A04) == null) {
            return;
        }
        this.A01 = z;
        C07O.A0d(viewGroup, z);
    }

    @Override // X.InterfaceC16110pr
    public void APu(AbstractC16120ps abstractC16120ps) {
        if (!this.A00) {
            C16220q2.A01(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
        abstractC16120ps.A08(this);
    }

    @Override // X.InterfaceC16110pr
    public void APv(AbstractC16120ps abstractC16120ps) {
        A00(false);
    }

    @Override // X.InterfaceC16110pr
    public void APw(AbstractC16120ps abstractC16120ps) {
        A00(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            C16220q2.A01(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, X.InterfaceC15920pY
    public void onAnimationPause(Animator animator) {
        if (this.A00) {
            return;
        }
        C16220q2.A01(this.A03, this.A02);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, X.InterfaceC15920pY
    public void onAnimationResume(Animator animator) {
        if (this.A00) {
            return;
        }
        C16220q2.A01(this.A03, 0);
    }
}
