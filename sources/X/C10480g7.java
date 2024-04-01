package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.0g7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10480g7 extends C0LO implements InterfaceC03910Hq, AnonymousClass098, AnonymousClass099 {
    public C0PY A00;

    public C10480g7(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 29);
    }

    public C10480g7(C10480g7 c10480g7, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super((C0LO) c10480g7, anonymousClass094, j, c09h, true);
        this.A00 = c10480g7.A00.A00();
    }

    @Override // X.AnonymousClass097
    public String A1A() {
        return this.A00.A00;
    }

    @Override // X.C0LO
    public C0LO A1L(AnonymousClass094 anonymousClass094) {
        return new C10480g7(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
    }

    @Override // X.C0LO
    public C0LO A1M(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            C0LO c0lo = new C0LO(this, anonymousClass094, j, ((AnonymousClass097) this).A02);
            ((AnonymousClass097) c0lo).A04 = null;
            return c0lo;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
        if (r4 != null) goto L8;
     */
    @Override // X.C0LO, X.AnonymousClass099
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A5o(X.C40551sS r15) {
        /*
            r14 = this;
            X.1sR r3 = r15.A01
            X.2Fx r0 = r3.A08()
            X.0CT r2 = r0.AVX()
            X.2Fw r2 = (X.C48602Fw) r2
            X.02L r8 = r15.A00
            X.2Fx r0 = r3.A08()
            X.2gu r0 = r0.A0j()
            X.24D r0 = r0.A0j()
            X.0CT r9 = r0.AVX()
            X.2Fy r9 = (X.C48622Fy) r9
            boolean r10 = r15.A04
            boolean r11 = r15.A03
            X.0CM r12 = r15.A02
            byte[] r13 = r15.A05
            r7 = r14
            X.2Fy r4 = r7.A1H(r8, r9, r10, r11, r12, r13)
            X.09H r6 = r14.A02
            if (r6 == 0) goto L88
            if (r10 != 0) goto L37
            byte[] r0 = r6.A0U
            if (r0 == 0) goto L88
        L37:
            if (r4 == 0) goto L88
            r5 = 1
            r4.A02()
            X.0AZ r1 = r4.A00
            X.24D r1 = (X.C24D) r1
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            r1.A0L = r5
            X.2k8 r1 = X.C0Ho.A04(r6)
            r4.A02()
            X.0AZ r0 = r4.A00
            X.24D r0 = (X.C24D) r0
            X.C24D.A0H(r0, r1)
        L57:
            X.0PY r0 = r14.A00
            if (r0 == 0) goto L96
            X.2gv r1 = X.C40731sm.A0G(r3, r0)
            r1.A02()
            X.0AZ r0 = r1.A00
            X.2gu r0 = (X.C53432gu) r0
            X.C53432gu.A0C(r0, r4)
            r2.A02()
            X.0AZ r0 = r2.A00
            X.2Fx r0 = (X.C48612Fx) r0
            X.C48612Fx.A0A(r0, r1)
            r2.A02()
            X.0AZ r0 = r2.A00
            X.2Fx r0 = (X.C48612Fx) r0
            X.C48612Fx.A09(r0, r1)
            r3.A02()
            X.0AZ r0 = r3.A00
            X.1sQ r0 = (X.C40531sQ) r0
            X.C40531sQ.A0c(r0, r2)
            return
        L88:
            java.lang.String r0 = "FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type="
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            byte r0 = r14.A0m
            X.C000200d.A1G(r1, r0)
            if (r4 == 0) goto L96
            goto L57
        L96:
            java.lang.String r0 = "MessageTemplateGif: cannot send encrypted media message, "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            byte r0 = r14.A0m
            X.C000200d.A1G(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10480g7.A5o(X.1sS):void");
    }

    @Override // X.C0LO, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C10480g7(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
    }

    @Override // X.InterfaceC03910Hq
    public String AAJ() {
        if (TextUtils.isEmpty(this.A00.A01)) {
            return this.A00.A00;
        }
        StringBuilder sb = new StringBuilder();
        C0PY c0py = this.A00;
        sb.append(c0py.A00);
        sb.append(" ");
        sb.append(c0py.A01);
        return sb.toString();
    }

    @Override // X.InterfaceC03910Hq
    public int AAY() {
        return R.drawable.msg_status_gif;
    }

    @Override // X.InterfaceC03910Hq
    public String ABd(C002301c c002301c) {
        StringBuilder A0P = C000200d.A0P("👾 ");
        A0P.append(this.A00.A00);
        return A0P.toString();
    }

    @Override // X.InterfaceC03910Hq
    public String ACZ() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC03910Hq
    public String ACg() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC03910Hq
    public C0PY ADS() {
        return this.A00;
    }

    @Override // X.InterfaceC03910Hq
    public void ATy(C0PY c0py) {
        this.A00 = c0py;
    }
}
