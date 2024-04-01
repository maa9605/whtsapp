package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.Locale;

/* renamed from: X.12x */
/* loaded from: classes.dex */
public class HandlerThreadC225612x extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public C12W A01;
    public C225712y A02;
    public Error A03;
    public RuntimeException A04;

    public HandlerThreadC225612x() {
        super("dummySurface");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        EGLConfig eGLConfig;
        int[] iArr;
        EGLSurface eglCreatePbufferSurface;
        C12W c12w;
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    c12w = this.A01;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (c12w != null) {
                    c12w.A04.removeCallbacks(c12w);
                    SurfaceTexture surfaceTexture = c12w.A00;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, c12w.A05, 0);
                    }
                    EGLDisplay eGLDisplay = c12w.A02;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = c12w.A02;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = c12w.A03;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(c12w.A02, c12w.A03);
                    }
                    EGLContext eGLContext = c12w.A01;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(c12w.A02, eGLContext);
                    }
                    if (C08M.A00 >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay3 = c12w.A02;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(c12w.A02);
                    }
                    c12w.A02 = null;
                    c12w.A01 = null;
                    c12w.A03 = null;
                    c12w.A00 = null;
                    return true;
                }
                throw null;
            }
            try {
                int i2 = message.arg1;
                C12W c12w2 = this.A01;
                if (c12w2 != null) {
                    if (c12w2 != null) {
                        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                        if (eglGetDisplay != null) {
                            int[] iArr2 = new int[2];
                            if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                                c12w2.A02 = eglGetDisplay;
                                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                                int[] iArr3 = new int[1];
                                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, C12W.A06, 0, eGLConfigArr, 0, 1, iArr3, 0);
                                if (eglChooseConfig && iArr3[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                                    EGLContext eglCreateContext = EGL14.eglCreateContext(c12w2.A02, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                                    if (eglCreateContext != null) {
                                        c12w2.A01 = eglCreateContext;
                                        EGLDisplay eGLDisplay4 = c12w2.A02;
                                        if (i2 == 1) {
                                            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                                        } else {
                                            if (i2 != 2) {
                                                iArr = new int[]{12375, 1, 12374, 1, 12344};
                                            } else {
                                                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                            }
                                            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay4, eGLConfig, iArr, 0);
                                            if (eglCreatePbufferSurface == null) {
                                                throw new RuntimeException("eglCreatePbufferSurface failed") { // from class: X.12U
                                                };
                                            }
                                        }
                                        if (EGL14.eglMakeCurrent(eGLDisplay4, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                            c12w2.A03 = eglCreatePbufferSurface;
                                            int[] iArr4 = c12w2.A05;
                                            GLES20.glGenTextures(1, iArr4, 0);
                                            int glGetError = GLES20.glGetError();
                                            if (glGetError == 0) {
                                                SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr4[0]);
                                                c12w2.A00 = surfaceTexture2;
                                                surfaceTexture2.setOnFrameAvailableListener(c12w2);
                                                SurfaceTexture surfaceTexture3 = this.A01.A00;
                                                if (surfaceTexture3 != null) {
                                                    this.A02 = new C225712y(this, surfaceTexture3);
                                                    synchronized (this) {
                                                        notify();
                                                    }
                                                    return true;
                                                }
                                                throw null;
                                            }
                                            StringBuilder A0P = C000200d.A0P("glGenTextures failed. Error: ");
                                            A0P.append(Integer.toHexString(glGetError));
                                            throw new RuntimeException(A0P.toString()) { // from class: X.12U
                                            };
                                        }
                                        throw new RuntimeException("eglMakeCurrent failed") { // from class: X.12U
                                        };
                                    }
                                    throw new RuntimeException("eglCreateContext failed") { // from class: X.12U
                                    };
                                }
                                throw new RuntimeException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0])) { // from class: X.12U
                                };
                            }
                            throw new RuntimeException("eglInitialize failed") { // from class: X.12U
                            };
                        }
                        throw new RuntimeException("eglGetDisplay failed") { // from class: X.12U
                        };
                    }
                    throw null;
                }
                throw null;
            } catch (Error e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.A03 = e;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (RuntimeException e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.A04 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            }
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
