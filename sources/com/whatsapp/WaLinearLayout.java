package com.whatsapp;

import X.AbstractC35341iz;
import X.C02160Ac;
import X.C07O;
import X.C0LX;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class WaLinearLayout extends AbstractC35341iz {
    public int A00;

    public WaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A2N);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            Drawable background = getBackground();
            if (background != null && this.A00 != 0) {
                setBackground(background);
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setTag(R.id.bidilayout_ignore, C0LX.A00);
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (this.A00 == 0 || drawable == null) {
            super.setBackground(drawable);
            return;
        }
        Drawable A0I = C07O.A0I(drawable);
        C07O.A0X(A0I, C02160Ac.A00(getContext(), this.A00));
        super.setBackground(A0I);
    }
}
