package com.whatsapp.settings;

import X.C0CS;
import X.C52902bX;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.Hilt_WaPreferenceFragment;
import com.whatsapp.WaPreferenceFragment;

/* loaded from: classes2.dex */
public abstract class Hilt_SettingsChatHistoryFragment extends WaPreferenceFragment {
    public ContextWrapper A00;
    public boolean A01 = false;

    @Override // com.whatsapp.Hilt_WaPreferenceFragment, X.C0BA
    public Context A0a() {
        return this.A00;
    }

    @Override // com.whatsapp.Hilt_WaPreferenceFragment, X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(LayoutInflater.from(new C52902bX(A03(), this)), this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (X.C52912bY.A00(r0) == r4) goto L11;
     */
    @Override // com.whatsapp.Hilt_WaPreferenceFragment, X.C0BA
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
            android.content.ContextWrapper r0 = r3.A00
            if (r0 != 0) goto L27
            android.content.ContextWrapper r1 = r3.A00
            X.2bX r0 = new X.2bX
            r0.<init>(r1, r3)
            r3.A00 = r0
            r3.A0z()
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.Hilt_SettingsChatHistoryFragment.A0c(android.app.Activity):void");
    }

    @Override // com.whatsapp.WaPreferenceFragment, com.whatsapp.Hilt_WaPreferenceFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new C52902bX(((Hilt_WaPreferenceFragment) this).A00, this);
            A0z();
        }
    }

    @Override // com.whatsapp.Hilt_WaPreferenceFragment
    public void A0z() {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        ((C0CS) generatedComponent()).A2f((SettingsChatHistoryFragment) this);
    }
}