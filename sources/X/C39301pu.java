package X;

/* renamed from: X.1pu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39301pu extends AbstractC29931Zb {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AbstractC21230z0 A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C39301pu(X.AbstractC21230z0 r3, int r4) {
        /*
            r2 = this;
            X.1Zl r0 = new X.1Zl
            r0.<init>(r4)
            r2.<init>(r0)
            r2.A03 = r3
            int r1 = r3.A00()
            r2.A00 = r1
            int r0 = r3.A01()
            r2.A01 = r0
            r2.A02 = r4
            if (r1 <= 0) goto L28
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r0 / r1
            if (r4 <= r0) goto L28
            java.lang.String r1 = "LoopingMediaSource contains too many periods"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39301pu.<init>(X.0z0, int):void");
    }

    @Override // X.AbstractC21230z0
    public int A00() {
        return this.A00 * this.A02;
    }

    @Override // X.AbstractC21230z0
    public int A01() {
        return this.A01 * this.A02;
    }
}
