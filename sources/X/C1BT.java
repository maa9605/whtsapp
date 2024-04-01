package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;

/* renamed from: X.1BT  reason: invalid class name */
/* loaded from: classes.dex */
public class C1BT extends GradientDrawable {
    public int A00;
    public final Paint A01;
    public final RectF A02;

    public C1BT() {
        Paint paint = new Paint(1);
        this.A01 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A01.setColor(-1);
        this.A01.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A02 = new RectF();
    }

    public void A00(float f, float f2, float f3, float f4) {
        RectF rectF = this.A02;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ((View) callback).setLayerType(2, null);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.A00 = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.A02, this.A01);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.A00);
    }
}
