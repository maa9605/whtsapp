package com.whatsapp.qrcode.contactqr;

import X.C019208x;
import X.InterfaceC05810Qi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;

/* loaded from: classes2.dex */
public class ErrorDialogFragment extends Hilt_ErrorDialogFragment {
    public InterfaceC05810Qi A00;

    public static ErrorDialogFragment A00(int i) {
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_ERROR_CODE", i);
        errorDialogFragment.A0P(bundle);
        return errorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        super.A0e();
        this.A00 = null;
    }

    @Override // com.whatsapp.qrcode.contactqr.Hilt_ErrorDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (context instanceof InterfaceC05810Qi) {
            this.A00 = (InterfaceC05810Qi) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        int i = A02().getInt("ARG_ERROR_CODE");
        C019208x c019208x = new C019208x(A00());
        c019208x.A06(R.string.ok, null);
        if (i == 2) {
            c019208x.A03(R.string.contact_qr_valid_unsupported_title);
            c019208x.A01.A0E = A0F(R.string.contact_qr_valid_unsupported_subtitle_market);
        } else if (i == 3) {
            c019208x.A02(R.string.contact_qr_scan_no_connection);
        } else if (i == 4) {
            c019208x.A02(R.string.qr_scan_with_web_scanner);
        } else if (i == 5) {
            c019208x.A02(R.string.qr_scan_with_payments_scanner);
        } else if (i != 6) {
            c019208x.A02(R.string.contact_qr_scan_invalid_dialog);
        } else {
            c019208x.A02(R.string.contact_qr_scan_toast_no_valid_code);
        }
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        InterfaceC05810Qi interfaceC05810Qi = this.A00;
        if (interfaceC05810Qi != null) {
            interfaceC05810Qi.ANV();
        }
    }
}
