package X;

/* renamed from: X.1cI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC31451cI extends C0RS {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public AbstractC31451cI(int i) {
        super(null);
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.A03 = new byte[max];
            this.A02 = max;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // X.C0RS
    public final int A0E() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    public final void A0S(int i) {
        if (C0RS.A02) {
            long j = C0RS.A00 + this.A00;
            long j2 = j;
            while ((i & (-128)) != 0) {
                C09760ei.A00(this.A03, j2, (byte) ((i & 127) | 128));
                i >>>= 7;
                j2 = 1 + j2;
            }
            C09760ei.A00(this.A03, j2, (byte) i);
            int i2 = (int) ((1 + j2) - j);
            this.A00 += i2;
            this.A01 += i2;
            return;
        }
        while ((i & (-128)) != 0) {
            byte[] bArr = this.A03;
            int i3 = this.A00;
            this.A00 = i3 + 1;
            bArr[i3] = (byte) ((i & 127) | 128);
            this.A01++;
            i >>>= 7;
        }
        byte[] bArr2 = this.A03;
        int i4 = this.A00;
        this.A00 = i4 + 1;
        bArr2[i4] = (byte) i;
        this.A01++;
    }

    public final void A0T(long j) {
        if (C0RS.A02) {
            long j2 = C0RS.A00 + this.A00;
            long j3 = j2;
            while ((j & (-128)) != 0) {
                C09760ei.A00(this.A03, j3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
                j3 = 1 + j3;
            }
            C09760ei.A00(this.A03, j3, (byte) j);
            int i = (int) ((1 + j3) - j2);
            this.A00 += i;
            this.A01 += i;
            return;
        }
        while ((j & (-128)) != 0) {
            byte[] bArr = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr[i2] = (byte) ((((int) j) & 127) | 128);
            this.A01++;
            j >>>= 7;
        }
        byte[] bArr2 = this.A03;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        bArr2[i3] = (byte) j;
        this.A01++;
    }
}
