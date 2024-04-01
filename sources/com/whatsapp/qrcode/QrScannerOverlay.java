package com.whatsapp.qrcode;

import X.AbstractC79473li;
import X.C02160Ac;
import X.C07280Xp;
import X.C08540bf;
import X.C70863Tx;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.QrScannerOverlay;

/* loaded from: classes2.dex */
public class QrScannerOverlay extends AbstractC79473li {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Paint A05;
    public Drawable A06;
    public C70863Tx A07;
    public String A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final Paint A0D;
    public final Rect A0E;
    public final RectF A0F;

    public QrScannerOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0D = new Paint(1);
        this.A0E = new Rect();
        this.A0F = new RectF();
        this.A01 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08540bf.A20);
        this.A04 = obtainStyledAttributes.getInt(0, 1);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.A08 = context.getString(resourceId);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        obtainStyledAttributes.recycle();
        this.A0A = getResources().getDimension(R.dimen.autofocus_stroke_size);
        this.A09 = getResources().getDimension(R.dimen.contact_qr_corner_radius);
        C02160Ac.A00(context, R.color.white_alpha_20);
        this.A0C = C02160Ac.A00(context, R.color.qr_scanline);
        this.A0B = C02160Ac.A00(context, R.color.qr_scanner_overlay_gray);
        if (this.A04 == 1) {
            this.A00 = 0.0125f;
            C07280Xp A00 = C07280Xp.A00(getResources(), R.drawable.ic_qr_frame, null);
            if (A00 != null) {
                this.A06 = A00;
                A00.setBounds(0, 0, A00.getIntrinsicWidth(), this.A06.getIntrinsicHeight());
            } else {
                throw null;
            }
        } else {
            this.A00 = 0.01f;
        }
        Paint paint = new Paint(1);
        this.A05 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.animation.Animation, X.3Tx] */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ?? r2 = new Animation() { // from class: X.3Tx
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                QrScannerOverlay qrScannerOverlay = QrScannerOverlay.this;
                int width = qrScannerOverlay.getWidth();
                int height = qrScannerOverlay.getHeight();
                int min = (Math.min(width, height) * 3) >> 2;
                int i = (width - min) >> 1;
                int i2 = (height - min) >> 1;
                qrScannerOverlay.invalidate(i, i2, i + min, min + i2);
            }
        };
        this.A07 = r2;
        r2.setDuration(2000L);
        setRepeatCount(-1);
        setRepeatMode(2);
        startAnimation(this.A07);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rect;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = (Math.min(width, height) * 3) >> 2;
        int paddingLeft = getPaddingLeft() + ((width - min) >> 1);
        int paddingTop = getPaddingTop() + ((height - min) >> 1);
        int i = paddingLeft + min;
        int i2 = min + paddingTop;
        float f = this.A01;
        float f2 = this.A00;
        float f3 = f + f2;
        this.A01 = f3;
        if (f3 > 1.0f || f3 < 0.0f) {
            if (f3 > 1.0f) {
                this.A01 = 1.0f;
            } else {
                this.A01 = 0.0f;
            }
            this.A00 = -f2;
        }
        canvas.drawColor(this.A0B);
        RectF rectF = this.A0F;
        float f4 = paddingLeft;
        float f5 = paddingTop;
        float f6 = i2;
        rectF.set(f4, f5, i, f6);
        if (this.A04 == 0) {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, this.A05);
            Paint paint = this.A0D;
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.A0C);
            paint.setAlpha(127);
            float f7 = this.A0A * 2.0f;
            paint.setStrokeWidth(f7);
            int i3 = (int) (f7 + f5);
            i2 = (int) (f6 - f7);
            float f8 = this.A01;
            float f9 = (f8 * 2.0f) - 1.0f;
            float f10 = (paddingLeft + i) >> 1;
            float sqrt = ((i - paddingLeft) * ((float) Math.sqrt(1.0f - (f9 * f9)))) / 2.0f;
            float f11 = ((i2 - i3) * f8) + i3;
            canvas.drawLine(f10 - sqrt, f11, sqrt + f10, f11, paint);
        } else {
            float f12 = this.A09;
            canvas.drawRoundRect(rectF, f12, f12, this.A05);
            this.A06.setAlpha((int) (this.A01 * 255.0f));
            canvas.save();
            canvas.translate(f4, f5);
            this.A06.draw(canvas);
            canvas.translate(i - paddingLeft, 0.0f);
            canvas.rotate(90.0f);
            this.A06.draw(canvas);
            canvas.rotate(-90.0f);
            canvas.translate(0.0f, i2 - paddingTop);
            canvas.rotate(180.0f);
            this.A06.draw(canvas);
            canvas.rotate(-180.0f);
            canvas.translate(paddingLeft - i, 0.0f);
            canvas.rotate(270.0f);
            this.A06.draw(canvas);
            canvas.restore();
        }
        if (this.A08 != null) {
            Paint paint2 = this.A0D;
            paint2.setColor(-1);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setTextSize(this.A02);
            String str = this.A08;
            paint2.getTextBounds(str, 0, str.length(), this.A0E);
            canvas.drawText(this.A08, (width - rect.width()) / 2.0f, (rect.height() >> 1) + i2 + this.A03, paint2);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        C70863Tx c70863Tx;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (c70863Tx = this.A07) != null) {
            startAnimation(c70863Tx);
        }
    }
}
