package com.whatsapp.payments.ui;

import X.AbstractActivityC92484Li;
import X.ActivityC02290Ap;
import X.C000200d;
import X.C002701i;
import X.C014006r;
import X.C014406v;
import X.C0N0;
import X.C0N6;
import X.C0U1;
import X.C28Q;
import X.C3P4;
import X.C3P5;
import X.C3P6;
import X.C3P7;
import X.C40841sx;
import X.C4GI;
import X.C4IA;
import X.C4Ln;
import X.C90944Da;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;

/* loaded from: classes3.dex */
public class IndiaUpiChangePinActivity extends C4Ln {
    public ProgressBar A00;
    public TextView A01;
    public C0N6 A02;
    public String A03;
    public final C014406v A04 = C014406v.A00("IndiaUpiChangePinActivity", "payment-settings", "IN");

    public void A1n() {
        A1s(true);
        String A06 = ((AbstractActivityC92484Li) this).A05.A06();
        if (TextUtils.isEmpty(A06)) {
            ((AbstractActivityC92484Li) this).A0E.A00();
            return;
        }
        String A1U = A1U(((AbstractActivityC92484Li) this).A05.A02());
        this.A03 = A1U;
        C0N6 c0n6 = this.A02;
        A1m(A06, c0n6.A08, A1U, (C4IA) c0n6.A06, 2, c0n6.A0A);
    }

    public final void A1o() {
        ((AbstractActivityC92484Li) this).A09.A02("pin-entry-ui");
        if (this.A02 != null) {
            ((AbstractActivityC92484Li) this).A0E.A00();
            return;
        }
        this.A04.A07(null, "could not find bank account; showErrorAndFinish", null);
        A1g();
    }

    public /* synthetic */ void A1p() {
        A1s(true);
        Intent intent = new Intent(this, IndiaUpiResetPinActivity.class);
        intent.putExtra("extra_bank_account", this.A02);
        startActivity(intent);
        A1W();
        finish();
    }

    public /* synthetic */ void A1q() {
        A1s(true);
        Intent intent = new Intent(this, IndiaUpiResetPinActivity.class);
        intent.putExtra("extra_bank_account", this.A02);
        startActivity(intent);
        A1W();
        finish();
    }

    public /* synthetic */ void A1r() {
        A1s(true);
        ((AbstractActivityC92484Li) this).A07.A00();
    }

    public final void A1s(boolean z) {
        this.A01.setVisibility(z ? 0 : 4);
        this.A00.setVisibility(z ? 0 : 4);
    }

    @Override // X.C48E
    public void AIO(boolean z, boolean z2, C014006r c014006r, C014006r c014006r2, C4GI c4gi, C4GI c4gi2, C28Q c28q) {
        C014406v c014406v = this.A04;
        throw new UnsupportedOperationException(c014406v.A02(c014406v.A02, " onCheckPin unsupported").toString());
    }

