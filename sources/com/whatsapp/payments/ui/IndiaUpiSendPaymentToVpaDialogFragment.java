package com.whatsapp.payments.ui;

import X.ActivityC02330At;
import X.C000200d;
import X.C002301c;
import X.C013606n;
import X.C014406v;
import X.C018508q;
import X.C02160Ac;
import X.C0AT;
import X.C0E7;
import X.C28S;
import X.C2JT;
import X.C2MB;
import X.C3QM;
import X.C3QN;
import X.C45A;
import X.C463026g;
import X.C49682Lx;
import X.C49S;
import X.C4AU;
import X.C4C8;
import X.C894947f;
import X.C90564Bm;
import X.InterfaceC53332eX;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment;

/* loaded from: classes3.dex */
public class IndiaUpiSendPaymentToVpaDialogFragment extends Hilt_IndiaUpiSendPaymentToVpaDialogFragment implements InterfaceC53332eX {
    public EditText A00;
    public ProgressBar A01;
    public TextView A02;
    public C018508q A03;
    public Button A04;
    public Button A05;
    public C0E7 A06;
    public C002301c A07;
    public C013606n A08;
    public C45A A09;
    public C894947f A0A;
    public C90564Bm A0B;
    public C28S A0C;
    public C463026g A0D;
    public C4C8 A0E;
    public C49S A0F;
    public C49682Lx A0G;
    public C2MB A0H;
    public String A0I;
    public final C014406v A0J = C014406v.A00("IndiaUpiSendPaymentToVpaDialogFragment", "payment", "IN");

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.india_upi_enter_vpa_dialog, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0r() {
        this.A0U = true;
        this.A0E = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = null;
        this.A05 = null;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        this.A0E = new C4C8(((Hilt_IndiaUpiSendPaymentToVpaDialogFragment) this).A00, this.A03, this.A0G, this.A06, this.A0A, this.A0D, this.A08, this.A09, this.A0C);
        this.A00 = (EditText) C0AT.A0D(view, R.id.account_id_handle);
        this.A01 = (ProgressBar) C0AT.A0D(view, R.id.progress);
        this.A02 = (TextView) C0AT.A0D(view, R.id.error_text);
        this.A04 = (Button) C0AT.A0D(view, R.id.close_dialog_button);
        Button button = (Button) C0AT.A0D(view, R.id.primary_payment_button);
        this.A05 = button;
        button.setEnabled(false);
        this.A00.addTextChangedListener(new C2JT() { // from class: X.4Dr
            {
                IndiaUpiSendPaymentToVpaDialogFragment.this = this;
            }

            @Override // X.C2JT, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = IndiaUpiSendPaymentToVpaDialogFragment.this;
                indiaUpiSendPaymentToVpaDialogFragment.A02.setVisibility(4);
                indiaUpiSendPaymentToVpaDialogFragment.A05.setEnabled(editable.toString().length() > 0);
                EditText editText = indiaUpiSendPaymentToVpaDialogFragment.A00;
                C0AT.A0Z(editText, C02160Ac.A02(editText.getContext(), R.color.primary));
            }
        });
        this.A04.setOnClickListener(new C3QM(this));
        this.A05.setOnClickListener(new C3QN(this));
        Bundle bundle2 = super.A06;
        if (bundle2 != null) {
            String string = bundle2.getString("extra_payment_handle", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.A00.setText(string);
            A10();
        }
    }

    /* renamed from: A0y */
    public final void A10() {
        String lowerCase = C000200d.A0A(this.A00).toLowerCase(this.A07.A0I());
        this.A0I = lowerCase;
        if (!C4AU.A01(lowerCase)) {
            A11(R.string.payment_invalid_vpa_error_text);
            return;
        }
        String A05 = this.A0B.A05();
        String str = this.A0I;
        if (str.equalsIgnoreCase(A05)) {
            A11(R.string.payment_self_vpa_error_text);
        } else if (this.A09.A07(str)) {
            C49S c49s = this.A0F;
            if (c49s != null) {
                c49s.AQR(null, this.A0I);
            }
        } else {
            this.A01.setVisibility(0);
            this.A05.setEnabled(false);
            this.A00.setEnabled(false);
            this.A0E.A00(this.A0I, null, this);
        }
    }

    public /* synthetic */ void A0z() {
        C49S c49s = this.A0F;
        if (c49s != null) {
            c49s.AIE();
        }
    }

    public final void A11(int i) {
        C014406v c014406v = this.A0J;
        StringBuilder sb = new StringBuilder("showErrorText: ");
        sb.append(i);
        c014406v.A07(null, sb.toString(), null);
        this.A02.setVisibility(0);
        this.A02.setText(i);
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            C0AT.A0Z(this.A00, C02160Ac.A02(A09, R.color.red_button_text));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0038, code lost:
        if (r9 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0044, code lost:
        if (r0 != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0046, code lost:
        A11(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0049, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x004a, code lost:
        r0 = com.google.android.search.verification.client.R.string.payment_invalid_vpa_error_text;
     */
    @Override // X.InterfaceC53332eX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AOF(boolean r3, boolean r4, java.lang.String r5, java.lang.String r6, com.whatsapp.jid.UserJid r7, boolean r8, X.C28Q r9) {
        /*
            r2 = this;
            android.view.View r0 = r2.A0A
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.ProgressBar r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.components.Button r0 = r2.A05
            r1 = 1
            r0.setEnabled(r1)
            android.widget.EditText r0 = r2.A00
            r0.setEnabled(r1)
            if (r3 == 0) goto L38
            if (r9 != 0) goto L3a
            if (r8 == 0) goto L27
            X.49S r1 = r2.A0F
            if (r1 == 0) goto L26
            java.lang.String r0 = r2.A0I
            r1.AQR(r7, r0)
        L26:
            return
        L27:
            X.2MB r1 = r2.A0H
            android.widget.EditText r0 = r2.A00
            r1.A01(r0)
            X.49S r1 = r2.A0F
            if (r1 == 0) goto L26
            java.lang.String r0 = r2.A0I
            r1.AQS(r0, r6, r5)
            return
        L38:
            if (r9 == 0) goto L4a
        L3a:
            int r1 = r9.A00
            X.47f r0 = r2.A0A
            X.3NV r0 = r0.A04
            int r0 = X.C90944Da.A00(r1, r0)
            if (r0 == 0) goto L4a
        L46:
            r2.A11(r0)
            return
        L4a:
            r0 = 2131888606(0x7f1209de, float:1.9411852E38)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaDialogFragment.AOF(boolean, boolean, java.lang.String, java.lang.String, com.whatsapp.jid.UserJid, boolean, X.28Q):void");
    }
}
