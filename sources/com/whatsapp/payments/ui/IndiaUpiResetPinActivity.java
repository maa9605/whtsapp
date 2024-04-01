package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.AbstractActivityC92484Li;
import X.AbstractC013506m;
import X.ActivityC02290Ap;
import X.AnonymousClass029;
import X.C000200d;
import X.C002701i;
import X.C013606n;
import X.C014006r;
import X.C014406v;
import X.C0DV;
import X.C0GZ;
import X.C0N0;
import X.C0N2;
import X.C0N6;
import X.C0U1;
import X.C14020mE;
import X.C14030mF;
import X.C28Q;
import X.C28S;
import X.C3QE;
import X.C3QF;
import X.C3QG;
import X.C3QH;
import X.C3QI;
import X.C3QJ;
import X.C3QK;
import X.C40841sx;
import X.C48C;
import X.C48E;
import X.C4C7;
import X.C4GI;
import X.C4IA;
import X.C4KG;
import X.C4Lr;
import X.C90944Da;
import X.C91084Do;
import X.C91094Dp;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class IndiaUpiResetPinActivity extends C4Lr implements C48E, C48C {
    public int A00;
    public ProgressBar A01;
    public TextView A02;
    public TextView A03;
    public C0N6 A04;
    public C013606n A05;
    public C28S A06;
    public C4C7 A07;
    public C91094Dp A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public HashMap A0E;
    public final C014406v A0G = C014406v.A00("IndiaUpiResetPinActivity", "payment-settings", "IN");
    public final BroadcastReceiver A0F = new BroadcastReceiver() { // from class: X.49R
        {
            IndiaUpiResetPinActivity.this = this;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IndiaUpiResetPinActivity indiaUpiResetPinActivity = IndiaUpiResetPinActivity.this;
            C0N6 c0n6 = indiaUpiResetPinActivity.A04;
            if (c0n6 != null) {
                indiaUpiResetPinActivity.A07.A00((C4IA) c0n6.A06, null);
            } else {
                indiaUpiResetPinActivity.A0G.A07(null, "onLibraryResult got resend otp but bankaccount is null", null);
            }
        }
    };

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.payments_set_pin_success) {
            A1W();
            setResult(-1);
            finish();
            return;
        }
        A1W();
        finish();
    }

    public void A1n() {
        A1y(true);
        this.A07.A00((C4IA) this.A04.A06, this);
    }

    public void A1o() {
        A1y(true);
        this.A07.A00((C4IA) this.A04.A06, this);
    }

    public void A1p() {
        A1y(true);
        ((C4KG) this).A0C.A05(2, new C91084Do(this));
    }

    public void A1q() {
        C0N0 c0n0;
        C0DV c0dv = ((AbstractActivityC92484Li) this).A0C;
        c0dv.A04();
        List A0B = c0dv.A08.A0B();
        C0N2 A01 = AbstractC013506m.A01(A0B, this.A04.A07);
        if (A01 == null || (c0n0 = A01.A06) == null) {
            return;
        }
        ((C4IA) c0n0).A0G = true;
        C0DV c0dv2 = ((AbstractActivityC92484Li) this).A0C;
        c0dv2.A04();
        c0dv2.A08.A0J(A0B);
    }

    public final void A1r() {
        ((AbstractActivityC92484Li) this).A09.A02("pin-entry-ui");
        C0N6 c0n6 = this.A04;
        if (c0n6 != null) {
            C4IA c4ia = (C4IA) c0n6.A06;
            if (c4ia != null) {
                if (((AbstractActivityC92444Kp) this).A0G && c4ia.A0G) {
                    this.A0G.A07(null, "showOrCheckPin insetup and upi pin already set; showSuccessAndFinish", null);
                    C0GZ c0gz = ((C4KG) this).A0B;
                    synchronized (c0gz) {
                        c0gz.A05(c0gz.A01("2fa"));
                    }
                    A1z(true);
                    return;
                }
                Intent intent = new Intent(this, IndiaUpiEducationActivity.class);
                intent.putExtra("extra_bank_account", this.A04);
                intent.putExtra("extra_set_pin_education_type", this.A00);
                intent.putExtra("extra_education_type", 0);
                A15(intent, 1013);
                return;
            }
            this.A0G.A07(null, "could not find bank info to reset pin", null);
            A1g();
            return;
        }
        this.A0G.A07(null, "could not find bank account", null);
        A1g();
    }

    public /* synthetic */ void A1s() {
        A1y(true);
        Intent intent = new Intent(this, IndiaUpiEducationActivity.class);
        intent.putExtra("extra_bank_account", this.A04);
        intent.putExtra("extra_education_type", 0);
        startActivityForResult(intent, 1013);
    }

    public /* synthetic */ void A1t() {
        A1y(true);
        ((AbstractActivityC92484Li) this).A07.A00();
    }

    public /* synthetic */ void A1u() {
        AnonymousClass029.A19(getApplicationContext(), IndiaUpiPayIntentReceiverActivity.class, true);
    }

    public final void A1v(int i) {
        A1X();
        if (i == 0) {
            i = R.string.payments_set_pin_error;
        }
        if (!((AbstractActivityC92444Kp) this).A0G) {
            AUj(i);
            return;
        }
        A1W();
        finish();
        Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
        intent.putExtra("error", i);
        A1Z(intent);
        A14(intent);
    }

    public void A1w(C28Q c28q) {
        C0N6 c0n6 = this.A04;
        ((AbstractActivityC92484Li) this).A0F.A03(16, c0n6, c28q);
        ((AbstractActivityC92484Li) this).A0G.A03(16, c0n6, c28q);
        if (c28q == null) {
            this.A0C = ((AbstractActivityC92484Li) this).A05.A06();
            this.A0D = A1U(((AbstractActivityC92484Li) this).A05.A02());
            ((AbstractActivityC92484Li) this).A09.A03("upi-get-credential");
            String str = this.A0C;
            C0N6 c0n62 = this.A04;
            A1m(str, c0n62.A08, this.A0D, (C4IA) c0n62.A06, 1, c0n62.A0A);
        } else if (C90944Da.A03(this, "upi-generate-otp", c28q.A00, true)) {
        } else {
            this.A0G.A07(null, "onRequestOtp failed; showErrorAndFinish", null);
            A1v(R.string.payments_set_pin_opt_not_requested);
        }
    }

    public void A1x(String str) {
        A1y(true);
        if (TextUtils.isEmpty(str)) {
            ((AbstractActivityC92484Li) this).A0E.A00();
            return;
        }
        this.A0D = A1U(((AbstractActivityC92484Li) this).A05.A02());
        this.A07.A00((C4IA) this.A04.A06, null);
        C0N6 c0n6 = this.A04;
        A1m(str, c0n6.A08, this.A0D, (C4IA) c0n6.A06, 1, c0n6.A0A);
    }

    public final void A1y(boolean z) {
        this.A02.setVisibility(z ? 0 : 4);
        this.A01.setVisibility(z ? 0 : 4);
    }

    public final void A1z(boolean z) {
        A1X();
        if (((AbstractActivityC92444Kp) this).A0G) {
            A1W();
            Intent intent = new Intent(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A1Z(intent);
            if (z) {
                intent.putExtra("successInfo", getString(R.string.payments_setup_upi_pin_exists));
            }
            A14(intent);
            finish();
            return;
        }
        AUl(0, R.string.payments_set_pin_success, C40841sx.A0M(this.A04.A0A));
    }

    @Override // X.C48E
    public void AIO(boolean z, boolean z2, C014006r c014006r, C014006r c014006r2, C4GI c4gi, C4GI c4gi2, C28Q c28q) {
        throw new UnsupportedOperationException("onCheckPin unsupported");
    }

    @Override // X.C48E
    public void ALJ(String str, C28Q c28q) {
        Integer num;
        C0N0 c0n0;
        C0N6 c0n6;
        C0N0 c0n02;
        C0N6 c0n62 = this.A04;
        ((AbstractActivityC92484Li) this).A0F.A03(1, c0n62, c28q);
        ((AbstractActivityC92484Li) this).A0G.A03(1, c0n62, c28q);
        if (!TextUtils.isEmpty(str) && (c0n6 = this.A04) != null && (c0n02 = c0n6.A06) != null) {
            if (((AbstractActivityC92444Kp) this).A0G) {
                Intent intent = new Intent(this, IndiaUpiEducationActivity.class);
                intent.putExtra("extra_use_pin_education_type", 1);
                intent.putExtra("extra_bank_account", C40841sx.A0M(this.A04.A0A));
                intent.putExtra("extra_education_type", 1);
                A15(intent, 1010);
                return;
            }
            this.A07.A00((C4IA) c0n02, this);
        } else if (c28q == null || C90944Da.A03(this, "upi-list-keys", c28q.A00, true)) {
        } else {
            if (((AbstractActivityC92484Li) this).A09.A07("upi-list-keys")) {
                ((AbstractActivityC92484Li) this).A05.A0B();
                this.A02.setText(getString(R.string.payments_still_working));
                ((AbstractActivityC92484Li) this).A0E.A00();
                return;
            }
            C014406v c014406v = this.A0G;
            StringBuilder A0P = C000200d.A0P("onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0P.append(num);
            A0P.append(" bankAccount: ");
            A0P.append(this.A04);
            A0P.append(" countrydata: ");
            C0N6 c0n63 = this.A04;
            if (c0n63 != null) {
                c0n0 = c0n63.A06;
            } else {
                c0n0 = null;
            }
            A0P.append(c0n0);
            A0P.append(" failed; ; showErrorAndFinish");
            c014406v.A07(null, A0P.toString(), null);
            A1g();
        }
    }

    @Override // X.C48E
    public void AOZ(C28Q c28q) {
        C0N6 c0n6 = this.A04;
        ((AbstractActivityC92484Li) this).A0F.A03(6, c0n6, c28q);
        ((AbstractActivityC92484Li) this).A0G.A03(6, c0n6, c28q);
        if (c28q == null) {
            this.A0G.A07(null, "onSetPin success; showSuccessAndFinish", null);
            ((AbstractActivityC92444Kp) this).A06.AS1(new C3QK(this));
            A1z(false);
        } else if (C90944Da.A03(this, "upi-set-mpin", c28q.A00, true)) {
        } else {
            C0N6 c0n62 = this.A04;
            if (c0n62 != null && c0n62.A06 != null) {
                int i = c28q.A00;
                if (i == 11460 || i == 11461) {
                    C002701i.A19(this, 14);
                    return;
                } else if (i == 11456 || i == 11471) {
                    C002701i.A19(this, 13);
                    return;
                } else if (i == 11458 || i == 11457) {
                    C002701i.A19(this, 17);
                    return;
                } else if (i == 11459) {
                    C002701i.A19(this, 10);
                    return;
                } else if (i == 11496) {
                    C002701i.A19(this, 16);
                    return;
                } else if (i == 11499) {
                    C002701i.A19(this, 23);
                    return;
                } else {
                    this.A0G.A07(null, "onSetPin failed; showErrorAndFinish", null);
                    A1g();
                    return;
                }
            }
            A1g();
        }
    }

    @Override // X.AbstractActivityC92484Li, X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C014406v c014406v = this.A0G;
        c014406v.A07(null, C000200d.A0F("got result for activity: ", i, " result:", i2), null);
        super.onActivityResult(i, i2, intent);
        if (i == 1010) {
            if (i2 != -1) {
                return;
            }
            this.A03.setText(getString(R.string.setup_pin_requesting_otp));
            this.A07.A00((C4IA) this.A04.A06, this);
        } else if (i == 1013) {
            if (i2 == 101 && intent != null) {
                this.A0B = intent.getStringExtra("extra_india_upi_debit_card_last6");
                this.A09 = intent.getStringExtra("extra_india_upi_debit_card_expiry_month");
                this.A0A = intent.getStringExtra("extra_india_upi_debit_card_expiry_year");
                ((AbstractActivityC92484Li) this).A0E.A00();
                return;
            }
            c014406v.A07(null, "onActivityResult debit card back pressed or unsuccessful", null);
            setResult(0);
            A1W();
            finish();
        }
    }

    @Override // X.C4Lr, X.AbstractActivityC92484Li, X.C4LI, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_pin_setup);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H(getString(R.string.payments_reset_upi_pin_activity_title));
            A0c.A0L(true);
        }
        if (getIntent() != null && getIntent().getExtras() != null) {
            this.A04 = (C0N6) getIntent().getParcelableExtra("extra_bank_account");
            this.A00 = getIntent().getIntExtra("extra_set_pin_education_type", -1);
        } else {
            this.A00 = -1;
        }
        this.A03 = (TextView) findViewById(R.id.payments_upi_pin_setup_title);
        this.A02 = (TextView) findViewById(R.id.payments_upi_pin_setup_desc);
        this.A01 = (ProgressBar) findViewById(R.id.progress);
        this.A07 = new C4C7(this, ((ActivityC02290Ap) this).A0A, ((AbstractActivityC92484Li) this).A01, ((AbstractActivityC92484Li) this).A0H, ((AbstractActivityC92484Li) this).A0C, ((ActivityC02290Ap) this).A0D, ((AbstractActivityC92484Li) this).A04, ((C4KG) this).A0C, this.A05, ((AbstractActivityC92484Li) this).A0F, this.A06, ((AbstractActivityC92484Li) this).A05);
        C14030mF A00 = C14030mF.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A0F;
        IntentFilter intentFilter = new IntentFilter("TRIGGER_OTP");
        HashMap hashMap = A00.A04;
        synchronized (hashMap) {
            C14020mE c14020mE = new C14020mE(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) hashMap.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                hashMap.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c14020mE);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                HashMap hashMap2 = A00.A03;
                ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    hashMap2.put(action, arrayList2);
                }
                arrayList2.add(c14020mE);
            }
        }
    }

    @Override // X.AbstractActivityC92484Li, X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        A1y(false);
        if (i != 10) {
            if (i != 23) {
                if (i == 13) {
                    ((AbstractActivityC92484Li) this).A05.A0C();
                    return A1a(13, getString(R.string.payments_set_pin_retry), R.string.yes, R.string.no, new C3QF(this));
                } else if (i != 14) {
                    if (i != 16) {
                        if (i != 17) {
                            return super.onCreateDialog(i);
                        }
                        return A1a(17, getString(R.string.payments_card_or_expiry_incorrect_with_placeholder, 6), R.string.payments_try_again, R.string.cancel, new C3QE(this));
                    }
                    return A1a(16, getString(R.string.payments_set_pin_atm_pin_incorrect), R.string.payments_try_again, R.string.cancel, new C3QJ(this));
                } else {
                    return A1a(14, getString(R.string.payments_set_pin_otp_incorrect), R.string.payments_try_again, R.string.cancel, new C3QH(this));
                }
            }
            return A1a(23, getString(R.string.payments_set_pin_incorrect_format_error), R.string.payments_try_again, R.string.cancel, new C3QG(this));
        }
        return A1a(10, getString(R.string.payments_set_pin_invalid_pin_retry), R.string.yes, R.string.no, new C3QI(this, ((AbstractActivityC92484Li) this).A05.A06()));
    }

    @Override // X.AbstractActivityC92484Li, X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C91094Dp c91094Dp = this.A08;
        if (c91094Dp != null) {
            c91094Dp.A05(true);
        }
        C14030mF A00 = C14030mF.A00(getApplicationContext());
        BroadcastReceiver broadcastReceiver = this.A0F;
        HashMap hashMap = A00.A04;
        synchronized (hashMap) {
            ArrayList arrayList = (ArrayList) hashMap.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C14020mE c14020mE = (C14020mE) arrayList.get(size);
                c14020mE.A01 = true;
                for (int i = 0; i < c14020mE.A03.countActions(); i++) {
                    String action = c14020mE.A03.getAction(i);
                    HashMap hashMap2 = A00.A03;
                    ArrayList arrayList2 = (ArrayList) hashMap2.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C14020mE c14020mE2 = (C14020mE) arrayList2.get(size2);
                            if (c14020mE2.A02 == broadcastReceiver) {
                                c14020mE2.A01 = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            hashMap2.remove(action);
                        }
                    }
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ((AbstractActivityC92444Kp) this).A0G = bundle.getBoolean("inSetupSavedInst");
        C0N6 c0n6 = (C0N6) bundle.getParcelable("bankAccountSavedInst");
        if (c0n6 != null) {
            this.A04 = c0n6;
            this.A04.A06 = (C0N0) bundle.getParcelable("countryDataSavedInst");
        }
        this.A0B = bundle.getString("debitLast6SavedInst");
        this.A09 = bundle.getString("debitExpiryMonthSavedInst");
        this.A0A = bundle.getString("debitExpiryYearSavedInst");
        this.A0D = bundle.getString("seqNumSavedInst");
        this.A0C = bundle.getString("keysXML");
        this.A0E = (HashMap) bundle.getSerializable("credentialBlobsSavedInst");
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        C014406v c014406v = this.A0G;
        StringBuilder A0P = C000200d.A0P("onResume with states: ");
        A0P.append(((AbstractActivityC92484Li) this).A09);
        c014406v.A07(null, A0P.toString(), null);
        if (isFinishing()) {
            return;
        }
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
        if (((AbstractActivityC92444Kp) this).A0G) {
            bundle.putBoolean("inSetupSavedInst", true);
        }
        C0N6 c0n6 = this.A04;
        if (c0n6 != null) {
            bundle.putParcelable("bankAccountSavedInst", c0n6);
        }
        C0N6 c0n62 = this.A04;
        if (c0n62 != null && (c0n0 = c0n62.A06) != null) {
            bundle.putParcelable("countryDataSavedInst", c0n0);
        }
        String str = this.A0B;
        if (str != null) {
            bundle.putString("debitLast6SavedInst", str);
        }
        String str2 = this.A09;
        if (str2 != null) {
            bundle.putString("debitExpiryMonthSavedInst", str2);
        }
        String str3 = this.A0A;
        if (str3 != null) {
            bundle.putString("debitExpiryYearSavedInst", str3);
        }
        String str4 = this.A0D;
        if (str4 != null) {
            bundle.putString("seqNumSavedInst", str4);
        }
        String str5 = this.A0C;
        if (str5 != null) {
            bundle.putString("keysXML", str5);
        }
        HashMap hashMap = this.A0E;
        if (hashMap != null) {
            bundle.putSerializable("credentialBlobsSavedInst", hashMap);
        }
    }
}
