package com.whatsapp.base;

import X.C002601h;
import X.C09360d8;
import androidx.fragment.app.ListFragment;

/* loaded from: classes2.dex */
public class WaListFragment extends ListFragment {
    public C09360d8 A00;
    public C002601h A01 = C002601h.A00();

    @Override // X.C0BA
    public void A0V(boolean z) {
        super.A0V(z);
        if (z) {
            this.A01.A05(this, "visible");
        } else {
            this.A01.A05(this, "invisible");
        }
    }
}
