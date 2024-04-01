package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.StatusesFragment;

/* renamed from: X.2hx */
/* loaded from: classes2.dex */
public class C54042hx implements InterfaceC53102bt {
    public View A00;
    public View A01;
    public final /* synthetic */ StatusesFragment A02;

    public C54042hx(StatusesFragment statusesFragment) {
        this.A02 = statusesFragment;
    }

    public final void A00(final boolean z, boolean z2) {
        final int measuredHeight = this.A01.getMeasuredHeight();
        if (this.A01.getVisibility() != 0) {
            this.A01.measure(View.MeasureSpec.makeMeasureSpec(this.A00.getMeasuredWidth(), EditorInfoCompat.IME_FLAG_FORCE_ASCII), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = this.A01.getMeasuredHeight();
        }
        StatusesFragment statusesFragment = this.A02;
        ValueAnimator valueAnimator = statusesFragment.A01;
        if (valueAnimator == null || !(valueAnimator.isRunning() || statusesFragment.A01.isStarted())) {
            final int i = 8;
            float f = 100.0f;
            float f2 = 0.0f;
            if (z) {
                i = 0;
                f2 = 100.0f;
                f = 0.0f;
            }
            int i2 = z2 ? 500 : 1;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            statusesFragment.A01 = ofFloat;
            ofFloat.setDuration(i2);
            statusesFragment.A01.setInterpolator(new AccelerateDecelerateInterpolator());
            statusesFragment.A01.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3Ww
                {
                    C54042hx.this = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C54042hx c54042hx = C54042hx.this;
                    int floatValue = (int) (measuredHeight * (((Number) valueAnimator2.getAnimatedValue()).floatValue() / 100.0f));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c54042hx.A01.getLayoutParams();
                    layoutParams.topMargin = -floatValue;
                    c54042hx.A01.setLayoutParams(layoutParams);
                }
            });
            statusesFragment.A01.addListener(new Animator.AnimatorListener() { // from class: X.3X6
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                {
                    C54042hx.this = this;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C54042hx c54042hx = C54042hx.this;
                    c54042hx.A01.setVisibility(i);
                    C2DD c2dd = c54042hx.A02.A0d;
                    c2dd.A04.A01 = false;
                    c2dd.A00();
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    if (z) {
                        C54042hx.this.A01.setVisibility(0);
                    }
                }
            });
            if (z) {
                statusesFragment.A01.setStartDelay(700L);
            }
            statusesFragment.A01.start();
        }
    }

    @Override // X.InterfaceC53102bt
    public View ADs(int i, View view, ViewGroup viewGroup, Context context) {
        if (view != null) {
            this.A00 = view;
            this.A01 = view.findViewById(R.id.status_sharing_row_view);
            return this.A00;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.statuses_row_cross_post, viewGroup, false);
        this.A00 = inflate;
        this.A01 = inflate.findViewById(R.id.status_sharing_row_view);
        StatusesFragment statusesFragment = this.A02;
        statusesFragment.A0d.A00 = new C81713pL(this);
        this.A00.setContentDescription(statusesFragment.A0F(R.string.share_to_facebook_story));
        AnonymousClass088.A1V(this.A00, R.string.share_to_facebook_story);
        this.A00.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 18));
        this.A00.findViewById(R.id.status_row_share_to_third_party_button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 19));
        C2DE c2de = statusesFragment.A0d.A04;
        A00(c2de.A00, c2de.A01);
        return this.A00;
    }
}
