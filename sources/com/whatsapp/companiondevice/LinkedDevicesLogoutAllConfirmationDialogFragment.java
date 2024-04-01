package com.whatsapp.companiondevice;

import X.C019208x;
import X.C2J1;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.LinkedDevicesLogoutAllConfirmationDialogFragment;

/* loaded from: classes2.dex */
public class LinkedDevicesLogoutAllConfirmationDialogFragment extends Hilt_LinkedDevicesLogoutAllConfirmationDialogFragment {
    public final C2J1 A00;

    public LinkedDevicesLogoutAllConfirmationDialogFragment(C2J1 c2j1) {
        this.A00 = c2j1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        c019208x.A02(R.string.confirmation_delete_all_qr);
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.log_out, new DialogInterface.OnClickListener() { // from class: X.2pK
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C2J1 c2j1 = LinkedDevicesLogoutAllConfirmationDialogFragment.this.A00;
                C20R c20r = c2j1.A00;
                if (!c20r.A1F(R.string.connectivity_check_connection)) {
                    c20r.A07.AS1(new RunnableEBaseShape1S0100000_I0_1(c2j1, 22));
                }
            }
        });
        return c019208x.A00();
    }
}
