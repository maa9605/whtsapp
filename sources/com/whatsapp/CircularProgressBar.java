package com.whatsapp;

import X.AbstractC08900cH;
import X.C02160Ac;
import X.C49582Lf;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class CircularProgressBar extends AbstractC08900cH {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public Rect A0E;
    public String A0F;
    public boolean A0G;
    public final Paint A0H;
    public final RectF A0I;

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = new RectF();
        this.A0H = new Paint();
        this.A0F = null;
        this.A06 = 5.0f;
        this.A0G = false;
        this.A05 = 0.3f;
        this.A0E = new Rect();
        this.A08 = C02160Ac.A00(context, R.color.circular_progress_bar_center_text);
        this.A0C = C02160Ac.A00(context, R.color.circular_progress_bar_bar);
        this.A0B = C02160Ac.A00(context, R.color.circular_progress_bar_background);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49582Lf.A0W);
            this.A0C = obtainStyledAttributes.getInteger(1, this.A0C);
            this.A0B = obtainStyledAttributes.getInteger(0, this.A0B);
            this.A09 = obtainStyledAttributes.getInteger(2, 0);
            this.A06 = obtainStyledAttributes.getFloat(5, 5.0f);
            this.A0A = obtainStyledAttributes.getInteger(3, 0);
            this.A03 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A08 = obtainStyledAttributes.getInteger(6, this.A08);
            obtainStyledAttributes.recycle();
        }
    }

    public String getCenterText() {
        return this.A0F;
    }

    public boolean getKnobEnabled() {
        return this.A0G;
    }

    public float getPaintStrokeFactor() {
        return this.A06;
    }

    public int getProgressBarBackgroundColor() {
        return this.A0B;
    }

    public int getProgressBarColor() {
        return this.A0C;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.A0H;
        paint.setAntiAlias(true);
        if (this.A09 != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.A09);
            canvas.drawArc(this.A0I, 0.0f, 360.0f, true, paint);
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (isIndeterminate()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.A0D;
            if (j == 0) {
                this.A0D = uptimeMillis;
                j = uptimeMillis;
            }
            long j2 = uptimeMillis - j;
            float f2 = (((float) (j2 % 1333)) * 1.0f) / 1333.0f;
            if (f2 < 0.5f) {
                float sin = (float) Math.sin(f2 * 3.141592653589793d);
                f = (((sin * sin) * sin) * sin) / 2.0f;
            } else {
                float sin2 = (float) Math.sin((f2 - 0.5f) * 3.141592653589793d);
                f = ((((sin2 * sin2) * sin2) * sin2) / 2.0f) + 0.5f;
            }
            if (f < 0.5f) {
                this.A00 = f * 2.0f * 280.0f;
                this.A02 = -1.0f;
            } else {
                float f3 = this.A02;
                if (f3 < 0.0f) {
                    f3 = this.A01;
                    this.A02 = f3;
                }
                this.A00 = (1.0f - f) * 2.0f * 280.0f;
                this.A01 = ((f - 0.5f) * 2.0f * 280.0f) + f3;
            }
            canvas.rotate(((((float) (j2 % 2200)) * 1.0f) / 2200.0f) * 360.0f, getWidth() >> 1, getHeight() >> 1);
            paint.setAntiAlias(true);
            int i = this.A0B;
            if (i != 0) {
                paint.setColor(i);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawArc(this.A0I, 0.0f, 360.0f, false, paint);
            }
            int i2 = this.A0A;
            if (i2 != 0) {
                paint.setColor(i2);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth((this.A03 * 2.0f) + (this.A04 / this.A06));
                canvas.drawArc(this.A0I, this.A01, this.A00, false, paint);
            }
            paint.setColor(this.A0C);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A04 / this.A06);
            canvas.drawArc(this.A0I, this.A01, this.A00, false, paint);
            invalidate();
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        if (this.A0B != 0) {
            paint.setStrokeWidth(this.A04 / this.A06);
            paint.setColor(this.A0B);
            canvas.drawArc(this.A0I, ((getProgress() * 360.0f) / getMax()) + 270.0f, 360.0f - ((getProgress() * 360.0f) / getMax()), false, paint);
        }
        int i3 = this.A0A;
        if (i3 != 0) {
            paint.setColor(i3);
            paint.setStrokeWidth((this.A03 * 2.0f) + (this.A04 / this.A06));
            canvas.drawArc(this.A0I, -90.0f, (getProgress() * 360.0f) / getMax(), false, paint);
        }
        paint.setStrokeWidth(this.A04 / this.A06);
        paint.setColor(this.A0C);
        RectF rectF = this.A0I;
        canvas.drawArc(rectF, -90.0f, (getProgress() * 360.0f) / getMax(), false, paint);
        if (this.A0G) {
            paint.setColor(this.A0B);
            paint.setStyle(Paint.Style.FILL);
            double progress = getProgress() * ((float) (6.283185307179586d / getMax()));
            canvas.drawCircle((float) ((Math.sin(progress) * this.A04) + rectF.centerX()), (float) (rectF.centerY() - (Math.cos(progress) * this.A04)), 10.0f, paint);
        }
        if (this.A0F == null) {
            return;
        }
        paint.setColor(this.A08);
        paint.setTextSize(this.A07);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create("sans-serif-light", 0));
        String str = this.A0F;
        paint.getTextBounds(str, 0, str.length(), this.A0E);
        paint.setStyle(Paint.Style.FILL);
        String str2 = this.A0F;
        canvas.drawText(str2, 0, str2.length(), rectF.centerX(), (this.A0E.height() * 0.5f) + rectF.centerY(), paint);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        float min = Math.min((i - paddingLeft) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        this.A04 = min;
        float f = min - (this.A05 * min);
        this.A04 = f;
        float f2 = i >> 1;
        float f3 = i2 >> 1;
        this.A0I.set(f2 - f, f3 - f, f2 + f, f3 + f);
    }

    public void setCenterText(String str) {
        this.A0F = str;
        this.A07 = getResources().getDimensionPixelSize(R.dimen.progress_bar_text_size);
    }

    public void setKnobEnabled(boolean z) {
        this.A0G = z;
    }

    public void setPaintStrokeFactor(float f) {
        this.A06 = f;
    }

    public void setProgressBarBackgroundColor(int i) {
        this.A0B = i;
    }

    public void setProgressBarColor(int i) {
        this.A0C = i;
    }

    public void setRadiusFactor(float f) {
        this.A05 = f;
    }
}
