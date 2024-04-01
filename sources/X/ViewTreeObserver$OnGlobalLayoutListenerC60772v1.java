package X;

import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.ephemeral.EphemeralNUXDialog;

/* renamed from: X.2v1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC60772v1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ EphemeralNUXDialog A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC60772v1(EphemeralNUXDialog ephemeralNUXDialog) {
        this.A00 = ephemeralNUXDialog;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        EphemeralNUXDialog ephemeralNUXDialog = this.A00;
        if (C02180Ae.A1X(ephemeralNUXDialog.A01)) {
            ephemeralNUXDialog.A00.setElevation(ephemeralNUXDialog.A01().getDimension(R.dimen.ephemeral_nux_buttons_elevation));
        } else {
            ephemeralNUXDialog.A00.setElevation(0.0f);
        }
        ephemeralNUXDialog.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
