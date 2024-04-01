package com.whatsapp.payments.ui;

import X.C0N2;
import X.C0N7;
import X.C0N8;
import X.View$OnClickListenerC69933Qi;
import X.View$OnClickListenerC69943Qj;
import X.View$OnClickListenerC69953Qk;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class PaymentRailPickerFragment extends Hilt_PaymentRailPickerFragment {
    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_rail_picker_fragment, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        String string = A02().getString("arg_type", "credit");
        if (string != null) {
            if (string.equals("credit")) {
                view.findViewById(R.id.credit_card_check).setVisibility(0);
                view.findViewById(R.id.debit_card_check).setVisibility(4);
            } else {
                view.findViewById(R.id.credit_card_check).setVisibility(4);
                view.findViewById(R.id.debit_card_check).setVisibility(0);
            }
            view.findViewById(R.id.payment_rail_credit_card_container).setOnClickListener(new View$OnClickListenerC69953Qk(this));
            view.findViewById(R.id.payment_rail_debit_card_container).setOnClickListener(new View$OnClickListenerC69933Qi(this));
            view.findViewById(R.id.back).setOnClickListener(new View$OnClickListenerC69943Qj(this));
            return;
        }
        throw null;
    }

    public void A0y() {
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
    }

    public /* synthetic */ void A0z() {
        A11(0);
    }

    public /* synthetic */ void A10() {
        A11(1);
    }

    public final void A11(int i) {
        C0N8 c0n8;
        ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A07();
        if (confirmPaymentFragment != null) {
            confirmPaymentFragment.A00 = i;
            TextView textView = confirmPaymentFragment.A0A;
            if (i == 0) {
                textView.setText(R.string.confirm_payment_bottom_sheet_payment_rails_credit_label);
            } else {
                textView.setText(R.string.confirm_payment_bottom_sheet_payment_rails_debit_label);
            }
            C0N2 c0n2 = confirmPaymentFragment.A0G;
            if ((c0n2 instanceof C0N7) && (c0n8 = (C0N8) c0n2.A06) != null) {
                c0n8.A03 = i;
            }
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
    }
}
