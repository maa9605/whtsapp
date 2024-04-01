package com.whatsapp.status.playback.widget;

import X.AnonymousClass024;
import X.C2RX;
import X.C2ZC;
import X.C71753Xi;
import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.status.playback.widget.TextStatusContentView;

/* loaded from: classes2.dex */
public class TextStatusContentView extends C2ZC {
    public float A00;

    public TextStatusContentView(final Context context, final AttributeSet attributeSet) {
        new TextEmojiLabel(context, attributeSet) { // from class: X.2ZC
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC02680Ck, X.AbstractC02690Cm
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A2j((TextStatusContentView) this);
            }
        };
    }

    public final void A07() {
        if (this.A00 == 0.0f) {
            this.A00 = getPaint().getTextSize();
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth > 0 && measuredHeight > 0) {
            CharSequence text = getText();
            TransformationMethod transformationMethod = getTransformationMethod();
            if (transformationMethod != null) {
                text = transformationMethod.getTransformation(text, this);
            }
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
            textPaint.setTextSize(f2);
            while (textPaint.getTextSize() > 2.0f) {
                C2RX.A00(text, textPaint);
                Layout A6q = C71753Xi.A00.A6q(AnonymousClass024.A09(text), textPaint, this, measuredWidth);
                if (A6q.getHeight() <= measuredHeight) {
                    int lineCount = A6q.getLineCount();
                    boolean z = true;
                    for (int i = 0; i < lineCount; i++) {
                        if (A6q.getLineMax(i) > measuredWidth) {
                            z = false;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
                textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
            }
            super.setTextSize(0, textPaint.getTextSize());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        A07();
    }

    @Override // X.C02700Cn, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A07();
    }

    @Override // com.whatsapp.TextEmojiLabel, com.whatsapp.WaTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        A07();
    }

    @Override // X.C02700Cn, android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.A00 = getPaint().getTextSize();
        A07();
    }
}
