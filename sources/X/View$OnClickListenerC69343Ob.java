package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;

/* renamed from: X.3Ob  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC69343Ob extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ C0N2 A00;
    public final /* synthetic */ ConfirmPaymentFragment A01;

    public /* synthetic */ View$OnClickListenerC69343Ob(ConfirmPaymentFragment confirmPaymentFragment, C0N2 c0n2) {
        this.A01 = confirmPaymentFragment;
        this.A00 = c0n2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A01.A0z(this.A00, view);
    }
}
