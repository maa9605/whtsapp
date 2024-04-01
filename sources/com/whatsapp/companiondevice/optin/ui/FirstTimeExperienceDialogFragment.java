package com.whatsapp.companiondevice.optin.ui;

import X.C019208x;
import X.C019308y;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class FirstTimeExperienceDialogFragment extends Hilt_FirstTimeExperienceDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        C019308y c019308y = c019208x.A01;
        c019308y.A0C = null;
        c019308y.A01 = R.layout.md_opt_in_first_time_dialog;
        c019208x.A08(A0F(R.string.got_it), null);
        return c019208x.A00();
    }
}
