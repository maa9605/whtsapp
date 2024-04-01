package X;

import android.net.Network;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3c2  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC73683c2 extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Network A00;
    public final /* synthetic */ C74383dB A01;
    public final /* synthetic */ ScheduledFuture A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ RunnableC73683c2(C74383dB c74383dB, ScheduledFuture scheduledFuture, Network network, boolean z) {
        this.A01 = c74383dB;
        this.A02 = scheduledFuture;
        this.A00 = network;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01(this.A02, this.A00, this.A03);
    }
}
