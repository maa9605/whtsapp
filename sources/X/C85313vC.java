package X;

/* renamed from: X.3vC */
/* loaded from: classes2.dex */
public class C85313vC implements InterfaceC19940wW {
    public C2DZ A00;
    public final C0IX A01;
    public final C43421xN A02;

    public C85313vC(C0IX c0ix, C43421xN c43421xN) {
        this.A01 = c0ix;
        this.A02 = c43421xN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0016, code lost:
        if (r8 == 7) goto L40;
     */
    @Override // X.InterfaceC19940wW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A6N(int r8, java.lang.String r9, java.lang.String r10, byte[] r11, byte[] r12, byte[] r13, byte[] r14, byte[] r15, byte[] r16) {
        /*
            r7 = this;
            X.2DZ r0 = r7.A00
            if (r0 == 0) goto L7d
            if (r8 == 0) goto L59
            r0 = 11
            if (r8 == r0) goto L56
            r0 = 4
            if (r8 == r0) goto L53
            r0 = 5
            if (r8 == r0) goto L18
            r0 = 6
            if (r8 == r0) goto L18
            r0 = 7
            r6 = 23
            if (r8 != r0) goto L19
        L18:
            r6 = 3
        L19:
            X.1xN r5 = r7.A02
            r0 = 0
            if (r5 == 0) goto L7c
            if (r6 != 0) goto L6e
            r3 = 1
            r5.A06 = r3
            X.23G r4 = r5.A0R
            r4.A07(r9)
            r4.A0A(r10)
            r1 = 2
            if (r11 == 0) goto L35
            java.lang.String r0 = android.util.Base64.encodeToString(r11, r1)
            r4.A09(r0)
        L35:
            if (r12 == 0) goto L3e
            java.lang.String r0 = android.util.Base64.encodeToString(r12, r1)
            r4.A08(r0)
        L3e:
            if (r13 == 0) goto L68
            long r0 = java.lang.System.currentTimeMillis()
            X.1xh r2 = new X.1xh
            r2.<init>(r13, r0)
            if (r15 == 0) goto L68
            r0 = r16
            if (r16 == 0) goto L68
            if (r14 == 0) goto L68
            monitor-enter(r4)
            goto L5b
        L53:
            r6 = 17
            goto L19
        L56:
            r6 = 19
            goto L19
        L59:
            r6 = 0
            goto L19
        L5b:
            r4.A00 = r2     // Catch: java.lang.Throwable -> L64
            r4.A0F = r15     // Catch: java.lang.Throwable -> L64
            r4.A0H = r0     // Catch: java.lang.Throwable -> L64
            r4.A0I = r14     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L67:
            monitor-exit(r4)
        L68:
            X.0It r0 = r5.A0P
            X.0Is r0 = r0.A01
            r0.A00 = r3
        L6e:
            X.2DZ r1 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.A01 = r0
            java.util.concurrent.CountDownLatch r0 = r1.A00
            r0.countDown()
            return
        L7c:
            throw r0
        L7d:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85313vC.A6N(int, java.lang.String, java.lang.String, byte[], byte[], byte[], byte[], byte[], byte[]):void");
    }

    @Override // X.InterfaceC19940wW
    public boolean AF6() {
        return ((C0CH) this.A02).A02.isCancelled();
    }

    @Override // X.InterfaceC19940wW
    public void AQt(long j, long j2, long j3) {
        this.A02.A07(j2);
    }
}
