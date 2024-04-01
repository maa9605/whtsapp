package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2hd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53862hd extends AbstractC04890Mh {
    public List A00 = new ArrayList();
    public final /* synthetic */ C53852hc A01;

    public C53862hd(C53852hc c53852hc) {
        this.A01 = c53852hc;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C82313qJ(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.status_details_row, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C82313qJ c82313qJ = (C82313qJ) c0ts;
        C71683Xb c71683Xb = (C71683Xb) this.A00.get(i);
        UserJid userJid = c71683Xb.A01;
        c82313qJ.A00 = userJid;
        C53852hc c53852hc = this.A01;
        C06C A0A = c53852hc.A06.A0A(userJid);
        C0Zn c0Zn = c53852hc.A0A;
        c0Zn.A04(A0A, c82313qJ.A01, false, new C52352aa(c0Zn.A04.A02, A0A));
        c82313qJ.A03.A03(c53852hc.A09.A05(A0A));
        c82313qJ.A02.setText(AnonymousClass029.A0U(c53852hc.A0C, c53852hc.A0B.A06(c71683Xb.A00)));
    }

    public void A0G(AbstractC005302j abstractC005302j) {
        if (abstractC005302j == null) {
            super.A01.A00();
            return;
        }
        for (C71683Xb c71683Xb : this.A00) {
            if (abstractC005302j.equals(c71683Xb.A01)) {
                super.A01.A00();
                return;
            }
        }
    }
}
