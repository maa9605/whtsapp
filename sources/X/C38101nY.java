package X;

import javax.net.ssl.SSLException;

/* renamed from: X.1nY */
/* loaded from: classes.dex */
public class C38101nY implements InterfaceC27881Pd {
    public C54312iX A00;
    public byte[] A01;
    public byte[] A02;

    public static byte[] A00(byte[] bArr, long j) {
        byte[] bArr2 = {(byte) (j >> 56), (byte) (j >> 48), (byte) (j >> 40), (byte) (j >> 32), (byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) j};
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i = length - 8;
        System.arraycopy(bArr, 0, bArr3, 0, i);
        for (int i2 = i; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 - i]);
        }
        return bArr3;
    }

    public final byte[] A01(byte[] bArr, int i, int i2) {
        C54312iX c54312iX = this.A00;
        int A00 = c54312iX.A00(i2);
        byte[] bArr2 = new byte[A00];
        int A02 = c54312iX.A02(bArr, i, i2, bArr2, 0);
        int A01 = this.A00.A01(bArr2, A02) + A02;
        if (A01 < A00) {
            byte[] bArr3 = new byte[A01];
            System.arraycopy(bArr2, 0, bArr3, 0, A01);
            return bArr3;
        }
        return bArr2;
    }

    @Override // X.InterfaceC27881Pd
    public byte[] A73(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        this.A00.A04(false, new C2i8(new C54102i5(this.A02), A00(this.A01, j)));
        this.A00.A05(bArr, 0, bArr.length);
        try {
            return A01(bArr2, i, i2);
        } catch (C54362ic e) {
            throw new C27871Pc((byte) 51, new SSLException(e), true);
        }
    }

    @Override // X.InterfaceC27881Pd
    public byte[] A7b(long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        this.A00.A04(true, new C2i8(new C54102i5(this.A02), A00(this.A01, j)));
        this.A00.A05(bArr, 0, bArr.length);
        try {
            return A01(bArr2, i, i2);
        } catch (C54362ic e) {
            throw new C27871Pc((byte) 80, new SSLException(e));
        }
    }

    @Override // X.InterfaceC27881Pd
    public C03O ACe() {
        return C03O.A00();
    }

    @Override // X.InterfaceC27881Pd
    public void AEk(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length == 16) {
            if (bArr2 != null && bArr2.length == 12) {
                this.A00 = new C54312iX(new C54272iT());
                this.A02 = bArr;
                this.A01 = bArr2;
                return;
            }
            throw new C27871Pc((byte) 80, new SSLException("Invalid iv length."));
        }
        throw new C27871Pc((byte) 80, new SSLException("Invalid key length."));
    }
}
