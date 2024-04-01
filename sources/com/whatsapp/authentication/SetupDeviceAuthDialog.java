package com.whatsapp.authentication;

import X.C019208x;
import X.C019308y;
import X.C03170Ep;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class SetupDeviceAuthDialog extends Hilt_SetupDeviceAuthDialog {
    public C03170Ep A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        boolean A07 = this.A00.A07();
        C019208x c019208x = new C019208x(A00());
        int i = R.string.fingerprint_setup_dialog_title;
        if (A07) {
            i = R.string.app_auth_setup_dialog_title;
        }
        String A0F = A0F(i);
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = A0F;
        int i2 = R.string.fingerprint_setup_dialog_message;
        if (A07) {
            i2 = R.string.app_auth_setup_dialog_message;
        }
        c019308y.A0E = A0F(i2);
        c019208x.A08(A0F(R.string.ok), null);
        return c019208x.A00();
    }
}
