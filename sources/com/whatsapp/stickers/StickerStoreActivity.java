package com.whatsapp.stickers;

import X.AbstractC08940cM;
import X.ActivityC02290Ap;
import X.C002301c;
import X.C02180Ae;
import X.C08930cL;
import X.C0AT;
import X.C0BA;
import X.C0We;
import X.C0Z8;
import X.C1BQ;
import X.C2QB;
import X.C32811em;
import X.C53872he;
import X.InterfaceC08320bF;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreActivity;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;

/* loaded from: classes2.dex */
public class StickerStoreActivity extends C2QB {
    public View A00;
    public ViewPager A01;
    public BottomSheetBehavior A02;
    public TabLayout A03;
    public C002301c A04;
    public C53872he A05;
    public StickerStoreFeaturedTabFragment A06;
    public StickerStoreMyTabFragment A07;

    public final void A1P(C0BA c0ba, int i) {
        this.A05.A00.add(c0ba);
        TabLayout tabLayout = this.A03;
        C1BQ A03 = tabLayout.A03();
        A03.A01(i);
        tabLayout.A0E(A03, tabLayout.A0d.isEmpty());
    }

    public /* synthetic */ void lambda$onCreate$2514$StickerStoreActivity(View view) {
        finish();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 1 && this.A05 != null) {
            this.A01.postDelayed(new RunnableEBaseShape6S0100000_I0_6(this, 46), 300L);
        }
    }

    @Override // X.C2QB, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.sticker_store);
        View view = ((ActivityC02290Ap) this).A04;
        this.A00 = view;
        View findViewById = view.findViewById(R.id.store_container);
        this.A03 = (TabLayout) this.A00.findViewById(R.id.sticker_store_tabs);
        this.A01 = (ViewPager) this.A00.findViewById(R.id.sticker_store_pager);
        this.A05 = new C53872he(A0N());
        this.A06 = new StickerStoreFeaturedTabFragment();
        this.A07 = new StickerStoreMyTabFragment();
        this.A06.A02 = bundle == null;
        C0AT.A0W(this.A03, 0);
        if (this.A04.A0M()) {
            A1P(this.A06, R.string.sticker_store_featured_tab_title);
            A1P(this.A07, R.string.sticker_store_my_tab_title);
        } else {
            A1P(this.A07, R.string.sticker_store_my_tab_title);
            A1P(this.A06, R.string.sticker_store_featured_tab_title);
        }
        this.A01.setAdapter(this.A05);
        this.A01.A0F(new C32811em(this.A03));
        this.A01.A0F(new C0Z8() { // from class: X.3qv
            @Override // X.C0Z8
            public void AMg(int i) {
            }

            @Override // X.C0Z8
            public void AMh(int i, float f, int i2) {
            }

            {
                StickerStoreActivity.this = this;
            }

            @Override // X.C0Z8
            public void AMi(int i) {
                int i2 = 0;
                while (true) {
                    StickerStoreActivity stickerStoreActivity = StickerStoreActivity.this;
                    if (i2 < stickerStoreActivity.A05.A0B()) {
                        StickerStoreTabFragment stickerStoreTabFragment = (StickerStoreTabFragment) ((C0BA) stickerStoreActivity.A05.A00.get(i2));
                        boolean z = i == i2;
                        RecyclerView recyclerView = stickerStoreTabFragment.A04;
                        if (recyclerView != null) {
                            recyclerView.setNestedScrollingEnabled(z);
                        }
                        i2++;
                    } else {
                        stickerStoreActivity.A01.requestLayout();
                        return;
                    }
                }
            }
        });
        this.A01.A0B(!this.A04.A0M(), false);
        TabLayout tabLayout = this.A03;
        InterfaceC08320bF interfaceC08320bF = new InterfaceC08320bF() { // from class: X.3qw
            {
                StickerStoreActivity.this = this;
            }

            @Override // X.InterfaceC08320bF
            public void APY(C1BQ c1bq) {
                StickerStoreActivity.this.A01.setCurrentItem(c1bq.A00);
            }
        };
        if (!tabLayout.A0c.contains(interfaceC08320bF)) {
            tabLayout.A0c.add(interfaceC08320bF);
        }
        Toolbar toolbar = (Toolbar) findViewById.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(new C0We(this.A04, C02180Ae.A0O(this, R.drawable.ic_back_teal, R.color.tealActionBarItemDrawableTint)));
        toolbar.setNavigationContentDescription(R.string.sticker_store_back_button_content_description);
        toolbar.setTitle(R.string.sticker_store_title);
        toolbar.setNavigationOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 26));
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior() { // from class: com.whatsapp.stickers.StickerStoreActivity.3
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC08910cJ
            public boolean A08(CoordinatorLayout coordinatorLayout, View view2, int i) {
                super.A08(coordinatorLayout, view2, i);
                return true;
            }
        };
        this.A02 = bottomSheetBehavior;
        bottomSheetBehavior.A0J = true;
        bottomSheetBehavior.A0O(4);
        this.A02.A0N = true;
        BottomSheetBehavior bottomSheetBehavior2 = this.A02;
        ((C08930cL) findViewById.getLayoutParams()).A00(bottomSheetBehavior2);
        bottomSheetBehavior2.A0E = new AbstractC08940cM() { // from class: X.3qx
            @Override // X.AbstractC08940cM
            public void A00(View view2, float f) {
            }

            {
                StickerStoreActivity.this = this;
            }

            @Override // X.AbstractC08940cM
            public void A01(View view2, int i) {
                StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment;
                if (i == 5) {
                    StickerStoreActivity.this.finish();
                } else if (i != 3 || (stickerStoreFeaturedTabFragment = StickerStoreActivity.this.A06) == null || !stickerStoreFeaturedTabFragment.A02) {
                } else {
                    stickerStoreFeaturedTabFragment.A11();
                }
            }
        };
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A02;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0B != 4) {
            return;
        }
        this.A00.post(new RunnableEBaseShape6S0100000_I0_6(this, 45));
    }
}
