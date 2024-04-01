package X;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.44H  reason: invalid class name */
/* loaded from: classes3.dex */
public class C44H extends FutureTask {
    public final String A00;
    public final ArrayList A01;
    public final UUID A02;
    public final /* synthetic */ C44I A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44H(C44I c44i, UUID uuid, Callable callable, String str) {
        super(callable);
        this.A03 = c44i;
        this.A01 = new ArrayList();
        if (str == null) {
            throw new NullPointerException("OpticFutureTask cannot have a null name.");
        }
        if (uuid != null) {
            this.A02 = uuid;
            this.A00 = str;
            return;
        }
        throw new NullPointerException(C000200d.A0H("SessionId is null! Attempting to schedule task: ", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039 A[Catch: all -> 0x0089, TryCatch #2 {, blocks: (B:4:0x0006, B:5:0x0013, B:6:0x001b, B:8:0x0021, B:9:0x0025, B:13:0x0033, B:15:0x0039, B:18:0x004a, B:20:0x004e, B:23:0x005a, B:26:0x005f, B:27:0x0063, B:29:0x0069, B:30:0x006d, B:32:0x0079), top: B:42:0x0006, inners: #4, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0006, B:5:0x0013, B:6:0x001b, B:8:0x0021, B:9:0x0025, B:13:0x0033, B:15:0x0039, B:18:0x004a, B:20:0x004e, B:23:0x005a, B:26:0x005f, B:27:0x0063, B:29:0x0069, B:30:0x006d, B:32:0x0079), top: B:42:0x0006, inners: #4, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[DONT_GENERATE] */
    @Override // java.util.concurrent.FutureTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void done() {
        /*
            r8 = this;
            X.44I r6 = r8.A03
            super.done()
            monitor-enter(r8)
            java.util.ArrayList r0 = r8.A01     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L89
            r0.clear()     // Catch: java.lang.Throwable -> L89
            r7 = 1
            r4 = 0
            r3 = 0
            java.lang.Object r2 = r8.get()     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
        L1b:
            boolean r0 = r1.hasNext()     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
            if (r0 == 0) goto L25
            r1.next()     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
            goto L1b
        L25:
            java.util.UUID r1 = r8.A02     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
            X.44G r0 = new X.44G     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
            r6.A05(r1, r0)     // Catch: java.lang.InterruptedException -> L30 java.util.concurrent.ExecutionException -> L32 java.util.concurrent.CancellationException -> L78 java.lang.Throwable -> L89
            goto L83
        L30:
            r2 = move-exception
            goto L33
        L32:
            r2 = move-exception
        L33:
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L5f
            android.os.HandlerThread r0 = r6.A04     // Catch: java.lang.Throwable -> L89
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L89
            java.lang.Thread r1 = r0.getThread()     // Catch: java.lang.Throwable -> L89
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L89
            if (r1 != r0) goto L4a
            goto L85
        L4a:
            boolean r0 = r6.A06     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L5a
            java.util.UUID r1 = r8.A02     // Catch: java.lang.Throwable -> L89
            X.44G r0 = new X.44G     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            r6.A05(r1, r0)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r8)
            goto L86
        L5a:
            X.AnonymousClass446.A00()     // Catch: java.lang.Throwable -> L89
            monitor-exit(r8)
            goto L86
        L5f:
            java.util.Iterator r1 = r5.iterator()     // Catch: java.lang.Throwable -> L89
        L63:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L6d
            r1.next()     // Catch: java.lang.Throwable -> L89
            goto L63
        L6d:
            java.util.UUID r1 = r8.A02     // Catch: java.lang.Throwable -> L89
            X.44G r0 = new X.44G     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            r6.A05(r1, r0)     // Catch: java.lang.Throwable -> L89
            goto L83
        L78:
            r2 = move-exception
            java.util.UUID r1 = r8.A02     // Catch: java.lang.Throwable -> L89
            X.44G r0 = new X.44G     // Catch: java.lang.Throwable -> L89
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            r6.A05(r1, r0)     // Catch: java.lang.Throwable -> L89
        L83:
            monitor-exit(r8)
            goto L86
        L85:
            monitor-exit(r8)
        L86:
            monitor-enter(r8)
            monitor-exit(r8)
            return
        L89:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44H.done():void");
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        synchronized (this) {
        }
        super.run();
    }

    @Override // java.util.concurrent.FutureTask
    public boolean runAndReset() {
        synchronized (this) {
        }
        return super.runAndReset();
    }
}
