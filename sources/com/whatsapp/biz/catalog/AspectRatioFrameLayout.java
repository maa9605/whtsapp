package com.whatsapp.biz.catalog;

import X.C08540bf;
import X.C2VG;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class AspectRatioFrameLayout extends C2VG {
    public float A00;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A00 = 1.0f;
        A01(context, attributeSet);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 1.0f;
        A01(context, attributeSet);
    }

    public void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C08540bf.A0J, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.A00), 1073741824));
        } else if (mode2 == 1073741824) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.A00), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
