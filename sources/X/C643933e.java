package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.33e  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C643933e extends AbstractC04890Mh implements C2S1 {
    public final C018308n A00;
    public final C018508q A01;
    public final C02L A02;
    public final C49462Ko A03;
    public final C2N3 A04;
    public final AnonymousClass272 A05;
    public final C05W A06;
    public final AnonymousClass075 A07;
    public final C018708s A08;
    public final C002301c A09;
    public final UserJid A0A;
    public final List A0B;

    public C643933e(UserJid userJid, C018508q c018508q, C02L c02l, C018308n c018308n, C05W c05w, C018708s c018708s, C002301c c002301c, AnonymousClass272 anonymousClass272, AnonymousClass075 anonymousClass075, C49462Ko c49462Ko, C2N3 c2n3) {
        ArrayList arrayList = new ArrayList();
        this.A0B = arrayList;
        this.A0A = userJid;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A00 = c018308n;
        this.A06 = c05w;
        this.A08 = c018708s;
        this.A09 = c002301c;
        this.A04 = c2n3;
        this.A05 = anonymousClass272;
        this.A07 = anonymousClass075;
        this.A03 = c49462Ko;
        arrayList.add(new C644533k());
        A03(this.A0B.size() - 1);
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A0B.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return ((AbstractC56252mx) this.A0B.get(i)).A00;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i != 2) {
            if (i == 5) {
                Context context = viewGroup.getContext();
                C018508q c018508q = this.A01;
                C02L c02l = this.A02;
                C018308n c018308n = this.A00;
                C05W c05w = this.A06;
                C002301c c002301c = this.A09;
                C2N3 c2n3 = this.A04;
                AnonymousClass272 anonymousClass272 = this.A05;
                C49462Ko c49462Ko = this.A03;
                View inflate = LayoutInflater.from(context).inflate(R.layout.business_product_catalog_list_product, viewGroup, false);
                AnonymousClass088.A1U(inflate);
                return new C3LH(c018508q, c02l, c018308n, c05w, c002301c, anonymousClass272, c49462Ko, inflate, c2n3, this);
            }
            throw new IllegalStateException("collection-product-list-adapter/onCreateViewHolder/unknown view type");
        }
        return C3LF.A00(viewGroup, this.A01, this.A02, this.A00, this.A06, this.A08, this.A05, this.A07);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        AnonymousClass337 anonymousClass337 = (AnonymousClass337) c0ts;
        List list = this.A0B;
        if (((AbstractC56252mx) list.get(i)).A00 == 2) {
            ((C3LF) anonymousClass337).A00 = ((C644533k) list.get(i)).A00;
        }
        anonymousClass337.A0C(this.A0A, i);
    }

    @Override // X.C2S1
    public C468628o ACa(int i) {
        return ((C644733m) this.A0B.get(i)).A00;
    }
}
