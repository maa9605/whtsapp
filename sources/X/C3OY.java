package X;

import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;

/* renamed from: X.3OY  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3OY extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C014006r A00;
    public final /* synthetic */ BrazilSmbPaymentActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C3OY(BrazilSmbPaymentActivity brazilSmbPaymentActivity, String str, C014006r c014006r) {
        this.A01 = brazilSmbPaymentActivity;
        this.A02 = str;
        this.A00 = c014006r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A1i(this.A02, this.A00);
    }
}
