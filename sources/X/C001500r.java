package X;

import android.os.Process;
import com.whatsapp.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.00r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C001500r extends Thread {
    public static final Runnable A05 = new Runnable() { // from class: X.022
        @Override // java.lang.Runnable
        public final void run() {
        }
    };
    public static volatile boolean A06;
    public AbstractC000600i A00;
    public AnonymousClass015 A01;
    public AtomicInteger A02;
    public final BlockingQueue A03;
    public volatile boolean A04;

    public C001500r() {
        super("Logger (2.21.9.15(291224746))");
        this.A03 = new ArrayBlockingQueue(2048, true);
        this.A01 = new AnonymousClass015(1, 20, 20, true);
        this.A02 = new AtomicInteger(0);
    }

    public final void A00() {
        AbstractC000600i abstractC000600i;
        Object obj = null;
        do {
            try {
                obj = this.A03.take();
                continue;
            } catch (InterruptedException unused) {
            }
        } while (obj == null);
        if (obj instanceof String) {
            Log.doLogToFile((String) obj);
        } else if (obj instanceof FutureTask) {
            ((FutureTask) obj).run();
        } else {
            throw new IllegalStateException("Invalid log item type");
        }
        if (this.A04 && this.A03.isEmpty()) {
            Log.blockingLog(4, "log/emptyingqueue/end");
            StringBuilder sb = new StringBuilder("log/emptyingqueue/skipped ");
            sb.append(this.A02);
            sb.append(" entries");
            Log.blockingLog(4, sb.toString());
            this.A02.set(0);
            A06 = true;
            this.A04 = false;
            if (this.A01.A00()) {
                synchronized (this) {
                    abstractC000600i = this.A00;
                    if (abstractC000600i == null) {
                        throw new NullPointerException();
                    }
                }
                abstractC000600i.A09("Log/doLogLoop", "Logging queue became full", true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        if (r7 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        r4.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A01(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r3 = 1
            if (r4 == r11) goto L67
            boolean r0 = r11.A04
            if (r0 == 0) goto L11
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A02
            r0.incrementAndGet()
            return
        L11:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r8 = 0
            r7 = 0
        L17:
            java.util.concurrent.BlockingQueue r5 = r11.A03     // Catch: java.lang.InterruptedException -> L5f
            r0 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L5f
            boolean r0 = r5.offer(r12, r0, r2)     // Catch: java.lang.InterruptedException -> L5f
            if (r0 != 0) goto L61
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.InterruptedException -> L5f
            long r5 = r5 - r9
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L17
            if (r8 != 0) goto L17
            r1 = r11
            monitor-enter(r1)     // Catch: java.lang.InterruptedException -> L5e
            X.00i r2 = r11.A00     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L55
            monitor-exit(r1)     // Catch: java.lang.InterruptedException -> L5e
            java.lang.String r1 = "addLogItem waited for 2 seconds"
            r0 = 0
            r2.A09(r1, r0, r3)     // Catch: java.lang.InterruptedException -> L5e
            boolean r0 = r11.A04     // Catch: java.lang.InterruptedException -> L5e
            if (r0 != 0) goto L53
            boolean r0 = X.C001500r.A06     // Catch: java.lang.InterruptedException -> L5e
            if (r0 != 0) goto L53
            r11.A04 = r3     // Catch: java.lang.InterruptedException -> L5e
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A02     // Catch: java.lang.InterruptedException -> L5e
            r0.incrementAndGet()     // Catch: java.lang.InterruptedException -> L5e
            r1 = 4
            java.lang.String r0 = "log/emptyingqueue/start"
            com.whatsapp.util.Log.blockingLog(r1, r0)     // Catch: java.lang.InterruptedException -> L5e
            goto L61
        L53:
            r8 = 1
            goto L17
        L55:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r0     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.InterruptedException -> L5e
            throw r0     // Catch: java.lang.InterruptedException -> L5e
        L5e:
            r8 = 1
        L5f:
            r7 = 1
            goto L17
        L61:
            if (r7 == 0) goto L66
            r4.interrupt()
        L66:
            return
        L67:
            java.lang.String r0 = "Cannot add a log item from the logging thread. Attempting to crash."
            com.whatsapp.util.Log.blockingLog(r3, r0)
            java.lang.String r1 = "Cannot add a log item from the logging thread."
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C001500r.A01(java.lang.Object):void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            A00();
        }
    }
}
