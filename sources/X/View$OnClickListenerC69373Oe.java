package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;

/* renamed from: X.3Oe  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC69373Oe extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ C0N2 A00;
    public final /* synthetic */ ConfirmReceivePaymentFragment A01;

    public /* synthetic */ View$OnClickListenerC69373Oe(ConfirmReceivePaymentFragment confirmReceivePaymentFragment, C0N2 c0n2) {
        this.A01 = confirmReceivePaymentFragment;
        this.A00 = c0n2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A01.A0y(this.A00);
    }
}
