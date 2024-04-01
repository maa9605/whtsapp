package com.whatsapp.payments.ui;

import X.C014006r;
import X.C0BA;
import X.C49I;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class BrazilSmbMerchantNuxUpSellBottomSheet extends Hilt_BrazilSmbMerchantNuxUpSellBottomSheet {
    public C49I A00;

    public /* synthetic */ void A1B() {
        String A02 = this.A00.A02(false);
        if (A02 != null) {
            Intent intent = new Intent(A0a(), BrazilPayBloksActivity.class);
            intent.putExtra("screen_name", A02);
            A0i(intent);
        }
        A10();
    }

    public /* synthetic */ void A1C() {
        Bundle bundle;
        BrazilSmbPaymentActivity brazilSmbPaymentActivity = (BrazilSmbPaymentActivity) A09();
        if (brazilSmbPaymentActivity != null && (bundle = ((C0BA) this).A06) != null) {
            brazilSmbPaymentActivity.A1j(bundle.getString("AMOUNT_STR"), (C014006r) ((C0BA) this).A06.getParcelable("AMOUNT"));
        }
        A10();
    }
}
