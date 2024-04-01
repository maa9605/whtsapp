package X;

/* renamed from: X.1RT */
/* loaded from: classes.dex */
public class C1RT {
    public C2U4 A00;

    public C1RT() {
        this.A00 = (C2U4) C2U4.A0E.AVX().A01();
    }

    public C1RT(C1RT c1rt) {
        this.A00 = (C2U4) c1rt.A00.AVX().A01();
    }

    public C1RT(C2U4 c2u4) {
        this.A00 = c2u4;
    }

    public int A00() {
        int i = this.A00.A04;
        if (i == 0) {
            return 2;
        }
        return i;
    }

    public C1R8 A01() {
        try {
            return new C1R8(this.A00.A06.A06());
        } catch (C02650Cg e) {
            throw new AssertionError(e);
        }
    }

    public C1R8 A02() {
        try {
            C2U4 c2u4 = this.A00;
            if (c2u4.A0l()) {
                return new C1R8(c2u4.A07.A06());
            }
            return null;
        } catch (C02650Cg e) {
            C02180Ae.A1E(e);
            return null;
        }
    }

    public C02640Cf A03() {
        try {
            return AnonymousClass029.A13(this.A00.A0i().A02.A06());
        } catch (C02650Cg e) {
            throw new AssertionError(e);
        }
    }

    public C75793fY A04() {
        C74923e4 A0i = this.A00.A0i().A0i();
        return new C75793fY(AbstractC75763fV.A00(A00()), A0i.A02.A06(), A0i.A01);
    }

    public C75843fd A05() {
        AbstractC75873fg abstractC75873fg;
        try {
            C71353Vu A0j = this.A00.A0j();
            if (A0j.A0i()) {
                abstractC75873fg = AbstractC75873fg.A00(Integer.valueOf(A0j.A01));
            } else {
                abstractC75873fg = C85543vn.A00;
            }
            return new C75843fd(abstractC75873fg, A0j.A02, AnonymousClass029.A13(A0j.A03.A06()));
        } catch (C02650Cg e) {
            throw new AssertionError(e);
        }
    }

    public final C1RU A06(C02640Cf c02640Cf) {
        int i = 0;
        for (C74893e1 c74893e1 : this.A00.A09) {
            try {
            } catch (C02650Cg e) {
                C02180Ae.A1E(e);
            }
            if (AnonymousClass029.A13(c74893e1.A02.A06()).equals(c02640Cf)) {
                return new C1RU(c74893e1, Integer.valueOf(i));
            }
            continue;
            i++;
        }
        return null;
    }

    public void A07() {
        C0CT AVX = this.A00.AVX();
        AVX.A02();
        C2U4 c2u4 = (C2U4) AVX.A00;
        c2u4.A00 |= 1;
        c2u4.A04 = 3;
        this.A00 = (C2U4) AVX.A01();
    }

    public void A08(int i) {
        C0CT AVX = this.A00.AVX();
        AVX.A02();
        C2U4 c2u4 = (C2U4) AVX.A00;
        c2u4.A00 |= 512;
        c2u4.A01 = i;
        this.A00 = (C2U4) AVX.A01();
    }

    public void A09(int i) {
        C0CT AVX = this.A00.AVX();
        AVX.A02();
        C2U4 c2u4 = (C2U4) AVX.A00;
        c2u4.A00 |= 256;
        c2u4.A03 = i;
        this.A00 = (C2U4) AVX.A01();
    }

    public void A0A(C1R8 c1r8) {
        C0CT AVX = this.A00.AVX();
        C0AN A00 = C0AN.A00(c1r8.A00.A00());
        AVX.A02();
        C2U4.A0A((C2U4) AVX.A00, A00);
        this.A00 = (C2U4) AVX.A01();
    }

    public void A0B(C1R8 c1r8) {
        C0CT AVX = this.A00.AVX();
        C0AN A00 = C0AN.A00(c1r8.A00.A00());
        AVX.A02();
        C2U4.A0B((C2U4) AVX.A00, A00);
        this.A00 = (C2U4) AVX.A01();
    }

