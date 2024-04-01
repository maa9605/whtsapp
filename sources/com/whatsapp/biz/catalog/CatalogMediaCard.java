package com.whatsapp.biz.catalog;

import X.AnonymousClass272;
import X.C000200d;
import X.C018308n;
import X.C018508q;
import X.C02160Ac;
import X.C02L;
import X.C05210Nt;
import X.C06960Vv;
import X.C06K;
import X.C2L3;
import X.C2MD;
import X.C2MP;
import X.C2MT;
import X.C2N3;
import X.C2N4;
import X.C2VK;
import X.C3ZZ;
import X.C468628o;
import X.C49462Ko;
import X.InterfaceC002901k;
import X.InterfaceC04750Lr;
import X.InterfaceC72193Za;
import X.InterfaceC72203Zb;
import X.InterfaceC72213Zc;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CatalogMediaCard extends C2VK {
    public int A00;
    public C018308n A01;
    public C018508q A02;
    public C02L A03;
    public C06K A04;
    public C49462Ko A05;
    public C2MT A06;
    public C2N3 A07;
    public C2L3 A08;
    public C2MP A09;
    public AnonymousClass272 A0A;
    public C05210Nt A0B;
    public UserJid A0C;
    public C2MD A0D;
    public MediaCard A0E;
    public InterfaceC002901k A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public final InterfaceC04750Lr A0J;

    public CatalogMediaCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A0J = new InterfaceC04750Lr() { // from class: X.33D
            {
                CatalogMediaCard.this = this;
            }

            @Override // X.InterfaceC04750Lr
            public void AKF(UserJid userJid, int i) {
                CatalogMediaCard catalogMediaCard = CatalogMediaCard.this;
                if (AnonymousClass024.A0l(catalogMediaCard.A0C, userJid) && !catalogMediaCard.A0A.A0B(catalogMediaCard.A0C)) {
                    C000200d.A0r("CatalogMediaCard/requestCatalogProductsFromBeginning/FetchFailed/Error: ", i);
                    if (i == 406) {
                        catalogMediaCard.A0E.setError(catalogMediaCard.getContext().getString(R.string.catalog_hidden));
                    } else if (i != 404) {
                        if (i == -1) {
                            catalogMediaCard.A0E.setError(catalogMediaCard.getContext().getString(R.string.catalog_error_retrieving_products));
                        } else {
                            catalogMediaCard.A0E.setError(catalogMediaCard.getContext().getString(R.string.catalog_server_error_retrieving_products));
                        }
                    } else if (!catalogMediaCard.A0H) {
                        catalogMediaCard.A0E.setError(catalogMediaCard.getContext().getString(R.string.catalog_error_no_products));
                    } else {
                        MediaCard mediaCard = catalogMediaCard.A0E;
                        ViewOnClickCListenerShape8S0100000_I0_0 viewOnClickCListenerShape8S0100000_I0_0 = new ViewOnClickCListenerShape8S0100000_I0_0(catalogMediaCard, 5);
                        mediaCard.A04.removeAllViews();
                        mediaCard.A02(4, viewOnClickCListenerShape8S0100000_I0_0);
                    }
                }
            }

            @Override // X.InterfaceC04750Lr
            public void AKG(UserJid userJid) {
                CatalogMediaCard catalogMediaCard = CatalogMediaCard.this;
                if (AnonymousClass024.A0l(catalogMediaCard.A0C, userJid)) {
                    catalogMediaCard.A01(userJid);
                }
            }
        };
        MediaCard mediaCard = (MediaCard) LayoutInflater.from(getContext()).inflate(R.layout.business_product_catalog_card, (ViewGroup) this, true).findViewById(R.id.product_catalog_media_card_view);
        this.A0E = mediaCard;
        mediaCard.setTopShadowVisibility(0);
        this.A0E.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.A07 = new C2N3(this.A06);
        this.A0E.A02(5, null);
        this.A09.A01(this.A0J);
    }

    public final void A00() {
        Activity A00 = C018308n.A00(getContext());
        if (A00 instanceof ProductDetailActivity) {
            C2N4 c2n4 = (C2N4) A00;
            c2n4.A0T.A01 = true;
            CatalogMediaCard catalogMediaCard = c2n4.A0O;
            if (catalogMediaCard != null) {
                catalogMediaCard.setVisibility(8);
            }
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = c2n4.A0Q;
            if (ellipsizedTextEmojiLabel != null) {
                ellipsizedTextEmojiLabel.A00 = Integer.MAX_VALUE;
            }
        }
    }

    public void A01(final UserJid userJid) {
        int i;
        ArrayList arrayList = new ArrayList();
        AnonymousClass272 anonymousClass272 = this.A0A;
        synchronized (anonymousClass272) {
            List<C468628o> A08 = anonymousClass272.A08(userJid);
            i = 7;
            if (A08 != null) {
                for (C468628o c468628o : A08) {
                    i = (i * 31) + c468628o.hashCode();
                }
            }
        }
        if (i == this.A00) {
            return;
        }
        this.A00 = i;
        if (!this.A0A.A0B(userJid)) {
            C05210Nt c05210Nt = this.A0B;
            if (c05210Nt != null && c05210Nt.A09) {
                c05210Nt.A09 = false;
                this.A0F.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 32));
            }
            Log.w("CatalogMediaCard/onFetchCatalogSuccess/Error: no products");
            if (!this.A0H) {
                this.A0E.setError(getContext().getString(R.string.catalog_error_no_products));
            }
            A00();
        } else {
            C05210Nt c05210Nt2 = this.A0B;
            if (c05210Nt2 != null && !c05210Nt2.A09) {
                c05210Nt2.A09 = true;
                this.A0F.AS1(new RunnableEBaseShape0S0100000_I0_0(this, 33));
            }
            String string = getContext().getString(R.string.business_product_catalog_image_description);
            final List A082 = this.A0A.A08(userJid);
            int i2 = 0;
            for (int i3 = 0; i3 < A082.size() && i2 < 6; i3++) {
                final long j = i3;
                final C468628o c468628o2 = (C468628o) A082.get(i3);
                if (c468628o2.A00() && !c468628o2.A09.equals(this.A0G)) {
                    i2++;
                    arrayList.add(new C3ZZ(null, null, string, C000200d.A0H("thumb-transition-", C06960Vv.A01(c468628o2.A09, 0)), new InterfaceC72203Zb() { // from class: X.32n
                        {
                            CatalogMediaCard.this = this;
                        }

                        @Override // X.InterfaceC72203Zb
                        public final void AIb(C3ZZ c3zz, View view) {
                            CatalogMediaCard catalogMediaCard = CatalogMediaCard.this;
                            C468628o c468628o3 = c468628o2;
                            UserJid userJid2 = userJid;
                            List list = A082;
                            long j2 = j;
                            if (view.getTag(R.id.loaded_image_url) != null) {
                                AnonymousClass272 anonymousClass2722 = catalogMediaCard.A0A;
                                String str = c468628o3.A09;
                                if (anonymousClass2722.A06(str) == null) {
                                    catalogMediaCard.A02.A07(R.string.catalog_error_missing_product, 0);
                                    Log.w("CatalogMediaCard/MediaThumbnailOnClick/product no longer exists");
                                    return;
                                }
                                Intent intent = new Intent(catalogMediaCard.getContext(), ProductDetailActivity.class);
                                intent.putExtra("is_from_product_detail_screen", C02180Ae.A0F(catalogMediaCard.getContext()) instanceof ProductDetailActivity);
                                C2N4.A00(userJid2, str, catalogMediaCard.A03.A0A(userJid2), Integer.valueOf(catalogMediaCard.A0E.getThumbnailPixelSize()), Integer.valueOf(catalogMediaCard.A0E.getThumbnailPixelSize()), catalogMediaCard.getContext(), intent, catalogMediaCard.A0G == null ? 4 : 5);
                                catalogMediaCard.A05.A02(2, 21, ((C468628o) list.get((int) j2)).A09, userJid2);
                            }
                        }
                    }, new InterfaceC72213Zc() { // from class: X.32k
                        {
                            CatalogMediaCard.this = this;
                        }

                        @Override // X.InterfaceC72213Zc
                        public final void AKJ(final C51282Vt c51282Vt, int i4) {
                            CatalogMediaCard catalogMediaCard = CatalogMediaCard.this;
                            C468628o c468628o3 = c468628o2;
                            if (!c468628o3.A01()) {
                                c51282Vt.setTag(c468628o3.A09);
                                catalogMediaCard.A07.A01((C2A2) c468628o3.A0D.get(0), 2, new InterfaceC49482Kq() { // from class: X.32o
                                    @Override // X.InterfaceC49482Kq
                                    public final void ALY(C40231ro c40231ro, Bitmap bitmap, boolean z) {
                                        C51282Vt c51282Vt2 = c51282Vt;
                                        c51282Vt2.setBackgroundColor(0);
                                        c51282Vt2.setImageBitmap(bitmap);
                                        c51282Vt2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    }
                                }, new InterfaceC56142mm() { // from class: X.32m
                                    @Override // X.InterfaceC56142mm
                                    public final void AHM(C40231ro c40231ro) {
                                        C51282Vt c51282Vt2 = c51282Vt;
                                        c51282Vt2.setBackgroundResource(R.color.light_gray);
                                        c51282Vt2.setImageResource(R.drawable.ic_product_image_loading);
                                        c51282Vt2.setScaleType(ImageView.ScaleType.CENTER);
                                    }
                                }, c51282Vt);
                                return;
                            }
                            c51282Vt.setBackgroundResource(R.color.light_gray);
                            c51282Vt.setImageResource(R.drawable.ic_product_image_loading);
                            c51282Vt.setScaleType(ImageView.ScaleType.CENTER);
                        }
                    }));
                }
            }
            if (i2 == 0) {
                A00();
            }
            this.A0E.A03(arrayList, 5);
        }
        C05210Nt c05210Nt3 = this.A0B;
        if (c05210Nt3 == null || (!c05210Nt3.A09 && !this.A0A.A0B(userJid))) {
            if (!this.A0H) {
                setVisibility(8);
            } else {
                MediaCard mediaCard = this.A0E;
                ViewOnClickCListenerShape8S0100000_I0_0 viewOnClickCListenerShape8S0100000_I0_0 = new ViewOnClickCListenerShape8S0100000_I0_0(this, 5);
                mediaCard.A04.removeAllViews();
                mediaCard.A02(4, viewOnClickCListenerShape8S0100000_I0_0);
            }
        } else {
            setVisibility(0);
        }
        if (this.A0I) {
            return;
        }
        this.A0I = true;
        this.A05.A02(1, 20, null, userJid);
    }

    public String getMediaCardViewErrorText() {
        return this.A0E.getError();
    }

    public void setup(final UserJid userJid, boolean z, String str, final boolean z2, C05210Nt c05210Nt) {
        boolean z3;
        this.A0C = userJid;
        this.A0G = str;
        this.A0H = z2;
        if (str != null) {
            this.A0E.setTitle(getContext().getString(R.string.carousel_from_product_message_title));
            this.A0E.setTitleTextColor(C02160Ac.A00(getContext(), R.color.catalog_detail_description_color));
            this.A0E.setLeftPadding(getContext().getResources().getDimensionPixelSize(R.dimen.product_detail_container_padding_horizontal));
        }
        if (z2) {
            this.A0E.setMediaInfo(getContext().getString(R.string.business_product_catalog_manage));
        }
        this.A0B = c05210Nt;
        if (z) {
            AnonymousClass272 anonymousClass272 = this.A0A;
            synchronized (anonymousClass272) {
                z3 = anonymousClass272.A00.get(userJid) != null;
            }
            if (z3) {
                A01(userJid);
                this.A0E.setSeeMoreClickListener(new InterfaceC72193Za() { // from class: X.32l
                    {
                        CatalogMediaCard.this = this;
                    }

                    @Override // X.InterfaceC72193Za
                    public final void AIa() {
                        CatalogMediaCard catalogMediaCard = CatalogMediaCard.this;
                        boolean z4 = z2;
                        UserJid userJid2 = userJid;
                        if (!z4) {
                            CatalogListActivity.A00(catalogMediaCard.A01, userJid2, catalogMediaCard.getContext());
                            catalogMediaCard.A05.A02(3, 22, null, userJid2);
                        }
                    }
                });
            }
        }
        int thumbnailPixelSize = this.A0E.getThumbnailPixelSize();
        this.A06.A01 = thumbnailPixelSize;
        C05210Nt c05210Nt2 = this.A0B;
        if ((c05210Nt2 == null || !c05210Nt2.A09) && !z2) {
            setVisibility(8);
        }
        this.A08.A03(userJid, thumbnailPixelSize);
        this.A0E.setSeeMoreClickListener(new InterfaceC72193Za() { // from class: X.32l
            {
                CatalogMediaCard.this = this;
            }

            @Override // X.InterfaceC72193Za
            public final void AIa() {
                CatalogMediaCard catalogMediaCard = CatalogMediaCard.this;
                boolean z4 = z2;
                UserJid userJid2 = userJid;
                if (!z4) {
                    CatalogListActivity.A00(catalogMediaCard.A01, userJid2, catalogMediaCard.getContext());
                    catalogMediaCard.A05.A02(3, 22, null, userJid2);
                }
            }
        });
    }
}
