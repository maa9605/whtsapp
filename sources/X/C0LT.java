package X;

/* renamed from: X.0LT */
/* loaded from: classes.dex */
public class C0LT extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099 {
    public int A00;
    public long A01;

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public C0LT(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 51);
    }

    public C0LT(C0LT c0lt, AnonymousClass094 anonymousClass094, long j) {
        super(c0lt, anonymousClass094, j, true);
        this.A00 = c0lt.A00;
        this.A01 = c0lt.A01;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48462Fi c48462Fi = (C48462Fi) ((C40531sQ) c40541sR.A00).A13().AVX();
        EnumC79293lQ A00 = EnumC79293lQ.A00(this.A00);
        c48462Fi.A02();
        C48472Fj.A09((C48472Fj) c48462Fi.A00, A00);
        long j = this.A01;
        if (j > 0) {
            c48462Fi.A02();
            C48472Fj c48472Fj = (C48472Fj) c48462Fi.A00;
            c48472Fj.A00 |= 2;
            c48472Fj.A02 = j / 1000;
        }
        c40541sR.A02();
        C40531sQ.A0V((C40531sQ) c40541sR.A00, c48462Fi);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0LT(this, anonymousClass094, this.A0E);
    }
}
