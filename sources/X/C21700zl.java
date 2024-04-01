package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.0zl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C21700zl extends C09E implements InterfaceC03910Hq, AnonymousClass098, AnonymousClass099 {
    public C0PY A00;

    public C21700zl(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 26);
    }

    public C21700zl(C21700zl c21700zl, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super((C09E) c21700zl, anonymousClass094, j, c09h, true);
        this.A00 = c21700zl.A00.A00();
    }

    @Override // X.C09E
    public C09E A1H(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            return new C09E(this, anonymousClass094, j, c09h);
        }
        throw null;
    }

    @Override // X.C09E, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        boolean z;
        C0AX c0ax;
        C09H c09h = ((AnonymousClass097) this).A02;
        C03900Hp A0E = A0E();
        if (c09h == null || (!(z = c40551sS.A04) && c09h.A0U == null)) {
            StringBuilder A0P = C000200d.A0P("FMessageTemplateDocument/unable to send encrypted media message due to missing mediaKey; message.key=");
            A0P.append(this.A0n);
            A0P.append("; media_wa_type=");
            C000200d.A1G(A0P, this.A0m);
            return;
        }
        C40541sR c40541sR = c40551sS.A01;
        C48602Fw c48602Fw = (C48602Fw) c40541sR.A08().AVX();
        C02L c02l = c40551sS.A00;
        C53432gu A0j = c40541sR.A08().A0j();
        if (A0j.A01 == 1) {
            c0ax = (C0AZ) A0j.A03;
        } else {
            c0ax = C24B.A0K;
        }
        C2FV c2fv = (C2FV) c0ax.AVX();
        A1I(c02l, c2fv, z, c40551sS.A03, c40551sS.A02, c40551sS.A05, c09h, A0E);
        C0PY c0py = this.A00;
        if (c0py != null) {
            C53442gv A0G = C40731sm.A0G(c40541sR, c0py);
            A0G.A02();
            C53432gu.A09((C53432gu) A0G.A00, c2fv);
            c48602Fw.A02();
            C48612Fx.A0A((C48612Fx) c48602Fw.A00, A0G);
            c48602Fw.A02();
            C48612Fx.A09((C48612Fx) c48602Fw.A00, A0G);
            c40541sR.A02();
            C40531sQ.A0c((C40531sQ) c40541sR.A00, c48602Fw);
            return;
        }
        C000200d.A1G(C000200d.A0P("MessageTemplateDocument: cannot send encrypted document message, "), this.A0m);
    }

    @Override // X.C09E, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C21700zl(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
    }

    @Override // X.InterfaceC03910Hq
    public String AAJ() {
        String str;
        if (TextUtils.isEmpty(this.A00.A01)) {
            str = this.A00.A00;
        } else {
            StringBuilder sb = new StringBuilder();
            C0PY c0py = this.A00;
            sb.append(c0py.A00);
            sb.append(" ");
            sb.append(c0py.A01);
            str = sb.toString();
        }
        String A1B = A1B();
        return !TextUtils.isEmpty(A1B) ? C000200d.A0I(A1B, " ", str) : str;
    }

    @Override // X.InterfaceC03910Hq
    public int AAY() {
        return R.drawable.msg_status_doc;
    }

    @Override // X.InterfaceC03910Hq
    public String ABd(C002301c c002301c) {
        StringBuilder A0P = C000200d.A0P("📄 ");
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
