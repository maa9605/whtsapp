package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: X.0s0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17380s0 {
    public C17370rz A03;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public int A01 = -1;
    public int A00 = -1;

    public C17380s0(C17370rz c17370rz) {
        this.A03 = c17370rz;
    }

    public void A00() {
        C17370rz c17370rz = this.A03;
        EGLSurface eGLSurface = this.A02;
        if (c17370rz.A02 == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(c17370rz.A02, eGLSurface, eGLSurface, c17370rz.A01)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void A01() {
        C17370rz c17370rz = this.A03;
        if (EGL14.eglSwapBuffers(c17370rz.A02, this.A02)) {
            return;
        }
        Log.d("Grafika", "WARNING: swapBuffers() failed");
    }
}
