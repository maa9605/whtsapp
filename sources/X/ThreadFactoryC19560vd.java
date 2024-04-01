package X;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0vd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class ThreadFactoryC19560vd implements ThreadFactory {
    public final String A01;
    public final AtomicInteger A02 = new AtomicInteger(1);
    public final int A00 = 10;
    public final boolean A03 = true;

    public ThreadFactoryC19560vd(String str) {
        this.A01 = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str;
        Runnable runnable2 = new Runnable() { // from class: X.0vc
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(ThreadFactoryC19560vd.this.A00);
                } catch (Throwable unused) {
                }
                runnable.run();
            }
        };
        if (this.A03) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A01);
            sb.append("-");
            sb.append(this.A02.getAndIncrement());
            str = sb.toString();
        } else {
            str = this.A01;
        }
        return new Thread(runnable2, str);
    }
}
