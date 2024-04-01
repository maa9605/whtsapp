package X;

/* renamed from: X.0LO */
/* loaded from: classes.dex */
public class C0LO extends C09F implements AnonymousClass098, AnonymousClass099 {
    public C0LO(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 13);
    }

    public C0LO(AnonymousClass094 anonymousClass094, long j, byte b) {
        super(anonymousClass094, j, (byte) 29);
    }

    public C0LO(AnonymousClass094 anonymousClass094, long j, C24D c24d, boolean z, boolean z2) {
        super(anonymousClass094, j, c24d, z, z2, (byte) 13);
        A1J(c24d);
    }

    public C0LO(C0LO c0lo, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super((AnonymousClass097) c0lo, anonymousClass094, j, c09h, false, (byte) 13);
    }

    public C0LO(C0LO c0lo, AnonymousClass094 anonymousClass094, long j, C09H c09h, boolean z) {
        super(c0lo, anonymousClass094, j, c09h, z, c0lo.A0m);
    }

    @Override // X.C09B
    public void A1J(C24D c24d) {
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null) {
            if ((c24d.A00 & 32) == 32) {
                c09h.A05 = C0Ho.A00(c24d);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass098
    /* renamed from: A1L */
    public C0LO A6G(AnonymousClass094 anonymousClass094) {
        return new C0LO(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02, true);
    }

    @Override // X.AnonymousClass097
    /* renamed from: A1M */
    public C0LO A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            C0LO c0lo = new C0LO(this, anonymousClass094, j, c09h, false);
            ((AnonymousClass097) c0lo).A04 = null;
            return c0lo;
        }
        throw null;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C02L c02l = c40551sS.A00;
        C40541sR c40541sR = c40551sS.A01;
        boolean z = c40551sS.A04;
        C48622Fy A1H = A1H(c02l, (C48622Fy) c40541sR.A09().AVX(), z, c40551sS.A03, c40551sS.A02, c40551sS.A05);
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null && ((z || c09h.A0U != null) && A1H != null)) {
            A1H.A02();
            C24D c24d = (C24D) A1H.A00;
            c24d.A00 |= 128;
            c24d.A0L = true;
            EnumC55262k8 A04 = C0Ho.A04(c09h);
            A1H.A02();
            C24D.A0H((C24D) A1H.A00, A04);
            c40541sR.A02();
            C40531sQ.A0d((C40531sQ) c40541sR.A00, A1H);
            return;
        }
        C000200d.A1G(C000200d.A0P("FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type="), this.A0m);
    }
}
