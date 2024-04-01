package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.YuvImage;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2L5 */
/* loaded from: classes2.dex */
public class C2L5 extends C2L6 implements InterfaceC471629w {
    public static Boolean A0n;
    public static final int[] A0o = {2, 3, 4, 6, 8};
    public float A00;
    public int A01;
    public int A02;
    public Rect A03;
    public SurfaceTexture A04;
    public CameraCaptureSession A05;
    public CameraCharacteristics A06;
    public CameraDevice A07;
    public CaptureRequest.Builder A08;
    public ImageReader A09;
    public ImageReader A0A;
    public MediaRecorder A0B;
    public Handler A0C;
    public HandlerThread A0D;
    public Size A0E;
    public Size A0F;
    public Size A0G;
    public Display A0H;
    public Surface A0I;
    public C17370rz A0J;
    public C17390s1 A0K;
    public C1WJ A0L;
    public InterfaceC49112In A0M;
    public C471729x A0N;
    public C02F A0O;
    public C2F8 A0P;
    public C02O A0Q;
    public Float A0R;
    public Float A0S;
    public Integer A0T;
    public String A0U;
    public String A0V;
    public AtomicInteger A0W;
    public AtomicInteger A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final CameraCaptureSession.CaptureCallback A0c;
    public final CameraDevice.StateCallback A0d;
    public final TextureView.SurfaceTextureListener A0e;
    public final C57142oi A0f;
    public final C57172ol A0g;
    public final AnonymousClass356 A0h;
    public final C57202or A0i;
    public final C0HC A0j;
    public final C0HC A0k;
    public final AtomicBoolean A0l;
    public final AtomicBoolean A0m;

    @Override // X.InterfaceC471629w
    public void ARs() {
    }

    @Override // X.InterfaceC471629w
    public int getCameraApi() {
        return 1;
    }

    @Override // X.InterfaceC471629w
    public int getCameraType() {
        return 0;
    }

