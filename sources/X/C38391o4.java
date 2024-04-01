package X;

import java.util.Arrays;

/* renamed from: X.1o4  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38391o4 extends C0YL {
    public C38391o4(final C12120it c12120it) {
        this.A01 = new C0YN(this, c12120it) { // from class: X.1Sp
            public final C0YL A0A;
            public final C12120it A0B;
            public int A01 = 16;
            public int A00 = 16;
            public int[] A05 = new int[16];
            public int[] A07 = new int[16];
            public int[] A09 = new int[16];
            public float[] A04 = new float[16];
            public int[] A08 = new int[16];
            public int[] A06 = new int[16];
            public int A03 = 0;
            public int A02 = -1;

            {
                this.A0A = this;
                this.A0B = c12120it;
                clear();
            }

            public int A00(C0YK c0yk) {
                int[] iArr;
                if (this.A03 == 0) {
                    return -1;
                }
                int i = c0yk.A02;
                int i2 = this.A05[i % this.A00];
                if (i2 == -1) {
                    return -1;
                }
                int[] iArr2 = this.A09;
                if (iArr2[i2] == i) {
                    return i2;
                }
                while (true) {
                    iArr = this.A07;
                    if (iArr[i2] == -1 || iArr2[iArr[i2]] == i) {
                        break;
                    }
                    i2 = iArr[i2];
                }
                int i3 = iArr[i2];
                if (i3 != -1 && iArr2[i3] == i) {
                    return i3;
                }
                return -1;
            }

            public final void A01(int i, C0YK c0yk, float f) {
                this.A09[i] = c0yk.A02;
                this.A04[i] = f;
                this.A08[i] = -1;
                this.A06[i] = -1;
                c0yk.A01(this.A0A);
                c0yk.A05++;
                this.A03++;
            }

            public final void A02(C0YK c0yk, int i) {
                int[] iArr;
                int i2 = c0yk.A02 % this.A00;
                int[] iArr2 = this.A05;
                int i3 = iArr2[i2];
                if (i3 == -1) {
                    iArr2[i2] = i;
                } else {
                    while (true) {
                        iArr = this.A07;
                        if (iArr[i3] == -1) {
                            break;
                        }
                        i3 = iArr[i3];
                    }
                    iArr[i3] = i;
                }
                this.A07[i] = -1;
            }

            @Override // X.C0YN
            public void A56(C0YK c0yk, float f, boolean z) {
                if (f <= -0.001f || f >= 0.001f) {
                    int A00 = A00(c0yk);
                    if (A00 == -1) {
                        AQx(c0yk, f);
                        return;
                    }
                    float[] fArr = this.A04;
                    fArr[A00] = fArr[A00] + f;
                    float f2 = fArr[A00];
                    if (f2 <= -0.001f || f2 >= 0.001f) {
                        return;
                    }
                    fArr[A00] = 0.0f;
                    ARJ(c0yk, z);
                }
            }

            @Override // X.C0YN
            public boolean A6U(C0YK c0yk) {
                return A00(c0yk) != -1;
            }

            @Override // X.C0YN
            public void A7N(float f) {
                int i = this.A03;
                int i2 = this.A02;
                for (int i3 = 0; i3 < i; i3++) {
                    float[] fArr = this.A04;
                    fArr[i2] = fArr[i2] / f;
                    i2 = this.A06[i2];
                    if (i2 == -1) {
                        return;
                    }
                }
            }

            @Override // X.C0YN
            public float A8C(C0YK c0yk) {
                int A00 = A00(c0yk);
                if (A00 != -1) {
                    return this.A04[A00];
                }
                return 0.0f;
            }

            @Override // X.C0YN
            public int A9W() {
                return this.A03;
            }

            @Override // X.C0YN
            public C0YK ADm(int i) {
                int i2 = this.A03;
                if (i2 == 0) {
                    return null;
                }
                int i3 = this.A02;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (i4 == i && i3 != -1) {
                        return this.A0B.A03[this.A09[i3]];
                    }
                    i3 = this.A06[i3];
                    if (i3 == -1) {
                        break;
                    }
                }
                return null;
            }

            @Override // X.C0YN
            public float ADn(int i) {
                int i2 = this.A03;
                int i3 = this.A02;
                for (int i4 = 0; i4 < i2; i4++) {
                    if (i4 == i) {
                        return this.A04[i3];
                    }
                    i3 = this.A06[i3];
                    if (i3 == -1) {
                        return 0.0f;
                    }
                }
                return 0.0f;
            }

            @Override // X.C0YN
            public void AF2() {
                int i = this.A03;
                int i2 = this.A02;
                for (int i3 = 0; i3 < i; i3++) {
                    float[] fArr = this.A04;
                    fArr[i2] = fArr[i2] * (-1.0f);
                    i2 = this.A06[i2];
                    if (i2 == -1) {
                        return;
                    }
                }
            }

            @Override // X.C0YN
            public void AQx(C0YK c0yk, float f) {
                int[] iArr;
                if (f > -0.001f && f < 0.001f) {
                    ARJ(c0yk, true);
                    return;
                }
                int i = this.A03;
                int i2 = 0;
                if (i == 0) {
                    A01(0, c0yk, f);
                    A02(c0yk, 0);
                    this.A02 = 0;
                    return;
                }
                int A00 = A00(c0yk);
                if (A00 != -1) {
                    this.A04[A00] = f;
                    return;
                }
                int i3 = i + 1;
                int i4 = this.A01;
                if (i3 >= i4) {
                    i4 <<= 1;
                    this.A09 = Arrays.copyOf(this.A09, i4);
                    this.A04 = Arrays.copyOf(this.A04, i4);
                    this.A08 = Arrays.copyOf(this.A08, i4);
                    this.A06 = Arrays.copyOf(this.A06, i4);
                    int[] copyOf = Arrays.copyOf(this.A07, i4);
                    this.A07 = copyOf;
                    for (int i5 = this.A01; i5 < i4; i5++) {
                        this.A09[i5] = -1;
                        copyOf[i5] = -1;
                    }
                    this.A01 = i4;
                }
                int i6 = this.A03;
                int i7 = this.A02;
                int i8 = -1;
                for (int i9 = 0; i9 < i6; i9++) {
                    int[] iArr2 = this.A09;
                    int i10 = iArr2[i7];
                    int i11 = c0yk.A02;
                    if (i10 == i11) {
                        this.A04[i7] = f;
                        return;
                    }
                    if (iArr2[i7] < i11) {
                        i8 = i7;
                    }
                    i7 = this.A06[i7];
                    if (i7 == -1) {
                        break;
                    }
                }
                while (true) {
                    if (i2 >= i4) {
                        i2 = -1;
                        break;
                    } else if (this.A09[i2] == -1) {
                        break;
                    } else {
                        i2++;
                    }
                }
                A01(i2, c0yk, f);
                int[] iArr3 = this.A08;
                if (i8 != -1) {
                    iArr3[i2] = i8;
                    iArr = this.A06;
                    iArr[i2] = iArr[i8];
                    iArr[i8] = i2;
                } else {
                    iArr3[i2] = -1;
                    if (this.A03 > 0) {
                        iArr = this.A06;
                        iArr[i2] = this.A02;
                        this.A02 = i2;
                    } else {
                        iArr = this.A06;
                        iArr[i2] = -1;
                    }
                }
                int i12 = iArr[i2];
                if (i12 != -1) {
                    iArr3[i12] = i2;
                }
                A02(c0yk, i2);
            }

            @Override // X.C0YN
            public float ARJ(C0YK c0yk, boolean z) {
                int[] iArr;
                int A00 = A00(c0yk);
                if (A00 == -1) {
                    return 0.0f;
                }
                int i = c0yk.A02;
                int i2 = i % this.A00;
                int[] iArr2 = this.A05;
                int i3 = iArr2[i2];
                if (i3 != -1) {
                    int[] iArr3 = this.A09;
                    if (iArr3[i3] == i) {
                        int[] iArr4 = this.A07;
                        iArr2[i2] = iArr4[i3];
                        iArr4[i3] = -1;
                    } else {
                        while (true) {
                            iArr = this.A07;
                            if (iArr[i3] == -1 || iArr3[iArr[i3]] == i) {
                                break;
                            }
                            i3 = iArr[i3];
                        }
                        int i4 = iArr[i3];
                        if (i4 != -1 && iArr3[i4] == i) {
                            iArr[i3] = iArr[i4];
                            iArr[i4] = -1;
                        }
                    }
                }
                float f = this.A04[A00];
                if (this.A02 == A00) {
                    this.A02 = this.A06[A00];
                }
                this.A09[A00] = -1;
                int[] iArr5 = this.A08;
                int i5 = iArr5[A00];
                if (i5 != -1) {
                    int[] iArr6 = this.A06;
                    iArr6[i5] = iArr6[A00];
                }
                int i6 = this.A06[A00];
                if (i6 != -1) {
                    iArr5[i6] = iArr5[A00];
                }
                this.A03--;
                c0yk.A05--;
                if (z) {
                    c0yk.A02(this.A0A);
                }
                return f;
            }

            @Override // X.C0YN
            public float AVx(C0YL c0yl, boolean z) {
                C0YK c0yk = c0yl.A02;
                float A8C = A8C(c0yk);
                ARJ(c0yk, z);
                C28571Sp c28571Sp = (C28571Sp) c0yl.A01;
                int i = c28571Sp.A03;
                int i2 = 0;
                int i3 = 0;
                while (i2 < i) {
                    int[] iArr = c28571Sp.A09;
                    if (iArr[i3] != -1) {
                        A56(this.A0B.A03[iArr[i3]], c28571Sp.A04[i3] * A8C, z);
                        i2++;
                    }
                    i3++;
                }
                return A8C;
            }

            @Override // X.C0YN
            public void clear() {
                int i = this.A03;
                for (int i2 = 0; i2 < i; i2++) {
                    C0YK ADm = ADm(i2);
                    if (ADm != null) {
                        ADm.A02(this.A0A);
                    }
                }
                for (int i3 = 0; i3 < this.A01; i3++) {
                    this.A09[i3] = -1;
                    this.A07[i3] = -1;
                }
                for (int i4 = 0; i4 < this.A00; i4++) {
                    this.A05[i4] = -1;
                }
                this.A03 = 0;
                this.A02 = -1;
            }

            public String toString() {
                String A0H;
                String A0H2;
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append(" { ");
                String obj = sb.toString();
                int i = this.A03;
                for (int i2 = 0; i2 < i; i2++) {
                    C0YK ADm = ADm(i2);
                    if (ADm != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(obj);
                        sb2.append(ADm);
                        sb2.append(" = ");
                        sb2.append(ADn(i2));
                        sb2.append(" ");
                        String obj2 = sb2.toString();
                        int A00 = A00(ADm);
                        String A0H3 = C000200d.A0H(obj2, "[p: ");
                        int i3 = this.A08[A00];
                        if (i3 != -1) {
                            StringBuilder A0P = C000200d.A0P(A0H3);
                            A0P.append(this.A0B.A03[this.A09[i3]]);
                            A0H = A0P.toString();
                        } else {
                            A0H = C000200d.A0H(A0H3, "none");
                        }
                        String A0H4 = C000200d.A0H(A0H, ", n: ");
                        int i4 = this.A06[A00];
                        if (i4 != -1) {
                            StringBuilder A0P2 = C000200d.A0P(A0H4);
                            A0P2.append(this.A0B.A03[this.A09[i4]]);
                            A0H2 = A0P2.toString();
                        } else {
                            A0H2 = C000200d.A0H(A0H4, "none");
                        }
                        obj = C000200d.A0H(A0H2, "]");
                    }
                }
                return C000200d.A0H(obj, " }");
            }
        };
    }
}
