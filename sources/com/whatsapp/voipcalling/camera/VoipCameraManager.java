package com.whatsapp.voipcalling.camera;

import X.C000200d;
import X.C000700j;
import X.C001200o;
import X.C0EW;
import X.C50832Tj;
import X.C50862Tm;
import X.C50882Tp;
import X.C50902Tr;
import X.C50912Ts;
import X.C50922Tw;
import X.InterfaceC50852Tl;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.pjsip.PjCamera;
import org.pjsip.PjCameraInfo;

/* loaded from: classes2.dex */
public final class VoipCameraManager {
    public static volatile VoipCameraManager INSTANCE;
    public volatile int currentApiVersion;
    public volatile VoipPhysicalCamera currentCamera;
    public volatile Point lastAdjustedCameraPreviewSize;
    public final C0EW voipSharedPreferences;
    public final C001200o waContext;
    public final SparseArray rawCameraInfoCache = new SparseArray();
    public final InterfaceC50852Tl cameraEventsListener = new C50832Tj(this);

    public VoipCameraManager(C001200o c001200o, C0EW c0ew) {
        this.currentApiVersion = 1;
        this.waContext = c001200o;
        this.voipSharedPreferences = c0ew;
        String A05 = c0ew.A05();
        if (Build.VERSION.SDK_INT < 21 || TextUtils.isEmpty(A05) || !C50862Tm.A00(A05, getCachedCam2HardwareLevel())) {
            return;
        }
        this.currentApiVersion = 2;
    }

