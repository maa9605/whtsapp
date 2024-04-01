package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0AQ  reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AQ {
    public static volatile Handler A00;
    public static volatile Handler A01;

    public static void A00(Runnable runnable) {
        if (A02()) {
            runnable.run();
            return;
        }
        if (A01 == null) {
            synchronized (C0AQ.class) {
                if (A01 == null) {
                    A01 = new Handler(Looper.getMainLooper());
                }
            }
        }
        A01.post(runnable);
    }

    public static void A01(String str) {
        if (!A02()) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean A02() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
