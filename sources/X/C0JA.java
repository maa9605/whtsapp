package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.Mp4Ops;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.0JA */
/* loaded from: classes.dex */
public class C0JA implements InterfaceC43741xt {
    public static int A0K;
    public static String A0L;
    public static final byte[] A0M = {102, 116, 121, 112};
    public static final int[] A0N = {19, 20, 21, 39, 2141391872, 2130706688, 25, 2141391876, 2130706433, 2141391875, 2141391873, 11, 2130706944};
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C1LM A06;
    public C1LQ A07;
    public InterfaceC63092z4 A08;
    public C2EK A09;
    public File A0A;
    public File A0B;
    public File A0C;
    public byte[] A0D;
    public final AbstractC000600i A0E;
    public final C01B A0F;
    public final C001200o A0G;
    public final C003701t A0H;
    public final File A0I;
    public volatile boolean A0J;
    public int A01 = 640;
    public float A00 = 3.0f;

    public static int A01(int i) {
        switch (i) {
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return 7;
            case 21:
            case 39:
            case 2130706688:
            case 2141391873:
            case 2141391876:
                return 3;
            case 2130706433:
                return 6;
            case 2130706944:
                return 2;
            case 2141391872:
                return 4;
            case 2141391875:
                return 5;
            default:
                return 1;
        }
    }

    public C0JA(C001200o c001200o, C003701t c003701t, AbstractC000600i abstractC000600i, C01B c01b, File file, File file2, long j, long j2) {
        this.A0G = c001200o;
        this.A0H = c003701t;
        this.A0E = abstractC000600i;
        this.A0F = c01b;
        this.A0B = file;
        this.A0I = file2;
        this.A02 = j;
        this.A03 = j2;
        if (j2 <= 0 || j != j2) {
            return;
        }
        StringBuilder A0S = C000200d.A0S("timeFrom:", j, " timeTo:");
        A0S.append(j2);
        throw new IllegalArgumentException(A0S.toString());
    }

    public static float A00(int i, int i2) {
        return Math.max(2.0f, Math.min(10.0f, 153600.0f / (i * i2)));
    }

