package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3Od  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class View$OnClickListenerC69363Od extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ ConfirmPaymentFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public /* synthetic */ View$OnClickListenerC69363Od(ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = confirmPaymentFragment;
        this.A01 = paymentBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A00.A10(this.A01);
    }
}