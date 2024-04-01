package com.whatsapp.phonematching;

import X.AbstractC02800Cx;
import X.ActivityC02270An;
import X.C018808t;
import X.C019208x;
import X.C02820Cz;
import X.C02E;
import X.C02F;
import X.C0E7;
import X.C2DT;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;

/* loaded from: classes2.dex */
public class ConnectionUnavailableDialogFragment extends Hilt_ConnectionUnavailableDialogFragment {
    public C0E7 A00;
    public C02E A01;
    public C02F A02;
    public C018808t A03;
    public C2DT A04;
    public InterfaceC002901k A05;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final ActivityC02270An activityC02270An = (ActivityC02270An) A09();
        if (activityC02270An != null) {
            C019208x c019208x = new C019208x(activityC02270An);
            c019208x.A02(R.string.register_try_again_later);
            c019208x.A06(R.string.check_system_status, new DialogInterface.OnClickListener() { // from class: X.3Se
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = ConnectionUnavailableDialogFragment.this;
                    ActivityC02270An activityC02270An2 = activityC02270An;
                    connectionUnavailableDialogFragment.A10();
                    connectionUnavailableDialogFragment.A05.ARy(new C34701hx(activityC02270An2, connectionUnavailableDialogFragment.A01, connectionUnavailableDialogFragment.A03, connectionUnavailableDialogFragment.A00, connectionUnavailableDialogFragment.A02, connectionUnavailableDialogFragment.A04, true, true, false, "", null), new String[0]);
                }
            });
            c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3Sd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ConnectionUnavailableDialogFragment.this.A10();
                }
            });
            return c019208x.A00();
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, this, str, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }
}
