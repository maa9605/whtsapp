package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.4AB  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4AB extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06 = new Paint(1);

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

    public C4AB(Context context) {
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.payment_card_circle_stroke_width);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.payment_card_circle_shift);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.payment_card_view_radius);
        this.A01 = context.getResources().getColor(R.color.payment_method_card_art_circles);
        this.A04 = context.getResources().getColor(R.color.payment_method_card_art_grad_top);
        this.A03 = context.getResources().getColor(R.color.payment_method_card_art_grad_bottom);
    }

    public final void A00(Canvas canvas, float f, float f2) {
        int i = 0;
        do {
            int i2 = (this.A00 * i) + 50;
            Paint paint = this.A06;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.A05);
            paint.setColor(this.A01);
            canvas.drawCircle(f, f2, i2, paint);
            i++;
        } while (i < 62);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{this.A04, this.A03});
        float f = this.A02;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setBounds(0, 0, width, height);
        gradientDrawable.draw(canvas);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        Path path = new Path();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        float f2 = height + 120;
        A00(canvas, 100.0f, f2);
        A00(canvas, width - 100, f2);
    }
}
