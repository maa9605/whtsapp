package com.whatsapp.components;

import X.C3LJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaLinearLayout;

/* loaded from: classes2.dex */
public class MaxHeightLinearLayout extends C3LJ {
    public int A00;

    public MaxHeightLinearLayout(final Context context, final AttributeSet attributeSet) {
        new WaLinearLayout(context, attributeSet) { // from class: X.3LJ
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
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.A00 > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.A00), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.A00, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            } else if (mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.A00), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            requestLayout();
        }
    }
}
