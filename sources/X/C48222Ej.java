package X;

import android.content.Context;
import android.graphics.Typeface;
import java.util.Random;

/* renamed from: X.2Ej  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48222Ej {
    public static final Random A00 = new Random();
    public static final int[] A01 = {-5886863, -7296959, -4087745, -8838856, -5339276, -1002704, -4803801, -3760180, -7640688, -30068, -11222427, -33941, -14236452, -11023873, -9148566, -8482653, -11102465, -9558658, -8729691, -14404032, -8219446};
    public static final int[] A02 = {0, 1, 2, 3, 5};

    public static int A00() {
        int[] iArr = A01;
        return iArr[Math.abs(A00.nextInt()) % iArr.length];
    }

    public static int A01(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static Typeface A02(Context context, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        return Typeface.SANS_SERIF;
                    }
                    return C67883Hf.A00(context);
                }
                Typeface typeface = C67883Hf.A0C;
                if (typeface == null) {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/Bryndan-Write.ttf");
                    C67883Hf.A0C = createFromAsset;
                    return createFromAsset;
                }
                return typeface;
            }
            return C67883Hf.A01(context);
        }
        return Typeface.SERIF;
    }

    public static String A03(String str) {
        C43931yF c43931yF = new C43931yF(str);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            i2 = str.charAt(i) == '\n' ? i2 + 50 : i2 + 1;
            if (i2 > 700) {
                break;
            }
            i += c43931yF.A01(i);
        }
        return str.substring(0, i);
    }
}
