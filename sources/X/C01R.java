package X;

import android.os.Process;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.01R */
/* loaded from: classes.dex */
public class C01R {
    public static final C01R A02 = new C01R();
    public final ThreadPoolExecutor A00 = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: X.04f
        {
            C01R.this = this;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            C01R c01r = C01R.this;
            Thread thread = new Thread(new Runnable() { // from class: X.1Nc
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    Process.setThreadPriority(9);
                    runnable2.run();
                }
            }, "SignalExecutor");
            c01r.A01 = new WeakReference(thread);
            return thread;
        }
    });
    public volatile WeakReference A01;

    public void A00() {
        C000700j.A08(A01(), "Not running on SignalExecutor thread");
    }

    public boolean A01() {
        WeakReference weakReference = this.A01;
        return weakReference != null && Thread.currentThread() == weakReference.get();
    }
}
