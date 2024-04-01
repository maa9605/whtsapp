package X;

import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.picker.search.StickerSearchTabFragment;

/* renamed from: X.3w8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85733w8 extends C0ZS {
    public StickerSearchTabFragment A00;

    @Override // X.C0ZT
    public int A0B() {
        return 7;
    }

    public C85733w8(AbstractC02800Cx abstractC02800Cx) {
        super(abstractC02800Cx, 1);
    }

    @Override // X.C0ZS, X.C0ZT
    public void A0A(ViewGroup viewGroup, int i, Object obj) {
        super.A0A(viewGroup, i, obj);
        if (this.A00 != obj) {
            this.A00 = (StickerSearchTabFragment) obj;
        }
    }

    @Override // X.C0ZS
    public C0BA A0G(int i) {
        Bundle A01 = C000200d.A01("sticker_category_tab", i);
        StickerSearchTabFragment stickerSearchTabFragment = new StickerSearchTabFragment();
        stickerSearchTabFragment.A0P(A01);
        return stickerSearchTabFragment;
    }
}
