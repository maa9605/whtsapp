package com.whatsapp.voipcalling.camera;

import X.C000200d;
import X.C000700j;
import X.C50912Ts;
import X.C50922Tw;
import X.C74413dE;
import X.C74863dy;
import X.InterfaceC50852Tl;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* loaded from: classes2.dex */
public abstract class VoipPhysicalCamera {
    public static final int CAMERA_MODE_CONSERVATIVE = 1;
    public static final int CAMERA_MODE_DEFAULT = 0;
    public static final int CAMERA_MODE_NO_FPS_RANGE = 2;
    public static final int ERROR_EXCEPTION_IN_CAMERA = -9;
    public static final int ERROR_INVALID_STATE = -1;
    public static final int ERROR_NO_CAMERA_AFTER_OPEN = -5;
    public static final int ERROR_NO_CAMERA_IN_STOP = -6;
    public static final int ERROR_OPEN_CAMERA = -4;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_SETUP_PREVIEW = -2;
    public static final int ERROR_SET_PARAMETERS = -3;
    public static final int ERROR_START_FINAL_FAILED = -8;
    public static final int ERROR_SWITCH_SURFACE_VIEW = -7;
    public static final int MESSAGE_LAST_CAMERA_CALLBACK_CHECK = 1;
    public static final int MESSAGE_ON_FRAME_AVAILABLE = 2;
    public static final int SUCCESS = 0;
    public static final String TAG = "voip/video/VoipCamera/";
    public long cameraCallbackCount;
    public HandlerThread cameraThread;
    public final Handler cameraThreadHandler;
    public long lastCameraCallbackTs;
    public boolean passiveMode;
    public volatile boolean textureApiFailed;
    public C74413dE textureHolder;
    public long totalElapsedCameraCallbackTime;
    public VideoPort videoPort;
    public final long thresholdRestartCameraMillis = 2000;
    public final C74863dy cameraEventsDispatcher = new C74863dy(this);
    public final Map virtualCameras = new HashMap();

    public abstract int closeOnCameraThread();

    public abstract Point getAdjustedPreviewSize();

    public abstract C50912Ts getCameraInfo();

    public abstract int getCameraStartMode();

    public abstract C50922Tw getLastCachedFrame();

    public abstract int getLatestFrame(ByteBuffer byteBuffer);

    public abstract void onFrameAvailableOnCameraThread();

    public abstract int setVideoPortOnCameraThread(VideoPort videoPort);

    public abstract int startOnCameraThread();

    public abstract int stopOnCameraThread();

    public abstract void updatePreviewOrientation();

