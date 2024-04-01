package com.whatsapp.components;

import X.AbstractC51232Vc;
import X.C002301c;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class FloatingActionButton extends AbstractC51232Vc {
    public C002301c A00;

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.CENTER);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A0p);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(this.A00.A06(resourceId));
            }
            obtainStyledAttributes.recycle();
        }
    }
}
