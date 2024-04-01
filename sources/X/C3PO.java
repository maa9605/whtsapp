package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.3PO  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3PO extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;
    public final /* synthetic */ C0JJ A01;

    public /* synthetic */ C3PO(IndiaUpiPaymentActivity indiaUpiPaymentActivity, C0JJ c0jj) {
        this.A00 = indiaUpiPaymentActivity;
        this.A01 = c0jj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A2G(this.A01);
    }
}
