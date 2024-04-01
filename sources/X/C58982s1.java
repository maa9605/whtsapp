package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.2s1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C58982s1 extends Drawable {
    public final Paint A00;

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

    public C58982s1(int i) {
        Paint paint = new Paint(1);
        this.A00 = paint;
        if (paint.getColor() != i) {
            this.A00.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(getBounds(), this.A00);
    }
}
