package X;

import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.whatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.3QV  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3QV extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ PaymentBottomSheet A00;

    public /* synthetic */ C3QV(PaymentBottomSheet paymentBottomSheet) {
        this.A00 = paymentBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.A00.A10();
    }
}
