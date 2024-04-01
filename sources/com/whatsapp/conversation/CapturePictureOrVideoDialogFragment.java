package com.whatsapp.conversation;

import X.C002301c;
import X.C019208x;
import X.C019308y;
import X.DialogInterfaceC019408z;
import X.InterfaceC04760Ls;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;

/* loaded from: classes2.dex */
public final class CapturePictureOrVideoDialogFragment extends Hilt_CapturePictureOrVideoDialogFragment {
    public static final int[] A02 = {R.string.take_picture, R.string.record_video};
    public InterfaceC04760Ls A00;
    public C002301c A01;

    @Override // com.whatsapp.conversation.Hilt_CapturePictureOrVideoDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        try {
            this.A00 = (InterfaceC04760Ls) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement CapturePictureOrVideoDialogClickListener");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        C019208x c019208x = new C019208x(A00());
        String[] A0O = this.A01.A0O(A02);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2qe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                InterfaceC04760Ls interfaceC04760Ls = CapturePictureOrVideoDialogFragment.this.A00;
                if (interfaceC04760Ls != null) {
                    if (i == 0) {
                        interfaceC04760Ls.APZ();
                    } else if (i == 1) {
                        interfaceC04760Ls.ANh();
                    }
                }
            }
        };
        C019308y c019308y = c019208x.A01;
        c019308y.A0M = A0O;
        c019308y.A05 = onClickListener;
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setCanceledOnTouchOutside(true);
        return A00;
    }
}
