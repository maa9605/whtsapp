package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.3PP  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3PP extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass093 A00;
    public final /* synthetic */ IndiaUpiPaymentActivity A01;

    public /* synthetic */ C3PP(IndiaUpiPaymentActivity indiaUpiPaymentActivity, AnonymousClass093 anonymousClass093) {
        this.A01 = indiaUpiPaymentActivity;
        this.A00 = anonymousClass093;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A2C(this.A00);
    }
}
