package X;

/* renamed from: X.3yK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86803yK extends AbstractC85393vK implements InterfaceC75323ei {
    public int A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public final int A04;
    public final InterfaceC54282iU A05;

    public C86803yK(InterfaceC54282iU interfaceC54282iU) {
        this.A05 = interfaceC54282iU;
        int A8X = interfaceC54282iU.A8X();
        this.A04 = A8X;
        this.A01 = new byte[A8X];
        this.A02 = new byte[A8X];
        this.A03 = new byte[A8X];
        this.A00 = 0;
    }

    @Override // X.InterfaceC54282iU
    public String A8K() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05.A8K());
        sb.append("/SIC");
        return sb.toString();
    }

    @Override // X.InterfaceC54282iU
    public int A8X() {
        return this.A05.A8X();
    }

    @Override // X.InterfaceC54282iU
    public void AEj(boolean z, InterfaceC54072i2 interfaceC54072i2) {
        if (interfaceC54072i2 instanceof C2i8) {
            C2i8 c2i8 = (C2i8) interfaceC54072i2;
            byte[] A1g = C02180Ae.A1g(c2i8.A01);
            this.A01 = A1g;
            int i = this.A04;
            int length = A1g.length;
            if (i >= length) {
                int i2 = i >> 1;
                int i3 = 8 > i2 ? i2 : 8;
                if (i - length <= i3) {
                    InterfaceC54072i2 interfaceC54072i22 = c2i8.A00;
                    if (interfaceC54072i22 != null) {
                        this.A05.AEj(true, interfaceC54072i22);
                    }
                    reset();
                    return;
                }
                StringBuilder A0P = C000200d.A0P("CTR/SIC mode requires IV of at least: ");
                A0P.append(i - i3);
                A0P.append(" bytes.");
                throw new IllegalArgumentException(A0P.toString());
            }
            throw new IllegalArgumentException(C000200d.A0K(C000200d.A0P("CTR/SIC mode requires IV no greater than: "), i, " bytes."));
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override // X.InterfaceC54282iU
    public int AQr(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = this.A04;
        A00(bArr, i, i3, bArr2, i2);
        return i3;
    }

    @Override // X.InterfaceC54282iU
    public void reset() {
        byte[] bArr = this.A02;
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
        byte[] bArr2 = this.A01;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        this.A05.reset();
        this.A00 = 0;
    }
}