    @Override // X.InterfaceC471629w
    public void pause() {
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.2oi] */
    public C2L5(Context context) {
        super(context);
        this.A0l = new AtomicBoolean();
        this.A0X = new AtomicInteger(2);
        this.A0W = new AtomicInteger(0);
        this.A0V = "off";
        this.A00 = 1.0f;
        this.A0g = new C57172ol();
        this.A0m = new AtomicBoolean();
        this.A0k = new C0HC(true);
        this.A0j = new C0HC(true);
        this.A0e = new TextureView.SurfaceTextureListener() { // from class: X.2ob
            public boolean A00 = true;

            {
                C2L5.this = this;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C000200d.A0t("cameraview/on-surface-texture-available texture:", i, "x", i2);
                C2L5.this.A0Q(i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                Log.i("cameraview/on-surface-texture-destroyed");
                C2L5.this.A0M();
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                StringBuilder A0R = C000200d.A0R("cameraview/on-surface-texture-size-changed texture:", i, "x", i2, " view:");
                C2L5 c2l5 = C2L5.this;
                A0R.append(c2l5.getWidth());
                A0R.append("x");
                A0R.append(c2l5.getHeight());
                Log.i(A0R.toString());
                c2l5.A0R(i, i2, c2l5.A0F);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (this.A00) {
                    this.A00 = false;
                    C2L5.this.A0P.A02("cameraView2");
                }
            }
        };
        this.A0d = new CameraDevice.StateCallback() { // from class: X.2oc
            {
                C2L5.this = this;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                C2L5.this.A0M();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i) {
                C2L5 c2l5 = C2L5.this;
                c2l5.A0M();
                c2l5.A0P(i);
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) {
                C2L5 c2l5 = C2L5.this;
                synchronized (c2l5) {
                    if (c2l5.A06 != null) {
                        Log.i("cameraview/camera-opened");
                        c2l5.A07 = cameraDevice;
                        c2l5.A0O();
                    } else {
                        Log.i("cameraview/camera-opened-but-no-longer-needed");
                        cameraDevice.close();
                    }
                }
            }
        };
        this.A0h = new AnonymousClass356(this);
        this.A0f = new ImageReader.OnImageAvailableListener() { // from class: X.2oi
            {
                C2L5.this = this;
            }

            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                C2L5 c2l5 = C2L5.this;
                synchronized (c2l5) {
                    Image acquireLatestImage = imageReader.acquireLatestImage();
                    if (acquireLatestImage == null) {
                        return;
                    }
                    if (C2L5.A0J(c2l5, c2l5.A0W.get(), false)) {
                        C2L5.A0E(c2l5, acquireLatestImage);
                    } else {
                        acquireLatestImage.close();
                    }
                }
            }
        };
        this.A0c = new CameraCaptureSession.CaptureCallback() { // from class: X.2od
            {
                C2L5.this = this;
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                C2L5 c2l5 = C2L5.this;
                C2L5.A0D(c2l5, totalCaptureResult);
                if (c2l5.A0a) {
                    C57172ol c57172ol = c2l5.A0g;
                    Object obj = totalCaptureResult.get(TotalCaptureResult.SENSOR_TIMESTAMP);
                    if (obj != null) {
                        long longValue = ((Number) obj).longValue();
                        synchronized (c57172ol) {
                            if (c57172ol.A00 && c57172ol.A01) {
                                c57172ol.A00(longValue).A00 = totalCaptureResult;
                                c57172ol.A02();
                                return;
                            }
                            return;
                        }
                    }
                    throw null;
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                C2L5.A0D(C2L5.this, captureResult);
            }
        };
        SharedPreferences sharedPreferences = getSharedPreferences();
        String string = sharedPreferences.getString("camera_id", "");
        if (string != null) {
            this.A0U = string;
            this.A0Y = sharedPreferences.getBoolean("camera_is_front", false);
            this.A0V = sharedPreferences.getString("flash_mode", "off");
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                this.A0H = windowManager.getDefaultDisplay();
                this.A0i = new C57202or(this.A0h, new InterfaceC57182op() { // from class: X.34w
                    {
                        C2L5.this = this;
                    }

                    @Override // X.InterfaceC57182op
                    public final void AMP(C1D9 c1d9) {
                        C2L5.this.A0S(c1d9);
                    }
                });
                return;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ int A00(long j, Size size, Size size2) {
        return (Math.abs((size.getWidth() * size.getHeight()) - j) > Math.abs((size2.getWidth() * size2.getHeight()) - j) ? 1 : (Math.abs((size.getWidth() * size.getHeight()) - j) == Math.abs((size2.getWidth() * size2.getHeight()) - j) ? 0 : -1));
    }

    public static /* synthetic */ int A01(long j, Size size, Size size2) {
        return (Math.abs((size.getWidth() * size.getHeight()) - j) > Math.abs((size2.getWidth() * size2.getHeight()) - j) ? 1 : (Math.abs((size.getWidth() * size.getHeight()) - j) == Math.abs((size2.getWidth() * size2.getHeight()) - j) ? 0 : -1));
    }

    public static /* synthetic */ int A02(Size size, Size size2) {
        int height = size.getHeight() * size.getWidth();
        int height2 = size2.getHeight() * size2.getWidth();
        if (height == height2) {
            return 0;
        }
        return height < height2 ? -1 : 1;
    }

    public static /* synthetic */ int A03(Size size, Size size2) {
        int abs = Math.abs(size.getWidth() - 640);
        int abs2 = Math.abs(size2.getWidth() - 640);
        if (abs == abs2) {
            return 0;
        }
        return abs < abs2 ? -1 : 1;
    }

    public static Rect A04(RectF rectF, Rect rect) {
        Rect rect2 = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        int width = rect2.width();
        int height = rect2.height();
        int i = rect2.left;
        int i2 = rect.left;
        if (i < i2) {
            rect2.left = i2;
            rect2.right = i2 + width;
        }
        int i3 = rect2.right;
        int i4 = rect.right;
        if (i3 > i4) {
            rect2.right = i4;
            rect2.left = Math.max(0, i4 - width);
        }
        int i5 = rect2.top;
        int i6 = rect.top;
        if (i5 < i6) {
            rect2.top = i6;
            rect2.bottom = i6 + height;
        }
        int i7 = rect2.bottom;
        int i8 = rect.bottom;
        if (i7 > i8) {
            rect2.bottom = i8;
            rect2.top = Math.max(0, i8 - height);
        }
        return rect2;
    }

    public static String A05(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Integer.toString(i) : "EDOF" : "CONTINUOUS_PICTURE" : "CONTINUOUS_VIDEO" : "MACRO" : "AUTO" : "OFF";
    }

    public static String A06(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? Integer.toString(intValue) : "ON_EXTERNAL_FLASH" : "ON_AUTO_FLASH_REDEYE" : "ON_ALWAYS_FLASH" : "ON_AUTO_FLASH" : "ON" : "OFF";
    }

    public static String A07(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        return intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? num.toString() : "STATE_PRECAPTURE" : "FLASH_REQUIRED" : "LOCKED" : "CONVERGED" : "SEARCHING" : "INACTIVE";
    }

    public static String A08(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                return "DISABLED";
            case 1:
                return "FACE_PRIORITY";
            case 2:
                return "ACTION";
            case 3:
                return "PORTRAIT";
            case 4:
                return "LANDSCAPE";
            case 5:
                return "NIGHT";
            case 6:
                return "NIGHT_PORTRAIT";
            case 7:
                return "THEATRE";
            case 8:
                return "BEACH";
            case 9:
                return "SNOW";
            case 10:
                return "SUNSET";
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return "STEADYPHOTO";
            case 12:
                return "FIREWORKS";
            case 13:
                return "SPORTS";
            case 14:
                return "PARTY";
            case 15:
                return "CANDLELIGHT";
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                return "BARCODE";
            case 17:
                return "HIGH_SPEED_VIDEO";
            case 18:
                return "HDR";
            default:
                return Integer.toString(intValue);
        }
    }

    public static String A09(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            sb.append(size.getWidth());
            sb.append('x');
            sb.append(size.getHeight());
            sb.append(", ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static String A0A(int[] iArr, InterfaceC57152oj interfaceC57152oj) {
        if (iArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(interfaceC57152oj.AVb(i));
            sb.append(", ");
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }
        return sb.toString();
    }

    public static /* synthetic */ void A0B(C2L5 c2l5, CameraCaptureSession cameraCaptureSession) {
        CaptureRequest.Builder builder;
        synchronized (c2l5) {
            Log.i("cameraview/on-configured-for-video");
            if (c2l5.A07 != null && c2l5.A0B != null && (builder = c2l5.A08) != null) {
                c2l5.A05 = cameraCaptureSession;
                try {
                    builder.set(CaptureRequest.CONTROL_MODE, 1);
                    int[] iArr = c2l5.A0b;
                    if (iArr != null && AnonymousClass029.A1a(iArr, 3)) {
                        c2l5.A08.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    } else {
                        c2l5.A08.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    }
                    c2l5.A08.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    c2l5.A08.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                    if (c2l5.A00 != 1.0f) {
                        c2l5.A08.set(CaptureRequest.SCALER_CROP_REGION, c2l5.getZoomRect());
                    }
                    c2l5.setStabilizationMode(c2l5.A08);
                    int i = 0;
                    if (c2l5.A0l.get()) {
                        String str = c2l5.A0V;
                        int hashCode = str.hashCode();
                        if (hashCode != 3551) {
                            if (hashCode != 109935) {
                                if (hashCode == 3005871 && str.equals("auto")) {
                                    CaptureRequest.Builder builder2 = c2l5.A08;
                                    CaptureRequest.Key key = CaptureRequest.FLASH_MODE;
                                    Integer num = c2l5.A0T;
                                    if (num != null && num.intValue() == 4) {
                                        i = 2;
                                    }
                                    builder2.set(key, Integer.valueOf(i));
                                }
                            } else if (str.equals("off")) {
                                c2l5.A08.set(CaptureRequest.FLASH_MODE, 0);
                            }
                        } else if (str.equals("on")) {
                            c2l5.A08.set(CaptureRequest.FLASH_MODE, 2);
                        }
                    } else {
                        c2l5.A08.set(CaptureRequest.FLASH_MODE, 0);
                    }
                    c2l5.A05.setRepeatingRequest(c2l5.A08.build(), c2l5.A0c, c2l5.A0C);
                    try {
                        c2l5.A0B.start();
                    } catch (RuntimeException e) {
                        Log.e("cameraview/start-video-capture failed", e);
                        c2l5.A0N();
                        c2l5.A0P(3);
                    }
                    return;
                } catch (CameraAccessException e2) {
                    Log.e("cameraview/on-configured-for-video/configure-failed", e2);
                    c2l5.A0N();
                    c2l5.A0P(e2.getReason());
                    return;
                }
            }
            Log.i("cameraview/on-configured-for-video/camera-closed");
            c2l5.A0N();
        }
    }

    public static /* synthetic */ void A0C(C2L5 c2l5, CameraCaptureSession cameraCaptureSession) {
        CaptureRequest.Builder builder;
        synchronized (c2l5) {
            Log.i("cameraview/on-configured-preview-session");
            if (c2l5.A07 != null && (builder = c2l5.A08) != null) {
                c2l5.A05 = cameraCaptureSession;
                try {
                    builder.set(CaptureRequest.CONTROL_MODE, 1);
                    int[] iArr = c2l5.A0b;
                    if (iArr != null && AnonymousClass029.A1a(iArr, 4)) {
                        c2l5.A08.set(CaptureRequest.CONTROL_AF_MODE, 4);
                    } else {
                        c2l5.A08.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    }
                    c2l5.setFlash(c2l5.A08);
                    c2l5.A0W.set(1);
                    c2l5.A05.setRepeatingRequest(c2l5.A08.build(), c2l5.A0c, c2l5.A0C);
                    InterfaceC49112In interfaceC49112In = c2l5.A0M;
                    if (interfaceC49112In != null) {
                        interfaceC49112In.ANK();
                    }
                } catch (CameraAccessException e) {
                    Log.e("cameraview/create-camera-preview-session/configure-failed", e);
                    c2l5.A0P(e.getReason());
                }
                return;
            }
            Log.i("cameraview/create-camera-preview-session/camera-closed");
        }
    }

    public static /* synthetic */ void A0D(C2L5 c2l5, CaptureResult captureResult) {
        int intValue;
        int intValue2;
        synchronized (c2l5) {
            if (c2l5.A05 != null && c2l5.A08 != null) {
                c2l5.A0T = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                int i = c2l5.A0W.get();
                if (i == 2) {
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num != null && (4 == (intValue = num.intValue()) || 5 == intValue || (intValue == 0 && !c2l5.A0W()))) {
                        c2l5.A0W.set(1);
                        InterfaceC49112In interfaceC49112In = c2l5.A0M;
                        if (interfaceC49112In != null) {
                            interfaceC49112In.AHe(intValue != 5);
                        }
                        try {
                            c2l5.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                            CameraCaptureSession cameraCaptureSession = c2l5.A05;
                            CaptureRequest build = c2l5.A08.build();
                            CameraCaptureSession.CaptureCallback captureCallback = c2l5.A0c;
                            cameraCaptureSession.capture(build, captureCallback, c2l5.A0C);
                            c2l5.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            c2l5.A05.setRepeatingRequest(c2l5.A08.build(), captureCallback, c2l5.A0C);
                        } catch (CameraAccessException e) {
                            c2l5.A0P(e.getReason());
                        }
                    }
                } else if (i == 3) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    captureResult.get(CaptureResult.CONTROL_AF_TRIGGER);
                    A0F(num2);
                    A07(num3);
                    if (c2l5.A0k.A00() > 3000) {
                        Log.i("cameraview/waiting-lock-timeout");
                        c2l5.A0U(num3);
                    } else if (num2 != null && ((intValue2 = num2.intValue()) == 4 || intValue2 == 5 || (intValue2 == 0 && !c2l5.A0W()))) {
                        c2l5.A0U(num3);
                    }
                } else if (i == 4) {
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    A0F((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE));
                    A07(num4);
                    A0G((Integer) captureResult.get(CaptureResult.FLASH_STATE));
                    captureResult.get(CaptureResult.CONTROL_AE_LOCK);
                    if (num4 != null && num4.intValue() != 5) {
                        if (c2l5.A0j.A00() > 3000) {
                            Log.i("cameraview/waiting-precapture-timeout");
                            c2l5.A0L();
                        }
                    } else {
                        c2l5.A0W.set(5);
                    }
                } else if (i == 5) {
                    Integer num5 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    A0F((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE));
                    A07(num5);
                    A0G((Integer) captureResult.get(CaptureResult.FLASH_STATE));
                    captureResult.get(CaptureResult.CONTROL_AE_LOCK);
                    if (num5 == null || num5.intValue() != 5 || c2l5.A0j.A00() > 3000) {
                        if (c2l5.A0j.A00() > 3000) {
                            Log.i("cameraview/waiting-non-precapture-timeout");
                        }
                        c2l5.A0L();
                    }
                } else if (i == 6) {
                    A0F((Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE));
                    A07((Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE));
                    A0G((Integer) captureResult.get(CaptureResult.FLASH_STATE));
                    captureResult.get(CaptureResult.CONTROL_AE_LOCK);
                }
            }
        }
    }

    public static void A0E(C2L5 c2l5, Image image) {
        synchronized (c2l5) {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/image-available ");
            sb.append(image.getWidth());
            sb.append("x");
            sb.append(image.getHeight());
            Log.i(sb.toString());
            byte[] A0X = c2l5.A0X(image);
            image.close();
            C471729x c471729x = c2l5.A0N;
            if (c471729x != null) {
                c471729x.A00(A0X, c2l5.A0Y);
                c2l5.A0N = null;
            } else {
                throw null;
            }
        }
    }

    public static void A0F(Integer num) {
        if (num == null) {
            return;
        }
        switch (num.intValue()) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            default:
                num.toString();
                return;
        }
    }

