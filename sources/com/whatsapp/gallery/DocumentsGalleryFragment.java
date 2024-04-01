package com.whatsapp.gallery;

import X.AbstractC000600i;
import X.C018308n;
import X.C018508q;
import X.C01B;
import X.C2NE;
import X.C3K7;
import X.C40421sE;
import X.C42461vm;
import X.InterfaceC002901k;
import X.InterfaceC53322di;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class DocumentsGalleryFragment extends Hilt_DocumentsGalleryFragment implements InterfaceC53322di {
    public C018308n A00;
    public AbstractC000600i A01;
    public C018508q A02;
    public C01B A03;
    public C2NE A04;
    public C40421sE A05;
    public C42461vm A06;
    public InterfaceC002901k A07;

    @Override // com.whatsapp.gallery.GalleryFragmentBase, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        C3K7 c3k7 = new C3K7(this);
        ((GalleryFragmentBase) this).A09 = c3k7;
        ((GalleryFragmentBase) this).A02.setAdapter(c3k7);
        ((TextView) A05().findViewById(R.id.empty_text)).setText(R.string.no_documents_found);
    }
}
