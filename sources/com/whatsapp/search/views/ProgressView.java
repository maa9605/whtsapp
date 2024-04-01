package com.whatsapp.search.views;

import X.AbstractC80773np;
import X.AnonymousClass088;
import X.C0AT;
import X.C40731sm;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;

/* loaded from: classes2.dex */
public class ProgressView extends AbstractC80773np {
    public AnimatorSet A00;
    public final int A01;
    public final CircularProgressBar A02;

    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        FrameLayout.inflate(context, R.layout.search_progress, this);
        this.A02 = (CircularProgressBar) C0AT.A0D(this, R.id.progress_bar);
        this.A01 = AnonymousClass088.A02(getContext(), 40.0f);
    }

    public final void A00(boolean z) {
        int i;
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.A00 = new AnimatorSet();
        float f = 0.0f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.0f;
            f = 1.0f;
        }
        if (z) {
            i = this.A01;
        } else {
            i = 0;
        }
        ValueAnimator A06 = C40731sm.A06(this, i, null);
        CircularProgressBar circularProgressBar = this.A02;
        this.A00.playTogether(A06, ObjectAnimator.ofFloat(circularProgressBar, "scaleX", f2, f), ObjectAnimator.ofFloat(circularProgressBar, "scaleY", f2, f));
        this.A00.setStartDelay(z ? 800L : 0L);
        this.A00.setDuration(800L);
        this.A00.start();
    }
}
