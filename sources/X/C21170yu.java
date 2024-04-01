package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.0yu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C21170yu extends C0LP implements InterfaceC03910Hq {
    public C0PY A00;

    public C21170yu(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 30);
    }

    public C21170yu(C21170yu c21170yu, AnonymousClass094 anonymousClass094, long j) {
        super((C0LP) c21170yu, anonymousClass094, j, true);
        this.A00 = c21170yu.A00.A00();
    }

    @Override // X.C0LP
    public C0LP A1A(AnonymousClass094 anonymousClass094) {
        return new C21170yu(this, anonymousClass094, this.A0E);
    }

    @Override // X.C0LP
    public C0LP A1B(AnonymousClass094 anonymousClass094, long j) {
        return new C0LP(this, anonymousClass094, j);
    }

    @Override // X.C0LP, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C0AX c0ax;
        C40541sR c40541sR = c40551sS.A01;
        C48602Fw c48602Fw = (C48602Fw) c40541sR.A08().AVX();
        C53432gu A0j = c40541sR.A08().A0j();
        if (A0j.A01 == 5) {
            c0ax = (C0AZ) A0j.A03;
        } else {
            c0ax = C48432Ff.A0D;
        }
        C48422Fe c48422Fe = (C48422Fe) c0ax.AVX();
        A1E(c40551sS.A00, c40551sS.A03, c40551sS.A02, c40551sS.A05, c48422Fe);
        C0PY c0py = this.A00;
        if (c0py != null) {
            C53442gv A0G = C40731sm.A0G(c40541sR, c0py);
            A0G.A02();
            C53432gu.A0B((C53432gu) A0G.A00, c48422Fe);
            c48602Fw.A02();
            C48612Fx.A0A((C48612Fx) c48602Fw.A00, A0G);
            c48602Fw.A02();
            C48612Fx.A09((C48612Fx) c48602Fw.A00, A0G);
            c40541sR.A02();
            C40531sQ.A0c((C40531sQ) c40541sR.A00, c48602Fw);
            return;
        }
        C000200d.A1G(C000200d.A0P("FMessageTemplateLocation/buildE2eMessage/Error: cannot send encrypted template location message, "), this.A0m);
    }

    @Override // X.C0LP, X.C0D9
    public AnonymousClass092 A6F(AnonymousClass094 anonymousClass094, long j) {
        return new C0LP(this, anonymousClass094, j);
    }

    @Override // X.C0LP, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C21170yu(this, anonymousClass094, this.A0E);
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
        return R.drawable.msg_status_location;
    }

    @Override // X.InterfaceC03910Hq
    public String ABd(C002301c c002301c) {
        StringBuilder A0P = C000200d.A0P("📌 ");
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