    public void A0C(C02640Cf c02640Cf, C75793fY c75793fY) {
        C74933e5 A09 = C74923e4.A09();
        C0AN A00 = C0AN.A00(c75793fY.A02);
        A09.A02();
        C74923e4.A0A((C74923e4) A09.A00, A00);
        A09.A04(c75793fY.A00);
        C0CT AVX = C74893e1.A05.AVX();
        AVX.A02();
        C74893e1.A0E((C74893e1) AVX.A00, (C74923e4) A09.A01());
        C0AN A002 = C0AN.A00(c02640Cf.A00());
        AVX.A02();
        C74893e1.A0B((C74893e1) AVX.A00, A002);
        C0CT AVX2 = this.A00.AVX();
        AVX2.A02();
        C2U4.A0F((C2U4) AVX2.A00, (C74893e1) AVX.A01());
        C2U4 c2u4 = (C2U4) AVX2.A01();
        this.A00 = c2u4;
        if (c2u4.A09.size() > 5) {
            C0CT AVX3 = this.A00.AVX();
            AVX3.A02();
            C2U4.A09((C2U4) AVX3.A00);
            this.A00 = (C2U4) AVX3.A01();
        }
    }

    public void A0D(C02670Ci c02670Ci, C75793fY c75793fY) {
        C74933e5 A09 = C74923e4.A09();
        C0AN A00 = C0AN.A00(c75793fY.A02);
        A09.A02();
        C74923e4.A0A((C74923e4) A09.A00, A00);
        A09.A04(c75793fY.A00);
        C0CT AVX = C74893e1.A05.AVX();
        C0AN A002 = C0AN.A00(c02670Ci.A00.A00());
        AVX.A02();
        C74893e1.A0B((C74893e1) AVX.A00, A002);
        C0AN A003 = C0AN.A00(c02670Ci.A01.ASe());
        AVX.A02();
        C74893e1.A0C((C74893e1) AVX.A00, A003);
        AVX.A02();
        C74893e1.A0E((C74893e1) AVX.A00, (C74923e4) A09.A01());
        C0CT AVX2 = this.A00.AVX();
        AVX2.A02();
        C2U4.A0E((C2U4) AVX2.A00, (C74893e1) AVX.A01());
        this.A00 = (C2U4) AVX2.A01();
    }

    public void A0E(C75793fY c75793fY) {
        C74933e5 A09 = C74923e4.A09();
        C0AN A00 = C0AN.A00(c75793fY.A02);
        A09.A02();
        C74923e4.A0A((C74923e4) A09.A00, A00);
        A09.A04(c75793fY.A00);
        C0CT AVX = this.A00.A0i().AVX();
        AVX.A02();
        C74893e1.A0E((C74893e1) AVX.A00, (C74923e4) A09.A01());
        C0CT AVX2 = this.A00.AVX();
        AVX2.A02();
        C2U4.A0E((C2U4) AVX2.A00, (C74893e1) AVX.A01());
        this.A00 = (C2U4) AVX2.A01();
    }

    public void A0F(C75833fc c75833fc) {
        C0CT AVX = this.A00.AVX();
        C0AN A00 = C0AN.A00(c75833fc.A01);
        AVX.A02();
        C2U4.A0C((C2U4) AVX.A00, A00);
        this.A00 = (C2U4) AVX.A01();
    }

    public void A0G(AbstractC75873fg abstractC75873fg, int i, C02640Cf c02640Cf) {
        C0CT AVX = C71353Vu.A04.AVX();
        AVX.A02();
        C71353Vu c71353Vu = (C71353Vu) AVX.A00;
        c71353Vu.A00 |= 2;
        c71353Vu.A02 = i;
        C0AN A00 = C0AN.A00(c02640Cf.A00());
        AVX.A02();
        C71353Vu.A09((C71353Vu) AVX.A00, A00);
        if (abstractC75873fg.A02()) {
            int intValue = ((Number) abstractC75873fg.A01()).intValue();
            AVX.A02();
            C71353Vu c71353Vu2 = (C71353Vu) AVX.A00;
            c71353Vu2.A00 |= 1;
            c71353Vu2.A01 = intValue;
        }
        C0CT AVX2 = this.A00.AVX();
        AVX2.A02();
        C2U4.A0G((C2U4) AVX2.A00, (C71353Vu) AVX.A01());
        this.A00 = (C2U4) AVX2.A01();
    }

    public void A0H(byte[] bArr) {
        C0CT AVX = this.A00.AVX();
        C0AN A00 = C0AN.A00(bArr);
        AVX.A02();
        C2U4.A0D((C2U4) AVX.A00, A00);
        this.A00 = (C2U4) AVX.A01();
    }

    public byte[] A0I() {
        return this.A00.A05.A06();
    }
}
