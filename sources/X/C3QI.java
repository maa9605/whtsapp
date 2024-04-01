package X;

import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.3QI  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3QI extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ IndiaUpiResetPinActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C3QI(IndiaUpiResetPinActivity indiaUpiResetPinActivity, String str) {
        this.A00 = indiaUpiResetPinActivity;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A1x(this.A01);
    }
}
