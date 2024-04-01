package X;

import java.lang.reflect.Array;

/* renamed from: X.1fU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33181fU extends C1D3 {
    public static final byte[] A03 = new byte[0];
    public C1DF A00;
    public byte[] A01;
    public final int[] A02;

    public C33181fU(C1D7 c1d7) {
        super(c1d7);
        this.A01 = A03;
        this.A02 = new int[32];
    }

    @Override // X.C1D3
    public C1DF A00() {
        int[] iArr;
        int i;
        int i2;
        C1DF c1df = this.A00;
        if (c1df != null) {
            return c1df;
        }
        C1D7 c1d7 = super.A00;
        int i3 = c1d7.A01;
        int i4 = c1d7.A00;
        if (i3 >= 40 && i4 >= 40) {
            byte[] A00 = c1d7.A00();
            int i5 = i3 >> 3;
            if ((i3 & 7) != 0) {
                i5++;
            }
            int i6 = i4 >> 3;
            if ((i4 & 7) != 0) {
                i6++;
            }
            int[][] iArr2 = (int[][]) Array.newInstance(int.class, i6, i5);
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = i7 << 3;
                int i9 = i4 - 8;
                if (i8 > i9) {
                    i8 = i9;
                }
                for (int i10 = 0; i10 < i5; i10++) {
                    int i11 = i10 << 3;
                    int i12 = i3 - 8;
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    int i13 = (i8 * i3) + i11;
                    int i14 = 255;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    do {
                        int i18 = 0;
                        do {
                            int i19 = A00[i13 + i18] & 255;
                            i16 += i19;
                            if (i19 < i14) {
                                i14 = i19;
                            }
                            if (i19 > i17) {
                                i17 = i19;
                            }
                            i18++;
                        } while (i18 < 8);
                        i2 = i17 - i14;
                        if (i2 > 24) {
                            while (true) {
                                i15++;
                                i13 += i3;
                                int i20 = 0;
                                if (i15 >= 8) {
                                    break;
                                }
                                do {
                                    i16 += A00[i13 + i20] & 255;
                                    i20++;
                                } while (i20 < 8);
                            }
                        }
                        i15++;
                        i13 += i3;
                    } while (i15 < 8);
                    int i21 = i16 >> 6;
                    if (i2 <= 24) {
                        i21 = i14 >> 1;
                        if (i7 > 0 && i10 > 0) {
                            int[] iArr3 = iArr2[i7 - 1];
                            int i22 = i10 - 1;
                            int i23 = (((iArr2[i7][i22] << 1) + iArr3[i10]) + iArr3[i22]) >> 2;
                            if (i14 < i23) {
                                i21 = i23;
                            }
                        }
                    }
                    iArr2[i7][i10] = i21;
                }
            }
            C1DF c1df2 = new C1DF(i3, i4);
            for (int i24 = 0; i24 < i6; i24++) {
                int i25 = i24 << 3;
                int i26 = i4 - 8;
                if (i25 > i26) {
                    i25 = i26;
                }
                for (int i27 = 0; i27 < i5; i27++) {
                    int i28 = i27 << 3;
                    int i29 = i3 - 8;
                    if (i28 > i29) {
                        i28 = i29;
                    }
                    int i30 = i5 - 3;
                    if (i27 < 2) {
                        i = 2;
                    } else {
                        i = i27;
                        if (i27 > i30) {
                            i = i30;
                        }
                    }
                    int i31 = i6 - 3;
                    if (i24 < 2) {
                        i31 = 2;
                    } else if (i24 <= i31) {
                        i31 = i24;
                    }
                    int i32 = -2;
                    int i33 = 0;
                    do {
                        int[] iArr4 = iArr2[i31 + i32];
                        i33 = iArr4[i - 2] + iArr4[i - 1] + iArr4[i] + iArr4[i + 1] + iArr4[i + 2] + i33;
                        i32++;
                    } while (i32 <= 2);
                    int i34 = i33 / 25;
                    int i35 = (i25 * i3) + i28;
                    int i36 = 0;
                    do {
                        int i37 = 0;
                        do {
                            if ((A00[i35 + i37] & 255) <= i34) {
                                c1df2.A01(i28 + i37, i25 + i36);
                            }
                            i37++;
                        } while (i37 < 8);
                        i36++;
                        i35 += i3;
                    } while (i36 < 8);
                }
            }
            this.A00 = c1df2;
            return c1df2;
        }
        C1DF c1df3 = new C1DF(i3, i4);
        if (this.A01.length < i3) {
            this.A01 = new byte[i3];
        }
        int i38 = 0;
        do {
            iArr = this.A02;
            iArr[i38] = 0;
            i38++;
        } while (i38 < 32);
        for (int i39 = 1; i39 < 5; i39++) {
            byte[] A01 = c1d7.A01((i4 * i39) / 5, this.A01);
            int i40 = (i3 << 2) / 5;
            for (int i41 = i3 / 5; i41 < i40; i41++) {
                int i42 = (A01[i41] & 255) >> 3;
                iArr[i42] = iArr[i42] + 1;
            }
        }
        int length = iArr.length;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        for (int i46 = 0; i46 < length; i46++) {
            if (iArr[i46] > i43) {
                i43 = iArr[i46];
                i45 = i46;
            }
            if (iArr[i46] > i44) {
                i44 = iArr[i46];
            }
        }
        int i47 = 0;
        int i48 = 0;
        for (int i49 = 0; i49 < length; i49++) {
            int i50 = i49 - i45;
            int i51 = iArr[i49] * i50 * i50;
            if (i51 > i48) {
                i47 = i49;
                i48 = i51;
            }
        }
        if (i45 <= i47) {
            int i52 = i45;
            i45 = i47;
            i47 = i52;
        }
        if (i45 - i47 > (length >> 4)) {
            int i53 = i45 - 1;
            int i54 = i53;
            int i55 = -1;
            while (i53 > i47) {
                int i56 = i53 - i47;
                int i57 = (i44 - iArr[i53]) * (i45 - i53) * i56 * i56;
                if (i57 > i55) {
                    i54 = i53;
                    i55 = i57;
                }
                i53--;
            }
            int i58 = i54 << 3;
            byte[] A002 = c1d7.A00();
            for (int i59 = 0; i59 < i4; i59++) {
                int i60 = i59 * i3;
                for (int i61 = 0; i61 < i3; i61++) {
                    if ((A002[i60 + i61] & 255) < i58) {
                        c1df3.A01(i61, i59);
                    }
                }
            }
            this.A00 = c1df3;
            return c1df3;
        }
        throw C33151fR.A00;
    }
}
