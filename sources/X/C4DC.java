package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4DC  reason: invalid class name */
/* loaded from: classes3.dex */
public class C4DC implements InterfaceC03640Gm {
    public final /* synthetic */ InterfaceC03640Gm A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ BrazilPaymentCardDetailsActivity A02;

    public C4DC(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, InterfaceC03640Gm interfaceC03640Gm) {
        this.A02 = brazilPaymentCardDetailsActivity;
        this.A01 = pinBottomSheetDialogFragment;
        this.A00 = interfaceC03640Gm;
    }

    @Override // X.InterfaceC03640Gm
    public void ANw(C28Q c28q) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1C();
        } else {
            this.A02.ARS();
        }
        this.A00.ANw(c28q);
    }

    @Override // X.InterfaceC03640Gm
    public void AO1(C28Q c28q) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1C();
            BrazilPaymentCardDetailsActivity.A00(this.A02, pinBottomSheetDialogFragment, c28q);
        } else {
            BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = this.A02;
            brazilPaymentCardDetailsActivity.ARS();
            brazilPaymentCardDetailsActivity.A05.A01(brazilPaymentCardDetailsActivity, c28q.A00, R.string.payment_method_cannot_be_removed).show();
        }
        StringBuilder sb = new StringBuilder("PAY: removePayment/onResponseError. paymentNetworkError: ");
        sb.append(c28q);
        Log.i(sb.toString());
    }

    @Override // X.InterfaceC03640Gm
    public void AO2(C468228k c468228k) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A11();
        } else {
            this.A02.ARS();
        }
        this.A00.AO2(c468228k);
    }
}
