package X;

import android.text.TextUtils;

/* renamed from: X.1MI  reason: invalid class name */
/* loaded from: classes.dex */
public class C1MI extends C0JJ implements InterfaceC03910Hq, AnonymousClass098, AnonymousClass099, C0D9 {
    public C0PY A00;

    @Override // X.InterfaceC03910Hq
    public int AAY() {
        return 0;
    }

    public C1MI(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 27);
    }

    public C1MI(C1MI c1mi, AnonymousClass094 anonymousClass094, long j) {
        super(c1mi, anonymousClass094, j, true);
        this.A00 = c1mi.A00.A00();
    }

    @Override // X.C0JJ
    public C0JJ A18(AnonymousClass094 anonymousClass094, long j) {
        C0JJ c0jj = new C0JJ(anonymousClass094, j);
        c0jj.A0l(C003101m.A0Z(anonymousClass094.A00) ? A19() : A1E());
        A1B(c0jj, anonymousClass094);
        return c0jj;
    }

    @Override // X.C0JJ
    public String A19() {
        if (TextUtils.isEmpty(A0G())) {
            return this.A00.A00;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder A0P = C000200d.A0P("*");
        A0P.append(A0G());
        A0P.append("*");
        sb.append(A0P.toString());
        sb.append("\n");
        sb.append("\n");
        sb.append(this.A00.A00);
        return sb.toString();
    }

    public String A1E() {
        if (TextUtils.isEmpty(A0G())) {
            return this.A00.A00;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder A0P = C000200d.A0P("*");
        A0P.append(A0G());
        A0P.append("*");
        sb.append(A0P.toString());
        sb.append("\n");
        sb.append(this.A00.A00);
        return sb.toString();
    }

    @Override // X.C0JJ, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48602Fw c48602Fw = (C48602Fw) c40541sR.A08().AVX();
        C0PY c0py = this.A00;
        if (c0py != null) {
            C53442gv A0G = C40731sm.A0G(c40541sR, c0py);
            if (!TextUtils.isEmpty(A0G())) {
                String A0G2 = A0G();
                A0G.A02();
                C53432gu.A0D((C53432gu) A0G.A00, A0G2);
            }
            c48602Fw.A02();
            C48612Fx.A0A((C48612Fx) c48602Fw.A00, A0G);
            c48602Fw.A02();
            C48612Fx.A09((C48612Fx) c48602Fw.A00, A0G);
            c40541sR.A02();
            C40531sQ.A0c((C40531sQ) c40541sR.A00, c48602Fw);
            return;
        }
        C000200d.A1G(C000200d.A0P("MessageTemplateHsm: cannot send encrypted hsm title message, "), this.A0m);
    }

    @Override // X.C0JJ, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C1MI(this, anonymousClass094, this.A0E);
    }

    @Override // X.InterfaceC03910Hq
    public String AAJ() {
        C0PY c0py;
        String str;
        if (!TextUtils.isEmpty(A0G())) {
            StringBuilder sb = new StringBuilder();
            sb.append(A0G());
            sb.append(" ");
            c0py = this.A00;
            sb.append(c0py.A00);
            str = sb.toString();
        } else {
            c0py = this.A00;
            str = c0py.A00;
        }
        if (TextUtils.isEmpty(c0py.A01)) {
            return str;
        }
        StringBuilder A0V = C000200d.A0V(str, " ");
        A0V.append(this.A00.A01);
        return A0V.toString();
    }

    @Override // X.InterfaceC03910Hq
    public String ABd(C002301c c002301c) {
        return !TextUtils.isEmpty(A0G()) ? A0G() : this.A00.A00;
    }

    @Override // X.InterfaceC03910Hq
    public String ACZ() {
        return !TextUtils.isEmpty(A0G()) ? A0G() : this.A00.A00;
    }

    @Override // X.InterfaceC03910Hq
    public String ACg() {
        return A1E();
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
