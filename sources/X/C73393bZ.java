package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0110000_I1;
import com.google.android.search.verification.client.R;

/* renamed from: X.3bZ */
/* loaded from: classes2.dex */
public class C73393bZ extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C73453bf A01;
    public final /* synthetic */ boolean A02;

    public C73393bZ(C73453bf c73453bf, boolean z, View view) {
        this.A01 = c73453bf;
        this.A02 = z;
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        C73453bf c73453bf = this.A01;
        c73453bf.A0K.setVisibility(8);
        View view = this.A00;
        view.setEnabled(true);
        view.setFocusableInTouchMode(true);
        View findViewById = c73453bf.A0H.findViewById(R.id.voice_note_slide_to_cancel_animation);
        AnimatorSet animatorSet = c73453bf.A0B;
        if (animatorSet != null) {
            animatorSet.end();
        }
        findViewById.setVisibility(8);
        c73453bf.A0H.findViewById(R.id.voice_recorder_decor).setVisibility(8);
        view.requestFocus();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        C73453bf c73453bf = this.A01;
        TextView textView = (TextView) c73453bf.A0H.findViewById(R.id.voice_note_cancel_btn);
        C003301p.A06(textView);
        textView.setOnClickListener(new ViewOnClickEBaseShape1S0110000_I1(this, this.A02, 1));
        final View findViewById = c73453bf.A0H.findViewById(R.id.voice_note_slide_to_cancel_layout);
        findViewById.animate().setDuration(200L).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: X.3bY
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                View view = findViewById;
                view.setVisibility(8);
                view.setAlpha(1.0f);
            }
        }).start();
        textView.setAlpha(0.0f);
        textView.setVisibility(0);
        textView.animate().alpha(1.0f).setDuration(200L).start();
        final C86673y2 c86673y2 = c73453bf.A0b;
        final RunnableEBaseShape9S0100000_I1_1 runnableEBaseShape9S0100000_I1_1 = new RunnableEBaseShape9S0100000_I1_1(this, 25);
        c86673y2.setPivotX(c86673y2.getWidth() / 2);
        c86673y2.setPivotY(c86673y2.A0I / 2);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.3f);
        ofFloat.setDuration(250L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(2);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3bM
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C86673y2 c86673y22 = c86673y2;
                float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                c86673y22.setScaleX(floatValue);
                c86673y22.setScaleY(floatValue);
            }
        });
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(c86673y2.A0O), Integer.valueOf(c86673y2.A0N));
        ofObject.setDuration(250L);
        ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3bI
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C86673y2 c86673y22 = c86673y2;
                c86673y22.A0X.setColorFilter(new PorterDuffColorFilter(((Number) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN));
                c86673y22.A01();
            }
        });
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.3bR
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                C86673y2 c86673y22 = c86673y2;
                c86673y22.A00();
                Runnable runnable = runnableEBaseShape9S0100000_I1_1;
                if (runnable != null) {
                    c86673y22.post(runnable);
                }
            }
        });
        animatorSet.playTogether(ofFloat, ofObject);
        animatorSet.start();
    }
}
