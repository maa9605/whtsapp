package com.whatsapp.payments.ui;

import X.C002301c;
import X.View$OnClickListenerC70073Qw;
import X.View$OnClickListenerC70083Qx;
import X.View$OnClickListenerC70093Qy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class PaymentTypePickerFragment extends Hilt_PaymentTypePickerFragment {
    public C002301c A00;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_type_picker_fragment, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        String string = A02().getString("arg_type", "goodAndServices");
        if (string != null) {
            ((TextView) view.findViewById(R.id.buying_goods_and_services_text)).setText(R.string.buying_goods_and_services);
            TextView textView = (TextView) view.findViewById(R.id.buying_goods_and_services_hint_text);
            if (!(this instanceof BrazilPaymentTypePickerFragment)) {
                throw null;
            }
            textView.setText(this.A00.A06(R.string.br_buying_goods_and_services_hint));
            ((TextView) view.findViewById(R.id.sending_to_friends_and_family_text)).setText(R.string.sending_to_friends_and_family);
            TextView textView2 = (TextView) view.findViewById(R.id.sending_to_friends_and_family_hint_text);
            if (!(this instanceof BrazilPaymentTypePickerFragment)) {
                throw null;
            }
            textView2.setText(this.A00.A06(R.string.br_sending_to_friends_and_family_hint));
            if (string.equals("goodAndServices")) {
                view.findViewById(R.id.buying_goods_and_services_check).setVisibility(0);
                view.findViewById(R.id.sending_to_friends_and_family_check).setVisibility(4);
            } else {
                view.findViewById(R.id.buying_goods_and_services_check).setVisibility(4);
                view.findViewById(R.id.sending_to_friends_and_family_check).setVisibility(0);
            }
            view.findViewById(R.id.sending_to_friends_and_family_container).setOnClickListener(new View$OnClickListenerC70083Qx(this));
            view.findViewById(R.id.buying_goods_and_services_container).setOnClickListener(new View$OnClickListenerC70073Qw(this));
            view.findViewById(R.id.back).setOnClickListener(new View$OnClickListenerC70093Qy(this));
            return;
        }
        throw null;
    }

    public void A0x() {
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
    }

    public /* synthetic */ void A0y() {
        ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A07();
        if (confirmPaymentFragment != null) {
            confirmPaymentFragment.A0y(1);
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
    }

    public /* synthetic */ void A0z() {
        ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A07();
        if (confirmPaymentFragment != null) {
            confirmPaymentFragment.A0y(0);
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A18();
        }
    }
}