    public static int A02(MediaCodecInfo mediaCodecInfo) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        C000200d.A1F(C000200d.A0P("videotranscoder/transcode/color formats: "), capabilitiesForType.colorFormats.length);
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = capabilitiesForType.colorFormats;
            if (i < iArr.length && i2 == 0) {
                int i3 = iArr[i];
                if (i3 != 39 && i3 != 2130706688) {
                    switch (i3) {
                        case 19:
                        case C0M6.A01 /* 20 */:
                        case 21:
                            break;
                        default:
                            C000200d.A0q("videotranscoder/transcode/skipping unsupported color format ", i3);
                            continue;
                            i++;
                    }
                }
                if ("OMX.SEC.avc.enc".equals(mediaCodecInfo.getName()) && i3 == 19) {
                    StringBuilder sb = new StringBuilder("videotranscoder/transcode/skipping ");
                    sb.append(i3);
                    sb.append(" for OMX.SEC.avc.enc");
                    Log.i(sb.toString());
                } else {
                    i2 = i3;
                }
                i++;
            }
        }
        return i2;
    }

    public static int A03(String str) {
        return str.equals("OMX.qcom.video.encoder.avc") ? 32 : 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0083, code lost:
        r8 = r6.getName();
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/istranscodesupported/found ");
        r1.append(r6.getName());
        com.whatsapp.util.Log.i(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int A04(boolean r11) {
        /*
            java.lang.Class<X.0JA> r10 = X.C0JA.class
            monitor-enter(r10)
            int r9 = X.C0JA.A0K     // Catch: java.lang.Throwable -> Lad
            if (r9 != 0) goto Lab
            boolean r0 = A0A()     // Catch: java.lang.Throwable -> Lad
            r9 = 1
            r0 = r0 ^ r9
            r8 = 0
            if (r0 == 0) goto L37
            r9 = 3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "videotranscoder/istranscodesupported/unsupported model "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Lad
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lad
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lad
            com.whatsapp.util.Log.w(r0)     // Catch: java.lang.Throwable -> Lad
        L31:
            A09(r8)     // Catch: java.lang.Throwable -> Lad
            X.C0JA.A0K = r9     // Catch: java.lang.Throwable -> Lad
            goto Lab
        L37:
            int r5 = android.media.MediaCodecList.getCodecCount()     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "videotranscoder/istranscodesupported/number of codecs: "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            r1.append(r5)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lad
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> Lad
            r4 = 0
            r7 = 0
        L51:
            if (r4 >= r5) goto La2
            if (r7 != 0) goto L31
            android.media.MediaCodecInfo r6 = android.media.MediaCodecList.getCodecInfoAt(r4)     // Catch: java.lang.Throwable -> Lad
            boolean r0 = r6.isEncoder()     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L9f
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> Lad
            boolean r0 = A0C(r0, r11)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L9f
            java.lang.String[] r3 = r6.getSupportedTypes()     // Catch: java.lang.Throwable -> Lad
            r2 = 0
        L6e:
            int r0 = r3.length     // Catch: java.lang.Throwable -> Lad
            if (r2 >= r0) goto L81
            if (r7 != 0) goto L83
            r1 = r3[r2]     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "video/avc"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lad
            if (r0 == 0) goto L7e
            r7 = 1
        L7e:
            int r2 = r2 + 1
            goto L6e
        L81:
            if (r7 == 0) goto L9f
        L83:
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r1.<init>()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = "videotranscoder/istranscodesupported/found "
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r6.getName()     // Catch: java.lang.Throwable -> Lad
            r1.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lad
            com.whatsapp.util.Log.i(r0)     // Catch: java.lang.Throwable -> Lad
        L9f:
            int r4 = r4 + 1
            goto L51
        La2:
            if (r7 != 0) goto L31
            r9 = 4
            java.lang.String r0 = "videotranscoder/istranscodesupported/no encoder found"
            com.whatsapp.util.Log.w(r0)     // Catch: java.lang.Throwable -> Lad
            goto L31
        Lab:
            monitor-exit(r10)
            return r9
        Lad:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JA.A04(boolean):int");
    }

    public static MediaCodecInfo A05(boolean z) {
        String name;
        int codecCount = MediaCodecList.getCodecCount();
        C000200d.A0q("videotranscoder/transcode/number of codecs: ", codecCount);
        MediaCodecInfo mediaCodecInfo = null;
        MediaCodecInfo mediaCodecInfo2 = null;
        int i = 0;
        while (true) {
            if (i < codecCount) {
                if (mediaCodecInfo != null) {
                    break;
                }
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt.isEncoder()) {
                    if (!A0C(codecInfoAt.getName(), false)) {
                        if (z && (name = codecInfoAt.getName()) != null && name.equals("OMX.google.h264.encoder")) {
                            String[] supportedTypes = codecInfoAt.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                } else if (supportedTypes[i2].equals("video/avc")) {
                                    mediaCodecInfo2 = codecInfoAt;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        String[] supportedTypes2 = codecInfoAt.getSupportedTypes();
                        int i3 = 0;
                        boolean z2 = false;
                        while (true) {
                            if (i3 < supportedTypes2.length) {
                                if (z2) {
                                    break;
                                }
                                if (supportedTypes2[i3].equals("video/avc")) {
                                    z2 = true;
                                }
                                i3++;
                            } else if (!z2) {
                            }
                        }
                        mediaCodecInfo = codecInfoAt;
                    }
                }
                i++;
            } else if (mediaCodecInfo == null) {
                return mediaCodecInfo2;
            }
        }
        return mediaCodecInfo;
    }

    public static C1LM A06(MediaFormat mediaFormat, String str, C1LQ c1lq) {
        String str2;
        int i;
        StringBuilder sb = new StringBuilder("videotranscoder/transcode/getDecoderFormat output format has changed to ");
        sb.append(mediaFormat);
        Log.i(sb.toString());
        C1LM c1lm = new C1LM();
        c1lm.A0A = str;
        c1lm.A00 = mediaFormat.getInteger("color-format");
        c1lm.A09 = mediaFormat.getInteger("width");
        c1lm.A06 = mediaFormat.getInteger("height");
        try {
            c1lm.A02 = mediaFormat.getInteger("crop-left");
        } catch (Exception unused) {
        }
        try {
            c1lm.A03 = mediaFormat.getInteger("crop-right");
        } catch (Exception unused2) {
        }
        try {
            c1lm.A04 = mediaFormat.getInteger("crop-top");
        } catch (Exception unused3) {
        }
        try {
            c1lm.A01 = mediaFormat.getInteger("crop-bottom");
        } catch (Exception unused4) {
        }
        try {
            c1lm.A07 = mediaFormat.getInteger("slice-height");
        } catch (Exception unused5) {
        }
        if (str.startsWith("OMX.Nvidia.")) {
            c1lm.A07 = ((c1lm.A06 + 16) - 1) & (-16);
        } else if (str.equalsIgnoreCase("OMX.SEC.avc.dec")) {
            c1lm.A07 = c1lm.A06;
            c1lm.A08 = c1lm.A09;
        }
        try {
            c1lm.A08 = mediaFormat.getInteger("stride");
        } catch (Exception unused6) {
        }
        if (Build.VERSION.SDK_INT < 21 && c1lm.A01 == 1079 && c1lm.A06 == 1088 && A0B(str)) {
            Log.i("videotranscoder/transcode/decoder workaround samsung incorrect height");
            c1lm.A06 = 1080;
        }
        A09(str);
        if (c1lq != null) {
            int i2 = c1lm.A00;
            String str3 = c1lq.A04;
            if (str3 != null && i2 > 0 && (i = c1lq.A00) > 0 && str3.equals(str) && i == i2) {
                StringBuilder A0P = C000200d.A0P("videotranscoder/parseDecoderFormat/forcing frame convert color id=");
                int i3 = c1lq.A02;
                C000200d.A1F(A0P, i3);
                c1lm.A05 = i3;
                return c1lm;
            }
        }
        int i4 = c1lm.A00;
        c1lm.A05 = A01(i4);
        if (i4 == 25) {
            if ("OMX.k3.video.encoder.avc".equals(str) || "OMX.k3.video.decoder.avc".equals(str)) {
                Log.i("videotranscoder/transcode/decoder color format for Huaiwei is VideoFrameConverter.FRAMECONV_COLOR_FORMAT_NV12");
                c1lm.A05 = 3;
                return c1lm;
            }
        } else if (i4 == 2141391876) {
            c1lm.A05 = 3;
            return c1lm;
        } else if (i4 == 2130706433 && ((str2 = A0L) == null || !str2.toLowerCase(Locale.US).startsWith("mt6589"))) {
            c1lm.A05 = 1;
            return c1lm;
        }
        return c1lm;
    }

    public static C1LM A07(String str, int i, int i2, int i3, int i4, int i5, int i6, C1LQ c1lq) {
        String str2;
        int i7;
        int i8;
        C1LN c1ln = C1LN.Horizontal;
        C1LN c1ln2 = C1LN.None;
        C1LN c1ln3 = C1LN.Vertical;
        C1LM c1lm = new C1LM(i, i2, i3);
        c1lm.A0A = str;
        int i9 = (i4 - 1) ^ (-1);
        int i10 = ((i6 + i4) - 1) & i9;
        int i11 = ((i5 + i4) - 1) & i9;
        float f = i2 / (i3 + 0.0f);
        int i12 = c1lm.A09;
        if (i12 >= i11 && c1lm.A06 >= i10) {
            c1ln = c1ln2;
        } else if ((i12 >= i11 || c1lm.A06 < i10) && ((i12 >= i11 && c1lm.A06 < i10) || f > i11 / (i10 + 0.0f))) {
            c1ln = c1ln3;
        }
        if (c1ln != c1ln2) {
            if (c1ln == c1ln3) {
                c1lm.A06 = i10;
                int i13 = (int) (((i10 - c1lm.A06) * f) + i12);
                c1lm.A09 = i13;
                int i14 = (((i4 >> 1) + i13) - 1) & i9;
                c1lm.A09 = i14;
                c1lm.A09 = Math.max(i14, i11);
            } else {
                c1lm.A09 = i11;
                int i15 = (int) (((i11 - i12) / f) + c1lm.A06);
                c1lm.A06 = i15;
                int i16 = (((i4 >> 1) + i15) - 1) & i9;
                c1lm.A06 = i16;
                c1lm.A06 = Math.max(i16, i10);
            }
            StringBuilder sb = new StringBuilder("videotranscoder/transcode/encoder parseEncoderFormat expand direction is ");
            sb.append(c1ln);
            sb.append(", input size: ");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append(", after expansion: ");
            sb.append(c1lm.A09);
            sb.append("x");
            C000200d.A1F(sb, c1lm.A06);
        }
        int i17 = i4 >> 1;
        int i18 = i9 & ((c1lm.A06 + i17) - 1);
        c1lm.A06 = i18;
        int i19 = i9 & ((i17 + c1lm.A09) - 1);
        c1lm.A09 = i19;
        if (str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && Build.MANUFACTURER.equals("motorola") && Build.VERSION.SDK_INT < 18 && (i8 = i19 * i18) > 306176) {
            double sqrt = Math.sqrt(306176.0d / i8);
            int i20 = (int) (sqrt * i19);
            c1lm.A09 = i20;
            int i21 = (int) (sqrt * i18);
            c1lm.A06 = i21;
            int i22 = i20 & (-16);
            c1lm.A09 = i22;
            int i23 = i21 & (-8);
            c1lm.A06 = i23;
            StringBuilder A0P = C000200d.A0P("videotranscoder/transcode/force frame dimensions for motorola to ");
            A0P.append(i22);
            A0P.append("x");
            C000200d.A1F(A0P, i23);
        }
        int i24 = c1lm.A09;
        c1lm.A08 = i24;
        int i25 = c1lm.A06;
        c1lm.A07 = i25;
        if (str.startsWith("OMX.Nvidia.")) {
            c1lm.A08 = ((i24 + 15) / 16) << 4;
            c1lm.A07 = ((i25 + 15) / 16) << 4;
        }
        A09(str);
        if (c1lq != null && (str2 = c1lq.A05) != null && i > 0 && (i7 = c1lq.A01) > 0 && str2.equals(str) && i7 == i) {
            StringBuilder A0P2 = C000200d.A0P("videotranscoder/parseEncoderFormat/forcing frame conver color id=");
            int i26 = c1lq.A03;
            C000200d.A1F(A0P2, i26);
            c1lm.A05 = i26;
        } else {
            c1lm.A05 = A01(i);
            int i27 = Build.VERSION.SDK_INT;
            if (i27 == 16 && c1lm.A00 == 21) {
                String str3 = Build.MODEL;
                if (!str3.equals("GT-N7000") && !str3.equals("SAMSUNG-SGH-I777") && !str3.startsWith("GT-I9100") && !str3.startsWith("SHV-E210") && "OMX.SEC.avc.enc".equals(str)) {
                    c1lm.A05 = 4;
                    Log.i("videotranscoder/transcode/encoder workaround wrong color format for samsung to FRAMECONV_COLOR_FORMAT_NV21");
                    return c1lm;
                }
            }
            if ((i27 == 16 || i27 == 17) && i == 21 && ("OMX.k3.video.encoder.avc".equals(str) || "OMX.k3.video.decoder.avc".equals(str))) {
                c1lm.A05 = 4;
                Log.i("videotranscoder/transcode/encoder workaround wrong color format for huawei to FRAMECONV_COLOR_FORMAT_NV21");
                return c1lm;
            }
            String str4 = A0L;
            if (str4 != null && str4.toLowerCase(Locale.US).startsWith("mt6572")) {
                c1lm.A05 = 2;
                Log.i("workaround wrong color format for mt6572 to FRAMECONV_COLOR_FORMAT_YV12");
                return c1lm;
            }
        }
        return c1lm;
    }

    public static String A08(String str) {
        String str2 = "";
        try {
            Process start = new ProcessBuilder("/system/bin/getprop", str).redirectErrorStream(true).start();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    start.destroy();
                    return str2;
                }
                str2 = readLine;
            }
        } catch (IOException e) {
            Log.w("getsystemproperty/", e);
            return str2;
        }
    }

    public static void A09(String str) {
        if (A0L == null && "OMX.MTK.VIDEO.ENCODER.AVC".equals(str)) {
            String A08 = A08("ro.board.platform");
            A0L = A08;
            if (TextUtils.isEmpty(A08)) {
                A0L = A08("ro.mediatek.platform");
            }
            C000200d.A1N(C000200d.A0P("videotranscoder/setHwBoardPlatform/board/"), A0L);
        }
    }

    public static boolean A0A() {
        int i = Build.VERSION.SDK_INT;
        if (i == 16 && Build.MANUFACTURER.equals("samsung")) {
            String str = Build.MODEL;
            if (str.equals("GT-P3100") || str.equals("GT-P3110") || str.equals("GT-P3113") || str.equals("GT-P5100") || str.equals("GT-P5110") || str.equals("GT-P5113") || str.equals("GT-I9100G") || str.startsWith("GT-I8550") || str.startsWith("GT-I8552") || str.startsWith("GT-I8262") || str.startsWith("GT-I8260") || str.startsWith("GT-S6310") || str.startsWith("GT-S6312") || str.startsWith("GT-S6313")) {
                return false;
            }
        }
        if (i == 19) {
            if (Build.MANUFACTURER.equals("alps")) {
                return false;
            }
        } else if (i == 17 && Build.MANUFACTURER.equals("samsung")) {
            String str2 = Build.MODEL;
            if (str2.startsWith("GT-S7270") || str2.startsWith("GT-S7272") || str2.startsWith("GT-S7273") || str2.startsWith("GT-S7275")) {
                return false;
            }
        }
        String str3 = Build.MANUFACTURER;
        if (str3.equals("bq") && Build.DEVICE.startsWith("bq_Aquaris5")) {
            return false;
        }
        if (str3.equals("samsung") && Build.MODEL.equals("SM-G386F")) {
            return false;
        }
        return (str3.equals("Fly") && Build.MODEL.equals("FS504")) ? false : true;
    }

    public static boolean A0B(String str) {
        return "OMX.SEC.avc.enc".equals(str) || "OMX.SEC.avc.dec".equals(str) || "OMX.Exynos.AVC.Encoder".equals(str) || "OMX.Exynos.AVC.Decoder".equals(str);
    }

    public static boolean A0C(String str, boolean z) {
        if (str == null) {
            return false;
        }
        if ((!z && str.equals("OMX.google.h264.encoder")) || str.equals("OMX.ST.VFM.H264Enc") || str.equals("OMX.Exynos.avc.enc")) {
            return false;
        }
        if ((!str.equals("OMX.MARVELL.VIDEO.HW.CODA7542ENCODER") || Build.VERSION.SDK_INT >= 21) && !str.equals("OMX.MARVELL.VIDEO.H264ENCODER")) {
            if (str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && "QMobile".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT < 23) {
                Log.i("videotranscoder/ OMX.MTK.VIDEO.ENCODER.AVC on QMobile is not supported");
                return false;
            } else if (str.equals("OMX.allwinner.video.encoder.avc") || str.equals("AVCEncoder")) {
                C000200d.A18("videotranscoder/ ", str, " not supported");
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean A0D(String str, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        for (String str2 : strArr) {
            if (lowerCase.startsWith(str2.toLowerCase(locale))) {
                return true;
            }
        }
        return false;
    }

    public static int[] A0E(String str, int i) {
        if (i <= 0) {
            if (!str.equals("OMX.MTK.VIDEO.ENCODER.AVC") && !str.equals("OMX.MTK.VIDEO.DECODER.AVC")) {
                return A0N;
            }
            i = 2130706944;
        }
        int[] iArr = A0N;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        iArr2[0] = i;
        for (int i2 = 1; i2 < length; i2++) {
            int i3 = iArr[i2 - 1];
            iArr2[i2] = i3;
            if (i3 == i) {
                iArr2[i2] = 0;
            }
        }
        return iArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00f5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JA.A0F():void");
    }

    public void A0G() {
        try {
            File file = this.A0B;
            File file2 = this.A0I;
            long j = this.A02;
            long j2 = this.A03;
            StringBuilder A0S = C000200d.A0S("mp4ops/trim/start from ", j, " to ");
            A0S.append(j2);
            A0S.append(" size:");
            A0S.append(file.length());
            Log.i(A0S.toString());
            if ((j > 0 || j2 > 0) && j != j2) {
                float f = ((float) j) / 1000.0f;
                try {
                    Mp4Ops.LibMp4OperationResult mp4mux = Mp4Ops.mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), -1.0f, f, ((float) (j2 - j)) / 1000.0f, -1.0f, -1, file.getAbsolutePath(), f);
                    C000200d.A1V(C000200d.A0P("mp4ops/trim/result: "), mp4mux.success);
                    if (!mp4mux.success) {
                        C000200d.A1M(C000200d.A0P("mp4ops/trim/error_message/"), mp4mux.errorMessage);
                        if (mp4mux.ioException) {
                            throw new IOException("No space");
                        }
                        StringBuilder A0P = C000200d.A0P("invalid result, error_code: ");
                        int i = mp4mux.errorCode;
                        A0P.append(i);
                        throw new C04100In(i, A0P.toString(), new Throwable());
                    }
                    Log.i("mp4ops/trim/finished: size");
                    Mp4Ops.A04(file2, true);
                    return;
                } catch (Error e) {
                    Log.e("mp4ops/trim/failed: mp4mux error, exiting", e);
                    throw new C04100In(0, e.getMessage(), new Throwable());
                }
            }
            StringBuilder A0S2 = C000200d.A0S("timeFrom:", j, " timeTo:");
            A0S2.append(j2);
            throw new IllegalArgumentException(A0S2.toString());
        } catch (C04100In e2) {
            Log.e("videotranscodequeue/libmp4muxexception", e2);
            throw e2;
        }
    }

    public final void A0H() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0I.getAbsoluteFile());
        sb.append(".aac");
        File file = new File(sb.toString());
        this.A0A = file;
        C63072z1 c63072z1 = new C63072z1(this.A0B, file);
        c63072z1.A01 = this.A02;
        c63072z1.A02 = this.A03;
        c63072z1.A00 = 96000;
        C43731xs c43731xs = new C43731xs(c63072z1);
        c43731xs.A01 = new InterfaceC63092z4() { // from class: X.1hg
            {
                C0JA.this = this;
            }

            @Override // X.InterfaceC63092z4
            public final boolean ANQ(int i) {
                return C0JA.this.A0L();
            }
        };
        c43731xs.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x0403, code lost:
        if (r60.A08.ANQ(r4) != false) goto L183;
     */
    /* JADX WARN: Removed duplicated region for block: B:359:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0572 A[Catch: all -> 0x0694, LOOP:2: B:483:0x0570->B:484:0x0572, LOOP_END, TryCatch #35 {all -> 0x0694, blocks: (B:482:0x0567, B:484:0x0572, B:485:0x05a7, B:487:0x05c2, B:504:0x0641, B:506:0x064c, B:507:0x067f, B:508:0x0693, B:474:0x0510, B:476:0x051c, B:486:0x05b6), top: B:567:0x020a }] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x05cc A[Catch: all -> 0x06a5, TRY_ENTER, TRY_LEAVE, TryCatch #35 {all -> 0x06a5, blocks: (B:489:0x05cc, B:518:0x069d), top: B:544:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x064c A[Catch: all -> 0x0694, LOOP:3: B:505:0x064a->B:506:0x064c, LOOP_END, TryCatch #35 {all -> 0x0694, blocks: (B:482:0x0567, B:484:0x0572, B:485:0x05a7, B:487:0x05c2, B:504:0x0641, B:506:0x064c, B:507:0x067f, B:508:0x0693, B:474:0x0510, B:476:0x051c, B:486:0x05b6), top: B:567:0x020a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0I() {
        /*
            Method dump skipped, instructions count: 1745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JA.A0I():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:585:0x01dd, code lost:
        if (r9 < 0) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x01df, code lost:
        r14 = r27.getTrackFormat(r9);
        r13 = r14.getString("mime");
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x01ef, code lost:
        if ("video/unknown".equals(r13) != false) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x01f1, code lost:
        r27.selectTrack(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x01fa, code lost:
        if (r14.containsKey("durationUs") == false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x01fc, code lost:
        r16 = r14.getLong("durationUs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0200, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder format:");
        r2.append(r14.toString());
        r2.append(" duration:");
        r2.append(r16);
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0223, code lost:
        r16 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0226, code lost:
        r12 = android.media.MediaCodec.createDecoderByType(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x022a, code lost:
        if (r12 == null) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x022c, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder created");
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0235, code lost:
        if (android.os.Build.VERSION.SDK_INT != 17) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0237, code lost:
        r2 = android.os.Build.MANUFACTURER;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x023f, code lost:
        if (r2.equals("LGE") == false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0241, code lost:
        r2 = android.os.Build.MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0249, code lost:
        if (r2.startsWith("LG-D80") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0251, code lost:
        if (r2.startsWith("LG-VS980") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0259, code lost:
        if (r2.startsWith("VS980_4G") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0261, code lost:
        if (r2.startsWith("LG-F320") == false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0263, code lost:
        r9 = new X.C1LI(r4, r4);
        com.whatsapp.util.Log.i("videotranscoder/transcode/videooutputsurface created");
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0278, code lost:
        if (r2.equals("Amazon") == false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0282, code lost:
        if (android.os.Build.MODEL.startsWith("SD4930UR") == false) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0284, code lost:
        r9 = new X.C1LI(r4, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x028d, code lost:
        r2 = r9.A01;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0291, code lost:
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0293, code lost:
        r9 = null;
        r1 = null;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0296, code lost:
        r12.configure(r14, r2, r1, 0);
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder configured");
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x02a0, code lost:
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x02a1, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder failed to configure, will try different one ", r11);
        r12.release();
        r6 = new java.util.ArrayList();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x02b1, code lost:
        if (r5 < r8) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x02b3, code lost:
        r4 = android.media.MediaCodecList.getCodecInfoAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x02bb, code lost:
        if (r4.isEncoder() == false) goto L405;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x02bd, code lost:
        r3 = r4.getSupportedTypes();
        r25 = false;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x02c5, code lost:
        if (r2 < r3.length) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x02c7, code lost:
        if (r25 == false) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x02cf, code lost:
        if (r3[r2].equals(r13) != false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x02d1, code lost:
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x02d3, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x02d6, code lost:
        if (r25 == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x02d8, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder ");
        r2.append(r4.getName());
        r2.append(": ");
        r2.append(java.util.Arrays.deepToString(r3));
        com.whatsapp.util.Log.i(r2.toString());
        r6.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x02fd, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0304, code lost:
        if (r6.isEmpty() != false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0306, code lost:
        r5 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x030e, code lost:
        if (r5.hasNext() != false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0310, code lost:
        r4 = (android.media.MediaCodecInfo) r5.next();
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder/try ");
        r2.append(r4.getName());
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0338, code lost:
        if ("OMX.ittiam.video.decoder.avc".equals(r4.getName()) != false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x033a, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder/skip ");
        r2.append(r4.getName());
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0353, code lost:
        r3 = android.media.MediaCodec.createByCodecName(r4.getName());
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder ");
        r2.append(r4.getName());
        r2.append(" created");
        com.whatsapp.util.Log.i(r2.toString());
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0377, code lost:
        r3.configure(r14, (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder ");
        r2.append(r4.getName());
        r2.append(" is ok");
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0396, code lost:
        r3.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x039b, code lost:
        r12 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x039d, code lost:
        if (r12 == null) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x039f, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("videotranscoder/transcode/can't create decoder for ");
        r0.append(r13);
        com.whatsapp.util.Log.e(r0.toString());
        r1 = new java.lang.StringBuilder();
        r1.append("Can't create decoder for ");
        r1.append(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x03c7, code lost:
        throw new java.io.FileNotFoundException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x03c8, code lost:
        r12.start();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder started");
        r44 = r12.getInputBuffers();
        r43 = r12.getOutputBuffers();
        r2 = new android.media.MediaCodec.BufferInfo();
        r36 = new android.media.MediaCodec.BufferInfo();
        r3 = r69.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x03ec, code lost:
        if (r3 > 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x03ee, code lost:
        r27.seekTo(r3 * 1000, 0);
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/transcode/seek to:");
        r1.append(r69.A02 * 1000);
        r1.append(" actual:");
        r1.append(r27.getSampleTime());
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x041a, code lost:
        r25 = com.whatsapp.VideoFrameConverter.create();
        r1 = r69.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0420, code lost:
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0422, code lost:
        r48 = r1.A0B();
        r47 = android.graphics.Bitmap.createBitmap(r4, r4, android.graphics.Bitmap.Config.ARGB_8888);
        r69.A09.A06(r47, (360 - r30) % 360);
        r49 = java.nio.ByteBuffer.allocateDirect((r47.getWidth() * r47.getHeight()) << 2);
        r47.copyPixelsToBuffer(r49);
        com.whatsapp.VideoFrameConverter.setOverlay(r25, r49, 0, 0, r47.getWidth(), r47.getHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0466, code lost:
        r48 = false;
        r49 = null;
        r47 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x046c, code lost:
        r50 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x047c, code lost:
        if (r9 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0482, code lost:
        r50 = java.nio.ByteBuffer.allocateDirect((r4 << 2) * r4);
        com.whatsapp.VideoFrameConverter.configure(r25, 7, r4, r4, 0, 0, r4 - 1, r4 - 1, r1, r4, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x04a0, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x04a3, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x04a6, code lost:
        r1 = 0;
        r51 = false;
        r42 = 0;
        r54 = false;
        r55 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x04b1, code lost:
        if (r54 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x04b5, code lost:
        if (r69.A0J != false) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x04b7, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x04b9, code lost:
        if (r1 < 0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x04bb, code lost:
        r4 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x04c0, code lost:
        r4.append("videotranscoder/transcode/loop ");
        r4.append(r1);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x04cf, code lost:
        if (r51 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x04d4, code lost:
        r5 = r12.dequeueInputBuffer(com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x04d8, code lost:
        if (r1 < 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x04da, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/decoder/dequeue/input ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x04ee, code lost:
        if (r5 < 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x04f2, code lost:
        r6 = r27.readSampleData(r44[r5], 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x04fc, code lost:
        if (r6 < 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x04fe, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor BUFFER_FLAG_END_OF_STREAM");
        r12.queueInputBuffer(r5, 0, 0, 0, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x0513, code lost:
        if (r1 < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0515, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("videotranscoder/transcode/extractor/sample size:");
        r7.append(r6);
        r7.append(" time:");
        r7.append(r27.getSampleTime());
        com.whatsapp.util.Log.i(r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:686:0x0537, code lost:
        r12.queueInputBuffer(r5, 0, r6, r27.getSampleTime(), 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x054a, code lost:
        if (r1 < 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x054c, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/decoder/queue/input ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0560, code lost:
        r5 = r27.advance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:690:0x0566, code lost:
        if (r1 < 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0568, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/extractor/advance ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x057d, code lost:
        r51 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0582, code lost:
        r11 = r12.dequeueOutputBuffer(r2, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0586, code lost:
        if (r1 < 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x0588, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/decoder/dequeue/output ");
        r4.append(r11);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x059e, code lost:
        if (r11 >= 0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x05a9, code lost:
        if (r2.presentationTimeUs >= (r69.A02 * 1000)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x05ae, code lost:
        r6 = r29.dequeueInputBuffer(com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x05b4, code lost:
        if (r1 < 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x05b6, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/encoder/dequeue/input ");
        r4.append(r6);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:705:0x05ca, code lost:
        if (r6 >= 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x05cc, code lost:
        r15 = r20[r6];
        r15.clear();
        r5 = r69.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:707:0x05d3, code lost:
        if (r5 != null) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x05d7, code lost:
        r5.A05(r2.presentationTimeUs / 1000);
        r47.eraseColor(0);
        r69.A09.A06(r47, (360 - r30) % 360);
        r49.rewind();
        r3 = r47;
        r4 = r49;
        r3.copyPixelsToBuffer(r4);
        com.whatsapp.VideoFrameConverter.setOverlay(r25, r4, 0, 0, r3.getWidth(), r3.getHeight());
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x0616, code lost:
        if (r9 != null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x0618, code lost:
        r9.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x061c, code lost:
        r12.releaseOutputBuffer(r11, true);
        r7 = r9.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0621, code lost:
        monitor-enter(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0624, code lost:
        if (r9.A07 == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x0626, code lost:
        r7.wait(500);
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x062d, code lost:
        if (r9.A07 == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0636, code lost:
        throw new java.lang.RuntimeException("Surface frame wait timed out");
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0637, code lost:
        r9.A07 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x063b, code lost:
        X.C1LJ.A00("before updateTexImage");
        r9.A00.updateTexImage();
        r4 = r9.A02;
        r7 = r9.A00;
        X.C1LJ.A00("onDrawFrame start");
        r7.getTransformMatrix(r4.A08);
        android.opengl.GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glClear(16640);
        android.opengl.GLES20.glUseProgram(r4.A02);
        X.C1LJ.A00("glUseProgram");
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, r4.A03);
        r4.A06.position(0);
        android.opengl.GLES20.glVertexAttribPointer(r4.A00, 3, 5126, false, 20, (java.nio.Buffer) r4.A06);
        X.C1LJ.A00("glVertexAttribPointer maPosition");
        android.opengl.GLES20.glEnableVertexAttribArray(r4.A00);
        X.C1LJ.A00("glEnableVertexAttribArray aPositionHandle");
        r4.A06.position(3);
        android.opengl.GLES20.glVertexAttribPointer(r4.A01, 2, 5126, false, 20, (java.nio.Buffer) r4.A06);
        X.C1LJ.A00("glVertexAttribPointer aTextureHandle");
        android.opengl.GLES20.glEnableVertexAttribArray(r4.A01);
        X.C1LJ.A00("glEnableVertexAttribArray aTextureHandle");
        android.opengl.Matrix.setIdentityM(r4.A07, 0);
        android.opengl.GLES20.glUniformMatrix4fv(r4.A04, 1, false, r4.A07, 0);
        android.opengl.GLES20.glUniformMatrix4fv(r4.A05, 1, false, r4.A08, 0);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        X.C1LJ.A00("glDrawArrays");
        android.opengl.GLES20.glFinish();
        android.opengl.GLES20.glReadPixels(0, 0, r4, r4, 6407, 5121, r50);
        r4 = r50;
        r4.position(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x06f6, code lost:
        com.whatsapp.VideoFrameConverter.convertFrame(r25, r4, r15);
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x0701, code lost:
        r5 = r43[r11];
        r5.position(r2.offset);
        r5.limit(r2.offset + r2.size);
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x0716, code lost:
        if (r69.A04 == 0) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x071a, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("videotranscoder/transcode/convert decoderBufferInfo.offset:");
        r7.append(r2.offset);
        r7.append(" decoderBufferInfo.size:");
        r7.append(r2.size);
        r7.append(" decoderBufferInfo.presentationTimeUs:");
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x0738, code lost:
        r7.append(r2.presentationTimeUs);
        r7.append(" decoderBufferInfo.flags:");
        r7.append(r2.flags);
        r7.append(" encoderFrameSize:");
        r7.append(r21);
        com.whatsapp.util.Log.i(r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x075a, code lost:
        if (r69.A0D == null) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x075c, code lost:
        r3 = new byte[r5.remaining()];
        r5.get(r3);
        r69.A0D = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x0767, code lost:
        com.whatsapp.VideoFrameConverter.convertFrame(r25, r5, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x0774, code lost:
        if (r69.A04 == 0) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x0778, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/converted");
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x077d, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x077e, code lost:
        r29.queueInputBuffer(r6, 0, r21, r2.presentationTimeUs, r2.flags);
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x0797, code lost:
        if (r69.A04 == 0) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x079b, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder/queue/input");
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x07a0, code lost:
        r69.A04++;
        r5 = r2.presentationTimeUs;
     */
    /* JADX WARN: Code restructure failed: missing block: B:743:0x07ad, code lost:
        if (r5 > 0) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x07af, code lost:
        r69.A05 = r5 - (r69.A02 * 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x07b8, code lost:
        r3 = r69.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x07be, code lost:
        if (r3 > 0) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x07c0, code lost:
        r3 = r3 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x07c5, code lost:
        if (r5 > r3) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x07c7, code lost:
        r8 = new java.lang.StringBuilder();
        r8.append("videotranscoder/transcode/end time detected ");
        r8.append(r5);
        r8.append(" ");
        r8.append(r3);
        com.whatsapp.util.Log.i(r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:750:0x07e2, code lost:
        r52 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x07e5, code lost:
        r52 = 0;
        r54 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x07eb, code lost:
        if (r16 > 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x07ed, code lost:
        r7 = r69.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x07f1, code lost:
        if (r7 <= 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x07f3, code lost:
        r7 = 0;
        r13 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x07f8, code lost:
        r13 = 1000;
        r7 = r7 * 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:758:0x07fb, code lost:
        r5 = r69.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x07ff, code lost:
        if (r5 <= r52) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:760:0x0801, code lost:
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x0804, code lost:
        r5 = r5 * r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:762:0x0805, code lost:
        r5 = (int) (((r2.presentationTimeUs - r7) * 100) / (r5 - r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0810, code lost:
        if (r5 != r55) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0818, code lost:
        if (r69.A0J == false) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x081a, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x0821, code lost:
        if (r69.A08.ANQ(r5) != false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0823, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x0824, code lost:
        r69.A0J = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x0827, code lost:
        if (r5 < 5) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x082d, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("videotranscoder/transcode/progress ");
        r6.append(r5);
        r6.append(" frames:");
        r6.append(r69.A04);
        r6.append(" duration:");
        r6.append(r69.A05);
        com.whatsapp.util.Log.i(r6.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:776:0x0856, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0858, code lost:
        r55 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x085d, code lost:
        r5 = r29.dequeueOutputBuffer(r36, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:780:0x0865, code lost:
        if (r1 < 0) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x0867, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/encoder/dequeue/output ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:782:0x087b, code lost:
        if (r5 >= 0) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x087d, code lost:
        r6 = r19[r5];
        r6.position(r36.offset);
        r6.limit(r36.offset + r36.size);
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x0890, code lost:
        r18.write(r6);
        r6.clear();
        r29.releaseOutputBuffer(r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x089e, code lost:
        if (r1 < 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x08a0, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder/release/output");
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x08a7, code lost:
        if (r5 == (-3)) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x08a9, code lost:
        r19 = r29.getOutputBuffers();
     */
    /* JADX WARN: Code restructure failed: missing block: B:790:0x08af, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder output buffers have changed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x08b6, code lost:
        if (r5 == (-2)) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x08b8, code lost:
        r5 = r29.getOutputFormat();
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/encoder output format has changed to ");
        r4.append(r5);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x08d2, code lost:
        if (r15 == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x08d5, code lost:
        r42 = r42 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x08d7, code lost:
        if (r1 < 0) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:798:0x08d9, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append("videotranscoder/transcode/frame skipped ");
        r4.append(r42);
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x08ef, code lost:
        r12.releaseOutputBuffer(r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:800:0x08f3, code lost:
        if (r1 < 0) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x08f5, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder/release/output");
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x08fd, code lost:
        if (r11 == (-3)) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x08ff, code lost:
        r43 = r12.getOutputBuffers();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder output buffers have changed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x090b, code lost:
        if (r11 == (-2)) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x090d, code lost:
        r4 = A06(r12.getOutputFormat(), r24.getName(), r69.A07);
        r69.A06 = r4;
        r15 = r4.A00;
        r14 = r4.A09;
        r13 = r4.A06;
        r11 = r4.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x0925, code lost:
        r8 = r4.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x0927, code lost:
        r7 = r4.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x0929, code lost:
        r6 = r4.A01;
        r5 = r24.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x0933, code lost:
        if (A0B(r5) == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x0945, code lost:
        r13 = java.lang.Math.max(r4.A07, r13);
        r14 = java.lang.Math.max(r4.A08, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x0951, code lost:
        if (r9 == null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:818:0x0953, code lost:
        r5 = r4.A05;
        com.whatsapp.VideoFrameConverter.configure(r25, r5, r14, r13, r11, r7, r8, r6, r1, r4, r4);
        r4 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0973, code lost:
        if (r11 == (-1)) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x097b, code lost:
        if ((r2.flags & 4) == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x097d, code lost:
        com.whatsapp.util.Log.w("videotranscoder/transcode/decoder says try later after extractor finished");
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x0982, code lost:
        r54 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0985, code lost:
        r4.append("videotranscoder/transcode/configure frame converter from:(");
        r4.append(r15);
        r4.append("[");
        r4.append(r5);
        r4.append("] ");
        r4.append(r14);
        r4.append(" ");
        r4.append(r13);
        r4.append(" ");
        r4.append(r11);
        r4.append(" ");
        r4.append(r7);
        r4.append(" ");
        r4.append(r8);
        r4.append(" ");
        r4.append(r6);
        r4.append(")");
        r4.append(" to:(");
        r4.append(r4);
        r4.append("[");
        r4.append(r1);
        r4.append("] ");
        r4.append(r4);
        r4.append(" ");
        r4.append(r4);
        r4.append(")");
        com.whatsapp.util.Log.i(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x09f8, code lost:
        if ((r2.flags & 4) != 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x09fa, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder OutputBuffer BUFFER_FLAG_END_OF_STREAM");
        r54 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0a03, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x0a06, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x0a09, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x0a0c, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x0a0f, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("videotranscoder/transcode/decoder/dequeue/input < 0");
        r2.append(r5);
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0a25, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0a27, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0a29, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0a2b, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0a2d, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0a2f, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0a31, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x0a37, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0a38, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0a3a, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x0a3f, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0a41, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0a43, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0a45, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0a47, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0a49, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0a4b, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0a4d, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0a4f, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x0a51, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x0a53, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x0a55, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x0a57, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:887:0x0a59, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:889:0x0a5b, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:891:0x0a5d, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:893:0x0a5f, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:895:0x0a61, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:897:0x0a63, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:899:0x0a65, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:901:0x0a67, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:903:0x0a69, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x0a6b, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x0a6d, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x0a6f, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:911:0x0a71, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x0a73, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x0a75, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:917:0x0a77, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x0a79, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x0a7b, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x0a7d, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x0a7f, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x0a81, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:929:0x0a83, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:931:0x0a85, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:933:0x0a87, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:935:0x0a89, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:937:0x0a8b, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:939:0x0a8d, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:941:0x0a8f, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:943:0x0a91, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:945:0x0a93, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:947:0x0a95, code lost:
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:948:0x0a96, code lost:
        com.whatsapp.util.Log.e("videotranscoder/transcode", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:949:0x0a9b, code lost:
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:950:0x0a9c, code lost:
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:951:0x0a9d, code lost:
        r12.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder stopped");
        r12.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder released");
        r3 = r29.dequeueOutputBuffer(r36, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:952:0x0ab5, code lost:
        if (r3 >= 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:953:0x0ab7, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/transcode/encoder draining ");
        r1.append(r3);
        com.whatsapp.util.Log.i(r1.toString());
        r2 = r19[r3];
        r2.position(r36.offset);
        r2.limit(r36.offset + r36.size);
     */
    /* JADX WARN: Code restructure failed: missing block: B:954:0x0ada, code lost:
        r18.write(r2);
        r2.clear();
        r29.releaseOutputBuffer(r3, false);
        r3 = r29.dequeueOutputBuffer(r36, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:955:0x0aec, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder drained");
        r29.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder stopped");
        r29.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder released");
        r27.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:956:0x0b08, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:957:0x0b09, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:959:0x0b0c, code lost:
        r12.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder stopped");
        r12.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/decoder released");
        r3 = r29;
        r4 = r36;
        r2 = r3.dequeueOutputBuffer(r4, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:960:0x0b23, code lost:
        if (r2 >= 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:961:0x0b25, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("videotranscoder/transcode/encoder draining ");
        r3.append(r2);
        com.whatsapp.util.Log.i(r3.toString());
        r3 = r19[r2];
        r3.position(r4.offset);
        r3.limit(r4.offset + r4.size);
        r18.write(r3);
        r3.clear();
        r3 = r29;
        r3.releaseOutputBuffer(r2, false);
        r4 = r36;
        r2 = r3.dequeueOutputBuffer(r4, com.google.android.search.verification.client.SearchActionVerificationClientService.MS_TO_NS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:962:0x0b62, code lost:
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder drained");
        r3.stop();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder stopped");
        r3.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/encoder released");
        r27.release();
        com.whatsapp.util.Log.i("videotranscoder/transcode/extractor released");
        com.whatsapp.VideoFrameConverter.release(r25);
        r3 = new java.lang.StringBuilder();
        r3.append("videotranscoder/transcode/done cancelled:");
     */
    /* JADX WARN: Code restructure failed: missing block: B:963:0x0b88, code lost:
        r3.append(r69.A0J);
        r3.append(" frames:");
        r3.append(r69.A04);
        r3.append(" size:");
        r3.append(r69.A0C.length());
        r3.append(" duration:");
        r3.append(r69.A05);
        r3.append(" skipfirstframes:");
        r3.append(r42);
        com.whatsapp.util.Log.i(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:964:0x0bc0, code lost:
        if (r18 != null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:965:0x0bc2, code lost:
        r18.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:966:0x0bc5, code lost:
        r28.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:967:0x0bca, code lost:
        if (r69.A0J != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:973:0x0be4, code lost:
        if (r69.A05 == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:974:0x0be6, code lost:
        r69.A05 = java.util.concurrent.TimeUnit.SECONDS.toMicros(r69.A04) / 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:975:0x0bf3, code lost:
        r2 = X.C000200d.A0P("videotranscoder/transcode/finished: size:");
        r2.append(r69.A0C.length());
        com.whatsapp.util.Log.i(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:976:0x0c09, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:978:0x0c0f, code lost:
        throw new X.C83663sU();
     */
    /* JADX WARN: Code restructure failed: missing block: B:979:0x0c10, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:982:0x0c19, code lost:
        throw new java.lang.IllegalStateException("No decoders ", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:983:0x0c1a, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("videotranscoder/transcode/can't create decoder for ");
        r0.append(r13);
        com.whatsapp.util.Log.e(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:984:0x0c31, code lost:
        throw new X.C83663sU();
     */
    /* JADX WARN: Code restructure failed: missing block: B:985:0x0c32, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:986:0x0c33, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("videotranscoder/transcode/can't create decoder for ");
        r0.append(r13);
        com.whatsapp.util.Log.e(r0.toString(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:987:0x0c4a, code lost:
        throw new X.C83663sU();
     */
    /* JADX WARN: Code restructure failed: missing block: B:988:0x0c4b, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("videotranscoder/transcode/mime ");
        r1.append(r13);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:989:0x0c64, code lost:
        throw new X.C83663sU();
     */
    /* JADX WARN: Removed duplicated region for block: B:622:0x02b3 A[Catch: all -> 0x0c72, TRY_ENTER, TryCatch #44 {all -> 0x0c72, blocks: (B:578:0x018f, B:581:0x01a3, B:586:0x01df, B:588:0x01f1, B:590:0x01fc, B:591:0x0200, B:593:0x0226, B:595:0x022c, B:597:0x0237, B:599:0x0241, B:601:0x024b, B:603:0x0253, B:605:0x025b, B:607:0x0263, B:613:0x028d, B:617:0x0296, B:650:0x03c8, B:652:0x03ee, B:653:0x041a, B:655:0x0422, B:619:0x02a1, B:622:0x02b3, B:624:0x02bd, B:625:0x02c4, B:628:0x02c9, B:631:0x02d3, B:633:0x02d8, B:634:0x02fd, B:635:0x0300, B:637:0x0306, B:638:0x030a, B:640:0x0310, B:642:0x033a, B:643:0x0353, B:644:0x0377, B:645:0x0396, B:608:0x0272, B:610:0x027a, B:612:0x0284, B:584:0x01da), top: B:1024:0x018f, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0306 A[Catch: all -> 0x0c72, TryCatch #44 {all -> 0x0c72, blocks: (B:578:0x018f, B:581:0x01a3, B:586:0x01df, B:588:0x01f1, B:590:0x01fc, B:591:0x0200, B:593:0x0226, B:595:0x022c, B:597:0x0237, B:599:0x0241, B:601:0x024b, B:603:0x0253, B:605:0x025b, B:607:0x0263, B:613:0x028d, B:617:0x0296, B:650:0x03c8, B:652:0x03ee, B:653:0x041a, B:655:0x0422, B:619:0x02a1, B:622:0x02b3, B:624:0x02bd, B:625:0x02c4, B:628:0x02c9, B:631:0x02d3, B:633:0x02d8, B:634:0x02fd, B:635:0x0300, B:637:0x0306, B:638:0x030a, B:640:0x0310, B:642:0x033a, B:643:0x0353, B:644:0x0377, B:645:0x0396, B:608:0x0272, B:610:0x027a, B:612:0x0284, B:584:0x01da), top: B:1024:0x018f, inners: #23 }] */
    /* JADX WARN: Removed duplicated region for block: B:754:0x07ed A[Catch: all -> 0x0a47, Exception -> 0x0a49, TryCatch #58 {Exception -> 0x0a49, all -> 0x0a47, blocks: (B:744:0x07af, B:745:0x07b8, B:747:0x07c0, B:749:0x07c7, B:754:0x07ed, B:758:0x07fb, B:762:0x0805, B:764:0x0812, B:766:0x0816, B:768:0x081a, B:771:0x0824, B:773:0x0829, B:775:0x082d, B:761:0x0804, B:757:0x07f8), top: B:1077:0x07af }] */
    /* JADX WARN: Removed duplicated region for block: B:801:0x08f5 A[Catch: all -> 0x0a6f, Exception -> 0x0a71, TryCatch #69 {Exception -> 0x0a71, all -> 0x0a6f, blocks: (B:784:0x0890, B:786:0x08a0, B:799:0x08ef, B:801:0x08f5, B:789:0x08a9, B:793:0x08b8, B:796:0x08d5, B:798:0x08d9, B:804:0x08ff), top: B:1055:0x0890 }] */
    /* JADX WARN: Removed duplicated region for block: B:953:0x0ab7 A[Catch: all -> 0x0b09, TRY_LEAVE, TryCatch #64 {all -> 0x0b09, blocks: (B:951:0x0a9d, B:953:0x0ab7), top: B:1034:0x0a9d }] */
    /* JADX WARN: Removed duplicated region for block: B:981:0x0c12 A[Catch: all -> 0x0c70, TRY_ENTER, TryCatch #43 {all -> 0x0c70, blocks: (B:963:0x0b88, B:648:0x039f, B:649:0x03c7, B:981:0x0c12, B:982:0x0c19, B:983:0x0c1a, B:984:0x0c31, B:986:0x0c33, B:987:0x0c4a, B:988:0x0c4b, B:989:0x0c64, B:990:0x0c65, B:991:0x0c6f, B:593:0x0226), top: B:1023:0x01a1, inners: #16 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0J() {
        /*
            Method dump skipped, instructions count: 3232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JA.A0J():void");
    }

    public void A0K(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, VideoFrameConverter videoFrameConverter, AbstractC40861sz abstractC40861sz, ByteBuffer byteBuffer, int i, long j, int i2) {
        StringBuilder sb = new StringBuilder("videotranscoder/handleLastFrame/");
        sb.append(i);
        Log.i(sb.toString());
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(SearchActionVerificationClientService.MS_TO_NS);
        ByteBuffer byteBuffer2 = byteBufferArr[dequeueInputBuffer];
        byteBuffer2.clear();
        VideoFrameConverter.convertFrame(videoFrameConverter.A00, byteBuffer, byteBuffer2);
        int i3 = ((C40851sy) abstractC40861sz).A01.getFrameDurations()[i];
        if (i3 < 70) {
            i3 = 70;
        }
        long j2 = j + (i3 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i2, j2, 4);
        this.A04++;
        this.A05 = j2 - (this.A02 * 1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000d, code lost:
        if (r2.A08.ANQ(100) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean A0L() {
        /*
            r2 = this;
            boolean r0 = r2.A0J
            if (r0 != 0) goto Lf
            X.2z4 r1 = r2.A08
            r0 = 100
            boolean r1 = r1.ANQ(r0)
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r2.A0J = r0
            boolean r0 = r2.A0J
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0JA.A0L():boolean");
    }

    @Override // X.InterfaceC43741xt
    public boolean AEV() {
        return this.A0C != null;
    }

    @Override // X.InterfaceC43741xt
    public void cancel() {
        this.A0J = true;
    }
}
