package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

/* renamed from: X.3OH  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3OH extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C014006r A00;
    public final /* synthetic */ BrazilPaymentActivity A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C3OH(BrazilPaymentActivity brazilPaymentActivity, List list, C014006r c014006r) {
        this.A01 = brazilPaymentActivity;
        this.A02 = list;
        this.A00 = c014006r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A1g(this.A02, this.A00);
    }
}
