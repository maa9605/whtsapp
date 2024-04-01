package com.whatsapp;

import X.AbstractC08140aj;
import X.C002301c;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class WaImageView extends AbstractC08140aj {
    public C002301c A00;
    public boolean A01;

    public WaImageView(Context context) {
        super(context);
    }

    public WaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public WaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet == null || this.A00 == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A2M);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(this.A00.A06(resourceId));
        }
        this.A01 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        C002301c c002301c;
        if (this.A01 && (c002301c = this.A00) != null) {
            z = c002301c.A0N();
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, super.getWidth() * 0.5f, super.getHeight() * 0.5f);
            }
        } else {
            z = false;
        }
        super.onDraw(canvas);
        if (this.A01 && z) {
            canvas.restore();
        }
    }
}
