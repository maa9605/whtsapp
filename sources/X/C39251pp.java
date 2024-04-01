package X;

/* renamed from: X.1pp */
/* loaded from: classes.dex */
public final class C39251pp implements InterfaceC30011Zj, InterfaceC30001Zi {
    public long A00;
    public InterfaceC30001Zi A02;
    public final InterfaceC30011Zj A04;
    public C29951Zd[] A03 = new C29951Zd[0];
    public long A01 = 0;

    public C39251pp(InterfaceC30011Zj interfaceC30011Zj, long j) {
        this.A04 = interfaceC30011Zj;
        this.A00 = j;
    }

    public boolean A00() {
        return this.A01 != -9223372036854775807L;
    }

    @Override // X.InterfaceC30011Zj
    public boolean A6V(long j) {
        return this.A04.A6V(j);
    }

    @Override // X.InterfaceC30011Zj
    public void A7G(long j, boolean z) {
        this.A04.A7G(j, z);
    }

    @Override // X.InterfaceC30011Zj
    public long A8J(long j, C21200yx c21200yx) {
        C21200yx c21200yx2 = c21200yx;
        if (j == 0) {
            return 0L;
        }
        long j2 = c21200yx2.A01;
        long max = Math.max(0L, Math.min(j2, j - 0));
        long j3 = c21200yx2.A00;
        long j4 = this.A00;
        long max2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (max != j2 || max2 != j3) {
            c21200yx2 = new C21200yx(max, max2);
        }
        return this.A04.A8J(j, c21200yx2);
    }

    @Override // X.InterfaceC30011Zj
    public long A8c() {
        long A8c = this.A04.A8c();
        if (A8c != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || A8c < j) {
                return A8c;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.InterfaceC30011Zj
    public long ABb() {
        long ABb = this.A04.ABb();
        if (ABb != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || ABb < j) {
                return ABb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.InterfaceC30011Zj
    public C220910z ADZ() {
        return this.A04.ADZ();
    }

    @Override // X.InterfaceC30011Zj
    public void AGT() {
        this.A04.AGT();
    }

    @Override // X.InterfaceC220310t
    public void AJ0(InterfaceC220410u interfaceC220410u) {
        this.A02.AJ0(this);
    }

    @Override // X.InterfaceC30001Zi
    public void ANG(InterfaceC30011Zj interfaceC30011Zj) {
        this.A02.ANG(this);
    }

    @Override // X.InterfaceC30011Zj
    public void AQo(InterfaceC30001Zi interfaceC30001Zi, long j) {
        this.A02 = interfaceC30001Zi;
        this.A04.AQo(this, j);
    }

    @Override // X.InterfaceC30011Zj
    public long AR7() {
        if (A00()) {
            long j = this.A01;
            this.A01 = -9223372036854775807L;
            long AR7 = AR7();
            return AR7 != -9223372036854775807L ? AR7 : j;
        }
        long AR72 = this.A04.AR7();
        if (AR72 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C002701i.A1K(AR72 >= 0);
        long j2 = this.A00;
        if (j2 != Long.MIN_VALUE && AR72 > j2) {
            z = false;
        }
        C002701i.A1K(z);
        return AR72;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0031, code lost:
        if (r5 > r3) goto L18;
     */
    @Override // X.InterfaceC30011Zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long ASL(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.1Zd[] r3 = r8.A03
            int r2 = r3.length
            r7 = 0
            r1 = 0
        Lc:
            if (r1 >= r2) goto L17
            r0 = r3[r1]
            if (r0 == 0) goto L14
            r0.A00 = r7
        L14:
            int r1 = r1 + 1
            goto Lc
        L17:
            X.1Zj r0 = r8.A04
            long r5 = r0.ASL(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L33
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L34
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L34
        L33:
            r7 = 1
        L34:
            X.C002701i.A1K(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39251pp.ASL(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x004b, code lost:
        if (r11 > r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC30011Zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long ASM(X.InterfaceC222011k[] r18, boolean[] r19, X.InterfaceC220210s[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r5 = r20
            int r4 = r5.length
            X.1Zd[] r7 = new X.C29951Zd[r4]
            r6 = r17
            r6.A03 = r7
            X.10s[] r13 = new X.InterfaceC220210s[r4]
            r3 = 0
            r1 = 0
        Ld:
            r2 = 0
            if (r1 >= r4) goto L21
            r0 = r20[r1]
            r7[r1] = r0
            r0 = r7[r1]
            if (r0 == 0) goto L1c
            r0 = r7[r1]
            X.10s r2 = r0.A01
        L1c:
            r13[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L21:
            X.1Zj r10 = r6.A04
            r12 = r19
            r11 = r18
            r15 = r22
            r14 = r21
            long r11 = r10.ASM(r11, r12, r13, r14, r15)
            r10 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.A01 = r0
            int r0 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r0 == 0) goto L4d
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 < 0) goto L7b
            long r0 = r6.A00
            r8 = -9223372036854775808
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L4d
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 > 0) goto L7b
        L4d:
            X.C002701i.A1K(r10)
        L50:
            if (r3 >= r4) goto L7d
            r0 = r13[r3]
            if (r0 != 0) goto L61
            X.1Zd[] r7 = r6.A03
            r7[r3] = r2
        L5a:
            r0 = r7[r3]
            r20[r3] = r0
            int r3 = r3 + 1
            goto L50
        L61:
            r0 = r20[r3]
            if (r0 == 0) goto L6f
            X.1Zd[] r7 = r6.A03
            r0 = r7[r3]
            X.10s r1 = r0.A01
            r0 = r13[r3]
            if (r1 == r0) goto L5a
        L6f:
            X.1Zd[] r7 = r6.A03
            r1 = r13[r3]
            X.1Zd r0 = new X.1Zd
            r0.<init>(r6, r1)
            r7[r3] = r0
            goto L5a
        L7b:
            r10 = 0
            goto L4d
        L7d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39251pp.ASM(X.11k[], boolean[], X.10s[], boolean[], long):long");
    }
}
