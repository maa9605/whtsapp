package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.2RZ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2RZ extends C50262Ra {
    public Context A00;
    public Paint.FontMetricsInt A01;
    public C60722uw A02;
    public boolean A03;
    public final int A04;
    public final CharSequence A05;

    public C2RZ(Context context, Drawable drawable, Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence) {
        super(drawable);
        this.A00 = context;
        this.A05 = charSequence;
        this.A04 = C02160Ac.A00(context, R.color.link_color);
        this.A01 = fontMetricsInt;
    }

    public final boolean A04(CharSequence charSequence, int i) {
        int i2;
        int i3 = 0;
        while (true) {
            CharSequence charSequence2 = this.A05;
            if (i3 >= charSequence2.length() || (i2 = i + i3) >= charSequence.length()) {
                return true;
            }
            if (charSequence2.charAt(i3) != charSequence.charAt(i2)) {
                return false;
            }
            i3++;
        }
    }

    @Override // X.C50262Ra, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (A04(charSequence, i)) {
            if (this.A03) {
                C60722uw c60722uw = this.A02;
                if (c60722uw == null) {
                    c60722uw = new C60722uw(paint, this.A04);
                    this.A02 = c60722uw;
                }
                float f2 = A03().getBounds().right + ((int) this.A00.getResources().getDisplayMetrics().density);
                float f3 = (c60722uw.A01 / 2.0f) + i4 + c60722uw.A00;
                canvas.drawLine(f, f3, f + f2, f3, c60722uw);
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = A03().getBounds();
        if (fontMetricsInt != null) {
            int height = bounds.height();
            Paint.FontMetricsInt fontMetricsInt2 = this.A01;
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int max = Math.max(0, (height - i3) + i4);
            fontMetricsInt.ascent = i4 - max;
            fontMetricsInt.descent = i3 + max;
            fontMetricsInt.top = fontMetricsInt2.top - max;
            fontMetricsInt.bottom = fontMetricsInt2.bottom + max;
        }
        if (A04(charSequence, i)) {
            return bounds.right + ((int) this.A00.getResources().getDisplayMetrics().density);
        }
        return 0;
    }
}
