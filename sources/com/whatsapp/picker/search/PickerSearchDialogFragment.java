package com.whatsapp.picker.search;

import X.ActivityC02330At;
import X.C2C0;
import X.C43981yK;
import X.C461225a;
import X.C48352Ex;
import X.C78833kb;
import X.InterfaceC04740Lq;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.picker.search.PickerSearchDialogFragment;

/* loaded from: classes2.dex */
public abstract class PickerSearchDialogFragment extends Hilt_PickerSearchDialogFragment {
    public C78833kb A00;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ActivityC02330At A09 = A09();
        if (A09 instanceof InterfaceC04740Lq) {
            ((InterfaceC04740Lq) A09).AMy(this);
            return null;
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A12(0, R.style.PickerSearchDialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Dialog A0z = super.A0z(bundle);
        A0z.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.3Sn
            {
                PickerSearchDialogFragment.this = this;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                PickerSearchDialogFragment pickerSearchDialogFragment = PickerSearchDialogFragment.this;
                if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                    pickerSearchDialogFragment.A18();
                    return true;
                }
                return false;
            }
        });
        return A0z;
    }

    public void A18() {
        if (!(this instanceof StickerSearchDialogFragment)) {
            GifSearchDialogFragment gifSearchDialogFragment = (GifSearchDialogFragment) this;
            gifSearchDialogFragment.A0C.A01(gifSearchDialogFragment.A05);
            C43981yK.A0C(gifSearchDialogFragment.A07, gifSearchDialogFragment.A0A);
            gifSearchDialogFragment.A16(false, false);
            return;
        }
        A16(false, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C48352Ex c48352Ex;
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        C78833kb c78833kb = this.A00;
        if (c78833kb != null) {
            c78833kb.A07 = false;
            if (c78833kb.A06 && (c48352Ex = c78833kb.A00) != null) {
                c48352Ex.A09();
            }
            c78833kb.A03 = null;
            C461225a c461225a = c78833kb.A08;
            c461225a.A01 = null;
            C2C0 c2c0 = c461225a.A02;
            if (c2c0 != null) {
                c2c0.A05(true);
            }
            this.A00 = null;
        }
    }
}
