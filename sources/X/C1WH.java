package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.1WH  reason: invalid class name */
/* loaded from: classes.dex */
public class C1WH implements InterfaceC17300rs {
    public final ExecutorC17120ra A01;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Executor A02 = new Executor() { // from class: X.0rt
        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            C1WH.this.A00.post(command);
        }
    };

    public C1WH(Executor backgroundExecutor) {
        this.A01 = new ExecutorC17120ra(backgroundExecutor);
    }
}
