package com.whatsapp.components;

import X.C36G;
import X.C57592pg;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import com.whatsapp.components.CircularRevealView;

/* loaded from: classes2.dex */
public class CircularRevealView extends C36G {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Animator.AnimatorListener A05;
    public Paint A06;
    public Path A07;
    public RectF A08;
    public Animation.AnimationListener A09;
    public C57592pg A0A;
    public boolean A0B;
    public boolean A0C;

    public CircularRevealView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0C = true;
        this.A04 = 300;
        this.A03 = -1;
        this.A06 = new Paint(1);
        this.A07 = new Path();
        this.A08 = new RectF();
        this.A09 = new Animation.AnimationListener() { // from class: X.2pd
            {
                CircularRevealView.this = this;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                CircularRevealView.this.A0B = false;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                CircularRevealView.this.A0B = true;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                CircularRevealView.this.A0B = true;
            }
        };
        this.A05 = new AnimatorListenerAdapter() { // from class: X.2pe
            {
                CircularRevealView.this = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                CircularRevealView.this.A0B = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CircularRevealView.this.A0B = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CircularRevealView.this.A0B = true;
            }
        };
    }

    public void A00() {
        if (this.A0C) {
            super.clearAnimation();
        }
    }

    public void A01(boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < 21) {
                A00();
                C57592pg c57592pg = new C57592pg(this, true);
                this.A0A = c57592pg;
                c57592pg.setDuration(this.A04);
                this.A0A.setAnimationListener(this.A09);
                startAnimation(this.A0A);
                return;
            }
            int max = Math.max(getWidth(), getHeight());
            if (isAttachedToWindow()) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.A01, this.A02, max, 0.0f);
                createCircularReveal.setDuration(this.A04);
                createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: X.2pf
                    {
                        CircularRevealView.this = this;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        CircularRevealView.this.setVisibility(8);
                    }
                });
                createCircularReveal.addListener(this.A05);
                createCircularReveal.start();
                return;
            }
            setVisibility(8);
            return;
        }
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 21) {
            clearAnimation();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = Build.VERSION.SDK_INT;
        if (i < 21 && this.A03 != -1) {
            float sqrt = (float) (Math.sqrt((getHeight() * getHeight()) + (getWidth() * getWidth())) * this.A00);
            float f = -sqrt;
            this.A08.set(f, f, sqrt, sqrt);
            this.A08.offset(this.A01, this.A02);
            this.A06.setColor(this.A03);
            this.A06.setStyle(Paint.Style.FILL);
            canvas.drawArc(this.A08, 0.0f, 360.0f, true, this.A06);
        } else if (i >= 21 || i < 18) {
        } else {
            float sqrt2 = (float) (Math.sqrt((getHeight() * getHeight()) + (getWidth() * getWidth())) * this.A00);
            float f2 = -sqrt2;
            this.A08.set(f2, f2, sqrt2, sqrt2);
            this.A08.offset(this.A01, this.A02);
            this.A06.setColor(this.A03);
            this.A06.setStyle(Paint.Style.FILL);
            this.A07.reset();
            this.A07.addArc(this.A08, 0.0f, 360.0f);
            canvas.clipPath(this.A07);
        }
    }

    public void setColor(int i) {
        this.A03 = i;
    }

    public void setDuration(int i) {
        this.A04 = i;
    }

    public void setShouldClearOnRestart(boolean z) {
        this.A0C = z;
    }
}
