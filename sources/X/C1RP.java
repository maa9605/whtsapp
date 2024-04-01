package X;

/* renamed from: X.1RP  reason: invalid class name */
/* loaded from: classes.dex */
public class C1RP {
    public C12560jg A00;

    public C1RP(int i, int i2, byte[] bArr, C02640Cf c02640Cf, AbstractC75873fg abstractC75873fg) {
        C880941s A09 = C881041t.A09();
        A09.A04(i2);
        C0AN A01 = C0AN.A01(bArr, 0, bArr.length);
        A09.A02();
        C881041t.A0A((C881041t) A09.A00, A01);
        C881041t c881041t = (C881041t) A09.A01();
        C75103eM c75103eM = (C75103eM) C75093eL.A03.AVX();
        C0AN A00 = C0AN.A00(c02640Cf.A00());
        c75103eM.A02();
        C75093eL.A09((C75093eL) c75103eM.A00, A00);
        if (abstractC75873fg.A02()) {
            C0AN A002 = C0AN.A00(((InterfaceC02660Ch) abstractC75873fg.A01()).ASe());
            c75103eM.A02();
            C75093eL.A0A((C75093eL) c75103eM.A00, A002);
        }
        C0CT AVX = C12560jg.A05.AVX();
        AVX.A02();
        C12560jg c12560jg = (C12560jg) AVX.A00;
        c12560jg.A00 |= 1;
        c12560jg.A01 = i;
        AVX.A02();
        C12560jg.A09((C12560jg) AVX.A00, c881041t);
        AVX.A02();
        C12560jg.A0A((C12560jg) AVX.A00, c75103eM);
        this.A00 = (C12560jg) AVX.A01();
    }

    public C1RP(C12560jg c12560jg) {
        this.A00 = c12560jg;
    }

    public C02640Cf A00() {
        return AnonymousClass029.A13(this.A00.A0j().A02.A06());
    }

    public InterfaceC02660Ch A01() {
        C12560jg c12560jg = this.A00;
        if ((c12560jg.A00 & 4) == 4) {
            C75093eL A0j = c12560jg.A0j();
            if (A0j.A0i()) {
                return new C40651sc(A0j.A01.A06());
            }
            return null;
        }
        return null;
    }

    public C75723fR A02() {
        C881041t A0i = this.A00.A0i();
        return new C75723fR(A0i.A01, A0i.A02.A06());
    }

    public void A03(C75723fR c75723fR) {
        C880941s A09 = C881041t.A09();
        A09.A04(c75723fR.A00);
        C0AN A00 = C0AN.A00(c75723fR.A01);
        A09.A02();
        C881041t.A0A((C881041t) A09.A00, A00);
        C0CT AVX = this.A00.AVX();
        AVX.A02();
        C12560jg.A09((C12560jg) AVX.A00, (C881041t) A09.A01());
        this.A00 = (C12560jg) AVX.A01();
    }
}
