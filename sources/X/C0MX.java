package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.whatsapp.WaEditText;
import com.whatsapp.util.Log;

/* renamed from: X.0MX  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0MX extends C0MY {
    public float A00;
    public int A01;
    public TextPaint A02;
    public C02E A03;
    public C002301c A04;
    public String A05;
    public String A06;

    public C0MX(final Context context, final AttributeSet attributeSet) {
        new WaEditText(context, attributeSet) { // from class: X.0MY
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
                ((AbstractC07960aN) generatedComponent()).A09((C0MX) this);
            }
        };
    }

    public boolean A04() {
        return TextUtils.isEmpty(getText());
    }

    @Override // com.whatsapp.WaEditText, X.C04850Mb, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        int i = this.A01;
        if (i != 0) {
            int i2 = editorInfo.imeOptions;
            int i3 = i2 & 255;
            if ((i3 & i) != 0) {
                int i4 = i2 ^ i3;
                editorInfo.imeOptions = i4;
                int i5 = i | i4;
                editorInfo.imeOptions = i5;
                i2 = i5;
            }
            if ((1073741824 & i2) != 0) {
                editorInfo.imeOptions = i2 & (-1073741825);
            }
        }
        return onCreateInputConnection;
    }

    @Override // com.whatsapp.WaEditText, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.A02 != null && !TextUtils.isEmpty(this.A06) && A04()) {
            C002301c c002301c = this.A04;
            if (c002301c != null && !c002301c.A0M()) {
                this.A02.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(this.A06, getWidth() - getPaddingRight(), getTotalPaddingTop() - this.A00, this.A02);
                return;
            }
            canvas.drawText(this.A06, getPaddingLeft(), getTotalPaddingTop() - this.A00, this.A02);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(this.A05) || !A04()) {
            return;
        }
        accessibilityNodeInfo.setText(this.A05);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A05 != null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            if (this.A02 == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A02 = textPaint;
                textPaint.setColor(getHintTextColors().getDefaultColor());
                this.A02.setTextSize(getTextSize());
                this.A02.setTextAlign(Paint.Align.LEFT);
            }
            this.A06 = TextUtils.ellipsize(this.A05, this.A02, measuredWidth, TextUtils.TruncateAt.END).toString();
            this.A00 = this.A02.getFontMetrics().top;
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (TextUtils.isEmpty(this.A05) || !A04()) {
            return;
        }
        accessibilityEvent.getText().add(this.A05);
    }

    public void setHint(String str) {
        this.A05 = str;
        this.A06 = null;
        requestLayout();
    }

    public void setInputEnterAction(int i) {
        this.A01 = i;
        setRawInputType(180225);
        if (i == 0) {
            i = 1073741824;
        }
        C02E c02e = this.A03;
        if (c02e != null) {
            ContentResolver A07 = c02e.A07();
            if (A07 != null) {
                if ("com.htc.android.htcime/.HTCIMEService".equals(Settings.Secure.getString(A07, "default_input_method"))) {
                    i |= 268435456;
                }
            } else {
                Log.w("conversation-text-entry/set-input-enter-action cr=null");
            }
        }
        setImeOptions(i);
    }
}
