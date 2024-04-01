package com.whatsapp.components;

import X.AbstractC51242Vh;
import X.C002301c;
import X.C49582Lf;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.components.RoundCornerProgressBar;

/* loaded from: classes2.dex */
public class RoundCornerProgressBar extends AbstractC51242Vh {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C002301c A05;
    public boolean A06;
    public final Paint A07;
    public final RectF A08;

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A06 = true;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A04 = 10;
        this.A03 = -15561602;
        this.A01 = -920588;
        this.A07 = new Paint(1);
        this.A08 = new RectF();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A1h);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, 10);
            this.A03 = obtainStyledAttributes.getInteger(1, -15561602);
            this.A01 = obtainStyledAttributes.getInteger(0, -920588);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.A02;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f = (this.A00 / 100.0f) * ((width - paddingLeft) - paddingRight);
        float f2 = (isInEditMode() || this.A05.A0M()) ? paddingLeft + f : (width - f) - paddingRight;
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) >> 1) + getPaddingTop();
        Paint paint = this.A07;
        paint.setColor(this.A01);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.A08;
        rectF.set(0.0f, height - (this.A04 >> 1), getWidth(), (this.A04 >> 1) + height);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A03);
        if (!isInEditMode() && !this.A05.A0M()) {
            int i = this.A04 >> 1;
            rectF.set(f2, height - i, width - paddingRight, i + height);
        } else {
            int i2 = this.A04 >> 1;
            rectF.set(paddingLeft, height - i2, f2, i2 + height);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingBottom() + getPaddingTop() + this.A04;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public void setProgress(int i) {
        if (i >= 0 && i <= 100) {
            if (i != this.A02) {
                this.A02 = i;
                if (!this.A06) {
                    this.A00 = i;
                    invalidate();
                    return;
                } else if (i > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, i);
                    ofFloat.setDuration((int) Math.max(200.0f, (this.A02 / 100.0f) * 650.0f));
                    ofFloat.setInterpolator(new DecelerateInterpolator());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.2pZ
                        {
                            RoundCornerProgressBar.this = this;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            RoundCornerProgressBar roundCornerProgressBar = RoundCornerProgressBar.this;
                            roundCornerProgressBar.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
                            roundCornerProgressBar.postInvalidate();
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.2pk
                        {
                            RoundCornerProgressBar.this = this;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            RoundCornerProgressBar.this.A06 = false;
                        }
                    });
                    ofFloat.setStartDelay(300L);
                    ofFloat.start();
                    return;
                } else {
                    this.A00 = i;
                    this.A06 = false;
                    invalidate();
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Progress must be between 0 and 100 inclusive");
    }
}
