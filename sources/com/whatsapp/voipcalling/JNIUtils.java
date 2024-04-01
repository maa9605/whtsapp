package com.whatsapp.voipcalling;

import X.AnonymousClass029;
import X.AnonymousClass072;
import X.C000500h;
import X.C001200o;
import X.C002801j;
import X.C003101m;
import X.C012005w;
import X.C01B;
import X.C01C;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C0EE;
import X.C0EW;
import X.C0JA;
import X.InterfaceC002901k;
import android.content.SharedPreferences;
import android.os.Build;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.io.File;
import java.util.Arrays;
import org.wawebrtc.MediaCodecVideoEncoder;

/* loaded from: classes2.dex */
public class JNIUtils {
    public static final String[] H264_BLACKLISTED_DEVICE_BOARD = {"sc7735s", "PXA19x8", "SC7727S", "sc7730s", "SC7715A", "full_oppo6750_15331", "mt6577", "hawaii", "java", "arima89_we_s_jb2", "arima82_w_s_kk", "capri", "mt6572", "P7-L10", "P7-L12"};
    public static final String[] H264_BLACKLISTED_DEVICE_HARDWARE = {"my70ds", "sc8830", "sc8830a", "samsungexynos7580"};
    public static volatile JNIUtils INSTANCE;
    public final C012005w fMessageIO;
    public final C02L meManager;
    public final C0EE multiDeviceConfig;
    public int previousAudioSessionId = -1;
    public final C01B serverProps;
    public final C02E systemServices;
    public final VoipCameraManager voipCameraManager;
    public final C0EW voipSharedPreferences;
    public final C001200o waContext;
    public final AnonymousClass072 waDebugBuildSharedPreferences;
    public final C02F waPermissionsHelper;
    public final C000500h waSharedPreferences;
    public final InterfaceC002901k waWorkers;

    private boolean isH265SwCodecSupported() {
        return false;
    }

    public int isAudioVideoSwitchEnabled() {
        return 1;
    }

    public void uploadCrashLog(String str) {
    }

    public JNIUtils(C02L c02l, C001200o c001200o, InterfaceC002901k interfaceC002901k, C012005w c012005w, C01B c01b, C02E c02e, C0EE c0ee, VoipCameraManager voipCameraManager, C02F c02f, C000500h c000500h, C0EW c0ew, AnonymousClass072 anonymousClass072) {
        this.meManager = c02l;
        this.waContext = c001200o;
        this.waWorkers = interfaceC002901k;
        this.fMessageIO = c012005w;
        this.serverProps = c01b;
        this.systemServices = c02e;
        this.multiDeviceConfig = c0ee;
        this.voipCameraManager = voipCameraManager;
        this.waPermissionsHelper = c02f;
        this.waSharedPreferences = c000500h;
        this.voipSharedPreferences = c0ew;
        this.waDebugBuildSharedPreferences = anonymousClass072;
    }

    public int allowAlternativeNetworkForAudioCall() {
        return (this.waSharedPreferences.A00.getBoolean("voip_low_data_usage", false) || this.waSharedPreferences.A00.getInt("autodownload_cellular_mask", 1) == 0) ? 0 : 1;
    }

    public int allowAlternativeNetworkForVideoCall() {
        return (this.waSharedPreferences.A00.getBoolean("voip_low_data_usage", false) || (this.waSharedPreferences.A00.getInt("autodownload_cellular_mask", 1) & 4) == 0) ? 0 : 1;
    }

