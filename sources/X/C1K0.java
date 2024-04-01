package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.google.android.search.verification.client.R;

/* renamed from: X.1K0  reason: invalid class name */
/* loaded from: classes.dex */
public class C1K0 extends ReplacementSpan {
    public int A00;
    public Context A01;

    public C1K0(Context context, int i) {
        this.A01 = context;
        this.A00 = i;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.setColor(this.A00);
        canvas.drawText(charSequence, i, i2, (int) ((f + (getSize(paint, charSequence, i, i2, null) >> 1)) - (paint.measureText(charSequence, i, i2) / 2.0f)), i4, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return Math.round(this.A01.getResources().getDimension(R.dimen.code_input_field_padded_foreground_span_size) + paint.measureText(charSequence, charSequence.length(), charSequence.length()));
    }
}
