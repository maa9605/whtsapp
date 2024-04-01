package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.0YL */
/* loaded from: classes.dex */
public class C0YL implements C0YM {
    public C0YN A01;
    public C0YK A02 = null;
    public float A00 = 0.0f;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;

    public C0YL() {
    }

    public C0YL(C12120it c12120it) {
        this.A01 = new C0YN(this, c12120it) { // from class: X.1So
            public final C0YL A08;
            public final C12120it A09;
            public int A01 = 0;
            public int A00 = 8;
            public int[] A06 = new int[8];
            public int[] A07 = new int[8];
            public float[] A05 = new float[8];
            public int A02 = -1;
            public int A03 = -1;
            public boolean A04 = false;

            {
                this.A08 = this;
                this.A09 = c12120it;
            }

            @Override // X.C0YN
            public void A56(C0YK c0yk, float f, boolean z) {
                if (f <= -0.001f || f >= 0.001f) {
                    int i = this.A02;
                    if (i == -1) {
                        this.A02 = 0;
                        this.A05[0] = f;
                        this.A06[0] = c0yk.A02;
                        this.A07[0] = -1;
                        c0yk.A05++;
                        c0yk.A01(this.A08);
                        this.A01++;
                        if (this.A04) {
                            return;
                        }
                        int i2 = this.A03 + 1;
                        this.A03 = i2;
                        int length = this.A06.length;
                        if (i2 >= length) {
                            this.A04 = true;
                            this.A03 = length - 1;
                            return;
                        }
                        return;
                    }
                    int i3 = 0;
                    int i4 = -1;
                    while (i != -1) {
                        int i5 = this.A01;
                        if (i3 >= i5) {
                            break;
                        }
                        int[] iArr = this.A06;
                        int i6 = iArr[i];
                        int i7 = c0yk.A02;
                        if (i6 == i7) {
                            float[] fArr = this.A05;
                            float f2 = fArr[i] + f;
                            if (f2 > -0.001f && f2 < 0.001f) {
                                f2 = 0.0f;
                            }
                            fArr[i] = f2;
                            if (f2 == 0.0f) {
                                int[] iArr2 = this.A07;
                                if (i == i) {
                                    this.A02 = iArr2[i];
                                } else {
                                    iArr2[i4] = iArr2[i];
                                }
                                if (z) {
                                    c0yk.A02(this.A08);
                                }
                                if (this.A04) {
                                    this.A03 = i;
                                }
                                c0yk.A05--;
                                this.A01 = i5 - 1;
                                return;
                            }
                            return;
                        }
                        if (iArr[i] < i7) {
                            i4 = i;
                        }
                        i = this.A07[i];
                        i3++;
                    }
                    int i8 = this.A03;
                    int i9 = i8 + 1;
                    if (this.A04) {
                        int[] iArr3 = this.A06;
                        if (iArr3[i8] != -1) {
                            i8 = iArr3.length;
                        }
                    } else {
                        i8 = i9;
                    }
                    int[] iArr4 = this.A06;
                    int length2 = iArr4.length;
                    if (i8 >= length2 && this.A01 < length2) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length2) {
                                break;
                            } else if (iArr4[i10] == -1) {
                                i8 = i10;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (i8 >= length2) {
                        i8 = length2;
                        int i11 = this.A00 << 1;
                        this.A00 = i11;
                        this.A04 = false;
                        this.A03 = length2 - 1;
                        this.A05 = Arrays.copyOf(this.A05, i11);
                        this.A06 = Arrays.copyOf(this.A06, this.A00);
                        this.A07 = Arrays.copyOf(this.A07, this.A00);
                    }
                    this.A06[i8] = c0yk.A02;
                    this.A05[i8] = f;
                    int[] iArr5 = this.A07;
                    if (i4 != -1) {
                        iArr5[i8] = iArr5[i4];
                        iArr5[i4] = i8;
                    } else {
                        iArr5[i8] = this.A02;
                        this.A02 = i8;
                    }
                    c0yk.A05++;
                    c0yk.A01(this.A08);
                    this.A01++;
                    if (!this.A04) {
                        this.A03++;
                    }
                    int i12 = this.A03;
                    int length3 = this.A06.length;
                    if (i12 >= length3) {
                        this.A04 = true;
                        this.A03 = length3 - 1;
                    }
                }
            }

            @Override // X.C0YN
            public boolean A6U(C0YK c0yk) {
                int i = this.A02;
                if (i == -1) {
                    return false;
                }
                for (int i2 = 0; i != -1 && i2 < this.A01; i2++) {
                    if (this.A06[i] == c0yk.A02) {
                        return true;
                    }
                    i = this.A07[i];
                }
                return false;
            }

            @Override // X.C0YN
            public void A7N(float f) {
                int i = this.A02;
                for (int i2 = 0; i != -1 && i2 < this.A01; i2++) {
                    float[] fArr = this.A05;
                    fArr[i] = fArr[i] / f;
                    i = this.A07[i];
                }
            }

            @Override // X.C0YN
            public final float A8C(C0YK c0yk) {
                int i = this.A02;
                for (int i2 = 0; i != -1 && i2 < this.A01; i2++) {
                    if (this.A06[i] == c0yk.A02) {
                        return this.A05[i];
                    }
                    i = this.A07[i];
                }
                return 0.0f;
            }

            @Override // X.C0YN
            public int A9W() {
                return this.A01;
            }

            @Override // X.C0YN
            public C0YK ADm(int i) {
                int i2 = this.A02;
                for (int i3 = 0; i2 != -1 && i3 < this.A01; i3++) {
                    if (i3 == i) {
                        return this.A09.A03[this.A06[i2]];
                    }
                    i2 = this.A07[i2];
                }
                return null;
            }

            @Override // X.C0YN
            public float ADn(int i) {
                int i2 = this.A02;
                for (int i3 = 0; i2 != -1 && i3 < this.A01; i3++) {
                    if (i3 == i) {
                        return this.A05[i2];
                    }
                    i2 = this.A07[i2];
                }
                return 0.0f;
            }

            @Override // X.C0YN
            public void AF2() {
                int i = this.A02;
                for (int i2 = 0; i != -1 && i2 < this.A01; i2++) {
                    float[] fArr = this.A05;
                    fArr[i] = fArr[i] * (-1.0f);
                    i = this.A07[i];
                }
            }

            @Override // X.C0YN
            public final void AQx(C0YK c0yk, float f) {
                if (f == 0.0f) {
                    ARJ(c0yk, true);
                    return;
                }
                int i = this.A02;
                if (i == -1) {
                    this.A02 = 0;
                    this.A05[0] = f;
                    this.A06[0] = c0yk.A02;
                    this.A07[0] = -1;
                    c0yk.A05++;
                    c0yk.A01(this.A08);
                    this.A01++;
                    if (this.A04) {
                        return;
                    }
                    int i2 = this.A03 + 1;
                    this.A03 = i2;
                    int length = this.A06.length;
                    if (i2 >= length) {
                        this.A04 = true;
                        this.A03 = length - 1;
                        return;
                    }
                    return;
                }
                int i3 = -1;
                for (int i4 = 0; i != -1 && i4 < this.A01; i4++) {
                    int[] iArr = this.A06;
                    int i5 = iArr[i];
                    int i6 = c0yk.A02;
                    if (i5 == i6) {
                        this.A05[i] = f;
                        return;
                    }
                    if (iArr[i] < i6) {
                        i3 = i;
                    }
                    i = this.A07[i];
                }
                int i7 = this.A03;
                int i8 = i7 + 1;
                if (this.A04) {
                    int[] iArr2 = this.A06;
                    if (iArr2[i7] != -1) {
                        i7 = iArr2.length;
                    }
                } else {
                    i7 = i8;
                }
                int[] iArr3 = this.A06;
                int length2 = iArr3.length;
                if (i7 >= length2 && this.A01 < length2) {
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length2) {
                            break;
                        } else if (iArr3[i9] == -1) {
                            i7 = i9;
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                if (i7 >= length2) {
                    i7 = length2;
                    int i10 = this.A00 << 1;
                    this.A00 = i10;
                    this.A04 = false;
                    this.A03 = length2 - 1;
                    this.A05 = Arrays.copyOf(this.A05, i10);
                    this.A06 = Arrays.copyOf(this.A06, this.A00);
                    this.A07 = Arrays.copyOf(this.A07, this.A00);
                }
                this.A06[i7] = c0yk.A02;
                this.A05[i7] = f;
                int[] iArr4 = this.A07;
                if (i3 != -1) {
                    iArr4[i7] = iArr4[i3];
                    iArr4[i3] = i7;
                } else {
                    iArr4[i7] = this.A02;
                    this.A02 = i7;
                }
                c0yk.A05++;
                c0yk.A01(this.A08);
                int i11 = this.A01 + 1;
                this.A01 = i11;
                if (!this.A04) {
                    this.A03++;
                }
                int length3 = this.A06.length;
                if (i11 >= length3) {
                    this.A04 = true;
                }
                if (this.A03 >= length3) {
                    this.A04 = true;
                    this.A03 = length3 - 1;
                }
            }

            @Override // X.C0YN
            public final float ARJ(C0YK c0yk, boolean z) {
                int i = this.A02;
                if (i == -1) {
                    return 0.0f;
                }
                int i2 = 0;
                int i3 = -1;
                while (i != -1) {
                    int i4 = this.A01;
                    if (i2 >= i4) {
                        break;
                    }
                    int[] iArr = this.A06;
                    if (iArr[i] == c0yk.A02) {
                        int[] iArr2 = this.A07;
                        if (i == i) {
                            this.A02 = iArr2[i];
                        } else {
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c0yk.A02(this.A08);
                        }
                        c0yk.A05--;
                        this.A01 = i4 - 1;
                        iArr[i] = -1;
                        if (this.A04) {
                            this.A03 = i;
                        }
                        return this.A05[i];
                    }
                    i2++;
                    i3 = i;
                    i = this.A07[i];
                }
                return 0.0f;
            }

            @Override // X.C0YN
            public float AVx(C0YL c0yl, boolean z) {
                C0YK c0yk = c0yl.A02;
                float A8C = A8C(c0yk);
                ARJ(c0yk, z);
                C0YN c0yn = c0yl.A01;
                int A9W = c0yn.A9W();
                for (int i = 0; i < A9W; i++) {
                    C0YK ADm = c0yn.ADm(i);
                    A56(ADm, c0yn.A8C(ADm) * A8C, z);
                }
                return A8C;
            }

            @Override // X.C0YN
            public final void clear() {
                int i = this.A02;
                for (int i2 = 0; i != -1 && i2 < this.A01; i2++) {
                    C0YK c0yk = this.A09.A03[this.A06[i]];
                    if (c0yk != null) {
                        c0yk.A02(this.A08);
                    }
                    i = this.A07[i];
                }
                this.A02 = -1;
                this.A03 = -1;
                this.A04 = false;
                this.A01 = 0;
            }

            public String toString() {
                int i = this.A02;
                String str = "";
                for (int i2 = 0; i != -1 && i2 < this.A01; i2++) {
                    StringBuilder A0P = C000200d.A0P(C000200d.A0H(str, " -> "));
                    A0P.append(this.A05[i]);
                    A0P.append(" : ");
                    StringBuilder A0P2 = C000200d.A0P(A0P.toString());
                    A0P2.append(this.A09.A03[this.A06[i]]);
                    str = A0P2.toString();
                    i = this.A07[i];
                }
                return str;
            }
        };
    }

    public final C0YK A00(boolean[] zArr, C0YK c0yk) {
        EnumC12160ix enumC12160ix;
        C0YN c0yn = this.A01;
        int A9W = c0yn.A9W();
        C0YK c0yk2 = null;
        float f = 0.0f;
        for (int i = 0; i < A9W; i++) {
            float ADn = c0yn.ADn(i);
            if (ADn < 0.0f) {
                C0YK ADm = c0yn.ADm(i);
                if ((zArr == null || !zArr[ADm.A02]) && ADm != c0yk && (((enumC12160ix = ADm.A06) == EnumC12160ix.SLACK || enumC12160ix == EnumC12160ix.ERROR) && ADn < f)) {
                    f = ADn;
                    c0yk2 = ADm;
                }
            }
        }
        return c0yk2;
    }

    public void A01(C0YL c0yl, boolean z) {
        float AVx = this.A01.AVx(c0yl, z);
        this.A00 = (c0yl.A00 * AVx) + this.A00;
        if (z) {
            c0yl.A02.A02(this);
        }
    }

    public void A02(C0YK c0yk) {
        C0YK c0yk2 = this.A02;
        if (c0yk2 != null) {
            this.A01.AQx(c0yk2, -1.0f);
            this.A02 = null;
        }
        C0YN c0yn = this.A01;
        float ARJ = c0yn.ARJ(c0yk, true) * (-1.0f);
        this.A02 = c0yk;
        if (ARJ == 1.0f) {
            return;
        }
        this.A00 /= ARJ;
        c0yn.A7N(ARJ);
    }

    public void A03(C0YK c0yk, C0YK c0yk2, C0YK c0yk3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = i;
        }
        if (!z) {
            this.A01.AQx(c0yk, -1.0f);
            this.A01.AQx(c0yk2, 1.0f);
            this.A01.AQx(c0yk3, 1.0f);
            return;
        }
        this.A01.AQx(c0yk, 1.0f);
        this.A01.AQx(c0yk2, -1.0f);
        this.A01.AQx(c0yk3, -1.0f);
    }

