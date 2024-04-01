package X;

/* renamed from: X.1DM  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DM {
    public final C1DL A00;
    public final int[] A01;

    public C1DM(C1DL c1dl, int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            this.A00 = c1dl;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.A01 = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.A01 = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.A01 = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public int A00(int i) {
        int[] iArr;
        if (i == 0) {
            return this.A01[(iArr.length - 1) - 0];
        }
        int[] iArr2 = this.A01;
        int length = iArr2.length;
        if (i == 1) {
            int i2 = 0;
            for (int i3 : iArr2) {
                i2 ^= i3;
            }
            return i2;
        }
        int i4 = iArr2[0];
        for (int i5 = 1; i5 < length; i5++) {
            i4 = this.A00.A01(i, i4) ^ iArr2[i5];
        }
        return i4;
    }

    public C1DM A01(int i) {
        if (i == 0) {
            return this.A00.A04;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.A01;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = this.A00.A01(iArr[i2], i);
        }
        return new C1DM(this.A00, iArr2);
    }

    public C1DM A02(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.A00.A04;
            }
            int[] iArr = this.A01;
            int length = iArr.length;
            int[] iArr2 = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr2[i3] = this.A00.A01(iArr[i3], i2);
            }
            return new C1DM(this.A00, iArr2);
        }
        throw new IllegalArgumentException();
    }

    public C1DM A03(C1DM c1dm) {
        C1DL c1dl = this.A00;
        if (c1dl.equals(c1dm.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] == 0) {
                return c1dm;
            }
            int[] iArr2 = c1dm.A01;
            if (iArr2[0] == 0) {
                return this;
            }
            int[] iArr3 = iArr;
            if (iArr.length <= iArr2.length) {
                iArr3 = iArr2;
                iArr2 = iArr;
            }
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int length2 = length - iArr2.length;
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            for (int i = length2; i < length; i++) {
                iArr4[i] = iArr2[i - length2] ^ iArr3[i];
            }
            return new C1DM(c1dl, iArr4);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public C1DM A04(C1DM c1dm) {
        C1DL c1dl = this.A00;
        if (c1dl.equals(c1dm.A00)) {
            int[] iArr = this.A01;
            if (iArr[0] != 0) {
                int[] iArr2 = c1dm.A01;
                if (iArr2[0] != 0) {
                    int length = iArr.length;
                    int length2 = iArr2.length;
                    int[] iArr3 = new int[(length + length2) - 1];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr3[i4] = iArr3[i4] ^ c1dl.A01(i2, iArr2[i3]);
                        }
                    }
                    return new C1DM(c1dl, iArr3);
                }
            }
            return c1dl.A04;
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public String toString() {
        int[] iArr = this.A01;
        int length = iArr.length - 1;
        StringBuilder sb = new StringBuilder(length << 3);
        for (int i = length; i >= 0; i--) {
            int i2 = iArr[length - i];
            if (i2 != 0) {
                if (i2 < 0) {
                    sb.append(" - ");
                    i2 = -i2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (i == 0 || i2 != 1) {
                    C1DL c1dl = this.A00;
                    if (c1dl == null) {
                        throw null;
                    }
                    if (i2 != 0) {
                        int i3 = c1dl.A06[i2];
                        if (i3 == 0) {
                            sb.append('1');
                        } else if (i3 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i3);
                        }
                        if (i == 0) {
                            break;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (i == 1) {
                    sb.append('x');
                } else {
                    sb.append("x^");
                    sb.append(i);
                }
            }
        }
        return sb.toString();
    }
}
