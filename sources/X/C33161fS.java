package X;

/* renamed from: X.1fS  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33161fS extends C1D7 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public C33161fS(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6) {
        super(i5, i6);
        if (i3 + i5 <= i && i4 + i6 <= i2) {
            this.A04 = bArr;
            this.A01 = i;
            this.A00 = i2;
            this.A02 = i3;
            this.A03 = i4;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    @Override // X.C1D7
    public byte[] A00() {
        int i = super.A01;
        int i2 = super.A00;
        int i3 = this.A01;
        if (i == i3 && i2 == this.A00) {
            return this.A04;
        }
        int i4 = i * i2;
        byte[] bArr = new byte[i4];
        int i5 = (this.A03 * i3) + this.A02;
        if (i == i3) {
            System.arraycopy(this.A04, i5, bArr, 0, i4);
            return bArr;
        }
        byte[] bArr2 = this.A04;
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(bArr2, i5, bArr, i6 * i, i);
            i5 += i3;
        }
        return bArr;
    }

    @Override // X.C1D7
    public byte[] A01(int i, byte[] bArr) {
        if (i >= 0 && i < super.A00) {
            int i2 = super.A01;
            if (bArr == null || bArr.length < i2) {
                bArr = new byte[i2];
            }
            System.arraycopy(this.A04, ((i + this.A03) * this.A01) + this.A02, bArr, 0, i2);
            return bArr;
        }
        throw new IllegalArgumentException(C000200d.A0D("Requested row is outside the image: ", i));
    }
}
