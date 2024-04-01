package X;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.3wX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85943wX extends AbstractC79483lj implements C2YM {
    public int A00;
    public int A01;
    public Camera.Size A02;
    public Camera A03;
    public Handler A04;
    public Handler A05;
    public HandlerThread A06;
    public HandlerThread A07;
    public InterfaceC70853Tw A08;
    public List A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public final Camera.AutoFocusCallback A0D;
    public final Camera.PreviewCallback A0E;
    public final Handler A0F;
    public final SurfaceHolder.Callback A0G;
    public final SurfaceHolder A0H;
    public final C33191fV A0I;
    public final Runnable A0J;

    public C85943wX(Context context) {
        super(context);
        this.A0F = new Handler(Looper.getMainLooper());
        this.A0I = new C33191fV();
        this.A0G = new SurfaceHolder.Callback() { // from class: X.3Ty
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C85943wX c85943wX = C85943wX.this;
                if (c85943wX.A03 == null) {
                    if (c85943wX.A04 == null) {
                        Log.e("qrview/surfacechanged: no camera");
                        c85943wX.A00();
                        return;
                    }
                    return;
                }
                SurfaceHolder surfaceHolder2 = c85943wX.A0H;
                if (surfaceHolder2.getSurface() == null) {
                    Log.e("qrview/surfacechanged: no surface");
                    c85943wX.A00();
                    return;
                }
                c85943wX.A04.post(new RunnableEBaseShape6S0200000_I1(c85943wX, surfaceHolder2, 11));
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                Log.i("qrview/surfaceCreated");
                C85943wX c85943wX = C85943wX.this;
                c85943wX.A04.post(new RunnableEBaseShape9S0100000_I1_1(c85943wX, 5));
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Log.i("qrview/surfacedestroyed");
                C85943wX c85943wX = C85943wX.this;
                c85943wX.A04.post(new RunnableEBaseShape9S0100000_I1_1(c85943wX, 8));
            }
        };
        this.A0E = new Camera.PreviewCallback() { // from class: X.3Tq
            @Override // android.hardware.Camera.PreviewCallback
            public final void onPreviewFrame(byte[] bArr, Camera camera) {
                C85943wX c85943wX = C85943wX.this;
                c85943wX.A05.post(new RunnableEBaseShape6S0200000_I1(c85943wX, bArr, 10));
            }
        };
        this.A0D = new Camera.AutoFocusCallback() { // from class: X.3Tz
            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z, Camera camera) {
                C85943wX c85943wX = C85943wX.this;
                Handler handler = c85943wX.A04;
                if (handler != null) {
                    handler.postDelayed(c85943wX.A0J, 2000L);
                } else {
                    c85943wX.postDelayed(c85943wX.A0J, 2000L);
                }
            }
        };
        this.A0J = new RunnableEBaseShape9S0100000_I1_1(this, 3);
        SurfaceHolder holder = getHolder();
        this.A0H = holder;
        holder.addCallback(this.A0G);
    }

    public final void A00() {
        if (this.A08 != null) {
            this.A0F.post(new RunnableEBaseShape1S0101000_I1(this, 1, 7));
        }
    }

    @Override // X.C2YM
    public boolean AFr() {
        Camera camera = this.A03;
        if (camera == null || !this.A0B) {
            return false;
        }
        boolean equals = "torch".equals(camera.getParameters().getFlashMode());
        this.A0C = equals;
        return equals;
    }

    @Override // X.C2YM
    public void ARd() {
        Handler handler = this.A04;
        if (handler != null) {
            handler.post(new RunnableEBaseShape9S0100000_I1_1(this, 6));
        }
    }

    @Override // X.C2YM
    public void ARp() {
        Handler handler = this.A04;
        if (handler != null) {
            handler.post(new RunnableEBaseShape9S0100000_I1_1(this, 4));
        }
    }

    @Override // X.C2YM
    public boolean AVK() {
        return this.A0B;
    }

    @Override // X.C2YM
    public void AVf() {
        Camera camera = this.A03;
        if (camera == null || !this.A0B) {
            return;
        }
        this.A0C = !this.A0C;
        Camera.Parameters parameters = camera.getParameters();
        parameters.setFlashMode(this.A0C ? "torch" : "off");
        camera.setParameters(parameters);
    }

    public Camera.Size getPreviewSize() {
        return this.A02;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        Log.i("qrview/onAttachedToWindow");
        super.onAttachedToWindow();
        HandlerThread handlerThread = new HandlerThread("QrScannerCamera");
        this.A06 = handlerThread;
        handlerThread.start();
        this.A04 = new Handler(this.A06.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("QrScannerViewDecode");
        this.A07 = handlerThread2;
        handlerThread2.start();
        this.A05 = new Handler(this.A07.getLooper());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        Log.i("qrview/onDetachedFromWindow");
        super.onDetachedFromWindow();
        HandlerThread handlerThread = this.A06;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = this.A07;
        if (handlerThread2 != null) {
            handlerThread2.quit();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r1 == 2) goto L32;
     */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85943wX.onMeasure(int, int):void");
    }

    @Override // X.C2YM
    public void setQrDecodeHints(Map map) {
        this.A0A = map;
    }

    @Override // X.C2YM
    public void setQrScannerCallback(InterfaceC70853Tw interfaceC70853Tw) {
        this.A08 = interfaceC70853Tw;
    }
}
