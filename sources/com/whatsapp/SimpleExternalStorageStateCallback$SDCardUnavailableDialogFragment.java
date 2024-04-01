package com.whatsapp;

import X.C000400f;
import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

/* loaded from: classes.dex */
public class SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment extends Hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment {
    public C000400f A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        boolean A01 = C000400f.A01();
        int i = R.string.record_need_sd_card_title_shared_storage;
        if (A01) {
            i = R.string.record_need_sd_card_title;
        }
        c019208x.A03(i);
        int i2 = R.string.record_need_sd_card_message_shared_storage;
        if (A01) {
            i2 = R.string.record_need_sd_card_message;
        }
        c019208x.A02(i2);
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1IZ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                dialogInterface.dismiss();
            }
        });
        return c019208x.A00();
    }
}
