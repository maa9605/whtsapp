package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.2YG  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C2YG extends C2YH implements TextWatcher {
    public float A00;
    public int A01;
    public int A02;
    public Handler A03;
    public Runnable A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final RectF A09;

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public abstract int getCursorColor();

    public abstract int getCursorVerticalPadding();

    public abstract int getCursorWidth();

    @Override // android.widget.TextView, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C2YG(final Context context, final AttributeSet attributeSet) {
        new InterceptingEditText(context, attributeSet) { // from class: X.2YH
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08220ax, X.AbstractC04840Ma
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A23((C2YG) this);
            }
        };
        this.A08 = new Paint(1);
        this.A09 = new RectF();
        this.A05 = false;
        this.A03 = new Handler(Looper.getMainLooper());
        this.A04 = new RunnableEBaseShape4S0100000_I0_4(this, 39);
        this.A02 = getCursorWidth();
        this.A01 = getCursorVerticalPadding();
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setColor(getCursorColor());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
        this.A00 = paymentAmountInputField.A04(editable.toString(), paymentAmountInputField.getTextSize());
    }

    @Override // android.view.View
    public boolean hasFocus() {
        return this.A06;
    }

    @Override // com.whatsapp.WaEditText, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A05 && this.A07) {
            RectF rectF = this.A09;
            float f = this.A00;
            rectF.set(f, this.A01, this.A02 + f, getHeight() - this.A01);
            canvas.drawRect(rectF, this.A08);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        if (getText() != null && !TextUtils.isEmpty(getText().toString())) {
            PaymentAmountInputField paymentAmountInputField = (PaymentAmountInputField) this;
            float A04 = paymentAmountInputField.A04(getText().toString(), paymentAmountInputField.getTextSize());
            this.A00 = A04;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (A04 + (this.A05 ? this.A02 : 0) + getPaddingLeft() + getPaddingRight()), 1073741824), i2);
            return;
        }
        this.A00 = 0.0f;
        super.onMeasure(i, i2);
    }

    public void setCustomCursorEnabled(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            this.A03.removeCallbacks(this.A04);
            this.A03.post(this.A04);
            boolean z2 = !z;
            setFocusable(z2);
            setCursorVisible(z2);
            if (z) {
                addTextChangedListener(this);
            } else {
                removeTextChangedListener(this);
            }
        }
    }

    public void setHasFocus(boolean z) {
        if (z != this.A06) {
            this.A06 = z;
            this.A03.removeCallbacks(this.A04);
            this.A03.post(this.A04);
        }
    }
}
