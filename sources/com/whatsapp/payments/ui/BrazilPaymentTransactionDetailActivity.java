package com.whatsapp.payments.ui;

import X.AbstractC91274Eh;
import X.C0TS;
import X.C49I;
import X.C4L1;
import X.C900649n;
import X.C901649x;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class BrazilPaymentTransactionDetailActivity extends C4L1 {
    public C49I A00;
    public C900649n A01;

    @Override // com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity, X.C4KM
    public C0TS A1P(ViewGroup viewGroup, int i) {
        if (i != 1000) {
            return super.A1P(viewGroup, i);
        }
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_merchant_upgrade_banner, viewGroup, false);
        return new AbstractC91274Eh(inflate) { // from class: X.4HG
            public Button A00;

            {
                super(inflate);
                this.A00 = (Button) inflate.findViewById(R.id.merchant_upgrade_nudge_button);
            }
        };
    }

    @Override // com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity
    public void A1Q(C901649x c901649x) {
        if (c901649x.A00 != 501) {
            super.A1Q(c901649x);
            return;
        }
        String A02 = this.A00.A02(false);
        if (A02 == null) {
            return;
        }
        Intent intent = new Intent(this, BrazilPayBloksActivity.class);
        intent.putExtra("screen_name", A02);
        A14(intent);
    }
}
