package X;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.1LI  reason: invalid class name */
/* loaded from: classes.dex */
public class C1LI implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public Surface A01;
    public C1LJ A02;
    public EGL10 A03;
    public EGLContext A04;
    public EGLDisplay A05;
    public EGLSurface A06;
    public boolean A07;
    public final Object A08 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1LI(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1LI.<init>(int, int):void");
    }

    public void A00() {
        if (this.A03 != null) {
            A01("before makeCurrent");
            EGL10 egl10 = this.A03;
            EGLDisplay eGLDisplay = this.A05;
            EGLSurface eGLSurface = this.A06;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A04)) {
                throw new RuntimeException("eglMakeCurrent failed");
            }
            return;
        }
        throw new RuntimeException("not configured for makeCurrent");
    }

    public final void A01(String str) {
        boolean z = false;
        while (true) {
            int eglGetError = this.A03.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            StringBuilder A0V = C000200d.A0V(str, ": EGL error: 0x");
            A0V.append(Integer.toHexString(eglGetError));
            Log.e("OutputSurface", A0V.toString());
            z = true;
        }
        if (z) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A08;
        synchronized (obj) {
            if (!this.A07) {
                this.A07 = true;
                obj.notifyAll();
            } else {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
        }
    }
}
