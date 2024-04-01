package com.whatsapp.profile;

import X.AbstractActivityC457923t;
import X.ActivityC02330At;
import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.profile.ResetProfilePhoto;

/* loaded from: classes2.dex */
public class ResetProfilePhoto extends AbstractActivityC457923t {
    @Override // X.AbstractActivityC457923t, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.remove_profile_photo);
        if (bundle == null) {
            new ConfirmDialogFragment().A14(A0N(), null);
        }
    }

    /* loaded from: classes2.dex */
    public class ConfirmDialogFragment extends Hilt_ResetProfilePhoto_ConfirmDialogFragment {
        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0z(Bundle bundle) {
            C019208x c019208x = new C019208x(A00());
            c019208x.A02(R.string.remove_profile_photo_confirmation);
            c019208x.A01.A0J = true;
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Sy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ResetProfilePhoto.ConfirmDialogFragment.this.A11();
                }
            });
            c019208x.A06(R.string.remove, new DialogInterface.OnClickListener() { // from class: X.3Sx
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ResetProfilePhoto.ConfirmDialogFragment confirmDialogFragment = ResetProfilePhoto.ConfirmDialogFragment.this;
                    ActivityC02330At A09 = confirmDialogFragment.A09();
                    if (A09 != null) {
                        Intent intent = new Intent();
                        intent.putExtra("is_reset", true);
                        A09.setResult(-1, intent);
                    }
                    confirmDialogFragment.A11();
                }
            });
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
                A09.overridePendingTransition(17432576, 17432577);
            }
        }
    }
}
