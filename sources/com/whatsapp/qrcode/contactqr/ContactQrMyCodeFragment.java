package com.whatsapp.qrcode.contactqr;

import X.C000200d;
import X.C02L;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ContactQrMyCodeFragment extends Hilt_ContactQrMyCodeFragment {
    public C02L A00;
    public ContactQrContactCardView A01;
    public String A02;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.contact_qr_my_code, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.contact_qr_card);
        if (findViewById != null) {
            ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) findViewById;
            this.A01 = contactQrContactCardView;
            contactQrContactCardView.setStyle(0);
            ContactQrContactCardView contactQrContactCardView2 = this.A01;
            C02L c02l = this.A00;
            c02l.A05();
            contactQrContactCardView2.A01(c02l.A01, true);
            this.A01.setPrompt(A0F(R.string.contact_qr_prompt));
            ContactQrContactCardView contactQrContactCardView3 = this.A01;
            if (contactQrContactCardView3 != null && (str = this.A02) != null) {
                contactQrContactCardView3.setQrCode(C000200d.A0H("https://wa.me/qr/", str));
            }
            return inflate;
        }
        throw null;
    }
}
