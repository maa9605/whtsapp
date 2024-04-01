package X;

import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.3OI  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3OI extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C014006r A00;
    public final /* synthetic */ AddPaymentMethodBottomSheet A01;
    public final /* synthetic */ BrazilPaymentActivity A02;

    public /* synthetic */ C3OI(BrazilPaymentActivity brazilPaymentActivity, AddPaymentMethodBottomSheet addPaymentMethodBottomSheet, C014006r c014006r) {
        this.A02 = brazilPaymentActivity;
        this.A01 = addPaymentMethodBottomSheet;
        this.A00 = c014006r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A1d(this.A01, this.A00);
    }
}
