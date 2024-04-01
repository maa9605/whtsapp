package org.pjsip;

import X.C000200d;
import X.C000700j;
import X.C50912Ts;
import X.C50922Tw;
import X.C74413dE;
import X.C74863dy;
import X.InterfaceC50852Tl;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.hardware.Camera;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipCamera;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.pjsip.PjCamera;

/* loaded from: classes2.dex */
public final class PjCamera extends VoipPhysicalCamera implements Camera.PreviewCallback {
    public volatile Point adjustedPreviewSize;
    public final int camIdx;
    public Camera camera;
    public final C50912Ts cameraInfo;
    public boolean isRunning;
    public volatile byte[] lastCachedFrameData;
    public volatile boolean newFrameAvailable;
    public boolean receivedCameraError = false;
    public volatile int cameraStartMode = 0;
    public final Object frameLock = new Object();

    public PjCamera(int i, int i2, int i3, int i4, int i5, long j) {
        StringBuilder A0R = C000200d.A0R("voip/video/VoipCamera/create idx: ", i, ", size:", i2, "x");
        A0R.append(i3);
        A0R.append(", format: 0x");
        A0R.append(Integer.toHexString(i4));
        A0R.append(", fps * 1000: ");
        A0R.append(i5);
        A0R.append(", this ");
        A0R.append(this);
        A0R.append(", class ");
        A0R.append(PjCamera.class);
        A0R.append("@");
        A0R.append(PjCamera.class.hashCode());
        A0R.append(", class loader ");
        A0R.append(PjCamera.class.getClassLoader());
        A0R.append(", hash: ");
        A0R.append(System.identityHashCode(PjCamera.class.getClassLoader()));
        Log.i(A0R.toString());
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        this.camIdx = i;
        this.cameraInfo = new C50912Ts(i2, i3, i4, i5, cameraInfo.facing == 1, cameraInfo.orientation, i);
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int closeOnCameraThread() {
        Log.i("voip/video/VoipCamera/closeOnCameraThread");
        C000700j.A08(!this.isRunning, "close should only be called after stop.");
        C74863dy c74863dy = this.cameraEventsDispatcher;
        Iterator it = c74863dy.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC50852Tl) it.next()).AIc(c74863dy.A01);
        }
        return 0;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public Point getAdjustedPreviewSize() {
        return this.adjustedPreviewSize;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public C50912Ts getCameraInfo() {
        return this.cameraInfo;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public synchronized int getCameraStartMode() {
        return this.cameraStartMode;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public C50922Tw getLastCachedFrame() {
        byte[] bArr = this.lastCachedFrameData;
        if (bArr == null) {
            return null;
        }
        C50922Tw c50922Tw = new C50922Tw();
        c50922Tw.A05 = bArr;
        C50912Ts c50912Ts = this.cameraInfo;
        c50922Tw.A03 = c50912Ts.A05;
        c50922Tw.A01 = c50912Ts.A02;
        c50922Tw.A00 = c50912Ts.A00;
        c50922Tw.A02 = c50912Ts.A04;
        c50922Tw.A04 = c50912Ts.A06;
        return c50922Tw;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int getLatestFrame(ByteBuffer byteBuffer) {
        C000700j.A08(this.passiveMode, "Should be here only in passive mode");
        if (this.passiveMode) {
            synchronized (this.frameLock) {
                if (this.newFrameAvailable) {
                    int min = Math.min(byteBuffer.capacity(), this.lastCachedFrameData.length);
                    byteBuffer.rewind();
                    byteBuffer.order(ByteOrder.nativeOrder());
                    byteBuffer.put(this.lastCachedFrameData, 0, min);
                    this.newFrameAvailable = false;
                    return min;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int getPreviewSizeForFormat(int i, int i2, int i3) {
        if (i3 == 842094169) {
            int ceil = ((int) Math.ceil(i / 16.0d)) << 4;
            return Math.max(((i * i2) * 3) >> 1, ((((((int) Math.ceil((ceil >> 1) / 16.0d)) << 4) * i2) >> 1) << 1) + (ceil * i2));
        }
        return (ImageFormat.getBitsPerPixel(i3) * (i * i2)) >> 3;
    }

    public /* synthetic */ void lambda$startOnCameraThread$2896$PjCamera(int i, Camera camera) {
        C000200d.A0p("camera error occurred: ", i);
        this.receivedCameraError = true;
        if (i == 2) {
            C74863dy c74863dy = this.cameraEventsDispatcher;
            Iterator it = c74863dy.A00.iterator();
            while (it.hasNext()) {
                ((InterfaceC50852Tl) it.next()).AK6(c74863dy.A01);
            }
        } else if (i != 100) {
            this.cameraEventsDispatcher.A00();
        } else {
            C74863dy c74863dy2 = this.cameraEventsDispatcher;
            Iterator it2 = c74863dy2.A00.iterator();
            while (it2.hasNext()) {
                ((InterfaceC50852Tl) it2.next()).AOX(c74863dy2.A01);
            }
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void onFrameAvailableOnCameraThread() {
        C000700j.A08(this.videoPort != null, "videoport should not be null while receiving frames");
        C74413dE c74413dE = this.textureHolder;
        if (c74413dE != null) {
            VideoPort videoPort = this.videoPort;
            C50912Ts c50912Ts = this.cameraInfo;
            videoPort.renderTexture(c74413dE, c50912Ts.A05, c50912Ts.A02);
        }
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        byte[] bArr2;
        if (camera == null || bArr == null) {
            return;
        }
        Camera camera2 = this.camera;
        if (camera != camera2) {
            StringBuilder A0P = C000200d.A0P("Unexpected camera in callback! current camera = ");
            A0P.append(camera2);
            A0P.append(", callback camera is ");
            A0P.append(camera);
            Log.w(A0P.toString());
            return;
        }
        updateCameraCallbackCheck();
        if (this.isRunning) {
            if (this.passiveMode) {
                synchronized (this.frameLock) {
                    bArr2 = this.lastCachedFrameData;
                    this.lastCachedFrameData = bArr;
                    this.newFrameAvailable = true;
                }
                bArr = bArr2;
            } else {
                for (Map.Entry entry : this.virtualCameras.entrySet()) {
                    if (((VoipCamera) entry.getValue()).started) {
                        ((VoipCamera) entry.getValue()).frameCallback(bArr, bArr.length);
                    }
                }
                this.lastCachedFrameData = bArr;
            }
        }
        if (this.cameraStartMode == 0) {
            camera.addCallbackBuffer(bArr);
        }
    }

    private int preparePreviewOnCameraThread() {
        if (this.videoPort != null) {
            createTexture();
            try {
                C74413dE c74413dE = this.textureHolder;
                if (c74413dE != null) {
                    Camera camera = this.camera;
                    if (camera != null) {
                        camera.setPreviewTexture(c74413dE.A01);
                    } else {
                        throw null;
                    }
                } else {
                    Camera camera2 = this.camera;
                    if (camera2 == null) {
                        throw null;
                    }
                    camera2.setPreviewDisplay(this.videoPort.getSurfaceHolder());
                }
                this.videoPort.setScaleType(0);
                return 0;
            } catch (IOException e) {
                Log.e(e);
                return -2;
            }
        }
        throw null;
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int setVideoPortOnCameraThread(VideoPort videoPort) {
        int i;
        int i2;
        VideoPort videoPort2 = this.videoPort;
        int i3 = 0;
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
        A0P.append(", running: ");
        C000200d.A1V(A0P, this.isRunning);
        if (!this.isRunning) {
            this.videoPort = videoPort;
            if (videoPort != null && (i3 = startOnCameraThread()) != 0) {
                stopOnCameraThread();
                this.videoPort = videoPort2;
            }
            return i3;
        } else if (videoPort != null) {
            stopPreviewOnCameraThread(true);
            this.videoPort = videoPort;
            if (preparePreviewOnCameraThread() != 0) {
                stopOnCameraThread();
                this.videoPort = videoPort2;
                return -7;
            }
            Camera camera = this.camera;
            if (camera != null) {
                camera.setPreviewCallback(this);
                int updatePreviewOrientationOnCameraThread = updatePreviewOrientationOnCameraThread(this);
                this.camera.startPreview();
                return updatePreviewOrientationOnCameraThread;
            }
            throw null;
        } else {
            int stopOnCameraThread = stopOnCameraThread();
            this.videoPort = null;
            return stopOnCameraThread;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int startOnCameraThread() {
        List<int[]> supportedPreviewFpsRange;
        if (this.isRunning) {
            return 0;
        }
        StringBuilder A0P = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread. ENTER. videoPort = ");
        A0P.append(this.videoPort);
        A0P.append(" at start mode: ");
        C000200d.A1F(A0P, this.cameraStartMode);
        if (this.camera == null) {
            try {
                Camera open = Camera.open(this.camIdx);
                this.camera = open;
                if (open == null) {
                    Log.e("camera is null after open");
                    return -5;
                }
                open.setErrorCallback(new Camera.ErrorCallback() { // from class: X.3ee
                    @Override // android.hardware.Camera.ErrorCallback
                    public final void onError(int i, Camera camera) {
                        PjCamera.this.lambda$startOnCameraThread$2896$PjCamera(i, camera);
                    }
                });
            } catch (Exception e) {
                Log.e(e);
                return -4;
            }
        }
        if (this.videoPort == null) {
            return 0;
        }
        if (preparePreviewOnCameraThread() != 0) {
            return -2;
        }
        try {
            Camera.Parameters parameters = this.camera.getParameters();
            C50912Ts c50912Ts = this.cameraInfo;
            parameters.setPreviewSize(c50912Ts.A05, c50912Ts.A02);
            parameters.setPreviewFormat(this.cameraInfo.A00);
            StringBuilder sb = new StringBuilder("voip/video/VoipCamera/startOnCameraThread setting camera params at start mode: ");
            sb.append(this.cameraStartMode);
            sb.append(" width: ");
            C50912Ts c50912Ts2 = this.cameraInfo;
            sb.append(c50912Ts2.A05);
            sb.append(" height: ");
            sb.append(c50912Ts2.A02);
            sb.append(" format: ");
            C000200d.A1F(sb, c50912Ts2.A00);
            int i = 2;
            if (this.cameraStartMode > 2) {
                this.cameraStartMode = 2;
            }
            if (this.cameraStartMode != 2 && (supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange()) != null) {
                int[] iArr = null;
                int i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                for (int[] iArr2 : supportedPreviewFpsRange) {
                    if (iArr2.length == 2) {
                        int i3 = iArr2[0];
                        int i4 = iArr2[1];
                        int fpsRangeScore = VoipPhysicalCamera.fpsRangeScore(i3, i4, this.cameraInfo.A01);
                        StringBuilder A0P2 = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread check fps [");
                        A0P2.append(i3);
                        A0P2.append(", ");
                        A0P2.append(i4);
                        A0P2.append("], score: ");
                        A0P2.append(fpsRangeScore);
                        Log.i(A0P2.toString());
                        if (fpsRangeScore > i2) {
                            iArr = iArr2;
                            i2 = fpsRangeScore;
                        }
                    }
                }
                if (iArr != null) {
                    StringBuilder A0P3 = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread with fps range [");
                    A0P3.append(iArr[0]);
                    A0P3.append(", ");
                    C000200d.A1H(A0P3, iArr[1], "], score: ", i2, ", supported ranges : ");
                    A0P3.append(parameters.get("preview-fps-range-values"));
                    Log.i(A0P3.toString());
                    parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                }
            }
            if (this.cameraStartMode == 0) {
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes != null) {
                    if (supportedFocusModes.contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    } else if (supportedFocusModes.contains("infinity")) {
                        parameters.setFocusMode("infinity");
                    }
                }
                List<String> supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes != null && parameters.getFlashMode() != null && supportedFlashModes.contains("off")) {
                    parameters.setFlashMode("off");
                }
                if (parameters.isAutoExposureLockSupported()) {
                    parameters.setAutoExposureLock(false);
                }
                if (parameters.isAutoWhiteBalanceLockSupported()) {
                    parameters.setAutoWhiteBalanceLock(false);
                }
                StringBuilder A0P4 = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread with scene mode: ");
                A0P4.append(parameters.getSceneMode());
                A0P4.append(", supported scene mode: [");
                A0P4.append(parameters.get("scene-mode-values"));
                A0P4.append("]");
                A0P4.append(", focus mode: ");
                A0P4.append(parameters.getFocusMode());
                A0P4.append(", supported focus mode: [");
                A0P4.append(parameters.get("focus-mode-values"));
                A0P4.append("]");
                A0P4.append(", flash mode: ");
                A0P4.append(parameters.getFlashMode());
                A0P4.append(", supported flash mode: [");
                A0P4.append(parameters.get("flash-mode-values"));
                A0P4.append("]");
                A0P4.append(", white balance: ");
                A0P4.append(parameters.getWhiteBalance());
                A0P4.append(", supported white balance: [");
                A0P4.append(parameters.get("whitebalance-values"));
                A0P4.append("], white balance lock: ");
                A0P4.append(parameters.getAutoWhiteBalanceLock());
                A0P4.append(", exposure: ");
                A0P4.append(parameters.getExposureCompensation());
                A0P4.append(", supported exposure range: [");
                A0P4.append(parameters.getMinExposureCompensation());
                A0P4.append(parameters.getMaxExposureCompensation());
                A0P4.append("], ");
                A0P4.append(", exposure lock: ");
                A0P4.append(parameters.getAutoExposureLock());
                Log.i(A0P4.toString());
            }
            try {
                this.camera.setParameters(parameters);
                this.isRunning = true;
                this.receivedCameraError = false;
                if (this.cameraStartMode == 0) {
                    C50912Ts c50912Ts3 = this.cameraInfo;
                    int previewSizeForFormat = getPreviewSizeForFormat(c50912Ts3.A05, c50912Ts3.A02, c50912Ts3.A00);
                    try {
                        this.camera.addCallbackBuffer(new byte[previewSizeForFormat]);
                        if (this.passiveMode) {
                            this.lastCachedFrameData = new byte[previewSizeForFormat];
                        } else {
                            i = 1;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/video/VoipCamera/startOnCameraThread. added ");
                        sb2.append(i);
                        sb2.append(" buffers of ");
                        sb2.append(previewSizeForFormat);
                        Log.i(sb2.toString());
                        this.camera.setPreviewCallbackWithBuffer(this);
                    } catch (OutOfMemoryError e2) {
                        StringBuilder A0P5 = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread. OOM when adding callback buffers at start mode: ");
                        A0P5.append(this.cameraStartMode);
                        A0P5.append(": ");
                        Log.e(A0P5.toString(), e2);
                        return tryNextStartModeOnCameraThread();
                    }
                } else {
                    C000200d.A1F(C000200d.A0P("voip/video/VoipCamera/startOnCameraThread not adding callback buffers at start mode: "), this.cameraStartMode);
                    this.camera.setPreviewCallback(this);
                }
                updatePreviewOrientationOnCameraThread(this);
                try {
                    this.camera.startPreview();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("voip/video/VoipCamera/startOnCameraThread success EXIT at attempt: ");
                    sb3.append(this.cameraStartMode);
                    Log.i(sb3.toString());
                    startPeriodicCameraCallbackCheck();
                    return 0;
                } catch (Exception e3) {
                    StringBuilder A0P6 = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread/startPreview threw at attempt: ");
                    A0P6.append(this.cameraStartMode);
                    A0P6.append(": ");
                    Log.e(A0P6.toString(), e3);
                    return tryNextStartModeOnCameraThread();
                }
            } catch (RuntimeException e4) {
                StringBuilder A0P7 = C000200d.A0P("voip/video/VoipCamera/startOnCameraThread/setParameters threw at attempt: ");
                A0P7.append(this.cameraStartMode);
                A0P7.append(": ");
                Log.e(A0P7.toString(), e4);
                C74863dy c74863dy = this.cameraEventsDispatcher;
                int i5 = this.camIdx;
                Iterator it = c74863dy.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC50852Tl) it.next()).AIB(c74863dy.A01, i5);
                }
                return -3;
            }
        } catch (RuntimeException e5) {
            Log.e("voip/video/VoipCamera/startOnCameraThread camera getParameters threw", e5);
            return -9;
        }
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public int stopOnCameraThread() {
        boolean z = this.isRunning;
        this.isRunning = false;
        stopPeriodicCameraCallbackCheck();
        if (this.camera == null) {
            return -6;
        }
        Log.i("voip/video/VoipCamera/stopOnCameraThread");
        stopPreviewOnCameraThread(z);
        this.camera.release();
        this.camera = null;
        return 0;
    }

    private void stopPreviewOnCameraThread(boolean z) {
        if (z && !this.receivedCameraError) {
            try {
                Camera camera = this.camera;
                if (camera != null) {
                    camera.setPreviewCallbackWithBuffer(null);
                    this.camera.stopPreview();
                } else {
                    throw null;
                }
            } catch (RuntimeException e) {
                Log.e("voip/video/VoipCamera/stopPreviewOnCameraThread exception while calling stopPreview", e);
            }
        }
        releaseTexture();
    }

    private synchronized int tryNextStartModeOnCameraThread() {
        this.isRunning = false;
        this.cameraStartMode++;
        stopOnCameraThread();
        if (this.passiveMode || this.cameraStartMode > 2) {
            return -8;
        }
        return startOnCameraThread();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1.getRotation() == 2) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateAdjustedPreviewSizeOnCameraThread(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "window"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L40
            android.view.Display r1 = r0.getDefaultDisplay()
            X.2Ts r0 = r5.cameraInfo
            int r0 = r0.A04
            int r0 = r0 % 180
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L19
            r3 = 1
        L19:
            int r0 = r1.getRotation()
            if (r0 == 0) goto L27
            int r2 = r1.getRotation()
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L28
        L27:
            r0 = 1
        L28:
            if (r3 == r0) goto L2b
            r4 = 0
        L2b:
            X.2Ts r0 = r5.cameraInfo
            if (r4 == 0) goto L3b
            int r2 = r0.A05
            int r1 = r0.A02
        L33:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
            r5.adjustedPreviewSize = r0
            return
        L3b:
            int r2 = r0.A02
            int r1 = r0.A05
            goto L33
        L40:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updateAdjustedPreviewSizeOnCameraThread(android.content.Context):void");
    }

    @Override // com.whatsapp.voipcalling.camera.VoipPhysicalCamera
    public void updatePreviewOrientation() {
        Log.i("voip/video/VoipCamera/updateCameraPreviewOrientation Enter");
        C000200d.A0q("voip/video/VoipCamera/updateCameraPreviewOrientation Exit with ", ((Number) syncRunOnCameraThread(new Callable() { // from class: X.3ed
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(PjCamera.updatePreviewOrientationOnCameraThread(PjCamera.this));
            }
        }, -100)).intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:7|(8:9|(2:11|(1:13)(1:31))(1:32)|15|(1:17)(1:30)|18|19|20|(3:22|23|24)(2:26|27))|33|15|(0)(0)|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r1 != 3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: Exception -> 0x0081, TryCatch #0 {Exception -> 0x0081, blocks: (B:24:0x0077, B:26:0x007b, B:28:0x0080), top: B:37:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int updatePreviewOrientationOnCameraThread(org.pjsip.PjCamera r8) {
        /*
            com.whatsapp.voipcalling.VideoPort r1 = r8.videoPort
            if (r1 == 0) goto L8b
            boolean r0 = r8.isRunning
            if (r0 == 0) goto L8b
            android.content.Context r3 = r1.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 == 0) goto L89
            android.view.Display r0 = r0.getDefaultDisplay()
            int r1 = r0.getRotation()
            r7 = 0
            if (r1 == 0) goto L2c
            r0 = 1
            if (r1 == r0) goto L74
            r0 = 2
            if (r1 == r0) goto L71
            r0 = 3
            r4 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L2d
        L2c:
            r4 = 0
        L2d:
            X.2Ts r0 = r8.cameraInfo
            boolean r6 = r0.A06
            int r5 = r0.A04
            if (r6 == 0) goto L6a
            int r0 = r5 + r4
            int r0 = r0 % 360
            int r0 = 360 - r0
            int r2 = r0 % 360
        L3d:
            java.lang.String r1 = "voip/video/VoipCamera/updatePreviewOrientationOnCameraThread to "
            java.lang.String r0 = " degree. Camera #"
            java.lang.StringBuilder r1 = X.C000200d.A0Q(r1, r2, r0)
            int r0 = r8.camIdx
            r1.append(r0)
            java.lang.String r0 = ", facing front: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", camera orientation: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", activity rotation: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            goto L77
        L6a:
            int r0 = r5 - r4
            int r0 = r0 + 360
            int r2 = r0 % 360
            goto L3d
        L71:
            r4 = 180(0xb4, float:2.52E-43)
            goto L2d
        L74:
            r4 = 90
            goto L2d
        L77:
            android.hardware.Camera r0 = r8.camera     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L7f
            r0.setDisplayOrientation(r2)     // Catch: java.lang.Exception -> L81
            goto L85
        L7f:
            r0 = 0
            throw r0     // Catch: java.lang.Exception -> L81
        L81:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
        L85:
            r8.updateAdjustedPreviewSizeOnCameraThread(r3)
            return r7
        L89:
            r0 = 0
            throw r0
        L8b:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCamera.updatePreviewOrientationOnCameraThread(org.pjsip.PjCamera):int");
    }
}
