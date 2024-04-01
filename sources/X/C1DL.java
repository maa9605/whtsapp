package X;

/* renamed from: X.1DL */
/* loaded from: classes.dex */
public final class C1DL {
    public static final C1DL A07;
    public static final C1DL A08;
    public static final C1DL A09;
    public final int A00;
    public final int A01;
    public final int A02;
    public final C1DM A03;
    public final C1DM A04;
    public final int[] A05;
    public final int[] A06;

    static {
        new C1DL(4201, 4096, 1);
        new C1DL(1033, 1024, 1);
        A07 = new C1DL(67, 64, 1);
        new C1DL(19, 16, 1);
        A09 = new C1DL(285, 256, 0);
        A08 = new C1DL(301, 256, 1);
    }

    public C1DL(int i, int i2, int i3) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        int[] iArr = new int[i2];
        this.A05 = iArr;
        int[] iArr2 = new int[i2];
        this.A06 = iArr2;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            iArr2[iArr[i6]] = i6;
        }
        this.A04 = new C1DM(this, new int[]{0});
        this.A03 = new C1DM(this, new int[]{1});
    }

    public int A00(int i) {
        if (i != 0) {
            return this.A05[(this.A02 - this.A06[i]) - 1];
        }
        throw new ArithmeticException();
    }

    public int A01(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.A05;
        int[] iArr2 = this.A06;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.A02 - 1)];
    }

    public C1DM A02(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.A04;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C1DM(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("GF(0x");
        A0P.append(Integer.toHexString(this.A01));
        A0P.append(',');
        A0P.append(this.A02);
        A0P.append(')');
        return A0P.toString();
    }
}