    public void A04(C0YK c0yk, C0YK c0yk2, C0YK c0yk3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = i;
        }
        if (!z) {
            this.A01.AQx(c0yk, -1.0f);
            this.A01.AQx(c0yk2, 1.0f);
            this.A01.AQx(c0yk3, -1.0f);
            return;
        }
        this.A01.AQx(c0yk, 1.0f);
        this.A01.AQx(c0yk2, -1.0f);
        this.A01.AQx(c0yk3, 1.0f);
    }

    public void A05(C0YK c0yk, boolean z) {
        if (c0yk.A08) {
            C0YN c0yn = this.A01;
            float A8C = c0yn.A8C(c0yk);
            this.A00 = (c0yk.A00 * A8C) + this.A00;
            c0yn.ARJ(c0yk, z);
            if (z) {
                c0yk.A02(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0022, code lost:
        if (r2 != 5) goto L17;
     */
    @Override // X.C0YM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A5A(X.C0YK r4) {
        /*
            r3 = this;
            int r2 = r4.A04
            r0 = 1
            if (r2 == r0) goto L24
            r0 = 2
            if (r2 != r0) goto L10
            r1 = 1148846080(0x447a0000, float:1000.0)
        La:
            X.0YN r0 = r3.A01
            r0.AQx(r4, r1)
            return
        L10:
            r0 = 3
            if (r2 != r0) goto L17
            r1 = 1232348160(0x49742400, float:1000000.0)
            goto La
        L17:
            r0 = 4
            if (r2 != r0) goto L1e
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto La
        L1e:
            r0 = 5
            r1 = 1399379109(0x5368d4a5, float:1.0E12)
            if (r2 == r0) goto La
        L24:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YL.A5A(X.0YK):void");
    }

    @Override // X.C0YM
    public C0YK ACP(C0YG c0yg, boolean[] zArr) {
        return A00(zArr, null);
    }

    @Override // X.C0YM
    public void clear() {
        this.A01.clear();
        this.A02 = null;
        this.A00 = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            X.0YK r1 = r9.A02
            if (r1 != 0) goto L85
            java.lang.String r1 = "0"
        L6:
            java.lang.String r0 = " = "
            java.lang.String r5 = X.C000200d.A0H(r1, r0)
            float r1 = r9.A00
            r8 = 0
            r4 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L83
            java.lang.StringBuilder r0 = X.C000200d.A0P(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            r7 = 1
        L20:
            X.0YN r0 = r9.A01
            int r3 = r0.A9W()
        L26:
            if (r4 >= r3) goto L94
            X.0YN r0 = r9.A01
            X.0YK r1 = r0.ADm(r4)
            if (r1 == 0) goto L56
            float r6 = r0.ADn(r4)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L56
            java.lang.String r2 = r1.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 != 0) goto L71
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L4b
            java.lang.String r0 = "- "
            java.lang.String r5 = X.C000200d.A0H(r5, r0)
        L4a:
            float r6 = r6 * r1
        L4b:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L59
            java.lang.String r5 = X.C000200d.A0H(r5, r2)
        L55:
            r7 = 1
        L56:
            int r4 = r4 + 1
            goto L26
        L59:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            goto L55
        L71:
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L7c
            java.lang.String r0 = " + "
            java.lang.String r5 = X.C000200d.A0H(r5, r0)
            goto L4b
        L7c:
            java.lang.String r0 = " - "
            java.lang.String r5 = X.C000200d.A0H(r5, r0)
            goto L4a
        L83:
            r7 = 0
            goto L20
        L85:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = X.C000200d.A0P(r0)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L6
        L94:
            if (r7 != 0) goto L9c
            java.lang.String r0 = "0.0"
            java.lang.String r5 = X.C000200d.A0H(r5, r0)
        L9c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YL.toString():java.lang.String");
    }
}
