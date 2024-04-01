package X;

/* renamed from: X.1ne  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38161ne implements C1RQ {
    public final int A00;
    public final int A01;
    public final C02640Cf A02;
    public final byte[] A03;
    public final byte[] A04;

    @Override // X.C1RQ
    public int getType() {
        return 5;
    }

    public C38161ne(int i, int i2, byte[] bArr, C02640Cf c02640Cf) {
        C0CT AVX = C879741g.A05.AVX();
        AVX.A02();
        C879741g c879741g = (C879741g) AVX.A00;
        c879741g.A00 |= 1;
        c879741g.A01 = i;
        AVX.A02();
        C879741g c879741g2 = (C879741g) AVX.A00;
        c879741g2.A00 |= 2;
        c879741g2.A02 = i2;
        C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
        AVX.A02();
        C879741g.A09((C879741g) AVX.A00, A01);
        C0AN A00 = C0AN.A00(c02640Cf.A00());
        AVX.A02();
        C879741g.A0A((C879741g) AVX.A00, A00);
        byte[] A0B = AVX.A01().A0B();
        this.A00 = i;
        this.A01 = i2;
        this.A03 = bArr;
        this.A02 = c02640Cf;
        this.A04 = C75823fb.A00(new byte[]{(byte) 51}, A0B);
    }

    public C38161ne(byte[] bArr) {
        try {
            byte[][] A02 = C75823fb.A02(bArr, 1, bArr.length - 1);
            byte b = A02[0][0];
            byte[] bArr2 = A02[1];
            int i = (b & 255) >> 4;
            if (i < 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i);
                throw new C1RD(sb.toString());
            } else if (i <= 3) {
                C879741g c879741g = (C879741g) C0AZ.A03(C879741g.A05, bArr2);
                if (c879741g.A0j() && c879741g.A0k() && c879741g.A0i() && c879741g.A0l()) {
                    this.A04 = bArr;
                    this.A00 = c879741g.A01;
                    this.A01 = c879741g.A02;
                    this.A03 = c879741g.A03.A06();
                    this.A02 = AnonymousClass029.A13(c879741g.A04.A06());
                    return;
                }
                throw new C1RB("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i);
                throw new C1RB(sb2.toString());
            }
        } catch (C02650Cg | C0JX e) {
            throw new C1RB(e);
        }
    }

    @Override // X.C1RQ
    public byte[] ASe() {
        return this.A04;
    }
}
