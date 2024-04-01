package X;

/* renamed from: X.0en */
/* loaded from: classes.dex */
public class C09810en extends C0RS {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public C09810en(byte[] bArr, int i) {
        super(null);
        int length = bArr.length;
        int i2 = 0 + i;
        if ((0 | i | (length - i2)) >= 0) {
            this.A02 = bArr;
            this.A00 = 0;
            this.A01 = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
    }

    @Override // X.C0RT
    public final void A00(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A02, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C24701Cn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(i2)), e);
        }
    }

    @Override // X.C0RS
    public final int A0E() {
        return this.A01 - this.A00;
    }

    @Override // X.C0RS
    public final void A0F(int i) {
        if (C0RS.A02 && A0E() >= 10) {
            long j = C0RS.A00 + this.A00;
            while ((i & (-128)) != 0) {
                C09760ei.A00(this.A02, j, (byte) ((i & 127) | 128));
                this.A00++;
                i >>>= 7;
                j = 1 + j;
            }
            C09760ei.A00(this.A02, j, (byte) i);
            this.A00++;
            return;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.A02;
                int i2 = this.A00;
                this.A00 = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C24701Cn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A00), Integer.valueOf(this.A01), 1), e);
            }
        }
        byte[] bArr2 = this.A02;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // X.C0RS
    public final void A0H(int i, int i2) {
        A0F((i << 3) | 5);
        try {
            byte[] bArr = this.A02;
            int i3 = this.A00;
            int i4 = i3 + 1;
            this.A00 = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.A00 = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.A00 = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.A00 = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C24701Cn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A00), Integer.valueOf(this.A01), 1), e);
        }
    }

    @Override // X.C0RS
    public final void A0I(int i, int i2) {
        A0F((i << 3) | 0);
        if (i2 >= 0) {
            A0F(i2);
        } else {
            A0S(i2);
        }
    }

    @Override // X.C0RS
    public final void A0J(int i, int i2) {
        A0F((i << 3) | i2);
    }

    @Override // X.C0RS
    public final void A0K(int i, int i2) {
        A0F((i << 3) | 0);
        A0F(i2);
    }

    @Override // X.C0RS
    public final void A0L(int i, long j) {
        A0F((i << 3) | 1);
        try {
            byte[] bArr = this.A02;
            int i2 = this.A00;
            int i3 = i2 + 1;
            this.A00 = i3;
            bArr[i2] = (byte) (((int) j) & 255);
            int i4 = i3 + 1;
            this.A00 = i4;
            bArr[i3] = (byte) (((int) (j >> 8)) & 255);
            int i5 = i4 + 1;
            this.A00 = i5;
            bArr[i4] = (byte) (((int) (j >> 16)) & 255);
            int i6 = i5 + 1;
            this.A00 = i6;
            bArr[i5] = (byte) (((int) (j >> 24)) & 255);
            int i7 = i6 + 1;
            this.A00 = i7;
            bArr[i6] = (byte) (((int) (j >> 32)) & 255);
            int i8 = i7 + 1;
            this.A00 = i8;
            bArr[i7] = (byte) (((int) (j >> 40)) & 255);
            int i9 = i8 + 1;
            this.A00 = i9;
            bArr[i8] = (byte) (((int) (j >> 48)) & 255);
            this.A00 = i9 + 1;
            bArr[i9] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C24701Cn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A00), Integer.valueOf(this.A01), 1), e);
        }
    }

    @Override // X.C0RS
    public final void A0M(int i, long j) {
        A0F((i << 3) | 0);
        A0S(j);
    }

    @Override // X.C0RS
    public final void A0N(int i, C0AN c0an) {
        A0F((i << 3) | 2);
        A0F(c0an.A03());
        C02230Aj c02230Aj = (C02230Aj) c0an;
        A00(c02230Aj.bytes, c02230Aj.A07(), c02230Aj.A03());
    }

    @Override // X.C0RS
    public final void A0O(int i, C0AX c0ax) {
        A0F((i << 3) | 2);
        A0F(c0ax.AD4());
        c0ax.AWK(this);
    }

    @Override // X.C0RS
    public final void A0P(int i, String str) {
        A0F((i << 3) | 2);
        int i2 = this.A00;
        try {
            int length = str.length();
            int A03 = C0RS.A03(length * 3);
            int A032 = C0RS.A03(length);
            if (A032 == A03) {
                int i3 = i2 + A032;
                this.A00 = i3;
                int A00 = C09780ek.A00.A00(str, this.A02, i3, A0E());
                this.A00 = i2;
                A0F((A00 - i2) - A032);
                this.A00 = A00;
                return;
            }
            A0F(C09780ek.A00(str));
            this.A00 = C09780ek.A00.A00(str, this.A02, this.A00, A0E());
        } catch (C24811Cy e) {
            this.A00 = i2;
            A0R(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new C24701Cn(e2);
        }
    }

    @Override // X.C0RS
    public final void A0Q(int i, boolean z) {
        A0F((i << 3) | 0);
        byte b = z ? (byte) 1 : (byte) 0;
        try {
            byte[] bArr = this.A02;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C24701Cn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A00), Integer.valueOf(this.A01), 1), e);
        }
    }

    public final void A0S(long j) {
        if (C0RS.A02 && A0E() >= 10) {
            long j2 = C0RS.A00 + this.A00;
            while ((j & (-128)) != 0) {
                C09760ei.A00(this.A02, j2, (byte) ((((int) j) & 127) | 128));
                this.A00++;
                j >>>= 7;
                j2 = 1 + j2;
            }
            C09760ei.A00(this.A02, j2, (byte) j);
            this.A00++;
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr = this.A02;
                int i = this.A00;
                this.A00 = i + 1;
                bArr[i] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C24701Cn(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.A00), Integer.valueOf(this.A01), 1), e);
            }
        }
        byte[] bArr2 = this.A02;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr2[i2] = (byte) j;
    }
}
