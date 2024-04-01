package X;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;

/* renamed from: X.0bz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08740bz {
    public static final boolean A00;
    public static final int[] A01;
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;
    public static final int[] A08;
    public static final int[] A09;

    static {
        A00 = Build.VERSION.SDK_INT >= 21;
        A04 = new int[]{16842919};
        A02 = new int[]{16843623, 16842908};
        A01 = new int[]{16842908};
        A03 = new int[]{16843623};
        A08 = new int[]{16842913, 16842919};
        A06 = new int[]{16842913, 16843623, 16842908};
        A05 = new int[]{16842913, 16842908};
        A07 = new int[]{16842913, 16843623};
        A09 = new int[]{16842913};
    }

    public static int A00(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        return A00 ? C09990f7.A03(i, Math.min(Color.alpha(i) << 1, 255)) : i;
    }

    public static ColorStateList A01(ColorStateList colorStateList) {
        if (A00) {
            return new ColorStateList(new int[][]{A09, StateSet.NOTHING}, new int[]{A00(colorStateList, A08), A00(colorStateList, A04)});
        }
        int[] iArr = A08;
        int[] iArr2 = A06;
        int[] iArr3 = A05;
        int[] iArr4 = A07;
        int[] iArr5 = A04;
        int[] iArr6 = A02;
        int[] iArr7 = A01;
        int[] iArr8 = A03;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, A09, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{A00(colorStateList, iArr), A00(colorStateList, iArr2), A00(colorStateList, iArr3), A00(colorStateList, iArr4), 0, A00(colorStateList, iArr5), A00(colorStateList, iArr6), A00(colorStateList, iArr7), A00(colorStateList, iArr8), 0});
    }
}
