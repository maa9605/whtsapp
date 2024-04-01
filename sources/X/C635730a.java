package X;

import android.opengl.Matrix;

/* renamed from: X.30a  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C635730a {
    public static final float[] A05 = {1.0f, 0.0f, -3.0f, 2.0f, 0.0f, 1.0f, -2.0f, 1.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 3.0f, -2.0f};
    public static final float[] A06 = {0.0f, -6.0f, 6.0f, 0.0f, 1.0f, -4.0f, 3.0f, 0.0f, 0.0f, -2.0f, 3.0f, 0.0f, 0.0f, 6.0f, -6.0f, 0.0f};
    public final float[] A01;
    public final float[] A02;
    public final float[] A04;
    public final float[] A03 = new float[16];
    public float A00 = -1.0f;

    public C635730a(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        this.A04 = fArr3;
        this.A01 = fArr;
        this.A02 = fArr2;
        float[] fArr4 = A05;
        Matrix.multiplyMV(fArr3, 0, fArr4, 0, fArr, 0);
        Matrix.multiplyMV(this.A04, 4, fArr4, 0, fArr2, 0);
        float[] fArr5 = this.A04;
        float[] fArr6 = A06;
        Matrix.multiplyMV(fArr5, 8, fArr6, 0, fArr, 0);
        Matrix.multiplyMV(this.A04, 12, fArr6, 0, fArr2, 0);
        Matrix.transposeM(this.A03, 0, this.A04, 0);
    }

    public float A00() {
        float f = this.A00;
        float f2 = 0.0f;
        if (f >= 0.0f) {
            return f;
        }
        float f3 = 1.0f / 10;
        C636130e c636130e = new C636130e(this.A01[0], this.A02[0]);
        C636130e c636130e2 = new C636130e();
        float f4 = f3;
        int i = 0;
        do {
            float[] fArr = this.A04;
            A01(f4, fArr);
            c636130e2.set(fArr[0], fArr[1]);
            f2 += c636130e.A00(c636130e2);
            c636130e.set(c636130e2);
            i++;
            f4 += f3;
        } while (i < 10);
        this.A00 = f2;
        return f2;
    }

    public void A01(float f, float[] fArr) {
        float f2 = f * f;
        Matrix.multiplyMV(fArr, 0, this.A03, 0, new float[]{1.0f, f, f2, f2 * f}, 0);
    }
}
