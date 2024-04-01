package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.2tU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59832tU {
    public Bitmap A00;
    public Matrix A01;

    public C59832tU(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public int A00() {
        if (A02()) {
            return this.A00.getWidth();
        }
        return this.A00.getHeight();
    }

    public int A01() {
        if (A02()) {
            return this.A00.getHeight();
        }
        return this.A00.getWidth();
    }

    public boolean A02() {
        Matrix matrix = this.A01;
        if (matrix != null) {
            float[] fArr = {0.0f, 1.0f};
            matrix.mapVectors(fArr);
            if (fArr[0] != 0.0f) {
                return true;
            }
        }
        return false;
    }
}
