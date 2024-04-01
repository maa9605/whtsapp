package com.whatsapp.gallery;

import X.C018308n;
import X.C03690Gr;
import X.C0WZ;
import X.C3K8;
import X.C40081rY;
import X.C42471vn;
import X.C52682b9;
import X.InterfaceC53322di;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class LinksGalleryFragment extends Hilt_LinksGalleryFragment implements InterfaceC53322di {
    public C018308n A00;
    public C52682b9 A01;
    public C03690Gr A02;
    public C0WZ A03;
    public C40081rY A04;
    public C42471vn A05;

    @Override // com.whatsapp.gallery.GalleryFragmentBase, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        C3K8 c3k8 = new C3K8(this);
        ((GalleryFragmentBase) this).A09 = c3k8;
        ((GalleryFragmentBase) this).A02.setAdapter(c3k8);
        ((TextView) A05().findViewById(R.id.empty_text)).setText(R.string.no_urls_found);
    }

    @Override // com.whatsapp.gallery.Hilt_LinksGalleryFragment, com.whatsapp.gallery.Hilt_GalleryFragmentBase, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A01 = new C52682b9(((GalleryFragmentBase) this).A0D.AGj());
    }
}
