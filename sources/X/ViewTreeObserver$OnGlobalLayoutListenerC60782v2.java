package X;

import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.ephemeral.ViewOnceNUXDialog;

/* renamed from: X.2v2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC60782v2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ViewOnceNUXDialog A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC60782v2(ViewOnceNUXDialog viewOnceNUXDialog) {
        this.A00 = viewOnceNUXDialog;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewOnceNUXDialog viewOnceNUXDialog = this.A00;
        if (C02180Ae.A1X(viewOnceNUXDialog.A01)) {
            viewOnceNUXDialog.A00.setElevation(viewOnceNUXDialog.A01().getDimension(R.dimen.view_once_nux_buttons_elevation));
        } else {
            viewOnceNUXDialog.A00.setElevation(0.0f);
        }
        viewOnceNUXDialog.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
