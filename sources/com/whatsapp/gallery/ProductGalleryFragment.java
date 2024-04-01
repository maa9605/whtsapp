package com.whatsapp.gallery;

import X.C002301c;
import X.C012706e;
import X.C02L;
import X.C0C9;
import X.C0D5;
import X.C3KB;
import X.C42471vn;
import X.C49462Ko;
import X.InterfaceC53322di;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ProductGalleryFragment extends Hilt_ProductGalleryFragment implements InterfaceC53322di {
    public C02L A00;
    public C49462Ko A01;
    public C002301c A02;
    public C0C9 A03;
    public C0D5 A04;
    public C012706e A05;
    public C42471vn A06;

    @Override // com.whatsapp.gallery.GalleryFragmentBase, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        C3KB c3kb = new C3KB(this);
        ((GalleryFragmentBase) this).A09 = c3kb;
        ((GalleryFragmentBase) this).A02.setAdapter(c3kb);
        ((TextView) A05().findViewById(R.id.empty_text)).setText(R.string.no_products_found);
    }
}
