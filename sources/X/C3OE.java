package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.3OE  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3OE extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ InterfaceC013706o A00;
    public final /* synthetic */ C014006r A01;
    public final /* synthetic */ C0N2 A02;
    public final /* synthetic */ C91934Gw A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ C0JJ A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ C3OE(BrazilPaymentActivity brazilPaymentActivity, C0JJ c0jj, C014006r c014006r, InterfaceC013706o interfaceC013706o, C0N2 c0n2, C91934Gw c91934Gw, String str, boolean z) {
        this.A04 = brazilPaymentActivity;
        this.A05 = c0jj;
        this.A01 = c014006r;
        this.A00 = interfaceC013706o;
        this.A02 = c0n2;
        this.A03 = c91934Gw;
        this.A06 = str;
        this.A07 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.A1f(this.A05, this.A01, this.A00, this.A02, this.A03, this.A06, this.A07);
    }
}
