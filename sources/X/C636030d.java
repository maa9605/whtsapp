package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.30d */
/* loaded from: classes2.dex */
public class C636030d {
    public float A00;
    public long A02;
    public Canvas A03;
    public final float A05;
    public final float A06;
    public final long A07;
    public final Paint A08;
    public final C635830b A09;
    public final C635930c A0A;
    public final List A0B = new ArrayList();
    public final List A0C = new ArrayList();
    public float[] A04 = new float[4];
    public int A01 = 0;

    public C636030d(PointF pointF, long j, Bitmap bitmap, PointF pointF2, int i, Paint paint, float f, float f2) {
        this.A07 = j;
        C635930c c635930c = new C635930c(pointF, j);
        this.A0A = c635930c;
        this.A09 = c635930c.A02.A03;
        if (bitmap != null) {
            Canvas canvas = new Canvas(bitmap);
            float f3 = i;
            canvas.scale(f3, f3);
            if (pointF2 != null) {
                canvas.translate(-pointF2.x, -pointF2.y);
            }
            this.A03 = canvas;
        }
        this.A05 = f;
        this.A08 = paint;
        this.A02 = j;
        this.A06 = f2;
        this.A00 = A00(i);
        A03(pointF, j);
    }

    public final float A00(int i) {
        float f = (this.A05 * 0.03f) - 0.125f;
        if (f < 0.125f) {
            f = 0.125f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        return (f * this.A06) / i;
    }

    public final void A01(Canvas canvas, int i) {
        if (canvas == null) {
            return;
        }
        C635830b c635830b = this.A09;
        float f = this.A00;
        c635830b.A04 = f;
        int floor = ((int) Math.floor(c635830b.A03 / f)) + 1;
        this.A01 = i;
        while (i < floor) {
            float[] fArr = this.A04;
            float f2 = i * c635830b.A04;
            if (f2 < c635830b.A01 || f2 > c635830b.A00) {
                Map.Entry floorEntry = c635830b.A08.floorEntry(Float.valueOf(f2));
                if (floorEntry == null) {
                    c635830b.A06 = null;
                    c635830b.A01 = 1.0f;
                    c635830b.A00 = 0.0f;
                } else {
                    c635830b.A06 = (C635730a) floorEntry.getValue();
                    float floatValue = ((Number) floorEntry.getKey()).floatValue();
                    c635830b.A01 = floatValue;
                    c635830b.A00 = c635830b.A06.A00() + floatValue;
                }
            }
            C635730a c635730a = c635830b.A06;
            if (c635730a != null) {
                c635730a.A01((f2 - c635830b.A01) / c635730a.A00(), fArr);
            } else {
                c635830b.A07.A01(1.0f, fArr);
            }
            Paint paint = this.A08;
            float[] fArr2 = this.A04;
            PointF pointF = new PointF(fArr2[2], fArr2[3]);
            float f3 = this.A05;
            float f4 = pointF.x;
            float f5 = pointF.y;
            double sqrt = Math.sqrt((f5 * f5) + (f4 * f4));
            float f6 = C636230f.A00;
            float sqrt2 = (((float) Math.sqrt(sqrt)) - 0.0f) / ((0.4f * f3) - 0.0f);
            if (sqrt2 < 0.0f) {
                sqrt2 = 0.0f;
            } else if (sqrt2 > 1.0f) {
                sqrt2 = 1.0f;
            }
            paint.setStrokeWidth((1.0f - (f6 * ((3.0f - (sqrt2 * 2.0f)) * (sqrt2 * sqrt2)))) * f3);
            float[] fArr3 = this.A04;
            canvas.drawPoint(fArr3[0], fArr3[1], paint);
            i = this.A01 + 1;
            this.A01 = i;
        }
    }

    public void A02(PointF pointF, long j) {
        long max = Math.max(j, this.A02 + 1);
        this.A0B.add(pointF);
        this.A0C.add(Long.valueOf(max - this.A07));
        C635930c c635930c = this.A0A;
        PointF pointF2 = c635930c.A04;
        pointF2.set(pointF);
        while (c635930c.A01 + 3.0d < max) {
            c635930c.A00();
        }
        C636130e c636130e = c635930c.A05;
        float A00 = c636130e.A00(pointF2);
        C636130e c636130e2 = new C636130e();
        float f = A00;
        while (A00 > 0.0f && f > 0.0f) {
            c636130e2.set(c636130e);
            c635930c.A00();
            f = c636130e.A00(c636130e2);
            A00 -= f;
        }
        C30Z c30z = c635930c.A02;
        long j2 = c30z.A02;
        C636130e c636130e3 = c30z.A00;
        if (c636130e3 != c30z.A01) {
            c30z.A00(c636130e3, j2);
            c30z.A01 = c30z.A00;
        }
        Canvas canvas = this.A03;
        if (canvas != null) {
            A01(canvas, this.A01);
        }
    }

    public void A03(PointF pointF, long j) {
        if (this.A02 > j) {
            return;
        }
        this.A0B.add(pointF);
        this.A0C.add(Long.valueOf(j - this.A07));
        C635930c c635930c = this.A0A;
        c635930c.A04.set(pointF);
        while (c635930c.A01 + 3.0d < j) {
            c635930c.A00();
        }
        Canvas canvas = this.A03;
        if (canvas != null) {
            A01(canvas, this.A01);
        }
    }
}
