package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.2Sa  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50502Sa extends Drawable {
    public int A00;
    public ColorStateList A01;
    public final Paint A02 = new Paint(1);
    public final Path A03 = new Path();
    public final RectF A05 = new RectF();
    public final Rect A04 = new Rect();

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

    public C50502Sa(int i) {
        this.A00 = i;
    }

    public C50502Sa(ColorStateList colorStateList) {
        this.A01 = colorStateList;
        this.A00 = colorStateList.getColorForState(getState(), 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect bounds = getBounds();
        int width = bounds.width();
        Rect rect = this.A04;
        int max = Math.max(0, (width - rect.left) - rect.right);
        int max2 = Math.max(0, (bounds.height() - rect.top) - rect.bottom);
        Path path = this.A03;
        path.rewind();
        if (max > max2) {
            float f = max2 >> 1;
            path.moveTo(f, 0.0f);
            path.lineTo(max - i2, 0.0f);
            RectF rectF = this.A05;
            float f2 = max2;
            rectF.set(max - max2, 0.0f, max, f2);
            path.arcTo(rectF, -90.0f, 180.0f);
            path.lineTo(f, f2);
            rectF.set(0.0f, 0.0f, f2, f2);
            path.arcTo(rectF, 90.0f, 180.0f);
        } else if (max < max2) {
            float f3 = max >> 1;
            path.moveTo(0.0f, f3);
            path.lineTo(0.0f, max2 - i);
            RectF rectF2 = this.A05;
            float f4 = max;
            rectF2.set(0.0f, max2 - max, f4, max2);
            path.arcTo(rectF2, -180.0f, -180.0f);
            path.lineTo(f4, f3);
            rectF2.set(0.0f, 0.0f, f4, f4);
            path.arcTo(rectF2, 0.0f, -180.0f);
        } else {
            RectF rectF3 = this.A05;
            rectF3.set(0.0f, 0.0f, max, max2);
            path.addOval(rectF3, Path.Direction.CW);
        }
        path.close();
        path.setFillType(Path.FillType.WINDING);
        Paint paint = this.A02;
        paint.setColor(this.A00);
        paint.setStyle(Paint.Style.FILL);
        canvas.translate(bounds.left + rect.left, bounds.top + rect.top);
        canvas.drawPath(path, paint);
        canvas.translate(-(bounds.left + rect.left), -(bounds.top + rect.top));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.A01;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.A01;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.A00)) != this.A00) {
            this.A00 = colorForState;
            invalidateSelf();
            return true;
        }
        return false;
    }
}
