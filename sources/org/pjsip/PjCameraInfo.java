package org.pjsip;

import X.C000200d;
import X.C0EW;
import X.C50882Tp;
import X.C50902Tr;
import X.C74733dl;
import android.os.Build;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.pjsip.PjCameraInfo;

/* loaded from: classes2.dex */
public final class PjCameraInfo {
    public static final Comparator CAMERA_SIZE_COMPARATOR = new Comparator() { // from class: X.3ef
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return PjCameraInfo.lambda$static$183((C50902Tr) obj, (C50902Tr) obj2);
        }
    };
    public final int facing;
    public final int orient;
    public final int[] supportedFormat;
    public final int[] supportedSize;

    public PjCameraInfo(int i, int i2, int[] iArr, int[] iArr2) {
        this.facing = i;
        this.orient = i2;
        this.supportedSize = iArr;
        this.supportedFormat = iArr2;
    }

    public static int[] SizeListToIntArray(List list) {
        int[] iArr = new int[list.size() << 1];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C50902Tr c50902Tr = (C50902Tr) it.next();
            int i2 = i + 1;
            iArr[i] = c50902Tr.A01;
            i = i2 + 1;
            iArr[i2] = c50902Tr.A00;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PjCameraInfo createFromRawInfo(C50882Tp c50882Tp, C0EW c0ew) {
        int[] iArr;
        int[] iArr2 = c50882Tp.A05;
        int[] copyOf = Arrays.copyOf(iArr2, iArr2.length);
        int[] encoderSupportedColorFormats = getEncoderSupportedColorFormats(c0ew);
        boolean z = false;
        for (int i = 0; i < encoderSupportedColorFormats.length && !z; i++) {
            int i2 = encoderSupportedColorFormats[i];
            int i3 = 0;
            while (true) {
                if (i3 >= copyOf.length) {
                    break;
                } else if (copyOf[i3] == i2) {
                    copyOf[i3] = copyOf[0];
                    copyOf[0] = i2;
                    StringBuilder A0P = C000200d.A0P("voip/video/PJCameraInfo preferred formats ");
                    A0P.append(Arrays.toString(encoderSupportedColorFormats));
                    A0P.append(", ");
                    A0P.append(i2);
                    A0P.append(" is available .");
                    Log.i(A0P.toString());
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        boolean z2 = c50882Tp.A04;
        List list = c50882Tp.A03;
        Pair pair = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.isEmpty()) {
                int i4 = 640;
                int i5 = 480;
                if (C74733dl.A00) {
                    i4 = 320;
                    i5 = 240;
                }
                if (!c0ew.A04().getBoolean("disable_device_specific_camera_size", false) && (pair = deviceSpecificSize(z2)) != null) {
                    i4 = ((Number) pair.first).intValue();
                    i5 = ((Number) pair.second).intValue();
                }
                if (z2) {
                    if (c0ew.A0B()) {
                        i4 = c0ew.A04().getInt("video_call_front_camera_width", i4);
                        i5 = c0ew.A04().getInt("video_call_front_camera_height", i5);
                    }
                } else if (c0ew.A0A()) {
                    i4 = c0ew.A04().getInt("video_call_back_camera_width", i4);
                    i5 = c0ew.A04().getInt("video_call_back_camera_height", i5);
                }
                C50902Tr c50902Tr = c50882Tp.A02;
                C50902Tr c50902Tr2 = c50902Tr;
                if (c50902Tr != null) {
                    int i6 = c50902Tr.A00 * c50902Tr.A01;
                    c50902Tr2 = c50902Tr;
                    if (i6 <= 307200) {
                        c50902Tr2 = arrayList.get(0);
                    }
                }
                Collections.sort(arrayList, CAMERA_SIZE_COMPARATOR);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C50902Tr) it.next()).A01 == 720) {
                        it.remove();
                    }
                }
                int i7 = -1;
                int i8 = -1;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    C50902Tr c50902Tr3 = (C50902Tr) arrayList.get(i9);
                    if (c50902Tr3.equals(c50902Tr2)) {
                        i8 = i9;
                    }
                    if (c50902Tr3.A01 == i4 && (i7 < 0 || Math.abs(c50902Tr3.A00 - i5) < Math.abs(((C50902Tr) arrayList.get(i7)).A00 - i5))) {
                        i7 = i9;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (i7 >= 0) {
                    arrayList2.add(arrayList.get(i7));
                } else if (i8 >= 0) {
                    arrayList2.add(c50902Tr2);
                } else {
                    arrayList2.addAll(arrayList);
                }
                if (!arrayList2.isEmpty() && pair == null) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        C50902Tr c50902Tr4 = (C50902Tr) arrayList.get(i10);
                        if (c50902Tr4.A01 * ((C50902Tr) arrayList2.get(0)).A00 == c50902Tr4.A00 * ((C50902Tr) arrayList2.get(0)).A01) {
                            arrayList2.add(c50902Tr4);
                        }
                    }
                }
                iArr = SizeListToIntArray(arrayList2);
                return new PjCameraInfo(z2 ? 1 : 0, c50882Tp.A01, iArr, copyOf);
            }
        }
        Log.i("voip/video/PJCameraInfo previewSizes is null, use 640x480 by default.");
        iArr = new int[]{640, 480};
        return new PjCameraInfo(z2 ? 1 : 0, c50882Tp.A01, iArr, copyOf);
    }

    public static Pair deviceSpecificSize(boolean z) {
        String str = Build.MANUFACTURER;
        if ("asus".equalsIgnoreCase(str)) {
            if (z && Build.VERSION.SDK_INT == 19) {
                return new Pair(1024, 768);
            }
            return null;
        } else if ("samsung".equalsIgnoreCase(str)) {
            return new Pair(1280, 720);
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r1.equalsIgnoreCase("ks01lte") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r1.startsWith("hwG") != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] getEncoderSupportedColorFormats(X.C0EW r4) {
        /*
            android.content.SharedPreferences r2 = r4.A04()
            r1 = -1
            java.lang.String r0 = "video_encoder_frame_convertor_color_id"
            int r3 = r2.getInt(r0, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)
            r4 = 1
            if (r0 == 0) goto L44
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "MSM8960"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "universal7580"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "xcover3lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "ks01lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L44
        L3a:
            r2 = 1
        L3b:
            r1 = 3
            if (r2 == 0) goto L62
            int[] r0 = new int[r1]
            r0 = {x0084: FILL_ARRAY_DATA  , data: [17, 35, 842094169} // fill-array
            return r0
        L44:
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "7x27"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L3a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "hwY"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "hwG"
            boolean r0 = r1.startsWith(r0)
            r2 = 0
            if (r0 == 0) goto L3b
            goto L3a
        L62:
            if (r3 != r4) goto L6a
            int[] r0 = new int[r1]
            r0 = {x008e: FILL_ARRAY_DATA  , data: [35, 842094169, 17} // fill-array
            return r0
        L6a:
            r0 = 2
            if (r3 != r0) goto L73
            int[] r0 = new int[r1]
            r0 = {x0098: FILL_ARRAY_DATA  , data: [842094169, 35, 17} // fill-array
            return r0
        L73:
            if (r3 == r1) goto L7e
            r0 = 4
            if (r3 == r0) goto L7e
            int[] r0 = new int[r1]
            r0 = {x00a2: FILL_ARRAY_DATA  , data: [35, 842094169, 17} // fill-array
            return r0
        L7e:
            int[] r0 = new int[r1]
            r0 = {x00ac: FILL_ARRAY_DATA  , data: [17, 35, 842094169} // fill-array
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.getEncoderSupportedColorFormats(X.0EW):int[]");
    }

    public static /* synthetic */ int lambda$static$183(C50902Tr c50902Tr, C50902Tr c50902Tr2) {
        int i = c50902Tr.A01;
        int i2 = c50902Tr2.A01;
        if (i > i2) {
            return -1;
        }
        if (i == i2) {
            int i3 = c50902Tr2.A00;
            int i4 = c50902Tr.A00;
            if (i3 == i4) {
                return 0;
            }
            return i3 < i4 ? -1 : 1;
        }
        return 1;
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("facing ");
        A0P.append(this.facing == 0 ? "back" : "front");
        A0P.append(", orientation: ");
        A0P.append(this.orient);
        A0P.append(", returned preview formats: ");
        A0P.append(Arrays.toString(this.supportedFormat));
        A0P.append(", returned preview size: ");
        A0P.append(Arrays.toString(this.supportedSize));
        return A0P.toString();
    }
}
