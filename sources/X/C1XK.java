package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.1XK  reason: invalid class name */
/* loaded from: classes.dex */
public class C1XK extends ScheduledExecutorServiceC18900uW {
    public static C1XK A00;

    public C1XK() {
        super(new Handler(Looper.getMainLooper()));
    }

    @Override // X.ScheduledExecutorServiceC18900uW, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        Handler handler = this.A00;
        if (currentThread == handler.getLooper().getThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
