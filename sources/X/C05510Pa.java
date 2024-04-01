package X;

import android.text.TextUtils;

/* renamed from: X.0Pa */
/* loaded from: classes.dex */
public class C05510Pa extends C0JJ implements AnonymousClass098, AnonymousClass099, C0D9 {
    public String A00;

    public C05510Pa(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 49);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05510Pa(AnonymousClass094 anonymousClass094, long j, C2FK c2fk) {
        super(anonymousClass094, j, (byte) 49);
        String A0j = c2fk.A0j();
        String str = c2fk.A05;
        A0l(C002701i.A0t(A0j));
        this.A00 = str;
    }

    public C05510Pa(AnonymousClass094 anonymousClass094, long j, String str, String str2) {
        super(anonymousClass094, j, (byte) 49);
        A0l(C002701i.A0t(str));
        this.A00 = str2;
    }

    public C05510Pa(C05510Pa c05510Pa, AnonymousClass094 anonymousClass094, long j) {
        super(c05510Pa, anonymousClass094, j, true);
        this.A00 = c05510Pa.A00;
    }

    @Override // X.C0JJ, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C2FJ c2fj = (C2FJ) ((C40531sQ) c40541sR.A00).A0k().AVX();
        String A0G = A0G();
        c2fj.A02();
        C2FK.A0C((C2FK) c2fj.A00, A0G);
        EnumC55272k9 enumC55272k9 = EnumC55272k9.DISPLAY_TEXT;
        c2fj.A02();
        C2FK.A0A((C2FK) c2fj.A00, enumC55272k9);
        if (!TextUtils.isEmpty(this.A00)) {
            String str = this.A00;
            c2fj.A02();
            C2FK.A0B((C2FK) c2fj.A00, str);
        }
        C40521sP A0G2 = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c40551sS.A02, c40551sS.A05);
        c2fj.A02();
        C2FK.A09((C2FK) c2fj.A00, A0G2);
        c40541sR.A02();
        C40531sQ.A0D((C40531sQ) c40541sR.A00, c2fj);
    }

    @Override // X.C0JJ, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C05510Pa(this, anonymousClass094, this.A0E);
    }
}
