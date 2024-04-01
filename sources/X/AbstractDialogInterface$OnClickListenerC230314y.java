package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

/* renamed from: X.14y  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterface$OnClickListenerC230314y implements DialogInterface.OnClickListener {
    public abstract void A00();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            A00();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
