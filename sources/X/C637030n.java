package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.30n  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C637030n extends Drawable {
    public int A00;
    public final Paint A01 = new Paint(1);

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

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.A01;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.A00);
        Rect bounds = getBounds();
        canvas.drawCircle(0.0f, 0.0f, Math.min(bounds.width(), bounds.height()), paint);
    }
}
