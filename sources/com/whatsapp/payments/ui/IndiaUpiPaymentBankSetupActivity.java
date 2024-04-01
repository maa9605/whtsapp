package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.ActivityC02290Ap;
import X.AnonymousClass484;
import X.C000200d;
import X.C013606n;
import X.C014406v;
import X.C02590Ca;
import X.C04P;
import X.C0GZ;
import X.C0U1;
import X.C28Q;
import X.C28S;
import X.C36971lf;
import X.C37311mD;
import X.C3NV;
import X.C48B;
import X.C4C0;
import X.C4CV;
import X.C4CW;
import X.C4KG;
import X.C4LD;
import X.C894947f;
import X.C90544Bk;
import X.C90564Bm;
import X.C90944Da;
import X.C91754Gd;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentBankSetupActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class IndiaUpiPaymentBankSetupActivity extends C4LD implements AnonymousClass484 {
    public C013606n A00;
    public C894947f A01;
    public C90564Bm A02;
    public C0GZ A03;
    public C28S A04;
    public C3NV A05;
    public C4C0 A06;
    public C4CV A07;
    public C4CW A08;
    public final C014406v A09 = C014406v.A00("IndiaUpiPaymentBankSetupActivity", "onboarding", "IN");

    public final void A1a() {
        this.A09.A07(null, "showBanksList called", null);
        Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
        intent.putParcelableArrayListExtra("extra_banks_list", this.A01.A06);
        intent.addFlags(335544320);
        A1Z(intent);
        A14(intent);
        finish();
    }

    public final void A1b(int i) {
        C014406v c014406v = this.A09;
        StringBuilder sb = new StringBuilder("showErrorAndFinish: ");
        sb.append(i);
        c014406v.A07(null, sb.toString(), null);
        A1X();
        if (i == 0) {
            i = R.string.payments_setup_error;
            String str = this.A05.A03;
            if ("upi-batch".equalsIgnoreCase(str)) {
                i = R.string.payments_error_create_payment_account;
            } else if ("upi-get-banks".equalsIgnoreCase(str)) {
                i = R.string.payments_error_banks_list;
            }
        }
        if (((AbstractActivityC92444Kp) this).A0G) {
            A1W();
            Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
            intent.putExtra("error", i);
            A1Z(intent);
            A14(intent);
            finish();
            return;
        }
        AUj(i);
    }

    public void A1c(C28Q c28q) {
        A1d(c28q, true);
        if (C90944Da.A03(this, "upi-batch", c28q.A00, false)) {
            return;
        }
        C014406v c014406v = this.A09;
        StringBuilder sb = new StringBuilder("onBatchError: ");
        sb.append(c28q);
        sb.append("; showErrorAndFinish");
        c014406v.A07(null, sb.toString(), null);
        A1b(C90944Da.A00(c28q.A00, this.A05));
    }

    public final void A1d(C28Q c28q, boolean z) {
        C36971lf A01 = this.A07.A01(z ? 3 : 4);
        if (c28q != null) {
            A01.A05 = String.valueOf(c28q.A00);
            A01.A06 = c28q.A06;
        }
        int i = 2;
        A01.A01 = Integer.valueOf(c28q != null ? 2 : 1);
        ((AbstractActivityC92444Kp) this).A04.A0B(A01, null, false);
        C014406v c014406v = this.A09;
        StringBuilder sb = new StringBuilder("logBanksList: ");
        sb.append(A01);
        c014406v.A07(null, sb.toString(), null);
        C37311mD A012 = this.A08.A01(z ? 3 : 4);
        if (c28q != null) {
            A012.A0M = String.valueOf(c28q.A00);
            A012.A0N = c28q.A06;
        } else {
            i = 1;
        }
        A012.A07 = Integer.valueOf(i);
        ((AbstractActivityC92444Kp) this).A04.A0B(A012, null, false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("logBanksList: ");
        sb2.append(A012);
        c014406v.A07(null, sb2.toString(), null);
    }

    public void A1e(ArrayList arrayList, ArrayList arrayList2, C90544Bk c90544Bk, C28Q c28q) {
        C014406v c014406v = this.A09;
        StringBuilder A0P = C000200d.A0P("banks returned: ");
        A0P.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
        c014406v.A07(null, A0P.toString(), null);
        A1d(c28q, !this.A03.A09());
        if (C4C0.A00(this.A02, arrayList, arrayList2, c90544Bk)) {
            A1a();
        } else if (c28q != null) {
            if (C90944Da.A03(this, "upi-get-banks", c28q.A00, true)) {
                return;
            }
            if (this.A05.A07("upi-get-banks")) {
                StringBuilder A0P2 = C000200d.A0P("onBanksList failure. Retry sendGetBanksList error: ");
                A0P2.append(this.A05.A00("upi-get-banks"));
                c014406v.A07(null, A0P2.toString(), null);
                this.A06.A01();
                this.A07.A03.A04();
                this.A08.A03.A04();
                return;
            }
            StringBuilder A0P3 = C000200d.A0P("onBanksList failure. showErrorAndFinish error: ");
            A0P3.append(this.A05.A00("upi-get-banks"));
            c014406v.A07(null, A0P3.toString(), null);
            A1b(C90944Da.A00(c28q.A00, this.A05));
        } else {
            StringBuilder A0P4 = C000200d.A0P("onBanksList empty. showErrorAndFinish error: ");
            A0P4.append(this.A05.A00("upi-get-banks"));
            c014406v.A07(null, A0P4.toString(), null);
            A1b(C90944Da.A00(0, this.A05));
        }
    }

    @Override // X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.A09.A08(C000200d.A0F("onActivityResult: request: ", i, " result: ", i2), null);
        if (i != 1000) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            A1W();
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        findViewById(R.id.hero_payments).setVisibility(configuration.orientation == 2 ? 8 : 0);
    }

    @Override // X.C4LD, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_bank_setup);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A08(R.string.payments_add_bank_account_activity_title);
            A0c.A0L(true);
        }
        C894947f c894947f = this.A01;
        this.A05 = c894947f.A04;
        this.A06 = new C4C0(this, ((ActivityC02290Ap) this).A0A, ((C4KG) this).A0F, ((ActivityC02290Ap) this).A0D, c894947f, ((C4KG) this).A0C, this.A00, this.A04, this.A02, this);
        onConfigurationChanged(getResources().getConfiguration());
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A06.A00 = null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (isFinishing()) {
            return;
        }
        C014406v c014406v = this.A09;
        StringBuilder A0P = C000200d.A0P("bank setup onResume states: ");
        A0P.append(this.A05);
        c014406v.A07(null, A0P.toString(), null);
        if (this.A01.A06 == null) {
            if (!this.A03.A09()) {
                final C4C0 c4c0 = this.A06;
                if (c4c0 != null) {
                    Log.i("PAY: IndiaUpiPaymentSetup createPaymentAccountBatch called");
                    C3NV c3nv = ((C48B) c4c0).A00;
                    c3nv.A04("upi-batch");
                    ((C48B) c4c0).A01.A0F("set", new C02590Ca("account", new C04P[]{new C04P("action", "upi-batch", null, (byte) 0), new C04P("version", 2)}, null, null), new C91754Gd(c4c0.A01, c4c0.A02, c4c0.A03, c4c0.A07, c3nv) { // from class: X.4ID
                        @Override // X.C91754Gd, X.C28V
                        public void A02(C28Q c28q) {
                            super.A02(c28q);
                            AnonymousClass484 anonymousClass484 = c4c0.A00;
                            if (anonymousClass484 != null) {
                                ((IndiaUpiPaymentBankSetupActivity) anonymousClass484).A1c(c28q);
                            }
                        }

                        @Override // X.C91754Gd, X.C28V
                        public void A03(C28Q c28q) {
                            super.A03(c28q);
                            AnonymousClass484 anonymousClass484 = c4c0.A00;
                            if (anonymousClass484 != null) {
                                ((IndiaUpiPaymentBankSetupActivity) anonymousClass484).A1c(c28q);
                            }
                        }

                        @Override // X.C91754Gd, X.C28V
                        public void A04(C02590Ca c02590Ca) {
                            super.A04(c02590Ca);
                            C4C0 c4c02 = c4c0;
                            C2EG ABu = c4c02.A08.A03().ABu();
                            if (ABu != null) {
                                ArrayList AQa = ABu.AQa(c4c02.A04, c02590Ca);
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                C90544Bk c90544Bk = null;
                                for (int i = 0; i < AQa.size(); i++) {
                                    C0K9 c0k9 = (C0K9) AQa.get(i);
                                    if (c0k9 instanceof C90544Bk) {
                                        C90544Bk c90544Bk2 = (C90544Bk) c0k9;
                                        Bundle bundle = c90544Bk2.A00;
                                        if (bundle != null && bundle.getString("keys") != null) {
                                            ((C48B) c4c02).A00.A05("upi-list-keys");
                                            Bundle bundle2 = ((C90544Bk) AQa.get(i)).A00;
                                            String string = bundle2 != null ? bundle2.getString("keys") : null;
                                            if (!TextUtils.isEmpty(string)) {
                                                c4c02.A06.A0E(string);
                                            }
                                        } else if (c90544Bk2.A05() != null) {
                                            arrayList2.add(c90544Bk2);
                                        } else {
                                            Bundle bundle3 = c90544Bk2.A00;
                                            if (bundle3 != null && bundle3.getStringArrayList("pspRouting") != null) {
                                                c90544Bk = c90544Bk2;
                                            }
                                        }
                                    } else if (c0k9 instanceof C4IA) {
                                        arrayList.add(c0k9);
                                    }
                                }
                                if (C4C0.A00(c4c02.A06, arrayList, arrayList2, c90544Bk)) {
                                    c4c02.A05.A09(arrayList, arrayList2, c90544Bk);
                                    ((C48B) c4c02).A00.A05("upi-get-banks");
                                    AnonymousClass484 anonymousClass484 = c4c02.A00;
                                    if (anonymousClass484 != null) {
                                        ((IndiaUpiPaymentBankSetupActivity) anonymousClass484).A1e(arrayList, arrayList2, c90544Bk, null);
                                    }
                                } else {
                                    StringBuilder sb = new StringBuilder("PAY: received invalid objects from batch: banks: ");
                                    sb.append(arrayList);
                                    sb.append(" psps: ");
                                    sb.append(arrayList2);
                                    sb.append(" pspRouting: ");
                                    sb.append(c90544Bk);
                                    sb.append(" , try get bank list directly.");
                                    Log.w(sb.toString());
                                    c4c02.A01();
                                }
                                C3NV c3nv2 = ((C48B) c4c02).A00;
                                ArrayList arrayList3 = c3nv2.A04;
                                if (!arrayList3.contains("upi-list-keys")) {
                                    c3nv2.A06("upi-list-keys", 500);
                                }
                                if (arrayList3.contains("upi-get-banks")) {
                                    return;
                                }
                                c3nv2.A06("upi-get-banks", 500);
                                return;
                            }
                            throw null;
                        }
                    }, 0L);
                } else {
                    throw null;
                }
            } else {
                this.A06.A01();
            }
            this.A07.A03.A04();
            this.A08.A03.A04();
            return;
        }
        A1a();
    }
}
