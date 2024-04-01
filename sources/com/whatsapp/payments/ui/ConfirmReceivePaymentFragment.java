package com.whatsapp.payments.ui;

import X.C0CG;
import X.C0CI;
import X.C0DV;
import X.C0N0;
import X.C0N2;
import X.C2GW;
import X.C40841sx;
import X.C41751uS;
import X.C49L;
import X.C896447w;
import X.C90894Cv;
import X.View$OnClickListenerC69373Oe;
import X.View$OnClickListenerC69383Of;
import X.View$OnClickListenerC69393Og;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ConfirmReceivePaymentFragment extends Hilt_ConfirmReceivePaymentFragment implements C49L {
    public Button A00;
    public C0CI A01;
    public C0N2 A02;
    public C41751uS A03;
    public C0DV A04;
    public PaymentMethodRow A05;
    public final C2GW A06 = new C2GW() { // from class: X.4DF
        {
            ConfirmReceivePaymentFragment.this = this;
        }

        @Override // X.C2GW
        public void A00() {
            ConfirmReceivePaymentFragment confirmReceivePaymentFragment = ConfirmReceivePaymentFragment.this;
            C0CI c0ci = confirmReceivePaymentFragment.A01;
            if (c0ci != null) {
                c0ci.A03();
            }
            confirmReceivePaymentFragment.A01 = confirmReceivePaymentFragment.A04.A01().A00();
        }
    };

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.confirm_receive_payment_fragment, viewGroup, false);
        this.A05 = (PaymentMethodRow) inflate.findViewById(R.id.payment_method_row);
        this.A00 = (Button) inflate.findViewById(R.id.confirm_payment);
        View findViewById = inflate.findViewById(R.id.add_another_method);
        inflate.findViewById(R.id.account_number_divider).setVisibility(8);
        inflate.findViewById(R.id.payment_method_account_id).setVisibility(8);
        if (this.A02 == null) {
            C0DV c0dv = this.A04;
            c0dv.A04();
            AbstractList abstractList = (AbstractList) c0dv.A08.A0B();
            if (abstractList.size() > 0) {
                this.A02 = (C0N2) abstractList.get(0);
            }
        }
        AMp(this.A02);
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            inflate.findViewById(R.id.payment_method_container).setOnClickListener(new View$OnClickListenerC69393Og(this, paymentBottomSheet));
            findViewById.setOnClickListener(new View$OnClickListenerC69383Of(this, paymentBottomSheet));
        }
        return inflate;
    }

    @Override // X.C0BA
    public void A0q() {
        this.A0U = true;
        this.A03.A00(this.A06);
    }

    @Override // X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        C0CI c0ci = this.A01;
        if (c0ci != null) {
            c0ci.A03();
        }
        this.A01 = this.A04.A01().A00();
        this.A03.A01(this.A06);
    }

    public void A0y(C0N2 c0n2) {
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        String str = c0n2.A07;
        brazilConfirmReceivePaymentFragment.A00.A06(0, R.string.payment_get_verify_card_data);
        new C896447w(brazilConfirmReceivePaymentFragment.A03, ((Hilt_BrazilConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A00, brazilConfirmReceivePaymentFragment.A00, brazilConfirmReceivePaymentFragment.A01, brazilConfirmReceivePaymentFragment.A0H, brazilConfirmReceivePaymentFragment.A0C, brazilConfirmReceivePaymentFragment.A02, brazilConfirmReceivePaymentFragment.A0A, brazilConfirmReceivePaymentFragment.A0D, brazilConfirmReceivePaymentFragment.A05, brazilConfirmReceivePaymentFragment.A08, brazilConfirmReceivePaymentFragment.A09, str).A01(new C90894Cv(brazilConfirmReceivePaymentFragment, str, (PaymentBottomSheet) this.A0D));
    }

    public /* synthetic */ void A0z(final PaymentBottomSheet paymentBottomSheet) {
        final BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        C0CI c0ci = ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A01;
        c0ci.A01.A03(new C0CG() { // from class: X.3iT
            @Override // X.C0CG
            public final void A54(Object obj) {
                brazilConfirmReceivePaymentFragment.A11(paymentBottomSheet, (List) obj);
            }
        }, null);
    }

    public /* synthetic */ void A10(PaymentBottomSheet paymentBottomSheet) {
        Intent intent = new Intent(A09(), BrazilPayBloksActivity.class);
        intent.putExtra("screen_name", "brpay_p_add_card");
        HashMap hashMap = new HashMap();
        hashMap.put("add_debit_only", "1");
        intent.putExtra("screen_params", hashMap);
        A0i(intent);
        paymentBottomSheet.A16(false, false);
    }

    @Override // X.C49L
    public void AMp(C0N2 c0n2) {
        this.A02 = c0n2;
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) this;
        ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A05.A01.setVisibility(0);
        PaymentMethodRow paymentMethodRow = ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A05;
        paymentMethodRow.A04.setText(C40841sx.A0G(brazilConfirmReceivePaymentFragment.A0C, brazilConfirmReceivePaymentFragment.A04, c0n2));
        C0N0 c0n0 = c0n2.A06;
        if (c0n0 != null) {
            if (!c0n0.A09()) {
                ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A05.A01(brazilConfirmReceivePaymentFragment.A04.A06(R.string.payment_method_unverified));
            }
            PaymentMethodRow paymentMethodRow2 = ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A05;
            if (C40841sx.A0f(c0n2)) {
                brazilConfirmReceivePaymentFragment.A0E.A03(c0n2, paymentMethodRow2);
            }
            ((ConfirmReceivePaymentFragment) brazilConfirmReceivePaymentFragment).A05.A02(true);
            this.A00.setOnClickListener(new View$OnClickListenerC69373Oe(this, c0n2));
            return;
        }
        throw null;
    }
}
