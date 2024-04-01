package org.wawebrtc;

import X.C000200d;
import X.C02180Ae;
import X.C0EW;
import X.C0JA;
import X.C75443eu;
import X.C75453ev;
import X.C75463ew;
import X.C75523f7;
import X.C85503vi;
import X.EnumC75553fA;
import X.InterfaceC75543f9;
import android.media.MediaCodec;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class MediaCodecVideoEncoder {
    public static final int DEQUEUE_TIMEOUT = 0;
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final int MIN_ENCODER_HEIGHT = 144;
    public static final int MIN_ENCODER_WIDTH = 176;
    public static final String TAG = "MediaCodecVideoEncoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static int codecErrors;
    public static InterfaceC75543f9 errorCallback;
    public static long lastReleaseTimestamp;
    public static MediaCodecVideoEncoder runningInstance;
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public String codecName;
    public int colorFormat;
    public int colorId;
    public C75453ev drawer;
    public C85503vi eglBase;
    public int height;
    public ByteBuffer[] inputBuffers;
    public Surface inputSurface;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public ByteBuffer[] outputBuffers;
    public EnumC75553fA type;
    public final C0EW voipSharedPreferences;
    public int width;
    public static Set hwEncoderDisabledTypes = new HashSet();
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom."};
    public static final String[] trustedCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.google", "OMX.IMG."};
    public static final String[] blacklistedHwCodecPrefixes = new String[0];
    public static final String[] h264BlacklistedBuildHardware = {"sc8830", "sc8830a", "samsungexynos7580"};
    public static final String[] h265BlacklistedBuildHardware = new String[0];
    public static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7"};
    public static final String[] H265_HW_EXCEPTION_MODELS = new String[0];
    public static final int[] supportedSurfaceColorList = {2130708361};
    public static final Map cachedCodecCapabilites = new HashMap();
    public final Queue carryAlongInfos = new LinkedList();
    public final List freeInfos = new LinkedList();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public Bundle keyFrameRequestBundle = new Bundle();

    private void checkOnMediaCodecThread() {
    }

    public MediaCodecVideoEncoder(C0EW c0ew) {
        this.voipSharedPreferences = c0ew;
        int i = 0;
        do {
            this.freeInfos.add(new C75523f7());
            i++;
        } while (i < 10);
        this.keyFrameRequestBundle.putInt("request-sync", 0);
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception e) {
            Log.e(e);
            return null;
        }
    }

    public BufferInfo dequeueInputBuffer() {
        try {
            int dequeueInputBuffer = this.mediaCodec.dequeueInputBuffer(0L);
            if (dequeueInputBuffer >= 0) {
                this.cachedInputBuffer.set(dequeueInputBuffer, getInputBuffer(dequeueInputBuffer), false, 0L, 0L, 0, false);
                return this.cachedInputBuffer;
            }
            return null;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    public BufferInfo dequeueOutputBuffer(int i) {
        try {
            MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, i);
            if (dequeueOutputBuffer < 0) {
                if (dequeueOutputBuffer == -3) {
                    if (Build.VERSION.SDK_INT < 21) {
                        this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    }
                    return dequeueOutputBuffer(i);
                } else if (dequeueOutputBuffer == -2) {
                    return dequeueOutputBuffer(i);
                } else {
                    if (dequeueOutputBuffer == -1) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("dequeueOutputBuffer: ");
                    sb.append(dequeueOutputBuffer);
                    throw new RuntimeException(sb.toString());
                }
            }
            ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            int i2 = bufferInfo.flags;
            if ((i2 & 2) != 0) {
                this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), false, 0L, 0L, 0, true);
                return this.cachedOutputBuffer;
            }
            boolean z = (i2 & 1) != 0;
            C75523f7 c75523f7 = (C75523f7) this.carryAlongInfos.remove();
            this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), z, c75523f7.A02, SystemClock.elapsedRealtime() - c75523f7.A01, c75523f7.A00, false);
            this.freeInfos.add(c75523f7);
            return this.cachedOutputBuffer;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder dequeueOutputBuffer failed", e);
            BufferInfo bufferInfo2 = this.cachedOutputBuffer;
            bufferInfo2.set(-1, null, false, -1L, -1L, 0, false);
            return bufferInfo2;
        }
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoEncoder H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoEncoder H.265 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoEncoder VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoEncoder VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public boolean encodeBuffer(boolean z, int i, int i2, long j, long j2, int i3) {
        C75523f7 c75523f7;
        if (z) {
            try {
                if (supportForceKeyFrame()) {
                    Log.i("MediaCodecVideoEncoder Sync frame request");
                    this.mediaCodec.setParameters(this.keyFrameRequestBundle);
                }
            } catch (IllegalStateException e) {
                Log.e("MediaCodecVideoEncoder encodeBuffer failed", e);
                return false;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.freeInfos.isEmpty()) {
            c75523f7 = (C75523f7) this.freeInfos.remove(0);
            c75523f7.A01 = elapsedRealtime;
            c75523f7.A02 = j;
            c75523f7.A00 = i3;
        } else {
            c75523f7 = new C75523f7(elapsedRealtime, j, i3);
        }
        this.carryAlongInfos.add(c75523f7);
        ByteBuffer inputBuffer = getInputBuffer(i);
        inputBuffer.position(0);
        inputBuffer.limit(i2);
        this.mediaCodec.queueInputBuffer(i, 0, i2, j2, 0);
        return true;
    }

    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        C75443eu c75443eu;
        if (z) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    Log.i("MediaCodecVideoEncoder Sync frame request");
                    this.mediaCodec.setParameters(this.keyFrameRequestBundle);
                }
            } catch (RuntimeException e) {
                Log.e("MediaCodecVideoEncoder encodeTexture failed", e);
                return false;
            }
        }
        this.eglBase.A03();
        GLES20.glClear(16384);
        C75453ev c75453ev = this.drawer;
        int i2 = this.width;
        int i3 = this.height;
        Map map = c75453ev.A00;
        if (map.containsKey("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n")) {
            c75443eu = (C75443eu) map.get("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n");
        } else {
            c75443eu = new C75443eu();
            map.put("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oes_tex;\n\nvoid main() {\n  gl_FragColor = texture2D(oes_tex, interp_tc);\n}\n", c75443eu);
            C75463ew c75463ew = c75443eu.A01;
            int i4 = c75463ew.A00;
            if (i4 != -1) {
                GLES20.glUseProgram(i4);
                C02180Ae.A1D("glUseProgram");
                GLES20.glUniform1i(c75463ew.A01("oes_tex"), 0);
                C02180Ae.A1D("Initialize fragment shader uniform values.");
                c75463ew.A02("in_pos", C75453ev.A01);
                c75463ew.A02("in_tc", C75453ev.A02);
            } else {
                throw new RuntimeException("The program has been released");
            }
        }
        int i5 = c75443eu.A01.A00;
        if (i5 != -1) {
            GLES20.glUseProgram(i5);
            C02180Ae.A1D("glUseProgram");
            GLES20.glUniformMatrix4fv(c75443eu.A00, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glViewport(0, 0, i2, i3);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindTexture(36197, 0);
            C85503vi c85503vi = this.eglBase;
            long nanos = TimeUnit.MICROSECONDS.toNanos(j);
            c85503vi.A09();
            EGLSurface eGLSurface = c85503vi.A03;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGLExt.eglPresentationTimeANDROID(c85503vi.A02, eGLSurface, nanos);
                EGL14.eglSwapBuffers(c85503vi.A02, c85503vi.A03);
                return true;
            }
            throw new RuntimeException("No EGLSurface - can't swap buffers");
        }
        throw new RuntimeException("The program has been released");
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0053, code lost:
        if (X.C0JA.A0D(android.os.Build.HARDWARE, org.wawebrtc.MediaCodecVideoEncoder.h265BlacklistedBuildHardware) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0079, code lost:
        if (X.C0JA.A0D(android.os.Build.HARDWARE, org.wawebrtc.MediaCodecVideoEncoder.h264BlacklistedBuildHardware) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x007b, code lost:
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0118, code lost:
        if (r8.startsWith("OMX.google") != false) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List findHwEncoder(java.lang.String r28, java.lang.String[] r29, int[] r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, java.lang.String[], int[], int, boolean):java.util.List");
    }

    private int getCodecKeyFrameInterval() {
        return C0JA.A0D(this.codecName, trustedCodecPrefixes) ? 4 : 2;
    }

    private int getDequeueOutputTimeout() {
        String str = this.codecName;
        boolean A0D = C0JA.A0D(str, trustedCodecPrefixes);
        if ("OMX.google.h264.encoder".equalsIgnoreCase(str)) {
            return 100;
        }
        if (A0D) {
            return 30;
        }
        return SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
    }

    private ByteBuffer getInputBuffer(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.mediaCodec.getInputBuffer(i);
        }
        return this.inputBuffers[i];
    }

    private ByteBuffer getOutputBuffer(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.mediaCodec.getOutputBuffer(i);
        }
        return this.outputBuffers[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00e5  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean initEncode(X.EnumC75553fA r30, int r31, int r32, int r33, int r34, int r35, X.C85493vh r36) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoEncoder.initEncode(X.3fA, int, int, int, int, int, X.3vh):boolean");
    }

    public boolean initH264Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(EnumC75553fA.VIDEO_CODEC_H264, i, i2, i3, i4, i5, null);
    }

    public boolean initH265Encoder(int i, int i2, int i3, int i4, int i5) {
        return initEncode(EnumC75553fA.VIDEO_CODEC_H265, i, i2, i3, i4, i5, null);
    }

    public static boolean isH264HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", null, null, -1, false) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", null, supportedSurfaceColorList, -1, false) == null) ? false : true;
    }

    public static boolean isH265HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", null, null, -1, true) == null) ? false : true;
    }

    public static boolean isH265HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", null, supportedSurfaceColorList, -1, false) == null) ? false : true;
    }

    public static boolean isVp8HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, null, -1, false) == null) ? false : true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, supportedSurfaceColorList, -1, false) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, null, -1, false) == null) ? false : true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, supportedSurfaceColorList, -1, false) == null) ? false : true;
    }

    public static void printStackTrace() {
        Thread thread;
        StackTraceElement[] stackTrace;
        int length;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null || (length = (stackTrace = thread.getStackTrace()).length) <= 0) {
            return;
        }
        Log.i("MediaCodecVideoEncoder  stacks trace:");
        for (int i = 0; i < length; i++) {
            Log.i(stackTrace[i].toString());
        }
    }

    public void release() {
        C000200d.A1N(C000200d.A0P("MediaCodecVideoEncoder Java releaseEncoder "), this.codecName);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new RunnableEBaseShape5S0200000_I0_5(this, countDownLatch, 3)).start();
        if (!C02180Ae.A1Z(countDownLatch)) {
            Log.e("MediaCodecVideoEncoder Media encoder release timeout");
            codecErrors++;
        }
        this.codecName = null;
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        C75453ev c75453ev = this.drawer;
        if (c75453ev != null) {
            for (C75443eu c75443eu : c75453ev.A00.values()) {
                C75463ew c75463ew = c75443eu.A01;
                if (c75463ew != null) {
                    Log.i("GlShader Deleting shader.");
                    int i = c75463ew.A00;
                    if (i != -1) {
                        GLES20.glDeleteProgram(i);
                        c75463ew.A00 = -1;
                    }
                } else {
                    throw null;
                }
            }
            c75453ev.A00.clear();
            this.drawer = null;
        }
        C85503vi c85503vi = this.eglBase;
        if (c85503vi != null) {
            c85503vi.A04();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        Log.i("MediaCodecVideoEncoder Java releaseEncoder done");
    }

    public boolean releaseOutputBuffer(int i) {
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoEncoder releaseOutputBuffer failed", e);
            return false;
        }
    }

    public boolean resetEncoderOnFPSChanges() {
        return "OMX.Exynos.AVC.Encoder".equalsIgnoreCase(this.codecName);
    }

    public static void setErrorCallback(InterfaceC75543f9 interfaceC75543f9) {
        Log.i("MediaCodecVideoEncoder Set error callback");
        errorCallback = interfaceC75543f9;
    }

    private boolean setRates(int i, int i2) {
        if (supportUpdateBitrate()) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
                this.mediaCodec.setParameters(bundle);
                return true;
            } catch (IllegalStateException e) {
                Log.e("MediaCodecVideoEncoder setRates failed", e);
            }
        }
        return false;
    }

    public boolean supportForceKeyFrame() {
        return Build.VERSION.SDK_INT >= 19 && !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    public boolean supportUpdateBitrate() {
        return Build.VERSION.SDK_INT >= 19 && !"OMX.google.h264.encoder".equalsIgnoreCase(this.codecName);
    }

    /* loaded from: classes2.dex */
    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long encodeTimeMs;
        public int index;
        public boolean isConfigData;
        public boolean isKeyFrame;
        public long timestamp;

        public void set(int i, ByteBuffer byteBuffer, boolean z, long j, long j2, int i2, boolean z2) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.timestamp = j;
            this.encodeTimeMs = j2;
            this.bitInfo = i2;
            this.isConfigData = z2;
        }
    }
}
