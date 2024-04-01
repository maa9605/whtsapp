package com.whatsapp.wabloks.ui.shops;

import X.AbstractView$OnClickListenerC49532Ky;
import X.AnonymousClass088;
import X.C03230Ew;
import X.C06570Tx;
import X.C0AT;
import X.C0BA;
import X.C0FK;
import X.C12390jL;
import X.C33391fp;
import X.InterfaceC05620Pl;
import X.RunnableC75083eK;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.wabloks.base.BkFragment2;
import com.whatsapp.wabloks.ui.shops.ShopsProductPreviewFragment;
import com.whatsapp.wabloks.ui.shops.ShopsProductPreviewFragmentViewModel;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public class ShopsProductPreviewFragment extends Hilt_ShopsProductPreviewFragment {
    public ConstraintLayout A00;
    public ShimmerFrameLayout A01;
    public C03230Ew A02;
    public ShopsProductPreviewFragmentViewModel A03;
    public Runnable A04;
    public String A05;
    public final Handler A06 = new Handler();

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_shops_product_preview, viewGroup, false);
    }

    @Override // com.whatsapp.wabloks.base.BkFragment2, X.C0BA
    public void A0s() {
        super.A0s();
        this.A03.A02(this.A05);
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        String string = A02().getString("shopUrl");
        if (string == null) {
            throw null;
        }
        this.A05 = string;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        this.A01 = (ShimmerFrameLayout) C0AT.A0D(view, R.id.shimmer_container);
        this.A00 = (ConstraintLayout) C0AT.A0D(view, R.id.placeholder_container);
        C0AT.A0D(view, R.id.see_all).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.4G7
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                ShopsProductPreviewFragment shopsProductPreviewFragment = ShopsProductPreviewFragment.this;
                shopsProductPreviewFragment.A02.AS7(shopsProductPreviewFragment.A0A(), Uri.parse(shopsProductPreviewFragment.A05));
                ShopsProductPreviewFragmentViewModel shopsProductPreviewFragmentViewModel = shopsProductPreviewFragment.A03;
                if (shopsProductPreviewFragmentViewModel.A04.AFs()) {
                    C37661mm c37661mm = new C37661mm();
                    c37661mm.A01 = 3;
                    c37661mm.A00 = 1;
                    shopsProductPreviewFragmentViewModel.A01.A0B(c37661mm, null, false);
                }
            }
        });
        ((BkFragment2) this).A00 = (FrameLayout) C0AT.A0D(view, R.id.bk_container);
        ShopsProductPreviewFragmentViewModel shopsProductPreviewFragmentViewModel = (ShopsProductPreviewFragmentViewModel) new C06570Tx(this).A00(ShopsProductPreviewFragmentViewModel.class);
        this.A03 = shopsProductPreviewFragmentViewModel;
        shopsProductPreviewFragmentViewModel.A00.A05(A0D(), new InterfaceC05620Pl() { // from class: X.3uv
            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                ShopsProductPreviewFragment.this.A1D((C0FK) obj);
            }
        });
        RunnableC75083eK runnableC75083eK = new RunnableC75083eK(this);
        this.A04 = runnableC75083eK;
        this.A06.postDelayed(runnableC75083eK, 200L);
    }

    @Override // com.whatsapp.wabloks.base.BkFragment2
    public void A18() {
        super.A18();
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.A06.removeCallbacks(runnable);
        }
        this.A01.A01();
        this.A01.setVisibility(8);
    }

    public /* synthetic */ void A1C() {
        int width = this.A00.getWidth();
        int height = this.A00.getHeight();
        Context A00 = A00();
        int A02 = AnonymousClass088.A02(A00, 16.0f);
        LinkedList linkedList = new LinkedList();
        int min = Math.min((width - (A02 * 3)) / 4, height - (A02 << 1));
        int i = 0;
        int i2 = 0;
        do {
            View view = new View(A00);
            view.setBackgroundResource(R.drawable.rounded_grey_box);
            view.setId(C0AT.A02());
            this.A00.addView(view);
            linkedList.add(view);
            i2++;
        } while (i2 < 4);
        do {
            int id = ((View) linkedList.get(i)).getId();
            C12390jL c12390jL = new C12390jL();
            c12390jL.A04(id).A02.A0c = min;
            c12390jL.A04(id).A02.A0a = min;
            c12390jL.A05(id, 3, R.id.placeholder_container, 3);
            c12390jL.A05(id, 4, R.id.placeholder_container, 4);
            if (i == 0) {
                c12390jL.A05(id, 6, R.id.placeholder_container, 6);
                c12390jL.A05(id, 7, ((View) linkedList.get(1)).getId(), 6);
                c12390jL.A04(id).A02.A0U = 1;
            } else if (i == 3) {
                c12390jL.A05(id, 6, ((View) linkedList.get(2)).getId(), 7);
                c12390jL.A05(id, 7, R.id.placeholder_container, 7);
            } else {
                c12390jL.A05(id, 6, ((View) linkedList.get(i - 1)).getId(), 7);
                c12390jL.A05(id, 7, ((View) linkedList.get(i + 1)).getId(), 6);
            }
            ConstraintLayout constraintLayout = this.A00;
            c12390jL.A07(constraintLayout);
            constraintLayout.A0D = null;
            constraintLayout.requestLayout();
            i++;
        } while (i < 4);
        this.A01.A00();
    }

    public /* synthetic */ void A1D(C0FK c0fk) {
        if (c0fk != null) {
            Object obj = c0fk.A00;
            if (obj != null) {
                ((BkFragment2) this).A01 = (C33391fp) obj;
                A18();
                return;
            }
            Object obj2 = c0fk.A01;
            if (obj2 == null) {
                return;
            }
            A19((Exception) obj2);
        }
    }

    @Override // X.C0BA, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        LayoutInflater from = LayoutInflater.from(A00());
        ViewGroup viewGroup = (ViewGroup) ((C0BA) this).A0A;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(from.inflate(R.layout.fragment_shops_product_preview, viewGroup, false));
            A0w(viewGroup, null);
            this.A03.A02(this.A05);
        }
    }
}
