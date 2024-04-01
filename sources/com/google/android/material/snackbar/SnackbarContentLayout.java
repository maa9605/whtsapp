package com.google.android.material.snackbar;

import X.C08550bg;
import X.C0AT;
import X.C1BE;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements C1BE {
    public int A00;
    public int A01;
    public Button A02;
    public TextView A03;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08550bg.A0r);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A03.getPaddingTop() == i2 && this.A03.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A03;
        if (C0AT.A0j(textView)) {
            int A07 = C0AT.A07(textView);
            int A06 = C0AT.A06(textView);
            if (Build.VERSION.SDK_INT >= 17) {
                textView.setPaddingRelative(A07, i2, A06, i3);
                return true;
            }
            textView.setPadding(A07, i2, A06, i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.A02;
    }

    public TextView getMessageView() {
        return this.A03;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.A03 = (TextView) findViewById(R.id.snackbar_text);
        this.A02 = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.A01;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        if (this.A03.getLayout().getLineCount() > 1) {
            if (this.A00 > 0 && this.A02.getMeasuredWidth() > this.A00) {
                if (!A00(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
                super.onMeasure(i, i2);
            }
        } else {
            dimensionPixelSize = dimensionPixelSize2;
        }
        if (!A00(0, dimensionPixelSize, dimensionPixelSize)) {
            return;
        }
        super.onMeasure(i, i2);
    }
}
