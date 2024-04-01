package X;

import android.text.TextUtils;

/* renamed from: X.0D8  reason: invalid class name */
/* loaded from: classes.dex */
public class C0D8 extends AnonymousClass092 implements AnonymousClass098, AnonymousClass099, C0D9 {
    public String A00;
    public String A01;
    public C04120Iq A02;

    public C0D8(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 4);
        super.A01 = 0;
    }

    public C0D8(AnonymousClass094 anonymousClass094, long j, C2FQ c2fq) {
        super(anonymousClass094, j, (byte) 4);
        super.A01 = 0;
        if ((c2fq.A00 & 2) == 2) {
            A1A(c2fq.A03);
        }
        if ((c2fq.A00 & 1) == 1) {
            this.A00 = c2fq.A02;
        }
    }

    public C0D8(AnonymousClass094 anonymousClass094, long j, String str, String str2) {
        super(anonymousClass094, j, (byte) 4);
        super.A01 = 0;
        A1A(str);
        this.A00 = str2;
    }

    public C0D8(C0D8 c0d8, AnonymousClass094 anonymousClass094, long j, boolean z) {
        super(c0d8, anonymousClass094, j, z);
        super.A01 = 0;
        this.A00 = c0d8.A00;
        this.A01 = c0d8.A18();
    }

    @Override // X.AnonymousClass092
    public String A0G() {
        String str;
        synchronized (this.A0o) {
            str = this.A01;
        }
        return str;
    }

    @Override // X.AnonymousClass092
    public String A0N() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A0l(String str) {
        synchronized (this.A0o) {
            super.A0l(str);
            this.A01 = str;
        }
    }

    @Override // X.AnonymousClass092
    public void A0s(String str) {
        this.A00 = str;
    }

    @Override // X.AnonymousClass092
    public String A16() {
        return this.A00;
    }

    @Override // X.AnonymousClass092
    public void A17(String str) {
        this.A00 = str;
    }

    public String A18() {
        String str;
        synchronized (this.A0o) {
            str = this.A01;
        }
        return str;
    }

    public C04120Iq A19(C001200o c001200o, C05W c05w, C002301c c002301c, C06K c06k) {
        C04120Iq c04120Iq;
        Object obj = this.A0o;
        synchronized (obj) {
            String str = this.A01;
            C04120Iq c04120Iq2 = this.A02;
            if (c04120Iq2 != null || str == null) {
                return c04120Iq2;
            }
            C04110Ip A05 = C04110Ip.A05(c001200o, c05w, c002301c, c06k, str);
            synchronized (obj) {
                c04120Iq = A05 != null ? new C04120Iq(str, A05) : null;
                this.A02 = c04120Iq;
            }
            return c04120Iq;
        }
    }

    public void A1A(String str) {
        synchronized (this.A0o) {
            this.A01 = str;
            this.A02 = null;
            super.A0l(str);
        }
    }

    @Override // X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C2FP c2fp = (C2FP) ((C40531sQ) c40541sR.A00).A0n().AVX();
        if (!TextUtils.isEmpty(this.A00)) {
            String str = this.A00;
            c2fp.A02();
            C2FQ.A0B((C2FQ) c2fp.A00, str);
        }
        String A18 = A18();
        if (!TextUtils.isEmpty(A18)) {
            c2fp.A02();
            C2FQ.A0A((C2FQ) c2fp.A00, A18);
        }
        C0CM c0cm = c40551sS.A02;
        byte[] bArr = c40551sS.A05;
        if (AnonymousClass029.A1U(this, c0cm, bArr)) {
            C40521sP A0G = AnonymousClass029.A0G(c40551sS.A00, this, c40551sS.A03, c0cm, bArr);
            c2fp.A02();
            C2FQ.A09((C2FQ) c2fp.A00, A0G);
        }
        c40541sR.A02();
        C40531sQ.A0G((C40531sQ) c40541sR.A00, c2fp);
    }

    @Override // X.C0D9
    public AnonymousClass092 A6F(AnonymousClass094 anonymousClass094, long j) {
        return new C0D8(this, anonymousClass094, j, false);
    }

    @Override // X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C0D8(this, anonymousClass094, this.A0E, true);
    }
}
