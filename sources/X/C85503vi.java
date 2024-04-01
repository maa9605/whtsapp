package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;

/* renamed from: X.3vi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85503vi extends AbstractC75433et {
    public static final int A04 = Build.VERSION.SDK_INT;
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03 = EGL14.EGL_NO_SURFACE;

    public C85503vi(C85493vh c85493vh, int[] iArr) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.A00 = eGLConfig;
                    EGLDisplay eGLDisplay = this.A02;
                    if (c85493vh != null) {
                        throw null;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                        this.A01 = eglCreateContext;
                        return;
                    }
                    throw C000200d.A06("eglCreateContext", "Failed to create EGL context");
                }
                throw C000200d.A06("eglChooseConfig", "Unable to find any matching EGL config");
            }
            throw C000200d.A06("eglInitialize", "Unable to initialize EGL14");
        }
        throw new RuntimeException("Unable to get EGL14 display");
    }

    @Override // X.AbstractC75433et
    public int A00() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.A02, this.A03, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // X.AbstractC75433et
    public int A01() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.A02, this.A03, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // X.AbstractC75433et
    public void A02() {
        EGLDisplay eGLDisplay = this.A02;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw C000200d.A06("detachCurrent", "eglMakeCurrent failed");
        }
    }

    @Override // X.AbstractC75433et
    public void A03() {
        A09();
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            if (!EGL14.eglMakeCurrent(this.A02, eGLSurface, eGLSurface, this.A01)) {
                throw C000200d.A06("makeCurrent", "eglMakeCurrent failed");
            }
            return;
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    @Override // X.AbstractC75433et
    public void A04() {
        A09();
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.A02, eGLSurface);
            this.A03 = EGL14.EGL_NO_SURFACE;
        }
        A02();
        EGL14.eglDestroyContext(this.A02, this.A01);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.A02);
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A00 = null;
    }

    @Override // X.AbstractC75433et
    public void A05() {
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.A02, eGLSurface);
            this.A03 = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // X.AbstractC75433et
    public void A06(Surface surface) {
        if (surface == null) {
            throw new IllegalStateException("Input must be either a Surface or SurfaceTexture");
        }
        A09();
        if (this.A03 == EGL14.EGL_NO_SURFACE) {
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.A02, this.A00, surface, new int[]{12344}, 0);
            this.A03 = eglCreateWindowSurface;
            if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                throw C000200d.A06("eglCreateWindowSurface", "Failed to create window surface");
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    @Override // X.AbstractC75433et
    public boolean A07() {
        return this.A03 != EGL14.EGL_NO_SURFACE;
    }

    @Override // X.AbstractC75433et
    public boolean A08() {
        A09();
        EGLSurface eGLSurface = this.A03;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            return EGL14.eglSwapBuffers(this.A02, eGLSurface);
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }

    public final void A09() {
        if (this.A02 == EGL14.EGL_NO_DISPLAY || this.A01 == EGL14.EGL_NO_CONTEXT || this.A00 == null) {
            throw new RuntimeException("This object has been released");
        }
    }
}
