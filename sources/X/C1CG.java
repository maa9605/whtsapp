package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1CG  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CG {
    public boolean A00 = false;
    public final BroadcastReceiver.PendingResult A01;
    public final Intent A02;
    public final ScheduledFuture A03;

    public C1CG(final Intent intent, BroadcastReceiver.PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.A02 = intent;
        this.A01 = pendingResult;
        this.A03 = scheduledExecutorService.schedule(new Runnable(this, intent) { // from class: X.1CF
            public final Intent A00;
            public final C1CG A01;

            {
                this.A01 = this;
                this.A00 = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1CG c1cg = this.A01;
                String action = this.A00.getAction();
                StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
                sb.append("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("EnhancedIntentService", sb.toString());
                c1cg.A00();
            }
        }, 9000L, TimeUnit.MILLISECONDS);
    }

    public final synchronized void A00() {
        if (!this.A00) {
            this.A01.finish();
            this.A03.cancel(false);
            this.A00 = true;
        }
    }
}
