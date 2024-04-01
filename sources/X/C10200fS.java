package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: X.0fS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10200fS extends TypefaceSpan {
    public final Typeface A00;

    public C10200fS(Context context) {
        super("");
        this.A00 = C003301p.A03(context);
    }

    public static void A00(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        if (((typeface2 == null ? 0 : typeface2.getStyle()) & (typeface.getStyle() ^ (-1)) & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        A00(textPaint, this.A00);
    }
}
