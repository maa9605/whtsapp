package com.whatsapp.components;

import X.C02160Ac;
import X.C0DJ;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class SelectionCheckView extends FrameLayout {
    public ShapeDrawable A00;
    public View A01;
    public AnimationSet A02;
    public AnimationSet A03;
    public ScaleAnimation A04;
    public ScaleAnimation A05;
    public ScaleAnimation A06;
    public ScaleAnimation A07;
    public ScaleAnimation A08;
    public ScaleAnimation A09;
    public FrameLayout A0A;
    public ImageView A0B;
    public boolean A0C;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        if (r3 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SelectionCheckView(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.SelectionCheckView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final ScaleAnimation A00(final View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setAnimationListener(new C0DJ() { // from class: X.2jZ
            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                view.setVisibility(0);
            }
        });
        return scaleAnimation;
    }

    public final ScaleAnimation A01(final View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setAnimationListener(new C0DJ() { // from class: X.2ja
            @Override // X.C0DJ, android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(4);
            }
        });
        return scaleAnimation;
    }

    public final void A02() {
        ScaleAnimation A00 = A00(this.A0A);
        this.A06 = A00;
        A00.setStartOffset(20L);
        this.A08 = A00(this.A01);
        ScaleAnimation A002 = A00(this.A0B);
        this.A04 = A002;
        A002.setStartOffset(10L);
        AnimationSet animationSet = new AnimationSet(false);
        this.A02 = animationSet;
        animationSet.addAnimation(this.A06);
        this.A02.addAnimation(this.A08);
        this.A02.addAnimation(this.A04);
        this.A07 = A01(this.A0A);
        ScaleAnimation A01 = A01(this.A01);
        this.A09 = A01;
        A01.setStartOffset(20L);
        ScaleAnimation A012 = A01(this.A0B);
        this.A05 = A012;
        A012.setStartOffset(10L);
        AnimationSet animationSet2 = new AnimationSet(false);
        this.A03 = animationSet2;
        animationSet2.addAnimation(this.A07);
        this.A03.addAnimation(this.A09);
        this.A03.addAnimation(this.A05);
        this.A0C = true;
    }

    public void A03(boolean z, boolean z2) {
        if (!z) {
            if (z2) {
                if (!this.A0C) {
                    A02();
                }
                this.A0A.clearAnimation();
                this.A01.clearAnimation();
                this.A0B.clearAnimation();
                this.A0A.setAnimation(this.A07);
                this.A01.setAnimation(this.A09);
                this.A0B.setAnimation(this.A05);
                this.A0A.setForeground(null);
                this.A03.start();
                return;
            }
            this.A0A.setVisibility(4);
            this.A01.setVisibility(4);
            this.A0B.setVisibility(4);
        } else if (z2) {
            if (!this.A0C) {
                A02();
            }
            setVisibility(0);
            this.A0A.clearAnimation();
            this.A01.clearAnimation();
            this.A0B.clearAnimation();
            this.A0A.setAnimation(this.A06);
            this.A01.setAnimation(this.A08);
            this.A0B.setAnimation(this.A04);
            this.A0A.setForeground(this.A00);
            this.A02.start();
        } else {
            this.A0A.setVisibility(0);
            this.A01.setVisibility(0);
            this.A0B.setVisibility(0);
        }
    }

    public void setIcon(int i) {
        this.A0B.setImageDrawable(C02160Ac.A03(getContext(), i));
    }

    public void setSelectionBackground(int i) {
        this.A01.setBackgroundResource(i);
    }
}
