package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1om  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38661om extends C1V7 {
    public C38661om() {
    }

    public C38661om(int i) {
        if ((i & (-4)) == 0) {
            ((C1V7) this).A00 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // X.AbstractC16120ps
    public void A0U(C16160pw c16160pw) {
        C1V7.A03(c16160pw);
        c16160pw.A02.put("android:fade:transitionAlpha", Float.valueOf(C16220q2.A04.A00(c16160pw.A00)));
    }

    @Override // X.C1V7
    public Animator A0V(ViewGroup viewGroup, View view, C16160pw c16160pw, C16160pw c16160pw2) {
        float f;
        Number number;
        if (c16160pw != null && (number = (Number) c16160pw.A02.get("android:fade:transitionAlpha")) != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        return A0X(view, f != 1.0f ? f : 0.0f, 1.0f);
    }

    @Override // X.C1V7
    public Animator A0W(ViewGroup viewGroup, View view, C16160pw c16160pw, C16160pw c16160pw2) {
        float f;
        Number number;
        C16220q2.A04.A02(view);
        if (c16160pw != null && (number = (Number) c16160pw.A02.get("android:fade:transitionAlpha")) != null) {
            f = number.floatValue();
        } else {
            f = 1.0f;
        }
        return A0X(view, f, 0.0f);
    }

    public final Animator A0X(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C16220q2.A04.A03(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C16220q2.A03, f2);
        ofFloat.addListener(new AnimatorListenerAdapter(view) { // from class: X.0pi
            public boolean A00 = false;
            public final View A01;

            {
                this.A01 = view;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                View view2 = this.A01;
                C16220q2.A04.A03(view2, 1.0f);
                if (this.A00) {
                    view2.setLayerType(0, null);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                View view2 = this.A01;
                if (view2.hasOverlappingRendering() && view2.getLayerType() == 0) {
                    this.A00 = true;
                    view2.setLayerType(2, null);
                }
            }
        });
        A07(new C1V0() { // from class: X.1ol
            @Override // X.InterfaceC16110pr
            public void APu(AbstractC16120ps abstractC16120ps) {
                View view2 = view;
                C16230q3 c16230q3 = C16220q2.A04;
                c16230q3.A03(view2, 1.0f);
                c16230q3.A01(view2);
                abstractC16120ps.A08(this);
            }
        });
        return ofFloat;
    }
}
