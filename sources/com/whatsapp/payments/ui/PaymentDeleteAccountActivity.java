package com.whatsapp.payments.ui;

import X.ActivityC02290Ap;
import X.C000200d;
import X.C014406v;
import X.C0C9;
import X.C0DV;
import X.C0E7;
import X.C0EU;
import X.C0U1;
import X.C28Q;
import X.C28S;
import X.C463026g;
import X.C468228k;
import X.C47302Ar;
import X.C48I;
import X.C49682Lx;
import X.C4K7;
import X.InterfaceC002901k;
import X.InterfaceC03640Gm;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes3.dex */
public class PaymentDeleteAccountActivity extends C4K7 implements InterfaceC03640Gm {
    public int A00;
    public C0E7 A01;
    public C0C9 A02;
    public C28S A03;
    public C0EU A04;
    public C463026g A05;
    public C47302Ar A06;
    public C0DV A07;
    public C49682Lx A08;
    public InterfaceC002901k A09;
    public final C014406v A0A = C014406v.A00("PaymentDeleteAccountActivity", "payment-settings", "COMMON");

    @Override // X.ActivityC02290Ap
    public void A10(int i) {
        setResult(-1);
        finish();
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        AUj(R.string.payment_account_not_unlinked);
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        int A9z = this.A07.A03().A9D().A9z(c28q.A00, null);
        if (A9z != 0) {
            AUj(A9z);
        } else {
            AUj(R.string.payment_account_not_unlinked);
        }
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        C014406v c014406v = this.A0A;
        StringBuilder A0P = C000200d.A0P("onDeleteAccount successful: ");
        A0P.append(c468228k.A02);
        A0P.append(" remove type: ");
        A0P.append(this.A00);
        c014406v.A07(null, A0P.toString(), null);
        findViewById(R.id.progress).setVisibility(8);
        boolean z = c468228k.A02;
        if (!z || this.A00 == 1) {
            int i = R.string.payment_account_not_unlinked;
            if (z) {
                i = R.string.payment_account_unlinked;
            }
            ((TextView) findViewById(R.id.unlink_payment_accounts_title)).setText(i);
            findViewById(R.id.unlink_payment_accounts_desc).setVisibility(8);
            AUj(i);
        }
        if (c468228k.A02 && this.A00 == 2) {
            Intent intent = new Intent();
            intent.putExtra("extra_remove_payment_account", this.A00);
            setResult(-1, intent);
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        findViewById(R.id.hero_payments).setVisibility(configuration.orientation == 2 ? 8 : 0);
    }

    @Override // X.C4K7, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.payment_unlink_payment_accounts);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payments_unlink_payment_accounts);
            A0c.A0L(true);
        }
        this.A00 = getIntent() != null ? getIntent().getIntExtra("extra_remove_payment_account", 0) : 0;
        new C48I(this, ((ActivityC02290Ap) this).A0A, this.A09, this.A08, this.A07, this.A02, this.A04, this.A01, this.A05, this.A06, this.A03).A00(this);
        this.A0A.A07(null, "deleted payments store and sending delete account request", null);
        onConfigurationChanged(getResources().getConfiguration());
    }
}
