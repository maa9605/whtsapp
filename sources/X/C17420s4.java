package X;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: X.0s4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17420s4 {
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public float[] A0A;
    public float[] A09 = new float[9];
    public int A01 = 36197;

    public C17420s4(EnumC17410s3 enumC17410s3) {
        int A00 = C17400s2.A00();
        this.A00 = A00;
        if (A00 != 0) {
            StringBuilder A0P = C000200d.A0P("Created program ");
            A0P.append(A00);
            A0P.append(" (");
            A0P.append(enumC17410s3);
            A0P.append(")");
            Log.d("Grafika", A0P.toString());
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.A00, "aPosition");
            this.A02 = glGetAttribLocation;
            C17400s2.A03(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A00, "aTextureCoord");
            this.A03 = glGetAttribLocation2;
            C17400s2.A03(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.A00, "uMVPMatrix");
            this.A06 = glGetUniformLocation;
            C17400s2.A03(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A00, "uTexMatrix");
            this.A07 = glGetUniformLocation2;
            C17400s2.A03(glGetUniformLocation2, "uTexMatrix");
            int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A00, "uKernel");
            this.A05 = glGetUniformLocation3;
            if (glGetUniformLocation3 < 0) {
                this.A05 = -1;
                this.A08 = -1;
                this.A04 = -1;
                return;
            }
            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.A00, "uTexOffset");
            this.A08 = glGetUniformLocation4;
            C17400s2.A03(glGetUniformLocation4, "uTexOffset");
            int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.A00, "uColorAdjust");
            this.A04 = glGetUniformLocation5;
            C17400s2.A03(glGetUniformLocation5, "uColorAdjust");
            System.arraycopy(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f}, 0, this.A09, 0, 9);
            float f = 1.0f / 256;
            float f2 = -f;
            this.A0A = new float[]{f2, f2, 0.0f, f2, f, f2, f2, 0.0f, 0.0f, 0.0f, f, 0.0f, f2, f, 0.0f, f, f, f};
            return;
        }
        throw new RuntimeException("Unable to create program");
    }
}
