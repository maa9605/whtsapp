package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;

/* renamed from: X.0s9  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17470s9 {
    public static final int[][] A00 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    public static ColorStateList A00(Context context, Integer num, Integer num2) {
        int color;
        int i;
        if (num != null) {
            color = num.intValue();
        } else {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843818});
            color = obtainStyledAttributes.getColor(0, -7829368);
            obtainStyledAttributes.recycle();
        }
        TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{16842800});
        int color2 = obtainStyledAttributes2.getColor(0, -7829368);
        obtainStyledAttributes2.recycle();
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = color2;
        }
        int A03 = C09990f7.A03(color2, Math.round(Color.alpha(color2) * 0.25f));
        return new ColorStateList(A00, new int[]{color, i, A03, A03});
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r5 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList A01(android.content.Context r5, java.lang.Integer r6, java.lang.Integer r7) {
        /*
            r4 = 1
            r3 = 0
            if (r6 == 0) goto L53
            int r0 = r6.intValue()
        L8:
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int[] r2 = new int[r4]
            int r1 = X.C18240tP.colorSwitchThumbNormal
            r2[r3] = r1
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r2)
            android.content.res.ColorStateList r5 = r1.getColorStateList(r3)
            r1.recycle()
            if (r7 == 0) goto L3b
            int r6 = r7.intValue()
            if (r5 != 0) goto L43
        L25:
            r5 = 0
        L26:
            int[][] r2 = X.C17470s9.A00
            r1 = 4
            int[] r1 = new int[r1]
            r1[r3] = r0
            r1[r4] = r6
            r0 = 2
            r1[r0] = r5
            r0 = 3
            r1[r0] = r5
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r2, r1)
            return r0
        L3b:
            if (r5 != 0) goto L3f
            r6 = 0
            goto L25
        L3f:
            int r6 = r5.getDefaultColor()
        L43:
            int[] r2 = new int[r4]
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r2[r3] = r1
            int r1 = r5.getDefaultColor()
            int r5 = r5.getColorForState(r2, r1)
            goto L26
        L53:
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int[] r1 = new int[r4]
            int r0 = X.C18240tP.colorControlActivated
            r1[r3] = r0
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r1)
            r0 = -7829368(0xffffffffff888888, float:NaN)
            int r0 = r1.getColor(r3, r0)
            r1.recycle()
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17470s9.A01(android.content.Context, java.lang.Integer, java.lang.Integer):android.content.res.ColorStateList");
    }
}
