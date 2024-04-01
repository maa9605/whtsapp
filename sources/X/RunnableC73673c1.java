package X;

import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3c1  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC73673c1 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C74383dB A00;
    public final /* synthetic */ ScheduledFuture A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ RunnableC73673c1(C74383dB c74383dB, ScheduledFuture scheduledFuture, boolean z) {
        this.A00 = c74383dB;
        this.A01 = scheduledFuture;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A02(this.A01, this.A02);
    }
}
