package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.10I  reason: invalid class name */
/* loaded from: classes.dex */
public final class C10I {
    public static int A00 = -1;
    public static final SparseIntArray A01;
    public static final SparseIntArray A02;
    public static final SparseIntArray A03;
    public static final Map A05;
    public static final Pattern A06 = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap A04 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        A01 = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("L30", 1);
        Map map = A05;
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", Integer.valueOf((int) EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING));
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", Integer.valueOf((int) C42271vT.A09));
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        A03 = sparseIntArray3;
        sparseIntArray3.put(1, 1);
        sparseIntArray3.put(2, 2);
        sparseIntArray3.put(3, 3);
        sparseIntArray3.put(4, 4);
        sparseIntArray3.put(5, 5);
        sparseIntArray3.put(6, 6);
        sparseIntArray3.put(17, 17);
        sparseIntArray3.put(20, 20);
        sparseIntArray3.put(23, 23);
        sparseIntArray3.put(29, 29);
        sparseIntArray3.put(39, 39);
        sparseIntArray3.put(42, 42);
    }

    public static int A00() {
        C10A c10a;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2 = A00;
        if (i2 == -1) {
            i2 = 0;
            List A032 = A03("video/avc", false);
            if (!A032.isEmpty() && (c10a = (C10A) A032.get(0)) != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c10a.A00;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = codecProfileLevelArr[i2].level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case 1024:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                    i2++;
                }
                i2 = Math.max(i3, C08M.A00 >= 21 ? 345600 : 172800);
            }
            A00 = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r0 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r0 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        if (r0 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (r0 == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair A01(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10I.A01(java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x01fa, code lost:
        if ("OMX.MTK.AUDIO.DECODER.DSPAC3".equals(r5) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0255, code lost:
        if (r22.A01 == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0203 A[Catch: Exception -> 0x02ee, TryCatch #1 {Exception -> 0x02ee, blocks: (B:2:0x0000, B:4:0x0016, B:7:0x0026, B:10:0x0030, B:12:0x0036, B:14:0x003e, B:16:0x0046, B:18:0x004e, B:20:0x0056, B:22:0x005e, B:133:0x0203, B:135:0x020b, B:171:0x029b, B:174:0x02a3, B:176:0x02a9, B:180:0x02cb, B:181:0x02ec, B:177:0x02c2, B:178:0x02c6, B:27:0x006c, B:29:0x0074, B:31:0x007e, B:33:0x0088, B:38:0x0097, B:40:0x009f, B:42:0x00a9, B:44:0x00b1, B:46:0x00b9, B:48:0x00c1, B:50:0x00c9, B:52:0x00d1, B:54:0x00d9, B:56:0x00e1, B:58:0x00e9, B:60:0x00f1, B:62:0x00f9, B:66:0x0106, B:68:0x010e, B:70:0x0118, B:72:0x0120, B:74:0x0128, B:79:0x0139, B:81:0x0141, B:83:0x0149, B:85:0x0151, B:87:0x015b, B:89:0x0163, B:91:0x016b, B:93:0x0173, B:95:0x017b, B:97:0x0183, B:99:0x018b, B:104:0x019b, B:106:0x01a3, B:108:0x01ab, B:110:0x01b5, B:112:0x01bd, B:114:0x01c3, B:116:0x01cb, B:120:0x01d7, B:122:0x01df, B:125:0x01e9, B:127:0x01f3), top: B:188:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x024a A[Catch: Exception -> 0x024f, TryCatch #0 {Exception -> 0x024f, blocks: (B:139:0x0221, B:141:0x022b, B:143:0x0233, B:145:0x023b, B:150:0x024a), top: B:186:0x0221 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a3 A[Catch: Exception -> 0x02ee, TRY_ENTER, TryCatch #1 {Exception -> 0x02ee, blocks: (B:2:0x0000, B:4:0x0016, B:7:0x0026, B:10:0x0030, B:12:0x0036, B:14:0x003e, B:16:0x0046, B:18:0x004e, B:20:0x0056, B:22:0x005e, B:133:0x0203, B:135:0x020b, B:171:0x029b, B:174:0x02a3, B:176:0x02a9, B:180:0x02cb, B:181:0x02ec, B:177:0x02c2, B:178:0x02c6, B:27:0x006c, B:29:0x0074, B:31:0x007e, B:33:0x0088, B:38:0x0097, B:40:0x009f, B:42:0x00a9, B:44:0x00b1, B:46:0x00b9, B:48:0x00c1, B:50:0x00c9, B:52:0x00d1, B:54:0x00d9, B:56:0x00e1, B:58:0x00e9, B:60:0x00f1, B:62:0x00f9, B:66:0x0106, B:68:0x010e, B:70:0x0118, B:72:0x0120, B:74:0x0128, B:79:0x0139, B:81:0x0141, B:83:0x0149, B:85:0x0151, B:87:0x015b, B:89:0x0163, B:91:0x016b, B:93:0x0173, B:95:0x017b, B:97:0x0183, B:99:0x018b, B:104:0x019b, B:106:0x01a3, B:108:0x01ab, B:110:0x01b5, B:112:0x01bd, B:114:0x01c3, B:116:0x01cb, B:120:0x01d7, B:122:0x01df, B:125:0x01e9, B:127:0x01f3), top: B:188:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0253 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02cb A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList A02(X.C10D r22, X.C10F r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10I.A02(X.10D, X.10F, java.lang.String):java.util.ArrayList");
    }

    public static synchronized List A03(String str, final boolean z) {
        synchronized (C10I.class) {
            C10D c10d = new C10D(str, z);
            HashMap hashMap = A04;
            List list = (List) hashMap.get(c10d);
            if (list != null) {
                return list;
            }
            int i = C08M.A00;
            C10F c10f = i >= 21 ? new C10F(z) { // from class: X.1ZY
                public MediaCodecInfo[] A00;
                public final int A01;

                @Override // X.C10F
                public boolean ASH() {
                    return true;
                }

                {
                    this.A01 = z ? 1 : 0;
                }

                @Override // X.C10F
                public int A8x() {
                    MediaCodecInfo[] mediaCodecInfoArr = this.A00;
                    if (mediaCodecInfoArr == null) {
                        mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
                        this.A00 = mediaCodecInfoArr;
                    }
                    return mediaCodecInfoArr.length;
                }

                @Override // X.C10F
                public MediaCodecInfo A8y(int i2) {
                    MediaCodecInfo[] mediaCodecInfoArr = this.A00;
                    if (mediaCodecInfoArr == null) {
                        mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
                        this.A00 = mediaCodecInfoArr;
                    }
                    return mediaCodecInfoArr[i2];
                }

                @Override // X.C10F
                public boolean AFk(String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
                    return codecCapabilities.isFeatureSupported("secure-playback");
                }
            } : new C10F() { // from class: X.1ZX
                @Override // X.C10F
                public boolean ASH() {
                    return false;
                }

                @Override // X.C10F
                public int A8x() {
                    return MediaCodecList.getCodecCount();
                }

                @Override // X.C10F
                public MediaCodecInfo A8y(int i2) {
                    return MediaCodecList.getCodecInfoAt(i2);
                }

                @Override // X.C10F
                public boolean AFk(String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
                    return "video/avc".equals(str2);
                }
            };
            ArrayList A022 = A02(c10d, c10f, str);
            if (z && A022.isEmpty() && 21 <= i && i <= 23) {
                c10f = new C10F() { // from class: X.1ZX
                    @Override // X.C10F
                    public boolean ASH() {
                        return false;
                    }

                    @Override // X.C10F
                    public int A8x() {
                        return MediaCodecList.getCodecCount();
                    }

                    @Override // X.C10F
                    public MediaCodecInfo A8y(int i2) {
                        return MediaCodecList.getCodecInfoAt(i2);
                    }

                    @Override // X.C10F
                    public boolean AFk(String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
                        return "video/avc".equals(str2);
                    }
                };
                A022 = A02(c10d, c10f, str);
                if (!A022.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(((C10A) A022.get(0)).A02);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                A022.addAll(A02(new C10D("audio/eac3", c10d.A01), c10f, str));
            }
            if ("audio/raw".equals(str)) {
                Collections.sort(A022, new Comparator() { // from class: X.10H
                    public static int A00(C10A c10a) {
                        String str2 = c10a.A02;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return -1;
                        }
                        return (C08M.A00 >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
                    }

                    @Override // java.util.Comparator
                    public int compare(Object obj, Object obj2) {
                        return A00((C10A) obj) - A00((C10A) obj2);
                    }
                });
            } else if (i < 21 && A022.size() > 1) {
                String str2 = ((C10A) A022.get(0)).A02;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    Collections.sort(A022, new Comparator() { // from class: X.10G
                        @Override // java.util.Comparator
                        public int compare(Object obj, Object obj2) {
                            return (((C10A) obj).A02.startsWith("OMX.google") ? -1 : 0) - (((C10A) obj2).A02.startsWith("OMX.google") ? -1 : 0);
                        }
                    });
                }
            }
            List unmodifiableList = Collections.unmodifiableList(A022);
            hashMap.put(c10d, unmodifiableList);
            return unmodifiableList;
        }
    }
}
