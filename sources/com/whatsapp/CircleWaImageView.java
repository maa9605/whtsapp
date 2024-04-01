package com.whatsapp;

import X.AbstractC08130ah;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.CircleWaImageView;

/* loaded from: classes.dex */
public class CircleWaImageView extends AbstractC08130ah {
    public float A00;
    public int A01;
    public int A02;
    public Bitmap A03;
    public BitmapShader A04;
    public Matrix A05;
    public Paint A06;
    public boolean A07;
    public boolean A08;
    public final RectF A09;
    public static final ImageView.ScaleType A0B = ImageView.ScaleType.CENTER_CROP;
    public static final Bitmap.Config A0A = Bitmap.Config.ARGB_8888;

    public CircleWaImageView(final Context context, final AttributeSet attributeSet) {
        new WaImageView(context, attributeSet, 0) { // from class: X.0ah
            public boolean A00;

            {
                A00();
            }

            @Override // X.AbstractC08140aj
            public void A00() {
                if (this.A00) {
                    return;
                }
                this.A00 = true;
                ((AbstractC07960aN) generatedComponent()).A03((CircleWaImageView) this);
            }
        };
        this.A09 = new RectF();
        this.A06 = new Paint();
        this.A05 = new Matrix();
        super.setScaleType(A0B);
        this.A07 = true;
        if (this.A08) {
            A03();
            this.A08 = false;
        }
    }

    public final void A02() {
        Drawable drawable = getDrawable();
        Bitmap bitmap = null;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), A0A);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = createBitmap;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.A03 = bitmap;
        A03();
    }

    public final void A03() {
        int width;
        int height;
        float width2;
        float height2;
        if (!this.A07) {
            this.A08 = true;
        } else if (getWidth() == 0 && getHeight() == 0) {
        } else {
            Bitmap bitmap = this.A03;
            if (bitmap == null) {
                invalidate();
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.A04 = new BitmapShader(bitmap, tileMode, tileMode);
            this.A06.setAntiAlias(true);
            this.A06.setShader(this.A04);
            this.A01 = this.A03.getHeight();
            this.A02 = this.A03.getWidth();
            RectF rectF = this.A09;
            int min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
            float paddingLeft = ((width - min) / 2.0f) + getPaddingLeft();
            float paddingTop = ((height - min) / 2.0f) + getPaddingTop();
            float f = min;
            rectF.set(new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop));
            this.A00 = Math.min(rectF.height() / 2.0f, rectF.width() / 2.0f);
            this.A05.set(null);
            float f2 = 0.0f;
            if (rectF.height() * this.A02 > rectF.width() * this.A01) {
                width2 = rectF.height() / this.A01;
                f2 = (rectF.width() - (this.A02 * width2)) * 0.5f;
                height2 = 0.0f;
            } else {
                width2 = rectF.width() / this.A02;
                height2 = (rectF.height() - (this.A01 * width2)) * 0.5f;
            }
            this.A05.setScale(width2, width2);
            this.A05.postTranslate(((int) (f2 + 0.5f)) + rectF.left, ((int) (height2 + 0.5f)) + rectF.top);
            this.A04.setLocalMatrix(this.A05);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return A0B;
    }

    @Override // com.whatsapp.WaImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.A03 == null) {
            return;
        }
        RectF rectF = this.A09;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.A00, this.A06);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A03();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // X.C0S5, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        A02();
    }

    @Override // X.C0S5, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        A02();
    }

    @Override // X.C0S5, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        A02();
    }

    @Override // X.C0S5, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        A02();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        A03();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        A03();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != A0B) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }
}
