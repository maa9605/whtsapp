package X;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.13m  reason: invalid class name */
/* loaded from: classes.dex */
public class C13m extends DialogFragment {
    public Dialog A00 = null;
    public DialogInterface.OnCancelListener A01 = null;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.A00 == null) {
            setShowsDialog(false);
        }
        return this.A00;
    }
}
