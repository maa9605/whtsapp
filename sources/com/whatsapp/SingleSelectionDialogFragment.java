package com.whatsapp;

import X.C000200d;
import X.C019208x;
import X.C019308y;
import X.C0BA;
import X.InterfaceC04910Mk;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.SingleSelectionDialogFragment;

/* loaded from: classes.dex */
public class SingleSelectionDialogFragment extends Hilt_SingleSelectionDialogFragment {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public boolean A04;
    public String[] A05;

    public static Bundle A00(int i, int i2, int i3, String[] strArr) {
        Bundle bundle = new Bundle();
        bundle.putInt("dialogId", i);
        bundle.putInt("currentIndex", i2);
        bundle.putInt("dialogTitleResId", i3);
        bundle.putStringArray("items", strArr);
        return bundle;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        if (A09() instanceof InterfaceC04910Mk) {
            Bundle bundle2 = ((C0BA) this).A06;
            this.A01 = bundle2.getInt("dialogId");
            this.A00 = bundle2.getInt("currentIndex");
            if (bundle2.containsKey("dialogTitleResId")) {
                this.A03 = A0F(bundle2.getInt("dialogTitleResId"));
            } else {
                this.A03 = bundle2.getString("dialogTitle");
            }
            if (bundle2.containsKey("itemsArrayResId")) {
                this.A05 = A01().getStringArray(bundle2.getInt("itemsArrayResId"));
            } else {
                this.A05 = bundle2.getStringArray("items");
            }
            this.A04 = bundle2.getBoolean("showConfirmation", false);
            return;
        }
        StringBuilder A0P = C000200d.A0P("Activity must implement ");
        A0P.append("SingleSelectionDialogFragment$SingleSelectionDialogListener");
        throw new IllegalStateException(A0P.toString());
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        return A18().A00();
    }

    public C019208x A18() {
        C019208x c019208x = new C019208x(A09());
        String str = this.A03;
        C019308y c019308y = c019208x.A01;
        c019308y.A0I = str;
        int i = this.A00;
        this.A02 = i;
        String[] strArr = this.A05;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.1Ib
            {
                SingleSelectionDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SingleSelectionDialogFragment singleSelectionDialogFragment = SingleSelectionDialogFragment.this;
                singleSelectionDialogFragment.A02 = i2;
                if (!singleSelectionDialogFragment.A04) {
                    ActivityC02330At A09 = singleSelectionDialogFragment.A09();
                    if (A09 instanceof InterfaceC04910Mk) {
                        ((InterfaceC04910Mk) A09).AOi(singleSelectionDialogFragment.A01, i2);
                    }
                    singleSelectionDialogFragment.A16(false, false);
                }
            }
        };
        c019308y.A0M = strArr;
        c019308y.A05 = onClickListener;
        c019308y.A00 = i;
        c019308y.A0L = true;
        if (this.A04) {
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1Ia
                {
                    SingleSelectionDialogFragment.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SingleSelectionDialogFragment singleSelectionDialogFragment = SingleSelectionDialogFragment.this;
                    ActivityC02330At A09 = singleSelectionDialogFragment.A09();
                    if (A09 instanceof InterfaceC04910Mk) {
                        ((InterfaceC04910Mk) A09).AOi(singleSelectionDialogFragment.A01, singleSelectionDialogFragment.A02);
                    }
                    singleSelectionDialogFragment.A16(false, false);
                }
            });
            c019208x.A04(R.string.cancel, null);
        }
        return c019208x;
    }
}
