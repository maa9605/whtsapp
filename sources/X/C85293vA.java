package X;

/* renamed from: X.3vA */
/* loaded from: classes2.dex */
public class C85293vA implements InterfaceC19930wV {
    public C2DZ A00;
    public final C0IX A01;
    public final C43221x3 A02;

    @Override // X.InterfaceC19930wV
    public boolean AF6() {
        return false;
    }

    public C85293vA(C0IX c0ix, C43221x3 c43221x3) {
        this.A01 = c0ix;
        this.A02 = c43221x3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0018, code lost:
        if (r6 == 7) goto L15;
     */
    @Override // X.InterfaceC19930wV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A6M(int r6) {
        /*
            r5 = this;
            X.2DZ r4 = r5.A00
            if (r4 == 0) goto L30
            r3 = 0
            r2 = 0
            if (r6 == 0) goto L1c
            r2 = 11
            if (r6 == r2) goto L2d
            r0 = 4
            if (r6 == r0) goto L1c
            r0 = 5
            if (r6 == r0) goto L1a
            r0 = 6
            if (r6 == r0) goto L1a
            r0 = 7
            r2 = 17
            if (r6 != r0) goto L1c
        L1a:
            r2 = 9
        L1c:
            r1 = 0
            if (r2 != 0) goto L20
            r3 = 1
        L20:
            X.0Ic r0 = new X.0Ic
            r0.<init>(r2, r1, r3)
            r4.A01 = r0
            java.util.concurrent.CountDownLatch r0 = r4.A00
            r0.countDown()
            return
        L2d:
            r2 = 8
            goto L1c
        L30:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85293vA.A6M(int):void");
    }

    @Override // X.InterfaceC19930wV
    public void AQt(long j, long j2, long j3) {
        this.A02.A0J.A04(Long.valueOf(j2));
    }
}
