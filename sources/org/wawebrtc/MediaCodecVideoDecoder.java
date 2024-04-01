package org.wawebrtc;

import X.C000200d;
import X.C02180Ae;
import X.C0JA;
import X.C1LM;
import X.C75473ez;
import X.C75483f1;
import X.C75503f3;
import X.C75563fB;
import X.EnumC75513f4;
import X.InterfaceC75493f2;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.SystemClock;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class MediaCodecVideoDecoder {
    public static final int DEQUEUE_INPUT_TIMEOUT = 500000;
    public static final String H264_MIME_TYPE = "video/avc";
    public static final String H265_MIME_TYPE = "video/hevc";
    public static final long MAX_DECODE_TIME_MS = 500;
    public static final int MAX_QUEUED_OUTPUTBUFFERS = 3;
    public static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    public static final String TAG = "MediaCodecVideoDecoder";
    public static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    public static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    public static int codecErrors;
    public static InterfaceC75493f2 errorCallback;
    public static long lastReleaseTimestamp;
    public static MediaCodecVideoDecoder runningInstance;
    public static final String[] supportedH264HwCodecPrefixes = null;
    public static final String[] supportedH265HwCodecPrefixes = null;
    public String codecName;
    public int colorFormat;
    public int colorId;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public int droppedFrames;
    public boolean hasDecodedFirstFrame;
    public int height;
    public ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    public Thread mediaCodecThread;
    public boolean needsRestartDecoderOnNewSpsPps;
    public boolean needsSpsBaselineProfileHack;
    public boolean needsSpsBitstreamRestrictions;
    public boolean needsSpsConstrainedHighProfile;
    public boolean needsSpsPpsInCsd;
    public ByteBuffer[] outputBuffers;
    public int sliceHeight;
    public int stride;
    public C75503f3 textureListener;
    public boolean useSurface;
    public int width;
    public static Set hwDecoderDisabledTypes = new HashSet();
    public static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    public static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    public static final String[] blacklistedHwCodecPrefixes = {"OMX.TI.DUCATI1.VIDEO.DECODER"};
    public static final String[] blacklistedDeviceBoard = new String[0];
    public static final String[] spsBitstreamRestrictionsPrefixes = {"omx.qcom.", "omx.nvidia.", "omx.brcm.", "OMX.Exynos."};
    public static final String[] spsBaselineProfileHackPrefixes = new String[0];
    public static final String[] spsConstrainedHighProfilePrefixes = new String[0];
    public static final String[] restartDecoderOnNewSpsPpsPrefixes = {"omx.mtk.", "OMX.SEC.avc.dec"};
    public static final Map cachedCodecCapabilites = new HashMap();
    public final Queue carryAlongInfos = new LinkedList();
    public final List freeInfos = new LinkedList();
    public BufferInfo cachedOutputBuffer = new BufferInfo();
    public BufferInfo cachedInputBuffer = new BufferInfo();
    public MediaCodec.BufferInfo cachedBufferInfo = new MediaCodec.BufferInfo();
    public Surface surface = null;
    public final Queue dequeuedSurfaceOutputBuffers = new LinkedList();

    private void checkOnMediaCodecThread() {
    }

    private int getDequeueOutputTimeout() {
        return 20;
    }

    /* loaded from: classes2.dex */
    public class Api29Impl {
        public static boolean mediaCodecInfoIsSoftwareOnly(MediaCodecInfo mediaCodecInfo) {
            return mediaCodecInfo.isSoftwareOnly();
        }
    }

    /* loaded from: classes2.dex */
    public class BufferInfo {
        public int bitInfo;
        public ByteBuffer buffer;
        public long decodeTimeMs;
        public long endDecodeTimeMs;
        public int index;
        public long ntpTimeStampMs;
        public long presentationTimeStampMs;
        public long timeStampMs;

        public void set(int i, ByteBuffer byteBuffer, long j, long j2, long j3, int i2, long j4, long j5) {
            this.index = i;
            this.buffer = byteBuffer;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.bitInfo = i2;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }
    }

    /* loaded from: classes2.dex */
    public class DecodedTextureBuffer {
        public final long decodeTimeMs;
        public final long frameDelayMs;
        public final long ntpTimeStampMs;
        public final long presentationTimeStampMs;
        public final int textureID;
        public final long timeStampMs;
        public final float[] transformMatrix;

        public DecodedTextureBuffer(int i, float[] fArr, long j, long j2, long j3, long j4, long j5) {
            this.textureID = i;
            this.transformMatrix = fArr;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }
    }

    public MediaCodecVideoDecoder() {
        int i = 0;
        do {
            this.freeInfos.add(new C75473ez());
            i++;
        } while (i < 10);
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty()) {
            throw null;
        }
    }

    private BufferInfo dequeueInputBuffer() {
        MediaCodec mediaCodec = this.mediaCodec;
        if (mediaCodec == null) {
            return null;
        }
        try {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(500000L);
            if (dequeueInputBuffer >= 0) {
                this.cachedInputBuffer.set(dequeueInputBuffer, getInputBuffer(dequeueInputBuffer), 0L, 0L, 0L, 0, 0L, 0L);
                return this.cachedInputBuffer;
            }
            return null;
        } catch (Throwable th) {
            Log.e(th);
            throw th;
        }
    }

    private BufferInfo dequeueOutputBuffer(int i) {
        int dequeueOutputBuffer;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.carryAlongInfos.isEmpty()) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.cachedBufferInfo;
        while (true) {
            dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i));
            if (dequeueOutputBuffer != -3) {
                if (dequeueOutputBuffer != -2) {
                    break;
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                StringBuilder A0P = C000200d.A0P("MediaCodecVideoDecoder Decoder format changed: ");
                A0P.append(outputFormat.toString());
                Log.i(A0P.toString());
                C1LM A06 = C0JA.A06(outputFormat, this.codecName, null);
                int i6 = A06.A09;
                this.width = i6;
                int i7 = A06.A06;
                this.height = i7;
                this.stride = Math.max(i6, A06.A08);
                this.sliceHeight = Math.max(i7, A06.A07);
                int i8 = A06.A00;
                this.colorFormat = i8;
                this.colorId = getFrameConverterColorId(i8, A06.A05);
                this.cropLeft = 0;
                int i9 = this.width;
                this.cropRight = i9 - 1;
                this.cropTop = 0;
                this.cropBottom = this.height - 1;
                int i10 = A06.A02;
                if (i10 >= 0 && i10 < (i4 = A06.A08) && (i5 = A06.A03) >= 0 && i5 < i4 && i10 < i5) {
                    this.cropLeft = i10;
                    this.cropRight = i5;
                    int i11 = (i5 - i10) + 1;
                    if (i11 < i9) {
                        this.width = i11;
                        C000200d.A1G(C000200d.A0P("MediaCodecVideoDecoder Decoder format changed, use cropRight and cropLeft to calculate width "), i11);
                    }
                }
                int i12 = A06.A01;
                if (i12 >= 0 && i12 < (i2 = A06.A07) && (i3 = A06.A04) >= 0 && i3 < i2 && i3 < i12) {
                    this.cropTop = i3;
                    this.cropBottom = i12;
                    int i13 = (i12 - i3) + 1;
                    if (i13 < this.height) {
                        this.height = i13;
                        C000200d.A1G(C000200d.A0P("MediaCodecVideoDecoder Decoder format changed, use cropBottom and cropTop to calculate height "), i13);
                    }
                }
            } else if (Build.VERSION.SDK_INT < 21) {
                ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
                this.outputBuffers = outputBuffers;
                C000200d.A1F(C000200d.A0P("MediaCodecVideoDecoder Decoder output buffers changed: "), outputBuffers.length);
            }
        }
        if (dequeueOutputBuffer != -1) {
            this.hasDecodedFirstFrame = true;
            C75473ez c75473ez = (C75473ez) this.carryAlongInfos.remove();
            long elapsedRealtime = SystemClock.elapsedRealtime() - c75473ez.A01;
            ByteBuffer outputBuffer = getOutputBuffer(dequeueOutputBuffer);
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            this.cachedOutputBuffer.set(dequeueOutputBuffer, outputBuffer.slice(), TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), c75473ez.A03, c75473ez.A02, c75473ez.A00, elapsedRealtime, SystemClock.elapsedRealtime());
            this.freeInfos.add(c75473ez);
            return this.cachedOutputBuffer;
        }
        return null;
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        if (this.useSurface) {
            BufferInfo dequeueOutputBuffer = dequeueOutputBuffer(i);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            throw null;
        }
        throw new IllegalStateException("dequeueTexture() called for byte buffer decoding.");
    }

    public static void disableH264HwCodec() {
        Log.w("MediaCodecVideoDecoder H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableH265HwCodec() {
        Log.w("MediaCodecVideoDecoder H.265 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        Log.w("MediaCodecVideoDecoder VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Log.w("MediaCodecVideoDecoder VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x018d, code lost:
        if (r16.isFeatureSupported("adaptive-playback") == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List findDecoder(java.lang.String r25, java.lang.String[] r26, int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.findDecoder(java.lang.String, java.lang.String[], int, boolean):java.util.List");
    }

    public static int getDecoderImplFromString(String str) {
        if ("SW".equalsIgnoreCase(str)) {
            return 1;
        }
        return "HW".equalsIgnoreCase(str) ? 2 : 0;
    }

    private int getFrameConverterColorId(int i, int i2) {
        Integer A01 = Voip.A01("vid_driver.decoder_frame_converter_color_format");
        String A06 = Voip.A06("vid_driver.decoder_name");
        Integer A012 = Voip.A01("vid_driver.decoder_color_format");
        return (A01 == null || A06 == null || A012 == null || !A06.equalsIgnoreCase(this.codecName) || i != A012.intValue()) ? i2 : A01.intValue();
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

    private boolean initDecode(EnumC75513f4 enumC75513f4, int i, int i2, C75563fB c75563fB, byte[] bArr, byte[] bArr2, boolean z) {
        String[] strArr;
        String str;
        if (this.mediaCodecThread == null) {
            this.useSurface = c75563fB != null;
            if (enumC75513f4 == EnumC75513f4.VIDEO_CODEC_VP8) {
                strArr = supportedVp8HwCodecPrefixes;
                str = "video/x-vnd.on2.vp8";
            } else if (enumC75513f4 == EnumC75513f4.VIDEO_CODEC_VP9) {
                strArr = supportedVp9HwCodecPrefixes;
                str = "video/x-vnd.on2.vp9";
            } else if (enumC75513f4 == EnumC75513f4.VIDEO_CODEC_H264) {
                strArr = null;
                str = "video/avc";
            } else if (enumC75513f4 == EnumC75513f4.VIDEO_CODEC_H265) {
                strArr = null;
                str = "video/hevc";
            } else {
                StringBuilder sb = new StringBuilder("initDecode: Non-supported codec ");
                sb.append(enumC75513f4);
                throw new RuntimeException(sb.toString());
            }
            try {
                List<C75483f1> findDecoder = findDecoder(str, strArr, -1, SystemClock.uptimeMillis() - lastReleaseTimestamp > 3000);
                if (findDecoder != null && !findDecoder.isEmpty()) {
                    runningInstance = this;
                    this.mediaCodecThread = Thread.currentThread();
                    this.freeInfos.addAll(this.carryAlongInfos);
                    this.carryAlongInfos.clear();
                    for (C75483f1 c75483f1 : findDecoder) {
                        StringBuilder sb2 = new StringBuilder("MediaCodecVideoDecoder Java initDecode: ");
                        sb2.append(enumC75513f4);
                        sb2.append(" : ");
                        sb2.append(i);
                        sb2.append(" x ");
                        sb2.append(i2);
                        sb2.append(". Color: 0x");
                        int i3 = c75483f1.A00;
                        sb2.append(Integer.toHexString(i3));
                        sb2.append(". Use Surface: ");
                        sb2.append(this.useSurface);
                        sb2.append(". Decoder: ");
                        String str2 = c75483f1.A02;
                        C000200d.A1N(sb2, str2);
                        try {
                            this.codecName = str2;
                            this.width = i;
                            this.height = i2;
                            this.stride = i;
                            this.sliceHeight = i2;
                            this.cropLeft = 0;
                            this.cropRight = i - 1;
                            this.cropTop = 0;
                            this.cropBottom = i2 - 1;
                        } catch (Throwable th) {
                            Log.e("MediaCodecVideoDecoder initDecode failed with Exception", th);
                        }
                        if (!this.useSurface) {
                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                            if (bArr != null) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("MediaCodecVideoDecoder Java initDecode: csd-0 ");
                                sb3.append(Arrays.toString(bArr));
                                Log.i(sb3.toString());
                                createVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
                            }
                            if (bArr2 != null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("MediaCodecVideoDecoder Java initDecode: csd-1 ");
                                sb4.append(Arrays.toString(bArr2));
                                Log.i(sb4.toString());
                                createVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(bArr2));
                            }
                            if (!this.useSurface) {
                                createVideoFormat.setInteger("color-format", i3);
                            }
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("MediaCodecVideoDecoder   Format: ");
                            sb5.append(createVideoFormat);
                            Log.i(sb5.toString());
                            MediaCodec createByCodecName = MediaCodecVideoEncoder.createByCodecName(str2);
                            this.mediaCodec = createByCodecName;
                            if (createByCodecName == null) {
                                Log.e("MediaCodecVideoDecoder Can not create media decoder");
                                if (!z) {
                                    return false;
                                }
                            } else {
                                createByCodecName.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
                                this.mediaCodec.start();
                                C1LM A06 = C0JA.A06(createVideoFormat, this.codecName, null);
                                int i4 = A06.A00;
                                this.colorFormat = i4;
                                this.colorId = getFrameConverterColorId(i4, A06.A05);
                                if (Build.VERSION.SDK_INT < 21) {
                                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                                    ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
                                    this.inputBuffers = inputBuffers;
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("MediaCodecVideoDecoder Input buffers: ");
                                    sb6.append(inputBuffers.length);
                                    sb6.append(". Output buffers: ");
                                    sb6.append(this.outputBuffers.length);
                                    Log.i(sb6.toString());
                                }
                                this.hasDecodedFirstFrame = false;
                                this.dequeuedSurfaceOutputBuffers.clear();
                                this.droppedFrames = 0;
                                setDecoderFlags(c75483f1);
                                return true;
                            }
                        } else {
                            throw null;
                        }
                    }
                    return false;
                }
                C000200d.A13("MediaCodecVideoDecoder Can not find HW decoder for ", str);
                return false;
            } catch (Throwable th2) {
                Log.e("MediaCodecVideoDecoder Exception in findDecoder", th2);
                return false;
            }
        }
        throw new RuntimeException("initDecode: Forgot to release()?");
    }

    private boolean initH264Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        return initH264Decoder(i, i2, bArr, bArr2, false);
    }

    private boolean initH264Decoder(int i, int i2, byte[] bArr, byte[] bArr2, boolean z) {
        C75483f1 c75483f1 = null;
        try {
            List findDecoder = findDecoder("video/avc", null, -1, false);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                c75483f1 = (C75483f1) findDecoder.get(0);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(c75483f1);
        return initDecode(EnumC75513f4.VIDEO_CODEC_H264, i, i2, null, bArr, bArr2, z);
    }

    private boolean initH265Decoder(int i, int i2, byte[] bArr, byte[] bArr2) {
        return initH265Decoder(i, i2, bArr, bArr2, false);
    }

    private boolean initH265Decoder(int i, int i2, byte[] bArr, byte[] bArr2, boolean z) {
        C75483f1 c75483f1 = null;
        try {
            List findDecoder = findDecoder("video/hevc", null, -1, true);
            if (findDecoder != null && !findDecoder.isEmpty()) {
                c75483f1 = (C75483f1) findDecoder.get(0);
            }
        } catch (Throwable th) {
            Log.e("MediaCodecVideoDecoder Exception in findDecoder", th);
        }
        setDecoderFlags(c75483f1);
        return initDecode(EnumC75513f4.VIDEO_CODEC_H265, i, i2, null, bArr, bArr2, z);
    }

    public static boolean isH264HwSupported() {
        return (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", null, -1, false) == null) ? false : true;
    }

    public static boolean isH265HwSupported() {
        return (hwDecoderDisabledTypes.contains("video/hevc") || findDecoder("video/hevc", null, -1, true) == null) ? false : true;
    }

    public static boolean isSoftwareCodec(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.mediaCodecInfoIsSoftwareOnly(mediaCodecInfo);
        }
        String name = mediaCodecInfo.getName();
        return name.equalsIgnoreCase("OMX.google.h264.decoder") || name.equalsIgnoreCase("c2.android.avc.decoder") || name.toLowerCase(Locale.US).contains(".sw.");
    }

    public static boolean isSoftwareCodec(String str) {
        return str.equalsIgnoreCase("OMX.google.h264.decoder") || str.toLowerCase(Locale.US).contains(".sw.");
    }

    public static boolean isVp8HwSupported() {
        return (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, -1, false) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, -1, false) == null) ? false : true;
    }

    public static void printStackTrace() {
        Thread thread;
        StackTraceElement[] stackTrace;
        int length;
        MediaCodecVideoDecoder mediaCodecVideoDecoder = runningInstance;
        if (mediaCodecVideoDecoder == null || (thread = mediaCodecVideoDecoder.mediaCodecThread) == null || (length = (stackTrace = thread.getStackTrace()).length) <= 0) {
            return;
        }
        Log.i("MediaCodecVideoDecoder MediaCodecVideoDecoder stacks trace:");
        for (int i = 0; i < length; i++) {
            Log.i(stackTrace[i].toString());
        }
    }

    private boolean queueInputBuffer(int i, int i2, long j, long j2, int i3) {
        C75473ez c75473ez;
        try {
            ByteBuffer inputBuffer = getInputBuffer(i);
            inputBuffer.position(0);
            inputBuffer.limit(i2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.freeInfos.isEmpty()) {
                c75473ez = (C75473ez) this.freeInfos.remove(0);
                c75473ez.A01 = elapsedRealtime;
                c75473ez.A03 = j;
                c75473ez.A02 = j2;
                c75473ez.A00 = i3;
            } else {
                c75473ez = new C75473ez(elapsedRealtime, j, j2, i3);
            }
            this.carryAlongInfos.add(c75473ez);
            this.mediaCodec.queueInputBuffer(i, 0, i2, 1000 * elapsedRealtime, 0);
            return true;
        } catch (IllegalStateException e) {
            Log.e("MediaCodecVideoDecoder decode failed", e);
            return false;
        }
    }

    private void release() {
        StringBuilder A0P = C000200d.A0P("MediaCodecVideoDecoder Java releaseDecoder ");
        A0P.append(this.codecName);
        A0P.append(". Total number of dropped frames: ");
        C000200d.A1F(A0P, this.droppedFrames);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new RunnableEBaseShape6S0200000_I1(this, countDownLatch, 21)).start();
        if (!C02180Ae.A1Z(countDownLatch)) {
            Log.e("MediaCodecVideoDecoder Media decoder release timeout");
            codecErrors++;
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        lastReleaseTimestamp = SystemClock.uptimeMillis();
        if (this.useSurface) {
            this.surface.release();
            this.surface = null;
            throw null;
        }
        Log.i("MediaCodecVideoDecoder Java releaseDecoder done");
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread != null && this.mediaCodec != null) {
            C000200d.A0t("MediaCodecVideoDecoder Java reset: ", i, " x ", i2);
            this.mediaCodec.flush();
            this.codecName = null;
            this.width = i;
            this.height = i2;
            this.freeInfos.addAll(this.carryAlongInfos);
            this.carryAlongInfos.clear();
            this.dequeuedSurfaceOutputBuffers.clear();
            this.hasDecodedFirstFrame = false;
            this.droppedFrames = 0;
            return;
        }
        throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
    }

    private void returnDecodedOutputBuffer(int i) {
        if (!this.useSurface) {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        throw new IllegalStateException("returnDecodedOutputBuffer() called for surface decoding.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
        if (android.os.Build.HARDWARE.matches("mt\\d+") == false) goto L86;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00fc -> B:57:0x0105). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setDecoderFlags(X.C75483f1 r9) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.wawebrtc.MediaCodecVideoDecoder.setDecoderFlags(X.3f1):void");
    }

    public static void setErrorCallback(InterfaceC75493f2 interfaceC75493f2) {
        Log.i("MediaCodecVideoDecoder Set error callback");
        errorCallback = interfaceC75493f2;
    }
}
