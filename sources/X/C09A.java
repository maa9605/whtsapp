package X;

/* renamed from: X.09A  reason: invalid class name */
/* loaded from: classes.dex */
public class C09A extends C09B implements C09C, AnonymousClass098, AnonymousClass099 {
    public int A00;

    public C09A(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 43);
        this.A00 = 0;
    }

    public C09A(AnonymousClass094 anonymousClass094, long j, C24D c24d, boolean z, boolean z2) {
        super(anonymousClass094, j, (byte) 43);
        this.A00 = 0;
        A1K(c24d, z, z2);
        A1J(c24d);
    }

    public C09A(C09A c09a, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super((AnonymousClass097) c09a, anonymousClass094, j, c09h, true, c09a.A0m);
        this.A00 = 0;
        this.A00 = c09a.A00;
    }

    @Override // X.AnonymousClass097
    public AnonymousClass097 A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        throw new C2EY("ViewOnce messages can not be forwarded");
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C40751so c40751so = (C40751so) ((C40531sQ) c40541sR.A00).A0t().AVX();
        C40541sR c40541sR2 = (C40541sR) c40751so.A04().AVX();
        C48622Fy c48622Fy = (C48622Fy) c40541sR2.A09().AVX();
        A1I(c48622Fy, c40551sS);
        c48622Fy.A02();
        C24D c24d = (C24D) c48622Fy.A00;
        c24d.A00 |= C42271vT.A09;
        c24d.A0M = true;
        c40541sR2.A02();
        C40531sQ.A0e((C40531sQ) c40541sR2.A00, (C24D) c48622Fy.A01());
        c40751so.A02();
        C40741sn.A09((C40741sn) c40751so.A00, (C40531sQ) c40541sR2.A01());
        c40541sR.A02();
        C40531sQ.A0L((C40531sQ) c40541sR.A00, (C40741sn) c40751so.A01());
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        long j = this.A0E;
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null) {
            return new C09A(this, anonymousClass094, j, c09h);
        }
        throw null;
    }

    @Override // X.C09C
    public int ADw() {
        return this.A00;
    }

    @Override // X.C09C
    public void AU7(int i) {
        this.A00 = i;
    }
}
