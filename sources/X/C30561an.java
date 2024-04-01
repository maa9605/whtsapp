package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.1an  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30561an extends C1YV {
    public C1F1 A00;

    public C30561an(Context context) {
        super(context);
        this.A00 = new C1F1(this);
    }

    @Override // X.C1YV, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1F1 c1f1 = this.A00;
        if (c1f1.A04) {
            canvas.drawPath(c1f1.A08, c1f1.A06);
            if (AnonymousClass088.A1t(c1f1.A03)) {
                RectF rectF = c1f1.A09;
                float f = c1f1.A00;
                canvas.drawRoundRect(rectF, f, f, c1f1.A05);
                return;
            }
            canvas.drawPath(c1f1.A07, c1f1.A05);
        }
    }

    public C1F1 getDecorationHelper() {
        return this.A00;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C1F1 c1f1 = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (c1f1.A04) {
            RectF rectF = c1f1.A0A;
            float f = measuredWidth;
            float f2 = measuredHeight;
            rectF.set(0.0f, 0.0f, f, f2);
            float f3 = c1f1.A01 / 2.0f;
            RectF rectF2 = c1f1.A09;
            rectF2.set(f3, f3, f - f3, f2 - f3);
            c1f1.A00 = c1f1.A02 - f3;
            Path path = c1f1.A08;
            path.reset();
            path.addRect(rectF, Path.Direction.CW);
            int i3 = c1f1.A03;
            if (AnonymousClass088.A1t(i3)) {
                float f4 = c1f1.A02;
                path.addRoundRect(rectF, f4, f4, Path.Direction.CCW);
                return;
            }
            c1f1.A01(path, rectF, Float.valueOf(c1f1.A02), i3);
            Path path2 = c1f1.A07;
            path2.reset();
            c1f1.A01(path2, rectF2, Float.valueOf(c1f1.A00), c1f1.A03);
        }
    }
}
