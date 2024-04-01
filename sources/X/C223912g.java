package X;

/* renamed from: X.12g  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C223912g {
    public int A00 = 0;
    public int A01;
    public int A02;
    public byte[] A03;

    public C223912g(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        A03();
    }

    public final int A00() {
        int i = 0;
        while (!A04()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? A01(i) : 0);
    }

    public int A01(int i) {
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (true) {
            if (i2 <= 8) {
                break;
            }
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            i3 |= (bArr[i4] & 255) << i2;
            if (!A05(i4 + 1)) {
                r6 = 1;
            }
            this.A02 = i4 + r6;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + (A05(i5 + 1) ? 2 : 1);
        }
        A03();
        return i6;
    }

    public void A02() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            int i2 = this.A02;
            this.A02 = i2 + (A05(i2 + 1) ? 2 : 1);
        }
        A03();
    }

    public final void A03() {
        int i;
        int i2 = this.A02;
        C002701i.A1K(i2 >= 0 && (i2 < (i = this.A01) || (i2 == i && this.A00 == 0)));
    }

    public boolean A04() {
        boolean z = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A02();
        return z;
    }

    public final boolean A05(int i) {
        if (2 > i || i >= this.A01) {
            return false;
        }
        byte[] bArr = this.A03;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }
}
