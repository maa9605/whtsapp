package com.whatsapp;

import X.ActivityC02330At;
import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment extends Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        c019208x.A03(R.string.app_name);
        c019208x.A02(R.string.device_unsupported);
        c019208x.A01.A0J = false;
        c019208x.A06(R.string.ok, null);
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        ActivityC02330At A09 = A09();
        if (A09 != null) {
            A09.finish();
        }
    }
}
