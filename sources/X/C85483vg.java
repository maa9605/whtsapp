package X;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.3vg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85483vg extends AbstractC75433et {
    public EGLConfig A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03 = EGL10.EGL_NO_SURFACE;
    public final EGL10 A04;

    public C85483vg(int[] iArr) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.A04 = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.A04.eglInitialize(eglGetDisplay, new int[2])) {
                this.A02 = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.A04.eglChooseConfig(eglGetDisplay, iArr, eGLConfigArr, 1, new int[1])) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.A00 = eGLConfig;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = this.A04.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                        this.A01 = eglCreateContext;
                        return;
                    }
                    throw C000200d.A06("eglCreateContext", "Failed to create EGL context");
                }
                throw C000200d.A06("eglChooseConfig", "Unable to find any matching EGL config");
            }
            throw C000200d.A06("eglInitialize", "Unable to initialize EGL10");
        }
        throw new RuntimeException("Unable to get EGL10 display");
    }

    public final void A09() {
        if (this.A02 == EGL10.EGL_NO_DISPLAY || this.A01 == EGL10.EGL_NO_CONTEXT || this.A00 == null) {
            throw new RuntimeException("This object has been released");
        }
    }
}
