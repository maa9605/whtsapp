package X;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: X.0ut  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C19120ut {
    public static final boolean A00;
    public static final byte[] A01;
    public static final byte[] A02;

    static {
        int i = Build.VERSION.SDK_INT;
        A00 = i <= 17;
        if (i >= 17 && i == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        }
        A02 = A01("RIFF");
        A01 = A01("WEBP");
        A01("VP8 ");
        A01("VP8L");
        A01("VP8X");
    }

    public static boolean A00(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (i2 < 20 || (bArr2 = A02) == null || bArr == null) {
            return false;
        }
        int length = bArr2.length;
        int i3 = length + i;
        int length2 = bArr.length;
        if (i3 <= length2) {
            for (int i4 = 0; i4 < length; i4++) {
                if (bArr[i4 + i] != bArr2[i4]) {
                    return false;
                }
            }
            int i5 = i + 8;
            byte[] bArr3 = A01;
            if (bArr3 == null || bArr == null) {
                return false;
            }
            int length3 = bArr3.length;
            if (length3 + i5 <= length2) {
                for (int i6 = 0; i6 < length3; i6++) {
                    if (bArr[i6 + i5] != bArr3[i6]) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static byte[] A01(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
