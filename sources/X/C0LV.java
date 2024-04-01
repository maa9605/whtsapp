package X;

import android.text.TextUtils;

/* renamed from: X.0LV */
/* loaded from: classes.dex */
public class C0LV extends C0JJ {
    public C1Q4 A00;

    public C0LV(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 46);
    }

    public C0LV(AnonymousClass094 anonymousClass094, long j, C1Q4 c1q4) {
        super(anonymousClass094, j, (byte) 46);
        this.A00 = c1q4;
    }

    public C0LV(AnonymousClass094 anonymousClass094, long j, C48412Fd c48412Fd) {
        super(anonymousClass094, j, (byte) 46);
        EnumC79263lN enumC79263lN;
        String str = c48412Fd.A05;
        String str2 = c48412Fd.A04;
        String str3 = c48412Fd.A0j().A01;
        EnumC79263lN enumC79263lN2 = EnumC79263lN.UNKNOWN;
        int i = c48412Fd.A01;
        if (i != 0) {
            enumC79263lN = i == 1 ? EnumC79263lN.SINGLE_SELECT : enumC79263lN;
            this.A00 = new C1Q4(str, str2, str3, enumC79263lN2.value);
        }
        enumC79263lN = enumC79263lN2;
        if (enumC79263lN != null) {
            enumC79263lN2 = enumC79263lN;
        }
        this.A00 = new C1Q4(str, str2, str3, enumC79263lN2.value);
    }

    public C0LV(C0LV c0lv, AnonymousClass094 anonymousClass094, long j) {
        super(c0lv, anonymousClass094, j, true);
        this.A00 = c0lv.A00;
    }

    @Override // X.AnonymousClass092
    public String A0G() {
        String obj;
        synchronized (this.A0o) {
            C1Q4 c1q4 = this.A00;
            if (c1q4 == null) {
                return null;
            }
            if (TextUtils.isEmpty(c1q4.A01)) {
                obj = this.A00.A03;
            } else {
                StringBuilder sb = new StringBuilder();
                C1Q4 c1q42 = this.A00;
                sb.append(c1q42.A03);
                sb.append("\n");
                sb.append(c1q42.A01);
                obj = sb.toString();
            }
            return obj;
        }
    }

    @Override // X.C0JJ, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C0CT AVX = ((C40531sQ) c40541sR.A00).A0z().AVX();
        String str = this.A00.A03;
        AVX.A02();
        C48412Fd.A0C((C48412Fd) AVX.A00, str);
        if (!TextUtils.isEmpty(this.A00.A01)) {
            String str2 = this.A00.A01;
            AVX.A02();
            C48412Fd.A0D((C48412Fd) AVX.A00, str2);
        }
        if (this.A00.A00 == 1) {
            EnumC79263lN enumC79263lN = EnumC79263lN.SINGLE_SELECT;
            AVX.A02();
            C48412Fd c48412Fd = (C48412Fd) AVX.A00;
            C48412Fd.A0A(c48412Fd, enumC79263lN);
            C0CT AVX2 = c48412Fd.A0j().AVX();
            String str3 = this.A00.A02;
            if (str3 != null) {
                AVX2.A02();
                C40G.A09((C40G) AVX2.A00, str3);
            }
            AVX.A02();
            C48412Fd.A0B((C48412Fd) AVX.A00, (C40G) AVX2.A01());
        }
        C0CM c0cm = c40551sS.A02;
        byte[] bArr = c40551sS.A05;
        if (AnonymousClass029.A1U(this, c0cm, bArr)) {
            C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm, bArr);
            AVX.A02();
            C48412Fd.A09((C48412Fd) AVX.A00, A0G);
        }
        c40541sR.A02();
        C40531sQ.A0R((C40531sQ) c40541sR.A00, (C48412Fd) AVX.A01());
    }

    @Override // X.C0JJ, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0LV(this, anonymousClass094, this.A0E);
    }
}
