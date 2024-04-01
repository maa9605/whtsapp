package X;

/* renamed from: X.3yJ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86793yJ extends AbstractC85393vK {
    public int A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final InterfaceC54282iU A05;

    public C86793yJ(InterfaceC54282iU interfaceC54282iU, int i) {
        this.A05 = interfaceC54282iU;
        this.A04 = i >> 3;
        int A8X = interfaceC54282iU.A8X();
        this.A01 = new byte[A8X];
        this.A03 = new byte[A8X];
        this.A02 = new byte[A8X];
    }

    @Override // X.InterfaceC54282iU
    public String A8K() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05.A8K());
        sb.append("/OFB");
        sb.append(this.A04 << 3);
        return sb.toString();
    }

    @Override // X.InterfaceC54282iU
    public int A8X() {
        return this.A04;
    }

    @Override // X.InterfaceC54282iU
    public void AEj(boolean z, InterfaceC54072i2 interfaceC54072i2) {
        if (interfaceC54072i2 instanceof C2i8) {
            C2i8 c2i8 = (C2i8) interfaceC54072i2;
            byte[] bArr = c2i8.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A01;
            int length2 = bArr2.length;
            if (length < length2) {
                System.arraycopy(bArr, 0, bArr2, length2 - length, length);
                int i = 0;
                while (true) {
                    byte[] bArr3 = this.A01;
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
                this.A05.AEj(true, interfaceC54072i22);
                return;
            }
            return;
        }
        reset();
        if (interfaceC54072i2 != null) {
            this.A05.AEj(true, interfaceC54072i2);
        }
    }

    @Override // X.InterfaceC54282iU
    public int AQr(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.A04;
        A00(bArr, i, i3, bArr2, i2);
        return i3;
    }

    @Override // X.InterfaceC54282iU
    public void reset() {
        byte[] bArr = this.A01;
        System.arraycopy(bArr, 0, this.A03, 0, bArr.length);
        this.A00 = 0;
        this.A05.reset();
    }
}
