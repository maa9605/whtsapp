package com.whatsapp.biz.catalog;

import X.AbstractActivityC49812Mo;
import X.AbstractC04890Mh;
import X.AbstractC15200oF;
import X.AnonymousClass318;
import X.AnonymousClass333;
import X.C02160Ac;
import X.C0AT;
import X.C0U1;
import X.C0V5;
import X.C1M7;
import X.C2HC;
import X.C2MT;
import X.C2N3;
import X.C468628o;
import X.C49462Ko;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogImageListActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;

/* loaded from: classes2.dex */
public class CatalogImageListActivity extends AbstractActivityC49812Mo {
    public static final boolean A0A;
    public int A00;
    public int A01;
    public LinearLayoutManager A02;
    public RecyclerView A03;
    public C49462Ko A04;
    public AnonymousClass333 A05;
    public C2MT A06;
    public C2N3 A07;
    public C468628o A08;
    public UserJid A09;

    static {
        A0A = Build.VERSION.SDK_INT >= 21;
    }

    @Override // X.AbstractActivityC49812Mo, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = C2HC.A00;
        if (z) {
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
        super.onCreate(bundle);
        C1M7 c1m7 = new C1M7(this);
        if (z) {
            Window window2 = getWindow();
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
            ChangeBounds changeBounds = new ChangeBounds();
            ChangeBounds changeBounds2 = new ChangeBounds();
            changeBounds.excludeTarget(c1m7.A00(R.string.transition_clipper_top), true);
            changeBounds.excludeTarget(c1m7.A00(R.string.transition_clipper_bottom), true);
            changeBounds2.excludeTarget(c1m7.A00(R.string.transition_clipper_top), true);
            changeBounds2.excludeTarget(c1m7.A00(R.string.transition_clipper_bottom), true);
            AnonymousClass318 anonymousClass318 = new AnonymousClass318(c1m7, true);
            AnonymousClass318 anonymousClass3182 = new AnonymousClass318(c1m7, false);
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setDuration(220L);
            transitionSet.setInterpolator((TimeInterpolator) accelerateDecelerateInterpolator);
            transitionSet.addTransition(changeBounds);
            transitionSet.addTransition(anonymousClass318);
            TransitionSet transitionSet2 = new TransitionSet();
            transitionSet2.setInterpolator((TimeInterpolator) accelerateDecelerateInterpolator);
            transitionSet2.setDuration(240L);
            transitionSet2.addTransition(changeBounds2);
            transitionSet2.addTransition(anonymousClass3182);
            window2.setSharedElementEnterTransition(transitionSet);
            window2.setSharedElementReturnTransition(transitionSet2);
            Fade fade = new Fade();
            Fade fade2 = new Fade();
            fade.excludeTarget(16908335, true);
            fade.excludeTarget(16908336, true);
            fade.excludeTarget(R.id.action_bar_container, true);
            fade.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade2.excludeTarget(16908335, true);
            fade2.excludeTarget(16908336, true);
            fade2.excludeTarget(R.id.action_bar_container, true);
            fade2.excludeTarget(R.id.catalog_image_list_toolbar, true);
            fade.setDuration(220L);
            fade2.setDuration(240L);
            window2.setEnterTransition(fade);
            window2.setReturnTransition(fade2);
            if (bundle == null) {
                A0S();
            }
        }
        if (A0A) {
            getWindow().getDecorView().setSystemUiVisibility(1792);
            getWindow().addFlags(134217728);
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            getWindow().setStatusBarColor(C02160Ac.A00(this, R.color.primary_dark));
        }
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("cached_jid"));
        if (nullable != null) {
            this.A09 = nullable;
            this.A08 = (C468628o) getIntent().getParcelableExtra("product");
            this.A00 = getIntent().getIntExtra("image_index", 0);
            setContentView(R.layout.business_product_catalog_image_list);
            this.A03 = (RecyclerView) findViewById(R.id.catalog_image_list);
            A0k((Toolbar) findViewById(R.id.catalog_image_list_toolbar));
            final C0U1 A0c = A0c();
            if (A0c != null) {
                A0c.A0L(true);
                A0c.A0H(this.A08.A0B);
                this.A07 = new C2N3(this.A06);
                AbstractC04890Mh abstractC04890Mh = new AbstractC04890Mh(new C1M7(this)) { // from class: X.332
                    public final C1M7 A00;

                    {
                        CatalogImageListActivity.this = this;
                        this.A00 = r2;
                    }

                    @Override // X.AbstractC04890Mh
                    public int A0C() {
                        return CatalogImageListActivity.this.A08.A0D.size();
                    }

                    @Override // X.AbstractC04890Mh
                    public C0TS A0E(ViewGroup viewGroup, int i) {
                        CatalogImageListActivity catalogImageListActivity = CatalogImageListActivity.this;
                        return new AnonymousClass334(catalogImageListActivity, this.A00, catalogImageListActivity.getLayoutInflater().inflate(R.layout.business_product_catalog_image_list_item, viewGroup, false));
                    }

                    @Override // X.AbstractC04890Mh
                    public void A0F(C0TS c0ts, int i) {
                        final AnonymousClass334 anonymousClass334 = (AnonymousClass334) c0ts;
                        anonymousClass334.A00 = i == CatalogImageListActivity.this.A00;
                        CatalogImageListActivity catalogImageListActivity = anonymousClass334.A03;
                        InterfaceC49482Kq interfaceC49482Kq = new InterfaceC49482Kq() { // from class: X.32u
                            @Override // X.InterfaceC49482Kq
                            public final void ALY(C40231ro c40231ro, Bitmap bitmap, boolean z2) {
                                AnonymousClass334 anonymousClass3342 = anonymousClass334;
                                ImageView imageView = anonymousClass3342.A01;
                                imageView.setImageBitmap(bitmap);
                                if (anonymousClass3342.A00) {
                                    anonymousClass3342.A00 = false;
                                    Activity A0G = C02180Ae.A0G(imageView.getContext(), ActivityC02320As.class);
                                    if (A0G != null) {
                                        imageView.post(new RunnableEBaseShape8S0100000_I1_0(A0G, 8));
                                    }
                                }
                            }
                        };
                        InterfaceC56142mm interfaceC56142mm = new InterfaceC56142mm() { // from class: X.32f
                            @Override // X.InterfaceC56142mm
                            public final void AHM(C40231ro c40231ro) {
                                anonymousClass334.A01.setImageResource(R.color.light_gray);
                            }
                        };
                        ImageView imageView = anonymousClass334.A01;
                        catalogImageListActivity.A07.A01((C2A2) catalogImageListActivity.A08.A0D.get(i), 1, interfaceC49482Kq, interfaceC56142mm, imageView);
                        imageView.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(anonymousClass334, i, 2));
                        C0AT.A0e(imageView, C000200d.A0H("thumb-transition-", C06960Vv.A01(catalogImageListActivity.A08.A09, i)));
                    }
                };
                this.A02 = new LinearLayoutManager(1);
                this.A03.setAdapter(abstractC04890Mh);
                this.A03.setLayoutManager(this.A02);
                AnonymousClass333 anonymousClass333 = new AnonymousClass333(this.A08.A0D.size(), getResources().getDimensionPixelSize(R.dimen.actionbar_height));
                this.A05 = anonymousClass333;
                this.A03.A0k(anonymousClass333);
                C0AT.A0d(this.A03, new C0V5() { // from class: X.32g
                    {
                        CatalogImageListActivity.this = this;
                    }

                    @Override // X.C0V5
                    public final C07110Wv AHK(View view, C07110Wv c07110Wv) {
                        CatalogImageListActivity catalogImageListActivity = CatalogImageListActivity.this;
                        catalogImageListActivity.A01 = catalogImageListActivity.getResources().getDimensionPixelSize(R.dimen.actionbar_height) + c07110Wv.A04();
                        int A01 = c07110Wv.A01();
                        AnonymousClass333 anonymousClass3332 = catalogImageListActivity.A05;
                        int i = catalogImageListActivity.A01;
                        anonymousClass3332.A01 = i;
                        anonymousClass3332.A00 = A01;
                        int i2 = catalogImageListActivity.A00;
                        if (i2 > 0) {
                            catalogImageListActivity.A02.A1Z(i2, i);
                        }
                        return c07110Wv;
                    }
                });
                final int A00 = C02160Ac.A00(this, R.color.primary);
                final int A002 = C02160Ac.A00(this, R.color.primary_dark);
                final int A003 = C02160Ac.A00(this, R.color.catalog_image_list_transparent_color);
                this.A03.A0m(new AbstractC15200oF() { // from class: X.331
                    {
                        CatalogImageListActivity.this = this;
                    }

                    @Override // X.AbstractC15200oF
                    public void A01(RecyclerView recyclerView, int i, int i2) {
                        CatalogImageListActivity catalogImageListActivity = CatalogImageListActivity.this;
                        float f = 1.0f;
                        if (catalogImageListActivity.A02.A1G() == 0) {
                            int top = catalogImageListActivity.A02.A0G(0).getTop();
                            int i3 = catalogImageListActivity.A05.A01;
                            f = Math.min(Math.max(0.0f, (i3 - top) / i3), 1.0f);
                        }
                        int i4 = A00;
                        int i5 = A003;
                        A0c.A0B(new ColorDrawable(C09990f7.A04(i4, i5, f)));
                        if (CatalogImageListActivity.A0A) {
                            catalogImageListActivity.getWindow().setStatusBarColor(C09990f7.A04(A002, i5, f));
                        }
                    }
                });
                if (bundle == null) {
                    this.A04.A02(8, 27, null, this.A09);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A07.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
