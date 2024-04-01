package com.whatsapp.mediaview;

import X.AnonymousClass088;
import X.C000500h;
import X.C018308n;
import X.C40071rX;
import X.InterfaceC018408p;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.mediaview.RevokeNuxDialogFragment;

/* loaded from: classes2.dex */
public class RevokeNuxDialogFragment extends Hilt_RevokeNuxDialogFragment {
    public C018308n A00;
    public C000500h A01;
    public C40071rX A02;

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        return AnonymousClass088.A0H(((Hilt_RevokeNuxDialogFragment) this).A00, this.A00, this.A02, this.A01, new InterfaceC018408p() { // from class: X.3IC
            @Override // X.InterfaceC018408p
            public final void ANm() {
                RevokeNuxDialogFragment.this.A10();
            }
        });
    }
}
