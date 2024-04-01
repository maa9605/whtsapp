package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.0kI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12910kI extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public int A04;
    public boolean A06;
    public final Bitmap A07;
    public final BitmapShader A08;
    public int A03 = 119;
    public final Paint A0A = new Paint(3);
    public final Matrix A09 = new Matrix();
    public final Rect A0B = new Rect();
    public final RectF A0C = new RectF();
    public boolean A05 = true;

    public abstract void A02(int i, int i2, int i3, Rect rect, Rect rect2);

    public AbstractC12910kI(Resources resources, Bitmap bitmap) {
        this.A04 = 160;
        if (resources != null) {
            this.A04 = resources.getDisplayMetrics().densityDpi;
        }
        this.A07 = bitmap;
        this.A02 = bitmap.getScaledWidth(this.A04);
        this.A01 = this.A07.getScaledHeight(this.A04);
        Bitmap bitmap2 = this.A07;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A08 = new BitmapShader(bitmap2, tileMode, tileMode);
    }

    public void A00() {
        this.A06 = true;
        this.A05 = true;
        this.A00 = Math.min(this.A01, this.A02) >> 1;
        this.A0A.setShader(this.A08);
        invalidateSelf();
    }

    public void A01() {
        Rect rect;
        if (this.A05) {
            if (!this.A06) {
                int i = this.A02;
                int i2 = this.A01;
                Rect bounds = getBounds();
                rect = this.A0B;
                A02(119, i, i2, bounds, rect);
            } else {
                int min = Math.min(this.A02, this.A01);
                Rect bounds2 = getBounds();
                rect = this.A0B;
                A02(119, min, min, bounds2, rect);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) >> 1), Math.max(0, (rect.height() - min2) >> 1));
                this.A00 = min2 * 0.5f;
            }
            RectF rectF = this.A0C;
            rectF.set(rect);
            BitmapShader bitmapShader = this.A08;
            if (bitmapShader != null) {
                Matrix matrix = this.A09;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.A07;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.A0A.setShader(bitmapShader);
            }
            this.A05 = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.A07;
        if (bitmap == null) {
            return;
        }
        A01();
        Paint paint = this.A0A;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.A0B, paint);
            return;
        }
        RectF rectF = this.A0C;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.A0A.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.A0A.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.A06 || (bitmap = this.A07) == null || bitmap.hasAlpha() || this.A0A.getAlpha() < 255 || this.A00 > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.A06) {
            this.A00 = Math.min(this.A01, this.A02) >> 1;
        }
        this.A05 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Paint paint = this.A0A;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.A0A.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.A0A.setFilterBitmap(z);
        invalidateSelf();
    }
}
