package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3Og  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC69393Og extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ ConfirmReceivePaymentFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public /* synthetic */ View$OnClickListenerC69393Og(ConfirmReceivePaymentFragment confirmReceivePaymentFragment, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = confirmReceivePaymentFragment;
        this.A01 = paymentBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A00.A0z(this.A01);
    }
}
