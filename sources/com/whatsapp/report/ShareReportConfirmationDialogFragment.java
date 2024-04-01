package com.whatsapp.report;

import X.C019208x;
import X.C3VX;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.report.ShareReportConfirmationDialogFragment;

/* loaded from: classes2.dex */
public class ShareReportConfirmationDialogFragment extends Hilt_ShareReportConfirmationDialogFragment {
    public C3VX A00;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        c019208x.A02(R.string.gdpr_share_report_confirmation);
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.gdpr_share_report_button, new DialogInterface.OnClickListener() { // from class: X.3VT
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C3VX c3vx = ShareReportConfirmationDialogFragment.this.A00;
                if (c3vx != null) {
                    c3vx.AUL();
                }
            }
        });
        return c019208x.A00();
    }
}