    public VoipPhysicalCamera() {
        HandlerThread handlerThread = new HandlerThread() { // from class: X.3dw
            @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
            public void run() {
                Log.i("voip/video/VoipCamera/CameraThread Start");
                super.run();
                Log.i("voip/video/VoipCamera/CameraThread Exit");
            }
        };
        this.cameraThread = handlerThread;
        handlerThread.start();
        this.cameraThreadHandler = new Handler(this.cameraThread.getLooper()) { // from class: X.3dx
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        VoipPhysicalCamera.this.onFrameAvailableOnCameraThread();
                        return;
                    }
                    return;
                }
                VoipPhysicalCamera voipPhysicalCamera = VoipPhysicalCamera.this;
                C000700j.A08(voipPhysicalCamera.lastCameraCallbackTs > 0, "last camera callback ts should not be 0");
                long elapsedRealtime = SystemClock.elapsedRealtime() - voipPhysicalCamera.lastCameraCallbackTs;
                if (elapsedRealtime > 2000) {
                    Log.e(String.format(Locale.getDefault(), "%dms since last callback, will try restarting camera.", Long.valueOf(elapsedRealtime)));
                    voipPhysicalCamera.stopOnCameraThread();
                    if (voipPhysicalCamera.startOnCameraThread() != 0) {
                        voipPhysicalCamera.stopOnCameraThread();
                    }
                }
                voipPhysicalCamera.startPeriodicCameraCallbackCheck();
            }
        };
    }

    public final void addCameraEventsListener(InterfaceC50852Tl interfaceC50852Tl) {
        C74863dy c74863dy = this.cameraEventsDispatcher;
        synchronized (c74863dy) {
            c74863dy.A00.add(interfaceC50852Tl);
        }
    }

    private void clearFrameAvailableMessages() {
        this.cameraThreadHandler.removeMessages(2);
    }

    public final synchronized void close(final boolean z) {
        HandlerThread handlerThread;
        Log.i("voip/video/VoipCamera/close Enter");
        if (((Boolean) syncRunOnCameraThread(new Callable() { // from class: X.3ds
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VoipPhysicalCamera.this.lambda$close$179$VoipPhysicalCamera(z);
            }
        }, Boolean.FALSE)).booleanValue() && (handlerThread = this.cameraThread) != null) {
            handlerThread.quit();
            this.cameraThread = null;
        }
        Log.i("voip/video/VoipCamera/close Exit");
    }

    public void createTexture() {
        C000700j.A08(this.videoPort != null, "videoport should not be null in createTexture");
        C74413dE c74413dE = this.textureHolder;
        if (c74413dE == null) {
            c74413dE = this.videoPort.createSurfaceTexture();
            this.textureHolder = c74413dE;
        }
        if (c74413dE == null) {
            Log.e("voip/video/VoipCamera/createSurfaceTexture failed to create SurfaceTexture");
            this.textureApiFailed = true;
            return;
        }
        c74413dE.A01.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: X.3dr
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                VoipPhysicalCamera.this.lambda$createTexture$182$VoipPhysicalCamera(surfaceTexture);
            }
        });
    }

    private Object exchange(Exchanger exchanger, Object obj) {
        try {
            return exchanger.exchange(obj);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int fpsRangeScore(int i, int i2, int i3) {
        return ((i <= 5000 ? -(5000 - i) : (-(i - 5000)) << 2) - Math.abs(i2 - i3)) / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    public final int getAverageCaptureFps() {
        long j = this.totalElapsedCameraCallbackTime;
        if (j <= 0) {
            return 0;
        }
        return (int) ((this.cameraCallbackCount * 1000) / j);
    }

    public final boolean isPassiveMode() {
        return this.passiveMode;
    }

    public boolean isTextureApiFailed() {
        return this.textureApiFailed;
    }

    public /* synthetic */ Boolean lambda$close$179$VoipPhysicalCamera(boolean z) {
        if (z) {
            this.virtualCameras.clear();
        }
        if (this.virtualCameras.size() == 0) {
            closeOnCameraThread();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public /* synthetic */ void lambda$createTexture$182$VoipPhysicalCamera(SurfaceTexture surfaceTexture) {
        notifyFrameAvailable();
    }

    public /* synthetic */ Integer lambda$registerVirtualCamera$180$VoipPhysicalCamera(VoipCamera voipCamera) {
        if (this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity))) {
            return 0;
        }
        this.virtualCameras.put(Long.valueOf(voipCamera.userIdentity), voipCamera);
        return 0;
    }

    public /* synthetic */ Integer lambda$setVideoPort$177$VoipPhysicalCamera(VideoPort videoPort) {
        return Integer.valueOf(setVideoPortOnCameraThread(videoPort));
    }

    public /* synthetic */ Integer lambda$stop$178$VoipPhysicalCamera() {
        Iterator it = this.virtualCameras.entrySet().iterator();
        boolean z = true;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((VoipCamera) ((Map.Entry) it.next()).getValue()).started) {
                z = false;
            }
        }
        return Integer.valueOf(z ? stopOnCameraThread() : 0);
    }

    public /* synthetic */ void lambda$syncRunOnCameraThread$176$VoipPhysicalCamera(Exchanger exchanger, Callable callable) {
        try {
            exchange(exchanger, callable.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public /* synthetic */ Integer lambda$unregisterVirtualCamera$181$VoipPhysicalCamera(VoipCamera voipCamera) {
        int i;
        if (this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity))) {
            this.virtualCameras.remove(Long.valueOf(voipCamera.userIdentity));
        }
        if (this.virtualCameras.size() == 0) {
            i = stopOnCameraThread();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    private void notifyFrameAvailable() {
        this.cameraThreadHandler.sendEmptyMessage(2);
    }

    public int registerVirtualCamera(final VoipCamera voipCamera) {
        StringBuilder A0P = C000200d.A0P("voip/video/VoipCamera/Add new virtual camera with user identity ");
        A0P.append(voipCamera.userIdentity);
        Log.i(A0P.toString());
        return ((Number) syncRunOnCameraThread(new Callable() { // from class: X.3dn
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VoipPhysicalCamera.this.lambda$registerVirtualCamera$180$VoipPhysicalCamera(voipCamera);
            }
        }, -1)).intValue();
    }

    public void releaseTexture() {
        if (this.textureHolder != null) {
            C000700j.A08(this.videoPort != null, "video port should not be null in releaseTexture");
            this.textureHolder.A01.setOnFrameAvailableListener(null);
            clearFrameAvailableMessages();
            this.videoPort.releaseSurfaceTexture(this.textureHolder);
            this.textureHolder = null;
        }
    }

    public final void removeCameraEventsListener(InterfaceC50852Tl interfaceC50852Tl) {
        C74863dy c74863dy = this.cameraEventsDispatcher;
        synchronized (c74863dy) {
            c74863dy.A00.remove(interfaceC50852Tl);
        }
    }

    public final void setPassiveMode(boolean z) {
        this.passiveMode = z;
    }

    public final synchronized int setVideoPort(final VideoPort videoPort) {
        int intValue;
        Log.i("voip/video/VoipCamera/setVideoPort Enter");
        intValue = ((Integer) syncRunOnCameraThread(new Callable() { // from class: X.3dq
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VoipPhysicalCamera.this.lambda$setVideoPort$177$VoipPhysicalCamera(videoPort);
            }
        }, -100)).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/setVideoPort Exit with ");
        sb.append(intValue);
        Log.i(sb.toString());
        return intValue;
    }

    public final synchronized int start() {
        int intValue;
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/start Enter in ");
        sb.append(this.passiveMode ? "passive " : "active ");
        sb.append("mode");
        Log.i(sb.toString());
        intValue = ((Integer) syncRunOnCameraThread(new Callable() { // from class: X.3dt
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(VoipPhysicalCamera.this.startOnCameraThread());
            }
        }, -100)).intValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/video/VoipCamera/start Exit with ");
        sb2.append(intValue);
        Log.i(sb2.toString());
        return intValue;
    }

    public final void startPeriodicCameraCallbackCheck() {
        stopPeriodicCameraCallbackCheck();
        this.cameraThreadHandler.sendEmptyMessageDelayed(1, 1000L);
    }

    public final synchronized void stop() {
        Log.i("voip/video/VoipCamera/stop Enter");
        int intValue = ((Integer) syncRunOnCameraThread(new Callable() { // from class: X.3do
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VoipPhysicalCamera.this.lambda$stop$178$VoipPhysicalCamera();
            }
        }, -100)).intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("voip/video/VoipCamera/stop Exit with ");
        sb.append(intValue);
        Log.i(sb.toString());
    }

    public final void stopPeriodicCameraCallbackCheck() {
        this.cameraThreadHandler.removeMessages(1);
        this.lastCameraCallbackTs = SystemClock.elapsedRealtime();
    }

    public final Object syncRunOnCameraThread(Callable callable, Object obj) {
        Exchanger exchanger = new Exchanger();
        return this.cameraThreadHandler.post(new RunnableEBaseShape1S0300000_I0_1(this, exchanger, callable, 3)) ? exchange(exchanger, null) : obj;
    }

    public int unregisterVirtualCamera(final VoipCamera voipCamera) {
        StringBuilder A0P = C000200d.A0P("voip/video/VoipCamera/Remove virtual camera with user identity ");
        A0P.append(voipCamera.userIdentity);
        Log.i(A0P.toString());
        return ((Number) syncRunOnCameraThread(new Callable() { // from class: X.3dp
            {
                VoipPhysicalCamera.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return VoipPhysicalCamera.this.lambda$unregisterVirtualCamera$181$VoipPhysicalCamera(voipCamera);
            }
        }, -1)).intValue();
    }

    public final void updateCameraCallbackCheck() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.totalElapsedCameraCallbackTime = (elapsedRealtime - this.lastCameraCallbackTs) + this.totalElapsedCameraCallbackTime;
        this.lastCameraCallbackTs = elapsedRealtime;
        this.cameraCallbackCount++;
    }
}
