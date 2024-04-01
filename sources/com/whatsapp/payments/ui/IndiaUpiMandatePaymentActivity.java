package com.whatsapp.payments.ui;

import X.AbstractActivityC92484Li;
import X.C000200d;
import X.C002701i;
import X.C014006r;
import X.C014406v;
import X.C018508q;
import X.C0E7;
import X.C0N2;
import X.C28661Tc;
import X.C28Q;
import X.C28S;
import X.C463026g;
import X.C4A3;
import X.C4C5;
import X.C4CE;
import X.C4F9;
import X.C4GI;
import X.C4Lp;
import X.C901049r;
import X.C901149s;
import X.C901249t;
import X.C90944Da;
import X.InterfaceC05620Pl;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* loaded from: classes3.dex */
public class IndiaUpiMandatePaymentActivity extends C4Lp {
    public C018508q A00;
    public C0E7 A01;
    public C28S A02;
    public C463026g A03;
    public C4F9 A04;
    public C901249t A05;
    public final C014406v A06 = C014406v.A00("IndiaUpiMandatePaymentActivity", "payment-settings", "IN");

    @Override // X.C48E
    public void AIO(boolean z, boolean z2, C014006r c014006r, C014006r c014006r2, C4GI c4gi, C4GI c4gi2, C28Q c28q) {
    }

    public void A1n(C901149s c901149s) {
        int i = c901149s.A00;
        if (i == 0) {
            ((AbstractActivityC92484Li) this).A09.A03("upi-get-credential");
            A1l(c901149s.A07, c901149s.A06, c901149s.A01, c901149s.A03, c901149s.A02, c901149s.A09, c901149s.A08, null);
        } else if (i == 1) {
            overridePendingTransition(0, 0);
            finish();
        } else if (i == 2) {
            A1g();
        } else if (i == 3) {
            A1D(c901149s.A05, c901149s.A04);
        }
    }

    public /* synthetic */ void A1o(C4A3 c4a3) {
        ARS();
        if (c4a3.A01) {
            return;
        }
        A1C(c4a3.A00);
    }

    @Override // X.C48E
    public void ALJ(String str, C28Q c28q) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A06.A07(null, "onListKeys contains non empty keys", null);
            C901049r c901049r = new C901049r(1);
            c901049r.A01 = str;
            this.A04.A08(c901049r);
        } else if (c28q == null || C90944Da.A03(this, "upi-list-keys", c28q.A00, false)) {
        } else {
            if (((AbstractActivityC92484Li) this).A09.A07("upi-list-keys")) {
                ((AbstractActivityC92484Li) this).A05.A0B();
                ARS();
                A12(R.string.payments_still_working);
                ((AbstractActivityC92484Li) this).A0E.A00();
                return;
            }
            C014406v c014406v = this.A06;
            StringBuilder A0P = C000200d.A0P("onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0P.append(num);
            A0P.append(" failed; ; showErrorAndFinish");
            c014406v.A07(null, A0P.toString(), null);
            A1g();
        }
    }

    @Override // X.C48E
    public void AOZ(C28Q c28q) {
        C014406v c014406v = this.A06;
        throw new UnsupportedOperationException(c014406v.A02(c014406v.A02, "onSetPin unsupported").toString());
    }

    @Override // X.C4Lp, X.AbstractActivityC92484Li, X.C4LI, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final C4C5 c4c5 = new C4C5(this, this.A00, ((AbstractActivityC92484Li) this).A09, ((AbstractActivityC92484Li) this).A0H, this.A01, this.A03, this.A02);
        final C901249t c901249t = this.A05;
        final String stringExtra = getIntent().getStringExtra("payment_transaction_info_id");
        final C0N2 c0n2 = (C0N2) getIntent().getParcelableExtra("payment_method");
        final C4CE c4ce = ((AbstractActivityC92484Li) this).A0E;
        final boolean booleanExtra = getIntent().getBooleanExtra("is_accept_mandate", true);
        final String A1U = A1U(((AbstractActivityC92484Li) this).A05.A02());
        if (c901249t != null) {
            C4F9 c4f9 = (C4F9) C002701i.A0J(this, new C28661Tc() { // from class: X.4Ho
                @Override // X.C28661Tc, X.C0CR
                public C0MU A6e(Class cls) {
                    if (cls.isAssignableFrom(C4F9.class)) {
                        IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = this;
                        C901249t c901249t2 = c901249t;
                        return new C4F9(indiaUpiMandatePaymentActivity, c901249t2.A00, c901249t2.A0X, c901249t2.A0E, c901249t2.A0A, c901249t2.A0P, c901249t2.A0C, c901249t2.A0L, stringExtra, c0n2, c4ce, c4c5, booleanExtra, A1U);
                    }
                    throw new IllegalArgumentException("Invalid viewModel");
                }
            }).A00(C4F9.class);
            this.A04 = c4f9;
            c4f9.A01.A05(c4f9.A00, new InterfaceC05620Pl() { // from class: X.3j1
                {
                    IndiaUpiMandatePaymentActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    IndiaUpiMandatePaymentActivity.this.A1o((C4A3) obj);
                }
            });
            C4F9 c4f92 = this.A04;
            c4f92.A05.A05(c4f92.A00, new InterfaceC05620Pl() { // from class: X.3j0
                {
                    IndiaUpiMandatePaymentActivity.this = this;
                }

                @Override // X.InterfaceC05620Pl
                public final void AIK(Object obj) {
                    IndiaUpiMandatePaymentActivity.this.A1n((C901149s) obj);
                }
            });
            this.A04.A08(new C901049r(0));
            return;
        }
        throw null;
    }
}
