package X;

import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: X.2ud  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ProgressDialogC60532ud extends ProgressDialog {
    public CharSequence A00;

    public ProgressDialogC60532ud(Context context) {
        super(context);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public void setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        this.A00 = charSequence;
    }
}
