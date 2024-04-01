package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Y6 */
/* loaded from: classes2.dex */
public abstract class C3Y6 {
    public void A00(List list) {
        if (this instanceof C82723qy) {
            Collections.sort(list, new C47592Bv(true));
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = ((C82723qy) this).A00;
            ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A0B = list;
            stickerStoreFeaturedTabFragment.A03 = false;
            C2C7 c2c7 = ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A0A;
            if (c2c7 == null) {
                C86443xW c86443xW = new C86443xW(stickerStoreFeaturedTabFragment, list);
                ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A0A = c86443xW;
                RecyclerView recyclerView = ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A04;
                if (recyclerView != null) {
                    recyclerView.setLayoutFrozen(false);
                    recyclerView.A0j(c86443xW, true, true);
                    recyclerView.A0u(true);
                    recyclerView.requestLayout();
                }
                stickerStoreFeaturedTabFragment.A0y();
            } else {
                c2c7.A00 = list;
                ((AbstractC04890Mh) c2c7).A01.A00();
            }
            stickerStoreFeaturedTabFragment.A0y();
        } else if (!(this instanceof C82633qp)) {
            C66483Bf c66483Bf = (C66483Bf) this;
            list.size();
            if (list.size() == 0) {
                C2AS c2as = c66483Bf.A00.A0a;
                RunnableEBaseShape8S0100000_I1_0 runnableEBaseShape8S0100000_I1_0 = new RunnableEBaseShape8S0100000_I1_0(c66483Bf, 28);
                if (c2as.A0E.A04(C0DC.A0I, 1048576L, true, false, 0, false, false)) {
                    c2as.A0S.ARy(new C82643qq(c2as, new C82633qp(c2as, runnableEBaseShape8S0100000_I1_0)), new Object[0]);
                    return;
                }
                Log.i("StickerRepository/downloadInitialPackAsync/autodownload is not safe, going to do nothing");
                return;
            }
            C48352Ex c48352Ex = c66483Bf.A00;
            C000200d.A0j(((C0R7) c48352Ex).A06, "sticker_picker_initial_download", true);
            c48352Ex.A0E();
        } else {
            C82633qp c82633qp = (C82633qp) this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C42531vt c42531vt = (C42531vt) it.next();
                if (c42531vt.A0D.equals("whatsappcuppy")) {
                    C2AS c2as2 = c82633qp.A00;
                    if (c2as2.A0E.A04(C0DC.A0I, c42531vt.A08, true, false, 0, false, false)) {
                        c2as2.A0I(c42531vt, new C82493qb(c82633qp.A01));
                        return;
                    }
                    Log.i("StickerRepository/downloadInitialPackAsync/autodownload is not safe, going to do nothing");
                }
            }
        }
    }
}
