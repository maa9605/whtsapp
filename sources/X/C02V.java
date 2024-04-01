package X;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.02V  reason: invalid class name */
/* loaded from: classes.dex */
public class C02V implements ThreadFactory {
    public final int A00;
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public C02V(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: X.1Qd
            @Override // java.lang.Runnable
            public final void run() {
                C02V c02v = C02V.this;
                Runnable runnable3 = runnable;
                Process.setThreadPriority(c02v.A00);
                runnable3.run();
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" #");
        sb.append(this.A02.getAndIncrement());
        return new Thread(runnable2, sb.toString());
    }
}