    @Override // X.C48E
    public void ALJ(String str, C28Q c28q) {
        Integer num;
        C0N0 c0n0;
        C0N6 c0n6;
        C0N6 c0n62 = this.A02;
        ((AbstractActivityC92484Li) this).A0F.A03(1, c0n62, c28q);
        ((AbstractActivityC92484Li) this).A0G.A03(1, c0n62, c28q);
        if (!TextUtils.isEmpty(str) && (c0n6 = this.A02) != null && c0n6.A06 != null) {
            this.A03 = A1U(((AbstractActivityC92484Li) this).A05.A02());
            ((AbstractActivityC92484Li) this).A09.A03("upi-get-credential");
            C0N6 c0n63 = this.A02;
            A1m(str, c0n63.A08, this.A03, (C4IA) c0n63.A06, 2, c0n63.A0A);
        } else if (c28q == null || C90944Da.A03(this, "upi-list-keys", c28q.A00, true)) {
        } else {
            if (((AbstractActivityC92484Li) this).A09.A07("upi-list-keys")) {
                ((AbstractActivityC92484Li) this).A05.A0B();
                ((ActivityC02290Ap) this).A0A.A07(R.string.payments_still_working, 1);
                ((AbstractActivityC92484Li) this).A0E.A00();
                return;
            }
            C014406v c014406v = this.A04;
            StringBuilder A0P = C000200d.A0P("IndiaUpiChangePinActivity: onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0P.append(num);
            A0P.append(" bankAccount: ");
            A0P.append(this.A02);
            A0P.append(" countrydata: ");
            C0N6 c0n64 = this.A02;
            if (c0n64 != null) {
                c0n0 = c0n64.A06;
            } else {
                c0n0 = null;
            }
            A0P.append(c0n0);
            A0P.append(" failed; ; showErrorAndFinish");
            c014406v.A06("payment-settings", A0P.toString(), null);
            A1g();
        }
    }

    @Override // X.C48E
    public void AOZ(C28Q c28q) {
        C0N6 c0n6 = this.A02;
        ((AbstractActivityC92484Li) this).A0F.A03(7, c0n6, c28q);
        ((AbstractActivityC92484Li) this).A0G.A03(7, c0n6, c28q);
        if (c28q == null) {
            this.A04.A07(null, "onSetPin success; showSuccessAndFinish", null);
            A1X();
            AUl(0, R.string.payments_change_pin_success, C40841sx.A0M(this.A02.A0A));
        } else if (C90944Da.A03(this, "upi-change-mpin", c28q.A00, true)) {
        } else {
            int i = c28q.A00;
            if (i == 11459) {
                C002701i.A19(this, 10);
            } else if (i == 11468) {
                C002701i.A19(this, 11);
            } else if (i == 11454) {
                C002701i.A19(this, 12);
            } else if (i != 11456 && i != 11471) {
                this.A04.A07(null, " onSetPin failed; showErrorAndFinish", null);
                A1g();
            } else {
                C002701i.A19(this, 13);
            }
        }
    }

    @Override // X.C4Ln, X.AbstractActivityC92484Li, X.C4LI, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_pin_change);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H(((AbstractActivityC92484Li) this).A02.A07(R.string.payments_change_upi_pin_title));
            A0c.A0L(true);
        }
        this.A01 = (TextView) findViewById(R.id.payments_upi_pin_setup_desc);
        this.A00 = (ProgressBar) findViewById(R.id.progress);
    }

    @Override // X.AbstractActivityC92484Li, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        A1s(false);
        switch (i) {
            case 10:
                return A1a(i, getString(R.string.payments_change_pin_invalid_pin), R.string.yes, R.string.no, new C3P5(this));
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return A1a(i, getString(R.string.payments_pin_max_retries), R.string.yes, R.string.no, new C3P4(this));
            case 12:
                return A1a(i, getString(R.string.payments_pin_no_pin_set), R.string.yes, R.string.no, new C3P7(this));
            case 13:
                ((AbstractActivityC92484Li) this).A05.A0C();
                return A1a(i, getString(R.string.payments_set_pin_retry), R.string.yes, R.string.no, new C3P6(this));
            default:
                return super.onCreateDialog(i);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C0N6 c0n6 = (C0N6) bundle.getParcelable("bankAccountSavedInst");
        this.A02 = c0n6;
        if (c0n6 != null) {
            this.A02.A06 = (C0N0) bundle.getParcelable("countryDataSavedInst");
        }
        this.A03 = bundle.getString("seqNumSavedInst");
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        C014406v c014406v = this.A04;
        StringBuilder A0P = C000200d.A0P("onResume with states: ");
        A0P.append(((AbstractActivityC92484Li) this).A09);
        c014406v.A07(null, A0P.toString(), null);
        byte[] A0K = ((AbstractActivityC92484Li) this).A05.A0K();
        if (!((AbstractActivityC92484Li) this).A09.A06.contains("upi-get-challenge") && A0K == null) {
            ((AbstractActivityC92484Li) this).A09.A03("upi-get-challenge");
            ((AbstractActivityC92484Li) this).A07.A00();
        } else if (((AbstractActivityC92484Li) this).A09.A06.contains("upi-get-challenge")) {
        } else {
            A1h();
        }
    }

    @Override // X.AbstractActivityC92484Li, X.C4KG, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0N0 c0n0;
        super.onSaveInstanceState(bundle);
        C0N6 c0n6 = this.A02;
        if (c0n6 != null) {
            bundle.putParcelable("bankAccountSavedInst", c0n6);
        }
        C0N6 c0n62 = this.A02;
        if (c0n62 != null && (c0n0 = c0n62.A06) != null) {
            bundle.putParcelable("countryDataSavedInst", c0n0);
        }
        String str = this.A03;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }
}
