package com.whatsapp.backup.encryptedbackup;

import X.AbstractView$OnClickListenerC49532Ky;
import X.C06570Tx;
import X.C0AT;
import X.C36281kX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class EnableDoneFragment extends Hilt_EnableDoneFragment {
    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.enc_backup_enable_done, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        super.A0v(bundle);
        final C36281kX c36281kX = (C36281kX) new C06570Tx(A0A()).A00(C36281kX.class);
        C0AT.A0D(view, R.id.enable_done_done_button).setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.1kM
            @Override // X.AbstractView$OnClickListenerC49532Ky
            public void A00(View view2) {
                C36281kX.this.A05(-1);
            }
        });
    }
}
