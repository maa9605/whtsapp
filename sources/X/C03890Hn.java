package X;

/* renamed from: X.0Hn */
/* loaded from: classes.dex */
public class C03890Hn extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099 {
    public String A00;

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public C03890Hn(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
    }

    public C03890Hn(AnonymousClass094 anonymousClass094, long j, String str) {
        super(anonymousClass094, j, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
        this.A00 = str;
    }

    public C03890Hn(AnonymousClass094 anonymousClass094, AnonymousClass092 anonymousClass092) {
        super(anonymousClass094, anonymousClass092.A0E, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
        this.A00 = anonymousClass092.A0n.A01;
        this.A0G = anonymousClass092.A0A();
        this.A0d = anonymousClass092.A0P();
    }

    public C03890Hn(AnonymousClass094 anonymousClass094, String str) {
        super(anonymousClass094, 0L, (byte) 15);
        this.A01 = 0;
        super.A00 = 7;
        this.A00 = str;
    }

    public C03890Hn(C03890Hn c03890Hn, AnonymousClass094 anonymousClass094, long j) {
        super(c03890Hn, anonymousClass094, j, true);
        this.A00 = c03890Hn.A00;
        super.A00 = ((AnonymousClass092) c03890Hn).A00;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        this.A00 = str;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48502Fm c48502Fm = (C48502Fm) c40541sR.A07().AVX();
        C452521b c452521b = (C452521b) ((C48512Fn) c48502Fm.A00).A0o().AVX();
        AnonymousClass094 anonymousClass094 = this.A0n;
        c452521b.A06(C003101m.A07(anonymousClass094.A00));
        c452521b.A07(anonymousClass094.A02);
        String str = this.A00;
        if (str != null) {
            c452521b.A02();
            C452421a.A0A((C452421a) c452521b.A00, str);
        } else {
            c452521b.A04(anonymousClass094.A01);
        }
        AbstractC005302j abstractC005302j = this.A0G;
        if (abstractC005302j != null) {
            c452521b.A05(abstractC005302j.getRawString());
        }
        c48502Fm.A02();
        C48512Fn.A0C((C48512Fn) c48502Fm.A00, c452521b);
        EnumC55282kA enumC55282kA = EnumC55282kA.REVOKE;
        c48502Fm.A02();
        C48512Fn.A0B((C48512Fn) c48502Fm.A00, enumC55282kA);
        c40541sR.A02();
        C40531sQ.A0X((C40531sQ) c40541sR.A00, c48502Fm);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C03890Hn(this, anonymousClass094, this.A0E);
    }
}
