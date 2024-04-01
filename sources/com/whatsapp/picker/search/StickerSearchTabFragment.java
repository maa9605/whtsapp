package com.whatsapp.picker.search;

import X.AbstractC04890Mh;
import X.C003701t;
import X.C0BA;
import X.C0JM;
import X.C2IK;
import X.C48352Ex;
import X.C70553Ss;
import X.C78833kb;
import X.C78883kg;
import X.C82863rC;
import X.InterfaceC05620Pl;
import X.InterfaceC53342en;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchTabFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class StickerSearchTabFragment extends Hilt_StickerSearchTabFragment implements InterfaceC53342en {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public RecyclerView A01;
    public C003701t A02;
    public C2IK A03;

    @Override // X.C0BA
    public void A0f() {
        C2IK c2ik = this.A03;
        if (c2ik != null) {
            c2ik.A04 = false;
            ((AbstractC04890Mh) c2ik).A01.A00();
        }
        this.A0U = true;
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context A00 = A00();
        View inflate = layoutInflater.inflate(R.layout.sticker_search_tab_results, viewGroup, false);
        this.A01 = (RecyclerView) inflate.findViewById(R.id.tab_result);
        C0BA c0ba = this.A0D;
        if (c0ba instanceof StickerSearchDialogFragment) {
            final StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) c0ba;
            C78833kb c78833kb = ((PickerSearchDialogFragment) stickerSearchDialogFragment).A00;
            if (c78833kb != null) {
                List arrayList = new ArrayList();
                Bundle bundle2 = this.A06;
                if (bundle2 != null) {
                    final int i = bundle2.getInt("sticker_category_tab");
                    C78883kg c78883kg = stickerSearchDialogFragment.A0A;
                    if (c78883kg != null) {
                        c78883kg.A00.A05(A0D(), new InterfaceC05620Pl() { // from class: X.3kW
                            {
                                StickerSearchTabFragment.this = this;
                            }

                            @Override // X.InterfaceC05620Pl
                            public final void AIK(Object obj) {
                                StickerSearchTabFragment stickerSearchTabFragment = StickerSearchTabFragment.this;
                                StickerSearchDialogFragment stickerSearchDialogFragment2 = stickerSearchDialogFragment;
                                int i2 = i;
                                C2IK c2ik = stickerSearchTabFragment.A03;
                                if (c2ik != null) {
                                    c2ik.A0G(stickerSearchDialogFragment2.A19(i2));
                                    ((AbstractC04890Mh) stickerSearchTabFragment.A03).A01.A00();
                                }
                            }
                        });
                    }
                    arrayList = stickerSearchDialogFragment.A19(i);
                }
                C48352Ex c48352Ex = c78833kb.A00;
                C2IK c2ik = new C2IK(arrayList, A00, c48352Ex == null ? null : c48352Ex.A0Y, this, 1);
                this.A03 = c2ik;
                this.A01.setAdapter(c2ik);
                C70553Ss c70553Ss = new C70553Ss(A00, viewGroup, this.A01, this.A03);
                this.A00 = c70553Ss.A07;
                inflate.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
                this.A01.A0m(new C82863rC(this.A02, A01(), c70553Ss.A08));
                return inflate;
            }
            throw null;
        }
        throw new RuntimeException("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }

    @Override // X.C0BA
    public void A0r() {
        this.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this.A00);
        List list = this.A01.A0b;
        if (list != null) {
            list.clear();
        }
        this.A0U = true;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        C2IK c2ik = this.A03;
        if (c2ik != null) {
            c2ik.A04 = true;
            ((AbstractC04890Mh) c2ik).A01.A00();
        }
    }

    @Override // X.InterfaceC53342en
    public void AP7(C0JM c0jm, Integer num) {
        C0BA c0ba = this.A0D;
        if (c0ba instanceof StickerSearchDialogFragment) {
            ((StickerSearchDialogFragment) c0ba).AP7(c0jm, num);
            return;
        }
        throw new RuntimeException("Parent fragment of StickerSearchTabFragment is not of type StickerSearchDialogFragment");
    }
}
