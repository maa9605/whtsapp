package com.whatsapp.components;

import X.AbstractC68723Le;
import X.AnonymousClass029;
import X.C09990f7;
import X.C0AT;
import X.C49582Lf;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;

/* loaded from: classes2.dex */
public class Button extends AbstractC68723Le {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public final Paint A05;
    public final Rect A06;
    public final RectF A07;

    public Button(final Context context, final AttributeSet attributeSet) {
        new WaButton(context, attributeSet, R.attr.buttonStyle) { // from class: X.3Le
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC28651Ta
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                generatedComponent();
            }
        };
        int i;
        int i2;
        ColorStateList colorStateList;
        this.A05 = new Paint(1);
        this.A06 = new Rect();
        this.A07 = new RectF();
        Resources.Theme theme = context.getTheme();
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.button_stroke_width);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.button_inset_horizontal);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.button_inset_vertical);
        this.A05.setStyle(Paint.Style.STROKE);
        this.A05.setStrokeWidth(this.A03);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C49582Lf.A0P, R.attr.buttonStyle, 2131952348);
        if (obtainStyledAttributes.hasValue(2)) {
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(2);
            this.A04 = colorStateList2;
            if (colorStateList2 != null) {
                this.A05.setColor(colorStateList2.getColorForState(getDrawableState(), 0));
            }
        }
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, context.getResources().getDimensionPixelSize(R.dimen.control_corner_material));
        if (Build.VERSION.SDK_INT < 21) {
            if (obtainStyledAttributes.hasValue(1) && (colorStateList = obtainStyledAttributes.getColorStateList(1)) != null) {
                i2 = colorStateList.getDefaultColor();
                i = colorStateList.getColorForState(new int[]{-16842910}, i2);
            } else {
                i = 0;
                i2 = 0;
            }
            int A02 = C09990f7.A02(AnonymousClass029.A03(context, R.attr.colorControlHighlight, R.color.buttonPressOverlay), i2);
            C0AT.A0Z(this, new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842910}, new int[]{16842908, 16842919}, new int[]{-16842910}, new int[0]}, new int[]{A02, i2, A02, i, i2}));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // X.C1SA, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.A04;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            Paint paint = this.A05;
            if (colorForState != paint.getColor()) {
                paint.setColor(colorForState);
                invalidate();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null || this.A04 == null || this.A03 <= 0) {
            return;
        }
        Rect rect = this.A06;
        rect.set(getBackground().getBounds());
        RectF rectF = this.A07;
        float f = rect.left;
        float f2 = this.A03 / 2.0f;
        float f3 = this.A01;
        float f4 = this.A02;
        rectF.set(f2 + f + f3, f2 + rect.top + f4, (rect.right - f2) - f3, (rect.bottom - f2) - f4);
        float f5 = this.A00 - (this.A03 / 2.0f);
        canvas.drawRoundRect(rectF, f5, f5, this.A05);
    }
}
