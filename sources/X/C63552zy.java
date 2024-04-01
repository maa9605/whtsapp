package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.2zy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C63552zy {
    public final C63512zu A01;
    public final float[] A02 = new float[2];
    public final Matrix A00 = new Matrix();

    public C63552zy(C63512zu c63512zu) {
        this.A01 = c63512zu;
    }

    public PointF A00(float f, float f2) {
        Matrix matrix = this.A00;
        matrix.reset();
        C63512zu c63512zu = this.A01;
        matrix.preRotate(-c63512zu.A02);
        int i = c63512zu.A02;
        if (i == 90) {
            matrix.preTranslate(-((int) c63512zu.A0B.width()), 0.0f);
        } else if (i == 180) {
            RectF rectF = c63512zu.A0B;
            matrix.preTranslate(-((int) rectF.width()), -((int) rectF.height()));
        } else if (i == 270) {
            matrix.preTranslate(0.0f, -((int) c63512zu.A0B.height()));
        } else if (i != 0) {
            throw new IllegalArgumentException();
        }
        Rect rect = c63512zu.A05;
        if (rect != null) {
            f = ((f * rect.width()) / c63512zu.A04) + rect.left;
            f2 = ((f2 * rect.height()) / c63512zu.A03) + rect.top;
        }
        float[] fArr = this.A02;
        RectF rectF2 = c63512zu.A0B;
        fArr[0] = f - rectF2.left;
        fArr[1] = f2 - rectF2.top;
        matrix.mapPoints(fArr);
        RectF rectF3 = c63512zu.A07;
        float f3 = rectF3.left;
        RectF rectF4 = c63512zu.A06;
        float f4 = fArr[0];
        float f5 = c63512zu.A00;
        return new PointF((f4 / f5) + (f3 - rectF4.left), (fArr[1] / f5) + (rectF3.top - rectF4.top));
    }

    public PointF A01(PointF pointF) {
        float[] fArr = this.A02;
        float f = pointF.x;
        C63512zu c63512zu = this.A01;
        RectF rectF = c63512zu.A07;
        float f2 = rectF.left;
        RectF rectF2 = c63512zu.A06;
        float f3 = c63512zu.A00;
        fArr[0] = (f - (f2 - rectF2.left)) * f3;
        fArr[1] = (pointF.y - (rectF.top - rectF2.top)) * f3;
        Matrix matrix = this.A00;
        matrix.reset();
        int i = c63512zu.A02;
        if (i == 90) {
            matrix.preTranslate((int) c63512zu.A0B.width(), 0.0f);
        } else if (i == 180) {
            RectF rectF3 = c63512zu.A0B;
            matrix.preTranslate((int) rectF3.width(), (int) rectF3.height());
        } else if (i == 270) {
            matrix.preTranslate(0.0f, (int) c63512zu.A0B.height());
        } else if (i != 0) {
            throw new IllegalArgumentException();
        }
        matrix.preRotate(c63512zu.A02);
        matrix.mapPoints(fArr);
        float f4 = fArr[0];
        float f5 = fArr[1];
        RectF rectF4 = c63512zu.A0B;
        float f6 = f4 + rectF4.left;
        float f7 = f5 + rectF4.top;
        Rect rect = c63512zu.A05;
        if (rect != null) {
            f6 = ((f6 - rect.left) * c63512zu.A04) / rect.width();
            f7 = ((f7 - rect.top) * c63512zu.A03) / rect.height();
        }
        return new PointF(f6, f7);
    }
}
