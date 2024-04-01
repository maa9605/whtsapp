package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/* renamed from: X.1XA  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XA implements InterfaceC18700uB {
    public final /* synthetic */ float A00 = 240.0f;

    @Override // X.InterfaceC18700uB
    public Bitmap A6j() {
        float f = this.A00;
        Paint paint = new Paint(1);
        float f2 = C08N.A00 * 10.0f;
        int round = Math.round(2.0f * f2);
        int round2 = Math.round(3.0f * f2);
        Bitmap createBitmap = Bitmap.createBitmap(round + 10, round2 + 10, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        float[] fArr = {f, 1.0f, 1.0f};
        int HSVToColor = Color.HSVToColor(fArr);
        fArr[2] = 0.8f;
        int HSVToColor2 = Color.HSVToColor(fArr);
        fArr[2] = 0.5f;
        int HSVToColor3 = Color.HSVToColor(fArr);
        paint.setColor(HSVToColor);
        float f3 = 5.0f + f2;
        float f4 = round2 + 5;
        C08N.A02(canvas, paint, f3, f4, f2);
        paint.setColor(HSVToColor3);
        canvas.drawCircle(f3, f3, f2 / 2.5f, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C08N.A00);
        paint.setColor(HSVToColor2);
        C08N.A02(canvas, paint, f3, f4, f2);
        return createBitmap;
    }
}
