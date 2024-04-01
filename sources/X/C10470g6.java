package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.0g6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10470g6 extends C0JP implements InterfaceC03910Hq, AnonymousClass098, AnonymousClass099 {
    public C0PY A00;

    public C10470g6(AnonymousClass094 anonymousClass094, long j) {
        super(anonymousClass094, j, (byte) 28);
    }

    public C10470g6(C10470g6 c10470g6, AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        super((C0JP) c10470g6, anonymousClass094, j, c09h, true);
        this.A00 = c10470g6.A00.A00();
    }

    @Override // X.AnonymousClass097
    public String A1A() {
        return this.A00.A00;
    }

    @Override // X.C0JP
    public C0JP A1L(AnonymousClass094 anonymousClass094) {
        return new C10470g6(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
    }

    @Override // X.C0JP
    public C0JP A1M(AnonymousClass094 anonymousClass094, long j, C09H c09h) {
        if (c09h != null) {
            C0JP c0jp = new C0JP(this, anonymousClass094, j, ((AnonymousClass097) this).A02);
            ((AnonymousClass097) c0jp).A04 = null;
            return c0jp;
        }
        throw null;
    }

    @Override // X.C0JP, X.AnonymousClass099
    public void A5o(C40551sS c40551sS) {
        C40541sR c40541sR = c40551sS.A01;
        C48602Fw c48602Fw = (C48602Fw) c40541sR.A08().AVX();
        boolean z = c40551sS.A04;
        C48622Fy A1H = A1H(c40551sS.A00, (C48622Fy) c40541sR.A08().A0j().A0j().AVX(), z, c40551sS.A03, c40551sS.A02, c40551sS.A05);
        C09H c09h = ((AnonymousClass097) this).A02;
        if (c09h != null && ((z || c09h.A0U != null) && A1H != null)) {
            C04030Id A18 = A18();
            if (A18 != null) {
                byte[] A06 = A18.A06();
                if (A06 != null) {
                    C0AN A00 = C0AN.A00(A06);
                    A1H.A02();
                    C24D.A0D((C24D) A1H.A00, A00);
                }
                C0PY c0py = this.A00;
                if (c0py != null) {
                    C53442gv A0G = C40731sm.A0G(c40541sR, c0py);
                    A0G.A02();
                    C53432gu.A0C((C53432gu) A0G.A00, A1H);
                    c48602Fw.A02();
                    C48612Fx.A0A((C48612Fx) c48602Fw.A00, A0G);
                    c48602Fw.A02();
                    C48612Fx.A09((C48612Fx) c48602Fw.A00, A0G);
                    c40541sR.A02();
                    C40531sQ.A0c((C40531sQ) c40541sR.A00, c48602Fw);
                    return;
                }
                C000200d.A1G(C000200d.A0P("MessageTemplateVideo: cannot send encrypted media message, "), this.A0m);
                return;
            }
            throw null;
        }
        C000200d.A1G(C000200d.A0P("FMessageTemplateVideo/unable to send encrypted media message due to missing; media_wa_type="), this.A0m);
    }

    @Override // X.C0JP, X.AnonymousClass098
    public AnonymousClass092 A6G(AnonymousClass094 anonymousClass094) {
        return new C10470g6(this, anonymousClass094, this.A0E, ((AnonymousClass097) this).A02);
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
        return R.drawable.msg_status_video;
    }

    @Override // X.InterfaceC03910Hq
    public String ABd(C002301c c002301c) {
        StringBuilder A0P = C000200d.A0P("🎥 ");
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
