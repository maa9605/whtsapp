package X;

import android.text.TextUtils;

/* renamed from: X.0PX  reason: invalid class name */
/* loaded from: classes.dex */
public class C0PX extends C0JJ implements AnonymousClass098, AnonymousClass099, C0D9 {
    public int A00;
    public String A01;

    public C0PX(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 32);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PX(AnonymousClass094 anonymousClass094, long j, C40531sQ c40531sQ) {
        super(anonymousClass094, j, (byte) 32);
        C48592Fv A19 = c40531sQ.A19();
        String str = A19.A03;
        String str2 = A19.A04;
        int i = A19.A01;
        A0l(str);
        this.A01 = str2;
        this.A00 = i;
    }

    public C0PX(AnonymousClass094 anonymousClass094, long j, String str, String str2, int i) {
        super(anonymousClass094, j, (byte) 32);
        A0l(str);
        this.A01 = str2;
        this.A00 = i;
    }

    public C0PX(C0PX c0px, AnonymousClass094 anonymousClass094, long j) {
        super(c0px, anonymousClass094, j, true);
        this.A01 = c0px.A01;
    }

    @Override // X.C0JJ
    public C0JJ A18(AnonymousClass094 anonymousClass094, long j) {
        C0JJ c0jj = new C0JJ(anonymousClass094, j);
        c0jj.A0l(A0G());
        A1B(c0jj, anonymousClass094);
        return c0jj;
    }

    @Override // X.C0JJ, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48582Fu c48582Fu = (C48582Fu) ((C40531sQ) c40541sR.A00).A19().AVX();
        String A0G = A0G();
        c48582Fu.A02();
        C48592Fv.A0B((C48592Fv) c48582Fu.A00, A0G);
        if (!TextUtils.isEmpty(this.A01)) {
            String str = this.A01;
            c48582Fu.A02();
            C48592Fv.A0A((C48592Fv) c48582Fu.A00, str);
        }
        int i = this.A00;
        c48582Fu.A02();
        C48592Fv c48592Fv = (C48592Fv) c48582Fu.A00;
        c48592Fv.A00 |= 8;
        c48592Fv.A01 = i;
        C40521sP A0G2 = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c40551sS.A02, c40551sS.A05);
        c48582Fu.A02();
        C48592Fv.A09((C48592Fv) c48582Fu.A00, A0G2);
        c40541sR.A02();
        C40531sQ.A0b((C40531sQ) c40541sR.A00, c48582Fu);
    }

    @Override // X.C0JJ, X.C0D9
    public AnonymousClass092 A6F(AnonymousClass094 anonymousClass094, long j) {
        C0JJ c0jj = new C0JJ(anonymousClass094, j);
        c0jj.A0l(A0G());
        A1B(c0jj, anonymousClass094);
        return c0jj;
    }

    @Override // X.C0JJ, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0PX(this, anonymousClass094, this.A0E);
    }
}
