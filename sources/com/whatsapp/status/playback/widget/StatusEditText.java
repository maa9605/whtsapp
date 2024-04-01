package com.whatsapp.status.playback.widget;

import X.AnonymousClass024;
import X.C2RX;
import X.C2ZA;
import X.C71753Xi;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextPaint;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class StatusEditText extends C2ZA {
    public float A00;

    public StatusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void A0F() {
        if (this.A00 == 0.0f) {
            this.A00 = getPaint().getTextSize();
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        Editable text = getText();
        float f = this.A00;
        TextPaint textPaint = new TextPaint(getPaint());
        float f2 = f;
        float f3 = 2.0f;
        while (true) {
            if (f - f3 <= 2.0f) {
                f2 = f3;
                break;
            }
            textPaint.setTextSize(f2);
            C2RX.A00(text, textPaint);
            if (C71753Xi.A00.A6q(AnonymousClass024.A09(text), textPaint, this, measuredWidth).getHeight() > measuredHeight) {
                f = f2;
            } else if (this.A00 == f2) {
                break;
            } else {
                f3 = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        super.setTextSize(0, f2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        A0F();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (selectionStart < 0 || selectionEnd < 0) {
            return;
        }
        setSelection(0);
        post(new RunnableEBaseShape0S0102000_I0(this, selectionStart, selectionEnd));
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A0F();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A00 = getPaint().getTextSize();
        A0F();
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface) {
        super.setTypeface(typeface);
        A0F();
    }
}
