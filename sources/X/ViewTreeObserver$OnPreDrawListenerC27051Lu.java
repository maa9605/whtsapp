package X;

import android.view.ViewTreeObserver;
import com.whatsapp.account.delete.DeleteAccountConfirmation;

/* renamed from: X.1Lu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnPreDrawListenerC27051Lu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ DeleteAccountConfirmation A00;

    public ViewTreeObserver$OnPreDrawListenerC27051Lu(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.A00 = deleteAccountConfirmation;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        deleteAccountConfirmation.A03.getViewTreeObserver().removeOnPreDrawListener(this);
        if (deleteAccountConfirmation.A03.canScrollVertically(1)) {
            deleteAccountConfirmation.A02.setElevation(deleteAccountConfirmation.A00);
            return false;
        }
        deleteAccountConfirmation.A02.setElevation(0.0f);
        return false;
    }
}
