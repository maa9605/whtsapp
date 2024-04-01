package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0I8 */
/* loaded from: classes.dex */
public class C0I8 {
    public final Context A00;
    public final C462125q A03;
    public final C2I5 A04;
    public final C2I6 A05;
    public final AtomicInteger A02 = new AtomicInteger(0);
    public final Executor A01 = Executors.newSingleThreadExecutor();

    public C0I8(Context context, List list, C05460Ov c05460Ov, int i, boolean z, int i2, int i3, C34571hj c34571hj) {
        this.A03 = new C462125q(c34571hj);
        this.A00 = context;
        C2I5 c2i5 = new C2I5();
        this.A04 = c2i5;
        this.A05 = new C2I6(context, c05460Ov, c2i5);
        this.A01.execute(new RunnableEBaseShape5S0200000_I0_5(this));
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC05440Ot) it.next()).ATE(this);
            }
        }
        for (int i4 = 0; i4 < i; i4++) {
            new C2I7(C000200d.A0D("JobConsumer-", i4), this.A03, this.A05, z, i2, i3, this.A02).start();
        }
    }

    public void A00() {
        this.A01.execute(new RunnableEBaseShape7S0100000_I0_7(this, 50));
    }

    public void A01(Job job) {
        if (job.parameters.wakeLock) {
            Context context = this.A00;
            String obj = job.toString();
            long j = job.parameters.wakeLockTimeout;
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, obj);
            if (j == 0) {
                newWakeLock.acquire();
            } else {
                newWakeLock.acquire(j);
            }
            job.A02 = newWakeLock;
        }
        this.A01.execute(new RunnableEBaseShape5S0200000_I0_5(this, job, 6));
    }
}