    public static void A0G(Integer num) {
        int intValue;
        if (num == null || (intValue = num.intValue()) == 0 || intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4) {
            return;
        }
        num.toString();
    }

    public static boolean A0H(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            try {
                for (String str : cameraManager.getCameraIdList()) {
                    try {
                        if (A0I(cameraManager.getCameraCharacteristics(str))) {
                            return true;
                        }
                    } catch (AssertionError e) {
                        if ("Supported FPS ranges cannot be null.".equals(e.getMessage())) {
                            return false;
                        }
                        throw e;
                    } catch (RuntimeException unused) {
                        return false;
                    }
                }
            } catch (CameraAccessException e2) {
                Log.e("cameraview/camera2-supported", e2);
            }
            return false;
        }
        throw null;
    }

    public static boolean A0I(CameraCharacteristics cameraCharacteristics) {
        Number number;
        int intValue;
        Number number2;
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 23 && (number = (Number) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)) != null && (((intValue = number.intValue()) == 1 || intValue == 3) && (number2 = (Number) cameraCharacteristics.get(CameraCharacteristics.REQUEST_MAX_NUM_INPUT_STREAMS)) != null && number2.intValue() > 0 && (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) != null)) {
            for (int i : iArr) {
                if ((!"samsung".equals(Build.MANUFACTURER) && i == 4) || i == 7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0J(C2L5 c2l5, int i, boolean z) {
        boolean z2;
        synchronized (c2l5) {
            z2 = true;
            if (c2l5.A0N != null && (i == 1 || i == 6)) {
                if (z) {
                    if (c2l5.A0a) {
                    }
                }
            }
            z2 = false;
        }
        return z2;
    }

    public void A0K() {
        if (this.A04 == null || this.A0L == null || this.A0K == null || !this.A0m.get() || this.A0G == null) {
            return;
        }
        this.A04.updateTexImage();
        this.A0L.A00();
        GLES20.glViewport(0, 0, this.A0G.getWidth(), this.A0G.getHeight());
        this.A0K.A01(this.A02, C17400s2.A00);
        this.A0L.A01();
    }

    public final synchronized void A0L() {
        Log.i("cameraview/start-capture");
        if (this.A07 == null) {
            Log.e("cameraview/start-capture camera is null");
            return;
        }
        this.A0W.set(6);
        ImageReader pictureTakingImageReader = getPictureTakingImageReader();
        C000700j.A07(pictureTakingImageReader != null);
        C000700j.A07(this.A05 != null);
        C000700j.A07(this.A08 != null);
        try {
            CaptureRequest.Builder createCaptureRequest = this.A07.createCaptureRequest(2);
            createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
            createCaptureRequest.addTarget(pictureTakingImageReader.getSurface());
            CaptureRequest build = this.A08.build();
            createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
            createCaptureRequest.set(key, build.get(key));
            CaptureRequest.Key key2 = CaptureRequest.SCALER_CROP_REGION;
            createCaptureRequest.set(key2, build.get(key2));
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AF_REGIONS;
            createCaptureRequest.set(key3, build.get(key3));
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_AE_REGIONS;
            createCaptureRequest.set(key4, build.get(key4));
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_MODE;
            createCaptureRequest.set(key5, build.get(key5));
            createCaptureRequest.setTag("capture");
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(getRequiredCameraRotation()));
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, (byte) 90);
            CameraCaptureSession.CaptureCallback captureCallback = new CameraCaptureSession.CaptureCallback() { // from class: X.2og
                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                    totalCaptureResult.get(CaptureResult.FLASH_STATE);
                }
            };
            this.A05.stopRepeating();
            this.A05.capture(createCaptureRequest.build(), captureCallback, null);
        } catch (CameraAccessException e) {
            Log.e("cameraview/capture", e);
            A0P(e.getReason());
        }
    }

    public final synchronized void A0M() {
        Log.i("cameraview/close-camera");
        this.A0i.A01();
        C57172ol c57172ol = this.A0g;
        synchronized (c57172ol) {
            c57172ol.A00 = false;
            c57172ol.A01();
            c57172ol.A03(null);
        }
        CameraCaptureSession cameraCaptureSession = this.A05;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A05 = null;
        }
        CameraDevice cameraDevice = this.A07;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.A07 = null;
        }
        Surface surface = this.A0I;
        if (surface != null) {
            surface.release();
            this.A0I = null;
        }
        ImageReader imageReader = this.A0A;
        if (imageReader != null) {
            imageReader.close();
            this.A0A = null;
        }
        ImageReader imageReader2 = this.A09;
        if (imageReader2 != null) {
            imageReader2.close();
            this.A09 = null;
        }
        A0N();
        this.A06 = null;
        this.A0l.set(false);
        this.A0b = null;
        this.A0R = null;
        this.A01 = 0;
        this.A03 = null;
        this.A0S = null;
        this.A0F = null;
        this.A0T = null;
        this.A08 = null;
        this.A00 = 1.0f;
        this.A0G = null;
        this.A0W.set(0);
    }

    public final synchronized void A0N() {
        MediaRecorder mediaRecorder = this.A0B;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.A0B.release();
            this.A0B = null;
            this.A0m.set(false);
        }
        Surface surface = this.A0I;
        if (surface != null) {
            surface.release();
            this.A0I = null;
        }
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A04 = null;
        }
        C17390s1 c17390s1 = this.A0K;
        if (c17390s1 != null) {
            if (c17390s1.A00 != null) {
                c17390s1.A00 = null;
            }
            this.A0K = null;
        }
        C1WJ c1wj = this.A0L;
        if (c1wj != null) {
            c1wj.A02();
            this.A0L = null;
        }
        C17370rz c17370rz = this.A0J;
        if (c17370rz != null) {
            c17370rz.A01();
            this.A0J = null;
        }
    }

    public final synchronized void A0O() {
        ArrayList arrayList;
        CaptureRequest.Builder createCaptureRequest;
        if (this.A07 == null) {
            Log.i("cameraview/create-preview camera already closed");
            return;
        }
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture == null) {
            Log.i("cameraview/create-preview no texture");
            A0P(3);
            return;
        }
        Size size = this.A0F;
        if (size == null) {
            Log.i("cameraview/create-preview preview size is null");
            A0P(3);
        } else if (A0V() && this.A0A == null) {
            Log.i("cameraview/create-preview yuv image reader is null");
            A0P(3);
        } else if ((!this.A0a) && this.A09 == null) {
            Log.i("cameraview/create-preview jpeg image reader is null");
            A0P(3);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/create-camera-preview-session preview:");
            sb.append(size.getWidth());
            sb.append("x");
            sb.append(this.A0F.getHeight());
            Log.i(sb.toString());
            surfaceTexture.setDefaultBufferSize(this.A0F.getWidth(), this.A0F.getHeight());
            Surface surface = this.A0I;
            if (surface != null) {
                surface.release();
            }
            this.A0I = new Surface(surfaceTexture);
            try {
                arrayList = new ArrayList();
                createCaptureRequest = this.A07.createCaptureRequest(this.A0a ? 5 : 1);
            } catch (CameraAccessException e) {
                Log.e("cameraview/create-camera-preview-session", e);
                A0P(e.getReason());
            }
            if (createCaptureRequest != null) {
                this.A08 = createCaptureRequest;
                createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
                this.A08.addTarget(this.A0I);
                arrayList.add(this.A0I);
                if (A0V()) {
                    ImageReader imageReader = this.A0A;
                    if (imageReader != null) {
                        Surface surface2 = imageReader.getSurface();
                        this.A08.addTarget(surface2);
                        arrayList.add(surface2);
                    } else {
                        throw null;
                    }
                }
                if (!this.A0a) {
                    ImageReader imageReader2 = this.A09;
                    if (imageReader2 != null) {
                        arrayList.add(imageReader2.getSurface());
                    } else {
                        throw null;
                    }
                }
                this.A07.createCaptureSession(arrayList, new CameraCaptureSession.StateCallback() { // from class: X.2of
                    {
                        C2L5.this = this;
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        Log.e("cameraview/create-camera-preview-session/configure-failed");
                        C2L5.this.A0P(3);
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        C2L5.A0C(C2L5.this, cameraCaptureSession);
                    }
                }, this.A0C);
                Log.i("cameraview/create-camera-preview-session/done");
                return;
            }
            throw null;
        }
    }

    public final void A0P(int i) {
        C000200d.A0q("cameraview/on-error ", i);
        InterfaceC49112In interfaceC49112In = this.A0M;
        if (interfaceC49112In != null) {
            interfaceC49112In.AI9(i != 2 ? 1 : 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:326:0x0199, code lost:
        if (r1 != 180) goto L47;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0627: INVOKE  (r14v0 ?? I:X.2L5), (r11 I:int) type: VIRTUAL call: X.2L5.A0P(int):void, block:B:467:0x0622 */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01f1 A[Catch: all -> 0x05e5, TryCatch #5 {, blocks: (B:279:0x0040, B:281:0x0072, B:284:0x007b, B:287:0x0086, B:289:0x0098, B:292:0x00a2, B:450:0x05c5, B:453:0x05e7, B:463:0x061e, B:407:0x03e1, B:293:0x00c1, B:295:0x00cf, B:296:0x00d6, B:300:0x00e9, B:313:0x0119, B:318:0x0177, B:329:0x01a2, B:331:0x01f1, B:333:0x01f7, B:334:0x0204, B:336:0x020a, B:338:0x021e, B:340:0x022a, B:346:0x024e, B:348:0x0252, B:361:0x02da, B:368:0x0305, B:370:0x030b, B:372:0x0311, B:373:0x031d, B:374:0x032e, B:412:0x03ed, B:376:0x0331, B:379:0x0367, B:389:0x0381, B:390:0x0385, B:392:0x038b, B:403:0x03b7, B:401:0x03a9, B:413:0x03ee, B:415:0x03f3, B:416:0x040e, B:418:0x0412, B:420:0x0416, B:421:0x041b, B:423:0x041f, B:424:0x0427, B:444:0x04ba, B:446:0x050a, B:447:0x050e, B:449:0x05c1, B:430:0x046e, B:431:0x0476, B:433:0x047c, B:435:0x048a, B:437:0x0492, B:439:0x049a, B:441:0x04a7, B:427:0x045d, B:428:0x0466, B:404:0x03d6, B:351:0x029a, B:352:0x02a8, B:354:0x02ae, B:358:0x02c6, B:362:0x02dd, B:364:0x02f1, B:360:0x02d5, B:303:0x00fd, B:308:0x0109, B:299:0x00e5, B:406:0x03dc, B:408:0x03e5), top: B:484:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0252 A[Catch: all -> 0x05e5, TryCatch #5 {, blocks: (B:279:0x0040, B:281:0x0072, B:284:0x007b, B:287:0x0086, B:289:0x0098, B:292:0x00a2, B:450:0x05c5, B:453:0x05e7, B:463:0x061e, B:407:0x03e1, B:293:0x00c1, B:295:0x00cf, B:296:0x00d6, B:300:0x00e9, B:313:0x0119, B:318:0x0177, B:329:0x01a2, B:331:0x01f1, B:333:0x01f7, B:334:0x0204, B:336:0x020a, B:338:0x021e, B:340:0x022a, B:346:0x024e, B:348:0x0252, B:361:0x02da, B:368:0x0305, B:370:0x030b, B:372:0x0311, B:373:0x031d, B:374:0x032e, B:412:0x03ed, B:376:0x0331, B:379:0x0367, B:389:0x0381, B:390:0x0385, B:392:0x038b, B:403:0x03b7, B:401:0x03a9, B:413:0x03ee, B:415:0x03f3, B:416:0x040e, B:418:0x0412, B:420:0x0416, B:421:0x041b, B:423:0x041f, B:424:0x0427, B:444:0x04ba, B:446:0x050a, B:447:0x050e, B:449:0x05c1, B:430:0x046e, B:431:0x0476, B:433:0x047c, B:435:0x048a, B:437:0x0492, B:439:0x049a, B:441:0x04a7, B:427:0x045d, B:428:0x0466, B:404:0x03d6, B:351:0x029a, B:352:0x02a8, B:354:0x02ae, B:358:0x02c6, B:362:0x02dd, B:364:0x02f1, B:360:0x02d5, B:303:0x00fd, B:308:0x0109, B:299:0x00e5, B:406:0x03dc, B:408:0x03e5), top: B:484:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x05fa A[Catch: NullPointerException -> 0x0621, CameraAccessException -> 0x062b, all -> 0x0645, TryCatch #8 {CameraAccessException -> 0x062b, NullPointerException -> 0x0621, blocks: (B:454:0x05ef, B:456:0x05fa, B:458:0x0608, B:460:0x0613, B:461:0x0614, B:465:0x0620), top: B:482:0x003c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0614 A[Catch: NullPointerException -> 0x0621, CameraAccessException -> 0x062b, all -> 0x0645, TRY_LEAVE, TryCatch #8 {CameraAccessException -> 0x062b, NullPointerException -> 0x0621, blocks: (B:454:0x05ef, B:456:0x05fa, B:458:0x0608, B:460:0x0613, B:461:0x0614, B:465:0x0620), top: B:482:0x003c, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x03e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void A0Q(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2L5.A0Q(int, int):void");
    }

    public final synchronized void A0R(int i, int i2, Size size) {
        float f;
        if (size == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/configure-transform view:");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append(" preview:");
        sb.append(size.getHeight());
        sb.append("x");
        sb.append(size.getWidth());
        Log.i(sb.toString());
        int rotation = this.A0H.getRotation();
        Matrix matrix = new Matrix();
        float f2 = i;
        float f3 = i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        if (1 != rotation && 3 != rotation) {
            if (2 == rotation) {
                matrix.postRotate(180.0f, centerX, centerY);
            }
            float width = f3 / size.getWidth();
            float height = f2 / size.getHeight();
            float f4 = 1.0f;
            if (width > height) {
                f = height / width;
            } else {
                f4 = width / height;
                f = 1.0f;
            }
            matrix.postScale(f4, f, centerX, centerY);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cameraview/configure-transform scaleX:");
            sb2.append(f4);
            sb2.append(" scaleY:");
            sb2.append(f);
            Log.i(sb2.toString());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getHeight(), size.getWidth());
            rectF2.offset(centerX - rectF2.centerX(), centerY - rectF2.centerY());
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            float min = Math.min(f3 / size.getHeight(), f2 / size.getWidth());
            matrix.postScale(min, min, centerX, centerY);
            matrix.postRotate((rotation - 2) * 90, centerX, centerY);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("cameraview/configure-transform scale:");
            sb3.append(min);
            Log.i(sb3.toString());
        }
        setTransform(matrix);
    }

    public /* synthetic */ void A0S(C1D9 c1d9) {
        InterfaceC49112In interfaceC49112In = this.A0M;
        if (interfaceC49112In != null) {
            interfaceC49112In.ANU(c1d9);
        }
    }

    public /* synthetic */ void A0T(C471729x c471729x) {
        synchronized (this) {
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.A0g.A03(new C648434x(this, atomicBoolean, c471729x));
            if (!atomicBoolean.get()) {
                Log.i("cameraview/didnt-find-zsl-capture");
                this.A0N = c471729x;
            }
        }
    }

    public final synchronized void A0U(Integer num) {
        if (num != null) {
            if (num.intValue() != 2 && this.A0X.get() != 2 && this.A0X.get() != 0) {
                Log.i("cameraview/start-precapture");
                C000700j.A07(this.A05 != null);
                CaptureRequest.Builder builder = this.A08;
                C000700j.A07(builder != null);
                try {
                    builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
                    CameraCaptureSession cameraCaptureSession = this.A05;
                    CaptureRequest build = this.A08.build();
                    CameraCaptureSession.CaptureCallback captureCallback = this.A0c;
                    cameraCaptureSession.capture(build, captureCallback, this.A0C);
                    CaptureRequest.Builder builder2 = this.A08;
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
                    builder2.set(key, 1);
                    this.A0W.set(4);
                    C0HC c0hc = this.A0j;
                    c0hc.A01 = 0L;
                    c0hc.A00 = 0L;
                    c0hc.A03();
                    this.A05.capture(this.A08.build(), captureCallback, this.A0C);
                    this.A08.set(key, 0);
                } catch (CameraAccessException e) {
                    Log.e("cameraview/precapture", e);
                    A0P(e.getReason());
                }
            }
        }
        A0L();
    }

    public final boolean A0V() {
        return this.A0a || (!this.A0Y && this.A0Z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x000d, code lost:
        if (r1 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean A0W() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Float r0 = r2.A0S     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto Lf
            float r1 = r0.floatValue()     // Catch: java.lang.Throwable -> L12
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L10
        Lf:
            r0 = 0
        L10:
            monitor-exit(r2)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2L5.A0W():boolean");
    }

    public final byte[] A0X(Image image) {
        int height;
        int width;
        if (image.getFormat() == 256) {
            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.remaining()];
            buffer.get(bArr);
            return bArr;
        } else if (image.getFormat() == 35) {
            int requiredCameraRotation = getRequiredCameraRotation();
            Image.Plane plane = image.getPlanes()[0];
            Image.Plane plane2 = image.getPlanes()[1];
            Image.Plane plane3 = image.getPlanes()[2];
            int height2 = (image.getHeight() * (image.getWidth() * 3)) >> 1;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(height2);
            VideoFrameConverter.convertAndroid420toNV21(plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride(), image.getWidth(), image.getHeight(), requiredCameraRotation, allocateDirect);
            if (requiredCameraRotation % 180 == 0) {
                height = image.getWidth();
                width = image.getHeight();
            } else {
                height = image.getHeight();
                width = image.getWidth();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[height2];
            allocateDirect.get(bArr2);
            new YuvImage(bArr2, 17, height, width, null).compressToJpeg(new Rect(0, 0, height, width), 90, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } else {
            return null;
        }
    }

    @Override // X.InterfaceC471629w
    public void A6C() {
        this.A0i.A00();
    }

    @Override // X.InterfaceC471629w
    public synchronized void A7u(float f, float f2) {
        CameraCharacteristics cameraCharacteristics;
        if (this.A05 == null || this.A08 == null || (cameraCharacteristics = this.A06) == null || this.A03 == null) {
            return;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Integer num2 = (Integer) this.A06.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/focus max-regions-af:");
        sb.append(num);
        sb.append(" max-regions-ae:");
        sb.append(num2);
        sb.append(" sensor-rect:");
        sb.append(this.A03);
        Log.i(sb.toString());
        if (this.A03 == null) {
            return;
        }
        if ((num != null && num.intValue() != 0) || (num2 != null && num2.intValue() != 0)) {
            float dimension = getContext().getResources().getDimension(R.dimen.autofocus_box_size) / 2.0f;
            RectF rectF = new RectF(f - dimension, f2 - dimension, f + dimension, f2 + dimension);
            int requiredCameraRotation = getRequiredCameraRotation();
            Rect zoomRect = getZoomRect();
            Rect rect = this.A03;
            zoomRect.offset(rect.left, rect.top);
            Matrix matrix = new Matrix();
            float width = getWidth();
            float height = getHeight();
            matrix.postTranslate(-zoomRect.centerX(), -zoomRect.centerY());
            matrix.postRotate(requiredCameraRotation);
            if (requiredCameraRotation % 180 == 0) {
                matrix.postScale(width / zoomRect.width(), height / zoomRect.height());
            } else {
                matrix.postScale(width / zoomRect.height(), height / zoomRect.width());
            }
            matrix.postScale(this.A0Y ? -1.0f : 1.0f, 1.0f);
            matrix.postTranslate(width / 2.0f, height / 2.0f);
            matrix.invert(matrix);
            if (num != null && num.intValue() > 0) {
                RectF rectF2 = new RectF();
                matrix.mapRect(rectF2, rectF);
                Rect A04 = A04(rectF2, zoomRect);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cameraview/focus af-area:");
                sb2.append(A04);
                Log.i(sb2.toString());
                this.A08.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(A04, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)});
                this.A08.set(CaptureRequest.CONTROL_AF_MODE, 1);
                this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            }
            if (num2 != null && num2.intValue() > 0) {
                rectF.left -= dimension;
                rectF.top -= dimension;
                rectF.right += dimension;
                rectF.bottom += dimension;
                RectF rectF3 = new RectF();
                matrix.mapRect(rectF3, rectF);
                Rect A042 = A04(rectF3, zoomRect);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("cameraview/focus ae-area:");
                sb3.append(A042);
                Log.i(sb3.toString());
                this.A08.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(A042, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)});
            }
            InterfaceC49112In interfaceC49112In = this.A0M;
            if (interfaceC49112In != null) {
                interfaceC49112In.AHd(f, f2);
            }
            this.A0W.set(2);
            try {
                this.A05.setRepeatingRequest(this.A08.build(), this.A0c, this.A0C);
            } catch (CameraAccessException e) {
                Log.e("cameraview/focus", e);
                A0P(e.getReason());
            }
        }
    }

    @Override // X.InterfaceC471629w
    public boolean AFI() {
        return this.A0Y;
    }

    @Override // X.InterfaceC471629w
    public boolean AFK() {
        int i = this.A0W.get();
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        C000200d.A1C("cameraview/is-in-peview ", z);
        return z;
    }

    @Override // X.InterfaceC471629w
    public boolean AFg() {
        return this.A0m.get();
    }

    @Override // X.InterfaceC471629w
    public boolean AFr() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0015, code lost:
        if ("on".equals(r2.A0V) == false) goto L10;
     */
    @Override // X.InterfaceC471629w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AGa() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0l
            boolean r0 = r0.get()
            if (r0 != 0) goto L17
            boolean r0 = r2.A0Y
            if (r0 == 0) goto L17
            java.lang.String r1 = r2.A0V
            java.lang.String r0 = "on"
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L18
        L17:
            r1 = 0
        L18:
            java.lang.String r0 = "cameraview/need-fake-flash "
            X.C000200d.A1C(r0, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2L5.AGa():boolean");
    }

    @Override // X.InterfaceC471629w
    public synchronized void AGk() {
        Log.i("cameraview/next-camera");
        this.A0Y = this.A0Y ? false : true;
        A0M();
        A0Q(getWidth(), getHeight());
    }

    @Override // X.InterfaceC471629w
    public synchronized String AGl() {
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/next-flash-mode current:");
        sb.append(this.A0V);
        Log.i(sb.toString());
        if (this.A08 != null && this.A05 != null) {
            List flashModes = getFlashModes();
            int indexOf = flashModes.indexOf(this.A0V);
            if (indexOf < 0) {
                indexOf = flashModes.indexOf("off");
            }
            this.A0V = (String) flashModes.get((indexOf + 1) % flashModes.size());
            setFlash(this.A08);
            try {
                this.A05.setRepeatingRequest(this.A08.build(), this.A0c, this.A0C);
            } catch (CameraAccessException e) {
                Log.e("cameraview/next-flash", e);
                A0P(e.getReason());
            }
            getSharedPreferences().edit().putString("flash_mode", this.A0V).apply();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("cameraview/next-flash-mode new:");
            sb2.append(this.A0V);
            Log.i(sb2.toString());
            return this.A0V;
        }
        Log.i("cameraview/next-flash-mode/not-changing");
        return this.A0V;
    }

    @Override // X.InterfaceC471629w
    public synchronized void ARq() {
        boolean z;
        Log.i("cameraview/restart-preview");
        int i = this.A0W.get();
        if (i != 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("cameraview/restart-preview state:");
            sb.append(i);
            Log.i(sb.toString());
            InterfaceC49112In interfaceC49112In = this.A0M;
            if (interfaceC49112In != null) {
                interfaceC49112In.ANK();
            }
            return;
        }
        CaptureRequest.Builder builder = this.A08;
        if (builder != null && this.A05 != null && ((!(z = this.A0a) || this.A0Y || this.A0A != null) && (z || this.A09 != null))) {
            try {
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                setFlash(this.A08);
                CameraCaptureSession cameraCaptureSession = this.A05;
                CaptureRequest build = this.A08.build();
                CameraCaptureSession.CaptureCallback captureCallback = this.A0c;
                cameraCaptureSession.capture(build, captureCallback, this.A0C);
                this.A0W.set(1);
                this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                if (A0V()) {
                    this.A08.addTarget(this.A0A.getSurface());
                }
                this.A05.setRepeatingRequest(this.A08.build(), captureCallback, this.A0C);
                InterfaceC49112In interfaceC49112In2 = this.A0M;
                if (interfaceC49112In2 != null) {
                    interfaceC49112In2.ANK();
                }
            } catch (CameraAccessException e) {
                Log.e("cameraview/restart-preview", e);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cameraview/restart-preview ");
        sb2.append(builder == null);
        sb2.append(" ");
        sb2.append(this.A05 == null);
        sb2.append(this.A0A == null);
        sb2.append(this.A09 == null);
        Log.i(sb2.toString());
    }

    @Override // X.InterfaceC471629w
    public synchronized int AUG(int i) {
        Float f = this.A0R;
        if (f != null) {
            float floatValue = f.floatValue();
            if (floatValue >= 1.0f && this.A03 != null && this.A08 != null && this.A05 != null) {
                this.A00 = (((floatValue - 1.0f) * i) / 1000.0f) + 1.0f;
                this.A08.set(CaptureRequest.SCALER_CROP_REGION, getZoomRect());
                this.A08.set(CaptureRequest.CONTROL_AF_REGIONS, null);
                this.A08.set(CaptureRequest.CONTROL_AE_REGIONS, null);
                try {
                    this.A05.setRepeatingRequest(this.A08.build(), this.A0c, this.A0C);
                } catch (CameraAccessException e) {
                    Log.e("cameraview/zoom", e);
                }
                return (int) (this.A00 * 100.0f);
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0104, code lost:
        if (r4 == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x016e, code lost:
        if (r1.A02("android.permission.RECORD_AUDIO") != 0) goto L122;
     */
    @Override // X.InterfaceC471629w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void AV4(java.io.File r15, int r16) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2L5.AV4(java.io.File, int):void");
    }

    @Override // X.InterfaceC471629w
    public synchronized void AVD() {
        Log.i("cameraview/stop-video-capture");
        MediaRecorder mediaRecorder = this.A0B;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
            } catch (RuntimeException e) {
                Log.w("cameraview/stop-video-capture ", e);
            }
        }
        A0N();
        this.A0m.set(false);
        A0O();
    }

    @Override // X.InterfaceC471629w
    public boolean AVK() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC471629w
    public synchronized void AVO(C471729x c471729x, boolean z) {
        CaptureRequest.Builder builder;
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/take-picture last-ae-state:");
        sb.append(A07(this.A0T));
        sb.append(" flash:");
        sb.append(this.A0V);
        Log.i(sb.toString());
        if (this.A07 != null && isAvailable() && AFK() && this.A05 != null && (builder = this.A08) != null && getPictureTakingImageReader() != null) {
            if (this.A0a && (((num = this.A0T) == null || num.intValue() != 4 || !"auto".equals(this.A0V)) && !"on".equals(this.A0V))) {
                this.A0W.set(6);
                Handler handler = this.A0C;
                if (handler != null) {
                    handler.post(new RunnableEBaseShape0S0200000_I0_0(this, c471729x, 34));
                } else {
                    throw null;
                }
            } else {
                try {
                    ImageReader imageReader = this.A0A;
                    if (imageReader != null) {
                        builder.removeTarget(imageReader.getSurface());
                    }
                    ImageReader imageReader2 = this.A09;
                    if (imageReader2 != null) {
                        this.A08.removeTarget(imageReader2.getSurface());
                    }
                    if (A0W()) {
                        this.A08.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        CameraCaptureSession cameraCaptureSession = this.A05;
                        CaptureRequest build = this.A08.build();
                        CameraCaptureSession.CaptureCallback captureCallback = this.A0c;
                        cameraCaptureSession.setRepeatingRequest(build, captureCallback, this.A0C);
                        CaptureRequest.Builder builder2 = this.A08;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                        builder2.set(key, 1);
                        this.A0W.set(3);
                        C0HC c0hc = this.A0k;
                        c0hc.A01 = 0L;
                        c0hc.A00 = 0L;
                        c0hc.A03();
                        this.A05.capture(this.A08.build(), captureCallback, this.A0C);
                        this.A08.set(key, 0);
                    } else {
                        A0U(this.A0T);
                    }
                    this.A0N = c471729x;
                } catch (CameraAccessException e) {
                    Log.e("cameraview/lock-focus", e);
                    A0P(e.getReason());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cameraview/take-picture failed state:");
        sb2.append(this.A0W);
        sb2.append(" ");
        sb2.append(this.A07 == null);
        sb2.append(" ");
        sb2.append(isAvailable() ? false : true);
        sb2.append(" ");
        sb2.append(this.A0F == null);
        sb2.append(" ");
        sb2.append(this.A0G == null);
        sb2.append(" ");
        sb2.append(this.A0B != null);
        Log.e(sb2.toString());
    }

    @Override // X.InterfaceC471629w
    public void AVf() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC471629w
    public String getFlashMode() {
        C000200d.A1N(C000200d.A0P("cameraview/get-flash-mode "), this.A0V);
        return this.A0V;
    }

    @Override // X.InterfaceC471629w
    public List getFlashModes() {
        Log.i("cameraview/get-flash-modes");
        ArrayList arrayList = new ArrayList();
        arrayList.add("off");
        if (this.A0l.get()) {
            arrayList.add("auto");
            arrayList.add("on");
        } else if (this.A0Y) {
            arrayList.add("on");
        }
        if (getStoredFlashModeCount() != arrayList.size()) {
            SharedPreferences.Editor edit = getSharedPreferences().edit();
            StringBuilder A0P = C000200d.A0P("flash_mode_count");
            A0P.append(this.A0U);
            edit.putInt(A0P.toString(), arrayList.size()).apply();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0012, code lost:
        if (r1 == null) goto L13;
     */
    @Override // X.InterfaceC471629w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int getMaxZoom() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Float r0 = r2.A0R     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            float r1 = r0.floatValue()     // Catch: java.lang.Throwable -> L17
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L14
            android.graphics.Rect r1 = r2.A03     // Catch: java.lang.Throwable -> L17
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != 0) goto L15
        L14:
            r0 = 0
        L15:
            monitor-exit(r2)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2L5.getMaxZoom():int");
    }

    @Override // X.InterfaceC471629w
    public int getNumberOfCameras() {
        CameraManager cameraManager = (CameraManager) getContext().getSystemService("camera");
        if (cameraManager != null) {
            try {
                String[] cameraIdList = cameraManager.getCameraIdList();
                StringBuilder sb = new StringBuilder();
                sb.append("cameraview/get-number-of-cameras ");
                int length = cameraIdList.length;
                sb.append(length);
                Log.i(sb.toString());
                return length;
            } catch (CameraAccessException e) {
                Log.e("cameraview/get-number-of-cameras-failed", e);
                return 0;
            }
        }
        throw null;
    }

    @Override // X.InterfaceC471629w
    public long getPictureResolution() {
        Size size = this.A0E;
        if (size != null) {
            return this.A0E.getHeight() * size.getWidth();
        }
        return 0L;
    }

    private ImageReader getPictureTakingImageReader() {
        return this.A0a ? this.A0A : this.A09;
    }

    private synchronized int getRequiredCameraRotation() {
        int i;
        int i2;
        int rotation = this.A0H.getRotation();
        int i3 = 0;
        if (rotation != 0) {
            if (rotation == 1) {
                i3 = 90;
            } else if (rotation == 2) {
                i3 = 180;
            } else if (rotation == 3) {
                i3 = 270;
            }
        }
        if (this.A0Y) {
            i = this.A01;
            i2 = ((i + i3) + 360) % 360;
        } else {
            i = this.A01;
            i2 = ((i - i3) + 360) % 360;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/orientation display:");
        sb.append(i3);
        sb.append(" sensor:");
        sb.append(i);
        sb.append(" rotate:");
        sb.append(i2);
        Log.i(sb.toString());
        return i2;
    }

    private SharedPreferences getSharedPreferences() {
        return this.A0Q.A01(C02M.A02);
    }

    @Override // X.InterfaceC471629w
    public int getStoredFlashModeCount() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        StringBuilder A0P = C000200d.A0P("flash_mode_count");
        A0P.append(this.A0U);
        int i = sharedPreferences.getInt(A0P.toString(), 0);
        C000200d.A1R(C000200d.A0P("cameraview/stored-flash-mode-count for camera "), this.A0U, " is ", i);
        return i;
    }

    @Override // X.InterfaceC471629w
    public long getVideoResolution() {
        Size size = this.A0G;
        if (size != null) {
            return this.A0G.getHeight() * size.getWidth();
        }
        return 0L;
    }

    private synchronized Rect getZoomRect() {
        RectF rectF;
        float width;
        float height;
        C000700j.A07(this.A03 != null);
        rectF = new RectF();
        width = this.A03.width();
        height = this.A03.height();
        float f = this.A00;
        float f2 = width / 2.0f;
        float f3 = (width / f) / 2.0f;
        rectF.left = f2 - f3;
        rectF.right = f2 + f3;
        float f4 = height / 2.0f;
        float f5 = (height / f) / 2.0f;
        rectF.top = f4 - f5;
        rectF.bottom = f4 + f5;
        return A04(rectF, new Rect(0, 0, (int) width, (int) height));
    }

    @Override // android.view.TextureView, android.view.View
    public synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        StringBuilder sb = new StringBuilder();
        sb.append("cameraview/on-attached-to-window/is-available:");
        sb.append(isAvailable());
        Log.i(sb.toString());
        HandlerThread handlerThread = new HandlerThread("Camera2");
        this.A0D = handlerThread;
        handlerThread.start();
        this.A0C = new Handler(this.A0D.getLooper());
    }

    @Override // android.view.View
    public synchronized void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i("cameraview/on-detached-from-window");
        A0M();
        setSurfaceTextureListener(null);
        HandlerThread handlerThread = this.A0D;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            try {
                this.A0D.join();
                this.A0D = null;
                this.A0C = null;
            } catch (InterruptedException e) {
                Log.e("cameraview/stop-background-thread", e);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        StringBuilder A0P = C000200d.A0P("cameraview/on-measure measured:");
        A0P.append(getMeasuredWidth());
        A0P.append("x");
        A0P.append(getMeasuredHeight());
        Log.i(A0P.toString());
    }

    @Override // android.view.TextureView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (view == this) {
            C000200d.A0q("cameraview/on-visibility-changed ", i);
            if (i == 0) {
                synchronized (this) {
                    z = this.A06 != null;
                }
                if (!z) {
                    if (isAvailable()) {
                        A0Q(getWidth(), getHeight());
                        return;
                    } else {
                        setSurfaceTextureListener(this.A0e);
                        return;
                    }
                }
                return;
            }
            A0M();
        }
    }

    @Override // X.InterfaceC471629w
    public synchronized void setCameraCallback(InterfaceC49112In interfaceC49112In) {
        this.A0M = interfaceC49112In;
    }

    private synchronized void setFlash(CaptureRequest.Builder builder) {
        if (this.A0l.get()) {
            String str = this.A0V;
            int hashCode = str.hashCode();
            if (hashCode != 3551) {
                if (hashCode != 109935) {
                    if (hashCode == 3005871 && str.equals("auto")) {
                        builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
                    }
                } else if (str.equals("off")) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                }
            } else if (str.equals("on")) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            }
        } else {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        builder.set(CaptureRequest.FLASH_MODE, 0);
    }

    @Override // X.InterfaceC471629w
    public void setQrDecodeHints(Map map) {
        this.A0i.A02 = map;
    }

    @Override // X.InterfaceC471629w
    public void setQrScanningEnabled(boolean z) {
        this.A0Z = z;
    }

    private synchronized void setStabilizationMode(CaptureRequest.Builder builder) {
        CameraCharacteristics cameraCharacteristics = this.A06;
        if (cameraCharacteristics == null) {
            Log.w("cameraview/set-stabilization-mode camera characteristics is null");
            return;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                    Log.i("cameraview/using-optical-stabilization");
                    return;
                }
            }
        }
        int[] iArr2 = (int[]) this.A06.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                if (i2 == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                    Log.i("cameraview/using-video-stabilization");
                    return;
                }
            }
        }
    }
}
