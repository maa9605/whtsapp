package com.whatsapp.backup.encryptedbackup;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

/* loaded from: classes.dex */
public class ConnectionErrorDialogFragment extends WaDialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        Dialog dialog = new Dialog(A09());
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.setContentView(R.layout.enc_backup_connection_error_dialog);
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }
}
