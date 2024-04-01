package com.whatsapp.report;

import X.C002301c;
import X.C019208x;
import X.C3VV;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import com.google.android.search.verification.client.R;
import com.whatsapp.report.DeleteReportConfirmationDialogFragment;

/* loaded from: classes2.dex */
public class DeleteReportConfirmationDialogFragment extends Hilt_DeleteReportConfirmationDialogFragment {
    public C002301c A00;
    public C3VV A01;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        c019208x.A01.A0E = Html.fromHtml(this.A00.A06(R.string.gdpr_delete_report_confirmation));
        c019208x.A04(R.string.cancel, null);
        c019208x.A06(R.string.delete, new DialogInterface.OnClickListener() { // from class: X.3VR
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C3VV c3vv = DeleteReportConfirmationDialogFragment.this.A01;
                if (c3vv != null) {
                    c3vv.A76();
                }
            }
        });
        return c019208x.A00();
    }
}
