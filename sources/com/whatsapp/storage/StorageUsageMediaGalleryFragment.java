package com.whatsapp.storage;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.C00A;
import X.C00T;
import X.C018308n;
import X.C018508q;
import X.C01B;
import X.C0AT;
import X.C0BA;
import X.C0C9;
import X.C40411sD;
import X.C40421sE;
import X.C42461vm;
import X.C42471vn;
import X.InterfaceC002901k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class StorageUsageMediaGalleryFragment extends Hilt_StorageUsageMediaGalleryFragment {
    public int A00;
    public C018308n A01;
    public AbstractC000600i A02;
    public C018508q A03;
    public C01B A04;
    public C0C9 A05;
    public C40411sD A06;
    public C00A A07;
    public C40421sE A08;
    public AbstractC005302j A09;
    public C42461vm A0A;
    public C42471vn A0B;
    public InterfaceC002901k A0C;
    public final C00T A0D = new C00T() { // from class: X.3rq
        @Override // X.C00T
        public void A0A(Collection collection, AbstractC005302j abstractC005302j, Map map, boolean z) {
            AnonymousClass097 anonymousClass097;
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = StorageUsageMediaGalleryFragment.this;
            C3B9 c3b9 = (C3B9) ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0E;
            if (c3b9 == null || collection == null) {
                return;
            }
            int count = c3b9.getCount();
            Iterator it = collection.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                int i = 0;
                while (true) {
                    if (i < count) {
                        AbstractC53492h0 abstractC53492h0 = (AbstractC53492h0) c3b9.A06.get(Integer.valueOf(i));
                        if (abstractC53492h0 != null && (anonymousClass097 = abstractC53492h0.A00) != null && anonymousClass097.A0n.equals(anonymousClass092.A0n)) {
                            abstractC53492h0.A00.A0j = z;
                            z2 = true;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (z2) {
                ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
            }
        }

        @Override // X.C00T
        public void A0B(Collection collection, Map map, Map map2) {
            boolean z;
            AbstractC005302j abstractC005302j;
            Iterator it = collection.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass092 anonymousClass092 = (AnonymousClass092) it.next();
                StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = StorageUsageMediaGalleryFragment.this;
                AbstractC005302j abstractC005302j2 = storageUsageMediaGalleryFragment.A09;
                if (abstractC005302j2 == null || ((abstractC005302j = anonymousClass092.A0n.A00) != null && abstractC005302j.equals(abstractC005302j2))) {
                    if (((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0L) {
                        C3B9 c3b9 = (C3B9) ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A0E;
                        if (c3b9 != null) {
                            int count = c3b9.getCount();
                            synchronized (c3b9) {
                                int i = 0;
                                while (true) {
                                    if (i >= count) {
                                        z = false;
                                        break;
                                    }
                                    Map map3 = c3b9.A06;
                                    AbstractC53492h0 abstractC53492h0 = (AbstractC53492h0) map3.get(Integer.valueOf(i));
                                    if (abstractC53492h0 != null && abstractC53492h0.A00 != null && abstractC53492h0.A00.A0n.equals(anonymousClass092.A0n)) {
                                        map3.remove(Integer.valueOf(i));
                                        c3b9.A00++;
                                        z = true;
                                        while (i < count - 1) {
                                            Integer valueOf = Integer.valueOf(i);
                                            i++;
                                            map3.put(valueOf, map3.remove(Integer.valueOf(i)));
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                            if (z) {
                                ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A00--;
                                ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
                                z2 = true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        storageUsageMediaGalleryFragment.A16(false, false);
                        break;
                    }
                }
            }
            if (z2) {
                StorageUsageMediaGalleryFragment.this.A10();
            }
        }
    };

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        Bundle bundle2 = ((C0BA) this).A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("storage_media_gallery_fragment_gallery_type", 0);
            this.A00 = i;
            if (i == 0) {
                AbstractC005302j A02 = AbstractC005302j.A02(bundle2.getString("storage_media_gallery_fragment_jid"));
                if (A02 == null) {
                    throw null;
                }
                this.A09 = A02;
            } else {
                C0AT.A0D(((C0BA) this).A0A, R.id.no_media_text).setVisibility(8);
            }
        }
        C0AT.A0f(((MediaGalleryFragmentBase) this).A08, true);
        C0AT.A0f(A05().findViewById(R.id.no_media), true);
        A16(false, false);
        this.A07.A01(this.A0D);
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.storage_usage_gallery, viewGroup, false);
    }

    @Override // com.whatsapp.gallery.MediaGalleryFragmentBase, X.C0BA
    public void A0q() {
        super.A0q();
        this.A07.A00(this.A0D);
    }
}
