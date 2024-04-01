package com.whatsapp.payments.ui;

import X.AbstractActivityC92394Kd;
import X.AbstractC04890Mh;
import X.C002701i;
import X.C014406v;
import X.C0EX;
import X.C0TS;
import X.C0U1;
import X.C28661Tc;
import X.C3RW;
import X.C4E4;
import X.C4F8;
import X.C4HL;
import X.C4KM;
import X.C900949q;
import X.C901249t;
import X.C92314Ik;
import X.InterfaceC05620Pl;
import X.InterfaceC28001Pq;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import java.util.List;

/* loaded from: classes3.dex */
public class IndiaUpiMandateHistoryActivity extends AbstractActivityC92394Kd {
    public InterfaceC28001Pq A00;
    public C0EX A01;
    public C4F8 A02;
    public C901249t A03;
    public final C014406v A04 = C014406v.A00("IndiaUpiMandateHistoryActivity", "mandates", "IN");

    @Override // X.C4KM
    public C0TS A1P(ViewGroup viewGroup, int i) {
        if (i != 1002) {
            if (i != 1003) {
                return super.A1P(viewGroup, i);
            }
            return new C4HL(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_payment_section_header_component, viewGroup, false));
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_expandable_listview, viewGroup, false);
        inflate.setBackgroundColor(inflate.getContext().getResources().getColor(R.color.primary_surface));
        return new C92314Ik(inflate);
    }

    public void A1Q(C900949q c900949q) {
        Intent intent = new Intent(this, PaymentTransactionHistoryActivity.class);
        intent.putExtra("extra_disable_search", c900949q.A01);
        intent.putExtra("extra_predefined_search_filter", c900949q.A00);
        startActivity(intent);
    }

    public void A1R(List list) {
        C4E4 c4e4 = ((C4KM) this).A03;
        c4e4.A00 = list;
        ((AbstractC04890Mh) c4e4).A01.A00();
    }

    @Override // X.AbstractActivityC92394Kd, X.C4KM, X.C4K6, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H(getString(R.string.upi_mandate_row_title));
            A0c.A0L(true);
        }
        this.A04.A07(null, "onCreate", null);
        final C901249t c901249t = this.A03;
        if (c901249t != null) {
            C4F8 c4f8 = (C4F8) C002701i.A0J(this, new C28661Tc() { // from class: X.4Hm
                @Override // X.C28661Tc, X.C0CR
                public C0MU A6e(Class cls) {
                    if (cls.isAssignableFrom(C4F8.class)) {
                        IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity = this;
                        C901249t c901249t2 = c901249t;
                        return new C4F8(indiaUpiMandateHistoryActivity, c901249t2.A00, c901249t2.A0X, c901249t2.A0A, c901249t2.A0C);
                    }
                    throw new IllegalArgumentException("Invalid viewModel");
                }
            }).A00(C4F8.class);
            this.A02 = c4f8;
            if (c4f8 != null) {
                c4f8.A06.AS1(new C3RW(c4f8));
                C4F8 c4f82 = this.A02;
                c4f82.A01.A05(c4f82.A00, new InterfaceC05620Pl() { // from class: X.3iy
                    {
                        IndiaUpiMandateHistoryActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        IndiaUpiMandateHistoryActivity.this.A1R((List) obj);
                    }
                });
                C4F8 c4f83 = this.A02;
                c4f83.A02.A05(c4f83.A00, new InterfaceC05620Pl() { // from class: X.3iz
                    {
                        IndiaUpiMandateHistoryActivity.this = this;
                    }

                    @Override // X.InterfaceC05620Pl
                    public final void AIK(Object obj) {
                        IndiaUpiMandateHistoryActivity.this.A1Q((C900949q) obj);
                    }
                });
                InterfaceC28001Pq interfaceC28001Pq = new InterfaceC28001Pq() { // from class: X.4Dc
                    @Override // X.InterfaceC28001Pq
                    public void AMt(AnonymousClass093 anonymousClass093) {
                    }

                    {
                        IndiaUpiMandateHistoryActivity.this = this;
                    }

                    @Override // X.InterfaceC28001Pq
                    public void AMu(AnonymousClass093 anonymousClass093) {
                        IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity = IndiaUpiMandateHistoryActivity.this;
                        indiaUpiMandateHistoryActivity.A04.A03("payment transaction updated");
                        C4F8 c4f84 = indiaUpiMandateHistoryActivity.A02;
                        if (c4f84 != null) {
                            c4f84.A06.AS1(new C3RW(c4f84));
                            return;
                        }
                        throw null;
                    }
                };
                this.A00 = interfaceC28001Pq;
                this.A01.A01(interfaceC28001Pq);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A01.A00(this.A00);
        super.onDestroy();
    }
}
