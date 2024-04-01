package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;

/* renamed from: X.0To  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ProgressDialogC06500To extends ProgressDialog {
    public ProgressDialogC06500To(Context context) {
        super(context);
    }

    @Override // android.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 84) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
