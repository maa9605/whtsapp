package com.whatsapp.dialogs;

import X.AbstractC02800Cx;
import X.C002301c;
import X.C02820Cz;
import X.C06530Ts;
import X.C0BA;
import X.ProgressDialogC60532ud;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

/* loaded from: classes2.dex */
public class ProgressDialogFragment extends Hilt_ProgressDialogFragment {
    public DialogInterface.OnKeyListener A00;
    public C002301c A01;
    public boolean A02 = false;

    public static ProgressDialogFragment A00(int i, int i2) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i);
        bundle.putInt("message_id", i2);
        progressDialogFragment.A0P(bundle);
        return progressDialogFragment;
    }

    @Override // com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0g() {
        super.A0g();
        if (this.A02) {
            A10();
            this.A02 = false;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0k(Bundle bundle) {
        CharSequence charSequence;
        super.A0k(bundle);
        ProgressDialogC60532ud progressDialogC60532ud = (ProgressDialogC60532ud) ((DialogFragment) this).A03;
        if (progressDialogC60532ud == null || (charSequence = progressDialogC60532ud.A00) == null) {
            return;
        }
        bundle.putString("previous_message_text", charSequence.toString());
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        if (bundle != null) {
            this.A02 = !C06530Ts.A02;
        }
        A02();
        int i = A02().getInt("title_id");
        int i2 = ((C0BA) this).A06.getInt("message_id");
        String string = bundle != null ? bundle.getString("previous_message_text") : null;
        ProgressDialogC60532ud progressDialogC60532ud = new ProgressDialogC60532ud(A09());
        String string2 = ((C0BA) this).A06.getString("title");
        if (string2 != null || (i != 0 && (string2 = this.A01.A06(i)) != null)) {
            progressDialogC60532ud.setTitle(string2);
        }
        if (string != null || (string = ((C0BA) this).A06.getString("message")) != null || (i2 != 0 && (string = this.A01.A06(i2)) != null)) {
            progressDialogC60532ud.setMessage(string);
        }
        progressDialogC60532ud.setIndeterminate(true);
        A15(false);
        DialogInterface.OnKeyListener onKeyListener = this.A00;
        if (onKeyListener != null) {
            progressDialogC60532ud.setOnKeyListener(onKeyListener);
        }
        return progressDialogC60532ud;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
        c02820Cz.A09(0, this, str, 1);
        c02820Cz.A05();
    }
}
