package X;

import android.view.ViewTreeObserver;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.1Lw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnPreDrawListenerC27071Lw implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ DeleteAccountFeedback A00;

    public ViewTreeObserver$OnPreDrawListenerC27071Lw(DeleteAccountFeedback deleteAccountFeedback) {
        this.A00 = deleteAccountFeedback;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        DeleteAccountFeedback deleteAccountFeedback = this.A00;
        deleteAccountFeedback.A04.getViewTreeObserver().removeOnPreDrawListener(this);
        if (deleteAccountFeedback.A04.canScrollVertically(1)) {
            deleteAccountFeedback.A02.setElevation(deleteAccountFeedback.A00);
            return false;
        }
        deleteAccountFeedback.A02.setElevation(0.0f);
        return false;
    }
}
