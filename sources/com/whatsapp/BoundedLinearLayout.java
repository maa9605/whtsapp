package com.whatsapp;

import X.C13L;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* loaded from: classes.dex */
public class BoundedLinearLayout extends C13L {
    public int A00;
    public int A01;

    public BoundedLinearLayout(final Context context, final AttributeSet attributeSet) {
        new WaLinearLayout(context, attributeSet) { // from class: X.13L
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC35341iz
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                generatedComponent();
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A0O);
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.A01;
        if (size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, mode);
        } else if (mode == 0 && i3 < Integer.MAX_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(i3, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i4 = this.A00;
        if (size2 > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, mode2);
        } else if (mode2 == 0 && i4 < Integer.MAX_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.A00 = i;
    }

    public void setMaxWidth(int i) {
        this.A01 = i;
    }
}
