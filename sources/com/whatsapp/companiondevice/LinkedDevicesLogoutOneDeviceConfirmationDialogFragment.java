package com.whatsapp.companiondevice;

import X.C019208x;
import X.C2J1;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesLogoutOneDeviceConfirmationDialogFragment;

/* loaded from: classes2.dex */
public class LinkedDevicesLogoutOneDeviceConfirmationDialogFragment extends Hilt_LinkedDevicesLogoutOneDeviceConfirmationDialogFragment {
    public final C2J1 A00;

    public LinkedDevicesLogoutOneDeviceConfirmationDialogFragment(C2J1 c2j1) {
        this.A00 = c2j1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        c019208x.A02(R.string.confirmation_delete_qr);
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.log_out, new DialogInterface.OnClickListener() { // from class: X.2pL
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LinkedDevicesLogoutOneDeviceConfirmationDialogFragment linkedDevicesLogoutOneDeviceConfirmationDialogFragment = LinkedDevicesLogoutOneDeviceConfirmationDialogFragment.this;
                Bundle A02 = linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A02();
                String string = A02.getString("browserId");
                String string2 = A02.getString("deviceJid");
                if (string != null) {
                    linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A00.A01(string);
                } else {
                    linkedDevicesLogoutOneDeviceConfirmationDialogFragment.A00.A00(string2);
                }
            }
        });
        return c019208x.A00();
    }
}
