package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import com.google.android.search.verification.client.R;

/* renamed from: X.2VU  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2VU extends C2VV {
    public float A00;
    public C002301c A01;
    public String A02;
    public final Paint A03;
    public final RectF A04;
    public final TextPaint A05;
    public final Runnable A06;

    public C2VU(Context context) {
        super(context);
        this.A04 = new RectF();
        this.A03 = new Paint(1);
        this.A05 = new TextPaint(1);
        this.A06 = new RunnableEBaseShape1S0100000_I0_1(this, 6);
        this.A03.setStrokeWidth(context.getResources().getDimension(R.dimen.zoom_stroke_size));
        this.A03.setStyle(Paint.Style.STROKE);
        this.A05.setTextSize(context.getResources().getDimension(R.dimen.zoom_text_size));
        this.A05.setColor(-1711276033);
        this.A05.setTextAlign(Paint.Align.CENTER);
        this.A05.setFakeBoldText(true);
    }

    public float getMaxScale() {
        return (Math.min(getWidth() >> 1, getHeight() >> 1) * 0.9f) / this.A05.measureText("x00.0");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width = getWidth() >> 1;
        int height = getHeight() >> 1;
        float min = Math.min(width, height) * 0.9f;
        Paint paint = this.A03;
        paint.setColor(-1711276033);
        RectF rectF = this.A04;
        float f = width;
        float f2 = height;
        rectF.set(f - min, f2 - min, f + min, f2 + min);
        canvas.drawOval(rectF, paint);
        String str = this.A02;
        if (str != null) {
            TextPaint textPaint = this.A05;
            canvas.drawText(str, f, f2 - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
        float measureText = this.A05.measureText("x00.0");
        rectF.set(f - measureText, f2 - measureText, f + measureText, f2 + measureText);
        canvas.drawOval(rectF, paint);
        float min2 = Math.min(min, measureText * this.A00);
        paint.setColor(-13388315);
        rectF.set(f - min2, f2 - min2, f + min2, f2 + min2);
        canvas.drawOval(rectF, paint);
    }
}
