package X;

/* renamed from: X.12e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C223712e {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C223712e() {
        this.A03 = C08M.A05;
    }

    public C223712e(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public C223712e(byte[] bArr, int i) {
        this.A03 = bArr;
        this.A01 = i;
    }

    public int A00(int i) {
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (i2 > 8) {
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            this.A02 = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + 1;
        }
        A01();
        return i6;
    }

    public final void A01() {
        int i;
        int i2 = this.A02;
        C002701i.A1K(i2 >= 0 && (i2 < (i = this.A01) || (i2 == i && this.A00 == 0)));
    }

    public void A02(int i) {
        int i2 = i >> 3;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = (i - (i2 << 3)) + this.A00;
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A01();
    }

    public void A03(byte[] bArr, int i) {
        C002701i.A1K(this.A00 == 0);
        System.arraycopy(this.A03, this.A02, bArr, 0, i);
        this.A02 += i;
        A01();
    }

    public boolean A04() {
        byte[] bArr = this.A03;
        int i = this.A02;
        byte b = bArr[i];
        int i2 = this.A00;
        boolean z = (b & (128 >> i2)) != 0;
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 == 8) {
            this.A00 = 0;
            this.A02 = i + 1;
        }
        A01();
        return z;
    }
}
