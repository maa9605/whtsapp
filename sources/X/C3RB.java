package X;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;

/* renamed from: X.3RB  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3RB extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ PaymentInviteFragment A00;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogFragment dialogFragment = (DialogFragment) this.A00.A0D;
        if (dialogFragment != null) {
            dialogFragment.A10();
        }
    }
}
