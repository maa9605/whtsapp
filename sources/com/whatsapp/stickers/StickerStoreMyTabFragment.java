package com.whatsapp.stickers;

import X.AbstractC04890Mh;
import X.C1UL;
import X.C25Z;
import X.C2AS;
import X.C2C0;
import X.C2C7;
import X.C42531vt;
import X.C86453xX;
import X.InterfaceC002901k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public class StickerStoreMyTabFragment extends Hilt_StickerStoreMyTabFragment implements C25Z {
    public View A00;
    public C1UL A01;
    public C2C0 A02;
    public InterfaceC002901k A03;
    public boolean A04;

    @Override // X.C0BA
    public void A0t() {
        this.A0U = true;
        List list = ((StickerStoreTabFragment) this).A0B;
        if (list == null || !this.A04) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C42531vt) ((StickerStoreTabFragment) this).A0B.get(i)).A00 = size - i;
        }
        C2AS c2as = ((StickerStoreTabFragment) this).A09;
        c2as.A0S.AS1(new RunnableEBaseShape4S0200000_I0_4(c2as, ((StickerStoreTabFragment) this).A0B, 21));
    }

    public final void A11() {
        C2C0 c2c0 = this.A02;
        if (c2c0 != null) {
            c2c0.A05(true);
        }
        C2C0 c2c02 = new C2C0(((StickerStoreTabFragment) this).A09, this);
        this.A02 = c2c02;
        this.A03.ARy(c2c02, new Void[0]);
    }

    @Override // X.C25Z
    public void AMb(C42531vt c42531vt) {
        C2C7 c2c7 = ((StickerStoreTabFragment) this).A0A;
        if (!(c2c7 instanceof C86453xX) || c2c7.A00 == null) {
            return;
        }
        String str = c42531vt.A0D;
        for (int i = 0; i < c2c7.A00.size(); i++) {
            if (str.equals(((C42531vt) c2c7.A00.get(i)).A0D)) {
                c2c7.A00.set(i, c42531vt);
                c2c7.A02(i);
                return;
            }
        }
    }

    @Override // X.C25Z
    public void AMc(List list) {
        ((StickerStoreTabFragment) this).A0B = list;
        C2C7 c2c7 = ((StickerStoreTabFragment) this).A0A;
        if (c2c7 == null) {
            C86453xX c86453xX = new C86453xX(this, list);
            ((StickerStoreTabFragment) this).A0A = c86453xX;
            RecyclerView recyclerView = ((StickerStoreTabFragment) this).A04;
            if (recyclerView != null) {
                recyclerView.setLayoutFrozen(false);
                recyclerView.A0j(c86453xX, true, true);
                recyclerView.A0u(true);
                recyclerView.requestLayout();
            }
            A0y();
            return;
        }
        c2c7.A00 = list;
        ((AbstractC04890Mh) c2c7).A01.A00();
    }

    @Override // X.C25Z
    public void AMd() {
        this.A02 = null;
    }

    @Override // X.C25Z
    public void AMe(String str) {
        if (((StickerStoreTabFragment) this).A0B == null) {
            return;
        }
        for (int i = 0; i < ((StickerStoreTabFragment) this).A0B.size(); i++) {
            if (((C42531vt) ((StickerStoreTabFragment) this).A0B.get(i)).A0D.equals(str)) {
                ((StickerStoreTabFragment) this).A0B.remove(i);
                C2C7 c2c7 = ((StickerStoreTabFragment) this).A0A;
                if (c2c7 instanceof C86453xX) {
                    c2c7.A00 = ((StickerStoreTabFragment) this).A0B;
                    ((AbstractC04890Mh) c2c7).A01.A00();
                    return;
                }
                return;
            }
        }
    }
}
