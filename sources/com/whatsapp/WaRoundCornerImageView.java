package com.whatsapp;

import X.AbstractC08270b6;
import X.C49582Lf;
import X.ViewTreeObserver$OnGlobalLayoutListenerC26881Lc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewTreeObserver;
import com.whatsapp.WaRoundCornerImageView;

/* loaded from: classes.dex */
public class WaRoundCornerImageView extends AbstractC08270b6 {
    public float A00;
    public Path A01;
    public ViewTreeObserver$OnGlobalLayoutListenerC26881Lc A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Lc] */
    public WaRoundCornerImageView(final Context context, final AttributeSet attributeSet) {
        new WaImageView(context, attributeSet) { // from class: X.0b6
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08140aj
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A0J((WaRoundCornerImageView) this);
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A2O);
            try {
                this.A00 = obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A02 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.1Lc
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= 21) {
                    WaRoundCornerImageView waRoundCornerImageView = WaRoundCornerImageView.this;
                    Path path = new Path();
                    waRoundCornerImageView.A01 = path;
                    int left = waRoundCornerImageView.getLeft();
                    int top = waRoundCornerImageView.getTop();
                    float f = waRoundCornerImageView.A00;
                    path.addRoundRect(waRoundCornerImageView.getPaddingLeft() + left, waRoundCornerImageView.getPaddingTop() + top, waRoundCornerImageView.getRight() - waRoundCornerImageView.getPaddingRight(), waRoundCornerImageView.getBottom() - waRoundCornerImageView.getPaddingBottom(), f, f, Path.Direction.CCW);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        getViewTreeObserver().removeGlobalOnLayoutListener(this.A02);
        super.onDetachedFromWindow();
    }

    @Override // com.whatsapp.WaImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }
}
