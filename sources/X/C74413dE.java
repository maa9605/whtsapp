package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.3dE  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74413dE {
    public int A00;
    public final SurfaceTexture A01;
    public final float[] A03 = new float[16];
    public final ByteBuffer A02 = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder());

    public C74413dE() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
        C02180Ae.A1D("generateTexture");
        this.A00 = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.A01 = surfaceTexture;
        StringBuilder A0P = C000200d.A0P("voip/video/SurfaceTextureHolder/createSurfaceTexture, surfaceTexture = ");
        A0P.append(surfaceTexture);
        Log.i(A0P.toString());
    }
}
