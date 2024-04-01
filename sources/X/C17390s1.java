package X;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: X.0s1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17390s1 {
    public C17420s4 A00;
    public final C17360ry A01 = new C17360ry(EnumC17350rx.FULL_RECTANGLE);

    public C17390s1(C17420s4 c17420s4) {
        this.A00 = c17420s4;
    }

    public int A00() {
        C17420s4 c17420s4 = this.A00;
        if (c17420s4 != null) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C17400s2.A04("glGenTextures");
            int i = iArr[0];
            GLES20.glBindTexture(c17420s4.A01, i);
            StringBuilder sb = new StringBuilder("glBindTexture ");
            sb.append(i);
            C17400s2.A04(sb.toString());
            GLES20.glTexParameterf(36197, 10241, 9728.0f);
            GLES20.glTexParameterf(36197, 10240, 9729.0f);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            C17400s2.A04("glTexParameter");
            return i;
        }
        throw null;
    }

    public void A01(int i, float[] fArr) {
        C17420s4 c17420s4 = this.A00;
        float[] fArr2 = C17400s2.A00;
        C17360ry c17360ry = this.A01;
        FloatBuffer floatBuffer = c17360ry.A06;
        int i2 = c17360ry.A02;
        int i3 = c17360ry.A00;
        int i4 = c17360ry.A03;
        FloatBuffer floatBuffer2 = c17360ry.A05;
        int i5 = c17360ry.A01;
        if (c17420s4 != null) {
            C17400s2.A04("draw start");
            GLES20.glUseProgram(c17420s4.A00);
            C17400s2.A04("glUseProgram");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(c17420s4.A01, i);
            GLES20.glUniformMatrix4fv(c17420s4.A06, 1, false, fArr2, 0);
            C17400s2.A04("glUniformMatrix4fv");
            GLES20.glUniformMatrix4fv(c17420s4.A07, 1, false, fArr, 0);
            C17400s2.A04("glUniformMatrix4fv");
            GLES20.glEnableVertexAttribArray(c17420s4.A02);
            C17400s2.A04("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(c17420s4.A02, i3, 5126, false, i4, (Buffer) floatBuffer);
            C17400s2.A04("glVertexAttribPointer");
            GLES20.glEnableVertexAttribArray(c17420s4.A03);
            C17400s2.A04("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(c17420s4.A03, 2, 5126, false, i5, (Buffer) floatBuffer2);
            C17400s2.A04("glVertexAttribPointer");
            int i6 = c17420s4.A05;
            if (i6 >= 0) {
                GLES20.glUniform1fv(i6, 9, c17420s4.A09, 0);
                GLES20.glUniform2fv(c17420s4.A08, 9, c17420s4.A0A, 0);
                GLES20.glUniform1f(c17420s4.A04, 0.0f);
            }
            GLES20.glDrawArrays(5, 0, i2);
            C17400s2.A04("glDrawArrays");
            GLES20.glDisableVertexAttribArray(c17420s4.A02);
            GLES20.glDisableVertexAttribArray(c17420s4.A03);
            GLES20.glBindTexture(c17420s4.A01, 0);
            GLES20.glUseProgram(0);
            return;
        }
        throw null;
    }
}