    public void addCameraErrorListener(InterfaceC50852Tl interfaceC50852Tl) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.addCameraEventsListener(interfaceC50852Tl);
        }
    }

    public static void clearStoredRawCameraInfo(VoipCameraManager voipCameraManager, int i, int i2) {
        voipCameraManager.voipSharedPreferences.A03().remove(C0EW.A01(i, i2)).apply();
    }

    public static synchronized void closeCurrentCamera(VoipCameraManager voipCameraManager, VoipPhysicalCamera voipPhysicalCamera) {
        synchronized (voipCameraManager) {
            VoipPhysicalCamera voipPhysicalCamera2 = voipCameraManager.currentCamera;
            C000700j.A08(voipPhysicalCamera2 == voipPhysicalCamera, "attempted to close orphaned camera");
            if (voipPhysicalCamera2 != null && voipPhysicalCamera2 != voipPhysicalCamera) {
                voipPhysicalCamera2.removeCameraEventsListener(voipCameraManager.cameraEventsListener);
                voipPhysicalCamera2.close(true);
            }
            voipPhysicalCamera.removeCameraEventsListener(voipCameraManager.cameraEventsListener);
            voipCameraManager.lastAdjustedCameraPreviewSize = voipPhysicalCamera.getAdjustedPreviewSize();
            voipCameraManager.currentCamera = null;
        }
    }

    public synchronized VoipCamera createCamera(int i, int i2, int i3, int i4, int i5, long j) {
        VoipPhysicalCamera c50862Tm;
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        VoipPhysicalCamera voipPhysicalCamera2 = null;
        if (voipPhysicalCamera != null) {
            C50912Ts cameraInfo = voipPhysicalCamera.getCameraInfo();
            int i6 = cameraInfo.A05;
            if (i6 == i2 && cameraInfo.A02 == i3 && cameraInfo.A00 == i4 && cameraInfo.A03 == i) {
                return new VoipCamera(voipPhysicalCamera, j);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("voip/VoipCameraManager/createCamera camera info doesn't match. Current cam: w/h: ");
            sb.append(i6);
            sb.append("/");
            sb.append(cameraInfo.A02);
            sb.append(", format: ");
            sb.append(cameraInfo.A00);
            sb.append(", idx: ");
            sb.append(cameraInfo.A03);
            sb.append(". New cam: w/h: ");
            sb.append(i2);
            sb.append("/");
            sb.append(i3);
            sb.append(", format: ");
            sb.append(i4);
            sb.append(", idx: ");
            sb.append(i);
            Log.e(sb.toString());
            return null;
        }
        try {
            C50882Tp rawCameraInfo = getRawCameraInfo(i);
            if (rawCameraInfo != null) {
                if (rawCameraInfo.A00 == 1) {
                    c50862Tm = new PjCamera(i, i2, i3, i4, i5, j);
                    c50862Tm.passiveMode = this.voipSharedPreferences.A04().getBoolean("force_passive_capture_dev_stream_role", false);
                } else {
                    c50862Tm = new C50862Tm(this.waContext, i, i2, i3, i4, i5);
                    c50862Tm.passiveMode = false;
                }
                c50862Tm.addCameraEventsListener(this.cameraEventsListener);
                voipPhysicalCamera2 = c50862Tm;
            } else {
                Log.e("voip/VoipCameraManager/createCamera couldn't get camera info");
            }
            this.currentCamera = voipPhysicalCamera2;
            return new VoipCamera(this.currentCamera, j);
        } catch (RuntimeException e) {
            Log.e("voip/VoipCameraManager/createCamera error while starting camera", e);
            return null;
        }
    }

    public Point getAdjustedCameraPreviewSize() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getAdjustedPreviewSize();
        }
        return null;
    }

    public int getCachedCam2HardwareLevel() {
        int i = -1;
        int i2 = this.voipSharedPreferences.A04().getInt("lowest_camera_hardware_support_level", -1);
        if (i2 == -1) {
            CameraManager cameraManager = (CameraManager) this.waContext.A00.getSystemService("camera");
            if (cameraManager == null) {
                Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel CameraManager is null");
            } else {
                int[] iArr = C50862Tm.A0G;
                int length = iArr.length;
                try {
                    if (cameraManager.getCameraIdList().length > 0) {
                        for (String str : cameraManager.getCameraIdList()) {
                            Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                            if (num != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    } else if (num.intValue() == iArr[i3]) {
                                        length = i3;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (length < length) {
                        i = iArr[length];
                    }
                } catch (AssertionError e) {
                    Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e);
                } catch (Exception e2) {
                    Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e2);
                }
            }
            C000200d.A0n(this.voipSharedPreferences, "lowest_camera_hardware_support_level", i);
            i2 = i;
        }
        C000200d.A0q("voip/VoipCameraManager/getCachedCam2HardwareLevel got:", i2);
        return i2;
    }

    public synchronized int getCameraCount() {
        if (this.currentApiVersion == 1) {
            return Camera.getNumberOfCameras();
        } else if (Build.VERSION.SDK_INT < 21 || this.currentApiVersion != 2) {
            return 0;
        } else {
            CameraManager cameraManager = (CameraManager) this.waContext.A00.getSystemService("camera");
            if (cameraManager == null) {
                Log.w("voip/VoipCameraManager/getCameraCount, unable to acquire camera manager");
                return 0;
            }
            try {
                return cameraManager.getCameraIdList().length;
            } catch (Exception unused) {
                Log.w("voip/VoipCameraManager/getCameraCount, unable to connect to cameras!");
                return 0;
            }
        }
    }

    public synchronized PjCameraInfo getCameraInfo(int i) {
        if (i >= 0) {
            if (i < getCameraCount()) {
                C50882Tp rawCameraInfo = getRawCameraInfo(i);
                if (rawCameraInfo == null) {
                    return null;
                }
                PjCameraInfo createFromRawInfo = PjCameraInfo.createFromRawInfo(rawCameraInfo, this.voipSharedPreferences);
                StringBuilder sb = new StringBuilder();
                sb.append("voip/VoipCameraManager/getCameraInfo camera ");
                sb.append(i);
                sb.append(" info: ");
                sb.append(createFromRawInfo);
                Log.i(sb.toString());
                return createFromRawInfo;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("voip/VoipCameraManager/getCameraInfo bad idx: ");
        sb2.append(i);
        Log.e(sb2.toString());
        return null;
    }

    private int getCameraInfoCacheKey(int i, int i2) {
        int i3 = i + i2;
        return (((i3 + 1) * i3) >> 1) + i2;
    }

    public int getCameraStartMode() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getCameraStartMode();
        }
        return -1;
    }

    public int getCurrentApiVersion() {
        return this.currentApiVersion;
    }

    public static VoipCameraManager getInstance() {
        if (INSTANCE == null) {
            synchronized (VoipCameraManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new VoipCameraManager(C001200o.A01, C0EW.A00());
                }
            }
        }
        return INSTANCE;
    }

    public Point getLastAdjustedCameraPreviewSize() {
        return this.lastAdjustedCameraPreviewSize;
    }

    public C50922Tw getLastCachedFrame() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getLastCachedFrame();
        }
        return null;
    }

    public synchronized C50882Tp getRawCameraInfo(int i) {
        C50882Tp c50882Tp;
        JSONObject jSONObject;
        int i2;
        C50902Tr c50902Tr;
        ArrayList arrayList;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        StringBuilder sb = new StringBuilder();
        sb.append("voip/VoipCameraManager/getRawCameraInfo camera: ");
        sb.append(i);
        sb.append(" enabled camera version: ");
        sb.append(this.currentApiVersion);
        Log.i(sb.toString());
        SparseArray sparseArray = this.rawCameraInfoCache;
        int i3 = this.currentApiVersion;
        int i4 = i + i3;
        c50882Tp = (C50882Tp) sparseArray.get((((i4 + 1) * i4) >> 1) + i3);
        if (c50882Tp == null) {
            C0EW c0ew = this.voipSharedPreferences;
            int i5 = this.currentApiVersion;
            SharedPreferences A04 = c0ew.A04();
            String A01 = C0EW.A01(i, i5);
            String str = null;
            String string = A04.getString(A01, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("voip/VoipCameraManager/getRawCameraInfo, stored info for camera ");
            sb2.append(i);
            sb2.append(": ");
            sb2.append(string);
            Log.i(sb2.toString());
            if (!TextUtils.isEmpty(string)) {
                try {
                    jSONObject = new JSONObject(string);
                    i2 = jSONObject.getInt("version");
                } catch (JSONException e) {
                    Log.e(e);
                }
                if (i2 != 1) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("voip/RawCameraInfo/createFromJson, skip mismatched json version ");
                    sb3.append(i2);
                    sb3.append(", required ");
                    sb3.append(1);
                    Log.i(sb3.toString());
                } else {
                    int i6 = jSONObject.getInt("apiVersion");
                    if (i6 != 1 && i6 != 2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("voip/RawCameraInfo/createFromJson, skip unsupported api version ");
                        sb4.append(i6);
                        Log.i(sb4.toString());
                    } else {
                        boolean z = jSONObject.getBoolean("isFrontCamera");
                        int i7 = jSONObject.getInt("orientation");
                        JSONArray jSONArray4 = jSONObject.getJSONArray("supportFormats");
                        if (jSONArray4 == null) {
                            Log.e("voip/RawCameraInfo/createFromJson, cannot find formats");
                        } else {
                            int[] iArr = new int[jSONArray4.length()];
                            for (int i8 = 0; i8 < jSONArray4.length(); i8++) {
                                iArr[i8] = jSONArray4.getInt(i8);
                            }
                            if (jSONObject.has("preferredSize") && (jSONArray = jSONObject.getJSONArray("preferredSize")) != null) {
                                if (jSONArray.length() != 2) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("voip/RawCameraInfo createFromJson bad preferred size ");
                                    sb5.append(jSONArray);
                                    Log.e(sb5.toString());
                                } else {
                                    c50902Tr = new C50902Tr(jSONArray.getInt(0), jSONArray.getInt(1));
                                }
                            } else {
                                c50902Tr = null;
                            }
                            if (jSONObject.has("previewSizes")) {
                                JSONArray jSONArray5 = jSONObject.getJSONArray("previewSizes");
                                if (jSONArray5 == null) {
                                    arrayList = null;
                                } else {
                                    int length = jSONArray5.length();
                                    if (length % 2 == 0) {
                                        arrayList = new ArrayList(length / 2);
                                        for (int i9 = 0; i9 < length; i9 += 2) {
                                            arrayList.add(new C50902Tr(jSONArray5.getInt(i9), jSONArray5.getInt(i9 + 1)));
                                        }
                                    } else {
                                        throw new JSONException("length is not even");
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            c50882Tp = new C50882Tp(i6, z, i7, iArr, c50902Tr, arrayList);
                            if (!isRawCameraInfoValid(i, c50882Tp)) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("voip/VoipCameraManager/getRawCameraInfo, stored raw info is outdated ");
                                sb6.append(c50882Tp);
                                Log.w(sb6.toString());
                                clearStoredRawCameraInfo(this, i, c50882Tp.A00);
                            }
                            SparseArray sparseArray2 = this.rawCameraInfoCache;
                            int i10 = this.currentApiVersion;
                            int i11 = i + i10;
                            sparseArray2.put((((i11 + 1) * i11) >> 1) + i10, c50882Tp);
                        }
                    }
                }
            }
            c50882Tp = loadFromCameraService(i);
            if (c50882Tp != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("version", 1);
                    jSONObject2.put("apiVersion", c50882Tp.A00);
                    jSONObject2.put("isFrontCamera", c50882Tp.A04);
                    jSONObject2.put("orientation", c50882Tp.A01);
                    JSONArray jSONArray6 = new JSONArray();
                    for (int i12 : c50882Tp.A05) {
                        jSONArray6.put(i12);
                    }
                    jSONObject2.put("supportFormats", jSONArray6);
                    C50902Tr c50902Tr2 = c50882Tp.A02;
                    if (c50902Tr2 != null) {
                        jSONArray2 = new JSONArray();
                        jSONArray2.put(c50902Tr2.A01);
                        jSONArray2.put(c50902Tr2.A00);
                    } else {
                        jSONArray2 = null;
                    }
                    jSONObject2.put("preferredSize", jSONArray2);
                    List<C50902Tr> list = c50882Tp.A03;
                    if (list != null) {
                        jSONArray3 = new JSONArray();
                        for (C50902Tr c50902Tr3 : list) {
                            jSONArray3.put(c50902Tr3.A01);
                            jSONArray3.put(c50902Tr3.A00);
                        }
                    } else {
                        jSONArray3 = null;
                    }
                    jSONObject2.put("previewSizes", jSONArray3);
                    str = jSONObject2.toString();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                if (!TextUtils.isEmpty(str)) {
                    this.voipSharedPreferences.A03().putString(C0EW.A01(i, c50882Tp.A00), str).apply();
                }
            } else {
                clearStoredRawCameraInfo(this, i, this.currentApiVersion);
            }
            SparseArray sparseArray22 = this.rawCameraInfoCache;
            int i102 = this.currentApiVersion;
            int i112 = i + i102;
            sparseArray22.put((((i112 + 1) * i112) >> 1) + i102, c50882Tp);
        }
        return c50882Tp;
    }

    public boolean isCameraTextureApiFailed() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        return voipPhysicalCamera != null && voipPhysicalCamera.textureApiFailed;
    }

    private boolean isRawCameraInfoValid(int i, C50882Tp c50882Tp) {
        int i2 = c50882Tp.A00;
        if (i2 == 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                return cameraInfo.orientation == c50882Tp.A01 && cameraInfo.facing == c50882Tp.A04;
            } catch (RuntimeException e) {
                Log.e(e);
                return false;
            }
        }
        if (i2 == 2) {
            try {
                CameraManager cameraManager = (CameraManager) this.waContext.A00.getSystemService("camera");
                if (cameraManager != null) {
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(Integer.toString(i));
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num != null && num2 != null) {
                        if (c50882Tp.A01 == num.intValue()) {
                            return c50882Tp.A04 == (num2.intValue() == 0);
                        }
                        return false;
                    }
                    Log.w("voip/VoipCameraManager/isRawCameraInfoValid metadata returned null values, invalidating cache");
                    return false;
                }
            } catch (Exception e2) {
                Log.w("voip/VoipCameraManager/isRawCameraInfoValid, camera is unavailable, invalidating info", e2);
            }
        }
        return false;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: ConstInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: -1
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4586)
        	at jadx.core.dex.visitors.ConstInlineVisitor.needExplicitCast(ConstInlineVisitor.java:282)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:263)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:181)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:109)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:53)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:45)
        */
    private X.C50882Tp loadFromCameraService(int r19) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.loadFromCameraService(int):X.2Tp");
    }

    public void removeCameraErrorListener(InterfaceC50852Tl interfaceC50852Tl) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.removeCameraEventsListener(interfaceC50852Tl);
        }
    }

    public void setRequestedCamera2SupportLevel(String str) {
        int i = this.currentApiVersion;
        if (Build.VERSION.SDK_INT < 21) {
            this.currentApiVersion = 1;
        } else if (str == null) {
            this.currentApiVersion = 1;
        } else {
            this.currentApiVersion = C50862Tm.A00(str, getCachedCam2HardwareLevel()) ? 2 : 1;
        }
        if (i != this.currentApiVersion) {
            Voip.refreshVideoDevice();
        }
    }

    public void updateCameraPreviewOrientation() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.updatePreviewOrientation();
        }
    }
}
