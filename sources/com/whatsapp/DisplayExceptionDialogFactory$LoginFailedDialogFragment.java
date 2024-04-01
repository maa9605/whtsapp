package com.whatsapp;

import X.ActivityC02330At;
import X.AnonymousClass012;
import X.C000500h;
import X.C019208x;
import X.C2Aa;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.registration.EULA;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class DisplayExceptionDialogFactory$LoginFailedDialogFragment extends Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment {
    public AnonymousClass012 A00;
    public C000500h A01;
    public C2Aa A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A0A());
        c019208x.A02(R.string.post_registration_logout_dialog_message);
        c019208x.A01.A0J = false;
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1GV
            {
                DisplayExceptionDialogFactory$LoginFailedDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DisplayExceptionDialogFactory$LoginFailedDialogFragment.this.A19();
            }
        });
        c019208x.A04(R.string.post_registration_logout_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: X.1GW
            {
                DisplayExceptionDialogFactory$LoginFailedDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                DisplayExceptionDialogFactory$LoginFailedDialogFragment.this.A18();
            }
        });
        return c019208x.A00();
    }

    public void A18() {
        Log.i("loggedout/verify/tos");
        ActivityC02330At A09 = A09();
        if (A09 == null) {
            return;
        }
        String A0J = this.A01.A0J();
        String A0H = this.A01.A0H();
        Intent A00 = EULA.A00(A09);
        if (this.A00.A05() < this.A01.A00.getLong("post_reg_notification_time", 0L) + 1800000) {
            Log.i("loggedout/verify/tos/reregister/pref-fill");
            A00.putExtra("com.whatsapp.registration.RegisterPhone.phone_number", A0J);
            A00.putExtra("com.whatsapp.registration.RegisterPhone.country_code", A0H);
            A00.putExtra("com.whatsapp.registration.RegisterPhone.clear_phone_number", false);
        }
        this.A02.A02();
        this.A02.A0B(0);
        A09.startActivity(A00);
        A09.finishAffinity();
    }

    public /* synthetic */ void A19() {
        Log.i("loggedout/ok/tos");
        this.A02.A02();
        ActivityC02330At A09 = A09();
        if (A09 == null) {
            return;
        }
        this.A02.A0B(0);
        A09.startActivity(EULA.A00(A09));
        A09.setResult(0);
        A09.finishAffinity();
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
