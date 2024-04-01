package com.whatsapp.gallery;

import X.AbstractC005302j;
import X.ActivityC02330At;
import X.C00A;
import X.C00T;
import X.C0AT;
import X.C0BA;
import X.C0C9;
import X.C0IU;
import X.C40411sD;
import X.C42471vn;
import X.InterfaceC32541eF;
import X.InterfaceC53322di;
import android.os.Bundle;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.RecyclerFastScroller;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediaGalleryFragment extends Hilt_MediaGalleryFragment implements InterfaceC53322di {
    public C0C9 A00;
    public C40411sD A01;
    public C00A A02;
    public AbstractC005302j A03;
    public C42471vn A04;
    public final C00T A05 = new C00T() { // from class: X.3Ay
        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            MediaGalleryFragment mediaGalleryFragment = MediaGalleryFragment.this;
            C3B9 c3b9 = (C3B9) ((MediaGalleryFragmentBase) mediaGalleryFragment).A0E;
            if (c3b9 != null) {
                if (collection != null && !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AbstractC005302j abstractC005302j2 = ((AnonymousClass092) it.next()).A0n.A00;
                        if (abstractC005302j2 != null && abstractC005302j2.equals(mediaGalleryFragment.A03)) {
                            c3b9.ARb();
                            ((MediaGalleryFragmentBase) mediaGalleryFragment).A06.A01.A00();
                            return;
                        }
                    }
                } else if (abstractC005302j != null && !abstractC005302j.equals(mediaGalleryFragment.A03)) {
                } else {
                    c3b9.ARb();
                    ((MediaGalleryFragmentBase) mediaGalleryFragment).A06.A01.A00();
                }
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC005302j abstractC005302j = ((AnonymousClass092) it.next()).A0n.A00;
                if (abstractC005302j != null) {
                    MediaGalleryFragment mediaGalleryFragment = MediaGalleryFragment.this;
                    if (abstractC005302j.equals(mediaGalleryFragment.A03)) {
                        mediaGalleryFragment.A16(false, false);
                        return;
                    }
                }
            }
        }
    };

    @Override // X.InterfaceC53322di
    public void AON(C0IU c0iu) {
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        AbstractC005302j A02 = AbstractC005302j.A02(A0A().getIntent().getStringExtra("jid"));
        if (A02 != null) {
            this.A03 = A02;
            C0AT.A0f(((MediaGalleryFragmentBase) this).A08, true);
            C0AT.A0f(A05().findViewById(R.id.no_media), true);
            A16(false, false);
            ActivityC02330At A09 = A09();
            if (A09 instanceof MediaGalleryActivity) {
                ((MediaGalleryFragmentBase) this).A08.A0m(((MediaGalleryActivity) A09).A0n);
                final RecyclerFastScroller recyclerFastScroller = (RecyclerFastScroller) ((C0BA) this).A0A.findViewById(R.id.scroller);
                AppBarLayout appBarLayout = (AppBarLayout) A09().findViewById(R.id.appbar);
                recyclerFastScroller.A04 = (CoordinatorLayout) A09().findViewById(R.id.coordinator);
                recyclerFastScroller.A07 = appBarLayout;
                appBarLayout.A02(new InterfaceC32541eF() { // from class: X.3KJ
                    @Override // X.C1AR
                    public final void AMX(AppBarLayout appBarLayout2, int i) {
                        RecyclerFastScroller recyclerFastScroller2 = RecyclerFastScroller.this;
                        int i2 = -i;
                        if (recyclerFastScroller2.A00 != i2) {
                            recyclerFastScroller2.A01();
                            recyclerFastScroller2.A00 = i2;
                        }
                    }
                });
            }
            this.A02.A01(this.A05);
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0q() {
        super.A0q();
        this.A02.A00(this.A05);
    }

    @Override // X.InterfaceC53322di
    public void AOT() {
        ((MediaGalleryFragmentBase) this).A06.A01.A00();
    }
}
