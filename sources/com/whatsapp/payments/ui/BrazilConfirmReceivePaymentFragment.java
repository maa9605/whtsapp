package com.whatsapp.payments.ui;

import X.AnonymousClass012;
import X.C002301c;
import X.C013606n;
import X.C018508q;
import X.C02L;
import X.C0DV;
import X.C0DW;
import X.C0E7;
import X.C28S;
import X.C463026g;
import X.C47W;
import X.C47Y;
import X.C48z;
import X.C49682Lx;
import X.C49G;
import X.C49I;
import X.C4EE;
import X.C90454Bb;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.List;

/* loaded from: classes3.dex */
public class BrazilConfirmReceivePaymentFragment extends Hilt_BrazilConfirmReceivePaymentFragment {
    public C018508q A00;
    public C02L A01;
    public C0E7 A02;
    public AnonymousClass012 A03;
    public C002301c A04;
    public C013606n A05;
    public C47W A06;
    public C90454Bb A07;
    public C47Y A08;
    public C28S A09;
    public C463026g A0A;
    public C0DW A0B;
    public C0DV A0C;
    public C48z A0D;
    public C49G A0E;
    public C49I A0F;
    public C49I A0G;
    public C49682Lx A0H;

    @Override // com.whatsapp.payments.ui.Hilt_BrazilConfirmReceivePaymentFragment, com.whatsapp.payments.ui.Hilt_ConfirmReceivePaymentFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A07 = new C90454Bb(this.A04, this.A0B);
    }

    public void A11(PaymentBottomSheet paymentBottomSheet, List list) {
        if (list != null) {
            PaymentMethodsListPickerFragment A00 = PaymentMethodsListPickerFragment.A00(list);
            A00.A0S(this, 0);
            A00.A07 = new C4EE() { // from class: X.4H9
                @Override // X.C49X
                public boolean AUT() {
                    return true;
                }

                @Override // X.C49X
                public void AGx() {
                    BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = BrazilConfirmReceivePaymentFragment.this;
                    String A02 = brazilConfirmReceivePaymentFragment.A0F.A02(true);
                    Intent intent = new Intent(brazilConfirmReceivePaymentFragment.A09(), BrazilPayBloksActivity.class);
                    if (A02 == null) {
                        A02 = "brpay_p_add_card";
                    }
                    intent.putExtra("screen_name", A02);
                    brazilConfirmReceivePaymentFragment.A0i(intent);
                }

                @Override // X.C49X
                public void AUe(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
                    if (C40841sx.A0f(c0n2)) {
                        BrazilConfirmReceivePaymentFragment.this.A0E.A03(c0n2, paymentMethodRow);
                    }
                }
            };
            paymentBottomSheet.A19(A00);
            return;
        }
        throw null;
    }
}
