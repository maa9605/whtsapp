package X;

import android.os.PowerManager;
import android.util.Log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobConsumer$JobResult;

/* renamed from: X.2I7  reason: invalid class name */
/* loaded from: classes2.dex */
public class C2I7 extends Thread {
    public final ThreadPoolExecutor A00;
    public final AtomicInteger A01;
    public final C462125q A02;
    public final C2I6 A03;

    public C2I7(String str, final C462125q c462125q, C2I6 c2i6, boolean z, int i, int i2, AtomicInteger atomicInteger) {
        super(str);
        this.A02 = c462125q;
        this.A03 = c2i6;
        this.A01 = atomicInteger;
        ThreadPoolExecutor threadPoolExecutor = z ? new ThreadPoolExecutor(i, i2, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: X.2It
            public final AtomicInteger A01 = new AtomicInteger(1);
            public final String A00 = "JobRunner";

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                RunnableEBaseShape5S0200000_I0_5 runnableEBaseShape5S0200000_I0_5 = new RunnableEBaseShape5S0200000_I0_5(this, runnable, 4);
                StringBuilder sb = new StringBuilder();
                sb.append(this.A00);
                sb.append(" #");
                sb.append(this.A01.getAndIncrement());
                return new Thread(runnableEBaseShape5S0200000_I0_5, sb.toString());
            }
        }) : null;
        this.A00 = threadPoolExecutor;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: X.3fN
                @Override // java.util.concurrent.RejectedExecutionHandler
                public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                    C2I7 c2i7 = C2I7.this;
                    C462125q c462125q2 = c462125q;
                    if (runnable instanceof RunnableEBaseShape5S0200000_I0_5) {
                        RunnableEBaseShape5S0200000_I0_5 runnableEBaseShape5S0200000_I0_5 = (RunnableEBaseShape5S0200000_I0_5) runnable;
                        if (runnableEBaseShape5S0200000_I0_5.A02 == 5) {
                            Job job = (Job) runnableEBaseShape5S0200000_I0_5.A00;
                            c462125q2.A03(job);
                            String str2 = job.parameters.groupId;
                            if (str2 != null) {
                                c462125q2.A01(str2);
                            }
                        }
                    }
                    try {
                        c2i7.A00.getQueue().put(RunnableC75673fM.A00);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }
    }

    public final void A00(Job job) {
        JobConsumer$JobResult jobConsumer$JobResult;
        JobConsumer$JobResult jobConsumer$JobResult2 = JobConsumer$JobResult.DEFERRED;
        JobConsumer$JobResult jobConsumer$JobResult3 = JobConsumer$JobResult.FAILURE;
        AtomicInteger atomicInteger = this.A01;
        atomicInteger.getAndIncrement();
        int i = job.parameters.retryCount;
        int i2 = job.A00;
        while (i2 < i) {
            try {
                job.A04();
                jobConsumer$JobResult = JobConsumer$JobResult.SUCCESS;
                break;
            } catch (Exception e) {
                Log.w("JobConsumer", e);
                if (!(e instanceof RuntimeException)) {
                    if (!job.A06(e)) {
                        break;
                    }
                    i2++;
                    if (!job.A05()) {
                        job.A00 = i2;
                        jobConsumer$JobResult = jobConsumer$JobResult2;
                        break;
                    }
                } else {
                    throw e;
                }
            }
        }
        jobConsumer$JobResult = jobConsumer$JobResult3;
        if (jobConsumer$JobResult == jobConsumer$JobResult2) {
            this.A02.A03(job);
        } else {
            if (jobConsumer$JobResult == jobConsumer$JobResult3) {
                job.A03();
            }
            if (job.parameters.isPersistent) {
                getWritableDatabase().delete("queue", "_id = ?", new String[]{String.valueOf(job.A01)});
            }
            PowerManager.WakeLock wakeLock = job.A02;
            if (wakeLock != null && job.parameters.wakeLockTimeout == 0) {
                wakeLock.release();
            }
        }
        String str = job.parameters.groupId;
        if (str != null) {
            this.A02.A01(str);
        }
        atomicInteger.getAndDecrement();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            C462125q c462125q = this.A02;
            Job job = null;
            if (c462125q == null) {
                throw null;
            }
            do {
                try {
                    job = (Job) c462125q.A04.take();
                    continue;
                } catch (InterruptedException unused) {
                }
            } while (job == null);
            ThreadPoolExecutor threadPoolExecutor = this.A00;
            if (threadPoolExecutor == null) {
                A00(job);
            } else {
                threadPoolExecutor.execute(new RunnableEBaseShape5S0200000_I0_5(job, this, 5));
            }
        }
    }
}
