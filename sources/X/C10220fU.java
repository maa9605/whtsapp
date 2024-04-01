package X;

import android.text.TextUtils;

/* renamed from: X.0fU  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10220fU extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099 {
    public C70723Tj A00;
    public String A01;
    public String A02;

    @Override // X.AnonymousClass092
    public String A16() {
        return null;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
    }

    public C10220fU(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 48);
    }

    public C10220fU(AnonymousClass094 anonymousClass094, long j, C48392Fb c48392Fb) {
        super(anonymousClass094, j, (byte) 48);
        this.A01 = c48392Fb.A09;
        this.A02 = c48392Fb.A0A;
        this.A00 = new C70723Tj(c48392Fb);
    }

    public C10220fU(C10220fU c10220fU, AnonymousClass094 anonymousClass094, long j) {
        super(c10220fU, anonymousClass094, j, true);
        this.A01 = c10220fU.A01;
        this.A02 = c10220fU.A02;
        this.A00 = c10220fU.A00;
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48382Fa c48382Fa = (C48382Fa) ((C40531sQ) c40541sR.A00).A0x().AVX();
        if (!TextUtils.isEmpty(this.A01)) {
            String str = this.A01;
            c48382Fa.A02();
            C48392Fb.A0E((C48392Fb) c48382Fa.A00, str);
        }
        String str2 = this.A02;
        if (!TextUtils.isEmpty(str2)) {
            c48382Fa.A02();
            C48392Fb.A0F((C48392Fb) c48382Fa.A00, str2);
        }
        C70723Tj c70723Tj = this.A00;
        if (c70723Tj != null) {
            EnumC79253lM enumC79253lM = c70723Tj.A01;
            c48382Fa.A02();
            C48392Fb.A0D((C48392Fb) c48382Fa.A00, enumC79253lM);
            String str3 = c70723Tj.A03;
            c48382Fa.A02();
            C48392Fb.A0G((C48392Fb) c48382Fa.A00, str3);
            C0AN A00 = C0AN.A00(c70723Tj.A07);
            c48382Fa.A02();
            C48392Fb.A09((C48392Fb) c48382Fa.A00, A00);
            long j = c70723Tj.A00;
            c48382Fa.A02();
            C48392Fb c48392Fb = (C48392Fb) c48382Fa.A00;
            c48392Fb.A01 |= 32;
            c48392Fb.A02 = j;
            C0AN A002 = C0AN.A00(c70723Tj.A05);
            c48382Fa.A02();
            C48392Fb.A0A((C48392Fb) c48382Fa.A00, A002);
            C0AN A003 = C0AN.A00(c70723Tj.A04);
            c48382Fa.A02();
            C48392Fb.A0B((C48392Fb) c48382Fa.A00, A003);
            String str4 = c70723Tj.A02;
            c48382Fa.A02();
            C48392Fb.A0H((C48392Fb) c48382Fa.A00, str4);
            C0AN A004 = C0AN.A00(c70723Tj.A06);
            c48382Fa.A02();
            C48392Fb.A0C((C48392Fb) c48382Fa.A00, A004);
        }
        c40541sR.A02();
        C40531sQ.A0P((C40531sQ) c40541sR.A00, c48382Fa);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C10220fU(this, anonymousClass094, this.A0E);
    }
}
