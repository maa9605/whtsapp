package com.whatsapp.stickers;

import X.AbstractC04890Mh;
import X.C018308n;
import X.C2AS;
import X.C42531vt;
import X.C82643qq;
import X.C82723qy;
import android.view.View;

/* loaded from: classes2.dex */
public class StickerStoreFeaturedTabFragment extends Hilt_StickerStoreFeaturedTabFragment {
    public View A00;
    public C018308n A01;
    public boolean A02;
    public boolean A03;

    @Override // com.whatsapp.stickers.StickerStoreTabFragment
    public void A0y() {
        super.A0y();
        View view = ((StickerStoreTabFragment) this).A02;
        if (view != null) {
            view.setVisibility(this.A03 ? 0 : 8);
        }
    }

    @Override // com.whatsapp.stickers.StickerStoreTabFragment
    public void A0z(C42531vt c42531vt, int i) {
        super.A0z(c42531vt, i);
        c42531vt.A06 = false;
        ((AbstractC04890Mh) ((StickerStoreTabFragment) this).A0A).A01.A04(i, 1, null);
        C2AS c2as = ((StickerStoreTabFragment) this).A09;
        c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, c42531vt, 24));
    }

    public final void A11() {
        this.A03 = true;
        C2AS c2as = ((StickerStoreTabFragment) this).A09;
        C82723qy c82723qy = new C82723qy(this);
        if (c2as != null) {
            c2as.A0S.ARy(new C82643qq(c2as, c82723qy), new Object[0]);
            return;
        }
        throw null;
    }
}
