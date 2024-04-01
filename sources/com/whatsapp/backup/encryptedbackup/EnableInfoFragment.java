package com.whatsapp.backup.encryptedbackup;

import X.AbstractView$OnClickListenerC49532Ky;
import X.C000500h;
import X.C002301c;
import X.C02180Ae;
import X.C06570Tx;
import X.C0AT;
import X.C36281kX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class EnableInfoFragment extends Hilt_EnableInfoFragment {
    public C002301c A00;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.enc_backup_enable_info, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        long j;
        super.A0v(bundle);
        final C36281kX c36281kX = (C36281kX) new C06570Tx(A0A()).A00(C36281kX.class);
        TextView textView = (TextView) C0AT.A0D(view, R.id.enable_info_backup_size_message);
        Object[] objArr = new Object[1];
        C002301c c002301c = this.A00;
        C000500h c000500h = c36281kX.A06;
        String A0F = c000500h.A0F();
        if (A0F != null) {
            j = c000500h.A0B(A0F);
        } else {
            j = 0;
        }
        objArr[0] = C02180Ae.A0k(c002301c, j);
        textView.setText(A0G(R.string.encrypted_backup_enable_info_backup_size_message, objArr));
        C0AT.A0D(view, R.id.enable_info_continue_button).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kN
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                c36281kX.A06(200);
            }
        });
    }
}
