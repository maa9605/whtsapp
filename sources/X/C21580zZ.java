package X;

import java.util.Arrays;

/* renamed from: X.0zZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21580zZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public C21580zZ(int i, int i2, float f, float f2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = i / i3;
        this.A0K = i / 400;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 << 1;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0A = new short[i6];
        this.A0B = new short[i6];
        this.A0C = new short[i6];
    }

    public final int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.A02 = i5 / i7;
        this.A01 = i8 / i6;
        return i7;
    }

    public final void A01() {
        int A00;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.A05;
        float f = this.A0F;
        float f2 = this.A0D;
        float f3 = f / f2;
        float f4 = this.A0E * f2;
        double d = f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d <= 1.00001d && d >= 0.99999d) {
            A02(this.A0A, 0, this.A00);
            this.A00 = 0;
        } else {
            int i11 = this.A00;
            int i12 = this.A0J;
            if (i11 >= i12) {
                int i13 = 0;
                while (true) {
                    int i14 = this.A09;
                    if (i14 > 0) {
                        int min = Math.min(i12, i14);
                        A02(this.A0A, i13, min);
                        this.A09 -= min;
                        i13 += min;
                    } else {
                        short[] sArr = this.A0A;
                        int i15 = this.A0H;
                        int i16 = i15 > 4000 ? i15 / 4000 : 1;
                        int i17 = this.A0G;
                        if (i17 == i10 && i16 == i10) {
                            A00 = A00(sArr, i13, this.A0K, this.A0I);
                        } else {
                            A03(sArr, i13, i16);
                            short[] sArr2 = this.A0L;
                            int i18 = this.A0K;
                            int i19 = this.A0I;
                            A00 = A00(sArr2, 0, i18 / i16, i19 / i16);
                            if (i16 != i10) {
                                int i20 = A00 * i16;
                                int i21 = i16 << 2;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 < i18) {
                                    i22 = i18;
                                }
                                if (i23 > i19) {
                                    i23 = i19;
                                }
                                if (i17 == i10) {
                                    A00 = A00(sArr, i13, i22, i23);
                                } else {
                                    A03(sArr, i13, i10);
                                    A00 = A00(sArr2, 0, i22, i23);
                                }
                            }
                        }
                        int i24 = this.A02;
                        int i25 = this.A01;
                        if (i24 == 0 || (i = this.A08) == 0 || i25 > i24 * 3 || (i24 << 1) <= this.A07 * 3) {
                            i = A00;
                        }
                        this.A07 = i24;
                        this.A08 = A00;
                        if (d > 1.0d) {
                            if (f3 >= 2.0f) {
                                i3 = (int) (i / (f3 - f5));
                            } else {
                                this.A09 = (int) (((2.0f - f3) * i) / (f3 - f5));
                                i3 = i;
                            }
                            short[] A04 = A04(this.A0B, this.A05, i3);
                            this.A0B = A04;
                            int i26 = this.A05;
                            int i27 = i13 + i;
                            for (int i28 = 0; i28 < i17; i28++) {
                                int i29 = (i26 * i17) + i28;
                                int i30 = (i27 * i17) + i28;
                                int i31 = (i13 * i17) + i28;
                                for (int i32 = 0; i32 < i3; i32++) {
                                    A04[i29] = (short) (((sArr[i30] * i32) + ((i3 - i32) * sArr[i31])) / i3);
                                    i29 += i17;
                                    i31 += i17;
                                    i30 += i17;
                                }
                            }
                            this.A05 = i26 + i3;
                            i13 = i + i3 + i13;
                        } else {
                            if (f3 < 0.5f) {
                                i2 = (int) ((i * f3) / (f5 - f3));
                            } else {
                                this.A09 = (int) ((((2.0f * f3) - f5) * i) / (f5 - f3));
                                i2 = i;
                            }
                            int i33 = i + i2;
                            short[] A042 = A04(this.A0B, this.A05, i33);
                            this.A0B = A042;
                            System.arraycopy(sArr, i13 * i17, A042, this.A05 * i17, i17 * i);
                            short[] sArr3 = this.A0B;
                            int i34 = this.A05;
                            int i35 = i34 + i;
                            int i36 = i13 + i;
                            for (int i37 = 0; i37 < i17; i37++) {
                                int i38 = (i35 * i17) + i37;
                                int i39 = (i13 * i17) + i37;
                                int i40 = (i36 * i17) + i37;
                                for (int i41 = 0; i41 < i2; i41++) {
                                    sArr3[i38] = (short) (((sArr[i39] * i41) + ((i2 - i41) * sArr[i40])) / i2);
                                    i38 += i17;
                                    i40 += i17;
                                    i39 += i17;
                                }
                            }
                            this.A05 = i34 + i33;
                            i13 += i2;
                        }
                    }
                    if (i12 + i13 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i42 = this.A00 - i13;
                short[] sArr4 = this.A0A;
                int i43 = this.A0G;
                System.arraycopy(sArr4, i13 * i43, sArr4, 0, i43 * i42);
                this.A00 = i42;
            }
            f5 = 1.0f;
        }
        if (f4 != f5 && (i4 = this.A05) != i9) {
            int i44 = this.A0H;
            int i45 = (int) (i44 / f4);
            while (true) {
                if (i45 <= 16384 && i44 <= 16384) {
                    break;
                }
                i45 >>= 1;
                i44 >>= 1;
            }
            int i46 = i4 - i9;
            short[] A043 = A04(this.A0C, this.A06, i46);
            this.A0C = A043;
            short[] sArr5 = this.A0B;
            int i47 = this.A0G;
            System.arraycopy(sArr5, i9 * i47, A043, this.A06 * i47, i47 * i46);
            this.A05 = i9;
            this.A06 += i46;
            int i48 = 0;
            while (true) {
                i5 = this.A06;
                i6 = i5 - 1;
                if (i48 >= i6) {
                    break;
                }
                while (true) {
                    i7 = this.A04 + 1;
                    int i49 = i7 * i45;
                    i8 = this.A03;
                    if (i49 <= i8 * i44) {
                        break;
                    }
                    short[] A044 = A04(this.A0B, i9, 1);
                    this.A0B = A044;
                    for (int i50 = 0; i50 < i47; i50++) {
                        short[] sArr6 = this.A0C;
                        int i51 = (i48 * i47) + i50;
                        short s = sArr6[i51];
                        short s2 = sArr6[i51 + i47];
                        int i52 = this.A04;
                        int i53 = i52 * i45;
                        int i54 = (i52 + 1) * i45;
                        int i55 = i54 - (this.A03 * i44);
                        int i56 = i54 - i53;
                        A044[(this.A05 * i47) + i50] = (short) ((((i56 - i55) * s2) + (s * i55)) / i56);
                    }
                    this.A03++;
                    i9 = this.A05 + 1;
                    this.A05 = i9;
                }
                this.A04 = i7;
                if (i7 == i44) {
                    this.A04 = 0;
                    C002701i.A1K(i8 == i45);
                    this.A03 = 0;
                }
                i48++;
            }
            if (i6 != 0) {
                short[] sArr7 = this.A0C;
                System.arraycopy(sArr7, i6 * i47, sArr7, 0, (i5 - i6) * i47);
                this.A06 -= i6;
            }
        }
    }

    public final void A02(short[] sArr, int i, int i2) {
        short[] A04 = A04(this.A0B, this.A05, i2);
        this.A0B = A04;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A04, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    public final void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public final short[] A04(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.A0G;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) >> 1) + i2) * i3);
    }
}
