package X;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2mI  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC55852mI extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ C55892mM A00;
    public final /* synthetic */ C40051rV A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CountDownLatch A05;
    public final /* synthetic */ AtomicBoolean A06;
    public final /* synthetic */ AtomicReference A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ RunnableC55852mI(C55892mM c55892mM, AtomicBoolean atomicBoolean, boolean z, File file, C40051rV c40051rV, String str, List list, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.A00 = c55892mM;
        this.A06 = atomicBoolean;
        this.A08 = z;
        this.A02 = file;
        this.A01 = c40051rV;
        this.A03 = str;
        this.A04 = list;
        this.A07 = atomicReference;
        this.A05 = countDownLatch;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r1 != 4) goto L25;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            X.2mM r8 = r13.A00
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.A06
            boolean r1 = r13.A08
            java.io.File r12 = r13.A02
            X.1rV r11 = r13.A01
            java.lang.String r6 = r13.A03
            java.util.List r7 = r13.A04
            java.util.concurrent.atomic.AtomicReference r4 = r13.A07
            java.util.concurrent.CountDownLatch r3 = r13.A05
            X.1rb r0 = r8.A05     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            boolean r0 = r0.A00()     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            r5 = 0
            if (r0 != 0) goto L22
            r2.set(r5)     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            r3.countDown()
            return
        L22:
            if (r1 != 0) goto L38
            boolean r0 = r12.exists()     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            if (r0 == 0) goto L38
            long r9 = r12.length()     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L38
            r3.countDown()
            return
        L38:
            java.lang.String r2 = r12.getAbsolutePath()     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            X.034 r1 = r8.A07     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            X.02F r0 = r8.A08     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            int r1 = X.AnonymousClass088.A0B(r2, r11, r1, r0)     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            r2 = 1
            if (r1 == r2) goto L5a
            goto L4d
        L48:
            r0 = move-exception
            r4.set(r0)     // Catch: java.lang.Throwable -> L77
            goto L56
        L4d:
            r0 = 2
            if (r1 == r0) goto L67
            r0 = 3
            if (r1 == r0) goto L5e
            r0 = 4
            if (r1 == r0) goto L5a
        L56:
            r3.countDown()
            return
        L5a:
            r7.add(r6)     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            goto L56
        L5e:
            X.1mS r1 = r8.A0B     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            if (r1 == 0) goto L75
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            r1.A01 = r0     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            goto L56
        L67:
            java.lang.String r1 = "gdrive/restore-media/get-files-to-be-downloaded received '%s' from gdrive file map which does not exist."
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            r0[r5] = r6     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            com.whatsapp.util.Log.e(r0)     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
            goto L56
        L75:
            r0 = 0
            throw r0     // Catch: X.C2GT -> L48 java.lang.Throwable -> L77
        L77:
            r0 = move-exception
            r3.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC55852mI.run():void");
    }
}
