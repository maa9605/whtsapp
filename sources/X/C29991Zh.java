package X;

/* renamed from: X.1Zh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29991Zh implements InterfaceC220210s {
    public final int A00;
    public final /* synthetic */ C39271pr A01;

    public C29991Zh(C39271pr c39271pr, int i) {
        this.A01 = c39271pr;
        this.A00 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r3.A06() != false) goto L15;
     */
    @Override // X.InterfaceC220210s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AFf() {
        /*
            r4 = this;
            X.1pr r3 = r4.A01
            int r2 = r4.A00
            boolean r0 = r3.A0D
            if (r0 != 0) goto Lf
            boolean r1 = r3.A06()
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 != 0) goto L24
            boolean r0 = r3.A0B
            if (r0 != 0) goto L22
            X.1Zk[] r0 = r3.A0K
            r0 = r0[r2]
            X.10p r0 = r0.A09
            boolean r0 = r0.A01()
            if (r0 == 0) goto L24
        L22:
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29991Zh.AFf():boolean");
    }

    @Override // X.InterfaceC220210s
    public void AGS() {
        this.A01.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r10.A06() != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC220210s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int AR6(X.C21040yh r13, X.C1ZK r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29991Zh.AR6(X.0yh, X.1ZK, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r6 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r5.A06() != false) goto L26;
     */
    @Override // X.InterfaceC220210s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int AUu(long r8) {
        /*
            r7 = this;
            X.1pr r5 = r7.A01
            int r4 = r7.A00
            boolean r0 = r5.A0D
            if (r0 != 0) goto Lf
            boolean r1 = r5.A06()
            r0 = 0
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            r6 = 0
            if (r0 != 0) goto L45
            r5.A03(r4)
            X.1Zk[] r0 = r5.A0K
            r3 = r0[r4]
            boolean r0 = r5.A0B
            if (r0 == 0) goto L35
            long r1 = r3.A03()
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L35
            X.10p r2 = r3.A09
            monitor-enter(r2)
            int r1 = r2.A02     // Catch: java.lang.Throwable -> L32
            int r0 = r2.A03     // Catch: java.lang.Throwable -> L32
            int r6 = r1 - r0
            r2.A03 = r1     // Catch: java.lang.Throwable -> L32
            goto L3f
        L32:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L35:
            r0 = 1
            int r1 = r3.A01(r8, r0)
            r0 = -1
            if (r1 == r0) goto L42
            r6 = r1
            goto L40
        L3f:
            monitor-exit(r2)
        L40:
            if (r6 != 0) goto L45
        L42:
            r5.A04(r4)
        L45:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29991Zh.AUu(long):int");
    }
}
