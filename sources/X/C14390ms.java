package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.0ms  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C14390ms extends AnonymousClass095 implements InterfaceC03910Hq, AnonymousClass098, AnonymousClass099 {
    public C0PY A00;

    public C14390ms(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 25);
    }

    public C14390ms(C14390ms c14390ms, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super((AnonymousClass095) c14390ms, anonymousClass094, j, c09h, true);
        this.A00 = c14390ms.A00.A00();
    }

    @Override // X.AnonymousClass097
    public String A1A() {
        return this.A00.A00;
    }

    @Override // X.AnonymousClass095
    public AnonymousClass095 A1K(AnonymousClass094 anonymousClass094) {
        return new C14390ms(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
    }

    @Override // X.AnonymousClass095
    public AnonymousClass095 A1L(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            AnonymousClass095 anonymousClass095 = new AnonymousClass095(this, anonymousClass094, j, c09h);
            ((AnonymousClass097) anonymousClass095).A04 = null;
            return anonymousClass095;
        }
        throw null;
    }

    @Override // X.AnonymousClass095, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C0AX c0ax;
        C0PY c0py;
        C40541sR c40541sR = c40551sS.A01;
        C48602Fw c48602Fw = (C48602Fw) c40541sR.A08().AVX();
        C53432gu A0j = c40541sR.A08().A0j();
        if (A0j.A01 == 3) {
            c0ax = (C0AZ) A0j.A03;
        } else {
            c0ax = AnonymousClass249.A0Q;
        }
        C2G6 A1I = A1I((C2G6) c0ax.AVX(), c40551sS.A04, c40551sS.A03);
        if (A1I != null && (c0py = this.A00) != null) {
            C53442gv A0G = C40731sm.A0G(c40541sR, c0py);
            A0G.A02();
            C53432gu.A0A((C53432gu) A0G.A00, A1I);
            c48602Fw.A02();
            C48612Fx.A0A((C48612Fx) c48602Fw.A00, A0G);
            c48602Fw.A02();
            C48612Fx.A09((C48612Fx) c48602Fw.A00, A0G);
            c40541sR.A02();
            C40531sQ.A0c((C40531sQ) c40541sR.A00, c48602Fw);
            return;
        }
        C000200d.A1G(C000200d.A0P("MessageTemplateImage/buildE2eMessage: cannot send encrypted media message, "), this.A0m);
    }

    @Override // X.AnonymousClass095, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C14390ms(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
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
        return R.drawable.msg_status_image;
    }

    @Override // X.InterfaceC03910Hq
    public String ABd(C002301c c002301c) {
        StringBuilder A0P = C000200d.A0P("📷 ");
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
