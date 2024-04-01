package com.whatsapp.phonematching;

import X.AbstractC02800Cx;
import X.C02820Cz;
import X.C0CS;
import X.C52902bX;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.Hilt_WaDialogFragment;
import com.whatsapp.base.WaDialogFragment;

/* loaded from: classes2.dex */
public class ConnectionProgressDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = new C52902bX(((Hilt_WaDialogFragment) this).A00, this);
            if (this.A01) {
                return;
            }
            this.A01 = true;
            ((C0CS) generatedComponent()).A2I(this);
        }
    }

    @Override // com.whatsapp.base.Hilt_WaDialogFragment, X.C0BA
    public Context A0a() {
        return this.A00;
    }

    @Override // com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(super.A0b(bundle), this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (X.C52912bY.A00(r0) == r4) goto L8;
     */
    @Override // com.whatsapp.base.Hilt_WaDialogFragment, X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0c(android.app.Activity r4) {
        /*
            r3 = this;
            super.A0c(r4)
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto Lf
            android.content.Context r0 = X.C52912bY.A00(r0)
            r2 = 0
            if (r0 != r4) goto L10
        Lf:
            r2 = 1
        L10:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.AnonymousClass029.A1J(r2, r0, r1)
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.phonematching.ConnectionProgressDialogFragment.A0c(android.app.Activity):void");
    }

    @Override // com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        A00();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(A09());
        progressDialog.setMessage(A0F(R.string.register_connecting));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A14(AbstractC02800Cx abstractC02800Cx, String str) {
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A09(0, this, str, 1);
            c02820Cz.A05();
            return;
        }
        throw null;
    }
}