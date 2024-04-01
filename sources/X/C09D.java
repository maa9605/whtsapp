package X;

/* renamed from: X.09D  reason: invalid class name */
/* loaded from: classes.dex */
public class C09D extends AnonymousClass096 implements C09C, AnonymousClass098, AnonymousClass099 {
    public int A00;

    public C09D(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 42);
        this.A00 = 0;
    }

    public C09D(AnonymousClass094 anonymousClass094, long j, AnonymousClass249 anonymousClass249, boolean z, boolean z2) {
        super(anonymousClass094, j, (byte) 42);
        this.A00 = 0;
        A1J(anonymousClass249, z, z2);
    }

    public C09D(C09D c09d, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super(c09d, anonymousClass094, j, c09h, true, c09d.A0m);
        this.A00 = 0;
        this.A00 = c09d.A00;
    }

    @Override // X.AnonymousClass097
    public AnonymousClass097 A19(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        throw new C2EY("ViewOnce messages can not be forwarded");
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C40751so c40751so = (C40751so) ((C40531sQ) c40541sR.A00).A0t().AVX();
        C0CT AVX = c40751so.A04().AVX();
        C2G6 A1H = A1H((C2G6) ((C40531sQ) AVX.A00).A0w().AVX(), c40551sS);
        if (A1H != null) {
            A1H.A02();
            AnonymousClass249 anonymousClass249 = (AnonymousClass249) A1H.A00;
            anonymousClass249.A00 |= 524288;
            anonymousClass249.A0P = true;
            AVX.A02();
            C40531sQ.A0O((C40531sQ) AVX.A00, (AnonymousClass249) A1H.A01());
            c40751so.A02();
            C40741sn.A09((C40741sn) c40751so.A00, (C40531sQ) AVX.A01());
            c40541sR.A02();
            C40531sQ.A0L((C40531sQ) c40541sR.A00, (C40741sn) c40751so.A01());
        }
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        long j = this.A0E;
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null) {
            return new C09D(this, anonymousClass094, j, c09h);
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
