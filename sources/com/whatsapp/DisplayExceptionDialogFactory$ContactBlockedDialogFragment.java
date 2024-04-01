package com.whatsapp;

import X.ActivityC02330At;
import X.C019208x;
import X.C40261rr;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class DisplayExceptionDialogFactory$ContactBlockedDialogFragment extends Hilt_DisplayExceptionDialogFactory_ContactBlockedDialogFragment {
    public C40261rr A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Log.w("home/dialog contact-blocked");
        Bundle A02 = A02();
        String string = A02.getString("message");
        if (string != null) {
            final ArrayList parcelableArrayList = A02.getParcelableArrayList("jids");
            if (parcelableArrayList != null) {
                final ActivityC02330At A0A = A0A();
                final C40261rr c40261rr = this.A00;
                C019208x c019208x = new C019208x(A0A);
                c019208x.A01.A0E = string;
                c019208x.A06(R.string.unblock, new DialogInterface.OnClickListener() { // from class: X.15F
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AnonymousClass088.A1n(parcelableArrayList, c40261rr, A0A);
                    }
                });
                c019208x.A04(R.string.cancel, null);
                return c019208x.A00();
            }
            throw null;
        }
        throw null;
    }
}
