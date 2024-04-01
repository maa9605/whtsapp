package com.whatsapp.payments.ui;

import X.ActivityC02330At;
import X.C003701t;
import X.C06570Tx;
import X.C06C;
import X.C0DV;
import X.C0DW;
import X.C0GZ;
import X.C2MY;
import X.C78373jo;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* loaded from: classes3.dex */
public class PaymentContactPickerFragment extends Hilt_PaymentContactPickerFragment {
    public C003701t A00;
    public C0GZ A01;
    public C2MY A02;
    public C0DW A03;
    public C0DV A04;
    public C78373jo A05;

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1S() {
        return false;
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1T() {
        return false;
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1U() {
        return false;
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1V() {
        return false;
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1W() {
        return false;
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1X() {
        return false;
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1Z() {
        return true;
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment, X.C0BA
    public void A0j(Bundle bundle) {
        super.A0j(bundle);
        A11().A08(R.string.new_payment);
        this.A05 = (C78373jo) new C06570Tx(A0A()).A00(C78373jo.class);
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public String A12(C06C c06c) {
        if (this.A03.A06((UserJid) c06c.A03(UserJid.class))) {
            return null;
        }
        return this.A0p.A06(R.string.contact_cant_receive_payments);
    }

    @Override // com.whatsapp.contact.picker.ContactPickerFragment
    public boolean A1c(C06C c06c, Intent intent) {
        UserJid userJid = (UserJid) c06c.A03(UserJid.class);
        if (this.A03.A06(userJid)) {
            A0A();
            A1e(userJid);
            return true;
        }
        return true;
    }

    public void A1e(UserJid userJid) {
        Intent A01 = this.A02.A01(A0a(), false, false);
        A01.putExtra("extra_jid", userJid.getRawString());
        A0i(A01);
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            A09.finish();
        }
    }
}
