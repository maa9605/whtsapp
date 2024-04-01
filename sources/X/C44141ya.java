package X;

/* renamed from: X.1ya  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44141ya extends Thread {
    public final C44081yU A00;
    public volatile boolean A01;
    public final /* synthetic */ C43791xz A02;

    public C44141ya(C43791xz c43791xz, C44081yU c44081yU) {
        this.A02 = c43791xz;
        this.A00 = c44081yU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r4 == null) goto L28;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r8 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r7 = 0
            r4 = r7
        L7:
            boolean r0 = r8.A01     // Catch: java.lang.InterruptedException -> L8d
            if (r0 != 0) goto L8d
            X.1yU r3 = r8.A00     // Catch: java.lang.InterruptedException -> L8d
            monitor-enter(r3)     // Catch: java.lang.InterruptedException -> L8d
            java.util.PriorityQueue r2 = r3.A00     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L1b
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.wait(r0)     // Catch: java.lang.Throwable -> L8a
        L1b:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 != 0) goto L28
            java.lang.Object r6 = r2.remove()     // Catch: java.lang.Throwable -> L8a
            X.1yW r6 = (X.AbstractC44101yW) r6     // Catch: java.lang.Throwable -> L8a
            goto L2b
        L28:
            monitor-exit(r3)     // Catch: java.lang.InterruptedException -> L8d
            r6 = r7
            goto L2c
        L2b:
            monitor-exit(r3)     // Catch: java.lang.InterruptedException -> L8d
        L2c:
            boolean r0 = r8.A01     // Catch: java.lang.InterruptedException -> L8d
            if (r0 == 0) goto L31
            goto L88
        L31:
            if (r6 == 0) goto L7d
            boolean r0 = r6.A05     // Catch: java.lang.InterruptedException -> L8d
            if (r0 != 0) goto L41
            X.1xz r2 = r8.A02     // Catch: java.lang.InterruptedException -> L8d
            X.08q r1 = r2.A02     // Catch: java.lang.InterruptedException -> L8d
            java.util.concurrent.ConcurrentHashMap r0 = r2.A0A     // Catch: java.lang.InterruptedException -> L8d
            r2.A05(r1, r6, r0)     // Catch: java.lang.InterruptedException -> L8d
            goto L86
        L41:
            boolean r0 = r6.A02()     // Catch: java.lang.InterruptedException -> L8d
            if (r0 == 0) goto L86
            X.1xz r5 = r8.A02     // Catch: java.lang.InterruptedException -> L8d
            java.util.concurrent.ConcurrentHashMap r1 = r5.A0A     // Catch: java.lang.InterruptedException -> L8d
            java.lang.String r0 = r6.A04     // Catch: java.lang.InterruptedException -> L8d
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.InterruptedException -> L8d
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch: java.lang.InterruptedException -> L8d
            if (r0 == 0) goto L7b
            java.lang.Object r4 = r0.get()     // Catch: java.lang.InterruptedException -> L8d
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4     // Catch: java.lang.InterruptedException -> L8d
            if (r4 != 0) goto L75
        L5d:
            android.content.Context r3 = r6.A00()     // Catch: java.lang.InterruptedException -> L8d
            X.0JM r2 = r6.A03     // Catch: java.lang.InterruptedException -> L8d
            X.05w r1 = r5.A01     // Catch: java.lang.InterruptedException -> L8d
            X.01B r0 = r5.A03     // Catch: java.lang.InterruptedException -> L8d
            byte[] r1 = X.C43791xz.A02(r3, r2, r1, r0)     // Catch: java.lang.InterruptedException -> L8d
            if (r1 == 0) goto L75
            java.lang.String r0 = r2.A0B     // Catch: java.lang.InterruptedException -> L8d
            if (r0 == 0) goto L89
            android.graphics.drawable.Drawable r4 = r5.A03(r0, r1, r6)     // Catch: java.lang.InterruptedException -> L8d
        L75:
            X.08q r0 = r5.A02     // Catch: java.lang.InterruptedException -> L8d
            r6.A01(r4, r0)     // Catch: java.lang.InterruptedException -> L8d
            goto L86
        L7b:
            r4 = r7
            goto L5d
        L7d:
            if (r4 != 0) goto L86
            X.1xz r0 = r8.A02     // Catch: java.lang.InterruptedException -> L8d
            r0.A00 = r7     // Catch: java.lang.InterruptedException -> L8d
            r8.interrupt()     // Catch: java.lang.InterruptedException -> L8d
        L86:
            r4 = r6
            goto L7
        L88:
            return
        L89:
            throw r7     // Catch: java.lang.InterruptedException -> L8d
        L8a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.InterruptedException -> L8d
            throw r0     // Catch: java.lang.InterruptedException -> L8d
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44141ya.run():void");
    }
}
