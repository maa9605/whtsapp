package X;

/* renamed from: X.1DW  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DW {
    public final byte A00;
    public final C1DV A01;
    public static final int[][] A03 = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public static final int[] A02 = {0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};

    public C1DW(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 >= 0) {
            C1DV[] c1dvArr = C1DV.A00;
            if (i2 < c1dvArr.length) {
                this.A01 = c1dvArr[i2];
                this.A00 = (byte) (i & 7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public static int A00(int i, int i2) {
        int i3 = i ^ i2;
        int[] iArr = A02;
        return iArr[i3 & 15] + iArr[(i3 >>> 4) & 15] + iArr[(i3 >>> 8) & 15] + iArr[(i3 >>> 12) & 15] + iArr[(i3 >>> 16) & 15] + iArr[(i3 >>> 20) & 15] + iArr[(i3 >>> 24) & 15] + iArr[(i3 >>> 28) & 15];
    }

    public static C1DW A01(int i, int i2) {
        int[][] iArr;
        int A00;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : A03) {
            int i5 = iArr2[0];
            if (i5 != i && i5 != i2) {
                int A002 = A00(i, i5);
                if (A002 < i3) {
                    i4 = iArr2[1];
                    i3 = A002;
                }
                if (i != i2 && (A00 = A00(i2, i5)) < i3) {
                    i4 = iArr2[1];
                    i3 = A00;
                }
            } else {
                return new C1DW(iArr2[1]);
            }
        }
        if (i3 <= 3) {
            return new C1DW(i4);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1DW) {
            C1DW c1dw = (C1DW) obj;
            return this.A01 == c1dw.A01 && this.A00 == c1dw.A00;
        }
        return false;
    }

    public int hashCode() {
        return (this.A01.ordinal() << 3) | this.A00;
    }
}
