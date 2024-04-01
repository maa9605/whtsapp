package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.33h  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C644233h extends AbstractC04890Mh implements C2S1 {
    public C644133g A01;
    public final C018308n A02;
    public final C018508q A03;
    public final C02L A04;
    public final C49462Ko A05;
    public final C2N3 A06;
    public final AnonymousClass272 A07;
    public final C05W A08;
    public final AnonymousClass075 A09;
    public final C018708s A0A;
    public final C002301c A0B;
    public final UserJid A0C;
    public final List A0D = new ArrayList();
    public int A00 = 5;

    public C644233h(C018508q c018508q, UserJid userJid, C02L c02l, C018308n c018308n, C05W c05w, C018708s c018708s, C002301c c002301c, C2N3 c2n3, AnonymousClass272 anonymousClass272, AnonymousClass075 anonymousClass075, C49462Ko c49462Ko) {
        this.A03 = c018508q;
        this.A0C = userJid;
        this.A04 = c02l;
        this.A02 = c018308n;
        this.A08 = c05w;
        this.A0A = c018708s;
        this.A0B = c002301c;
        this.A06 = c2n3;
        this.A07 = anonymousClass272;
        this.A09 = anonymousClass075;
        this.A05 = c49462Ko;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.33g] */
    @Override // X.AbstractC04890Mh
    public void A09(final RecyclerView recyclerView) {
        this.A01 = new InterfaceC15040nz(this, recyclerView) { // from class: X.33g
            public int A00 = -1;
            public final RecyclerView A01;
            public final C644233h A02;

            {
                this.A02 = this;
                this.A01 = recyclerView;
            }

            @Override // X.InterfaceC15040nz
            public void AIJ(int i, int i2, Object obj) {
                ((AbstractC04890Mh) this.A02).A01.A04(i, i2, obj);
            }

            @Override // X.InterfaceC15040nz
            public void AL5(int i, int i2) {
                int i3 = this.A00;
                if (i3 == -1 || i3 > i) {
                    this.A00 = i;
                    this.A01.A0Y(0);
                }
                ((AbstractC04890Mh) this.A02).A01.A02(i, i2);
            }

            @Override // X.InterfaceC15040nz
            public void AMG(int i, int i2) {
                ((AbstractC04890Mh) this.A02).A01.A01(i, i2);
            }

            @Override // X.InterfaceC15040nz
            public void ANn(int i, int i2) {
                ((AbstractC04890Mh) this.A02).A01.A03(i, i2);
            }
        };
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A0D.size() + 1;
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        List list = this.A0D;
        if (i < list.size()) {
            return ((InterfaceC56182mq) list.get(i)).getType() == 0 ? 0 : 1;
        }
        return 2;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C644833n(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_list_row, viewGroup, false));
        }
        if (i != 0) {
            if (i == 2) {
                return C3LF.A00(viewGroup, this.A03, this.A04, this.A02, this.A08, this.A0A, this.A07, this.A09);
            }
            throw new IllegalStateException("Unsupported view type");
        }
        Context context = viewGroup.getContext();
        C018508q c018508q = this.A03;
        C02L c02l = this.A04;
        C018308n c018308n = this.A02;
        C05W c05w = this.A08;
        C002301c c002301c = this.A0B;
        C2N3 c2n3 = this.A06;
        AnonymousClass272 anonymousClass272 = this.A07;
        C49462Ko c49462Ko = this.A05;
        View inflate = LayoutInflater.from(context).inflate(R.layout.business_product_catalog_list_product, viewGroup, false);
        AnonymousClass088.A1U(inflate);
        return new C3LH(c018508q, c02l, c018308n, c05w, c002301c, anonymousClass272, c49462Ko, inflate, c2n3, this);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        int A0D = A0D(i);
        if (A0D == 1) {
            WaTextView waTextView = ((C644833n) c0ts).A00;
            String str = ((C33N) this.A0D.get(i)).A00;
            waTextView.setText(str);
            waTextView.setContentDescription(waTextView.getContext().getString(R.string.product_list_accessibility_section_header, str));
        } else if (A0D == 0) {
            ((AnonymousClass337) c0ts).A0C(this.A0C, i);
        } else if (A0D == 2) {
            C3LF c3lf = (C3LF) c0ts;
            c3lf.A00 = this.A00;
            c3lf.A0C(this.A0C, i - this.A0D.size());
        } else {
            throw new IllegalStateException("Unsupported view type");
        }
    }

    @Override // X.C2S1
    public C468628o ACa(int i) {
        return ((C33O) this.A0D.get(i)).A00;
    }
}
