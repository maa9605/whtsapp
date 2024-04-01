package X;

import android.os.Process;

/* renamed from: X.160  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass160 implements Runnable {
    public final Runnable A00;

    public AnonymousClass160(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.A00.run();
    }
}
