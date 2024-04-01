package com.whatsapp.filter;

import X.C000200d;
import X.C2JQ;
import X.C44011yN;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class FilterUtils {
    public static native boolean applyFilter(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean applyFilterIntoBuffer(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

    public static native boolean blurNative(Bitmap bitmap, int i, int i2);

    public static Bitmap A00(int i, C44011yN c44011yN) {
        String str = C2JQ.A00(i).A02;
        synchronized (c44011yN) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            if (!c44011yN.A0I()) {
                C000200d.A13("DownloadableUtils/reportCriticalEventIfBeta", "FilterManager/Downloadable files are not ready and createLut is called, ui should have prevented calling this");
                c44011yN.A0M(null, c44011yN.A0G(), 0);
                return null;
            }
            File file = (File) c44011yN.A0L().get(str);
            if (file != null && file.exists()) {
                try {
                    try {
                        return BitmapFactory.decodeStream(new FileInputStream(file), null, options);
                    } finally {
                    }
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FilterManager/createLut/Could not get bitmap from downloaded file for ");
                    sb.append(file.getName());
                    Log.e(sb.toString(), e);
                    return null;
                }
            } else {
                c44011yN.A0B(null);
                c44011yN.A08(0, 0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FilterManager/createLut/Error getting downloaded file to compute bitmap for filterFileName=");
                sb2.append(str);
                Log.e(sb2.toString());
                return null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r6 >= X.C2JQ.A00.size()) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap A01(android.graphics.Bitmap r5, int r6, boolean r7, X.C44011yN r8) {
        /*
            r4 = 0
            if (r5 != 0) goto L9
            java.lang.String r0 = "FilterUtils/applyFilter/source is null"
            com.whatsapp.util.Log.e(r0)
            return r4
        L9:
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r3) goto L17
            java.lang.String r0 = "Invalid bitmap config."
            com.whatsapp.util.Log.e(r0)
            return r4
        L17:
            if (r6 < 0) goto L22
            java.util.List r0 = X.C2JQ.A00
            int r1 = r0.size()
            r0 = 1
            if (r6 < r1) goto L23
        L22:
            r0 = 0
        L23:
            if (r0 != 0) goto L2b
            java.lang.String r0 = "FilterUtils/applyFilter/filterId is invalid"
            com.whatsapp.util.Log.e(r0)
            return r4
        L2b:
            android.graphics.Bitmap r2 = A00(r6, r8)     // Catch: java.lang.OutOfMemoryError -> L39
            if (r7 == 0) goto L41
            r0 = 1
            android.graphics.Bitmap r5 = r5.copy(r3, r0)     // Catch: java.lang.OutOfMemoryError -> L37
            goto L41
        L37:
            r1 = move-exception
            goto L3b
        L39:
            r1 = move-exception
            r2 = r4
        L3b:
            java.lang.String r0 = "FilterUtils/applyFilter/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)
            r5 = r4
        L41:
            if (r5 == 0) goto L51
            if (r2 == 0) goto L51
            boolean r0 = applyFilter(r2, r5)
        L49:
            if (r2 == 0) goto L4e
            r2.recycle()
        L4e:
            if (r0 == 0) goto L53
            return r5
        L51:
            r0 = 0
            goto L49
        L53:
            if (r7 == 0) goto L5a
            if (r5 == 0) goto L5a
            r5.recycle()
        L5a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUtils.A01(android.graphics.Bitmap, int, boolean, X.1yN):android.graphics.Bitmap");
    }

    public static boolean A02(Bitmap bitmap, Bitmap bitmap2, int i, C44011yN c44011yN) {
        if (bitmap == null) {
            Log.e("FilterUtils/applyFilterIntoBuffer/sourceImage is null");
            return false;
        } else if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            Log.e("Invalid sourceImage config.");
            return false;
        } else if (bitmap2 == null) {
            Log.e("FilterUtils/applyFilterIntoBuffer/destinationBuffer is null");
            return false;
        } else if (i >= 0 && i < C2JQ.A00.size()) {
            Log.a(bitmap2.isMutable());
            try {
                Bitmap A00 = A00(i, c44011yN);
                if (A00 != null) {
                    boolean applyFilterIntoBuffer = applyFilterIntoBuffer(A00, bitmap, bitmap2);
                    A00.recycle();
                    return applyFilterIntoBuffer;
                }
            } catch (OutOfMemoryError e) {
                Log.e("FilterUtils/applyFilterIntoBuffer/OutOfMemoryError", e);
            }
            return false;
        } else {
            Log.e("FilterUtils/applyFilterIntoBuffer/filterId is invalid");
            return false;
        }
    }
}
