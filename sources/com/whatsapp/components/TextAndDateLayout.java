package com.whatsapp.components;

import X.C002301c;
import X.C2Vn;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public class TextAndDateLayout extends C2Vn {
    public int A00;
    public C002301c A01;
    public boolean A02;

    public TextAndDateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C49582Lf.A25, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getInt(1, 0);
                this.A02 = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final int A00(Layout layout) {
        int i = this.A00;
        if (i == 0) {
            return layout.getLineCount() - 1;
        }
        return Math.min(i - 1, layout.getLineCount() - 1);
    }

    private int getLastParagraphDirection() {
        Layout layout = ((TextView) getChildAt(0)).getLayout();
        return layout.getParagraphDirection(A00(layout));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setTextViewStyle(this.A00);
        if (this.A02) {
            final TextView textView = (TextView) getChildAt(0);
            textView.addTextChangedListener(new TextWatcher() { // from class: X.2pm
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = C0LX.A0D(editable) ? 3 : 5;
                    textView.setLayoutParams(layoutParams);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0153, code lost:
        if (r13.A02 == false) goto L60;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.components.TextAndDateLayout.onMeasure(int, int):void");
    }

    public void setMaxTextLineCount(int i) {
        if (this.A00 != i) {
            invalidate();
            setTextViewStyle(i);
        }
        this.A00 = i;
    }

    private void setTextViewStyle(int i) {
        TextView textView = (TextView) getChildAt(0);
        if (i > 0) {
            textView.setMaxLines(i);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }
}
