package X;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.44Y  reason: invalid class name */
/* loaded from: classes3.dex */
public class C44Y implements C44O {
    public static final boolean A0E;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaRecorder A06;
    public Surface A07;
    public RandomAccessFile A08;
    public CountDownLatch A09;
    public final Object A0A;
    public volatile SurfaceTexture A0B;
    public volatile SurfaceTexture A0C;
    public volatile C41z A0D;

    @Override // X.C44O
    public C44N AV5(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, C44B c44b, int i, boolean z, C44K c44k, boolean z2) {
        return null;
    }

    static {
        A0E = Build.VERSION.SDK_INT >= 21;
    }

    public C44Y() {
        Object obj = new Object();
        this.A0A = obj;
        synchronized (obj) {
            this.A09 = new CountDownLatch(1);
        }
    }

    public SurfaceTexture A00(int i, int i2, int i3, int i4) {
        SurfaceTexture surfaceTexture;
        this.A00 = i3;
        this.A04 = i4;
        this.A02 = i;
        this.A01 = i2;
        try {
            this.A09.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            StringBuilder A0P = C000200d.A0P("Timeout when creating SurfaceNode: ");
            A0P.append(e.getMessage());
            Log.e("GLSurfacePipeCoordinatorImpl", A0P.toString());
        }
        synchronized (this.A0A) {
            SurfaceTexture surfaceTexture2 = this.A0C;
            if (surfaceTexture2 != null) {
                if (A0E) {
                    C41z c41z = this.A0D;
                    if (c41z == null) {
                        c41z = new C41z();
                        this.A0D = c41z;
                    }
                    c41z.A03(surfaceTexture2, this.A04);
                    int i5 = this.A02;
                    int i6 = this.A01;
                    surfaceTexture2 = c41z.A09;
                    if (surfaceTexture2 == null || c41z.A01 != i5 || c41z.A00 != i6) {
                        c41z.A01 = i5;
                        c41z.A00 = i6;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            c41z.A09.release();
                            c41z.A09 = null;
                        }
                        int i7 = c41z.A03;
                        if (i7 != -1) {
                            GLES20.glDeleteTextures(1, new int[]{i7}, 0);
                            c41z.A03 = -1;
                        }
                        int[] iArr = new int[1];
                        GLES20.glGenTextures(1, iArr, 0);
                        C41z.A02("glGenTextures");
                        int i8 = iArr[0];
                        c41z.A03 = i8;
                        GLES20.glBindTexture(36197, i8);
                        StringBuilder sb = new StringBuilder("glBindTexture ");
                        sb.append(c41z.A03);
                        C41z.A02(sb.toString());
                        GLES20.glTexParameterf(36197, 10241, 9729.0f);
                        GLES20.glTexParameterf(36197, 10240, 9729.0f);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        C41z.A02("glTexParameter");
                        SurfaceTexture surfaceTexture3 = new SurfaceTexture(c41z.A03);
                        c41z.A09 = surfaceTexture3;
                        surfaceTexture3.setOnFrameAvailableListener(c41z);
                        surfaceTexture2 = c41z.A09;
                    }
                }
                this.A0B = surfaceTexture2;
                surfaceTexture = this.A0B;
            } else {
                throw new IllegalStateException("SurfaceNode was not created");
            }
        }
        return surfaceTexture;
    }

    public void A01() {
        if (A0E) {
            C41z c41z = this.A0D;
            this.A0D = null;
            if (c41z != null) {
                if (c41z.A0D != EGL14.EGL_NO_DISPLAY) {
                    synchronized (c41z.A0F) {
                        if (c41z.A0O != EGL14.EGL_NO_SURFACE) {
                            try {
                                EGL14.eglMakeCurrent(c41z.A0D, c41z.A0O, c41z.A0O, c41z.A0C);
                                EGLDisplay eGLDisplay = c41z.A0D;
                                EGLSurface eGLSurface = c41z.A0O;
                                int[] iArr = c41z.A0L;
                                EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                                EGL14.eglQuerySurface(c41z.A0D, c41z.A0O, 12374, iArr, 1);
                                GLES20.glViewport(0, 0, iArr[0], iArr[1]);
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                GLES20.glClear(16384);
                                EGL14.eglSwapBuffers(c41z.A0D, c41z.A0O);
                            } catch (RuntimeException unused) {
                            }
                            EGLDisplay eGLDisplay2 = c41z.A0D;
                            EGLSurface eGLSurface2 = c41z.A0E;
                            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, c41z.A0C);
                            EGL14.eglDestroySurface(c41z.A0D, c41z.A0O);
                            c41z.A0O = EGL14.EGL_NO_SURFACE;
                        }
                        c41z.A0A = null;
                    }
                    synchronized (c41z.A0G) {
                        if (c41z.A0P != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(c41z.A0D, c41z.A0P);
                            c41z.A0P = EGL14.EGL_NO_SURFACE;
                        }
                    }
                    EGLSurface eGLSurface3 = c41z.A0E;
                    if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(c41z.A0D, eGLSurface3);
                    }
                    int i = c41z.A03;
                    if (i != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    }
                    int i2 = c41z.A02;
                    if (i2 != 0) {
                        GLES20.glDeleteProgram(i2);
                    }
                    EGLDisplay eGLDisplay3 = c41z.A0D;
                    EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay3, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(c41z.A0D, c41z.A0C);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(c41z.A0D);
                }
                c41z.A0D = EGL14.EGL_NO_DISPLAY;
                c41z.A0C = EGL14.EGL_NO_CONTEXT;
                c41z.A0B = null;
                c41z.A0E = EGL14.EGL_NO_SURFACE;
                c41z.A02 = 0;
                c41z.A03 = -1;
                SurfaceTexture surfaceTexture = c41z.A09;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    c41z.A09 = null;
                }
            }
            this.A0B = null;
        }
    }

    public void A02(int i) {
        this.A04 = i;
        if (A0E) {
            synchronized (this.A0A) {
                SurfaceTexture surfaceTexture = this.A0C;
                C41z c41z = this.A0D;
                if (c41z != null && surfaceTexture != null) {
                    c41z.A03(surfaceTexture, this.A04);
                }
            }
        }
    }

    @Override // X.C44O
    public C44N AV6(CamcorderProfile camcorderProfile, String str, C44B c44b, int i, boolean z, C44K c44k, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3 = false;
        if (i != 90 && i != 270) {
            i2 = camcorderProfile.videoFrameWidth;
            i3 = camcorderProfile.videoFrameHeight;
            i4 = this.A02;
            i5 = this.A01;
        } else {
            i2 = camcorderProfile.videoFrameHeight;
            i3 = camcorderProfile.videoFrameWidth;
            i4 = this.A01;
            i5 = this.A02;
        }
        float f = i2;
        float f2 = i3;
        float f3 = i4 / i5;
        if (f / f2 > f3) {
            i2 = (int) (f2 * f3);
        } else {
            i3 = (int) (f / f3);
        }
        int i6 = i2 - (i2 % 16);
        int i7 = i3 - (i3 % 16);
        int i8 = (this.A00 + this.A04) % 360;
        int i9 = i6;
        if (i8 % 180 != 0) {
            z3 = true;
            i9 = i7;
        }
        camcorderProfile.videoFrameWidth = i9;
        if (!z3) {
            i6 = i7;
        }
        camcorderProfile.videoFrameHeight = i6;
        this.A08 = new RandomAccessFile(str, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A06 = mediaRecorder;
        mediaRecorder.setAudioSource(5);
        this.A06.setVideoSource(2);
        this.A06.setOrientationHint(i8);
        this.A06.setProfile(camcorderProfile);
        this.A06.setOutputFile(this.A08.getFD());
        this.A06.prepare();
        this.A07 = this.A06.getSurface();
        C41z c41z = this.A0D;
        if (c41z != null) {
            c41z.A05(this.A07, this.A04);
        }
        this.A06.start();
        C44N c44n = new C44N(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, str, i8, c44b, camcorderProfile.audioCodec, camcorderProfile.videoCodec);
        long A0O = C07K.A0O(c44k);
        long j = c44n.A01;
        if (j != -1) {
            A0O = j;
        }
        c44n.A01 = A0O;
        return c44n;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C44O
    public void AVE() {
        try {
            try {
                MediaRecorder mediaRecorder = this.A06;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = this.A06;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.reset();
                    this.A06.release();
                    this.A06 = null;
                }
                C41z c41z = this.A0D;
                if (c41z != null) {
                    c41z.A05(null, 0);
                }
                Surface surface = this.A07;
                if (surface != null) {
                    surface.release();
                    this.A07 = null;
                }
                RandomAccessFile randomAccessFile = this.A08;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                    this.A08 = null;
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A06;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A06.release();
                this.A06 = null;
            }
            C41z c41z2 = this.A0D;
            if (c41z2 != null) {
                c41z2.A05(null, 0);
            }
            Surface surface2 = this.A07;
            if (surface2 != null) {
                surface2.release();
                this.A07 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A08;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A08 = null;
            }
            throw th;
        }
    }
}
