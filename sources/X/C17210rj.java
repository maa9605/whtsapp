package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: X.0rj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C17210rj {
    public static final String A05 = AbstractC16430qO.A01("WorkTimer");
    public final Object A00;
    public final Map A01;
    public final Map A02;
    public final ScheduledExecutorService A03;
    public final ThreadFactory A04;

    public C17210rj() {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.0rg
            public int A00 = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable r) {
                Thread newThread = Executors.defaultThreadFactory().newThread(r);
                StringBuilder A0P = C000200d.A0P("WorkManager-WorkTimer-thread-");
                A0P.append(this.A00);
                newThread.setName(A0P.toString());
                this.A00++;
                return newThread;
            }
        };
        this.A04 = threadFactory;
        this.A02 = new HashMap();
        this.A01 = new HashMap();
        this.A00 = new Object();
        this.A03 = Executors.newSingleThreadScheduledExecutor(threadFactory);
    }

    public void A00(final String workSpecId) {
        synchronized (this.A00) {
            if (((RunnableC17200ri) this.A02.remove(workSpecId)) != null) {
                AbstractC16430qO.A00().A02(A05, String.format("Stopping timer for %s", workSpecId), new Throwable[0]);
                this.A01.remove(workSpecId);
            }
        }
    }
}
