package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.gif_search.RemoveGifFromFavoritesDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

/* renamed from: X.3KY  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KY extends AbstractC462025p {
    public InterfaceC61372w2 A00;
    public C66633Bv A01;
    public List A02;
    public final int A03;
    public final C01B A04;
    public final C02E A05;
    public final AnonymousClass011 A06;
    public final C455822q A07;
    public final C47212Ai A08;
    public final InterfaceC48372Ez A09;
    public final AnonymousClass227 A0A;
    public final C02O A0B;
    public final InterfaceC002901k A0C;

    public C3KY(List list, C455822q c455822q, InterfaceC002901k interfaceC002901k, C47212Ai c47212Ai, AnonymousClass011 anonymousClass011, C01B c01b, AnonymousClass227 anonymousClass227, InterfaceC48372Ez interfaceC48372Ez, C02E c02e, C02O c02o, int i) {
        this.A02 = list;
        this.A09 = interfaceC48372Ez;
        this.A07 = c455822q;
        this.A0C = interfaceC002901k;
        this.A03 = i;
        this.A08 = c47212Ai;
        this.A06 = anonymousClass011;
        this.A04 = c01b;
        this.A0A = anonymousClass227;
        this.A05 = c02e;
        this.A0B = c02o;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A02.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        return this.A02.get(i) instanceof C49312Jo ? 1 : 0;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new C3LP(viewGroup, this.A07, this.A03);
        }
        return new C3LQ(this.A07, this.A06, this.A04, this.A05, this.A0B, viewGroup, this.A09, this.A03);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C3KV c3kv = (C3KV) c0ts;
        super.A0G(c3kv);
        boolean z = this.A02.get(i) instanceof C49312Jo;
        if (!z) {
            C3LP c3lp = (C3LP) c3kv;
            c3lp.A0G(true);
            if (!this.A02.isEmpty() && i < this.A02.size()) {
                final C2BR c2br = (C2BR) ((C2JK) this.A02.get(i)).A9d();
                c3lp.A0J(c2br);
                View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: X.2vz
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        C2BR c2br2 = C2BR.this;
                        RemoveGifFromFavoritesDialogFragment removeGifFromFavoritesDialogFragment = new RemoveGifFromFavoritesDialogFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("gif", c2br2);
                        removeGifFromFavoritesDialogFragment.A0P(bundle);
                        ((ActivityC02290Ap) C018308n.A00(view.getContext())).AUh(removeGifFromFavoritesDialogFragment);
                        return true;
                    }
                };
                ImageView imageView = c3lp.A0B;
                imageView.setOnLongClickListener(onLongClickListener);
                imageView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(c3lp, this.A09, 11));
                return;
            }
        } else if (!z) {
            return;
        }
        C3LQ c3lq = (C3LQ) c3kv;
        if (this.A02.isEmpty() || i >= this.A02.size()) {
            return;
        }
        c3lq.A01 = (C49302Jn) ((C2JK) this.A02.get(i)).A9d();
        c3lq.A00 = 2;
    }
}
