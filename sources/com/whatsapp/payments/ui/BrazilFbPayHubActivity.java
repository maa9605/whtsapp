package com.whatsapp.payments.ui;

import X.ActivityC02310Ar;
import X.AnonymousClass493;
import X.AnonymousClass498;
import X.AnonymousClass499;
import X.C014406v;
import X.C02L;
import X.C0C9;
import X.C0DW;
import X.C0GZ;
import X.C0N2;
import X.C40841sx;
import X.C47302Ar;
import X.C47X;
import X.C49682Lx;
import X.C49G;
import X.C49I;
import X.C4BZ;
import X.C4EB;
import X.C4KY;
import X.C90454Bb;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class BrazilFbPayHubActivity extends C4KY implements C4EB {
    public C02L A00;
    public C0C9 A01;
    public C4BZ A02;
    public C47X A03;
    public C90454Bb A04;
    public C0GZ A05;
    public C0DW A06;
    public C47302Ar A07;
    public AnonymousClass493 A08;
    public AnonymousClass498 A09;
    public AnonymousClass499 A0A;
    public C49G A0B;
    public C49I A0C;
    public C49682Lx A0D;

    @Override // X.C4EB
    public int ABI(C0N2 c0n2) {
        return 0;
    }

    @Override // X.C4EB
    public String ABJ(C0N2 c0n2) {
        return null;
    }

    @Override // X.C49V
    public String ABM(C0N2 c0n2) {
        return null;
    }

    @Override // X.C4EB
    public boolean AUT() {
        return true;
    }

    public BrazilFbPayHubActivity() {
        C014406v.A00("BrazilFbPayHubActivity", "payment-settings", "COMMON");
    }

    @Override // X.InterfaceC899549c
    public void AGy(boolean z) {
        String A02 = this.A0C.A02(true);
        Intent intent = new Intent(this, BrazilPayBloksActivity.class);
        if (A02 != null) {
            intent.putExtra("screen_name", A02);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("verification_needed", z ? "1" : "0");
            hashMap.put("referral_screen", "fbpay_payment_settings");
            intent.putExtra("screen_params", hashMap);
            intent.putExtra("screen_name", "brpay_p_add_card");
        }
        A14(intent);
    }

    @Override // X.InterfaceC899549c
    public void AMp(C0N2 c0n2) {
        if (c0n2.A08() != 5) {
            Intent intent = new Intent(this, BrazilPaymentCardDetailsActivity.class);
            intent.putExtra("extra_bank_account", c0n2);
            startActivity(intent);
        }
    }

    @Override // X.C4EB
    public void AUe(C0N2 c0n2, PaymentMethodRow paymentMethodRow) {
        if (C40841sx.A0f(c0n2)) {
            this.A0B.A03(c0n2, paymentMethodRow);
        }
    }

    @Override // X.C4KY, X.C4KK, X.C4K4, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A04 = new C90454Bb(((ActivityC02310Ar) this).A01, this.A06);
    }

    @Override // X.C4KK, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A0C.A04.A04()) {
            return;
        }
        finish();
    }
}
