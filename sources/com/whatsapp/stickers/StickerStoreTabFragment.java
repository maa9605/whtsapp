package com.whatsapp.stickers;

import X.AbstractC14940np;
import X.AnonymousClass241;
import X.C002301c;
import X.C003301p;
import X.C018508q;
import X.C0SV;
import X.C13090ka;
import X.C14950nq;
import X.C14970ns;
import X.C1UC;
import X.C1UL;
import X.C25R;
import X.C25T;
import X.C2AS;
import X.C2Bk;
import X.C2C7;
import X.C42531vt;
import X.C43791xz;
import X.C82753r1;
import X.InterfaceC15190oE;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreTabFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class StickerStoreTabFragment extends Hilt_StickerStoreTabFragment {
    public int A00;
    public LayoutInflater A01;
    public View A02;
    public LinearLayoutManager A03;
    public RecyclerView A04;
    public C018508q A05;
    public C002301c A06;
    public C43791xz A07;
    public C2Bk A08;
    public C2AS A09;
    public C2C7 A0A;
    public List A0B;
    public final C25R A0D = new C25T(this);
    public final ViewTreeObserver.OnGlobalLayoutListener A0C = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.3Y9
        {
            StickerStoreTabFragment.this = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            StickerStoreTabFragment stickerStoreTabFragment = StickerStoreTabFragment.this;
            C0TS A0C = stickerStoreTabFragment.A04.A0C(stickerStoreTabFragment.A03.A1G());
            if (A0C instanceof C82813r7) {
                RecyclerView recyclerView = ((C82813r7) A0C).A0F;
                int min = Math.min(recyclerView.getWidth() / (stickerStoreTabFragment.A01().getDimensionPixelSize(R.dimen.sticker_store_row_preview_padding) + recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_store_row_preview_item)), 5);
                if (stickerStoreTabFragment.A00 != min) {
                    stickerStoreTabFragment.A00 = min;
                    ((AbstractC04890Mh) stickerStoreTabFragment.A0A).A01.A00();
                }
            }
        }
    };

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        this.A01 = layoutInflater;
        if (!(this instanceof StickerStoreMyTabFragment)) {
            i = R.layout.sticker_store_featured_layout;
        } else {
            i = R.layout.sticker_store_my_layout;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.store_recycler_view);
        if (findViewById != null) {
            this.A04 = (RecyclerView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.store_progress);
            if (findViewById2 != null) {
                this.A02 = findViewById2;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                this.A03 = linearLayoutManager;
                linearLayoutManager.A1Y(1);
                ((C0SV) this.A03).A0A = true;
                this.A04.A0k(new C1UC(this.A04.getContext(), this.A03.A01) { // from class: X.3xZ
                    @Override // X.C1UC, X.AbstractC08920cK
                    public void A01(Rect rect, View view, RecyclerView recyclerView, C0Y0 c0y0) {
                        if (RecyclerView.A00(view) == recyclerView.A0N.A0C() - 1) {
                            rect.set(0, 0, 0, 0);
                        } else {
                            super.A01(rect, view, recyclerView, c0y0);
                        }
                    }
                });
                this.A04.setLayoutManager(this.A03);
                this.A04.getViewTreeObserver().addOnGlobalLayoutListener(this.A0C);
                this.A04.setNestedScrollingEnabled(true);
                this.A08.A01(this.A0D);
                if (!(this instanceof StickerStoreMyTabFragment)) {
                    if (this instanceof StickerStoreFeaturedTabFragment) {
                        ((StickerStoreFeaturedTabFragment) this).A00 = inflate.findViewById(R.id.empty);
                    }
                } else {
                    StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) this;
                    stickerStoreMyTabFragment.A00 = inflate.findViewById(R.id.empty);
                    TextView textView = (TextView) inflate.findViewById(R.id.get_stickers_button);
                    C003301p.A06(textView);
                    textView.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(stickerStoreMyTabFragment, 27));
                }
                A0y();
                if (!(this instanceof StickerStoreMyTabFragment)) {
                    StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = (StickerStoreFeaturedTabFragment) this;
                    ((StickerStoreTabFragment) stickerStoreFeaturedTabFragment).A02.setVisibility(0);
                    if (!stickerStoreFeaturedTabFragment.A02) {
                        stickerStoreFeaturedTabFragment.A11();
                    }
                    return inflate;
                }
                StickerStoreMyTabFragment stickerStoreMyTabFragment2 = (StickerStoreMyTabFragment) this;
                stickerStoreMyTabFragment2.A04 = false;
                C1UL c1ul = new C1UL(new C82753r1(stickerStoreMyTabFragment2));
                stickerStoreMyTabFragment2.A01 = c1ul;
                RecyclerView recyclerView = ((StickerStoreTabFragment) stickerStoreMyTabFragment2).A04;
                RecyclerView recyclerView2 = c1ul.A0M;
                if (recyclerView2 != recyclerView) {
                    if (recyclerView2 != null) {
                        recyclerView2.A0l(c1ul);
                        RecyclerView recyclerView3 = c1ul.A0M;
                        InterfaceC15190oE interfaceC15190oE = c1ul.A0Q;
                        recyclerView3.A15.remove(interfaceC15190oE);
                        if (recyclerView3.A0U == interfaceC15190oE) {
                            recyclerView3.A0U = null;
                        }
                        List list = c1ul.A0M.A0a;
                        if (list != null) {
                            list.remove(c1ul);
                        }
                        for (int size = c1ul.A0O.size() - 1; size >= 0; size--) {
                            AbstractC14940np.A00(((C14970ns) c1ul.A0O.get(0)).A0C);
                        }
                        c1ul.A0O.clear();
                        c1ul.A0G = null;
                        c1ul.A0A = -1;
                        VelocityTracker velocityTracker = c1ul.A0F;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            c1ul.A0F = null;
                        }
                        C14950nq c14950nq = c1ul.A0J;
                        if (c14950nq != null) {
                            c14950nq.A00 = false;
                            c1ul.A0J = null;
                        }
                        if (c1ul.A0H != null) {
                            c1ul.A0H = null;
                        }
                    }
                    c1ul.A0M = recyclerView;
                    if (recyclerView != null) {
                        Resources resources = recyclerView.getResources();
                        c1ul.A07 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
                        c1ul.A04 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
                        c1ul.A0C = ViewConfiguration.get(c1ul.A0M.getContext()).getScaledTouchSlop();
                        c1ul.A0M.A0k(c1ul);
                        RecyclerView recyclerView4 = c1ul.A0M;
                        recyclerView4.A15.add(c1ul.A0Q);
                        List list2 = recyclerView4.A0a;
                        if (list2 == null) {
                            list2 = new ArrayList();
                            recyclerView4.A0a = list2;
                        }
                        list2.add(c1ul);
                        c1ul.A0J = new C14950nq(c1ul);
                        c1ul.A0H = new C13090ka(c1ul.A0M.getContext(), c1ul.A0J);
                    }
                }
                ((StickerStoreTabFragment) stickerStoreMyTabFragment2).A02.postDelayed(new RunnableEBaseShape7S0100000_I0_7(stickerStoreMyTabFragment2, 0), 300L);
                return inflate;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0r() {
        this.A04.getViewTreeObserver().removeGlobalOnLayoutListener(this.A0C);
        C2AS c2as = this.A09;
        AnonymousClass241 anonymousClass241 = c2as.A00;
        if (anonymousClass241 != null) {
            anonymousClass241.A01.A01(false);
            c2as.A00 = null;
        }
        C43791xz c43791xz = this.A07;
        if (c43791xz != null) {
            c43791xz.A04();
        }
        this.A08.A00(this.A0D);
        this.A0U = true;
    }

    public void A0y() {
        C2C7 c2c7 = this.A0A;
        if (c2c7 != null && c2c7.A0C() == 0) {
            A10(true);
        } else {
            A10(false);
        }
    }

    public void A0z(C42531vt c42531vt, int i) {
        String str;
        Intent intent = new Intent(A0a(), StickerStorePackPreviewActivity.class);
        intent.putExtra("sticker_pack_id", c42531vt.A0D);
        if (!(this instanceof StickerStoreMyTabFragment)) {
            str = "sticker_store_featured_tab";
        } else {
            str = "sticker_store_my_tab";
        }
        intent.putExtra("sticker_pack_preview_source", str);
        A0A().startActivityForResult(intent, 1);
    }

    public void A10(boolean z) {
        if (!(this instanceof StickerStoreMyTabFragment)) {
            View view = ((StickerStoreFeaturedTabFragment) this).A00;
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
                return;
            }
            return;
        }
        View view2 = ((StickerStoreMyTabFragment) this).A00;
        if (view2 != null) {
            view2.setVisibility(z ? 0 : 8);
        }
    }
}
