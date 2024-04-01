package X;

/* renamed from: X.27v */
/* loaded from: classes2.dex */
public class C466927v {
    public final byte[] A00;

    public C466927v(byte[] bArr) {
        this.A00 = bArr;
    }

    public final C54312iX A00(long j, boolean z) {
        C54312iX c54312iX = new C54312iX(new C54272iT());
        c54312iX.A04(z, new C2i8(new C54102i5(this.A00), new byte[]{0, 0, 0, 0, (byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j}));
        return c54312iX;
    }

    public byte[] A01(long j, byte[] bArr, byte[] bArr2) {
        try {
            C54312iX A00 = A00(j, false);
            A00.A05(bArr, 0, bArr.length);
            int length = bArr2.length;
            int A002 = A00.A00(length);
            byte[] bArr3 = new byte[A002];
            int A02 = A00.A02(bArr2, 0, length, bArr3, 0);
            int A01 = A00.A01(bArr3, A02) + A02;
            if (A01 < A002) {
                byte[] bArr4 = new byte[A01];
                System.arraycopy(bArr3, 0, bArr4, 0, A01);
                return bArr4;
            }
            return bArr3;
        } catch (C54362ic e) {
            throw new Exception(e) { // from class: X.27w
                {
                    C466927v.this = this;
                }
            };
        }
    }

    public byte[] A02(long j, byte[] bArr, byte[] bArr2, int i) {
        try {
            C54312iX A00 = A00(j, true);
            A00.A05(bArr, 0, bArr.length);
            int A002 = A00.A00(i);
            byte[] bArr3 = new byte[A002];
            int A02 = A00.A02(bArr2, 0, i, bArr3, 0);
            int A01 = A00.A01(bArr3, A02) + A02;
            if (A01 < A002) {
                byte[] bArr4 = new byte[A01];
                System.arraycopy(bArr3, 0, bArr4, 0, A01);
                return bArr4;
            }
            return bArr3;
        } catch (C54362ic e) {
            throw new AssertionError(e);
        }
    }
}
