package X;

/* renamed from: X.1nd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38151nd implements C1RQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C1R8 A03;
    public final C02640Cf A04;
    public final C38171nf A05;
    public final AbstractC75873fg A06;
    public final byte[] A07;

    @Override // X.C1RQ
    public int getType() {
        return 3;
    }

    public C38151nd(int i, int i2, AbstractC75873fg abstractC75873fg, int i3, C02640Cf c02640Cf, C1R8 c1r8, C38171nf c38171nf) {
        this.A02 = i;
        this.A00 = i2;
        this.A06 = abstractC75873fg;
        this.A01 = i3;
        this.A04 = c02640Cf;
        this.A03 = c1r8;
        this.A05 = c38171nf;
        C0CT AVX = C29B.A07.AVX();
        AVX.A02();
        C29B c29b = (C29B) AVX.A00;
        c29b.A00 |= 4;
        c29b.A03 = i3;
        C0AN A00 = C0AN.A00(c02640Cf.A00());
        AVX.A02();
        C29B.A09((C29B) AVX.A00, A00);
        C0AN A002 = C0AN.A00(c1r8.A00.A00());
        AVX.A02();
        C29B.A0A((C29B) AVX.A00, A002);
        C0AN A003 = C0AN.A00(c38171nf.A04);
        AVX.A02();
        C29B.A0B((C29B) AVX.A00, A003);
        AVX.A02();
        C29B c29b2 = (C29B) AVX.A00;
        c29b2.A00 |= 1;
        c29b2.A02 = i2;
        if (abstractC75873fg.A02()) {
            int intValue = ((Number) abstractC75873fg.A01()).intValue();
            AVX.A02();
            C29B c29b3 = (C29B) AVX.A00;
            c29b3.A00 |= 2;
            c29b3.A01 = intValue;
        }
        this.A07 = C75823fb.A00(new byte[]{(byte) (((this.A02 << 4) | 3) & 255)}, AVX.A01().A0B());
    }

    public C38151nd(byte[] bArr) {
        AbstractC75873fg abstractC75873fg;
        int i;
        try {
            int i2 = (bArr[0] & 255) >> 4;
            this.A02 = i2;
            if (i2 > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown version: ");
                sb.append(i2);
                final String obj = sb.toString();
                throw new Exception(obj) { // from class: X.1RC
                };
            } else if (i2 >= 3) {
                C29B c29b = (C29B) C0AZ.A00(C29B.A07, C0AN.A01(bArr, 1, bArr.length - 1));
                boolean A0m = c29b.A0m();
                if (A0m && c29b.A0i() && c29b.A0j() && c29b.A0k()) {
                    this.A07 = bArr;
                    this.A00 = c29b.A02;
                    if (c29b.A0l()) {
                        abstractC75873fg = AbstractC75873fg.A00(Integer.valueOf(c29b.A01));
                    } else {
                        abstractC75873fg = C85543vn.A00;
                    }
                    this.A06 = abstractC75873fg;
                    if (!A0m) {
                        i = -1;
                    } else {
                        i = c29b.A03;
                    }
                    this.A01 = i;
                    this.A04 = AnonymousClass029.A13(c29b.A04.A06());
                    this.A03 = new C1R8(AnonymousClass029.A13(c29b.A05.A06()));
                    this.A05 = new C38171nf(c29b.A06.A06());
                    return;
                }
                throw new C1RB("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Legacy version: ");
                sb2.append(i2);
                throw new C1RD(sb2.toString());
            }
        } catch (C02650Cg | C0JX | C1RD e) {
            throw new C1RB(e);
        }
    }

    @Override // X.C1RQ
    public byte[] ASe() {
        return this.A07;
    }
}
