package X;

import android.graphics.Rect;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0201000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import java.util.List;

/* renamed from: X.2C7 */
/* loaded from: classes2.dex */
public class C2C7 extends AbstractC04890Mh {
    public List A00;
    public final /* synthetic */ StickerStoreTabFragment A01;

    public C2C7(StickerStoreTabFragment stickerStoreTabFragment, List list) {
        this.A01 = stickerStoreTabFragment;
        this.A00 = list;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        View inflate = stickerStoreTabFragment.A01.inflate(R.layout.sticker_store_row, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.sticker_row_recycler);
        recyclerView.setNestedScrollingEnabled(false);
        final int dimensionPixelSize = stickerStoreTabFragment.A01().getDimensionPixelSize(R.dimen.sticker_store_row_preview_padding);
        recyclerView.A0k(new AbstractC08920cK() { // from class: X.3r6
            @Override // X.AbstractC08920cK
            public void A01(Rect rect, View view, RecyclerView recyclerView2, C0Y0 c0y0) {
                rect.set(0, 0, dimensionPixelSize, 0);
            }
        });
        int dimensionPixelSize2 = stickerStoreTabFragment.A01().getDimensionPixelSize(R.dimen.sticker_store_row_preview_item);
        if (stickerStoreTabFragment.A00 == 0) {
            stickerStoreTabFragment.A00 = Math.min(5, Math.max(viewGroup.getWidth() / dimensionPixelSize2, 1));
        }
        return new C82813r7(stickerStoreTabFragment, inflate);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        String str;
        C82813r7 c82813r7 = (C82813r7) c0ts;
        C42531vt c42531vt = (C42531vt) this.A00.get(i);
        c82813r7.A0A.setText(c42531vt.A0H);
        long j = c42531vt.A08;
        if (j > 0) {
            TextView textView = c82813r7.A0B;
            textView.setText(C02180Ae.A0k(this.A01.A06, j));
            textView.setVisibility(0);
            c82813r7.A01.setVisibility(0);
        } else {
            c82813r7.A0B.setVisibility(8);
            c82813r7.A01.setVisibility(8);
        }
        c82813r7.A0C.setText(c42531vt.A0F);
        View view = c82813r7.A02;
        view.setClickable(true);
        view.setOnClickListener(new ViewOnClickEBaseShape0S0201000_I0(this, c42531vt, i, 1));
        StickerStoreTabFragment stickerStoreTabFragment = this.A01;
        int dimensionPixelSize = stickerStoreTabFragment.A01().getDimensionPixelSize(R.dimen.sticker_store_row_preview_item);
        if (c82813r7.A00 == null) {
            AnonymousClass241 A04 = stickerStoreTabFragment.A09.A04();
            C43791xz c43791xz = stickerStoreTabFragment.A07;
            if (!(stickerStoreTabFragment instanceof StickerStoreMyTabFragment)) {
                str = "sticker_store_featured_tab";
            } else {
                str = "sticker_store_my_tab";
            }
            c82813r7.A00 = new C82613qn(A04, c43791xz, dimensionPixelSize, 0, false, "sticker_store_my_tab".equals(str), null);
        }
        C3Y5 c3y5 = new C3Y5();
        c3y5.A02 = c42531vt;
        c3y5.A01 = new SparseBooleanArray();
        c3y5.A00 = new SparseBooleanArray();
        C82613qn c82613qn = c82813r7.A00;
        c82613qn.A04 = c3y5;
        int i2 = stickerStoreTabFragment.A00;
        c82613qn.A00 = i2;
        c82813r7.A0E.A1q(i2);
        ((AbstractC04890Mh) c82813r7.A00).A01.A00();
        c82813r7.A0F.setAdapter(c82813r7.A00);
        c82813r7.A0D.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(c42531vt, this, 15));
        if (c42531vt.A0M) {
            c82813r7.A05.setVisibility(0);
        } else {
            c82813r7.A05.setVisibility(8);
        }
    }
}
