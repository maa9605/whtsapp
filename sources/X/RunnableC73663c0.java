package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3c0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC73663c0 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C74383dB A00;
    public final /* synthetic */ ScheduledFuture A01;

    public /* synthetic */ RunnableC73663c0(C74383dB c74383dB, ScheduledFuture scheduledFuture) {
        this.A00 = c74383dB;
        this.A01 = scheduledFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00(this.A01);
    }
}
