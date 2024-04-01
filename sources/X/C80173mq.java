package X;

/* renamed from: X.3mq  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C80173mq implements C3VZ {
    public final C71173Vc A00;

    @Override // X.C3VZ
    public int ABO() {
        return 21;
    }

    public C80173mq(C71173Vc c71173Vc) {
        this.A00 = c71173Vc;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    @Override // X.C3VZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A6S() {
        /*
            r10 = this;
            X.3Vc r9 = r10.A00
            X.1ud r3 = r9.A01
            int r1 = r3.A01()
            r0 = 5
            if (r1 != r0) goto L24
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L24
            r8 = 12
            android.app.job.JobInfo r2 = r9.A01(r8)
            r7 = 13
            android.app.job.JobInfo r1 = r9.A01(r7)
            if (r2 != 0) goto L25
            if (r1 != 0) goto L25
            r9.A03()
        L24:
            return
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L2f
            r0.add(r2)
        L2f:
            if (r1 == 0) goto L34
            r0.add(r1)
        L34:
            long r5 = r3.A02()
            java.util.Iterator r4 = r0.iterator()
        L3c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r3 = r4.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            long r1 = r3.getMinLatencyMillis()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L58
            long r1 = r3.getMaxExecutionDelayMillis()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L3c
        L58:
            r9.A05(r8)
            r9.A05(r7)
            r9.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80173mq.A6S():void");
    }

    @Override // X.C3VZ
    public boolean AFj() {
        C71173Vc c71173Vc = this.A00;
        if (!(c71173Vc.A01(12) != null)) {
            if (!(c71173Vc.A01(13) != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C3VZ
    public void ASC() {
        this.A00.A03();
    }

    @Override // X.C3VZ
    public void cancel() {
        C71173Vc c71173Vc = this.A00;
        c71173Vc.A05(12);
        c71173Vc.A05(13);
    }
}
