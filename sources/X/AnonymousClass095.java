package X;

/* renamed from: X.095 */
/* loaded from: classes.dex */
public class AnonymousClass095 extends AnonymousClass096 implements AnonymousClass098, AnonymousClass099 {
    public AnonymousClass095(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 1);
    }

    public AnonymousClass095(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, b);
    }

    public AnonymousClass095(AnonymousClass094 anonymousClass094, long j, AnonymousClass249 anonymousClass249, boolean z, boolean z2) {
        super(anonymousClass094, j, (byte) 1);
        A1J(anonymousClass249, z, z2);
    }

    public AnonymousClass095(AnonymousClass095 anonymousClass095, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super(anonymousClass095, anonymousClass094, j, c09h, false, (byte) 1);
    }

    public AnonymousClass095(AnonymousClass095 anonymousClass095, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z) {
        super(anonymousClass095, anonymousClass094, j, c09h, z, anonymousClass095.A0m);
    }

    @Override // X.AnonymousClass098
    /* renamed from: A1K */
    public AnonymousClass095 A6G(AnonymousClass094 anonymousClass094) {
        return new AnonymousClass095(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }

    @Override // X.AnonymousClass097
    /* renamed from: A1L */
    public AnonymousClass095 A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            AnonymousClass095 anonymousClass095 = new AnonymousClass095(this, anonymousClass094, j, c09h, false);
            ((AnonymousClass097) anonymousClass095).A04 = null;
            return anonymousClass095;
        }
        throw null;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C2G6 A1H = A1H((C2G6) ((C40531sQ) c40541sR.A00).A0w().AVX(), c40551sS);
        if (A1H != null) {
            if (A11() && A0D().A00 != null) {
                C2GC c2gc = (C2GC) c40541sR.A04().AVX();
                c2gc.A02();
                C2FI.A0C((C2FI) c2gc.A00, (AnonymousClass249) A1H.A01());
                EnumC55382kK enumC55382kK = EnumC55382kK.IMAGE;
                c2gc.A02();
                C2FI.A0A((C2FI) c2gc.A00, enumC55382kK);
                C40731sm.A0f(c2gc, A0D().A00);
                c40541sR.A02();
                C40531sQ.A0C((C40531sQ) c40541sR.A00, (C2FI) c2gc.A01());
                return;
            }
            c40541sR.A02();
            C40531sQ.A0O((C40531sQ) c40541sR.A00, (AnonymousClass249) A1H.A01());
        }
    }
}
