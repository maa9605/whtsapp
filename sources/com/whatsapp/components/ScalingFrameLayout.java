package com.whatsapp.components;

import X.C002301c;
import X.C2Vj;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class ScalingFrameLayout extends C2Vj {
    public float A00;
    public C002301c A01;

    public ScalingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 1.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (this.A01.A0N()) {
            canvas.translate(getWidth(), 0.0f);
        }
        float f = this.A00;
        canvas.scale(f, f);
        if (this.A01.A0N()) {
            canvas.translate(-getWidth(), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.A00), mode), View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) / this.A00), mode2));
        setMeasuredDimension((int) (getMeasuredWidth() * this.A00), (int) (getMeasuredHeight() * this.A00));
    }

    public void setScale(float f) {
        this.A00 = f;
    }
}
