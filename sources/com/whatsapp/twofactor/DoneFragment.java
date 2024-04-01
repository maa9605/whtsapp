package com.whatsapp.twofactor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I0_5;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class DoneFragment extends Hilt_DoneFragment {
    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_two_factor_auth_done, viewGroup, false);
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        view.findViewById(R.id.done_button).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I0_5(this, 38));
        TwoFactorAuthActivity twoFactorAuthActivity = (TwoFactorAuthActivity) A09();
        twoFactorAuthActivity.A1R(view, twoFactorAuthActivity.A06.length);
    }
}
