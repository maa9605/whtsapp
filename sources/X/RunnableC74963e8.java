package X;

import com.whatsapp.wabloks.base.BkFragment2;

/* renamed from: X.3e8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC74963e8 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ BkFragment2 A00;
    public final /* synthetic */ Exception A01;

    public /* synthetic */ RunnableC74963e8(BkFragment2 bkFragment2, Exception exc) {
        this.A00 = bkFragment2;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A1A(this.A01);
    }
}
