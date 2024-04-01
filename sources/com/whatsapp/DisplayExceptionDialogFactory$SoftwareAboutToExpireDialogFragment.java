package com.whatsapp;

import X.C005002g;
import X.C04950Mp;
import X.C09I;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* loaded from: classes.dex */
public class DisplayExceptionDialogFactory$SoftwareAboutToExpireDialogFragment extends Hilt_DisplayExceptionDialogFactory_SoftwareAboutToExpireDialogFragment {
    public C005002g A00;
    public C04950Mp A01;
    public C09I A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Log.i("home/dialog software-about-to-expire");
        return this.A01.A02(A09(), this.A02, this.A00);
    }
}
