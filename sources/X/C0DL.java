package X;

/* renamed from: X.0DL  reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0DL implements C0DM, C0DN {
    public int A00;
    public long A01;
    public final byte[] A02;

    public abstract void A02();

    public abstract void A03(long j);

    public abstract void A04(byte[] bArr, int i);

    @Override // X.C0DN
    public int A8e() {
        return 64;
    }

    public C0DL() {
        this.A02 = new byte[4];
        this.A00 = 0;
    }

    public C0DL(C0DL c0dl) {
        this.A02 = new byte[4];
        A01(c0dl);
    }

    public void A00() {
        long j = this.A01 << 3;
        AVj(Byte.MIN_VALUE);
        while (this.A00 != 0) {
            AVj((byte) 0);
        }
        A03(j);
        A02();
    }

    public void A01(C0DL c0dl) {
        byte[] bArr = c0dl.A02;
        System.arraycopy(bArr, 0, this.A02, 0, bArr.length);
        this.A00 = c0dl.A00;
        this.A01 = c0dl.A01;
    }

    @Override // X.C0DO
    public void AVj(byte b) {
        byte[] bArr = this.A02;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            A04(bArr, 0);
            this.A00 = 0;
        }
        this.A01++;
    }

    @Override // X.C0DO
    public void reset() {
        this.A01 = 0L;
        this.A00 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A02;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // X.C0DO
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        int i4 = this.A00;
        int i5 = i4;
        int i6 = 0;
        if (i4 != 0) {
            while (true) {
                if (i6 >= max) {
                    i3 = i6;
                    break;
                }
                byte[] bArr2 = this.A02;
                int i7 = i4;
                i4++;
                this.A00 = i4;
                i5 = i4;
                int i8 = i6 + 1;
                bArr2[i7] = bArr[i6 + i];
                if (i4 == 4) {
                    A04(bArr2, 0);
                    this.A00 = 0;
                    i5 = 0;
                    i3 = i8;
                    break;
                }
                i6 = i8;
            }
        }
        int i9 = ((max - i3) & (-4)) + i3;
        while (i3 < i9) {
            A04(bArr, i + i3);
            i3 += 4;
        }
        while (i3 < max) {
            byte[] bArr3 = this.A02;
            int i10 = i5;
            i5++;
            this.A00 = i5;
            bArr3[i10] = bArr[i3 + i];
            i3++;
        }
        this.A01 += max;
    }
}
