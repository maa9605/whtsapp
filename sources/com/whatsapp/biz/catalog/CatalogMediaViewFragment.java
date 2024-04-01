package com.whatsapp.biz.catalog;

import X.C018308n;
import X.C02F;
import X.C06960Vv;
import X.C0AT;
import X.C0BA;
import X.C0Z8;
import X.C2MT;
import X.C2N3;
import X.C33G;
import X.C3LB;
import X.C468628o;
import X.C49462Ko;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* loaded from: classes2.dex */
public class CatalogMediaViewFragment extends Hilt_CatalogMediaViewFragment {
    public int A00;
    public C018308n A01;
    public C49462Ko A02;
    public C2MT A03;
    public C2N3 A04;
    public C02F A05;
    public C468628o A06;
    public UserJid A07;
    public String A08;

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA
    public void A0q() {
        this.A04.A00();
        super.A0q();
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        Bundle bundle2 = ((C0BA) this).A06;
        if (bundle2 == null) {
            return;
        }
        this.A04 = new C2N3(this.A03);
        this.A07 = UserJid.getNullable(bundle2.getString("cached_jid"));
        this.A06 = (C468628o) bundle2.getParcelable("product");
        this.A00 = bundle2.getInt("target_image_index", 0);
        C3LB c3lb = new C3LB(this, new C33G(this));
        ((MediaViewBaseFragment) this).A08 = c3lb;
        ((MediaViewBaseFragment) this).A09.setAdapter(c3lb);
        ((MediaViewBaseFragment) this).A09.A0B(0, false);
        ((MediaViewBaseFragment) this).A09.A0B(this.A00, false);
        ((MediaViewBaseFragment) this).A09.A0F(new C0Z8() { // from class: X.33E
            @Override // X.C0Z8
            public void AMg(int i) {
            }

            @Override // X.C0Z8
            public void AMh(int i, float f, int i2) {
            }

            {
                CatalogMediaViewFragment.this = this;
            }

            @Override // X.C0Z8
            public void AMi(int i) {
                CatalogMediaViewFragment catalogMediaViewFragment = CatalogMediaViewFragment.this;
                catalogMediaViewFragment.A02.A02(11, 30, catalogMediaViewFragment.A06.A09, catalogMediaViewFragment.A07);
            }
        });
    }

    @Override // com.whatsapp.mediaview.MediaViewBaseFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0w(view, bundle);
        if (bundle == null) {
            this.A08 = C06960Vv.A01(this.A06.A09, this.A00);
            Bundle bundle2 = ((MediaViewBaseFragment) this).A01;
            if (bundle2 != null) {
                ((MediaViewBaseFragment) this).A0E = true;
                ((MediaViewBaseFragment) this).A0B.A0A(this, bundle2);
            }
            this.A02.A02(10, 29, this.A06.A09, this.A07);
        }
        ((MediaViewBaseFragment) this).A02.setVisibility(8);
        C0AT.A0D(view, R.id.title_holder).setClickable(false);
    }
}
