package com.whatsapp.payments.ui;

import X.ActivityC02330At;
import X.C000200d;
import X.C013606n;
import X.C02L;
import X.C0B5;
import X.C0BA;
import X.C0DV;
import X.C0E7;
import X.C28S;
import X.C2OT;
import X.C3PA;
import X.C3PB;
import X.C463026g;
import X.C49S;
import X.C4C4;
import X.C4CV;
import X.C4L8;
import X.C90564Bm;
import X.InterfaceC40271rs;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiContactPicker;

/* loaded from: classes3.dex */
public final class IndiaUpiContactPicker extends C4L8 {

    /* loaded from: classes3.dex */
    public class IndiaUpiContactPickerFragment extends Hilt_IndiaUpiContactPicker_IndiaUpiContactPickerFragment implements C49S {
        public C02L A00;
        public C0E7 A01;
        public C013606n A02;
        public C90564Bm A03;
        public C28S A04;
        public C2OT A05;
        public C463026g A06;
        public C0DV A07;
        public C4CV A08;
        public PaymentBottomSheet A09;

        @Override // com.whatsapp.contact.picker.ContactPickerFragment
        public boolean A1a() {
            return true;
        }

        @Override // X.C0BA
        public void A0r() {
            ((C0BA) this).A0U = true;
            this.A09 = null;
        }

        @Override // X.C0BA
        public void A0w(View view, Bundle bundle) {
            this.A09 = new PaymentBottomSheet();
        }

        @Override // com.whatsapp.contact.picker.ContactPickerFragment
        public void A14() {
            View A10 = A10(R.drawable.ic_send_to_upi, R.drawable.grey_circle_stroke, R.string.send_payment_to_vpa, new C3PA(this));
            View A102 = A10(R.drawable.ic_scan_qr, R.drawable.green_circle, R.string.payment_scan_qr_title, new C3PB(this));
            ListView listView = (ListView) ((ContactPickerFragment) this).A07.findViewById(16908298);
            ((ContactPickerFragment) this).A0A = listView;
            listView.addHeaderView(A10, null, true);
            ((ContactPickerFragment) this).A0A.addHeaderView(A102, null, true);
            super.A14();
        }

        @Override // com.whatsapp.payments.ui.PaymentContactPickerFragment
        public void A1e(UserJid userJid) {
            new C4C4(((Hilt_IndiaUpiContactPicker_IndiaUpiContactPickerFragment) this).A00, ((ContactPickerFragment) this).A0F, this.A00, this.A07, this.A01, this.A06, this.A02, this.A08, this.A04, this.A03, null).A00(userJid, null);
            super.A1e(userJid);
        }

        public void A1f() {
            IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = new IndiaUpiSendPaymentToVpaDialogFragment();
            indiaUpiSendPaymentToVpaDialogFragment.A0F = this;
            PaymentBottomSheet paymentBottomSheet = this.A09;
            paymentBottomSheet.A01 = indiaUpiSendPaymentToVpaDialogFragment;
            ((ContactPickerFragment) this).A0a.AUh(paymentBottomSheet);
        }

        public void A1g() {
            A0i(new Intent(((Hilt_IndiaUpiContactPicker_IndiaUpiContactPickerFragment) this).A00, IndiaUpiQrCodeScanActivity.class));
        }

        public void A1h(String str, boolean z) {
            if (z) {
                Bundle A02 = C000200d.A02("extra_payment_handle", str);
                IndiaUpiSendPaymentToVpaDialogFragment indiaUpiSendPaymentToVpaDialogFragment = new IndiaUpiSendPaymentToVpaDialogFragment();
                indiaUpiSendPaymentToVpaDialogFragment.A0P(A02);
                indiaUpiSendPaymentToVpaDialogFragment.A0F = this;
                PaymentBottomSheet paymentBottomSheet = this.A09;
                paymentBottomSheet.A01 = indiaUpiSendPaymentToVpaDialogFragment;
                ((ContactPickerFragment) this).A0a.AUh(paymentBottomSheet);
                return;
            }
            ((C0B5) A09()).AUl(0, R.string.unblock_payment_id_error_default, A0F(R.string.india_upi_payment_id_name));
        }

        @Override // X.C49S
        public void AIE() {
            this.A09.A18();
        }

        @Override // X.C49S
        public void AQR(UserJid userJid, final String str) {
            this.A09.A18();
            ActivityC02330At A09 = A09();
            if (A09 != null) {
                this.A05.A01(A09, userJid, str, false, false, new InterfaceC40271rs() { // from class: X.3ix
                    @Override // X.InterfaceC40271rs
                    public final void AOE(boolean z) {
                        IndiaUpiContactPicker.IndiaUpiContactPickerFragment.this.A1h(str, z);
                    }
                });
            }
        }

        @Override // X.C49S
        public void AQS(String str, String str2, String str3) {
            this.A09.A18();
            ActivityC02330At A09 = A09();
            if (A09 != null) {
                Intent A01 = ((PaymentContactPickerFragment) this).A02.A01(A09, false, true);
                A01.putExtra("extra_payment_handle", str);
                A01.putExtra("extra_payment_handle_id", str2);
                A01.putExtra("extra_payee_name", str3);
                A09.startActivity(A01);
            }
        }
    }

    @Override // com.whatsapp.ContactPicker
    public ContactPickerFragment A1V() {
        return new IndiaUpiContactPickerFragment();
    }
}
