package com.whatsapp;

import X.ActivityC02330At;
import X.AnonymousClass088;
import X.C002301c;
import X.C005002g;
import X.C018308n;
import X.C09I;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment extends Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment {
    public C018308n A00;
    public C005002g A01;
    public C09I A02;
    public C002301c A03;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Log.w("home/dialog software-expired");
        return AnonymousClass088.A0J(this.A03, A09(), this.A02, this.A01, this.A00);
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
