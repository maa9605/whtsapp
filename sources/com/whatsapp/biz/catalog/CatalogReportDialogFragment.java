package com.whatsapp.biz.catalog;

import X.C019208x;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogReportDialogFragment;
import com.whatsapp.biz.catalog.CatalogReportReasonDialogFragment;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* loaded from: classes2.dex */
public class CatalogReportDialogFragment extends Hilt_CatalogReportDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A00());
        c019208x.A03(R.string.catalog_product_report_dialog_title);
        c019208x.A02(R.string.catalog_product_report_content);
        c019208x.A05(R.string.catalog_product_report_title, new DialogInterface.OnClickListener() { // from class: X.2mf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CatalogReportDialogFragment catalogReportDialogFragment = CatalogReportDialogFragment.this;
                ((ProductDetailActivity) catalogReportDialogFragment.A0A()).A1S(null);
                catalogReportDialogFragment.A11();
            }
        });
        c019208x.A06(R.string.catalog_product_report_details_title, new DialogInterface.OnClickListener() { // from class: X.2me
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CatalogReportDialogFragment catalogReportDialogFragment = CatalogReportDialogFragment.this;
                CatalogReportReasonDialogFragment catalogReportReasonDialogFragment = new CatalogReportReasonDialogFragment();
                AbstractC02800Cx abstractC02800Cx = catalogReportDialogFragment.A0H;
                if (abstractC02800Cx != null) {
                    C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
                    c02820Cz.A09(0, catalogReportReasonDialogFragment, "report reason", 1);
                    c02820Cz.A04();
                }
                catalogReportDialogFragment.A11();
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.2mg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CatalogReportDialogFragment.this.A11();
            }
        });
        return c019208x.A00();
    }
}
