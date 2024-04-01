package com.whatsapp.settings;

import X.C000200d;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.C2PG;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.MultiSelectionDialogFragment;

/* loaded from: classes2.dex */
public class MultiSelectionDialogFragment extends Hilt_MultiSelectionDialogFragment {
    public int A00;
    public C2PG A01;
    public String A02;
    public String[] A03;
    public boolean[] A04;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        if (A09() instanceof C2PG) {
            Bundle bundle2 = ((C0BA) this).A06;
            this.A00 = bundle2.getInt("dialogId");
            this.A02 = A0F(bundle2.getInt("dialogTitleResId"));
            this.A03 = A01().getStringArray(bundle2.getInt("itemsResId"));
            this.A04 = bundle2.getBooleanArray("selectedItems");
            this.A01 = (C2PG) A09();
            return;
        }
        StringBuilder A0P = C000200d.A0P("Activity must implement ");
        A0P.append("MultiSelectionDialogFragment$MultiSelectionDialogListener");
        throw new IllegalStateException(A0P.toString());
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A09());
        String str = this.A02;
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = str;
        String[] strArr = this.A03;
        boolean[] zArr = this.A04;
        DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = new DialogInterface.OnMultiChoiceClickListener() { // from class: X.3W5
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                MultiSelectionDialogFragment.this.A04[i] = z;
            }
        };
        c019308y.A0M = strArr;
        c019308y.A09 = onMultiChoiceClickListener;
        c019308y.A0N = zArr;
        c019308y.A0K = true;
        c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3W4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                MultiSelectionDialogFragment multiSelectionDialogFragment = MultiSelectionDialogFragment.this;
                multiSelectionDialogFragment.A01.AMH(multiSelectionDialogFragment.A00, multiSelectionDialogFragment.A04);
                dialogInterface.dismiss();
            }
        });
        c019208x.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.3W3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return c019208x.A00();
    }
}
