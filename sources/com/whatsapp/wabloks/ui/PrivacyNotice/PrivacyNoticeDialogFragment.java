package com.whatsapp.wabloks.ui.PrivacyNotice;

import X.C00J;
import X.C2MU;
import X.C2Qg;
import X.C2Qk;
import X.C50162Qh;
import X.C91644Fs;
import android.content.Context;
import com.whatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeDialogFragment;

/* loaded from: classes3.dex */
public class PrivacyNoticeDialogFragment extends Hilt_PrivacyNoticeDialogFragment {
    public C2Qg A00;
    public C00J A01;

    @Override // com.whatsapp.wabloks.ui.PrivacyNotice.Hilt_PrivacyNoticeDialogFragment, com.whatsapp.wabloks.base.Hilt_BkDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        C2Qg A00 = ((C2MU) this.A01.get()).A00(context);
        C2Qg c2Qg = this.A00;
        if (c2Qg != null && c2Qg != A00) {
            c2Qg.A02(this);
        }
        this.A00 = A00;
        A00.A01(C91644Fs.class, this, new C2Qk() { // from class: X.3us
            @Override // X.C2Qk
            public final void AK4(Object obj) {
                PrivacyNoticeDialogFragment.this.A18();
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A11() {
        this.A00.A00(new C50162Qh(3));
        super.A11();
    }

    public /* synthetic */ void A18() {
        A11();
    }
}
