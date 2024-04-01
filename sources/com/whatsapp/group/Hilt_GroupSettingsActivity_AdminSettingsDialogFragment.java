package com.whatsapp.group;

import X.C0CS;
import X.C52902bX;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.Hilt_WaDialogFragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.group.GroupSettingsActivity;

/* loaded from: classes2.dex */
public abstract class Hilt_GroupSettingsActivity_AdminSettingsDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;

    @Override // com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public LayoutInflater A0b(Bundle bundle) {
        return LayoutInflater.from(new C52902bX(super.A0b(bundle), this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
        if (X.C52912bY.A00(r0) == r4) goto L11;
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
            android.content.ContextWrapper r0 = r3.A00
            if (r0 != 0) goto L27
            android.content.ContextWrapper r1 = r3.A00
            X.2bX r0 = new X.2bX
            r0.<init>(r1, r3)
            r3.A00 = r0
            r3.A17()
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.Hilt_GroupSettingsActivity_AdminSettingsDialogFragment.A0c(android.app.Activity):void");
    }

    @Override // com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (this.A00 == null) {
            this.A00 = new C52902bX(((Hilt_WaDialogFragment) this).A00, this);
            A17();
        }
    }

    @Override // com.whatsapp.base.Hilt_WaDialogFragment
    public void A17() {
        if (this instanceof Hilt_GroupSettingsActivity_SendMessagesDialogFragment) {
            Hilt_GroupSettingsActivity_SendMessagesDialogFragment hilt_GroupSettingsActivity_SendMessagesDialogFragment = (Hilt_GroupSettingsActivity_SendMessagesDialogFragment) this;
            if (hilt_GroupSettingsActivity_SendMessagesDialogFragment.A01) {
                return;
            }
            hilt_GroupSettingsActivity_SendMessagesDialogFragment.A01 = true;
            ((C0CS) hilt_GroupSettingsActivity_SendMessagesDialogFragment.generatedComponent()).A1m((GroupSettingsActivity.SendMessagesDialogFragment) hilt_GroupSettingsActivity_SendMessagesDialogFragment);
        } else if (!(this instanceof Hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment)) {
            Hilt_GroupSettingsActivity_EditGroupInfoDialogFragment hilt_GroupSettingsActivity_EditGroupInfoDialogFragment = (Hilt_GroupSettingsActivity_EditGroupInfoDialogFragment) this;
            if (!hilt_GroupSettingsActivity_EditGroupInfoDialogFragment.A01) {
                hilt_GroupSettingsActivity_EditGroupInfoDialogFragment.A01 = true;
                ((C0CS) hilt_GroupSettingsActivity_EditGroupInfoDialogFragment.generatedComponent()).A1k((GroupSettingsActivity.EditGroupInfoDialogFragment) hilt_GroupSettingsActivity_EditGroupInfoDialogFragment);
            }
        } else {
            Hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment = (Hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment) this;
            if (hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment.A01) {
                return;
            }
            hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment.A01 = true;
            ((C0CS) hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment.generatedComponent()).A1l((GroupSettingsActivity.RestrictFrequentlyForwardedDialogFragment) hilt_GroupSettingsActivity_RestrictFrequentlyForwardedDialogFragment);
        }
    }
}
