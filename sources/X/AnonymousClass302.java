package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.302  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass302 extends Drawable {
    public float A00;
    public float A02;
    public int A03;
    public boolean A04;
    public final int A05;
    public final Drawable A08;
    public final C003701t A09;
    public final boolean A0A;
    public final Paint A07 = new Paint(1);
    public final Paint A06 = new Paint(1);
    public float A01 = 1.0f;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass302(Context context, C003701t c003701t, int i) {
        Paint paint = this.A07;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.A09 = c003701t;
        this.A00 = (context.getResources().getDisplayMetrics().density * 3.0f) / 4.0f;
        this.A05 = (int) (context.getResources().getDisplayMetrics().density * 48.0f);
        boolean A0C = this.A09.A0C(279);
        this.A0A = A0C;
        if (!A0C) {
            this.A06.setColor(1073741824);
            this.A06.setStyle(style);
            this.A06.setMaskFilter(new BlurMaskFilter(this.A00, BlurMaskFilter.Blur.OUTER));
        }
        if (i != 0) {
            this.A08 = C02160Ac.A03(context, i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float min = (Math.min(bounds.width(), bounds.height()) * 7) >> 4;
        if (this.A04) {
            if (!this.A0A) {
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.A00 + min, this.A06);
            }
            Paint paint = this.A07;
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A03);
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), min, paint);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(-1);
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
            if (Color.red(this.A03) > 240 && Color.green(this.A03) > 240 && Color.blue(this.A03) > 240) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.A00);
                int min2 = 255 - ((Math.min(Math.min(Color.red(this.A03), Color.green(this.A03)), Color.blue(this.A03)) - 240) * 3);
                paint.setColor(Color.argb(255, min2, min2, min2));
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), (this.A02 * 1.2f) / 2.0f, paint);
                return;
            }
            return;
        }
        if (this.A03 != 0) {
            if (!this.A0A) {
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.A00 + min, this.A06);
            }
            Paint paint2 = this.A07;
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(this.A03);
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), this.A01 * min, paint2);
        }
        Drawable drawable = this.A08;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(bounds.centerX() - (drawable.getIntrinsicWidth() >> 1), bounds.centerY() - (drawable.getIntrinsicHeight() >> 1), (drawable.getIntrinsicWidth() >> 1) + bounds.centerX(), (drawable.getIntrinsicHeight() >> 1) + bounds.centerY());
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.A05;
    }
}
