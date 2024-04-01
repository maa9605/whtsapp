package com.whatsapp.report;

import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

/* loaded from: classes2.dex */
public class DownloadReportFailedDialogFragment extends WaDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        c019208x.A03(R.string.download_failed);
        c019208x.A02(R.string.gdpr_download_expired);
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3VS
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return c019208x.A00();
    }
}
