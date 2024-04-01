package X;

import com.whatsapp.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2m6  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55732m6 {
    public static final BlockingQueue A00 = new LinkedBlockingQueue(4);
    public static final ThreadFactory A01;
    public static final ThreadPoolExecutor A02;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: X.2m4
            public final AtomicInteger A00 = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                RunnableEBaseShape8S0100000_I1_0 runnableEBaseShape8S0100000_I1_0 = new RunnableEBaseShape8S0100000_I1_0(runnable);
                StringBuilder A0P = C000200d.A0P("Google Drive Checksum Calculation Worker #");
                A0P.append(this.A00.getAndIncrement());
                return new Thread(runnableEBaseShape8S0100000_I1_0, A0P.toString());
            }
        };
        A01 = threadFactory;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 1L, TimeUnit.SECONDS, A00, threadFactory);
        A02 = threadPoolExecutor;
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: X.2m5
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                try {
                    threadPoolExecutor2.getQueue().put(runnable);
                } catch (InterruptedException e) {
                    Log.e(e);
                }
            }
        });
    }
}
