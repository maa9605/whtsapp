package X;

import android.util.Log;

/* renamed from: X.0yk */
/* loaded from: classes.dex */
public final class C21070yk {
    public long A00;
    public C21070yk A01;
    public C21080yl A02;
    public C220910z A03;
    public C222311n A04;
    public C222311n A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC30011Zj A08;
    public final InterfaceC219210i A09;
    public final AbstractC222211m A0A;
    public final Object A0B;
    public final AbstractC39181pi[] A0C;
    public final InterfaceC220210s[] A0D;
    public final boolean[] A0E;

    public C21070yk(AbstractC39181pi[] abstractC39181piArr, long j, AbstractC222211m abstractC222211m, AnonymousClass127 anonymousClass127, InterfaceC219210i interfaceC219210i, C21080yl c21080yl) {
        this.A0C = abstractC39181piArr;
        long j2 = c21080yl.A02;
        this.A00 = j - j2;
        this.A0A = abstractC222211m;
        this.A09 = interfaceC219210i;
        C219010g c219010g = c21080yl.A03;
        Object obj = c219010g.A04;
        if (obj != null) {
            this.A0B = obj;
            this.A02 = c21080yl;
            int length = abstractC39181piArr.length;
            this.A0D = new InterfaceC220210s[length];
            this.A0E = new boolean[length];
            InterfaceC30011Zj A6u = interfaceC219210i.A6u(c219010g, anonymousClass127, j2);
            long j3 = c219010g.A02;
            this.A08 = j3 != Long.MIN_VALUE ? new C39251pp(A6u, j3) : A6u;
            return;
        }
        throw null;
    }

    public long A00() {
        if (!this.A07) {
            return this.A02.A02;
        }
        if (this.A06) {
            long A8c = this.A08.A8c();
            if (A8c != Long.MIN_VALUE) {
                return A8c;
            }
        }
        return this.A02.A01;
    }

    public long A01(long j, boolean z, boolean[] zArr) {
        C222311n c222311n;
        AbstractC39181pi[] abstractC39181piArr;
        int length;
        int i = 0;
        while (true) {
            c222311n = this.A05;
            boolean z2 = true;
            if (i >= c222311n.A00) {
                break;
            }
            boolean[] zArr2 = this.A0E;
            if (z || !c222311n.A00(this.A04, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        InterfaceC220210s[] interfaceC220210sArr = this.A0D;
        int i2 = 0;
        while (true) {
            abstractC39181piArr = this.A0C;
            length = abstractC39181piArr.length;
            if (i2 >= length) {
                break;
            }
            if (abstractC39181piArr[i2].A08 == 6) {
                interfaceC220210sArr[i2] = null;
            }
            i2++;
        }
        A03(c222311n);
        C222111l c222111l = c222311n.A01;
        long ASM = this.A08.ASM(c222111l.A00(), this.A0E, interfaceC220210sArr, zArr, j);
        for (int i3 = 0; i3 < length; i3++) {
            if (abstractC39181piArr[i3].A08 == 6) {
                if (this.A05.A03[i3] != null) {
                    interfaceC220210sArr[i3] = new InterfaceC220210s() { // from class: X.1Zf
                        @Override // X.InterfaceC220210s
                        public boolean AFf() {
                            return true;
                        }

                        @Override // X.InterfaceC220210s
                        public void AGS() {
                        }

                        @Override // X.InterfaceC220210s
                        public int AUu(long j2) {
                            return 0;
                        }

                        @Override // X.InterfaceC220210s
                        public int AR6(C21040yh c21040yh, C1ZK c1zk, boolean z3) {
                            ((AbstractC21590za) c1zk).A00 = 4;
                            return -4;
                        }
                    };
                }
            }
        }
        this.A06 = false;
        for (int i4 = 0; i4 < interfaceC220210sArr.length; i4++) {
            if (interfaceC220210sArr[i4] != null) {
                C002701i.A1K(this.A05.A03[i4] != null);
                if (abstractC39181piArr[i4].A08 != 6) {
                    this.A06 = true;
                }
            } else {
                C002701i.A1K(c222111l.A02[i4] == null);
            }
        }
        return ASM;
    }

    public void A02() {
        A03(null);
        try {
            if (this.A02.A03.A02 != Long.MIN_VALUE) {
                this.A09.ARE(((C39251pp) this.A08).A04);
            } else {
                this.A09.ARE(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void A03(C222311n c222311n) {
        C222311n c222311n2 = this.A04;
        if (c222311n2 != null) {
            for (int i = 0; i < c222311n2.A00; i++) {
            }
        }
        this.A04 = c222311n;
        if (c222311n != null) {
            for (int i2 = 0; i2 < c222311n.A00; i2++) {
            }
        }
    }

    public boolean A04() {
        if (this.A07) {
            return !this.A06 || this.A08.A8c() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1008:0x06ce, code lost:
        if (r5 == r2) goto L535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0152, code lost:
        if ((r1 & r30) == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x018f, code lost:
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:904:0x0557, code lost:
        if (r0 == null) goto L438;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:673:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A05() {
        /*
            Method dump skipped, instructions count: 1827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21070yk.A05():boolean");
    }
}
