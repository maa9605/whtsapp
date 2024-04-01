package com.whatsapp.invites;

import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;

/* loaded from: classes2.dex */
public class NobodyDeprecatedDialogFragment extends Hilt_NobodyDeprecatedDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(((Hilt_NobodyDeprecatedDialogFragment) this).A00);
        c019208x.A02(R.string.group_add_nobody_is_discontinued_dialog_text);
        c019208x.A06(R.string.btn_continue, new DialogInterface.OnClickListener() { // from class: X.2xK
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ActivityC02330At A09 = NobodyDeprecatedDialogFragment.this.A09();
                if (A09 instanceof C2O0) {
                    ((C2O0) A09).A6W();
                }
            }
        });
        c019208x.A04(R.string.cancel, null);
        return c019208x.A00();
    }
}
