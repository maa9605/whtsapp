package com.whatsapp;

import X.ActivityC02330At;
import X.AnonymousClass088;
import X.C018308n;
import X.C019208x;
import X.C40071rX;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment;

/* loaded from: classes.dex */
public class DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment extends Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment {
    public C018308n A00;
    public C40071rX A01;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final ActivityC02330At A0A = A0A();
        C019208x c019208x = new C019208x(A0A);
        c019208x.A03(R.string.pre_registration_do_not_share_code_dialog_title);
        c019208x.A02(R.string.pre_registration_do_not_share_code_dialog_message);
        c019208x.A01.A0J = true;
        c019208x.A06(R.string.ok, null);
        c019208x.A04(R.string.learn_more, new DialogInterface.OnClickListener() { // from class: X.1GU
            {
                DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment.this.A18(A0A);
            }
        });
        return c019208x.A00();
    }

    public /* synthetic */ void A18(Context context) {
        this.A00.A06(context, AnonymousClass088.A0K(this.A01));
        A10();
    }
}
