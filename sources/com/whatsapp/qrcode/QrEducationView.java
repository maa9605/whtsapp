package com.whatsapp.qrcode;

import X.AbstractC79463lh;
import X.C02160Ac;
import X.C02180Ae;
import X.C70843Tv;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.QrEducationView;

/* loaded from: classes2.dex */
public class QrEducationView extends AbstractC79463lh {
    public float A00;
    public float A01;
    public int A02;
    public Paint A03;
    public RectF A04;
    public Drawable A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public Drawable A09;
    public C70843Tv A0A;
    public boolean A0B;
    public boolean A0C;

    public static float A00(float f, float f2, float f3, float f4, float f5) {
        return ((f5 - f4) * (f3 <= f ? 0.0f : f3 >= f2 ? 1.0f : (f3 - f) / (f2 - f))) + f4;
    }

    public QrEducationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0B = false;
        this.A0C = true;
        this.A04 = new RectF();
        Resources resources = context.getResources();
        this.A09 = resources.getDrawable(R.drawable.anim_qr_normal);
        this.A08 = resources.getDrawable(R.drawable.anim_qr_blurred);
        this.A06 = resources.getDrawable(R.drawable.anim_laptop);
        this.A07 = resources.getDrawable(R.drawable.anim_phone);
        this.A05 = C02180Ae.A0O(context, R.drawable.anim_frame, R.color.qr_scanner_frame_color);
        int A00 = C02160Ac.A00(context, R.color.qrEducationAnimationBgColor);
        this.A02 = C02160Ac.A00(context, R.color.qrEducationAnimationColor);
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setAntiAlias(true);
        this.A03.setColor(A00);
        this.A01 = getResources().getDimension(R.dimen.contact_qr_corner_radius);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.3Tv, android.view.animation.Animation] */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ?? r2 = new Animation(this) { // from class: X.3Tv
            public final QrEducationView A00;

            {
                this.A00 = this;
            }

            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                QrEducationView qrEducationView = this.A00;
                if (f < qrEducationView.A00) {
                    qrEducationView.A0B = true;
                }
                if (qrEducationView.A0B) {
                    qrEducationView.A00 = f + 1.0f;
                } else {
                    qrEducationView.A00 = f;
                }
                qrEducationView.invalidate();
            }
        };
        this.A0A = r2;
        r2.setDuration(8000L);
        setRepeatCount(-1);
        setInterpolator(new LinearInterpolator());
        startAnimation(this.A0A);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float A00;
        int i2;
        int i3;
        int width = getWidth();
        int height = getHeight();
        canvas.translate(width >> 1, height >> 1);
        if ((this.A07.getIntrinsicWidth() / 3) + this.A07.getIntrinsicHeight() > height) {
            float intrinsicWidth = height / ((this.A07.getIntrinsicWidth() / 3) + this.A07.getIntrinsicHeight());
            canvas.scale(intrinsicWidth, intrinsicWidth);
        }
        float f = this.A00;
        if (f < 0.14f) {
            f = (f * f) / 0.14f;
        } else if (f >= 0.2f && f < 0.3f) {
            f = ((float) (Math.sqrt(0.10000000894069672d) * Math.sqrt(f - 0.2f))) + 0.2f;
        }
        if (this.A0C) {
            this.A06.setAlpha(255);
            int intrinsicWidth2 = (int) ((this.A06.getIntrinsicWidth() * 1.0f) / 2.0f);
            int intrinsicHeight = (int) ((this.A06.getIntrinsicHeight() * 1.0f) / 2.0f);
            this.A06.setBounds(-intrinsicWidth2, -intrinsicHeight, intrinsicWidth2, intrinsicHeight);
            this.A06.draw(canvas);
        } else {
            int intrinsicWidth3 = (int) ((this.A09.getIntrinsicWidth() / 2.0f) * 1.3f);
            int intrinsicHeight2 = (int) ((this.A09.getIntrinsicHeight() / 2.0f) * 1.3f);
            RectF rectF = this.A04;
            rectF.left = -i;
            rectF.top = intrinsicHeight2 * (-2);
            rectF.bottom = intrinsicHeight2 << 1;
            rectF.right = intrinsicWidth3 << 1;
            float f2 = this.A01;
            canvas.drawRoundRect(rectF, f2, f2, this.A03);
            this.A09.setBounds(-intrinsicWidth3, -intrinsicHeight2, intrinsicWidth3, intrinsicHeight2);
            this.A09.setColorFilter(this.A02, PorterDuff.Mode.SRC_IN);
            this.A09.setAlpha(255);
            this.A09.draw(canvas);
        }
        float intrinsicWidth4 = this.A07.getIntrinsicWidth() >> 1;
        float intrinsicHeight3 = this.A07.getIntrinsicHeight() >> 1;
        if (f < 0.14f) {
            A00 = A00(0.0f, 0.14f, f, 0.0f, 1.2566371f);
        } else {
            A00 = A00(0.14f, 0.2f, f, 1.2566371f, 1.5707964f);
        }
        float f3 = (-intrinsicWidth4) - ((intrinsicWidth4 * 3.0f) / 4.0f);
        float sin = (((float) Math.sin(A00)) * intrinsicWidth4) + f3;
        float f4 = intrinsicWidth4 / 6.0f;
        int i4 = (int) intrinsicWidth4;
        int i5 = (int) sin;
        int i6 = (int) intrinsicHeight3;
        int i7 = (int) f4;
        this.A07.setBounds((-i4) - i5, (-i6) + i7, i4 - i5, i6 + i7);
        this.A07.draw(canvas);
        int i8 = this.A07.getBounds().left;
        int i9 = this.A07.getBounds().right;
        int i10 = (i9 - i8) / 7;
        canvas.clipRect(i8 + i10, this.A07.getBounds().top, i9 - i10, this.A07.getBounds().bottom);
        float intrinsicWidth5 = this.A09.getIntrinsicWidth() >> 1;
        float intrinsicHeight4 = this.A09.getIntrinsicHeight() >> 1;
        float intrinsicWidth6 = this.A08.getIntrinsicWidth() >> 1;
        float intrinsicHeight5 = this.A08.getIntrinsicHeight() >> 1;
        float sin2 = sin - ((sin - ((((float) Math.sin(1.5707963267948966d)) * intrinsicWidth4) + f3)) / 3.0f);
        int i11 = (int) intrinsicWidth5;
        int i12 = (int) sin2;
        int i13 = (int) intrinsicHeight4;
        int i14 = (int) (f4 - (intrinsicHeight3 / 8.0f));
        this.A09.setBounds((-i11) - i12, (-i13) + i14, i11 - i12, i13 + i14);
        int i15 = (int) intrinsicWidth6;
        int i16 = (int) intrinsicHeight5;
        this.A08.setBounds((-i15) - i12, (-i16) + i14, i15 - i12, i16 + i14);
        if (f > 0.2f) {
            i2 = (int) A00(0.2f, 0.3f, f, 0.0f, 255.0f);
            i3 = (int) A00(0.2f, 0.3f, f, 255.0f, 0.0f);
        } else {
            i2 = 0;
            i3 = 255;
        }
        this.A09.setColorFilter(null);
        this.A09.setAlpha(i2);
        this.A08.setAlpha(i3);
        this.A09.draw(canvas);
        this.A08.draw(canvas);
        this.A05.setAlpha(((int) (Math.sin(this.A00 * 30.0f) * 127.0d)) + 127);
        int intrinsicWidth7 = (int) (this.A05.getIntrinsicWidth() / 2.0f);
        int intrinsicHeight6 = (int) (this.A05.getIntrinsicHeight() / 2.0f);
        this.A05.setBounds((-intrinsicWidth7) - i5, (-intrinsicHeight6) + i14, intrinsicWidth7 - i5, intrinsicHeight6 + i14);
        this.A05.draw(canvas);
        canvas.translate((-width) >> 1, (-height) >> 1);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        C70843Tv c70843Tv;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (c70843Tv = this.A0A) != null) {
            startAnimation(c70843Tv);
        }
    }

    public void setShowLaptop(boolean z) {
        this.A0C = z;
    }
}
