package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.3et */
/* loaded from: classes2.dex */
public abstract class AbstractC75433et {
    public static final int[] A00 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] A01 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    public int A00() {
        C85483vg c85483vg = (C85483vg) this;
        int[] iArr = new int[1];
        c85483vg.A04.eglQuerySurface(c85483vg.A02, c85483vg.A03, 12374, iArr);
        return iArr[0];
    }

    public int A01() {
        C85483vg c85483vg = (C85483vg) this;
        int[] iArr = new int[1];
        c85483vg.A04.eglQuerySurface(c85483vg.A02, c85483vg.A03, 12375, iArr);
        return iArr[0];
    }

    public void A02() {
        C85483vg c85483vg = (C85483vg) this;
        EGL10 egl10 = c85483vg.A04;
        EGLDisplay eGLDisplay = c85483vg.A02;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            return;
        }
        throw C000200d.A06("detachCurrent", "eglMakeCurrent failed");
    }

    public void A03() {
        C85483vg c85483vg = (C85483vg) this;
        c85483vg.A09();
        EGLSurface eGLSurface = c85483vg.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            if (c85483vg.A04.eglMakeCurrent(c85483vg.A02, eGLSurface, eGLSurface, c85483vg.A01)) {
                return;
            }
            throw C000200d.A06("makeCurrent", "eglMakeCurrent failed");
        }
        throw new RuntimeException("No EGLSurface - can't make current");
    }

    public void A04() {
        C85483vg c85483vg = (C85483vg) this;
        c85483vg.A09();
        EGLSurface eGLSurface = c85483vg.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            c85483vg.A04.eglDestroySurface(c85483vg.A02, eGLSurface);
            c85483vg.A03 = EGL10.EGL_NO_SURFACE;
        }
        c85483vg.A02();
        EGL10 egl10 = c85483vg.A04;
        egl10.eglDestroyContext(c85483vg.A02, c85483vg.A01);
        egl10.eglTerminate(c85483vg.A02);
        c85483vg.A01 = EGL10.EGL_NO_CONTEXT;
        c85483vg.A02 = EGL10.EGL_NO_DISPLAY;
        c85483vg.A00 = null;
    }

    public void A05() {
        C85483vg c85483vg = (C85483vg) this;
        EGLSurface eGLSurface = c85483vg.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            c85483vg.A04.eglDestroySurface(c85483vg.A02, eGLSurface);
            c85483vg.A03 = EGL10.EGL_NO_SURFACE;
        }
    }

    public void A06(Surface surface) {
        C85483vg c85483vg = (C85483vg) this;
        SurfaceHolder surfaceHolder = new SurfaceHolder(surface) { // from class: X.3es
            public final Surface A00;

            @Override // android.view.SurfaceHolder
            public void addCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public Rect getSurfaceFrame() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public boolean isCreating() {
                return false;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas() {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public Canvas lockCanvas(Rect rect) {
                return null;
            }

            @Override // android.view.SurfaceHolder
            public void removeCallback(SurfaceHolder.Callback callback) {
            }

            @Override // android.view.SurfaceHolder
            public void setFixedSize(int i, int i2) {
            }

            @Override // android.view.SurfaceHolder
            public void setFormat(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void setKeepScreenOn(boolean z) {
            }

            @Override // android.view.SurfaceHolder
            public void setSizeFromLayout() {
            }

            @Override // android.view.SurfaceHolder
            public void setType(int i) {
            }

            @Override // android.view.SurfaceHolder
            public void unlockCanvasAndPost(Canvas canvas) {
            }

            {
                this.A00 = surface;
            }

            @Override // android.view.SurfaceHolder
            public Surface getSurface() {
                return this.A00;
            }
        };
        c85483vg.A09();
        if (c85483vg.A03 == EGL10.EGL_NO_SURFACE) {
            EGLSurface eglCreateWindowSurface = c85483vg.A04.eglCreateWindowSurface(c85483vg.A02, c85483vg.A00, surfaceHolder, new int[]{12344});
            c85483vg.A03 = eglCreateWindowSurface;
            if (eglCreateWindowSurface != EGL10.EGL_NO_SURFACE) {
                return;
            }
            throw C000200d.A06("eglCreateWindowSurface", "Failed to create window surface");
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public boolean A07() {
        return ((C85483vg) this).A03 != EGL10.EGL_NO_SURFACE;
    }

    public boolean A08() {
        C85483vg c85483vg = (C85483vg) this;
        c85483vg.A09();
        EGLSurface eGLSurface = c85483vg.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            return c85483vg.A04.eglSwapBuffers(c85483vg.A02, eGLSurface);
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
