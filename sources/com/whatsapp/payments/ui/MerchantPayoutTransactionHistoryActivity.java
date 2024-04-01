package com.whatsapp.payments.ui;

import X.AbstractC04890Mh;
import X.C002701i;
import X.C02160Ac;
import X.C02180Ae;
import X.C0HK;
import X.C0HS;
import X.C0U1;
import X.C28661Tc;
import X.C4FE;
import X.C4K5;
import X.C901749y;
import X.C91144Du;
import X.InterfaceC02360Aw;
import X.InterfaceC05620Pl;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class MerchantPayoutTransactionHistoryActivity extends C4K5 {
    public FrameLayout A00;
    public StickyHeadersRecyclerView A01;
    public C91144Du A02;
    public C4FE A03;
    public C901749y A04;

    public void A1P(Pair pair) {
        C91144Du c91144Du = this.A02;
        if (c91144Du != null) {
            c91144Du.A02 = (List) pair.first;
            c91144Du.A01 = (List) pair.second;
            ((AbstractC04890Mh) c91144Du).A01.A00();
            return;
        }
        throw null;
    }

    public /* synthetic */ void A1Q(Boolean bool) {
        this.A00.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    public /* synthetic */ void A1R(Boolean bool) {
        this.A01.setVisibility(bool.booleanValue() ? 0 : 8);
    }

    @Override // X.C4K5, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.payout_transaction_history);
        int A00 = C02160Ac.A00(this, R.color.fb_pay_hub_icon_tint);
        A0k((Toolbar) findViewById(R.id.pay_service_toolbar));
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payment_merchant_payouts_title);
            A0c.A0L(true);
            A0c.A0A(C02180Ae.A0Q(getResources().getDrawable(R.drawable.ic_close), A00));
        }
        this.A02 = new C91144Du(this);
        this.A00 = (FrameLayout) findViewById(R.id.loading_container);
        StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) findViewById(R.id.transaction_list);
        this.A01 = stickyHeadersRecyclerView;
        stickyHeadersRecyclerView.setAdapter(this.A02);
        final C901749y c901749y = this.A04;
        if (c901749y != null) {
            C4FE c4fe = (C4FE) C002701i.A0J(this, new C28661Tc() { // from class: X.4Hs
                @Override // X.C28661Tc, X.C0CR
                public C0MU A6e(Class cls) {
                    if (cls.isAssignableFrom(C4FE.class)) {
                        MerchantPayoutTransactionHistoryActivity merchantPayoutTransactionHistoryActivity = this;
                        C901749y c901749y2 = c901749y;
                        return new C4FE(merchantPayoutTransactionHistoryActivity, c901749y2.A05, c901749y2.A0L, c901749y2.A0K, c901749y2.A07, c901749y2.A09, c901749y2.A0J);
                    }
                    throw new IllegalArgumentException("Invalid viewModel");
                }
            }).A00(C4FE.class);
            this.A03 = c4fe;
            if (c4fe != null) {
                c4fe.A00.A0B(Boolean.TRUE);
                c4fe.A01.A0B(Boolean.FALSE);
                c4fe.A09.ARy(new C0HS(c4fe, c4fe.A06) { // from class: X.4FD
                    public WeakReference A00;
                    public final C013306k A01;

                    {
                        this.A01 = r3;
                        this.A00 = new WeakReference(c4fe);
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        return this.A01.A0Y(0, new Integer[0], new Integer[]{300});
                    }

                    @Override // X.C0HS
                    public void A09(Object obj) {
                        int i;
                        boolean z;
                        List list = (List) obj;
                        WeakReference weakReference = this.A00;
                        if (weakReference.get() != null) {
                            C4FE c4fe2 = (C4FE) weakReference.get();
                            c4fe2.A00.A0B(Boolean.FALSE);
                            c4fe2.A01.A0B(Boolean.TRUE);
                            C900249j c900249j = c4fe2.A07;
                            C91254Ef c91254Ef = null;
                            if (c900249j != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    C91254Ef A01 = c900249j.A01(((AnonymousClass093) it.next()).A04);
                                    if (c91254Ef != null) {
                                        if (c91254Ef.get(2) == A01.get(2) && c91254Ef.get(1) == A01.get(1)) {
                                            c91254Ef.count++;
                                        } else {
                                            arrayList.add(c91254Ef);
                                        }
                                    }
                                    A01.count = 0;
                                    c91254Ef = A01;
                                    c91254Ef.count++;
                                }
                                if (c91254Ef != null) {
                                    arrayList.add(c91254Ef);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (i = 0; i < list.size(); i++) {
                                    AnonymousClass093 anonymousClass093 = (AnonymousClass093) list.get(i);
                                    C91374Er c91374Er = new C91374Er();
                                    c91374Er.A01 = C002501g.A0D(c4fe2.A05, c4fe2.A04.A06(anonymousClass093.A04));
                                    c91374Er.A00 = c4fe2.A08.A0C(anonymousClass093);
                                    if (i < list.size() - 1) {
                                        C91254Ef A012 = c900249j.A01(anonymousClass093.A04);
                                        C91254Ef A013 = c900249j.A01(((AnonymousClass093) list.get(i + 1)).A04);
                                        z = true;
                                        if (A012.get(2) != A013.get(2) || A012.get(1) != A013.get(1)) {
                                            z = false;
                                        }
                                    } else {
                                        z = true;
                                    }
                                    c91374Er.A02 = z;
                                    arrayList2.add(c91374Er);
                                }
                                c4fe2.A02.A0B(Pair.create(arrayList2, arrayList));
                                return;
                            }
                            throw null;
                        }
                    }
                }, new Void[0]);
                C4FE c4fe2 = this.A03;
                InterfaceC05620Pl interfaceC05620Pl = new InterfaceC05620Pl() { // from class: X.3jQ
                    {
                        MerchantPayoutTransactionHistoryActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        MerchantPayoutTransactionHistoryActivity.this.A1P((Pair) obj);
                    }
                };
                InterfaceC05620Pl interfaceC05620Pl2 = new InterfaceC05620Pl() { // from class: X.3jR
                    {
                        MerchantPayoutTransactionHistoryActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        MerchantPayoutTransactionHistoryActivity.this.A1Q((Boolean) obj);
                    }
                };
                InterfaceC05620Pl interfaceC05620Pl3 = new InterfaceC05620Pl() { // from class: X.3jS
                    {
                        MerchantPayoutTransactionHistoryActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        MerchantPayoutTransactionHistoryActivity.this.A1R((Boolean) obj);
                    }
                };
                c4fe2.A02.A05(c4fe2.A03, interfaceC05620Pl);
                C0HK c0hk = c4fe2.A00;
                InterfaceC02360Aw interfaceC02360Aw = c4fe2.A03;
                c0hk.A05(interfaceC02360Aw, interfaceC05620Pl2);
                c4fe2.A01.A05(interfaceC02360Aw, interfaceC05620Pl3);
                return;
            }
            throw null;
        }
        throw null;
    }
}
