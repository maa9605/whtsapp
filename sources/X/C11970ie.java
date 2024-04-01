package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.0ie  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C11970ie extends Drawable {
    public float A00;
    public float A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public PorterDuffColorFilter A05;
    public final Rect A09;
    public final RectF A0A;
    public boolean A06 = false;
    public boolean A07 = true;
    public PorterDuff.Mode A04 = PorterDuff.Mode.SRC_IN;
    public final Paint A08 = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C11970ie(ColorStateList colorStateList, float f) {
        this.A01 = f;
        A01(colorStateList);
        this.A0A = new RectF();
        this.A09 = new Rect();
    }

    public final PorterDuffColorFilter A00(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void A01(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.A02 = colorStateList;
        this.A08.setColor(colorStateList.getColorForState(getState(), this.A02.getDefaultColor()));
    }

    public final void A02(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.A0A;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.A09;
        rect2.set(rect);
        if (this.A06) {
            float f = this.A00;
            float f2 = this.A01;
            boolean z = this.A07;
            float A00 = C11990ig.A00(f, f2, z);
            if (z) {
                f = (float) (((1.0d - C11990ig.A0H) * f2) + f);
            }
            rect2.inset((int) Math.ceil(f), (int) Math.ceil(A00));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.A08;
        if (this.A05 != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.A05);
            z = true;
        } else {
            z = false;
        }
        RectF rectF = this.A0A;
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A03;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.A02) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A02(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.A02;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.A08;
        boolean z = false;
        if (colorForState != paint.getColor()) {
            z = true;
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.A03;
        if (colorStateList2 == null || (mode = this.A04) == null) {
            return z;
        }
        this.A05 = A00(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.A03 = colorStateList;
        this.A05 = A00(colorStateList, this.A04);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.A04 = mode;
        this.A05 = A00(this.A03, mode);
        invalidateSelf();
    }
}
