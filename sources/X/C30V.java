package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.google.android.search.verification.client.R;

/* renamed from: X.30V  reason: invalid class name */
/* loaded from: classes2.dex */
public class C30V {
    public final String A03;
    public final TextPaint A02 = new TextPaint(1);
    public final TextPaint A01 = new TextPaint(1);
    public boolean A00 = true;

    public C30V(Context context, C002301c c002301c) {
        this.A02.setColor(-1);
        this.A02.setTextSize(40.0f);
        this.A02.setTextAlign(Paint.Align.CENTER);
        this.A02.setTypeface(C003301p.A03(context));
        this.A02.setShadowLayer(0.5f, 0.0f, 1.0f, Color.parseColor("#73000000"));
        this.A01.setColor(0);
        this.A01.setTextSize(40.0f);
        this.A01.setTextAlign(Paint.Align.CENTER);
        this.A01.setTypeface(C003301p.A03(context));
        this.A01.setShadowLayer(7.0f, 0.0f, 0.0f, Color.parseColor("#4D000000"));
        this.A03 = context.getString(R.string.tap_for_more).toUpperCase(c002301c.A0I());
    }

    public void A00(float f) {
        if (this.A00) {
            TextPaint textPaint = this.A02;
            textPaint.setTextSize(textPaint.getTextSize() * f);
            TextPaint textPaint2 = this.A01;
            textPaint2.setTextSize(textPaint2.getTextSize() * f);
        }
    }

    public void A01(Canvas canvas, float f, RectF rectF) {
        if (this.A00) {
            Rect rect = new Rect();
            TextPaint textPaint = this.A02;
            String str = this.A03;
            textPaint.getTextBounds(str, 0, str.length(), rect);
            canvas.save();
            float width = (rectF.width() / 2.0f) + rectF.left;
            float height = rectF.height() + rectF.top + (rect.height() << 1);
            canvas.rotate(f, rectF.centerX(), rectF.centerY());
            canvas.drawText(str, width, height, this.A01);
            canvas.drawText(str, width, height, textPaint);
            canvas.restore();
        }
    }
}
