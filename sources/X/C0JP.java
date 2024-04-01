package X;

/* renamed from: X.0JP */
/* loaded from: classes.dex */
public class C0JP extends C09F implements AnonymousClass098, AnonymousClass099 {
    @Override // X.AnonymousClass097
    public boolean A1G() {
        return true;
    }

    public C0JP(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 3);
    }

    public C0JP(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, (byte) 28);
    }

    public C0JP(AnonymousClass094 anonymousClass094, long j, C24D c24d, boolean z, boolean z2) {
        super(anonymousClass094, j, c24d, z, z2, (byte) 3);
        A1J(c24d);
    }

    public C0JP(C0JP c0jp, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super((AnonymousClass097) c0jp, anonymousClass094, j, c09h, false, (byte) 3);
    }

    public C0JP(C0JP c0jp, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z) {
        super(c0jp, anonymousClass094, j, c09h, z, c0jp.A0m);
    }

    @Override // X.AnonymousClass098
    /* renamed from: A1L */
    public C0JP A6G(AnonymousClass094 anonymousClass094) {
        return new C0JP(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }

    @Override // X.AnonymousClass097
    /* renamed from: A1M */
    public C0JP A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            C0JP c0jp = new C0JP(this, anonymousClass094, j, c09h, false);
            ((AnonymousClass097) c0jp).A04 = null;
            return c0jp;
        }
        throw null;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48622Fy c48622Fy = (C48622Fy) c40541sR.A09().AVX();
        A1I(c48622Fy, c40551sS);
        if (A11() && A0D().A00 != null) {
            C2GC c2gc = (C2GC) c40541sR.A04().AVX();
            C40731sm.A0f(c2gc, A0D().A00);
            c2gc.A02();
            C2FI.A0E((C2FI) c2gc.A00, c48622Fy);
            EnumC55382kK enumC55382kK = EnumC55382kK.VIDEO;
            c2gc.A02();
            C2FI.A0A((C2FI) c2gc.A00, enumC55382kK);
            c40541sR.A02();
            C40531sQ.A0C((C40531sQ) c40541sR.A00, (C2FI) c2gc.A01());
            return;
        }
        c40541sR.A02();
        C40531sQ.A0d((C40531sQ) c40541sR.A00, c48622Fy);
    }
}
