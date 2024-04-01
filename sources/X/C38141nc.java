package X;

/* renamed from: X.1nc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38141nc implements C1RQ {
    public final int A00;
    public final int A01;
    public final C02640Cf A02;
    public final byte[] A03;
    public final byte[][] A04;

    @Override // X.C1RQ
    public int getType() {
        return 6;
    }

    public C38141nc(int i, int i2, byte[][] bArr, C02640Cf c02640Cf) {
        byte[] bArr2 = {(byte) 51};
        C0CT AVX = C879441d.A05.AVX();
        AVX.A02();
        C879441d c879441d = (C879441d) AVX.A00;
        c879441d.A00 |= 1;
        c879441d.A01 = i;
        AVX.A02();
        C879441d c879441d2 = (C879441d) AVX.A00;
        c879441d2.A00 |= 2;
        c879441d2.A02 = i2;
        C0AN A00 = C0AN.A00(c02640Cf.A00());
        AVX.A02();
        C879441d.A0A((C879441d) AVX.A00, A00);
        for (byte[] bArr3 : bArr) {
            C0AN A002 = C0AN.A00(bArr3);
            AVX.A02();
            C879441d.A09((C879441d) AVX.A00, A002);
        }
        byte[] A0B = AVX.A01().A0B();
        this.A00 = i;
        this.A01 = i2;
        this.A04 = bArr;
        this.A02 = c02640Cf;
        this.A03 = C75823fb.A00(bArr2, A0B);
    }

    public C38141nc(byte[] bArr) {
        try {
            byte[][] A02 = C75823fb.A02(bArr, 1, bArr.length - 1);
            int i = 0;
            byte b = A02[0][0];
            byte[] bArr2 = A02[1];
            int i2 = (b & 255) >> 4;
            if (i2 < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i2);
                throw new C1RD(sb.toString());
            } else if (i2 <= 3) {
                C879441d c879441d = (C879441d) C0AZ.A03(C879441d.A05, bArr2);
                if (c879441d.A0i() && c879441d.A0j() && c879441d.A04.size() > 0 && c879441d.A0k()) {
                    this.A03 = bArr;
                    this.A00 = c879441d.A01;
                    this.A01 = c879441d.A02;
                    this.A02 = AnonymousClass029.A13(c879441d.A03.A06());
                    C0CX c0cx = c879441d.A04;
                    this.A04 = new byte[c0cx.size()];
                    while (true) {
                        byte[][] bArr3 = this.A04;
                        if (i >= bArr3.length) {
                            return;
                        }
                        bArr3[i] = ((C0AN) c0cx.get(i)).A06();
                        i++;
                    }
                } else {
                    throw new C1RB("Incomplete message.");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i2);
                throw new C1RB(sb2.toString());
            }
        } catch (C02650Cg | C0JX e) {
            throw new C1RB(e);
        }
    }

    @Override // X.C1RQ
    public byte[] ASe() {
        return this.A03;
    }
}
