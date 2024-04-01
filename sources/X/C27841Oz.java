package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.1Oz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C27841Oz extends MetricAffectingSpan {
    public final Typeface A00;

    public C27841Oz(Typeface typeface) {
        this.A00 = typeface;
    }

    public final void A00(Paint paint) {
        Typeface typeface = paint.getTypeface();
        int style = typeface == null ? 0 : typeface.getStyle();
        Typeface typeface2 = this.A00;
        int style2 = style & (typeface2.getStyle() ^ (-1));
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface2);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint);
    }
}
