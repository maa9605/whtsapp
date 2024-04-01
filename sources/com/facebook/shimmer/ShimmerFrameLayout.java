package com.facebook.shimmer;

import X.AbstractC20660xu;
import X.C20650xt;
import X.C20670xv;
import X.C20690xx;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00;
    public final Paint A01;
    public final C20690xx A02;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = new Paint();
        this.A02 = new C20690xx();
        this.A00 = true;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A02(new AbstractC20660xu() { // from class: X.1Yt
                {
                    this.A00.A0F = true;
                }
            }.A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20650xt.A00, 0, 0);
        try {
            AbstractC20660xu abstractC20660xu = (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) ? new AbstractC20660xu() { // from class: X.1Yu
                {
                    this.A00.A0F = false;
                }

                @Override // X.AbstractC20660xu
                public AbstractC20660xu A00(TypedArray typedArray) {
                    super.A00(typedArray);
                    if (typedArray.hasValue(2)) {
                        C20670xv c20670xv = this.A00;
                        c20670xv.A05 = (typedArray.getColor(2, c20670xv.A05) & 16777215) | (c20670xv.A05 & (-16777216));
                    }
                    if (typedArray.hasValue(12)) {
                        C20670xv c20670xv2 = this.A00;
                        c20670xv2.A09 = typedArray.getColor(12, c20670xv2.A09);
                    }
                    return this;
                }
            } : new AbstractC20660xu() { // from class: X.1Yt
                {
                    this.A00.A0F = true;
                }
            };
            abstractC20660xu.A00(obtainStyledAttributes);
            A02(abstractC20660xu.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A00() {
        C20690xx c20690xx = this.A02;
        ValueAnimator valueAnimator = c20690xx.A00;
        if (valueAnimator == null || valueAnimator.isStarted() || c20690xx.getCallback() == null) {
            return;
        }
        c20690xx.A00.start();
    }

    public void A01() {
        C20690xx c20690xx = this.A02;
        ValueAnimator valueAnimator = c20690xx.A00;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        c20690xx.A00.cancel();
    }

    public void A02(C20670xv c20670xv) {
        boolean z;
        C20690xx c20690xx = this.A02;
        c20690xx.A01 = c20670xv;
        c20690xx.A04.setXfermode(new PorterDuffXfermode(c20670xv.A0F ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        c20690xx.A01();
        if (c20690xx.A01 != null) {
            ValueAnimator valueAnimator = c20690xx.A00;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                c20690xx.A00.cancel();
                c20690xx.A00.removeAllUpdateListeners();
            } else {
                z = false;
            }
            C20670xv c20670xv2 = c20690xx.A01;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (c20670xv2.A0E / c20670xv2.A0D)) + 1.0f);
            c20690xx.A00 = ofFloat;
            ofFloat.setRepeatMode(c20690xx.A01.A0B);
            c20690xx.A00.setRepeatCount(c20690xx.A01.A0A);
            ValueAnimator valueAnimator2 = c20690xx.A00;
            C20670xv c20670xv3 = c20690xx.A01;
            valueAnimator2.setDuration(c20670xv3.A0D + c20670xv3.A0E);
            c20690xx.A00.addUpdateListener(c20690xx.A02);
            if (z) {
                c20690xx.A00.start();
            }
        }
        c20690xx.invalidateSelf();
        if (c20670xv.A0H) {
            setLayerType(2, this.A01);
        } else {
            setLayerType(0, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02.A00();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A02;
    }
}
