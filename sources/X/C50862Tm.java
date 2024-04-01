package X;

import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.util.Range;
import android.view.Surface;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Tm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50862Tm extends VoipPhysicalCamera {
    public static final int[] A0G = {2, 0, 1, 3};
    public Point A01;
    public CameraCaptureSession A02;
    public CameraDevice A03;
    public Image A04;
    public Surface A05;
    public ByteBuffer A07;
    public final int A09;
    public final CameraCharacteristics A0A;
    public final CameraManager A0C;
    public final ImageReader A0D;
    public final C001200o A0E;
    public final C50912Ts A0F;
    public int A00 = 0;
    public Object A06 = new Object();
    public boolean A08 = false;
    public final CameraDevice.StateCallback A0B = new CameraDevice.StateCallback() { // from class: X.3dv
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            C50862Tm c50862Tm = C50862Tm.this;
            c50862Tm.A00 = 0;
            Log.i("voip/video/VoipCamera/ cameraDevice closed");
            if (c50862Tm.A08) {
                c50862Tm.A08 = false;
                if (c50862Tm.startOnCameraThread() != 0) {
                    c50862Tm.cameraEventsDispatcher.A00();
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C50862Tm c50862Tm = C50862Tm.this;
            if (cameraDevice == c50862Tm.A03) {
                Log.i("voip/video/VoipCamera/ cameraDevice disconnected");
                c50862Tm.stopPeriodicCameraCallbackCheck();
                C74863dy c74863dy = c50862Tm.cameraEventsDispatcher;
                Iterator it = c74863dy.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC50852Tl) it.next()).AK6(c74863dy.A01);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            C000200d.A0q("voip/video/VoipCamera/ cameraDevice error ", i);
            C50862Tm.this.cameraEventsDispatcher.A00();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Log.i("voip/video/VoipCamera/ camera opened");
            C50862Tm c50862Tm = C50862Tm.this;
            c50862Tm.A00 = 2;
            c50862Tm.A03 = cameraDevice;
            if (c50862Tm.videoPort == null || c50862Tm.A01() == 0) {
                return;
            }
            c50862Tm.cameraEventsDispatcher.A00();
        }
    };

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int getCameraStartMode() {
        return 0;
    }

    public C50862Tm(C001200o c001200o, int i, int i2, int i3, int i4, int i5) {
        this.A0E = c001200o;
        StringBuilder A0R = C000200d.A0R("voip/video/VoipCamera/create idx: ", i, ", size:", i2, "x");
        A0R.append(i3);
        A0R.append(", format: 0x");
        A0R.append(Integer.toHexString(i4));
        A0R.append(", fps * 1000: ");
        A0R.append(i5);
        A0R.append(", api 2, this ");
        A0R.append(this);
        Log.i(A0R.toString());
        CameraManager cameraManager = (CameraManager) this.A0E.A00.getSystemService("camera");
        if (cameraManager != null) {
            this.A0C = cameraManager;
            this.A09 = i;
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(Integer.toString(i));
                this.A0A = cameraCharacteristics;
                Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                if (obj != null) {
                    Number number = (Number) obj;
                    Object obj2 = this.A0A.get(CameraCharacteristics.LENS_FACING);
                    if (obj2 != null) {
                        C50912Ts c50912Ts = new C50912Ts(i2, i3, i4, i5, ((Number) obj2).intValue() == 0, number.intValue(), i);
                        this.A0F = c50912Ts;
                        ImageReader newInstance = ImageReader.newInstance(c50912Ts.A05, c50912Ts.A02, c50912Ts.A00, 3);
                        this.A0D = newInstance;
                        if (newInstance != null) {
                            newInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.3dm
                                @Override // android.media.ImageReader.OnImageAvailableListener
                                public final void onImageAvailable(ImageReader imageReader) {
                                    C50862Tm.this.A03(imageReader);
                                }
                            }, this.cameraThreadHandler);
                            return;
                        }
                        throw new RuntimeException("Unable to create image reader");
                    }
                    throw null;
                }
                throw null;
            } catch (CameraAccessException e) {
                throw new RuntimeException(e);
            }
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r2.equals("LIMITED") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r2.equals("LEVEL_3") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r2.equals("FULL") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r2.equals("EXTERNAL") == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r2.equals("LEGACY") != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(java.lang.String r5, int r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = r5.toUpperCase(r0)
            int r0 = r2.hashCode()
            r5 = 2
            r1 = 1
            switch(r0) {
                case -2053249079: goto L4b;
                case -1038134325: goto L41;
                case 2169487: goto L37;
                case 787768856: goto L2d;
                case 894099834: goto L23;
                default: goto Lf;
            }
        Lf:
            r5 = -1
        L10:
            if (r5 == r6) goto L55
            int[] r4 = X.C50862Tm.A0G
            int r3 = r4.length
            r2 = 0
            r1 = 0
        L17:
            if (r2 >= r3) goto L54
            r0 = r4[r2]
            if (r0 != r5) goto L1e
            r1 = 1
        L1e:
            if (r0 == r6) goto L55
            int r2 = r2 + 1
            goto L17
        L23:
            java.lang.String r0 = "LIMITED"
            boolean r0 = r2.equals(r0)
            r5 = 0
            if (r0 != 0) goto L10
            goto Lf
        L2d:
            java.lang.String r0 = "LEVEL_3"
            boolean r0 = r2.equals(r0)
            r5 = 3
            if (r0 != 0) goto L10
            goto Lf
        L37:
            java.lang.String r0 = "FULL"
            boolean r0 = r2.equals(r0)
            r5 = 1
            if (r0 != 0) goto L10
            goto Lf
        L41:
            java.lang.String r0 = "EXTERNAL"
            boolean r0 = r2.equals(r0)
            r5 = 4
            if (r0 != 0) goto L10
            goto Lf
        L4b:
            java.lang.String r0 = "LEGACY"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lf
            goto L10
        L54:
            r1 = 0
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50862Tm.A00(java.lang.String, int):boolean");
    }

    public final int A01() {
        Log.i("voip/video/VoipCamera/ starting camera");
        if (this.A03 == null || this.videoPort == null) {
            return -5;
        }
        createTexture();
        C74413dE c74413dE = this.textureHolder;
        if (c74413dE == null) {
            return -1;
        }
        SurfaceTexture surfaceTexture = c74413dE.A01;
        C50912Ts c50912Ts = this.A0F;
        surfaceTexture.setDefaultBufferSize(c50912Ts.A05, c50912Ts.A02);
        this.A05 = new Surface(this.textureHolder.A01);
        A02();
        try {
            final CaptureRequest.Builder createCaptureRequest = this.A03.createCaptureRequest(1);
            createCaptureRequest.addTarget(this.A05);
            ImageReader imageReader = this.A0D;
            createCaptureRequest.addTarget(imageReader.getSurface());
            this.A03.createCaptureSession(Arrays.asList(this.A05, imageReader.getSurface()), new CameraCaptureSession.StateCallback() { // from class: X.3du
                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    Log.i("voip/video/VoipCamera/ cameraDevice configure failed");
                    C50862Tm.this.cameraEventsDispatcher.A00();
                }

                @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C50862Tm c50862Tm = C50862Tm.this;
                    if (c50862Tm.A03 == null) {
                        Log.i("voip/video/VoipCamera/ cameraDevice configured, but device is null");
                        c50862Tm.cameraEventsDispatcher.A00();
                        return;
                    }
                    Log.i("voip/video/VoipCamera/ cameraDevice configured");
                    CaptureRequest.Builder builder = createCaptureRequest;
                    builder.set(CaptureRequest.CONTROL_MODE, 1);
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    builder.set(CaptureRequest.FLASH_MODE, 0);
                    Range[] rangeArr = (Range[]) c50862Tm.A0A.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    if (rangeArr != null) {
                        int i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                        Range range = null;
                        for (Range range2 : rangeArr) {
                            int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(((Number) range2.getLower()).intValue() * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, ((Number) range2.getUpper()).intValue() * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, c50862Tm.A0F.A01);
                            StringBuilder A0P = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread check fps [");
                            A0P.append(range2.getLower());
                            A0P.append(", ");
                            A0P.append(range2.getUpper());
                            A0P.append("], score: ");
                            A0P.append(fpsRangeScore);
                            Log.i(A0P.toString());
                            if (fpsRangeScore > i) {
                                range = range2;
                                i = fpsRangeScore;
                            }
                        }
                        if (range != null) {
                            StringBuilder A0P2 = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread with fps range [");
                            A0P2.append(range.getLower());
                            A0P2.append(", ");
                            A0P2.append(range.getUpper());
                            A0P2.append("], score: ");
                            A0P2.append(i);
                            A0P2.append(", supported ranges : ");
                            A0P2.append(Arrays.toString(rangeArr));
                            Log.i(A0P2.toString());
                            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                        }
                    }
                    c50862Tm.A02 = cameraCaptureSession;
                    try {
                        cameraCaptureSession.setRepeatingRequest(builder.build(), null, c50862Tm.cameraThreadHandler);
                        c50862Tm.startPeriodicCameraCallbackCheck();
                    } catch (CameraAccessException unused) {
                        Log.i("voip/video/VoipCamera/ failed to start preview");
                        c50862Tm.cameraEventsDispatcher.A00();
                    }
                }
            }, this.cameraThreadHandler);
            return 0;
        } catch (CameraAccessException e) {
            Log.e("startCaptureSessionOnCameraThread", e);
            return -2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r1.getRotation() == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A02() {
        /*
            r5 = this;
            X.00o r0 = r5.A0E
            android.app.Application r1 = r0.A00
            java.lang.String r0 = "window"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L3e
            android.view.Display r1 = r0.getDefaultDisplay()
            X.2Ts r4 = r5.A0F
            int r0 = r4.A04
            int r0 = r0 % 180
            r3 = 0
            if (r0 != 0) goto L1c
            r3 = 1
        L1c:
            int r0 = r1.getRotation()
            if (r0 == 0) goto L2a
            int r2 = r1.getRotation()
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r3 != r0) goto L39
            int r2 = r4.A05
            int r1 = r4.A02
        L31:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.A01 = r0
            return
        L39:
            int r2 = r4.A02
            int r1 = r4.A05
            goto L31
        L3e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50862Tm.A02():void");
    }

    public void A03(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            for (Map.Entry entry : this.virtualCameras.entrySet()) {
                if (((VoipCamera) entry.getValue()).started) {
                    updateCameraCallbackCheck();
                    Image.Plane plane = acquireLatestImage.getPlanes()[0];
                    Image.Plane plane2 = acquireLatestImage.getPlanes()[1];
                    Image.Plane plane3 = acquireLatestImage.getPlanes()[2];
                    ((VoipCamera) entry.getValue()).framePlaneCallback(plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride());
                }
            }
            synchronized (this.A06) {
                Image image = this.A04;
                if (image != null) {
                    image.close();
                }
                this.A04 = acquireLatestImage;
            }
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int closeOnCameraThread() {
        C000700j.A08(this.A00 == 0, "closing camera while still open");
        C74863dy c74863dy = this.cameraEventsDispatcher;
        Iterator it = c74863dy.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC50852Tl) it.next()).AIc(c74863dy.A01);
        }
        this.A0D.close();
        synchronized (this.A06) {
            Image image = this.A04;
            if (image != null) {
                image.close();
                this.A04 = null;
            }
        }
        return 0;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public Point getAdjustedPreviewSize() {
        return this.A01;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public C50912Ts getCameraInfo() {
        return this.A0F;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public C50922Tw getLastCachedFrame() {
        synchronized (this.A06) {
            Image image = this.A04;
            if (image == null) {
                return null;
            }
            int width = ((image.getWidth() * 3) * this.A04.getHeight()) / 2;
            ByteBuffer byteBuffer = this.A07;
            if (byteBuffer == null || byteBuffer.capacity() != width) {
                this.A07 = ByteBuffer.allocateDirect(width);
            }
            Image.Plane plane = this.A04.getPlanes()[0];
            Image.Plane plane2 = this.A04.getPlanes()[1];
            Image.Plane plane3 = this.A04.getPlanes()[2];
            VideoFrameConverter.convertAndroid420toI420(plane.getBuffer(), plane.getRowStride(), plane2.getBuffer(), plane2.getRowStride(), plane3.getBuffer(), plane3.getRowStride(), plane2.getPixelStride(), this.A04.getWidth(), this.A04.getHeight(), this.A07);
            byte[] bArr = new byte[width];
            this.A07.rewind();
            this.A07.get(bArr);
            C50922Tw c50922Tw = new C50922Tw();
            c50922Tw.A05 = bArr;
            C50912Ts c50912Ts = this.A0F;
            c50922Tw.A03 = c50912Ts.A05;
            c50922Tw.A01 = c50912Ts.A02;
            c50922Tw.A00 = c50912Ts.A00;
            c50922Tw.A02 = c50912Ts.A04;
            c50922Tw.A04 = c50912Ts.A06;
            return c50922Tw;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int getLatestFrame(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("VoipCameraApi2 does not support this operation ATM");
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void onFrameAvailableOnCameraThread() {
        C000700j.A08(this.videoPort != null, "videoport should not be null while receiving frames");
        C74413dE c74413dE = this.textureHolder;
        if (c74413dE != null) {
            VideoPort videoPort = this.videoPort;
            C50912Ts c50912Ts = this.A0F;
            videoPort.renderTexture(c74413dE, c50912Ts.A05, c50912Ts.A02);
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        int i;
        int i2;
        VideoPort videoPort2 = this.videoPort;
        if (videoPort2 == videoPort) {
            return 0;
        }
        StringBuilder A0P = C000200d.A0P("voip/video/VoipCamera/setVideoPortOnCameraThread to ");
        if (videoPort != null) {
            i = videoPort.hashCode();
        } else {
            i = 0;
        }
        A0P.append(i);
        A0P.append(" from ");
        if (videoPort2 != null) {
            i2 = videoPort2.hashCode();
        } else {
            i2 = 0;
        }
        A0P.append(i2);
        A0P.append(", status: ");
        C000200d.A1F(A0P, this.A00);
        if (videoPort != null) {
            this.videoPort = videoPort;
            videoPort.setScaleType(0);
            int i3 = this.A00;
            if (i3 == 2) {
                if (videoPort2 != null) {
                    releaseTexture();
                }
                return A01();
            } else if (i3 == 0 || i3 == 1) {
                return startOnCameraThread();
            } else {
                return 0;
            }
        }
        stopOnCameraThread();
        this.videoPort = null;
        return 0;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int startOnCameraThread() {
        int i = this.A00;
        if (i == 2 || i == 3 || this.videoPort == null) {
            return 0;
        }
        if (i == 1) {
            Log.i("voip/video/VoipCamera/ Camera device is not fully closed, create camera device on close");
            this.A08 = true;
            return 0;
        }
        try {
            Log.i("voip/video/VoipCamera/ opening camera");
            this.A0C.openCamera(Integer.toString(this.A09), this.A0B, this.cameraThreadHandler);
            this.A00 = 3;
            return 0;
        } catch (CameraAccessException e) {
            Log.e("voip/video/VoipCamera/ failed to open camera ", e);
            return -4;
        } catch (IllegalArgumentException e2) {
            Log.e("voip/video/VoipCamera/ failed to open camera due to crashed HAL ", e2);
            return -4;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int stopOnCameraThread() {
        stopPeriodicCameraCallbackCheck();
        CameraCaptureSession cameraCaptureSession = this.A02;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A02 = null;
        }
        CameraDevice cameraDevice = this.A03;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.A03 = null;
            this.A00 = 1;
        }
        Surface surface = this.A05;
        if (surface != null) {
            surface.release();
        }
        releaseTexture();
        return 0;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void updatePreviewOrientation() {
        if (this.videoPort != null) {
            A02();
        }
    }
}
