package com.whatsapp;

import X.AbstractC08310bE;
import X.C02160Ac;
import X.C07O;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class WaFrameLayout extends AbstractC08310bE {
    public int A00;

    public WaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        A01(context, attributeSet);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        A01(context, attributeSet);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A2K);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        Drawable background = getBackground();
        if (background != null && this.A00 != 0) {
            setBackgroundDrawable(background);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        Drawable foreground = getForeground();
        if (foreground != null && resourceId != 0) {
            Drawable A0I = C07O.A0I(foreground);
            C07O.A0X(A0I, C02160Ac.A00(context, resourceId));
            setForeground(A0I);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A00 == 0 || drawable == null) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        Drawable A0I = C07O.A0I(drawable);
        C07O.A0X(A0I, C02160Ac.A00(getContext(), this.A00));
        super.setBackgroundDrawable(A0I);
    }
}
