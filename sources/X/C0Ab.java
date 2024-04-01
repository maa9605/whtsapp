package X;

import java.util.Arrays;

/* renamed from: X.0Ab  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Ab {
    public static final C0Ab A04 = new C0Ab(0, new int[0], new Object[0], false);
    public int A00;
    public boolean A01;
    public int[] A02;
    public Object[] A03;
    public int count;

    public C0Ab() {
        this(0, new int[8], new Object[8], true);
    }

    public C0Ab(int i, int[] iArr, Object[] objArr, boolean z) {
        this.A00 = -1;
        this.count = i;
        this.A02 = iArr;
        this.A03 = objArr;
        this.A01 = z;
    }

    public int A00() {
        int A08;
        int i = this.A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.A02[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 += C0RS.A03((i5 << 3) | 0) + 8;
                } else if (i6 == 2) {
                    A08 = C0RS.A09(i5, (C0AN) this.A03[i3]);
                } else if (i6 == 3) {
                    i2 = ((C0Ab) this.A03[i3]).A00() + (C0RS.A03((i5 << 3) | 0) << 1) + i2;
                } else if (i6 == 5) {
                    A08 = C0RS.A03((i5 << 3) | 0) + 4;
                } else {
                    throw new IllegalStateException(new C0JX("Protocol message tag had invalid wire type."));
                }
            } else {
                A08 = C0RS.A08(i5, ((Number) this.A03[i3]).longValue());
            }
            i2 = A08 + i2;
        }
        this.A00 = i2;
        return i2;
    }

    public final void A01(int i, Object obj) {
        int i2 = this.count;
        int[] iArr = this.A02;
        if (i2 == iArr.length) {
            int i3 = i2 >> 1;
            if (i2 < 4) {
                i3 = 8;
            }
            int i4 = i2 + i3;
            this.A02 = Arrays.copyOf(iArr, i4);
            this.A03 = Arrays.copyOf(this.A03, i4);
        }
        int[] iArr2 = this.A02;
        int i5 = this.count;
        iArr2[i5] = i;
        this.A03[i5] = obj;
        this.count = i5 + 1;
    }

    public void A02(C0RS c0rs) {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.A02[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0rs.A0M(i3, ((Number) this.A03[i]).longValue());
            } else if (i4 == 1) {
                c0rs.A0L(i3, ((Number) this.A03[i]).longValue());
            } else if (i4 == 2) {
                c0rs.A0N(i3, (C0AN) this.A03[i]);
            } else if (i4 == 3) {
                c0rs.A0J(i3, 3);
                ((C0Ab) this.A03[i]).A02(c0rs);
                c0rs.A0J(i3, 4);
            } else if (i4 == 5) {
                c0rs.A0H(i3, ((Number) this.A03[i]).intValue());
            } else {
                throw new C0JX("Protocol message tag had invalid wire type.");
            }
        }
    }

    public boolean A03(int i, C0RO c0ro) {
        int A03;
        if (this.A01) {
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i3 == 0) {
                A01(i, Long.valueOf(c0ro.A06()));
                return true;
            } else if (i3 == 1) {
                A01(i, Long.valueOf(c0ro.A05()));
                return true;
            } else if (i3 == 2) {
                A01(i, c0ro.A08());
                return true;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 == 5) {
                        A01(i, Integer.valueOf(c0ro.A01()));
                        return true;
                    }
                    throw new C0JX("Protocol message tag had invalid wire type.");
                }
                return false;
            } else {
                C0Ab c0Ab = new C0Ab(0, new int[8], new Object[8], true);
                do {
                    A03 = c0ro.A03();
                    if (A03 == 0) {
                        break;
                    }
                } while (c0Ab.A03(A03, c0ro));
                c0ro.A0C((i2 << 3) | 4);
                A01(i, c0Ab);
                return true;
            }
        }
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0Ab)) {
            C0Ab c0Ab = (C0Ab) obj;
            return this.count == c0Ab.count && Arrays.equals(this.A02, c0Ab.A02) && Arrays.deepEquals(this.A03, c0Ab.A03);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.deepHashCode(this.A03) + ((Arrays.hashCode(this.A02) + ((527 + this.count) * 31)) * 31);
    }
}
