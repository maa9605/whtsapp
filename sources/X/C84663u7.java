package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* renamed from: X.3u7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84663u7 implements VideoPort {
    public HandlerThread A00;
    public SurfaceHolder.Callback A01 = new SurfaceHolder.Callback() { // from class: X.3dF
        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, final int i2, final int i3) {
            StringBuilder A0P = C000200d.A0P("voip/VideoPort/surfaceChanged port = ");
            final C84663u7 c84663u7 = C84663u7.this;
            A0P.append(c84663u7.hashCode());
            A0P.append(", format: 0x");
            A0P.append(Integer.toHexString(i));
            A0P.append(", size: ");
            A0P.append(i2);
            A0P.append("x");
            A0P.append(i3);
            Log.i(A0P.toString());
            if (c84663u7 != null) {
                C000700j.A01();
                Log.i("voip/video/SurfaceViewVideoPort/setWindowSize enter");
                int intValue = ((Number) c84663u7.A02(new Callable() { // from class: X.3cB
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C84663u7 c84663u72 = C84663u7.this;
                        int i4 = i2;
                        int i5 = i3;
                        if (C84663u7.A00(c84663u72.A03)) {
                            return -6;
                        }
                        int i6 = 0;
                        while (true) {
                            if (c84663u72.A03.A01() == i4 && c84663u72.A03.A00() == i5) {
                                c84663u72.A07.setWindow(0, 0, i4, i5);
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                GLES20.glClear(16384);
                                c84663u72.A01();
                                return 0;
                            }
                            i6++;
                            if (i6 > 3) {
                                Log.i("failed to flush buffer to update window size, drop frame");
                                return -4;
                            }
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            GLES20.glClear(16384);
                            c84663u72.A01();
                        }
                    }
                }, -100)).intValue();
                InterfaceC74493dM interfaceC74493dM = c84663u7.A02;
                if (interfaceC74493dM != null) {
                    C84673u8 c84673u8 = (C84673u8) interfaceC74493dM;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c84673u8.A00.A07);
                    sb.append("onPortWindowSizeChanged ");
                    sb.append(c84663u7.hashCode());
                    sb.append(" for ");
                    AbstractC74483dL abstractC74483dL = c84673u8.A00;
                    C000200d.A1J(sb, abstractC74483dL.A03);
                    if (!(abstractC74483dL instanceof C84863uT)) {
                        C84853uS c84853uS = (C84853uS) abstractC74483dL;
                        if (!c84853uS.A09()) {
                            Voip.setVideoDisplayPort(c84853uS.A03.getRawString(), c84853uS.A01);
                        }
                    } else {
                        VideoPort videoPort = abstractC74483dL.A01;
                        Point point = new Point(0, 0);
                        if (videoPort != null) {
                            point = videoPort.getWindowSize();
                        }
                        Voip.setVideoPreviewSize(point.x, point.y);
                    }
                }
                C000200d.A0q("voip/video/SurfaceViewVideoPort/setWindowSize with result ", intValue);
                return;
            }
            throw null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            StringBuilder A0P = C000200d.A0P("voip/VideoPort/surfaceCreated port = ");
            C84663u7 c84663u7 = C84663u7.this;
            A0P.append(c84663u7.hashCode());
            Log.i(A0P.toString());
            c84663u7.A04();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            StringBuilder A0P = C000200d.A0P("voip/VideoPort/surfaceDestroyed port = ");
            C84663u7 c84663u7 = C84663u7.this;
            A0P.append(c84663u7.hashCode());
            Log.i(A0P.toString());
            c84663u7.A03();
        }
    };
    public InterfaceC74493dM A02;
    public AbstractC75433et A03;
    public boolean A04;
    public final Handler A05;
    public final SurfaceView A06;
    public final GlVideoRenderer A07;

    public C84663u7(SurfaceView surfaceView) {
        C000700j.A01();
        this.A06 = surfaceView;
        this.A07 = new GlVideoRenderer();
        StringBuilder A0P = C000200d.A0P("VideoPort_");
        A0P.append(surfaceView.hashCode());
        HandlerThread handlerThread = new HandlerThread(A0P.toString());
        this.A00 = handlerThread;
        handlerThread.start();
        this.A05 = new Handler(this.A00.getLooper());
        surfaceView.getHolder().addCallback(this.A01);
        A04();
    }

    public static boolean A00(AbstractC75433et abstractC75433et) {
        return abstractC75433et == null || !abstractC75433et.A07();
    }

    public final int A01() {
        AbstractC75433et abstractC75433et = this.A03;
        if (abstractC75433et != null) {
            return abstractC75433et.A08() ? 0 : -3;
        }
        throw null;
    }

    public final Object A02(Callable callable, Object obj) {
        if (Thread.currentThread() == this.A00) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Exchanger exchanger = new Exchanger();
        if (this.A05.post(new RunnableEBaseShape2S0300000_I1(callable, this, exchanger, 10))) {
            try {
                return exchanger.exchange(null);
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
        return obj;
    }

    public final void A03() {
        C000700j.A01();
        Log.i("voip/video/SurfaceViewVideoPort/closePort enter");
        if (!this.A04) {
            Log.i("voip/video/SurfaceViewVideoPort/closePort already closed");
            return;
        }
        InterfaceC74493dM interfaceC74493dM = this.A02;
        if (interfaceC74493dM != null) {
            ((C84673u8) interfaceC74493dM).A01(this);
        }
        int intValue = ((Number) A02(new Callable() { // from class: X.3cE
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C84663u7.this.A05();
                return 0;
            }
        }, -100)).intValue();
        this.A04 = false;
        C000200d.A0q("voip/video/SurfaceViewVideoPort/closePort with result ", intValue);
    }

    public final void A04() {
        C000700j.A01();
        Log.i("voip/video/SurfaceViewVideoPort/openPort enter");
        if (this.A04) {
            Log.i("voip/video/SurfaceViewVideoPort/openPort already opened");
            return;
        }
        final Surface surface = this.A06.getHolder().getSurface();
        if (surface != null && surface.isValid()) {
            this.A04 = true;
            int intValue = ((Number) A02(new Callable() { // from class: X.3c5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C84663u7 c84663u7 = C84663u7.this;
                    Surface surface2 = surface;
                    int i = 0;
                    if (c84663u7.A03 == null) {
                        try {
                            int[] iArr = AbstractC75433et.A00;
                            AbstractC75433et c85503vi = C85503vi.A04 >= 18 ? new C85503vi(null, iArr) : new C85483vg(iArr);
                            c84663u7.A03 = c85503vi;
                            c85503vi.A06(surface2);
                            c84663u7.A03.A03();
                            GlVideoRenderer glVideoRenderer = c84663u7.A07;
                            if (!glVideoRenderer.init(29, 0)) {
                                c84663u7.A05();
                                i = -2;
                            } else {
                                glVideoRenderer.setWindow(0, 0, c84663u7.A03.A01(), c84663u7.A03.A00());
                            }
                        } catch (Exception e) {
                            Log.e(e);
                            c84663u7.A05();
                            i = -5;
                        }
                    }
                    return Integer.valueOf(i);
                }
            }, -100)).intValue();
            InterfaceC74493dM interfaceC74493dM = this.A02;
            if (interfaceC74493dM != null) {
                ((C84673u8) interfaceC74493dM).A00(this);
            }
            C000200d.A0q("voip/video/SurfaceViewVideoPort/openPort exit with result ", intValue);
            return;
        }
        Log.i("voip/video/SurfaceViewVideoPort/openPort no surface");
    }

    public final void A05() {
        if (this.A03 != null) {
            this.A07.release();
            try {
                this.A03.A02();
                this.A03.A05();
                this.A03.A04();
            } catch (Exception e) {
                Log.e(e);
            }
            this.A03 = null;
        }
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public C74413dE createSurfaceTexture() {
        return (C74413dE) A02(new Callable() { // from class: X.3c7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return new C74413dE();
                } catch (RuntimeException e) {
                    Log.e(e);
                    return null;
                }
            }
        }, null);
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public Context getContext() {
        return this.A06.getContext();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public SurfaceHolder getSurfaceHolder() {
        return this.A06.getHolder();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public Point getWindowSize() {
        return (Point) A02(new Callable() { // from class: X.3c6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C84663u7 c84663u7 = C84663u7.this;
                AbstractC75433et abstractC75433et = c84663u7.A03;
                if (abstractC75433et != null && !C84663u7.A00(abstractC75433et)) {
                    return new Point(abstractC75433et.A01(), c84663u7.A03.A00());
                }
                return new Point(0, 0);
            }
        }, new Point(0, 0));
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public void release() {
        C000700j.A01();
        this.A06.getHolder().removeCallback(this.A01);
        A03();
        HandlerThread handlerThread = this.A00;
        if (handlerThread != null) {
            handlerThread.quit();
            this.A00 = null;
        }
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public void releaseSurfaceTexture(final C74413dE c74413dE) {
        A02(new Callable() { // from class: X.3cA
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C84663u7 c84663u7 = C84663u7.this;
                C74413dE c74413dE2 = c74413dE;
                if (C84663u7.A00(c84663u7.A03)) {
                    return -6;
                }
                SurfaceTexture surfaceTexture = c74413dE2.A01;
                if (surfaceTexture != null) {
                    StringBuilder A0P = C000200d.A0P("voip/video/SurfaceTextureHolder/deleteSurfaceTexture surfaceTexture = ");
                    A0P.append(surfaceTexture);
                    Log.i(A0P.toString());
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, new int[]{c74413dE2.A00}, 0);
                }
                c74413dE2.A00 = 0;
                return 0;
            }
        }, -100);
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int renderNativeFrame(final long j, final int i, final int i2, final int i3, final int i4, final int i5) {
        return ((Number) A02(new Callable() { // from class: X.3c8
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C84663u7 c84663u7 = C84663u7.this;
                long j2 = j;
                int i6 = i;
                int i7 = i2;
                int i8 = i3;
                int i9 = i4;
                int i10 = i5;
                if (C84663u7.A00(c84663u7.A03)) {
                    return -6;
                }
                c84663u7.A07.renderNativeFrame(j2, i6, i7, i8, i9, i10);
                return Integer.valueOf(c84663u7.A01());
            }
        }, -100)).intValue();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int renderTexture(final C74413dE c74413dE, final int i, final int i2) {
        return ((Number) A02(new Callable() { // from class: X.3cC
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int A01;
                C84663u7 c84663u7 = C84663u7.this;
                C74413dE c74413dE2 = c74413dE;
                int i3 = i;
                int i4 = i2;
                if (C84663u7.A00(c84663u7.A03)) {
                    return -6;
                }
                GlVideoRenderer glVideoRenderer = c84663u7.A07;
                if (c74413dE2.A00 == 0) {
                    Log.i("voip/SurfaceTextureHolder/render ignore rendering after texture is released");
                    A01 = -7;
                } else {
                    SurfaceTexture surfaceTexture = c74413dE2.A01;
                    surfaceTexture.updateTexImage();
                    float[] fArr = c74413dE2.A03;
                    surfaceTexture.getTransformMatrix(fArr);
                    FloatBuffer asFloatBuffer = c74413dE2.A02.asFloatBuffer();
                    asFloatBuffer.rewind();
                    asFloatBuffer.put(fArr);
                    glVideoRenderer.renderOesTexture(c74413dE2.A00, i3, i4, asFloatBuffer);
                    A01 = c84663u7.A01();
                }
                return Integer.valueOf(A01);
            }
        }, -100)).intValue();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int resetBlackScreen() {
        Log.i("voip/video/SurfaceViewVideoPort/resetBlackScreen enter");
        int intValue = ((Number) A02(new Callable() { // from class: X.3c9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C84663u7 c84663u7 = C84663u7.this;
                if (C84663u7.A00(c84663u7.A03)) {
                    return -6;
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                return Integer.valueOf(c84663u7.A01());
            }
        }, -100)).intValue();
        C000200d.A0q("voip/video/SurfaceViewVideoPort/resetBlackScreen with result ", intValue);
        return intValue;
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public void setListener(InterfaceC74493dM interfaceC74493dM) {
        C000700j.A01();
        Log.i("voip/video/SurfaceViewVideoPort/setListener enter");
        InterfaceC74493dM interfaceC74493dM2 = this.A02;
        if (interfaceC74493dM == interfaceC74493dM2) {
            Log.i("voip/video/SurfaceViewVideoPort/setListener not changed");
            return;
        }
        if (this.A04 && interfaceC74493dM2 != null) {
            ((C84673u8) interfaceC74493dM2).A01(this);
        }
        this.A02 = interfaceC74493dM;
        if (this.A04 && interfaceC74493dM != null) {
            ((C84673u8) interfaceC74493dM).A00(this);
        }
        Log.i("voip/video/SurfaceViewVideoPort/setListener exit");
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int setScaleType(final int i) {
        Log.i("voip/video/SurfaceViewVideoPort/setScaleType enter");
        int intValue = ((Number) A02(new Callable() { // from class: X.3cD
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C84663u7 c84663u7 = C84663u7.this;
                int i2 = i;
                if (C84663u7.A00(c84663u7.A03)) {
                    return -6;
                }
                c84663u7.A07.setScaleType(i2);
                return 0;
            }
        }, -100)).intValue();
        C000200d.A0q("voip/video/SurfaceViewVideoPort/setScaleType with result ", intValue);
        return intValue;
    }
}
