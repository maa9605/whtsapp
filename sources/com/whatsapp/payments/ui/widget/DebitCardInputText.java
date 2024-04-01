package com.whatsapp.payments.ui.widget;

import X.AbstractC92354Iy;
import X.C002301c;
import X.C0AT;
import X.C69133Ng;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.widget.DebitCardInputText;

/* loaded from: classes3.dex */
public class DebitCardInputText extends AbstractC92354Iy {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public Paint A06;
    public Paint A07;
    public C002301c A08;
    public boolean A09;
    public float[] A0A;
    public float[] A0B;
    public RectF[] A0C;
    public final int A0D;
    public final int A0E;

    public DebitCardInputText(final Context context, final AttributeSet attributeSet) {
        new WaEditText(context, attributeSet) { // from class: X.4Iy
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC04840Ma
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A25((DebitCardInputText) this);
            }
        };
        this.A01 = 1.0f;
        this.A02 = 2.0f;
        this.A03 = 24.0f;
        this.A04 = 8.0f;
        this.A05 = 4;
        this.A0D = getResources().getColor(R.color.accent_dark);
        this.A0E = getResources().getColor(R.color.payments_light_gray);
        this.A09 = false;
        this.A0B = new float[4];
        this.A01 = A04(1.0f);
        this.A02 = A04(this.A02);
        this.A03 = A04(this.A03);
        this.A04 = A04(this.A04);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C69133Ng.A0u, 0, 0);
        try {
            this.A01 = obtainStyledAttributes.getDimension(2, this.A01);
            this.A00 = obtainStyledAttributes.getDimension(0, 0.0f);
            this.A03 = obtainStyledAttributes.getDimension(1, this.A03);
            this.A04 = obtainStyledAttributes.getDimension(4, this.A04);
            this.A05 = obtainStyledAttributes.getInteger(3, 4);
            obtainStyledAttributes.recycle();
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A05)});
            this.A06 = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A07 = paint;
            paint.setStrokeWidth(this.A01);
            this.A07.setColor(this.A0D);
            setFontSize(this.A00);
            setBackgroundResource(0);
            setFilterTouchesWhenObscured(true);
            setCursorVisible(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int A04(float f) {
        return (int) (f * (getResources().getDisplayMetrics().densityDpi / 160));
    }

    public final void A05(Canvas canvas, float f) {
        float height = canvas.getHeight();
        float textSize = getTextSize();
        Paint paint = new Paint(getPaint());
        paint.setColor(this.A09 ? this.A0D : this.A0E);
        this.A09 = !this.A09;
        paint.setStrokeWidth(5.0f);
        float f2 = f + 5.0f;
        float f3 = height / 2.0f;
        float f4 = textSize / 2.0f;
        canvas.drawLine(f2, f3 - f4, f2, f3 + f4, paint);
    }

    private CharSequence getFullText() {
        return getText();
    }

    public int getMaxNumberOfChars() {
        return this.A05;
    }

    @Override // com.whatsapp.WaEditText, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        Editable text = getText();
        int length = text.length();
        float[] fArr = this.A0B;
        int length2 = fArr.length;
        if (length2 < length) {
            float[] fArr2 = new float[length + 0];
            System.arraycopy(fArr, 0, fArr2, 0, length2);
            fArr = fArr2;
        }
        this.A0B = fArr;
        getPaint().getTextWidths(text, 0, length, this.A0B);
        int i2 = 0;
        while (true) {
            i = this.A05;
            if (i2 >= i) {
                break;
            }
            float f = (this.A00 / 2.0f) + this.A0C[i2].left;
            if (length > i2) {
                canvas.drawText(text, i2, i2 + 1, f - (this.A0B[i2] / 2.0f), this.A0A[i2], this.A06);
            }
            if (length == i2 && hasFocus()) {
                A05(canvas, this.A0C[i2].left);
            }
            RectF rectF = this.A0C[i2];
            canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A07);
            i2++;
        }
        if (length == i && hasFocus()) {
            A05(canvas, this.A0C[i2 - 1].right);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A07;
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        this.A06.setColor(this.A0D);
        int width = (getWidth() - C0AT.A06(this)) - C0AT.A07(this);
        float f = this.A03;
        if (f < 0.0f) {
            this.A00 = width / ((this.A05 * 2.0f) - 1.0f);
        } else if (this.A00 == 0.0f) {
            float f2 = width;
            float f3 = this.A05;
            this.A00 = (f2 - ((f3 - 1.0f) * f)) / f3;
        }
        int i6 = this.A05;
        this.A0C = new RectF[i6];
        this.A0A = new float[i6];
        int height = getHeight() - getPaddingTop();
        if (this.A08.A0N()) {
            i5 = -1;
            A07 = (int) ((getWidth() - C0AT.A07(this)) - this.A00);
        } else {
            A07 = C0AT.A07(this);
            i5 = 1;
        }
        for (int i7 = 0; i7 < this.A05; i7++) {
            float f4 = A07;
            float f5 = height;
            this.A0C[i7] = new RectF(f4, f5, this.A00 + f4, f5);
            float f6 = this.A03;
            if (f6 < 0.0f) {
                A07 = (int) ((i5 * this.A00 * 2.0f) + f4);
            } else {
                A07 = (int) (((this.A00 + f6) * i5) + f4);
            }
            this.A0A[i7] = this.A0C[i7].bottom - this.A04;
        }
    }

    @Override // X.C04850Mb, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    private void setFontSize(float f) {
        this.A06.setTextSize(f);
    }

    public void setSpace(float f) {
        this.A03 = f;
        invalidate();
    }
}
