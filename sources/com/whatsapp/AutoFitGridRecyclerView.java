package com.whatsapp;

import X.AbstractC08100ac;
import X.C002301c;
import X.C0SV;
import X.C35301iv;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;

/* loaded from: classes.dex */
public class AutoFitGridRecyclerView extends AbstractC08100ac {
    public int A00;
    public C002301c A01;

    public AutoFitGridRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A0J);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, this.A00);
            i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            obtainStyledAttributes.recycle();
        }
        A0k(new C35301iv(this.A01, i));
        setLayoutManager(new GridLayoutManager(1));
        this.A0i = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00 > 0) {
            C0SV c0sv = this.A0S;
            if (c0sv instanceof GridLayoutManager) {
                ((GridLayoutManager) c0sv).A1q(Math.max(1, getMeasuredWidth() / this.A00));
            }
        }
    }
}
