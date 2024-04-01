package com.whatsapp.base;

import X.C002601h;
import X.C09360d8;
import X.DialogInterfaceC019408z;
import android.app.Dialog;
import android.widget.Button;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes2.dex */
public class WaDialogFragment extends Hilt_WaDialogFragment {
    public C09360d8 A00;
    public C002601h A01;

    @Override // X.C0BA
    public void A0V(boolean z) {
        super.A0V(z);
        if (z) {
            this.A01.A05(this, "visible");
        } else {
            this.A01.A05(this, "invisible");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        this.A0U = true;
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            ((DialogFragment) this).A0C = false;
            dialog.show();
        }
        Dialog dialog2 = ((DialogFragment) this).A03;
        if (dialog2 instanceof DialogInterfaceC019408z) {
            DialogInterfaceC019408z dialogInterfaceC019408z = (DialogInterfaceC019408z) dialog2;
            Button A02 = dialogInterfaceC019408z.A02(-1);
            if (A02 != null && (text3 = A02.getText()) != null) {
                A02.setContentDescription(text3);
            }
            Button A022 = dialogInterfaceC019408z.A02(-2);
            if (A022 != null && (text2 = A022.getText()) != null) {
                A022.setContentDescription(text2);
            }
            Button A023 = dialogInterfaceC019408z.A02(-3);
            if (A023 != null && (text = A023.getText()) != null) {
                A023.setContentDescription(text);
            }
        }
    }
}
