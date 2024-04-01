package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.RggbChannelVector;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Range;
import android.util.TypedValue;
import android.view.Surface;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.44p */
/* loaded from: classes3.dex */
public class C888244p implements AnonymousClass423 {
    public static final Map A0n;
    public static volatile C888244p A0o;
    public int A00;
    public int A01;
    public Matrix A02;
    public Matrix A03;
    public Rect A04;
    public CaptureRequest.Builder A05;
    public AnonymousClass420 A06;
    public C886744a A07;
    public C42C A08;
    public C42C A09;
    public AnonymousClass454 A0A;
    public AnonymousClass456 A0B;
    public AnonymousClass457 A0C;
    public AbstractC885543o A0D;
    public C44B A0E;
    public UUID A0F;
    public FutureTask A0G;
    public boolean A0J;
    public final int A0K;
    public final CameraManager A0L;
    public final AnonymousClass437 A0T;
    public final C43C A0U;
    public final C43K A0V;
    public final C43T A0W;
    public final C43W A0X;
    public final C884143a A0Y;
    public final C884243b A0Z;
    public final C44E A0a;
    public final C44I A0b;
    public volatile int A0e;
    public volatile CameraDevice A0f;
    public volatile C44Y A0g;
    public volatile C889044x A0h;
    public volatile AnonymousClass443 A0i;
    public volatile boolean A0j;
    public volatile boolean A0k;
    public volatile boolean A0l;
    public volatile boolean A0m;
    public boolean A0I = true;
    public boolean A0H = true;
    public final AnonymousClass427 A0N = new AnonymousClass427();
    public final AnonymousClass427 A0M = new AnonymousClass427();
    public final C888144o A0S = new C888144o();
    public final Object A0c = new Object();
    public final C887644j A0P = new C887644j(this);
    public final C887844l A0Q = new C887844l(this);
    public final C887944m A0R = new Object() { // from class: X.44m
        {
            C888244p.this = this;
        }
    };
    public final C42B A0O = new C42B() { // from class: X.44n
        {
            C888244p.this = this;
        }

        @Override // X.C42B
        public void AOb(MediaRecorder mediaRecorder) {
            mediaRecorder.setVideoSource(2);
        }

        @Override // X.C42B
        public void AOt(MediaRecorder mediaRecorder) {
            Surface surface;
            C888244p c888244p = C888244p.this;
            c888244p.A0b.A04("Method onStartMediaRecorder() must run on the Optic Background Thread.");
            C43T c43t = c888244p.A0W;
            AnonymousClass438 anonymousClass438 = c43t.A0I;
            anonymousClass438.A01("Can only check if the prepared on the Optic thread");
            if (!anonymousClass438.A00) {
                AnonymousClass446.A02("Camera2Device", "Can not start video recording, PreviewController is not prepared");
                return;
            }
            c888244p.A0Y.A0B = true;
            Surface surface2 = mediaRecorder.getSurface();
            anonymousClass438.A00("Cannot start video recording.");
            if (c43t.A03 != null && (surface = c43t.A05) != null) {
                c43t.A06 = surface2;
                List asList = Arrays.asList(surface, surface2);
                CameraCaptureSession cameraCaptureSession = c43t.A00;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.close();
                }
                c43t.A00 = c43t.A02(asList, "record_video_on_camera_thread");
                c43t.A03.addTarget(surface2);
                C889044x c889044x = c43t.A08;
                c889044x.A0C = 7;
                c889044x.A07 = Boolean.TRUE;
                c889044x.A02 = null;
                c43t.A06(false);
                c43t.A07(true, "Preview session was closed while starting recording.");
                return;
            }
            throw new IllegalStateException("Cannot start video recording, preview closed.");
        }
    };
    public final Callable A0d = new Callable() { // from class: X.432
        {
            C888244p.this = this;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            C888244p c888244p = C888244p.this;
            if (!c888244p.A0X.A06.A00.isEmpty()) {
                return null;
            }
            C43T c43t = c888244p.A0W;
            if (c43t.A0P) {
                c43t.A0N.A06(new C43P(c43t, false, false), "restart_preview_on_background_thread");
                return null;
            }
            return null;
        }
    };

    static {
        HashMap hashMap = new HashMap();
        A0n = hashMap;
        hashMap.put(0, 0);
        Map map = A0n;
        map.put(1, 90);
        map.put(2, 180);
        map.put(3, 270);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.44m] */
    public C888244p(C44I c44i, C44E c44e, Context context) {
        this.A0b = c44i;
        this.A0a = c44e;
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.A0L = cameraManager;
        C44I c44i2 = this.A0b;
        this.A0T = new AnonymousClass437(cameraManager, c44i2);
        this.A0Z = new C884243b();
        this.A0V = new C43K(c44i2, this.A0a);
        this.A0Y = new C884143a(c44i2);
        this.A0K = Math.round(TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics()));
        C44I c44i3 = this.A0b;
        this.A0U = new C43C(c44i3);
        C43W c43w = new C43W(c44i3);
        this.A0X = c43w;
        this.A0W = new C43T(this.A0b, c43w);
    }

    public static void A00(C888244p c888244p, final String str) {
        C44I c44i = c888244p.A0b;
        c44i.A04("Method openCamera() must run on the Optic Background Thread.");
        if (c888244p.A0f != null) {
            if (c888244p.A0f.getId().equals(str)) {
                return;
            }
            c888244p.A04();
        }
        C43T c43t = c888244p.A0W;
        c43t.A0O.clear();
        final C889144y c889144y = new C889144y(c888244p.A0P, c888244p.A0Q);
        c888244p.A0f = (CameraDevice) c44i.A03(new Callable() { // from class: X.430
            {
                C888244p.this = c888244p;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                CameraManager cameraManager = C888244p.this.A0L;
                String str2 = str;
                C889144y c889144y2 = c889144y;
                cameraManager.openCamera(str2, c889144y2, (Handler) null);
                return c889144y2;
            }
        }, "open_camera_on_camera_handler_thread");
        CameraManager cameraManager = c888244p.A0L;
        CameraCharacteristics A00 = AnonymousClass436.A00(str, cameraManager);
        c888244p.A0E = c888244p.A0T.A00(str);
        AbstractC885543o abstractC885543o = new AbstractC885543o(A00) { // from class: X.44q
            public static final Integer A0r = -1;
            public Boolean A00;
            public Boolean A01;
            public Boolean A02;
            public Boolean A03;
            public Boolean A04;
            public Boolean A05;
            public Boolean A06;
            public Boolean A07;
            public Boolean A08;
            public Boolean A09;
            public Boolean A0A;
            public Boolean A0B;
            public Boolean A0C;
            public Boolean A0D;
            public Boolean A0E;
            public Boolean A0F;
            public Boolean A0G;
            public Boolean A0H;
            public Boolean A0I;
            public Boolean A0J;
            public Boolean A0K;
            public Boolean A0L;
            public Boolean A0M;
            public Boolean A0N;
            public Float A0O;
            public Integer A0P;
            public Integer A0Q;
            public Integer A0R;
            public Integer A0S;
            public Integer A0T;
            public Integer A0U;
            public List A0V;
            public List A0W;
            public List A0X;
            public List A0Y;
            public List A0Z;
            public List A0a;
            public List A0b;
            public List A0c;
            public List A0d;
            public List A0e;
            public List A0f;
            public List A0g;
            public List A0h;
            public List A0i;
            public List A0j;
            public List A0k;
            public List A0l;
            public List A0m;
            public List A0n;
            public List A0o;
            public final CameraCharacteristics A0p;
            public final StreamConfigurationMap A0q;

            {
                this.A0p = A00;
                this.A0q = (StreamConfigurationMap) A00.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            }

            /* JADX WARN: Code restructure failed: missing block: B:858:0x01e1, code lost:
                if (r0 != false) goto L161;
             */
            @Override // X.AbstractC885543o
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object A00(X.C885443n r16) {
                /*
                    Method dump skipped, instructions count: 2472
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C888344q.A00(X.43n):java.lang.Object");
            }
        };
        c888244p.A0D = abstractC885543o;
        AnonymousClass456 anonymousClass456 = new AnonymousClass456(abstractC885543o);
        c888244p.A0B = anonymousClass456;
        c888244p.A0C = new AnonymousClass457(anonymousClass456);
        c888244p.A01 = ((Number) A00.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        Rect rect = (Rect) A00.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        c888244p.A04 = rect;
        C884243b c884243b = c888244p.A0Z;
        AbstractC885543o abstractC885543o2 = c888244p.A0D;
        AnonymousClass456 anonymousClass4562 = c888244p.A0B;
        AnonymousClass457 anonymousClass457 = c888244p.A0C;
        c884243b.A04 = abstractC885543o2;
        c884243b.A02 = anonymousClass4562;
        c884243b.A03 = anonymousClass457;
        c884243b.A01 = rect;
        c884243b.A00 = new Rect(0, 0, rect.width(), rect.height());
        c884243b.A05 = (List) abstractC885543o2.A00(AbstractC885543o.A0h);
        if (str != null) {
            if (c888244p.A06 != null) {
                C886744a c886744a = c888244p.A07;
                if (c886744a != null) {
                    AbstractC885543o abstractC885543o3 = c888244p.A0D;
                    if (abstractC885543o3 != null) {
                        if (c888244p.A0B != null && c888244p.A0C != null) {
                            if (c888244p.A0A != null) {
                                List list = (List) c888244p.A0D.A00(AbstractC885543o.A0Z);
                                List list2 = (List) c888244p.A0D.A00(AbstractC885543o.A0f);
                                AnonymousClass420 anonymousClass420 = c888244p.A06;
                                int i = anonymousClass420.A01;
                                int i2 = anonymousClass420.A00;
                                c888244p.A02();
                                C42D A01 = c886744a.A00.A01(list, list2, (List) abstractC885543o3.A00(AbstractC885543o.A0d), i, i2);
                                C42C c42c = A01.A01;
                                if (c42c != null) {
                                    C42C c42c2 = A01.A00;
                                    if (c42c2 != null) {
                                        c888244p.A08 = c42c;
                                        AnonymousClass457 anonymousClass4572 = c888244p.A0C;
                                        ((AbstractC886543y) anonymousClass4572).A00.A01(AbstractC886243v.A0e, c42c);
                                        C886143u c886143u = AbstractC886243v.A0Z;
                                        ((AbstractC886543y) anonymousClass4572).A00.A01(c886143u, c42c2);
                                        C886143u c886143u2 = AbstractC886243v.A0i;
                                        C42C c42c3 = A01.A02;
                                        if (c42c3 == null) {
                                            c42c3 = c42c;
                                        }
                                        ((AbstractC886543y) anonymousClass4572).A00.A01(c886143u2, c42c3);
                                        C886143u c886143u3 = AbstractC886243v.A0I;
                                        if (c888244p.A0A != null) {
                                            ((AbstractC886543y) anonymousClass4572).A00.A01(c886143u3, Boolean.FALSE);
                                            ((AbstractC886543y) anonymousClass4572).A00.A01(AbstractC886243v.A0O, Boolean.valueOf(c888244p.A0j));
                                            anonymousClass4572.A00();
                                            C43C c43c = c888244p.A0U;
                                            C887744k c887744k = new C887744k(c888244p);
                                            CameraDevice cameraDevice = c888244p.A0f;
                                            AbstractC885543o abstractC885543o4 = c888244p.A0D;
                                            AnonymousClass456 anonymousClass4563 = c888244p.A0B;
                                            AnonymousClass438 anonymousClass438 = c43c.A09;
                                            anonymousClass438.A01("Can only prepare the FocusController on the Optic thread.");
                                            c43c.A03 = c887744k;
                                            c43c.A01 = cameraManager;
                                            c43c.A00 = cameraDevice;
                                            c43c.A07 = abstractC885543o4;
                                            c43c.A06 = anonymousClass4563;
                                            c43c.A05 = c884243b;
                                            c43c.A04 = c43t;
                                            anonymousClass438.A02(true, "Failed to prepare FocusController.");
                                            C884143a c884143a = c888244p.A0Y;
                                            CameraDevice cameraDevice2 = c888244p.A0f;
                                            AbstractC885543o abstractC885543o5 = c888244p.A0D;
                                            AnonymousClass456 anonymousClass4564 = c888244p.A0B;
                                            C886744a c886744a2 = c888244p.A07;
                                            AnonymousClass438 anonymousClass4382 = c884143a.A08;
                                            anonymousClass4382.A01("Can prepare only on the Optic thread");
                                            c884143a.A0A = cameraDevice2;
                                            c884143a.A05 = abstractC885543o5;
                                            c884143a.A04 = anonymousClass4564;
                                            c884143a.A01 = c886744a2;
                                            c884143a.A03 = c43t;
                                            c884143a.A02 = c43c;
                                            anonymousClass4382.A02(true, "Failed to prepare VideoCaptureController.");
                                            C43K c43k = c888244p.A0V;
                                            CameraDevice cameraDevice3 = c888244p.A0f;
                                            AbstractC885543o abstractC885543o6 = c888244p.A0D;
                                            AnonymousClass456 anonymousClass4565 = c888244p.A0B;
                                            AnonymousClass438 anonymousClass4383 = c43k.A09;
                                            anonymousClass4383.A01("Can prepare only on the Optic thread");
                                            c43k.A00 = cameraDevice3;
                                            c43k.A07 = abstractC885543o6;
                                            c43k.A06 = anonymousClass4565;
                                            c43k.A04 = c884143a;
                                            c43k.A05 = c884243b;
                                            c43k.A03 = c43t;
                                            c43k.A02 = c43c;
                                            C42C c42c4 = (C42C) anonymousClass4565.A00(c886143u);
                                            if (c42c4 != null) {
                                                c43k.A01 = ImageReader.newInstance(c42c4.A01, c42c4.A00, 256, 1);
                                                anonymousClass4383.A02(true, "Failed to prepare PhotoCaptureController.");
                                                return;
                                            }
                                            throw new AnonymousClass435("Invalid picture size");
                                        }
                                        throw null;
                                    }
                                    throw new RuntimeException("Invalid picture size: 'null'");
                                }
                                throw new RuntimeException("Invalid preview size: 'null'");
                            }
                            throw new IllegalStateException("Trying to setup camera params without instantiating PreviewSetupDelegate.");
                        }
                        throw new IllegalStateException("Trying to setup camera params without instantiating CameraSettings.");
                    }
                    throw new IllegalStateException("Trying to setup camera params without a Capabilities.");
                }
                throw new IllegalStateException("Trying to setup camera params without a StartupSettings.");
            }
            throw new IllegalStateException("Trying to setup camera params without a CameraDeviceConfig.");
        }
        throw new AnonymousClass435("Camera ID must be provided to setup camera params.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x014e, code lost:
        if ((!r8.A06.A00.isEmpty()) != false) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(X.C888244p r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888244p.A01(X.44p, java.lang.String):void");
    }

    public int A02() {
        Number number = (Number) A0n.get(Integer.valueOf(this.A00));
        if (number != null) {
            return ((this.A01 - number.intValue()) + 360) % 360;
        }
        StringBuilder A0P = C000200d.A0P("Invalid display rotation value: ");
        A0P.append(this.A00);
        throw new IllegalArgumentException(A0P.toString());
    }

    public AbstractC886243v A03() {
        AnonymousClass456 anonymousClass456;
        if (!isConnected() || (anonymousClass456 = this.A0B) == null) {
            throw new AnonymousClass425("Cannot get camera settings");
        }
        return anonymousClass456;
    }

    public final void A04() {
        this.A0b.A04("Method closeCamera() must run on the Optic Background Thread.");
        C884143a c884143a = this.A0Y;
        if (c884143a.A0C && (!this.A0m || c884143a.A0B)) {
            c884143a.A00();
        }
        A05();
        C43C c43c = this.A0U;
        c43c.A09.A02(false, "Failed to release PreviewController.");
        c43c.A03 = null;
        c43c.A01 = null;
        c43c.A00 = null;
        c43c.A07 = null;
        c43c.A06 = null;
        c43c.A05 = null;
        c43c.A04 = null;
        C43K c43k = this.A0V;
        c43k.A09.A02(false, "Failed to release PhotoCaptureController.");
        c43k.A00 = null;
        c43k.A07 = null;
        c43k.A06 = null;
        c43k.A04 = null;
        c43k.A05 = null;
        c43k.A03 = null;
        c43k.A02 = null;
        ImageReader imageReader = c43k.A01;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
            c43k.A01.close();
            c43k.A01 = null;
        }
        c884143a.A08.A02(false, "Failed to release VideoCaptureController.");
        c884143a.A0A = null;
        c884143a.A05 = null;
        c884143a.A04 = null;
        c884143a.A01 = null;
        c884143a.A03 = null;
        c884143a.A02 = null;
        if (this.A0f != null) {
            C888144o c888144o = this.A0S;
            c888144o.A00 = this.A0f.getId();
            c888144o.A02(0L);
            this.A0f.close();
            c888144o.A00();
        }
        this.A0W.A0O.clear();
    }

    public final void A05() {
        final C43T c43t;
        C44I c44i = this.A0b;
        c44i.A04("Method stopCameraPreview() must run on the Optic Background Thread.");
        synchronized (C43T.A0R) {
            c43t = this.A0W;
            c43t.A0I.A02(false, "Failed to release PreviewController.");
            c43t.A0P = false;
            C43W c43w = c43t.A0J;
            ImageReader imageReader = c43w.A01;
            if (imageReader != null) {
                imageReader.setOnImageAvailableListener(null, null);
                c43w.A01.close();
                c43w.A01 = null;
            }
            Image image = c43w.A00;
            if (image != null) {
                image.close();
                c43w.A00 = null;
            }
            c43w.A03 = null;
            c43w.A02 = null;
            C889044x c889044x = c43t.A08;
            if (c889044x != null) {
                c889044x.A0E = false;
                c43t.A08 = null;
            }
            if (c43t.A09 != null) {
                c43t.A09 = null;
            }
            Surface surface = c43t.A05;
            if (surface != null) {
                surface.release();
                c43t.A05 = null;
            }
            CameraCaptureSession cameraCaptureSession = c43t.A00;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.close();
                c43t.A00 = null;
            }
            c43t.A06 = null;
            c43t.A03 = null;
            c43t.A0F = null;
            c43t.A0E = null;
            c43t.A02 = null;
            c43t.A0A = null;
            c43t.A0B = null;
            c43t.A07 = null;
            c43t.A0C = null;
            c43t.A01 = null;
            synchronized (this.A0c) {
                FutureTask futureTask = this.A0G;
                if (futureTask != null) {
                    c44i.A07(futureTask);
                    this.A0G = null;
                }
            }
            this.A0h = null;
            this.A05 = null;
            this.A09 = null;
            this.A0V.A0B = false;
        }
        if (c43t.A0H.A00.isEmpty()) {
            return;
        }
        C44J.A00(new Runnable() { // from class: X.43M
            @Override // java.lang.Runnable
            public void run() {
                List list = c43t.A0H.A00;
                if (0 < list.size()) {
                    list.get(0);
                    throw null;
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0070, code lost:
        if (r4 == 180) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0072, code lost:
        r2 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0073, code lost:
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00aa, code lost:
        if (r4 == 180) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00ac, code lost:
        r2 = r2 - r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888244p.A06():void");
    }

    @Override // X.AnonymousClass423
    public void A5G(C42A c42a) {
        if (c42a != null) {
            AnonymousClass427 anonymousClass427 = this.A0X.A06;
            boolean z = !(!anonymousClass427.A00.isEmpty());
            boolean A01 = anonymousClass427.A01(c42a);
            if (z && A01) {
                this.A0b.A06(new Callable() { // from class: X.42z
                    {
                        C888244p.this = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public /* bridge */ /* synthetic */ Object call() {
                        C43T c43t = C888244p.this.A0W;
                        AnonymousClass438 anonymousClass438 = c43t.A0I;
                        anonymousClass438.A01("Can only check if is retrieving preview frames from the Optic thread");
                        anonymousClass438.A01("Can only check if the prepared on the Optic thread");
                        if (anonymousClass438.A00 && c43t.A0Q) {
                            return null;
                        }
                        try {
                            c43t.A08(true, false);
                            return null;
                        } catch (CameraAccessException | IllegalArgumentException unused) {
                            return null;
                        } catch (Exception e) {
                            StringBuilder A0P = C000200d.A0P("Could not start preview: ");
                            A0P.append(e.getMessage());
                            throw new AnonymousClass435(A0P.toString());
                        }
                    }
                }, "restart_preview_to_resume_cpu_frames");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewFrameListener.");
    }

    @Override // X.AnonymousClass423
    public void A5H(C44T c44t) {
        if (c44t != null) {
            this.A0W.A0G.A01(c44t);
            return;
        }
        throw new IllegalArgumentException("Cannot add null OnPreviewStartedListener.");
    }

    @Override // X.AnonymousClass423
    public void A6R(String str, final C44B c44b, final C886744a c886744a, final AnonymousClass420 anonymousClass420, final C44Y c44y, final int i, AnonymousClass444 anonymousClass444, C44K c44k, AbstractC886844b abstractC886844b) {
        AnonymousClass446.A00 = C07K.A0O(null);
        AnonymousClass446.A00();
        if (this.A0J) {
            this.A0F = this.A0a.A00(str, this.A0b.A00);
        }
        this.A0b.A01(new Callable() { // from class: X.433
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                AnonymousClass446.A00();
                C888244p c888244p = C888244p.this;
                if (c888244p.A0g != null && c888244p.A0g != c44y) {
                    C44Y c44y2 = c888244p.A0g;
                    if (c888244p.A0g != null) {
                        c44y2.A01();
                    } else {
                        throw null;
                    }
                }
                C44Y c44y3 = c44y;
                c888244p.A0g = c44y3;
                if (c44y3 != null) {
                    c888244p.A0A = null;
                    c888244p.A0A = AnonymousClass454.A00;
                    c888244p.A06 = anonymousClass420;
                    c888244p.A07 = c886744a;
                    c888244p.A00 = i;
                    AnonymousClass437 anonymousClass437 = c888244p.A0T;
                    C44B c44b2 = c44b;
                    if (anonymousClass437.A01.A08()) {
                        C44B c44b3 = C44B.FRONT;
                        if (!anonymousClass437.A02(Integer.valueOf(c44b2 == c44b3 ? 0 : 1))) {
                            Set set = AnonymousClass437.A04;
                            if (set == null) {
                                AnonymousClass446.A01("Logical cameras not initialised!");
                            } else if (!set.isEmpty()) {
                                C44B c44b4 = C44B.BACK;
                                if (c44b2.equals(c44b4)) {
                                    if (anonymousClass437.A02(Integer.valueOf(c44b3 == c44b3 ? 0 : 1))) {
                                        AnonymousClass446.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                        c44b2 = c44b3;
                                    }
                                }
                                if (c44b2.equals(c44b3) && anonymousClass437.A02(1)) {
                                    AnonymousClass446.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                    c44b2 = c44b4;
                                }
                            }
                            throw new AnonymousClass425("No cameras found on device");
                        }
                        if (c44b2 != null) {
                            String A01 = anonymousClass437.A01(c44b2);
                            try {
                                C888244p.A00(c888244p, A01);
                                C888244p.A01(c888244p, A01);
                                AnonymousClass446.A00();
                                return new C885643p(c888244p.A0E, c888244p.A8m(), c888244p.A03());
                            } catch (Exception e) {
                                c888244p.A7I(null);
                                throw e;
                            }
                        }
                        throw new AnonymousClass425("No cameras found on device");
                    }
                    throw new RuntimeException("Cannot resolve camera facing, not on the Optic thread");
                }
                throw null;
            }
        }, "connect", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void A7I(AbstractC886844b abstractC886844b) {
        C43T c43t = this.A0W;
        c43t.A0G.A00();
        c43t.A0H.A00();
        this.A0X.A06.A00();
        this.A0N.A00();
        this.A0j = false;
        if (this.A0J) {
            this.A0a.A02(this.A0F);
            this.A0F = null;
        }
        this.A0b.A01(new Callable() { // from class: X.434
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C888244p c888244p = C888244p.this;
                c888244p.A04();
                if (c888244p.A0g != null) {
                    C44Y c44y = c888244p.A0g;
                    if (c888244p.A0g != null) {
                        c44y.A01();
                        c888244p.A0g = null;
                        c888244p.A0A = null;
                    } else {
                        throw null;
                    }
                }
                return null;
            }
        }, "disconnect", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void A7t(int i, int i2) {
        final Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0K;
        rect.inset(i3, i3);
        this.A0b.A01(new Callable() { // from class: X.42x
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C43T c43t;
                CameraCaptureSession cameraCaptureSession;
                Rect rect2 = rect;
                float[] fArr = {rect2.centerX(), rect2.centerY()};
                C888244p c888244p = C888244p.this;
                if (c888244p.A03 != null) {
                    Matrix matrix = new Matrix();
                    c888244p.A03.invert(matrix);
                    matrix.mapPoints(fArr);
                }
                C43C c43c = c888244p.A0U;
                CaptureRequest.Builder builder = c888244p.A05;
                AnonymousClass454 anonymousClass454 = c888244p.A0A;
                C889044x c889044x = c888244p.A0h;
                AnonymousClass438 anonymousClass438 = c43c.A09;
                anonymousClass438.A01("Cannot perform focus, not on Optic thread.");
                anonymousClass438.A01("Can only check if the prepared on the Optic thread");
                if (!anonymousClass438.A00 || !c43c.A03.A00.isConnected() || (c43t = c43c.A04) == null || !c43t.A0P || builder == null || c889044x == null || !((Boolean) c43c.A07.A00(AbstractC885543o.A0E)).booleanValue() || anonymousClass454 == null || (cameraCaptureSession = c43c.A04.A00) == null) {
                    return null;
                }
                c43c.A00();
                AnonymousClass428 anonymousClass428 = AnonymousClass428.FOCUSING;
                if (c43c.A02 != null) {
                    C44J.A00(new C43B(c43c, fArr, anonymousClass428));
                }
                MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(c43c.A05.A01(rect2), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)};
                c889044x.A03 = new C888444r(c43c, c889044x, fArr, builder);
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                c43c.A0B = true;
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                builder.set(key, 2);
                cameraCaptureSession.capture(builder.build(), c889044x, null);
                builder.set(key, 0);
                cameraCaptureSession.setRepeatingRequest(builder.build(), c889044x, null);
                builder.set(key, 1);
                cameraCaptureSession.capture(builder.build(), c889044x, null);
                c43c.A01(4000L, builder, c889044x);
                return null;
            }
        }, "focus", new AbstractC886844b() { // from class: X.45N
            {
                C888244p.this = this;
            }

            @Override // X.AbstractC886844b
            public void A00(Exception exc) {
                C43C c43c = C888244p.this.A0U;
                AnonymousClass428 anonymousClass428 = AnonymousClass428.EXCEPTION;
                if (c43c.A02 != null) {
                    C44J.A00(new C43B(c43c, null, anonymousClass428));
                }
            }

            @Override // X.AbstractC886844b
            public void A01(Object obj) {
            }
        });
    }

    @Override // X.AnonymousClass423
    public C44B A8j() {
        return this.A0E;
    }

    @Override // X.AnonymousClass423
    public AbstractC885543o A8m() {
        AbstractC885543o abstractC885543o;
        if (!isConnected() || (abstractC885543o = this.A0D) == null) {
            throw new AnonymousClass425("Cannot get camera capabilities");
        }
        return abstractC885543o;
    }

    @Override // X.AnonymousClass423
    public int AE9() {
        return this.A0Z.A00();
    }

    @Override // X.AnonymousClass423
    public boolean AEO(C44B c44b) {
        return this.A0T.A01(c44b) != null;
    }

    @Override // X.AnonymousClass423
    public void AEx(int i, int i2, C44B c44b, Matrix matrix) {
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        matrix.mapRect(rectF);
        Rect rect = this.A04;
        if (rect == null) {
            rect = (Rect) AnonymousClass436.A00(this.A0T.A01(c44b), this.A0L).get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        }
        RectF rectF2 = new RectF(rect);
        int A02 = A02();
        if (A02 == 90 || A02 == 270) {
            rectF2.set(rect.left, rect.top, rect.bottom, rect.right);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        matrix2.postScale(this.A0E == C44B.FRONT ? -1.0f : 1.0f, 1.0f, rectF2.width() / 2.0f, 0.0f);
        int abs = Math.abs(A02 / 90);
        Matrix matrix3 = new Matrix();
        for (int i3 = 0; i3 < abs; i3++) {
            Matrix matrix4 = new Matrix();
            float width = rectF2.width() / 2.0f;
            matrix4.setRotate(-90.0f, width, width);
            matrix4.mapRect(rectF2);
            matrix3.postConcat(matrix4);
        }
        matrix2.postConcat(matrix3);
        this.A03 = matrix2;
    }

    @Override // X.AnonymousClass423
    public boolean AFh() {
        return this.A0Y.A0C;
    }

    @Override // X.AnonymousClass423
    public boolean AFp() {
        return AEO(C44B.BACK) && AEO(C44B.FRONT);
    }

    @Override // X.AnonymousClass423
    public boolean AGD(float[] fArr) {
        Matrix matrix = this.A03;
        if (matrix == null) {
            return false;
        }
        matrix.mapPoints(fArr);
        return true;
    }

    @Override // X.AnonymousClass423
    public void AGW(final C886443x c886443x, AbstractC886844b abstractC886844b) {
        this.A0b.A01(new Callable() { // from class: X.42v
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                AbstractC885543o abstractC885543o;
                C889044x c889044x;
                Range create;
                C888244p c888244p = C888244p.this;
                if (c888244p.A0B != null && c888244p.A05 != null && c888244p.A0f != null && c888244p.A0D != null) {
                    AnonymousClass456 anonymousClass456 = c888244p.A0B;
                    C886143u c886143u = AbstractC886243v.A0I;
                    boolean booleanValue = ((Boolean) anonymousClass456.A00(c886143u)).booleanValue();
                    if (c888244p.A0B.A02(c886443x)) {
                        C43T c43t = c888244p.A0W;
                        if (c43t.A0P) {
                            boolean booleanValue2 = ((Boolean) c888244p.A0B.A00(c886143u)).booleanValue();
                            if (c888244p.A0A != null && booleanValue != booleanValue2) {
                                return c888244p.A0B;
                            }
                            c888244p.A0j = ((Boolean) c888244p.A0B.A00(AbstractC886243v.A0O)).booleanValue();
                            c43t.A05();
                            C07K.A17(c888244p.A05, c888244p.A0B, c888244p.A0D);
                            C07K.A19(c888244p.A05, c888244p.A0B, c888244p.A0D);
                            C07K.A1B(c888244p.A05, c888244p.A0B, c888244p.A0D);
                            C07K.A1A(c888244p.A05, c888244p.A0B, c888244p.A0D);
                            CaptureRequest.Builder builder = c888244p.A05;
                            if (c888244p.A0B != null && (abstractC885543o = c888244p.A0D) != null) {
                                if (((Boolean) abstractC885543o.A00(AbstractC885543o.A01)).booleanValue()) {
                                    builder.set(CaptureRequest.CONTROL_AE_LOCK, c888244p.A0B.A00(AbstractC886243v.A0K));
                                }
                                CaptureRequest.Builder builder2 = c888244p.A05;
                                AnonymousClass456 anonymousClass4562 = c888244p.A0B;
                                if (anonymousClass4562 != null && c888244p.A0D != null) {
                                    int[] iArr = (int[]) anonymousClass4562.A00(AbstractC886243v.A0b);
                                    if (C43T.A01((List) c888244p.A0D.A00(AbstractC885543o.A0b), iArr)) {
                                        if (((Boolean) c888244p.A0D.A00(AbstractC885543o.A0P)).booleanValue()) {
                                            create = Range.create(Integer.valueOf(iArr[0] / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS), Integer.valueOf(iArr[1] / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                                        } else {
                                            create = Range.create(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                                        }
                                        builder2.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, create);
                                    }
                                    C07K.A08(c888244p.A0L, c888244p.A0f.getId(), c888244p.A05, c888244p.A0B, c888244p.A0D);
                                    C07K.A18(c888244p.A05, c888244p.A0B, c888244p.A0D);
                                    CaptureRequest.Builder builder3 = c888244p.A05;
                                    AnonymousClass456 anonymousClass4563 = c888244p.A0B;
                                    AbstractC885543o abstractC885543o2 = c888244p.A0D;
                                    if (anonymousClass4563 != null && abstractC885543o2 != null) {
                                        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
                                        C886143u c886143u2 = AbstractC886243v.A06;
                                        builder3.set(key, anonymousClass4563.A00(c886143u2));
                                        CaptureRequest.Builder builder4 = c888244p.A05;
                                        AnonymousClass456 anonymousClass4564 = c888244p.A0B;
                                        AbstractC885543o abstractC885543o3 = c888244p.A0D;
                                        if (anonymousClass4564 != null && abstractC885543o3 != null) {
                                            if (((Boolean) abstractC885543o3.A00(AbstractC885543o.A08)).booleanValue() && (((Number) anonymousClass4564.A00(c886143u2)).intValue() == 0 || ((Number) anonymousClass4564.A00(c886143u2)).intValue() == 3)) {
                                                builder4.set(CaptureRequest.SENSOR_SENSITIVITY, anonymousClass4564.A00(AbstractC886243v.A0H));
                                            }
                                            CaptureRequest.Builder builder5 = c888244p.A05;
                                            AnonymousClass456 anonymousClass4565 = c888244p.A0B;
                                            AbstractC885543o abstractC885543o4 = c888244p.A0D;
                                            if (anonymousClass4565 != null && abstractC885543o4 != null) {
                                                if (((Boolean) abstractC885543o4.A00(AbstractC885543o.A06)).booleanValue() && (((Number) anonymousClass4565.A00(c886143u2)).intValue() == 0 || ((Number) anonymousClass4565.A00(c886143u2)).intValue() == 3)) {
                                                    builder5.set(CaptureRequest.SENSOR_EXPOSURE_TIME, anonymousClass4565.A00(AbstractC886243v.A08));
                                                }
                                                CaptureRequest.Builder builder6 = c888244p.A05;
                                                AnonymousClass456 anonymousClass4566 = c888244p.A0B;
                                                AbstractC885543o abstractC885543o5 = c888244p.A0D;
                                                if (anonymousClass4566 != null && abstractC885543o5 != null) {
                                                    if (((Boolean) abstractC885543o5.A00(AbstractC885543o.A00)).booleanValue() && (((Number) anonymousClass4566.A00(c886143u2)).intValue() == 0 || ((Number) anonymousClass4566.A00(c886143u2)).intValue() == 3)) {
                                                        builder6.set(CaptureRequest.LENS_APERTURE, anonymousClass4566.A00(AbstractC886243v.A01));
                                                    }
                                                    CaptureRequest.Builder builder7 = c888244p.A05;
                                                    AnonymousClass456 anonymousClass4567 = c888244p.A0B;
                                                    AbstractC885543o abstractC885543o6 = c888244p.A0D;
                                                    if (anonymousClass4567 != null && abstractC885543o6 != null) {
                                                        C885443n c885443n = AbstractC885543o.A04;
                                                        if (((Boolean) abstractC885543o6.A00(c885443n)).booleanValue()) {
                                                            builder7.set(CaptureRequest.COLOR_CORRECTION_MODE, anonymousClass4567.A00(AbstractC886243v.A03));
                                                        }
                                                        CaptureRequest.Builder builder8 = c888244p.A05;
                                                        AnonymousClass456 anonymousClass4568 = c888244p.A0B;
                                                        AbstractC885543o abstractC885543o7 = c888244p.A0D;
                                                        if (anonymousClass4568 != null && abstractC885543o7 != null) {
                                                            if (((Boolean) abstractC885543o7.A00(c885443n)).booleanValue() && ((Number) anonymousClass4568.A00(AbstractC886243v.A03)).intValue() == 0) {
                                                                float[] fArr = (float[]) anonymousClass4568.A00(AbstractC886243v.A02);
                                                                builder8.set(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(fArr[0], fArr[1], fArr[2], fArr[3]));
                                                            }
                                                            CaptureRequest.Builder builder9 = c888244p.A05;
                                                            AnonymousClass456 anonymousClass4569 = c888244p.A0B;
                                                            AbstractC885543o abstractC885543o8 = c888244p.A0D;
                                                            if (anonymousClass4569 != null && abstractC885543o8 != null) {
                                                                if (((Boolean) abstractC885543o8.A00(c885443n)).booleanValue() && ((Number) anonymousClass4569.A00(AbstractC886243v.A03)).intValue() == 0) {
                                                                    builder9.set(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform((int[]) anonymousClass4569.A00(AbstractC886243v.A04)));
                                                                }
                                                                CaptureRequest.Builder builder10 = c888244p.A05;
                                                                AnonymousClass456 anonymousClass45610 = c888244p.A0B;
                                                                AbstractC885543o abstractC885543o9 = c888244p.A0D;
                                                                if (anonymousClass45610 != null && abstractC885543o9 != null) {
                                                                    Integer valueOf = Integer.valueOf(((Number) anonymousClass45610.A00(AbstractC886243v.A00)).intValue());
                                                                    if (((List) abstractC885543o9.A00(AbstractC885543o.A0Q)).contains(valueOf)) {
                                                                        builder10.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, valueOf);
                                                                    }
                                                                    AnonymousClass456 anonymousClass45611 = c43t.A0A;
                                                                    if (anonymousClass45611 != null && (c889044x = c43t.A08) != null) {
                                                                        c889044x.A0D = ((Boolean) anonymousClass45611.A00(AbstractC886243v.A0M)).booleanValue();
                                                                    }
                                                                    c43t.A04();
                                                                } else {
                                                                    throw new IllegalStateException("Trying to update builder for antibanding mode after camera closed.");
                                                                }
                                                            } else {
                                                                throw new IllegalStateException("Trying to update builder for color correction gains after camera closed.");
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Trying to update builder for color correction gains after camera closed.");
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Trying to update builder for color correction mode after camera closed.");
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Trying to update builder for aperture after camera closed.");
                                                }
                                            } else {
                                                throw new IllegalStateException("Trying to update builder for exposure time after camera closed.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Trying to update builder for iso after camera closed.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Trying to update builder for Control Mode after camera closed.");
                                    }
                                } else {
                                    throw new IllegalStateException("Trying to update builder for preview frame rate after camera closed.");
                                }
                            } else {
                                throw new IllegalStateException("Trying to update builder for auto exposure lock after camera closed.");
                            }
                        }
                    }
                    return c888244p.A0B;
                }
                throw new IllegalStateException("Cannot modify settings, camera was closed.");
            }
        }, "modify_settings_on_background_thread", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AMa(int i) {
        this.A0e = i;
        C44Y c44y = this.A0g;
        if (c44y != null) {
            c44y.A00 = this.A0e;
        }
    }

    @Override // X.AnonymousClass423
    public void ARP(C42A c42a) {
        if (c42a != null) {
            AnonymousClass427 anonymousClass427 = this.A0X.A06;
            if (!anonymousClass427.A02(c42a) || (!anonymousClass427.A00.isEmpty())) {
                return;
            }
            synchronized (this.A0c) {
                C44I c44i = this.A0b;
                c44i.A07(this.A0G);
                this.A0G = c44i.A00(this.A0d, "restart_preview_if_to_stop_cpu_frames", 200L);
            }
        }
    }

    @Override // X.AnonymousClass423
    public void ARQ(C44T c44t) {
        if (c44t != null) {
            this.A0W.A0G.A02(c44t);
        }
    }

    @Override // X.AnonymousClass423
    public void AT3(AnonymousClass429 anonymousClass429) {
        this.A0U.A02 = anonymousClass429;
    }

    @Override // X.AnonymousClass423
    public void ATV(C44S c44s) {
        C44E c44e = this.A0a;
        synchronized (c44e.A02) {
            c44e.A00 = c44s;
        }
    }

    @Override // X.AnonymousClass423
    public void ATh(int i, AbstractC886844b abstractC886844b) {
        this.A00 = i;
        this.A0b.A01(new Callable() { // from class: X.42u
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                int i2;
                C888244p c888244p = C888244p.this;
                if (c888244p.isConnected()) {
                    c888244p.A06();
                    if (c888244p.A0g != null) {
                        C44Y c44y = c888244p.A0g;
                        int i3 = c888244p.A00;
                        if (i3 == 1) {
                            i2 = 90;
                        } else if (i3 != 2) {
                            i2 = 270;
                            if (i3 != 3) {
                                i2 = 0;
                            }
                        } else {
                            i2 = 180;
                        }
                        c44y.A02(i2);
                    }
                    return new C885643p(c888244p.A0E, c888244p.A8m(), c888244p.A03());
                }
                throw new AnonymousClass425("Can not update preview display rotation");
            }
        }, "set_rotation", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AUH(final int i, AbstractC886844b abstractC886844b) {
        this.A0b.A01(new Callable() { // from class: X.42y
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                AbstractC885543o abstractC885543o;
                int min;
                CaptureRequest.Builder builder;
                AbstractC885543o abstractC885543o2;
                C888244p c888244p = C888244p.this;
                if (c888244p.isConnected()) {
                    C43T c43t = c888244p.A0W;
                    AnonymousClass438 anonymousClass438 = c43t.A0I;
                    anonymousClass438.A01("Can only check if the prepared on the Optic thread");
                    if (anonymousClass438.A00) {
                        C884243b c884243b = c888244p.A0Z;
                        int i2 = i;
                        if (c884243b.A02 != null && c884243b.A03 != null && (abstractC885543o = c884243b.A04) != null && c884243b.A05 != null && c884243b.A00 != null && c884243b.A01 != null && (min = Math.min(Math.max(i2, 0), ((Number) abstractC885543o.A00(AbstractC885543o.A0N)).intValue())) != c884243b.A00()) {
                            AnonymousClass457 anonymousClass457 = c884243b.A03;
                            ((AbstractC886543y) anonymousClass457).A00.A01(AbstractC886243v.A0k, Integer.valueOf(min));
                            anonymousClass457.A00();
                            int width = c884243b.A01.width();
                            int height = c884243b.A01.height();
                            double intValue = (((Number) c884243b.A05.get(min)).intValue() / 100.0f) * 2.0d;
                            int i3 = (int) (width / intValue);
                            int i4 = (int) (height / intValue);
                            int i5 = width >> 1;
                            int i6 = height >> 1;
                            c884243b.A00.set(i5 - i3, i6 - i4, i5 + i3, i6 + i4);
                            Rect rect = c884243b.A00;
                            MeteringRectangle[] A02 = c884243b.A02(c884243b.A07);
                            MeteringRectangle[] A022 = c884243b.A02(c884243b.A06);
                            anonymousClass438.A01("Can only apply zoom on the Optic thread");
                            anonymousClass438.A01("Can only check if the prepared on the Optic thread");
                            if (anonymousClass438.A00 && (builder = c43t.A03) != null && (abstractC885543o2 = c43t.A0C) != null) {
                                C43T.A00(builder, rect, A02, A022, abstractC885543o2);
                                if (c43t.A0P) {
                                    c43t.A04();
                                }
                            }
                        }
                        return Integer.valueOf(c884243b.A00());
                    }
                }
                return 0;
            }
        }, "set_zoom_level", null);
    }

    @Override // X.AnonymousClass423
    public boolean AUK(int i, int i2, int i3, int i4, Matrix matrix, boolean z) {
        RectF rectF;
        float min;
        if (this.A08 != null) {
            matrix.reset();
            RectF rectF2 = new RectF(0.0f, 0.0f, i, i2);
            int i5 = this.A01;
            if (i5 != 0 && i5 != 180) {
                rectF = new RectF(0.0f, 0.0f, i4, i3);
            } else {
                rectF = new RectF(0.0f, 0.0f, i3, i4);
            }
            float centerX = rectF2.centerX();
            float centerY = rectF2.centerY();
            if (!rectF2.equals(rectF)) {
                rectF.offset(centerX - rectF.centerX(), centerY - rectF.centerY());
                matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                float max = Math.max(i, i2) / Math.max(i3, i4);
                float min2 = Math.min(i, i2) / Math.min(i3, i4);
                if (z) {
                    min = Math.max(max, min2);
                } else {
                    min = Math.min(max, min2);
                }
                matrix.postScale(min, min, centerX, centerY);
            }
            int i6 = this.A00;
            if (i6 == 1 || i6 == 3) {
                matrix.postRotate((i6 - 2) * 90, centerX, centerY);
                return true;
            }
            if (i6 == 2) {
                matrix.postRotate(180.0f, centerX, centerY);
            }
            return true;
        }
        throw new IllegalStateException("Camera params need to be configured before invoking setupViewTransformMatrix()");
    }

    @Override // X.AnonymousClass423
    public void AUw(int i, int i2, AbstractC886844b abstractC886844b) {
        final Rect rect = new Rect(i, i2, i, i2);
        int i3 = -this.A0K;
        rect.inset(i3, i3);
        this.A0b.A01(new Callable() { // from class: X.42w
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                AbstractC885543o abstractC885543o;
                C888244p c888244p = C888244p.this;
                if (c888244p.isConnected()) {
                    C43T c43t = c888244p.A0W;
                    AnonymousClass438 anonymousClass438 = c43t.A0I;
                    anonymousClass438.A01("Can only check if the prepared on the Optic thread");
                    if (anonymousClass438.A00) {
                        MeteringRectangle[] meteringRectangleArr = {new MeteringRectangle(c888244p.A0Z.A01(rect), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)};
                        anonymousClass438.A01("Can only perform spot metering on the Optic thread");
                        anonymousClass438.A01("Can only check if the prepared on the Optic thread");
                        if (anonymousClass438.A00 && c43t.A0P && c43t.A03 != null && c43t.A00 != null && (abstractC885543o = c43t.A0C) != null && ((Boolean) abstractC885543o.A00(AbstractC885543o.A0F)).booleanValue()) {
                            if (c43t.A09 != null) {
                                c43t.A03.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                                c43t.A00.setRepeatingRequest(c43t.A03.build(), null, null);
                            } else {
                                throw null;
                            }
                        }
                    }
                }
                return null;
            }
        }, "spot_meter", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AV7(File file, AbstractC886844b abstractC886844b) {
        final C42C c42c;
        final C884143a c884143a = this.A0Y;
        final String absolutePath = file.getAbsolutePath();
        final C44B c44b = this.A0E;
        final int i = this.A0e;
        final C44Y c44y = this.A0g;
        final C42B c42b = this.A0O;
        final CaptureRequest.Builder builder = this.A05;
        boolean z = !this.A0X.A06.A00.isEmpty();
        final C889044x c889044x = this.A0h;
        C43T c43t = c884143a.A03;
        if (c43t != null && c43t.A0P && c884143a.A04 != null) {
            if (c884143a.A0C) {
                abstractC886844b.A00(new IllegalStateException("Cannot start recording video, there is a video already being recorded"));
                return;
            }
            final long A0O = C07K.A0O(null);
            AnonymousClass456 anonymousClass456 = c884143a.A04;
            C886143u c886143u = AbstractC886243v.A0i;
            if (anonymousClass456.A00(c886143u) != null) {
                c42c = (C42C) c884143a.A04.A00(c886143u);
            } else {
                c42c = (C42C) c884143a.A04.A00(AbstractC886243v.A0e);
            }
            if (absolutePath == null) {
                abstractC886844b.A00(new IllegalArgumentException("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value"));
                return;
            }
            c884143a.A0C = true;
            c884143a.A0B = false;
            c884143a.A09.A01(new Callable() { // from class: X.43X
                public final /* synthetic */ boolean A0A = true;

                /* JADX WARN: Code restructure failed: missing block: B:119:0x0119, code lost:
                    if (X.AnonymousClass436.A01(r11.A01, r8, 4) != false) goto L44;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 341
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C43X.call():java.lang.Object");
                }
            }, "start_video_recording", new C45P(c884143a, abstractC886844b, builder, c889044x, z));
            return;
        }
        abstractC886844b.A00(new IllegalStateException("Cannot start recording video, camera is not ready or has been closed."));
    }

    @Override // X.AnonymousClass423
    public void AVF(final boolean z, AbstractC886844b abstractC886844b) {
        final C884143a c884143a = this.A0Y;
        final CaptureRequest.Builder builder = this.A05;
        final boolean z2 = !this.A0X.A06.A00.isEmpty();
        final C889044x c889044x = this.A0h;
        if (!c884143a.A0C) {
            abstractC886844b.A00(new IllegalStateException("Not recording video."));
            return;
        }
        final long A0O = C07K.A0O(null);
        c884143a.A09.A01(new Callable() { // from class: X.43Z
            @Override // java.util.concurrent.Callable
            public Object call() {
                CaptureRequest.Builder builder2;
                C884143a c884143a2 = c884143a;
                if (c884143a2.A0C) {
                    if (c884143a2.A0A != null && c884143a2.A05 != null && c884143a2.A04 != null && c884143a2.A03 != null && c884143a2.A02 != null) {
                        if (c884143a2.A06 != null) {
                            long elapsedRealtime = SystemClock.elapsedRealtime() - c884143a2.A00;
                            if (elapsedRealtime < 500) {
                                SystemClock.sleep(500 - elapsedRealtime);
                            }
                            C44N c44n = c884143a2.A06;
                            boolean z3 = c884143a2.A0B;
                            Exception A00 = c884143a2.A00();
                            if (((Number) c884143a2.A04.A00(AbstractC886243v.A09)).intValue() != 0 && (builder2 = builder) != null) {
                                C07K.A1C(builder2, c884143a2.A05, 0);
                                c884143a2.A03.A04();
                            }
                            if (z) {
                                c884143a2.A02.A02(builder, c889044x);
                                if (z3) {
                                    c884143a2.A03.A08(z2, true);
                                }
                            }
                            if (A00 == null) {
                                long j = A0O;
                                long j2 = c44n.A02;
                                if (j2 != -1) {
                                    j = j2;
                                }
                                c44n.A02 = j;
                                return c44n;
                            }
                            throw A00;
                        }
                        throw new IllegalStateException("Cannot stop recording video, VideoCaptureInfo is null");
                    }
                    throw new IllegalStateException("Cannot stop recording video, camera is closed");
                }
                throw new IllegalStateException("Not recording video.");
            }
        }, "stop_video_capture", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AVL(AbstractC886844b abstractC886844b) {
        AnonymousClass446.A00 = C07K.A0O(null);
        AnonymousClass446.A00();
        this.A0b.A01(new Callable() { // from class: X.42t
            {
                C888244p.this = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                C888244p c888244p = C888244p.this;
                AnonymousClass446.A00();
                if (c888244p.A0f != null) {
                    try {
                        C44B c44b = c888244p.A0E;
                        C44B c44b2 = C44B.BACK;
                        if (c44b.equals(c44b2)) {
                            c44b2 = C44B.FRONT;
                        }
                        AnonymousClass437 anonymousClass437 = c888244p.A0T;
                        if (anonymousClass437.A02(Integer.valueOf(c44b2 == C44B.FRONT ? 0 : 1))) {
                            c888244p.A0m = true;
                            String A01 = anonymousClass437.A01(c44b2);
                            C888244p.A00(c888244p, A01);
                            C888244p.A01(c888244p, A01);
                            C885643p c885643p = new C885643p(c888244p.A0E, c888244p.A8m(), c888244p.A03());
                            AnonymousClass446.A00();
                            return c885643p;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot switch to ");
                        sb.append(c44b2.name());
                        sb.append(", camera is not present");
                        throw new AnonymousClass421(sb.toString());
                    } finally {
                        c888244p.A0m = false;
                    }
                }
                throw new AnonymousClass435("Cannot switch camera, no cameras open.");
            }
        }, "switch_camera", abstractC886844b);
    }

    @Override // X.AnonymousClass423
    public void AVN(boolean z, final boolean z2, final C44V c44v) {
        final int i;
        C43T c43t;
        final C43K c43k = this.A0V;
        final CameraManager cameraManager = this.A0L;
        final C44B c44b = this.A0E;
        int i2 = (((this.A0e + 45) / 90) * 90) % 360;
        if (this.A0E == C44B.FRONT) {
            i = ((this.A01 - i2) + 360) % 360;
        } else {
            i = (this.A01 + i2) % 360;
        }
        final int A02 = A02();
        final CaptureRequest.Builder builder = this.A05;
        final AnonymousClass454 anonymousClass454 = this.A0A;
        final boolean z3 = !this.A0X.A06.A00.isEmpty();
        final C889044x c889044x = this.A0h;
        if (c43k.A00 != null && (c43t = c43k.A03) != null && c43t.A0P) {
            if (c43k.A0B) {
                c43k.A0A.A05(c43k.A08.A03, new C43J(c44v, new AnonymousClass435("Cannot take photo, another capture in progress.")));
                return;
            } else if (c43k.A04.A0C) {
                c43k.A0A.A05(c43k.A08.A03, new C43J(c44v, new AnonymousClass435("Cannot take photo, video recording in progress.")));
                return;
            } else {
                ((Number) c43k.A06.A00(AbstractC886243v.A0X)).intValue();
                AnonymousClass446.A00 = C07K.A0O(null);
                AnonymousClass446.A00();
                c43k.A0B = true;
                c43k.A02.A00();
                c43k.A0A.A01(new Callable() { // from class: X.43E
                    public final /* synthetic */ boolean A0A = true;

                    /* JADX WARN: Code restructure failed: missing block: B:157:0x0081, code lost:
                        if (r0 != 2) goto L139;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:162:0x0096, code lost:
                        if (((java.lang.Number) r1.A00(X.AbstractC886243v.A09)).intValue() != 1) goto L138;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:267:0x039b, code lost:
                        if (r0.intValue() != 2) goto L25;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:232:0x025e  */
                    /* JADX WARN: Removed duplicated region for block: B:254:0x0324  */
                    /* JADX WARN: Type inference failed for: r3v10, types: [android.os.Handler, android.hardware.camera2.CameraCaptureSession$CaptureCallback, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r3v11 */
                    /* JADX WARN: Type inference failed for: r3v9 */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 980
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C43E.call():java.lang.Object");
                    }
                }, "take_photo", new AbstractC886844b() { // from class: X.45O
                    @Override // X.AbstractC886844b
                    public void A00(Exception exc) {
                        C43K c43k2 = c43k;
                        c43k2.A0B = false;
                        c43k2.A0A.A05(c43k2.A08.A03, new C43J(c44v, exc));
                    }

                    @Override // X.AbstractC886844b
                    public void A01(Object obj) {
                        c43k.A0B = false;
                    }
                });
                return;
            }
        }
        c43k.A0A.A05(c43k.A08.A03, new C43J(c44v, new AnonymousClass435("Camera not ready to take photo.")));
    }

    @Override // X.AnonymousClass423
    public boolean isConnected() {
        if (this.A0f != null) {
            return this.A0k || this.A0l;
        }
        return false;
    }
}
