package X;

import android.text.TextUtils;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1pz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C39351pz extends AbstractC222211m {
    public static final int[] A03 = new int[0];
    public C221811i A00;
    public final InterfaceC221911j A01;
    public final AtomicReference A02 = new AtomicReference(C221511f.A0K);

    public static boolean A01(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public C39351pz(InterfaceC221911j interfaceC221911j) {
        this.A01 = interfaceC221911j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        if ((r11 > r10) == (r13 > r14)) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List A00(X.C220710x r12, int r13, int r14, boolean r15) {
        /*
            int r7 = r12.A01
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r7)
            r1 = 0
        L8:
            if (r1 >= r7) goto L14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.add(r0)
            int r1 = r1 + 1
            goto L8
        L14:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r6) goto L9e
            if (r14 == r6) goto L9e
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L1f:
            r0 = 1
            if (r3 >= r7) goto L73
            X.0yg[] r1 = r12.A02
            r8 = r1[r3]
            int r11 = r8.A0F
            if (r11 <= 0) goto L66
            int r10 = r8.A08
            if (r10 <= 0) goto L66
            if (r15 == 0) goto L3b
            r1 = 0
            if (r11 <= r10) goto L34
            r1 = 1
        L34:
            if (r13 > r14) goto L37
            r0 = 0
        L37:
            r9 = r13
            r2 = r14
            if (r1 != r0) goto L3d
        L3b:
            r2 = r13
            r9 = r14
        L3d:
            int r1 = r11 * r9
            int r0 = r10 * r2
            if (r1 < r0) goto L69
            int r0 = r0 + r11
            int r1 = r0 + (-1)
            int r1 = r1 / r11
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r2, r1)
        L4c:
            int r10 = r8.A0F
            int r8 = r8.A08
            int r2 = r10 * r8
            int r1 = r0.x
            float r1 = (float) r1
            r9 = 1065017672(0x3f7ae148, float:0.98)
            float r1 = r1 * r9
            int r1 = (int) r1
            if (r10 < r1) goto L66
            int r0 = r0.y
            float r0 = (float) r0
            float r0 = r0 * r9
            int r0 = (int) r0
            if (r8 < r0) goto L66
            if (r2 >= r4) goto L66
            r4 = r2
        L66:
            int r3 = r3 + 1
            goto L1f
        L69:
            int r1 = r1 + r10
            int r1 = r1 + (-1)
            int r1 = r1 / r10
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r1, r9)
            goto L4c
        L73:
            if (r4 == r6) goto L9e
            int r3 = r5.size()
            int r3 = r3 - r0
        L7a:
            if (r3 < 0) goto L9e
            java.lang.Object r0 = r5.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.0yg[] r0 = r12.A02
            r0 = r0[r1]
            int r2 = r0.A0F
            r1 = -1
            if (r2 == r1) goto L98
            int r0 = r0.A08
            if (r0 == r1) goto L98
            int r2 = r2 * r0
            if (r2 == r1) goto L98
            if (r2 <= r4) goto L9b
        L98:
            r5.remove(r3)
        L9b:
            int r3 = r3 + (-1)
            goto L7a
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39351pz.A00(X.10x, int, int, boolean):java.util.List");
    }

    public static boolean A02(C21030yg c21030yg, int i, C221211c c221211c) {
        if (A01(i, false) && c21030yg.A05 == c221211c.A00 && c21030yg.A0C == c221211c.A01) {
            String str = c221211c.A02;
            return str == null || TextUtils.equals(str, c21030yg.A0P);
        }
        return false;
    }

    public static boolean A03(C21030yg c21030yg, String str) {
        if (str != null) {
            String str2 = c21030yg.A0O;
            if (str2 == null) {
                str2 = null;
            } else {
                try {
                    str2 = new Locale(str2).getISO3Language();
                } catch (MissingResourceException unused) {
                    if (str2 != null) {
                        str2 = str2.toLowerCase(Locale.US);
                    }
                }
            }
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A04(C21030yg c21030yg, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!A01(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str == null || C08M.A08(c21030yg.A0P, str)) {
            int i7 = c21030yg.A0F;
            if (i7 == -1 || i7 <= i3) {
                int i8 = c21030yg.A08;
                if (i8 == -1 || i8 <= i4) {
                    float f = c21030yg.A01;
                    if (f == -1.0f || f <= i5) {
                        int i9 = c21030yg.A04;
                        return i9 == -1 || i9 <= i6;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
