package X;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2HL */
/* loaded from: classes2.dex */
public class C2HL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A05;
    public ValueAnimator A06;
    public Bitmap A07;
    public Bitmap A08;
    public Bitmap A09;
    public Bitmap A0A;
    public C2HG A0B;
    public boolean A0C;
    public boolean A0D;
    public final C67823Gz A0H;
    public final C63512zu A0I;
    public final C2HF A0J;
    public final PointF A0G = new PointF();
    public int A04 = 1;
    public final Paint A0F = new Paint(1);
    public final Paint A0E = new Paint(1);

    public C2HL(C63512zu c63512zu, C2HF c2hf, C67823Gz c67823Gz) {
        this.A0I = c63512zu;
        this.A0J = c2hf;
        this.A0H = c67823Gz;
    }

    public static Bitmap A00(Bitmap bitmap, int i, int i2) {
        if (bitmap != null && bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (NullPointerException e) {
            Log.i("NPE trying to create bitmap cache", e);
            return null;
        } catch (OutOfMemoryError e2) {
            Log.i("oom trying to create bitmap cache", e2);
            return null;
        }
    }

    public void A01() {
        Bitmap bitmap = this.A07;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        C2HF c2hf = this.A0J;
        if (c2hf != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : c2hf.A04) {
                if (obj instanceof C67833Ha) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            A02(true);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C67833Ha c67833Ha = (C67833Ha) it.next();
                Bitmap bitmap2 = this.A07;
                PointF pointF = this.A0G;
                int i = this.A04;
                c67833Ha.A01 = bitmap2;
                c67833Ha.A02 = pointF;
                c67833Ha.A00 = i;
                c67833Ha.A04 = false;
                if (bitmap2 != null) {
                    C636030d c636030d = c67833Ha.A03;
                    if (c636030d != null) {
                        Canvas canvas = new Canvas(bitmap2);
                        float f = i;
                        canvas.scale(f, f);
                        if (pointF != null) {
                            canvas.translate(-pointF.x, -pointF.y);
                        }
                        c636030d.A03 = canvas;
                        c636030d.A00 = c636030d.A00(i);
                        C636030d c636030d2 = c67833Ha.A03;
                        Canvas canvas2 = c636030d2.A03;
                        if (canvas2 != null) {
                            c636030d2.A01(canvas2, 0);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            return;
        }
        throw null;
    }

    public final boolean A02(boolean z) {
        C63512zu c63512zu = this.A0I;
        RectF rectF = c63512zu.A07;
        DisplayMetrics displayMetrics = c63512zu.A08;
        if (rectF == null || displayMetrics == null || (this.A07 == null && !z)) {
            return false;
        }
        int max = Math.max(1, (int) Math.min(displayMetrics.widthPixels / rectF.width(), displayMetrics.heightPixels / rectF.height()));
        Bitmap bitmap = this.A07;
        if (bitmap != null && bitmap.getHeight() == ((int) (rectF.height() * this.A04))) {
            int width = this.A07.getWidth();
            float width2 = rectF.width();
            int i = this.A04;
            if (width == ((int) (width2 * i))) {
                PointF pointF = this.A0G;
                if (pointF.x == rectF.left && pointF.y == rectF.top && max == i) {
                    return false;
                }
            }
        }
        this.A04 = max;
        this.A07 = A00(this.A07, (int) (rectF.width() * this.A04), (int) (rectF.height() * this.A04));
        this.A0G.set(rectF.left, rectF.top);
        return true;
    }
}
