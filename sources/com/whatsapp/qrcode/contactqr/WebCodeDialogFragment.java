package com.whatsapp.qrcode.contactqr;

import X.C019208x;
import X.C01B;
import X.C0EE;
import X.InterfaceC05810Qi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.WebCodeDialogFragment;

/* loaded from: classes2.dex */
public class WebCodeDialogFragment extends Hilt_WebCodeDialogFragment {
    public C01B A00;
    public C0EE A01;
    public InterfaceC05810Qi A02;

    @Override // androidx.fragment.app.DialogFragment, X.C0BA
    public void A0e() {
        this.A02 = null;
        super.A0e();
    }

    @Override // com.whatsapp.qrcode.contactqr.Hilt_WebCodeDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (context instanceof InterfaceC05810Qi) {
            this.A02 = (InterfaceC05810Qi) context;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A00());
        c019208x.A03(R.string.qr_dialog_title);
        c019208x.A02(R.string.qr_dialog_content);
        c019208x.A06(R.string.btn_continue, new DialogInterface.OnClickListener() { // from class: X.3U7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WebCodeDialogFragment webCodeDialogFragment = WebCodeDialogFragment.this;
                webCodeDialogFragment.A0i(C20R.A00(webCodeDialogFragment.A00(), webCodeDialogFragment.A00, webCodeDialogFragment.A01, false));
            }
        });
        c019208x.A04(R.string.cancel, null);
        return c019208x.A00();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        InterfaceC05810Qi interfaceC05810Qi = this.A02;
        if (interfaceC05810Qi != null) {
            interfaceC05810Qi.ANV();
        }
    }
}
