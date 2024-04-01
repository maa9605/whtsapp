package X;

/* renamed from: X.44M  reason: invalid class name */
/* loaded from: classes3.dex */
public class C44M {
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
        android.util.Log.v("ExifUtil", "Orientation not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00be, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(byte[] r12) {
        /*
            r5 = 0
            r3 = 0
        L2:
            int r0 = r3 + 3
            int r11 = r12.length
            java.lang.String r8 = "ExifUtil"
            r2 = 4
            r9 = 2
            r7 = 1
            r6 = 8
            if (r0 >= r11) goto Lb9
            int r4 = r3 + 1
            r1 = r12[r3]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto Lb9
            r1 = r12[r4]
            r1 = r1 & r0
            if (r1 == r0) goto La4
            int r4 = r4 + 1
            r0 = 216(0xd8, float:3.03E-43)
            if (r1 == r0) goto La4
            if (r1 == r7) goto La4
            r0 = 217(0xd9, float:3.04E-43)
            if (r1 == r0) goto Lb9
            r0 = 218(0xda, float:3.05E-43)
            if (r1 == r0) goto Lb9
            int r10 = A01(r12, r4, r9, r5)
            if (r10 < r9) goto Lb3
            int r3 = r4 + r10
            if (r3 > r11) goto Lb3
            r0 = 225(0xe1, float:3.15E-43)
            if (r1 != r0) goto L2
            if (r10 < r6) goto L2
            int r0 = r4 + 2
            int r1 = A01(r12, r0, r2, r5)
            r0 = 1165519206(0x45786966, float:3974.5874)
            if (r1 != r0) goto L2
            int r0 = r4 + 6
            int r0 = A01(r12, r0, r9, r5)
            if (r0 != 0) goto L2
            int r4 = r4 + r6
            int r3 = r10 + (-8)
            if (r3 <= r6) goto Lb9
            int r1 = A01(r12, r4, r2, r5)
            r0 = 1229531648(0x49492a00, float:823968.0)
            if (r1 == r0) goto L69
            r0 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r1 == r0) goto L68
            java.lang.String r0 = "Invalid byte order"
            android.util.Log.e(r8, r0)
        L67:
            return r5
        L68:
            r7 = 0
        L69:
            int r0 = r4 + 4
            int r1 = A01(r12, r0, r2, r7)
            int r1 = r1 + r9
            r0 = 10
            if (r1 < r0) goto Lad
            if (r1 > r3) goto Lad
            int r4 = r4 + r1
            int r3 = r3 - r1
            int r0 = r4 + (-2)
            int r0 = A01(r12, r0, r9, r7)
        L7e:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto Lb9
            r0 = 12
            if (r3 < r0) goto Lb9
            int r1 = A01(r12, r4, r9, r7)
            r0 = 274(0x112, float:3.84E-43)
            if (r1 != r0) goto L9e
            int r4 = r4 + r6
            int r1 = A01(r12, r4, r9, r7)
            r0 = 3
            if (r1 == r0) goto Laa
            r0 = 6
            if (r1 == r0) goto La7
            if (r1 != r6) goto L67
            r0 = 270(0x10e, float:3.78E-43)
            return r0
        L9e:
            int r4 = r4 + 12
            int r3 = r3 + (-12)
            r0 = r2
            goto L7e
        La4:
            r3 = r4
            goto L2
        La7:
            r0 = 90
            return r0
        Laa:
            r0 = 180(0xb4, float:2.52E-43)
            return r0
        Lad:
            java.lang.String r0 = "Invalid offset"
            android.util.Log.e(r8, r0)
            return r5
        Lb3:
            java.lang.String r0 = "Invalid length"
            android.util.Log.e(r8, r0)
            return r5
        Lb9:
            java.lang.String r0 = "Orientation not found"
            android.util.Log.v(r8, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44M.A00(byte[]):int");
    }

    public static int A01(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                return i4;
            }
            i4 = (bArr[i] & 255) | (i4 << 8);
            i += i3;
            i2 = i5;
        }
    }
}
