package com.whatsapp.qrcode;

import X.C000200d;
import X.C018508q;
import X.C0BA;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* loaded from: classes2.dex */
public class QrEducationDialogFragment extends Hilt_QrEducationDialogFragment {
    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.qr_education_dialog_fragment, viewGroup, false);
        ((QrEducationView) inflate.findViewById(R.id.education)).A0C = false;
        inflate.findViewById(R.id.ok).setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 27));
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0v(Bundle bundle) {
        super.A0v(bundle);
        A12(2, 2131952205);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        C0BA c0ba = this.A0D;
        if (c0ba instanceof QrScanCodeFragment) {
            QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) c0ba;
            if (qrScanCodeFragment.A09) {
                qrScanCodeFragment.A09 = false;
                C000200d.A0j(qrScanCodeFragment.A03, "contact_qr_education", false);
                C018508q c018508q = qrScanCodeFragment.A02;
                c018508q.A02.postDelayed(qrScanCodeFragment.A0C, 15000L);
            }
            qrScanCodeFragment.A08 = false;
            qrScanCodeFragment.A05.A01.ARd();
        }
    }
}
