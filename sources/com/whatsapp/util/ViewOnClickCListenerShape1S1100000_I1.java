package com.whatsapp.util;

import X.AbstractView$OnClickListenerC49532Ky;
import X.C2YV;
import X.C3XV;
import android.net.Uri;
import android.view.View;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape1S1100000_I1 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public String A01;
    public final int A02;

    public ViewOnClickCListenerShape1S1100000_I1(Object obj, String str, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        switch (this.A02) {
            case 0:
                C2YV c2yv = (C2YV) this.A00;
                c2yv.A01.AS7(c2yv.getContext(), Uri.parse(this.A01));
                return;
            case 1:
                ((C3XV) this.A00).A00.AS7(view.getContext(), Uri.parse(this.A01));
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
