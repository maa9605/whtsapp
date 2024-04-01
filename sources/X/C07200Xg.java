package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Xg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07200Xg extends AbstractC07210Xh {
    public static final Executor A02 = new Executor() { // from class: X.0Xi
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            C07200Xg.A00().A01.A01(runnable);
        }
    };
    public static volatile C07200Xg A03;
    public AbstractC07210Xh A00;
    public AbstractC07210Xh A01;

    public C07200Xg() {
        AbstractC07210Xh abstractC07210Xh = new AbstractC07210Xh() { // from class: X.0Xj
            public final Object A00 = new Object();
            public final ExecutorService A01 = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: X.0Xk
                public final AtomicInteger A00 = new AtomicInteger(0);

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.A00.getAndIncrement())));
                    return thread;
                }
            });
            public volatile Handler A02;

            @Override // X.AbstractC07210Xh
            public void A01(Runnable runnable) {
                this.A01.execute(runnable);
            }

            @Override // X.AbstractC07210Xh
            public void A02(Runnable runnable) {
                Handler handler;
                if (this.A02 == null) {
                    synchronized (this.A00) {
                        if (this.A02 == null) {
                            Looper mainLooper = Looper.getMainLooper();
                            if (Build.VERSION.SDK_INT >= 28) {
                                handler = Handler.createAsync(mainLooper);
                            } else {
                                try {
                                    try {
                                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                                    } catch (InvocationTargetException unused) {
                                        handler = new Handler(mainLooper);
                                    }
                                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused2) {
                                    handler = new Handler(mainLooper);
                                }
                            }
                            this.A02 = handler;
                        }
                    }
                }
                this.A02.post(runnable);
            }

            @Override // X.AbstractC07210Xh
            public boolean A03() {
                return Looper.getMainLooper().getThread() == Thread.currentThread();
            }
        };
        this.A00 = abstractC07210Xh;
        this.A01 = abstractC07210Xh;
    }

    public static C07200Xg A00() {
        if (A03 != null) {
            return A03;
        }
        synchronized (C07200Xg.class) {
            if (A03 == null) {
                A03 = new C07200Xg();
            }
        }
        return A03;
    }

    @Override // X.AbstractC07210Xh
    public void A01(Runnable runnable) {
        this.A01.A01(runnable);
    }

    @Override // X.AbstractC07210Xh
    public void A02(Runnable runnable) {
        this.A01.A02(runnable);
    }

    @Override // X.AbstractC07210Xh
    public boolean A03() {
        return this.A01.A03();
    }
}
