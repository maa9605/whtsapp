package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.0TT  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0TT {
    public int A00 = -1;
    public WeakReference A01;

    public C0TT(View view) {
        this.A01 = new WeakReference(view);
    }

    public void A00() {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void A01() {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public void A02(float f) {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public void A03(float f) {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public void A04(long j) {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void A05(final View view, final C0TU c0tu) {
        if (c0tu != null) {
            view.animate().setListener(new AnimatorListenerAdapter() { // from class: X.0ki
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    C0TU.this.AH6(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C0TU.this.AH8(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    C0TU.this.AHC(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    public void A06(C0TU c0tu) {
        View view = (View) this.A01.get();
        if (view != null) {
            A05(view, c0tu);
        }
    }

    public void A07(final InterfaceC13190kk interfaceC13190kk) {
        final View view = (View) this.A01.get();
        if (view == null || Build.VERSION.SDK_INT < 19) {
            return;
        }
        view.animate().setUpdateListener(interfaceC13190kk != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: X.0kj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ((View) ((C28301Rg) InterfaceC13190kk.this).A00.A08.getParent()).invalidate();
            }
        } : null);
    }
}
