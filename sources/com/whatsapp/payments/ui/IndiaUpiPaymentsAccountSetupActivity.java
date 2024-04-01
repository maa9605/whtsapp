package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.AbstractC03520Ga;
import X.ActivityC02290Ap;
import X.AnonymousClass093;
import X.C000200d;
import X.C014406v;
import X.C03680Gq;
import X.C28O;
import X.C28P;
import X.C28R;
import X.C4KG;
import X.C4LG;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;

/* loaded from: classes3.dex */
public class IndiaUpiPaymentsAccountSetupActivity extends C4LG {
    public C28P A00;
    public C28O A01;
    public final C014406v A02 = C014406v.A00("IndiaUpiPaymentsAccountSetupActivity", "payment-settings", "IN");

    public /* synthetic */ void A1a(AnonymousClass093 anonymousClass093) {
        this.A01.A02(this.A0P, anonymousClass093.A0R(), this.A00);
    }

    public final void A1b(boolean z) {
        C014406v c014406v = this.A02;
        StringBuilder sb = new StringBuilder("showCompleteAndFinish ");
        sb.append(z);
        c014406v.A07(null, sb.toString(), null);
        ARS();
        this.A00.A01(new C28R() { // from class: X.3j7
            {
                IndiaUpiPaymentsAccountSetupActivity.this = this;
            }

            @Override // X.C28R
            public final void AVM(AnonymousClass093 anonymousClass093) {
                IndiaUpiPaymentsAccountSetupActivity.this.A1a(anonymousClass093);
            }
        });
        Intent intent = new Intent(this, IndiaUpiBankAccountLinkingConfirmationActivity.class);
        A1Z(intent);
        intent.putExtra("isUpiMPinSet", z);
        finish();
        startActivity(intent);
    }

    @Override // X.C4LG, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.payments_title);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        C014406v c014406v = this.A02;
        StringBuilder A0P = C000200d.A0P("onResume payment setup with mode: ");
        A0P.append(((AbstractActivityC92444Kp) this).A02);
        c014406v.A07(null, A0P.toString(), null);
        if (!isFinishing()) {
            C000200d.A0j(((ActivityC02290Ap) this).A0F, "payments_onboarding_banner_registration_started", true);
            C03680Gq A00 = ((C4KG) this).A0B.A00();
            if (A00 == null) {
                c014406v.A07(null, "showNextStep is already complete", null);
                A1b(true);
                return;
            }
            StringBuilder sb = new StringBuilder("showNextStep: ");
            sb.append(A00);
            c014406v.A07(null, sb.toString(), null);
            if (A00 == AbstractC03520Ga.A04) {
                c014406v.A08("Unset step", null);
                finish();
                return;
            }
            String str = A00.A03;
            if (!str.equals("tos_with_wallet") && !str.equals("tos_no_wallet")) {
                if (str.equals("add_card")) {
                    c014406v.A07(null, "showAddCard not implemented", null);
                    return;
                } else if (str.equals("add_bank")) {
                    Intent intent = new Intent(this, IndiaUpiPaymentBankSetupActivity.class);
                    finish();
                    ((AbstractActivityC92444Kp) this).A0G = true;
                    A1Z(intent);
                    startActivity(intent);
                    return;
                } else if (!str.equals("2fa")) {
                    return;
                } else {
                    if (((AbstractActivityC92444Kp) this).A02 == 1) {
                        Intent intent2 = new Intent(this, IndiaUpiResetPinActivity.class);
                        finish();
                        ((AbstractActivityC92444Kp) this).A0G = true;
                        A1Z(intent2);
                        startActivity(intent2);
                        return;
                    }
                    A1b(false);
                    return;
                }
            }
            Intent intent3 = new Intent(this, IndiaUpiPaymentsTosActivity.class);
            finish();
            intent3.putExtra("stepName", str);
            intent3.putExtra("extra_setup_mode", ((AbstractActivityC92444Kp) this).A02);
            A1Z(intent3);
            startActivity(intent3);
        }
    }
}