    public synchronized int[] findAvailableAudioSamplingRate(int i) {
        return findAvailableAudioSamplingRate(new int[]{16000, 24000, 44100, 22050, 8000, 11025, 32000, 48000, 12000}, 2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x00cb, code lost:
        if (r32 > 64000) goto L160;
     */
    /* JADX WARN: Removed duplicated region for block: B:304:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0376 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x035b A[EDGE_INSN: B:352:0x035b->B:320:0x035b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] findAvailableAudioSamplingRate(int[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.JNIUtils.findAvailableAudioSamplingRate(int[], int, int):int[]");
    }

    public String getDebugDirectory() {
        this.fMessageIO.A04();
        return this.waContext.A00.getFilesDir().getAbsolutePath();
    }

    public boolean getDebugVoipRecordDecoderVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordEncoderVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordPreprocessedCaptureVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordRawCaptureVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public boolean getDebugVoipRecordRawRenderVideo() {
        if (this.waDebugBuildSharedPreferences != null) {
            return false;
        }
        throw null;
    }

    public static JNIUtils getInstance() {
        if (INSTANCE == null) {
            synchronized (JNIUtils.class) {
                if (INSTANCE == null) {
                    INSTANCE = new JNIUtils(C02L.A00(), C001200o.A01, C002801j.A00(), C012005w.A00(), C01B.A00(), C02E.A00(), C0EE.A00(), VoipCameraManager.getInstance(), C02F.A00(), C000500h.A00(), C0EW.A00(), AnonymousClass072.A00());
                }
            }
        }
        return INSTANCE;
    }

    public int getJoinableMilestoneVersion() {
        return this.serverProps.A07(C01C.A3E);
    }

    public static int getSamplingHash(int i, int[] iArr, int i2, int i3) {
        int length = iArr.length;
        int[] iArr2 = new int[length + 4];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i2;
        iArr2[length + 1] = i;
        iArr2[length + 2] = Build.VERSION.SDK_INT;
        iArr2[length + 3] = i3;
        return Arrays.hashCode(iArr2);
    }

    public String getSelfJid() {
        C02L c02l = this.meManager;
        c02l.A05();
        return C003101m.A07(c02l.A03);
    }

    public final String getTimeSeriesDirectory() {
        File A0O = AnonymousClass029.A0O(this.waContext.A00);
        if (A0O != null) {
            return A0O.getAbsolutePath();
        }
        Log.e("getTimeSeriesDirectory base time series directory is null");
        return "";
    }

    public final String getVoipCacheDirectory() {
        File cacheDir = this.waContext.A00.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, "voip");
            if (!file.exists() && !file.mkdirs()) {
                Log.e("getVoipCacheDirectory could not init directory");
                return "";
            }
            return file.getAbsolutePath();
        }
        Log.e("getVoipCacheDirectory Cache Directory is null");
        return "";
    }

    public VoipCameraManager getVoipCameraManager() {
        return this.voipCameraManager;
    }

    public MediaCodecVideoEncoder initMediaCodecVideoEncoder() {
        return new MediaCodecVideoEncoder(this.voipSharedPreferences);
    }

    public int isCalleeMessageBufferEnabled() {
        return this.voipSharedPreferences.A04().getInt("call_enable_callee_message_buffer", 0);
    }

    public int isCallerMessageBufferEnabled() {
        return this.voipSharedPreferences.A04().getInt("call_enable_caller_message_buffer", 0);
    }

    public boolean isGcallCodecNegoFixEnabled() {
        return this.voipSharedPreferences.A04().getBoolean("enable_gcall_codec_nego_fix", false);
    }

    private boolean isH264HwCodecSupported() {
        if (Build.VERSION.SDK_INT >= 19 && C0JA.A0A()) {
            if (Build.VERSION.RELEASE.equals("5.0.1")) {
                String str = Build.DEVICE;
                if (str.equalsIgnoreCase("jflte") || str.equalsIgnoreCase("jfvelte")) {
                    return false;
                }
            }
            for (String str2 : H264_BLACKLISTED_DEVICE_BOARD) {
                if (Build.BOARD.equalsIgnoreCase(str2)) {
                    return false;
                }
            }
            for (String str3 : H264_BLACKLISTED_DEVICE_HARDWARE) {
                if (Build.HARDWARE.equalsIgnoreCase(str3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean isH265HwCodecSupported() {
        return MediaCodecVideoEncoder.isH265HwSupported();
    }

    private synchronized H26xSupportResult isH26XCodecSupported() {
        return new H26xSupportResult(isH264HwCodecSupported(), false, MediaCodecVideoEncoder.isH265HwSupported(), false);
    }

    public synchronized H26xSupportResult isH26XCodecSupportedFromCache() {
        SharedPreferences A04;
        A04 = this.voipSharedPreferences.A04();
        return (A04.contains("video_codec_h264_hw_supported") && A04.contains("video_codec_h264_sw_supported") && A04.contains("video_codec_h265_hw_supported") && A04.contains("video_codec_h265_sw_supported")) ? new H26xSupportResult(A04.getBoolean("video_codec_h264_hw_supported", false), A04.getBoolean("video_codec_h264_sw_supported", false), A04.getBoolean("video_codec_h265_hw_supported", false), A04.getBoolean("video_codec_h265_sw_supported", false)) : null;
    }

    public int isLowDataUsageEnabled() {
        return this.waSharedPreferences.A00.getBoolean("voip_low_data_usage", false) ? 1 : 0;
    }

    public boolean isMDCallEnabled() {
        return this.multiDeviceConfig.A04() && this.serverProps.A0E(C01C.A1P);
    }

    public boolean isVidQualityManagerEnabled() {
        return this.voipSharedPreferences.A04().getBoolean("enable_vid_quality_manager", false);
    }

    public boolean isVideoConverterMemoryLeakFixEnabled() {
        return this.voipSharedPreferences.A01.A0C(MediaCodecVideoEncoder.MIN_ENCODER_WIDTH);
    }

    public boolean isVoipStackCallTimerEnabled() {
        return this.voipSharedPreferences.A01.A0C(448);
    }

    public /* synthetic */ void lambda$updateH26XCodecSupported$105$JNIUtils() {
        this.voipSharedPreferences.A07(isH26XCodecSupported());
    }

    public synchronized void updateH26XCodecSupported(boolean z) {
        if (z) {
            this.waWorkers.AS1(new RunnableEBaseShape7S0100000_I0_7(this, 37));
        } else {
            this.voipSharedPreferences.A07(isH26XCodecSupported());
        }
    }

    /* loaded from: classes2.dex */
    public class H26xSupportResult {
        public final boolean isH264HwSupported;
        public final boolean isH264SwSupported;
        public final boolean isH265HwSupported;
        public final boolean isH265SwSupported;

        public H26xSupportResult(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isH264HwSupported = z;
            this.isH264SwSupported = z2;
            this.isH265HwSupported = z3;
            this.isH265SwSupported = z4;
        }
    }
}
