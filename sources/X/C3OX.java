package X;

import android.util.Pair;
import com.whatsapp.payments.ui.BrazilSmbPaymentActivity;

/* renamed from: X.3OX  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3OX extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Pair A00;
    public final /* synthetic */ C014006r A01;
    public final /* synthetic */ BrazilSmbPaymentActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C3OX(BrazilSmbPaymentActivity brazilSmbPaymentActivity, Pair pair, String str, C014006r c014006r) {
        this.A02 = brazilSmbPaymentActivity;
        this.A00 = pair;
        this.A03 = str;
        this.A01 = c014006r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A1h(this.A00, this.A03, this.A01);
    }
}
