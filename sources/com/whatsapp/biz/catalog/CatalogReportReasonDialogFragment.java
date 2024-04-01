package com.whatsapp.biz.catalog;

import X.C018508q;
import X.C019208x;
import X.C019308y;
import X.C56162mo;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogReportReasonDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;

/* loaded from: classes2.dex */
public class CatalogReportReasonDialogFragment extends Hilt_CatalogReportReasonDialogFragment {
    public C018508q A01;
    public final C56162mo[] A02 = {new C56162mo("no-match", R.string.catalog_product_report_reason_no_match), new C56162mo("spam", R.string.catalog_product_report_reason_spam), new C56162mo("illegal", R.string.catalog_product_report_reason_illegal), new C56162mo("scam", R.string.catalog_product_report_reason_scam), new C56162mo("knockoff", R.string.catalog_product_report_reason_knockoff), new C56162mo("other", R.string.catalog_product_report_reason_other)};
    public int A00 = -1;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A00());
        C56162mo[] c56162moArr = this.A02;
        int length = c56162moArr.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            charSequenceArr[i] = A0F(c56162moArr[i].A00);
        }
        int i2 = this.A00;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2mi
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                CatalogReportReasonDialogFragment.this.A00 = i3;
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0M = charSequenceArr;
        c019308y.A05 = onClickListener;
        c019308y.A00 = i2;
        c019308y.A0L = true;
        c019208x.A03(R.string.catalog_product_report_details_title);
        c019208x.A06(R.string.submit, null);
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.2mh
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ((DialogInterfaceC019408z) dialogInterface).A02(-1).setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(CatalogReportReasonDialogFragment.this, 6));
            }
        });
        return A00;
    }
}
