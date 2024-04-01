package com.whatsapp.biz.catalog;

import X.AbstractActivityC49822Mq;
import X.AbstractC02800Cx;
import X.ActivityC02320As;
import X.C000200d;
import X.C02180Ae;
import X.C02820Cz;
import X.C06960Vv;
import X.C0BA;
import X.C1M7;
import X.C2HC;
import X.C468628o;
import X.InterfaceC05780Qf;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* loaded from: classes2.dex */
public class CatalogMediaView extends AbstractActivityC49822Mq implements InterfaceC05780Qf {
    @Override // X.InterfaceC05780Qf
    public void AJT() {
    }

    @Override // X.InterfaceC05780Qf
    public void APP() {
    }

    @Override // X.InterfaceC05780Qf
    public boolean AUZ() {
        return true;
    }

    public static void A00(Context context, C468628o c468628o, C1M7 c1m7, int i, View view, UserJid userJid) {
        Intent intent = new Intent(context, CatalogMediaView.class);
        intent.putExtra("product", c468628o);
        intent.putExtra("target_image_index", i);
        intent.putExtra("cached_jid", userJid.getRawString());
        Activity A0G = C02180Ae.A0G(context, ActivityC02320As.class);
        if (A0G != null) {
            intent.putExtra("animation_bundle", C2HC.A03(A0G, view));
        }
        C2HC.A06(context, c1m7, intent, view, C000200d.A0H("thumb-transition-", C06960Vv.A01(c468628o.A09, i)));
    }

    @Override // X.InterfaceC05780Qf
    public void AM0() {
        finish();
    }

    @Override // X.AbstractActivityC49822Mq, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C2HC.A00) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        setContentView(R.layout.media_view_activity);
        AbstractC02800Cx A0N = A0N();
        C0BA A01 = A0N.A0Q.A01("catalog_media_view_fragment");
        if (A01 == null) {
            A01 = new CatalogMediaViewFragment();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("product", intent.getParcelableExtra("product"));
        bundle2.putInt("target_image_index", intent.getIntExtra("target_image_index", 0));
        bundle2.putString("cached_jid", intent.getStringExtra("cached_jid"));
        bundle2.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
        A01.A0P(bundle2);
        C02820Cz c02820Cz = new C02820Cz(A0N);
        c02820Cz.A01(R.id.media_view_fragment_container, A01, "catalog_media_view_fragment");
        c02820Cz.A04();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        MediaViewBaseFragment.A05(this, true);
    }
}
