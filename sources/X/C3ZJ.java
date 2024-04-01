package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.3ZJ  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZJ extends ReplacementSpan {
    public int A00;
    public int A01;
    public int A02;
    public final C50502Sa A03;
    public final String A04;
    public final String A05;

    public C3ZJ(String str, String str2, int i) {
        this.A03 = new C50502Sa(i);
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C50502Sa c50502Sa = this.A03;
        int i6 = this.A02;
        c50502Sa.setBounds((int) f, i3 + i6, (int) (this.A01 + f), i5 - i6);
        c50502Sa.draw(canvas);
        canvas.drawText(this.A05, f + this.A00, i4, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt A00 = C2RY.A00(paint);
            int i3 = A00.descent - A00.ascent;
            this.A00 = i3 >> 1;
            int max = Math.max(1, i3 >> 4);
            this.A02 = max;
            int i4 = A00.top - max;
            fontMetricsInt.top = i4;
            int i5 = A00.bottom + max;
            fontMetricsInt.bottom = i5;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = i5;
        }
        String str = this.A05;
        int ceil = (int) Math.ceil(paint.measureText(str, 0, str.length()) + (this.A00 << 1));
        this.A01 = ceil;
        return ceil;
    }
}
