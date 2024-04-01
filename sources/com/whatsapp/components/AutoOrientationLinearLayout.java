package com.whatsapp.components;

import X.C36F;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public final class AutoOrientationLinearLayout extends C36F {
    public AutoOrientationLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        post(new RunnableEBaseShape8S0100000_I1_0(this, 17));
    }
}
