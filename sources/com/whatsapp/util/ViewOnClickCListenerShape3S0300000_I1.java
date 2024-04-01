package com.whatsapp.util;

import X.AbstractC005302j;
import X.AbstractC68293Ix;
import X.AbstractView$OnClickListenerC49532Ky;
import X.AnonymousClass337;
import X.C06C;
import X.C0AT;
import X.C2N4;
import X.C3LH;
import X.C468628o;
import X.C57392pE;
import X.C57402pF;
import X.C61722wc;
import X.C61732wd;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;

/* loaded from: classes2.dex */
public class ViewOnClickCListenerShape3S0300000_I1 extends AbstractView$OnClickListenerC49532Ky {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public ViewOnClickCListenerShape3S0300000_I1(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    @Override // X.AbstractView$OnClickListenerC49532Ky
    public void A00(View view) {
        switch (this.A03) {
            case 0:
                C3LH c3lh = (C3LH) this.A00;
                ImageView imageView = ((AbstractC68293Ix) c3lh).A01;
                if (imageView.getTag(R.id.loaded_image_url) != null) {
                    UserJid userJid = (UserJid) this.A02;
                    String str = ((C468628o) this.A01).A09;
                    C2N4.A00(userJid, str, ((AnonymousClass337) c3lh).A01.A0A(userJid), Integer.valueOf(imageView.getWidth()), Integer.valueOf(imageView.getHeight()), view.getContext(), new Intent(view.getContext(), ProductDetailActivity.class), 3);
                    c3lh.A01.A02(5, 24, str, userJid);
                    return;
                }
                return;
            case 1:
                QuickContactActivity.A00(((C57392pE) this.A00).A00, view, (AbstractC005302j) ((C06C) this.A01).A03(UserJid.class), C0AT.A0G(((C57402pF) this.A02).A00));
                return;
            case 2:
                QuickContactActivity.A00(((C61722wc) this.A00).A05, view, (AbstractC005302j) ((C06C) this.A01).A03(AbstractC005302j.class), C0AT.A0G(((C61732wd) this.A02).A00));
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
