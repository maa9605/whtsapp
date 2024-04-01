package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.42d  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C881842d {
    public final Matrix A00;

    public C881842d(C44B c44b, int i, int i2, int i3, Matrix matrix) {
        RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
        matrix.mapRect(rectF);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(c44b == C44B.FRONT ? -1.0f : 1.0f, 1.0f);
        matrix2.postRotate(i);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), rectF, Matrix.ScaleToFit.FILL);
        matrix2.setConcat(matrix3, matrix2);
        Matrix matrix4 = new Matrix();
        this.A00 = matrix4;
        matrix2.invert(matrix4);
    }
}
