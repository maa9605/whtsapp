package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.gif_search.StarOrRemoveFromRecentGifsDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.List;

/* renamed from: X.3KX  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3KX extends AbstractC462025p {
    public InterfaceC61372w2 A00;
    public C3Bu A01;
    public List A02;
    public final int A03;
    public final C455822q A04;
    public final InterfaceC48372Ez A05;
    public final InterfaceC002901k A06;

    public C3KX(List list, C455822q c455822q, InterfaceC002901k interfaceC002901k, InterfaceC48372Ez interfaceC48372Ez, int i) {
        this.A02 = list;
        this.A04 = c455822q;
        this.A05 = interfaceC48372Ez;
        this.A06 = interfaceC002901k;
        this.A03 = i;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A02.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C3LP(viewGroup, this.A04, this.A03);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C3LP c3lp = (C3LP) c0ts;
        super.A0G(c3lp);
        if (this.A02.isEmpty() || i >= this.A02.size()) {
            return;
        }
        final C2BR c2br = (C2BR) this.A02.get(i);
        c3lp.A0J(c2br);
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: X.2vt
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C2BR c2br2 = C2BR.this;
                StarOrRemoveFromRecentGifsDialogFragment starOrRemoveFromRecentGifsDialogFragment = new StarOrRemoveFromRecentGifsDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("gif", c2br2);
                starOrRemoveFromRecentGifsDialogFragment.A0P(bundle);
                ((ActivityC02290Ap) C018308n.A00(view.getContext())).AUh(starOrRemoveFromRecentGifsDialogFragment);
                return true;
            }
        };
        ImageView imageView = c3lp.A0B;
        imageView.setOnLongClickListener(onLongClickListener);
        imageView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(c3lp, this.A05, 11));
    }
}
