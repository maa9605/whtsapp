package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.search.verification.client.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0L5 */
/* loaded from: classes.dex */
public class C0L5 {
    public static volatile C0L5 A07;
    public final C018508q A00;
    public final C02L A01;
    public final C0L7 A02;
    public final C05W A03;
    public final C018708s A04;
    public final C011505r A05;
    public final C0LF A06;

    public C0L5(C018508q c018508q, C02L c02l, C0L7 c0l7, C05W c05w, C018708s c018708s, C011505r c011505r, C0LF c0lf) {
        this.A00 = c018508q;
        this.A01 = c02l;
        this.A02 = c0l7;
        this.A03 = c05w;
        this.A04 = c018708s;
        this.A05 = c011505r;
        this.A06 = c0lf;
    }

    public static Bitmap A00(List list, float f) {
        C000700j.A08(list.size() > 1, "Insufficient number of bitmaps to combine");
        if (list.size() == 1) {
            return (Bitmap) list.get(0);
        }
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            if (i < bitmap.getWidth()) {
                i = bitmap.getWidth();
            }
            if (i2 < bitmap.getHeight()) {
                i2 = bitmap.getHeight();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f2 = i;
        float f3 = i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        Paint paint = new Paint();
        paint.setColor(-1);
        if (f != 0.0f) {
            if (f > 0.0f) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        if (list.size() == 2) {
            Rect rect = new Rect(((int) (i * 0.25d)) + 1, 0, ((int) (0.75f * f2)) - 1, i2);
            float f4 = f2 * 0.5f;
            canvas.drawBitmap((Bitmap) list.get(0), rect, new RectF(0.0f, 0.0f, f4 - 2.0f, f3), paint);
            canvas.drawBitmap((Bitmap) list.get(1), rect, new RectF(f4 + 2.0f, 0.0f, f2, f3), paint);
        } else if (list.size() == 3) {
            int i3 = ((int) (i * 0.25d)) + 1;
            int i4 = ((int) (0.75f * f2)) - 1;
            float f5 = f2 * 0.5f;
            canvas.drawBitmap((Bitmap) list.get(0), new Rect(i3, 0, i4, i2), new RectF(0.0f, 0.0f, f5 - 2.0f, f3), paint);
            double d = i2;
            Rect rect2 = new Rect(i3, ((int) (0.25d * d)) + 1, i4, ((int) (d * 0.75d)) - 1);
            float f6 = f5 + 2.0f;
            float f7 = f3 * 0.5f;
            canvas.drawBitmap((Bitmap) list.get(1), rect2, new RectF(f6, 0.0f, f2, f7 - 2.0f), paint);
            canvas.drawBitmap((Bitmap) list.get(2), rect2, new RectF(f6, f7 + 2.0f, f2, f3), paint);
            return createBitmap;
        } else if (list.size() == 4) {
            double d2 = i2;
            Rect rect3 = new Rect(((int) (i * 0.25d)) + 1, ((int) (0.25d * d2)) + 1, ((int) (0.75f * f2)) - 1, ((int) (d2 * 0.75d)) - 1);
            float f8 = f2 * 0.5f;
            float f9 = f8 - 2.0f;
            float f10 = 0.5f * f3;
            float f11 = f10 - 2.0f;
            canvas.drawBitmap((Bitmap) list.get(0), rect3, new RectF(0.0f, 0.0f, f9, f11), paint);
            float f12 = f10 + 2.0f;
            canvas.drawBitmap((Bitmap) list.get(1), rect3, new RectF(0.0f, f12, f9, f3), paint);
            float f13 = f8 + 2.0f;
            canvas.drawBitmap((Bitmap) list.get(2), rect3, new RectF(f13, 0.0f, f2, f11), paint);
            canvas.drawBitmap((Bitmap) list.get(3), rect3, new RectF(f13, f12, f2, f3), paint);
            return createBitmap;
        }
        return createBitmap;
    }

    public static C0L5 A01() {
        if (A07 == null) {
            synchronized (C0L5.class) {
                if (A07 == null) {
                    A07 = new C0L5(C018508q.A00(), C02L.A00(), C0L7.A02(), C05W.A00(), C018708s.A00(), C011505r.A00(), C0LF.A00());
                }
            }
        }
        return A07;
    }

    public Bitmap A02(Context context, C06C c06c, int i, int i2) {
        int min = Math.min(i, i2);
        float f = Build.VERSION.SDK_INT >= 21 ? -1 : 0;
        Bitmap A01 = this.A05.A01(c06c, min, f);
        return (A01 == null && c06c.A0R && min > 0) ? this.A06.A02(context, c06c, min, f, true) : A01;
    }

    public C0Zn A03(int i, float f) {
        return new C0Zn(this, i, f);
    }

    public C0Zn A04(Context context) {
        Resources resources = context.getResources();
        return new C0Zn(this, resources.getDimensionPixelSize(R.dimen.small_avatar_size), resources.getDimension(R.dimen.small_avatar_radius));
    }
}
