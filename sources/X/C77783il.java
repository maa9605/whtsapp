package X;

import com.whatsapp.payments.ui.ConfirmPaymentFragment;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import java.util.List;

/* renamed from: X.3il  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C77783il implements C0CG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4D2 A01;
    public final /* synthetic */ ConfirmPaymentFragment A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public /* synthetic */ C77783il(C4D2 c4d2, ConfirmPaymentFragment confirmPaymentFragment, int i, PaymentBottomSheet paymentBottomSheet) {
        this.A01 = c4d2;
        this.A02 = confirmPaymentFragment;
        this.A00 = i;
        this.A03 = paymentBottomSheet;
    }

    @Override // X.C0CG
    public final void A54(Object obj) {
        this.A01.A01(this.A02, this.A00, this.A03, (List) obj);
    }
}
