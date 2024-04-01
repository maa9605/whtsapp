package com.whatsapp.payments.ui.widget;

import X.AbstractC92334Im;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* loaded from: classes3.dex */
public class MultiExclusionChip extends AbstractC92334Im {
    public CompoundButton.OnCheckedChangeListener A00;

    public MultiExclusionChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.chip.Chip, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.A00;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    @Override // com.google.android.material.chip.Chip
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00 = onCheckedChangeListener;
    }
}
