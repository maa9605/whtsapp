package com.whatsapp.gallery;

import X.AbstractC04890Mh;
import X.AbstractC53492h0;
import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.AnonymousClass088;
import X.AnonymousClass094;
import X.AnonymousClass097;
import X.AnonymousClass317;
import X.C001200o;
import X.C002301c;
import X.C003301p;
import X.C011605s;
import X.C018508q;
import X.C02160Ac;
import X.C02E;
import X.C02F;
import X.C09E;
import X.C0AT;
import X.C0HS;
import X.C0We;
import X.C1M7;
import X.C2HC;
import X.C2JE;
import X.C3B1;
import X.C3B2;
import X.C3B5;
import X.C3B9;
import X.C40841sx;
import X.C460324r;
import X.C51682Xk;
import X.C52132a7;
import X.C66303An;
import X.C66313Ao;
import X.C66423Az;
import X.InterfaceC002901k;
import X.InterfaceC04690Ll;
import X.InterfaceC52102a4;
import X.InterfaceC52142a8;
import X.InterfaceC60932vK;
import X.InterfaceC60942vL;
import android.database.ContentObserver;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DisplayContext;
import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.camera.CameraMediaPickerFragment;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.gallerypicker.RecyclerFastScroller;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.text.Format;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class MediaGalleryFragmentBase extends Hilt_MediaGalleryFragmentBase {
    public static final Bitmap A0Q;
    public static final InterfaceC60942vL A0R;
    public int A00;
    public int A01;
    public int A03;
    public Drawable A04;
    public View A05;
    public AbstractC04890Mh A06;
    public C018508q A07;
    public StickyHeadersRecyclerView A08;
    public C011605s A09;
    public C02E A0A;
    public C001200o A0B;
    public C02F A0C;
    public C002301c A0D;
    public InterfaceC52142a8 A0E;
    public C66423Az A0F;
    public C3B1 A0G;
    public C3B2 A0H;
    public C52132a7 A0I;
    public RecyclerFastScroller A0J;
    public InterfaceC002901k A0K;
    public boolean A0L;
    public boolean A0M;
    public final ContentObserver A0N;
    public final Handler A0O;
    public int A02 = 0;
    public final ArrayList A0P = new ArrayList();

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            A0R = new InterfaceC60942vL() { // from class: X.3B7
                @Override // X.InterfaceC60942vL
                public Format AAH(C002301c c002301c) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL yyyy", c002301c.A0I());
                    simpleDateFormat.setContext(DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE);
                    return simpleDateFormat;
                }
            };
        } else {
            A0R = new InterfaceC60942vL() { // from class: X.3B8
                @Override // X.InterfaceC60942vL
                public Format AAH(C002301c c002301c) {
                    try {
                        return new java.text.SimpleDateFormat("LLLL yyyy", c002301c.A0I());
                    } catch (IllegalArgumentException unused) {
                        return new java.text.SimpleDateFormat("MMMM yyyy", c002301c.A0I());
                    }
                }
            };
        }
        A0Q = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    public MediaGalleryFragmentBase() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A0O = handler;
        this.A0N = new ContentObserver(handler) { // from class: X.2vI
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return true;
            }

            {
                MediaGalleryFragmentBase.this = this;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                C000200d.A1C("mediagalleryfragmentbase/onchange ", z);
                MediaGalleryFragmentBase mediaGalleryFragmentBase = MediaGalleryFragmentBase.this;
                InterfaceC52142a8 interfaceC52142a8 = mediaGalleryFragmentBase.A0E;
                if (interfaceC52142a8 != null) {
                    if (!z) {
                        interfaceC52142a8.ARb();
                        mediaGalleryFragmentBase.A12();
                    }
                    mediaGalleryFragmentBase.A00 = mediaGalleryFragmentBase.A0E.getCount();
                }
                mediaGalleryFragmentBase.A06.A01.A00();
            }
        };
    }

    @Override // X.C0BA
    public void A0j(Bundle bundle) {
        this.A0U = true;
        int i = 0;
        if (bundle == null) {
            Bundle bundle2 = super.A06;
            if (bundle2 != null) {
                this.A02 = bundle2.getInt("sort_type", 0);
            }
        } else {
            this.A02 = bundle.getInt("sort_type", 0);
        }
        int A00 = C02160Ac.A00(A0a(), R.color.gallery_cell);
        this.A01 = A00;
        this.A04 = new ColorDrawable(A00);
        this.A03 = A01().getDimensionPixelSize(R.dimen.gallery_picker_item_thumb_size);
        this.A0M = this instanceof StorageUsageMediaGalleryFragment;
        View A05 = A05();
        this.A05 = A05.findViewById(R.id.no_media);
        this.A08 = (StickyHeadersRecyclerView) A05.findViewById(R.id.grid);
        C3B5 c3b5 = new C3B5(this);
        this.A06 = c3b5;
        this.A08.setAdapter(c3b5);
        RecyclerFastScroller recyclerFastScroller = (RecyclerFastScroller) C0AT.A0D(A05, R.id.scroller);
        this.A0J = recyclerFastScroller;
        recyclerFastScroller.A0A = this.A0D.A0N();
        this.A0J.setRecyclerView(this.A08);
        ImageView imageView = new ImageView(A0a());
        imageView.setImageDrawable(new C0We(this.A0D, C02160Ac.A03(A0a(), R.drawable.fastscroll_media_thumb)));
        this.A0J.setThumbView(imageView);
        View inflate = A09().getLayoutInflater().inflate(R.layout.media_fast_scroll_bubble, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fast_scroll_date);
        C003301p.A06(textView);
        Format AAH = A0R.AAH(this.A0D);
        RecyclerFastScroller recyclerFastScroller2 = this.A0J;
        recyclerFastScroller2.A08 = new C66303An(this, textView, AAH);
        recyclerFastScroller2.A02 = inflate;
        inflate.setVisibility(4);
        recyclerFastScroller2.addView(recyclerFastScroller2.A02, -2, -2);
        RecyclerFastScroller recyclerFastScroller3 = this.A0J;
        int i2 = this.A02;
        if (i2 != 0 && i2 != 1) {
            i = 8;
        }
        recyclerFastScroller3.setVisibility(i);
        this.A0I = new C52132a7(this.A09, A09().getContentResolver(), new Handler(Looper.getMainLooper()));
    }

    @Override // X.C0BA
    public void A0k(Bundle bundle) {
        bundle.putInt("sort_type", this.A02);
    }

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.image_gallery, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0q() {
        Log.i("mediagalleryfragmentbase/destroy");
        this.A0U = true;
        A11();
        this.A0L = false;
        C52132a7 c52132a7 = this.A0I;
        if (c52132a7 != null) {
            c52132a7.A00();
            this.A0I = null;
        }
        InterfaceC52142a8 interfaceC52142a8 = this.A0E;
        if (interfaceC52142a8 != null) {
            interfaceC52142a8.unregisterContentObserver(this.A0N);
            this.A0E.close();
            this.A0E = null;
        }
        this.A00 = 0;
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        A10();
    }

    public InterfaceC60932vK A0y() {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            final StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
            return new InterfaceC60932vK() { // from class: X.3rd
                @Override // X.InterfaceC60932vK
                public final InterfaceC52142a8 A6s(boolean z) {
                    StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment2 = storageUsageMediaGalleryFragment;
                    C86543xj c86543xj = new C86543xj(storageUsageMediaGalleryFragment2.A05, storageUsageMediaGalleryFragment2.A06, storageUsageMediaGalleryFragment2.A0B, storageUsageMediaGalleryFragment2.A09, ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment2).A02, storageUsageMediaGalleryFragment2.A00);
                    if (((C3B9) c86543xj).A01 == null) {
                        ((C3B9) c86543xj).A01 = new C40481sK(c86543xj.A02, c86543xj.A04, c86543xj.A00(), false);
                    }
                    return c86543xj;
                }
            };
        } else if (!(this instanceof MediaPickerFragment)) {
            if (!(this instanceof MediaGalleryFragment)) {
                CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) this;
                return new InterfaceC60932vK(cameraMediaPickerFragment.A07, cameraMediaPickerFragment.A04, cameraMediaPickerFragment.A06, cameraMediaPickerFragment.A0A, cameraMediaPickerFragment.A08, cameraMediaPickerFragment.A0B, cameraMediaPickerFragment.A0E) { // from class: X.350
                    public final AbstractC000600i A00;
                    public final C01B A01;
                    public final C001200o A02;
                    public final C02F A03;
                    public final C2AQ A04;
                    public final C02C A05;
                    public final List A06;

                    {
                        this.A02 = r1;
                        this.A00 = r2;
                        this.A01 = r3;
                        this.A04 = r4;
                        this.A03 = r5;
                        this.A05 = r6;
                        this.A06 = r7;
                    }

                    @Override // X.InterfaceC60932vK
                    public InterfaceC52142a8 A6s(boolean z) {
                        C61112vc c61112vc;
                        if (!z) {
                            c61112vc = new C61112vc();
                            c61112vc.A04 = true;
                        } else {
                            c61112vc = new C61112vc();
                            c61112vc.A01 = 2;
                            c61112vc.A00 = 7;
                            c61112vc.A02 = 2;
                            c61112vc.A03 = null;
                        }
                        return new InterfaceC52142a8(C61122vd.A00(this.A02, this.A00, this.A01, this.A04, this.A03, this.A05, c61112vc), this.A06) { // from class: X.34z
                            public final InterfaceC52142a8 A00;
                            public final List A01;

                            {
                                this.A00 = r1;
                                this.A01 = r2;
                            }

                            @Override // X.InterfaceC52142a8
                            public HashMap A8a() {
                                return this.A00.A8a();
                            }

                            @Override // X.InterfaceC52142a8
                            public InterfaceC52102a4 AB8(int i) {
                                List list = this.A01;
                                if (i < list.size()) {
                                    return (InterfaceC52102a4) list.get(i);
                                }
                                return this.A00.AB8(i - list.size());
                            }

                            @Override // X.InterfaceC52142a8
                            public void ARb() {
                                this.A00.ARb();
                            }

                            @Override // X.InterfaceC52142a8
                            public void close() {
                                this.A00.close();
                            }

                            @Override // X.InterfaceC52142a8
                            public int getCount() {
                                return this.A01.size() + this.A00.getCount();
                            }

                            @Override // X.InterfaceC52142a8
                            public boolean isEmpty() {
                                return this.A00.isEmpty() && this.A01.isEmpty();
                            }

                            @Override // X.InterfaceC52142a8
                            public void registerContentObserver(ContentObserver contentObserver) {
                                this.A00.registerContentObserver(contentObserver);
                            }

                            @Override // X.InterfaceC52142a8
                            public void unregisterContentObserver(ContentObserver contentObserver) {
                                this.A00.unregisterContentObserver(contentObserver);
                            }
                        };
                    }
                };
            }
            final MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this;
            return new InterfaceC60932vK() { // from class: X.3Am
                @Override // X.InterfaceC60932vK
                public final InterfaceC52142a8 A6s(boolean z) {
                    MediaGalleryFragment mediaGalleryFragment2 = mediaGalleryFragment;
                    C3B9 c3b9 = new C3B9(mediaGalleryFragment2.A00, mediaGalleryFragment2.A01, mediaGalleryFragment2.A04, mediaGalleryFragment2.A03);
                    if (c3b9.A01 == null) {
                        c3b9.A01 = new C40481sK(c3b9.A02, c3b9.A04, c3b9.A00(), false);
                    }
                    return c3b9;
                }
            };
        } else {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            ActivityC02330At A09 = mediaPickerFragment.A09();
            if (A09 == null) {
                return null;
            }
            return new InterfaceC60932vK(mediaPickerFragment.A09, mediaPickerFragment.A05, mediaPickerFragment.A07, mediaPickerFragment.A0D, mediaPickerFragment.A0A, mediaPickerFragment.A0F, A09.getIntent().getData(), mediaPickerFragment.A00) { // from class: X.3BQ
                public final int A00;
                public final Uri A01;
                public final AbstractC000600i A02;
                public final C01B A03;
                public final C001200o A04;
                public final C02F A05;
                public final C2AQ A06;
                public final C02C A07;

                {
                    this.A04 = r1;
                    this.A02 = r2;
                    this.A03 = r3;
                    this.A06 = r4;
                    this.A05 = r5;
                    this.A07 = r6;
                    this.A01 = r7;
                    this.A00 = r8;
                }

                @Override // X.InterfaceC60932vK
                public InterfaceC52142a8 A6s(boolean z) {
                    C61112vc c61112vc;
                    Uri uri = this.A01;
                    if ((uri != null ? uri.toString() : "").startsWith(C3KG.A00.toString())) {
                        return new C3KG(this.A04, this.A03, this.A06, this.A07, uri != null ? uri.getQueryParameter("bucketId") : null, this.A00);
                    }
                    if (!z) {
                        c61112vc = new C61112vc();
                        c61112vc.A04 = true;
                    } else {
                        int i = this.A00;
                        String queryParameter = uri != null ? uri.getQueryParameter("bucketId") : null;
                        c61112vc = new C61112vc();
                        c61112vc.A01 = 2;
                        c61112vc.A00 = i;
                        c61112vc.A02 = 2;
                        c61112vc.A03 = queryParameter;
                    }
                    return C61122vd.A00(this.A04, this.A02, this.A03, this.A06, this.A05, this.A07, c61112vc);
                }
            };
        }
    }

    public C51682Xk A0z(Uri uri) {
        if (uri != null) {
            int childCount = this.A08.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.A08.getChildAt(i);
                if (childAt instanceof C51682Xk) {
                    C51682Xk c51682Xk = (C51682Xk) childAt;
                    if (uri.equals(c51682Xk.getUri())) {
                        return c51682Xk;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public void A10() {
        if (this.A0E != null) {
            if (this.A0C.A06() && this.A0E.getCount() > 0) {
                this.A05.setVisibility(8);
                this.A08.setVisibility(0);
                return;
            }
            this.A05.setVisibility(0);
            this.A08.setVisibility(8);
        }
    }

    public final void A11() {
        C3B1 c3b1 = this.A0G;
        if (c3b1 != null) {
            c3b1.A05(true);
            this.A0G = null;
        }
        C3B2 c3b2 = this.A0H;
        if (c3b2 != null) {
            c3b2.A05(true);
            this.A0H = null;
        }
        C66423Az c66423Az = this.A0F;
        if (c66423Az != null) {
            c66423Az.A05(true);
            this.A0F = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.3Az] */
    public final void A12() {
        if (!this.A0M || this.A0E == null) {
            return;
        }
        C66423Az c66423Az = this.A0F;
        if (c66423Az != null) {
            c66423Az.A05(true);
        }
        this.A0F = new C0HS(this.A0E, new C66313Ao(this)) { // from class: X.3Az
            public final C66313Ao A00;
            public final InterfaceC52142a8 A01;

            {
                this.A01 = r1;
                this.A00 = r2;
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                int i = 0;
                while (true) {
                    InterfaceC52142a8 interfaceC52142a8 = this.A01;
                    if (i >= interfaceC52142a8.getCount()) {
                        return null;
                    }
                    interfaceC52142a8.AB8(i);
                    i++;
                }
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00.A00;
                mediaGalleryFragmentBase.A0L = true;
                InterfaceC52142a8 interfaceC52142a8 = mediaGalleryFragmentBase.A0E;
                if (interfaceC52142a8 != null) {
                    mediaGalleryFragmentBase.A00 = interfaceC52142a8.getCount();
                }
                mediaGalleryFragmentBase.A06.A01.A00();
            }
        };
        this.A0L = false;
        this.A06.A01.A00();
        this.A0K.ARy(this.A0F, new Void[0]);
    }

    public void A13(int i) {
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            AnonymousClass088.A1C(A09, this.A0A, this.A0D.A0A(R.plurals.n_items_selected, i, Integer.valueOf(i)));
        }
    }

    public void A14(InterfaceC52102a4 interfaceC52102a4, C51682Xk c51682Xk) {
        if (!(this instanceof StorageUsageMediaGalleryFragment)) {
            if (this instanceof MediaPickerFragment) {
                ((MediaPickerFragment) this).A19(interfaceC52102a4);
                return;
            } else if (!(this instanceof MediaGalleryFragment)) {
                ((CameraMediaPickerFragment) this).A1C(interfaceC52102a4);
                return;
            } else {
                MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this;
                AnonymousClass097 anonymousClass097 = ((AbstractC53492h0) interfaceC52102a4).A00;
                if (mediaGalleryFragment.A17()) {
                    c51682Xk.setChecked(((InterfaceC04690Ll) mediaGalleryFragment.A09()).AVe(anonymousClass097));
                    return;
                }
                AnonymousClass317 A09 = C40841sx.A09(mediaGalleryFragment.A0A());
                A09.A05 = true;
                A09.A03 = mediaGalleryFragment.A03;
                A09.A04 = anonymousClass097.A0n;
                A09.A01 = 2;
                A09.A02 = c51682Xk;
                C2HC.A06(mediaGalleryFragment.A00(), new C1M7(mediaGalleryFragment.A0A()), A09.A00(), c51682Xk, C2JE.A08(anonymousClass097));
                return;
            }
        }
        StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this;
        AnonymousClass097 anonymousClass0972 = ((AbstractC53492h0) interfaceC52102a4).A00;
        if (storageUsageMediaGalleryFragment.A17()) {
            c51682Xk.setChecked(((InterfaceC04690Ll) storageUsageMediaGalleryFragment.A0A()).AVe(anonymousClass0972));
            ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
        } else if (interfaceC52102a4.getType() == 4) {
            if (anonymousClass0972 instanceof C09E) {
                C460324r.A0A(storageUsageMediaGalleryFragment.A0A, storageUsageMediaGalleryFragment.A03, storageUsageMediaGalleryFragment.A02, storageUsageMediaGalleryFragment.A0C, storageUsageMediaGalleryFragment.A08, (ActivityC02290Ap) storageUsageMediaGalleryFragment.A09(), (C09E) anonymousClass0972, storageUsageMediaGalleryFragment.A01);
            }
        } else {
            AnonymousClass317 A092 = C40841sx.A09(storageUsageMediaGalleryFragment.A0A());
            A092.A07 = true;
            A092.A05 = true;
            AnonymousClass094 anonymousClass094 = anonymousClass0972.A0n;
            A092.A03 = anonymousClass094.A00;
            A092.A04 = anonymousClass094;
            A092.A01 = 2;
            A092.A00 = 2;
            A092.A02 = c51682Xk;
            C2HC.A06(storageUsageMediaGalleryFragment.A00(), new C1M7(storageUsageMediaGalleryFragment.A0A()), A092.A00(), c51682Xk, C2JE.A08(anonymousClass0972));
        }
    }

    public void A15(boolean z) {
        View view = super.A0A;
        if (view != null) {
            view.findViewById(R.id.progress_bar).setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3B1, X.0HS] */
    public void A16(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder("mediagalleryfragmentbase/rebake unmounted:");
        sb.append(z);
        sb.append(" scanning:");
        sb.append(z2);
        Log.i(sb.toString());
        A11();
        InterfaceC52142a8 interfaceC52142a8 = this.A0E;
        if (interfaceC52142a8 != null) {
            interfaceC52142a8.unregisterContentObserver(this.A0N);
            this.A0E.close();
            this.A0E = null;
        }
        A15(true);
        this.A00 = 0;
        this.A06.A01.A00();
        this.A0P.clear();
        InterfaceC60932vK A0y = A0y();
        if (A0y != null) {
            ?? r2 = new C0HS(this, A0y, z) { // from class: X.3B1
                public final InterfaceC60932vK A00;
                public final WeakReference A01;
                public final boolean A02;

                {
                    this.A01 = new WeakReference(this);
                    this.A00 = A0y;
                    this.A02 = z;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    InterfaceC52142a8 A6s = this.A00.A6s(!this.A02);
                    A6s.getCount();
                    return A6s;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    InterfaceC52142a8 interfaceC52142a82 = (InterfaceC52142a8) obj;
                    MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A01.get();
                    if (mediaGalleryFragmentBase != null) {
                        boolean z3 = this.A02;
                        ActivityC02330At A09 = mediaGalleryFragmentBase.A09();
                        if (A09 != null) {
                            mediaGalleryFragmentBase.A0E = interfaceC52142a82;
                            interfaceC52142a82.registerContentObserver(mediaGalleryFragmentBase.A0N);
                            mediaGalleryFragmentBase.A10();
                            Point point = new Point();
                            A09.getWindowManager().getDefaultDisplay().getSize(point);
                            int i = mediaGalleryFragmentBase.A02;
                            boolean z4 = true;
                            if (i != 0 && i != 1) {
                                z4 = false;
                            }
                            if (z4) {
                                int i2 = point.y;
                                int i3 = point.x;
                                int dimensionPixelSize = mediaGalleryFragmentBase.A01().getDimensionPixelSize(R.dimen.gallery_picker_item_thumb_size);
                                int i4 = ((i2 * i3) / (dimensionPixelSize * dimensionPixelSize)) + 1;
                                InterfaceC60932vK A0y2 = mediaGalleryFragmentBase.A0y();
                                if (A0y2 != null) {
                                    C3B2 c3b2 = new C3B2(mediaGalleryFragmentBase.A07, mediaGalleryFragmentBase.A0D, mediaGalleryFragmentBase, A0y2, i4, z3);
                                    mediaGalleryFragmentBase.A0H = c3b2;
                                    mediaGalleryFragmentBase.A0K.ARy(c3b2, new Void[0]);
                                }
                            } else {
                                mediaGalleryFragmentBase.A00 = interfaceC52142a82.getCount();
                                mediaGalleryFragmentBase.A06.A01.A00();
                                mediaGalleryFragmentBase.A15(false);
                            }
                            mediaGalleryFragmentBase.A12();
                        }
                    }
                }
            };
            this.A0G = r2;
            this.A0K.ARy(r2, new Void[0]);
        }
    }

    public boolean A17() {
        if (this instanceof StorageUsageMediaGalleryFragment) {
            return ((InterfaceC04690Ll) A0A()).AEZ();
        }
        if (this instanceof MediaPickerFragment) {
            return ((MediaPickerFragment) this).A04 != null;
        } else if (this instanceof MediaGalleryFragment) {
            return ((InterfaceC04690Ll) A09()).AEZ();
        } else {
            return ((CameraMediaPickerFragment) this).A02.getVisibility() == 0;
        }
    }

    public boolean A18(int i) {
        AnonymousClass097 anonymousClass097;
        if (this instanceof StorageUsageMediaGalleryFragment) {
            InterfaceC52142a8 interfaceC52142a8 = this.A0E;
            if (interfaceC52142a8 != null) {
                InterfaceC52102a4 AB8 = interfaceC52142a8.AB8(i);
                return (AB8 instanceof AbstractC53492h0) && (anonymousClass097 = ((AbstractC53492h0) AB8).A00) != null && ((InterfaceC04690Ll) A0A()).AFX(anonymousClass097);
            }
            return false;
        } else if (this instanceof MediaPickerFragment) {
            MediaPickerFragment mediaPickerFragment = (MediaPickerFragment) this;
            HashSet hashSet = mediaPickerFragment.A0J;
            InterfaceC52142a8 interfaceC52142a82 = ((MediaGalleryFragmentBase) mediaPickerFragment).A0E;
            if (interfaceC52142a82 != null) {
                return hashSet.contains(interfaceC52142a82.AB8(i).A88());
            }
            throw null;
        } else if (!(this instanceof MediaGalleryFragment)) {
            CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) this;
            return cameraMediaPickerFragment.A0D.contains(((MediaGalleryFragmentBase) cameraMediaPickerFragment).A0E.AB8(i).A88());
        } else {
            InterfaceC04690Ll interfaceC04690Ll = (InterfaceC04690Ll) A09();
            AbstractC53492h0 AB82 = ((C3B9) this.A0E).AB8(i);
            if (AB82 != null) {
                return interfaceC04690Ll.AFX(AB82.A00);
            }
            throw null;
        }
    }
}
