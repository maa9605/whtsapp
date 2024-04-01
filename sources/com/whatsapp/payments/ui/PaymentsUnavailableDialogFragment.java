package com.whatsapp.payments.ui;

import X.ActivityC02330At;
import X.C018808t;
import X.C019208x;
import X.C0BA;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;

/* loaded from: classes2.dex */
public class PaymentsUnavailableDialogFragment extends Hilt_PaymentsUnavailableDialogFragment {
    public C018808t A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        boolean z;
        Bundle bundle2 = ((C0BA) this).A06;
        if (bundle2 != null) {
            z = bundle2.getBoolean("arg_is_underage_unavailability");
        } else {
            z = false;
        }
        C019208x c019208x = new C019208x(A09());
        c019208x.A03(R.string.payments_unavailable_title);
        int i = R.string.payments_unavailable_generic_description;
        if (z) {
            i = R.string.payments_unavailable_underage_description;
        }
        c019208x.A02(i);
        c019208x.A01.A0J = false;
        int i2 = R.string.ok;
        if (z) {
            i2 = R.string.cancel;
        }
        c019208x.A06(i2, null);
        if (z) {
            c019208x.A05(R.string.register_contact_support, new DialogInterface.OnClickListener() { // from class: X.3Qz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = PaymentsUnavailableDialogFragment.this;
                    ActivityC02330At A09 = paymentsUnavailableDialogFragment.A09();
                    if (A09 != null) {
                        A09.startActivity(C002701i.A09(A09, paymentsUnavailableDialogFragment.A00, "payments-blocked", null, null, null, null, null));
                    }
                }
            });
        }
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        ActivityC02330At A09 = A09();
        if (A09 == null) {
            return;
        }
        A09.finish();
    }
}
