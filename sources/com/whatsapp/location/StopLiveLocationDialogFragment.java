package com.whatsapp.location;

import X.C019208x;
import X.C41461tx;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.location.StopLiveLocationDialogFragment;

/* loaded from: classes2.dex */
public class StopLiveLocationDialogFragment extends Hilt_StopLiveLocationDialogFragment {
    public C41461tx A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        final String string = A02().getString("id");
        if (string != null) {
            final String string2 = A02().getString("jid");
            if (string2 != null) {
                C019208x c019208x = new C019208x(A09());
                c019208x.A02(R.string.live_location_stop_sharing_dialog);
                c019208x.A06(R.string.live_location_stop, new DialogInterface.OnClickListener() { // from class: X.2y9
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = StopLiveLocationDialogFragment.this;
                        String str = string;
                        String str2 = string2;
                        C41461tx c41461tx = stopLiveLocationDialogFragment.A00;
                        AbstractC005302j A02 = AbstractC005302j.A02(str2);
                        if (A02 != null) {
                            c41461tx.A0c(str, A02);
                            return;
                        }
                        throw null;
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
