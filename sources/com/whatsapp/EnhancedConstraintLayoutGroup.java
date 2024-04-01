package com.whatsapp;

import X.C1V4;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class EnhancedConstraintLayoutGroup extends C1V4 {
    public EnhancedConstraintLayoutGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AbstractC07040Wj
    public void A06(ConstraintLayout constraintLayout) {
        super.A06(constraintLayout);
        for (int i : getReferencedIds()) {
            constraintLayout.findViewById(i).setAlpha(getAlpha());
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        A01();
    }
}
