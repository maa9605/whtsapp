package X;

/* renamed from: X.3yI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86783yI extends AbstractC85393vK {
    public int A00;
    public int A01;
    public InterfaceC54282iU A02;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public byte[] A07;

    public C86783yI(InterfaceC54282iU interfaceC54282iU, int i) {
        this.A02 = interfaceC54282iU;
        int i2 = i >> 3;
        this.A00 = i2;
        int A8X = interfaceC54282iU.A8X();
        this.A04 = new byte[A8X];
        this.A06 = new byte[A8X];
        this.A05 = new byte[A8X];
        this.A07 = new byte[i2];
    }

    @Override // X.InterfaceC54282iU
    public String A8K() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02.A8K());
        sb.append("/CFB");
        sb.append(this.A00 << 3);
        return sb.toString();
    }

    @Override // X.InterfaceC54282iU
    public int A8X() {
        return this.A00;
    }

    @Override // X.InterfaceC54282iU
    public void AEj(boolean z, InterfaceC54072i2 interfaceC54072i2) {
        this.A03 = z;
        if (interfaceC54072i2 instanceof C2i8) {
            C2i8 c2i8 = (C2i8) interfaceC54072i2;
            byte[] bArr = c2i8.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A04;
            int length2 = bArr2.length;
            if (length < length2) {
                System.arraycopy(bArr, 0, bArr2, length2 - length, length);
                int i = 0;
                while (true) {
                    byte[] bArr3 = this.A04;
                    if (i >= bArr3.length - bArr.length) {
                        break;
                    }
                    bArr3[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            InterfaceC54072i2 interfaceC54072i22 = c2i8.A00;
            if (interfaceC54072i22 != null) {
                this.A02.AEj(true, interfaceC54072i22);
                return;
            }
            return;
        }
        reset();
        if (interfaceC54072i2 != null) {
            this.A02.AEj(true, interfaceC54072i2);
        }
    }

    @Override // X.InterfaceC54282iU
    public int AQr(byte[] bArr, int i, byte[] bArr2, int i2) {
        A00(bArr, i, this.A00, bArr2, i2);
        return this.A00;
    }

    @Override // X.InterfaceC54282iU
    public void reset() {
        byte[] bArr = this.A04;
        System.arraycopy(bArr, 0, this.A06, 0, bArr.length);
        byte[] bArr2 = this.A07;
        for (int i = 0; i < bArr2.length; i++) {
            bArr2[i] = 0;
        }
        this.A01 = 0;
        this.A02.reset();
    }
}
