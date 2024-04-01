package com.whatsapp.companiondevice;

import X.C649635j;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.WifiSpeedBumpDialogFragment;

/* loaded from: classes2.dex */
public class WifiSpeedBumpDialogFragment extends Hilt_WifiSpeedBumpDialogFragment {
    public final C649635j A00;

    public WifiSpeedBumpDialogFragment(C649635j c649635j) {
        this.A00 = c649635j;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        return new AlertDialog.Builder(((Hilt_WifiSpeedBumpDialogFragment) this).A00).setTitle(R.string.wifi_speed_bump_dialog_title).setMessage(R.string.wifi_speed_bump_dialog_body).setPositiveButton(R.string.wifi_speed_bump_dialog_use_data_button_text, new DialogInterface.OnClickListener() { // from class: X.2pN
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WifiSpeedBumpDialogFragment.this.A00.A00.A1U();
            }
        }).setNegativeButton(R.string.wifi_speed_bump_dialog_cancel_button_text, (DialogInterface.OnClickListener) null).create();
    }
}
