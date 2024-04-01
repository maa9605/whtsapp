package com.whatsapp.text;

import X.C2ZI;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class CondensedTextView extends C2ZI {
    public float A00;
    public TextPaint A01;

    public CondensedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.8f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, i);
        this.A00 = 0.8f;
    }

    public final void A02(String str) {
        int measuredWidth;
        TextPaint textPaint = this.A01;
        if (textPaint == null || textPaint.getTextSize() != getPaint().getTextSize()) {
            TextPaint textPaint2 = new TextPaint(getPaint());
            this.A01 = textPaint2;
            textPaint2.setTextScaleX(1.0f);
        }
        float measureText = this.A01.measureText(str);
        if (measureText <= 0.0f || (measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight()) <= 0) {
            return;
        }
        float f = measuredWidth;
        float f2 = f / measureText;
        if (f2 < 1.0f) {
            float max = Math.max(this.A00, f2);
            setTextScaleX(max);
            float measureText2 = getPaint().measureText(str);
            while (measureText2 > f && max > this.A00) {
                max *= 0.99f;
                setTextScaleX(max);
                measureText2 = getPaint().measureText(str);
            }
            setSingleLine(true);
            setHorizontallyScrolling(false);
        } else if (getTextScaleX() != 1.0f) {
            setTextScaleX(1.0f);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        A02(getText().toString());
    }

    @Override // X.C02700Cn, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A02(getText().toString());
    }

    @Override // com.whatsapp.WaTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A02(charSequence.toString());
    }

    public void setTextScaleLimit(float f) {
        this.A00 = f;
    }

    @Override // X.C02700Cn, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A01.setTextSize(getPaint().getTextSize());
        A02(getText().toString());
    }
}
