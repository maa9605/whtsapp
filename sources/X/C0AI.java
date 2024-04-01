package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0AI  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AI {
    public static final Executor A00 = new Executor() { // from class: X.194
        public final Handler A00 = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.A00.post(runnable);
        }
    };
    public static final Executor A01 = new Executor() { // from class: X.19E
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
}
