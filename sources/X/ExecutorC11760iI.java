package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.0iI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC11760iI implements Executor {
    public final Handler A00 = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.A00.post(runnable);
    }
}
