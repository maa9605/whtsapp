package com.whatsapp.storage;

import X.C002301c;
import X.C02180Ae;
import X.C08540bf;
import X.C2ZE;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.WaTextView;
import com.whatsapp.storage.SizeTickerView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SizeTickerView extends C2ZE {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AnimatorSet A06;
    public C002301c A07;

    public SizeTickerView(final Context context, final AttributeSet attributeSet) {
        new WaTextView(context, attributeSet, 0) { // from class: X.2ZE
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC02690Cm
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A2k((SizeTickerView) this);
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A2J);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        this.A00 = 300;
        setTextSize(0, this.A04);
    }

    public final void A02() {
        CharSequence[] split = C02180Ae.A0k(this.A07, this.A05).split(" ");
        int length = split.length;
        if (length == 0) {
            setText("");
        } else if (length == 1) {
            setText(split[0]);
        } else {
            SpannableString spannableString = new SpannableString(split[1]);
            spannableString.setSpan(new AbsoluteSizeSpan(this.A03), 0, split[1].length(), 18);
            setText(TextUtils.concat(split[0], " ", spannableString));
        }
    }

    public void A03(final long j, final int i, boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            AnimatorSet animatorSet = this.A06;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A06 = new AnimatorSet();
            final long j2 = this.A05;
            if (j2 != j) {
                ValueAnimator ofInt = ValueAnimator.ofInt(0, 10);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3YO
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SizeTickerView sizeTickerView = SizeTickerView.this;
                        long j3 = j2;
                        sizeTickerView.A05 = (((float) ((j - j3) * ((Number) valueAnimator.getAnimatedValue()).intValue())) / 10.0f) + ((float) j3);
                        sizeTickerView.A02();
                    }
                });
                arrayList.add(ofInt);
            }
            if (this.A02 != i) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.A02), Integer.valueOf(i));
                ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.3YP
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SizeTickerView sizeTickerView = SizeTickerView.this;
                        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
                        sizeTickerView.A02 = intValue;
                        sizeTickerView.setTextColor(intValue);
                    }
                });
                arrayList.add(ofObject);
            }
            this.A06.addListener(new AnimatorListenerAdapter() { // from class: X.3YZ
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    SizeTickerView sizeTickerView = SizeTickerView.this;
                    sizeTickerView.A06 = null;
                    long j3 = j;
                    int i2 = i;
                    sizeTickerView.A05 = j3;
                    sizeTickerView.A02 = i2;
                    sizeTickerView.setTextColor(i2);
                    sizeTickerView.A02();
                }
            });
            this.A06.setInterpolator(new LinearInterpolator());
            this.A06.setDuration(this.A01);
            this.A06.setStartDelay(this.A00);
            this.A06.playTogether(arrayList);
            this.A06.start();
            return;
        }
        AnimatorSet animatorSet2 = this.A06;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.A05 = j;
        this.A02 = i;
        setTextColor(i);
        A02();
    }
}
