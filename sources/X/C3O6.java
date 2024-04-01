package X;

import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.3O6  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3O6 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C014006r A00;
    public final /* synthetic */ C4KG A01;
    public final /* synthetic */ PaymentView A02;

    public /* synthetic */ C3O6(C4KG c4kg, PaymentView paymentView, C014006r c014006r) {
        this.A01 = c4kg;
        this.A02 = paymentView;
        this.A00 = c014006r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A1T(this.A02, this.A00);
    }
}
