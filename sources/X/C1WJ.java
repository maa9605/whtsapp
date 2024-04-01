package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.1WJ  reason: invalid class name */
/* loaded from: classes.dex */
public class C1WJ extends C17380s0 {
    public Surface A00;
    public boolean A01;

    public C1WJ(C17370rz c17370rz, Surface surface, boolean z) {
        super(c17370rz);
        if (this.A02 == EGL14.EGL_NO_SURFACE) {
            C17370rz c17370rz2 = this.A03;
            if (c17370rz2 != null) {
                if (surface == null) {
                    StringBuilder sb = new StringBuilder("invalid surface: ");
                    sb.append(surface);
                    throw new RuntimeException(sb.toString());
                }
                EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(c17370rz2.A02, c17370rz2.A00, surface, new int[]{12344}, 0);
                C17370rz.A00("eglCreateWindowSurface");
                if (eglCreateWindowSurface != null) {
                    this.A02 = eglCreateWindowSurface;
                    this.A00 = surface;
                    this.A01 = z;
                    return;
                }
                throw new RuntimeException("surface was null");
            }
            throw null;
        }
        throw new IllegalStateException("surface already created");
    }

    public void A02() {
        C17370rz c17370rz = this.A03;
        EGL14.eglDestroySurface(c17370rz.A02, this.A02);
        this.A02 = EGL14.EGL_NO_SURFACE;
        super.A00 = -1;
        super.A01 = -1;
        Surface surface = this.A00;
        if (surface != null) {
            if (this.A01) {
                surface.release();
            }
            this.A00 = null;
        }
    }
}
