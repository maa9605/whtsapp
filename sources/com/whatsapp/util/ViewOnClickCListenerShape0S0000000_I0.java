package com.whatsapp.util;

import X.AbstractC48762Go;
import X.AbstractView$OnClickListenerC49532Ky;
import X.C018308n;
import android.view.View;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape0S0000000_I0 extends AbstractView$OnClickListenerC49532Ky {
    public final int A00 = 0;

    public ViewOnClickCListenerShape0S0000000_I0() {
    }

    public ViewOnClickCListenerShape0S0000000_I0(AbstractC48762Go abstractC48762Go, int i) {
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C018308n.A00(view.getContext()).onBackPressed();
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
