package X;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: X.0w6  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0w6 {
    public static int A00(Bitmap.Config config) {
        int i = C19800w5.A00[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return 2;
                }
                if (i == 5) {
                    return 8;
                }
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
            }
            return 1;
        }
        return 4;
    }

    public static int A01(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT > 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getByteCount();
    }
}
