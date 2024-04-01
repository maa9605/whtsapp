package X;

/* renamed from: X.0aD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07860aD extends AbstractC05150Nn {
    public int A00;
    public long A01;
    public boolean A02;
    public final int A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.AbstractC05150Nn
    public String A03() {
        return "MessageStanza";
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
        if (r22.A07 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C07860aD(X.AnonymousClass012 r18, X.AbstractC000600i r19, X.AnonymousClass011 r20, X.C0EJ r21, X.C05190Nr r22, long r23, long r25) {
        /*
            r17 = this;
            r4 = r22
            java.lang.String r10 = r4.A0d
            r13 = 0
            java.lang.Integer r0 = r4.A0F
            r9 = r21
            r11 = r23
            r14 = r25
            r6 = r18
            r5 = r17
            r7 = r19
            r8 = r20
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r16)
            int r0 = X.C0E3.A05(r4)
            r5.A03 = r0
            X.05j r0 = r4.A08
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2b
            X.05j r1 = r4.A07
            r0 = 1
            if (r1 != 0) goto L2c
        L2b:
            r0 = 0
        L2c:
            r5.A05 = r0
            int r1 = r4.A01
            r0 = 0
            if (r1 <= 0) goto L34
            r0 = 1
        L34:
            r5.A04 = r0
            int r0 = r4.A00()
            if (r0 <= 0) goto L3d
            r3 = 1
        L3d:
            r5.A06 = r3
            r5.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07860aD.<init>(X.012, X.00i, X.011, X.0EJ, X.0Nr, long, long):void");
    }

    @Override // X.AbstractC05150Nn
    public AnonymousClass014 A02(int i, long j) {
        C37281mA c37281mA = new C37281mA();
        c37281mA.A00 = Boolean.valueOf(this.A05);
        c37281mA.A04 = Integer.valueOf(this.A00);
        c37281mA.A08 = Long.valueOf(j);
        c37281mA.A01 = Boolean.valueOf(this.A02);
        c37281mA.A02 = Boolean.valueOf(this.A04);
        Integer num = this.A0A;
        if (num != null) {
            c37281mA.A09 = Long.valueOf(num.intValue());
        }
        c37281mA.A03 = Boolean.valueOf(this.A06);
        c37281mA.A05 = Integer.valueOf(i);
        c37281mA.A06 = Integer.valueOf(this.A03);
        c37281mA.A07 = Long.valueOf(this.A01);
        return c37281mA;
    }

    @Override // X.AbstractC05150Nn
    public void A04(C36471kr c36471kr) {
        c36471kr.A03 = 1;
        c36471kr.A01 = Integer.valueOf(this.A00);
        c36471kr.A02 = Integer.valueOf(this.A03);
    }

    @Override // X.AbstractC05150Nn
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; messageType = ");
        sb.append(this.A03);
        sb.append("; hasSenderKeyDistributionMessage = ");
        sb.append(this.A05);
        sb.append("; ephemeral = ");
        sb.append(this.A04);
        sb.append("; revoke = ");
        sb.append(this.A06);
        sb.append("; decryptionSuccess = ");
        sb.append(this.A02);
        sb.append("; mediaType = ");
        sb.append(this.A00);
        sb.append("; decryptQueueSize = ");
        sb.append(this.A01);
        return sb.toString();
    }
}
