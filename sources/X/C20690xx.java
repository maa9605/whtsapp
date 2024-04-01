package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.0xx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20690xx extends Drawable {
    public ValueAnimator A00;
    public C20670xv A01;
    public final ValueAnimator.AnimatorUpdateListener A02 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.0xw
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C20690xx.this.invalidateSelf();
        }
    };
    public final Paint A04 = new Paint();
    public final Rect A05 = new Rect();
    public final Matrix A03 = new Matrix();

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C20690xx() {
        this.A04.setAntiAlias(true);
    }

    public void A00() {
        C20670xv c20670xv;
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator == null || valueAnimator.isStarted() || (c20670xv = this.A01) == null || !c20670xv.A0G || getCallback() == null) {
            return;
        }
        this.A00.start();
    }

    public final void A01() {
        C20670xv c20670xv;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (c20670xv = this.A01) == null) {
            return;
        }
        int i = c20670xv.A08;
        if (i <= 0) {
            i = Math.round(c20670xv.A04 * width);
        }
        int i2 = c20670xv.A07;
        if (i2 <= 0) {
            i2 = Math.round(c20670xv.A01 * height);
        }
        if (c20670xv.A0C != 1) {
            int i3 = c20670xv.A06;
            if (i3 == 1 || i3 == 3) {
                i = 0;
            } else {
                i2 = 0;
            }
            radialGradient = new LinearGradient(0.0f, 0.0f, i, i2, c20670xv.A0J, c20670xv.A0I, Shader.TileMode.CLAMP);
        } else {
            radialGradient = new RadialGradient(i / 2.0f, i2 / 2.0f, (float) (Math.max(i, i2) / Math.sqrt(2.0d)), c20670xv.A0J, c20670xv.A0I, Shader.TileMode.CLAMP);
        }
        this.A04.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        if (this.A01 != null) {
            Paint paint = this.A04;
            if (paint.getShader() != null) {
                float tan = (float) Math.tan(Math.toRadians(this.A01.A03));
                Rect rect = this.A05;
                float width = (rect.width() * tan) + rect.height();
                float height = (tan * rect.height()) + rect.width();
                ValueAnimator valueAnimator = this.A00;
                float f3 = 0.0f;
                float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
                int i = this.A01.A06;
                if (i != 1) {
                    if (i == 2) {
                        f2 = height + (((-height) - height) * animatedFraction);
                    } else if (i != 3) {
                        float f4 = -height;
                        f2 = ((height - f4) * animatedFraction) + f4;
                    } else {
                        f = (((-width) - width) * animatedFraction) + width;
                    }
                    f3 = f2;
                    f = 0.0f;
                } else {
                    float f5 = -width;
                    f = ((width - f5) * animatedFraction) + f5;
                }
                Matrix matrix = this.A03;
                matrix.reset();
                matrix.setRotate(this.A01.A03, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f3, f);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        C20670xv c20670xv = this.A01;
        if (c20670xv != null) {
            return (c20670xv.A0H || c20670xv.A0F) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.A05.set(0, 0, rect.width(), rect.height());
        A01();
        A00();
    }
}
