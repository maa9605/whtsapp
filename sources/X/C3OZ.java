package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3OZ  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3OZ extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ ConfirmPaymentFragment A00;
    public final /* synthetic */ PaymentBottomSheet A01;

    public /* synthetic */ C3OZ(ConfirmPaymentFragment confirmPaymentFragment, PaymentBottomSheet paymentBottomSheet) {
        this.A00 = confirmPaymentFragment;
        this.A01 = paymentBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A00.A11(this.A01);
    }
}
