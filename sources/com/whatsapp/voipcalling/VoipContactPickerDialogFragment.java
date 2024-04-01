package com.whatsapp.voipcalling;

import X.AbstractC02800Cx;
import X.C02820Cz;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* loaded from: classes2.dex */
public class VoipContactPickerDialogFragment extends Hilt_VoipContactPickerDialogFragment {
    public final ContactPickerFragment A00 = new ContactPickerFragment();

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.voip_contact_picker_dialog_fragment, viewGroup, false);
        AbstractC02800Cx A0B = A0B();
        if (A0B != null) {
            C02820Cz c02820Cz = new C02820Cz(A0B);
            c02820Cz.A00(R.id.fragment_container, this.A00);
            c02820Cz.A08();
            return inflate;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (r1 == false) goto L14;
     */
    @Override // X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0s() {
        /*
            r5 = this;
            r0 = 1
            r5.A0U = r0
            android.app.Dialog r1 = r5.A03
            if (r1 == 0) goto L59
            X.3cm r0 = new X.3cm
            r0.<init>()
            r1.setOnKeyListener(r0)
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L59
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L59
            android.app.Dialog r0 = r5.A03
            android.view.Window r2 = r0.getWindow()
            android.app.Dialog r0 = r5.A03
            android.content.Context r1 = r0.getContext()
            r0 = 2131100462(0x7f06032e, float:1.7813306E38)
            int r0 = X.C02160Ac.A00(r1, r0)
            r2.setStatusBarColor(r0)
            android.app.Dialog r0 = r5.A03
            android.view.Window r4 = r0.getWindow()
            android.app.Dialog r0 = r5.A03
            android.content.Context r3 = r0.getContext()
            android.os.Bundle r2 = r5.A06
            if (r2 == 0) goto L4f
            r1 = 0
            java.lang.String r0 = "is_video_call"
            boolean r1 = r2.getBoolean(r0, r1)
            r0 = 2131100364(0x7f0602cc, float:1.7813107E38)
            if (r1 != 0) goto L52
        L4f:
            r0 = 2131100731(0x7f06043b, float:1.7813852E38)
        L52:
            int r0 = X.C02160Ac.A00(r3, r0)
            r4.setNavigationBarColor(r0)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipContactPickerDialogFragment.A0s():void");
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A12(0, R.style.VoipContactPickerDialogFragment);
    }
}
