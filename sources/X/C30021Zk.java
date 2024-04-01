package X;

/* renamed from: X.1Zk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C30021Zk implements InterfaceC21840zz {
    public long A00;
    public C21030yg A01;
    public C21030yg A02;
    public C220010q A03;
    public C220010q A04;
    public C220010q A05;
    public InterfaceC220110r A06;
    public final int A07;
    public final C219810o A08;
    public final C219910p A09;
    public final AnonymousClass127 A0A;
    public final C223812f A0B;

    public C30021Zk(AnonymousClass127 anonymousClass127) {
        this.A0A = anonymousClass127;
        int i = anonymousClass127.A04;
        this.A07 = i;
        this.A09 = new C219910p();
        this.A08 = new C219810o();
        this.A0B = new C223812f(32);
        C220010q c220010q = new C220010q(0L, i);
        this.A03 = c220010q;
        this.A04 = c220010q;
        this.A05 = c220010q;
    }

    public final int A00(int i) {
        C223211z c223211z;
        C220010q c220010q = this.A05;
        C220010q c220010q2 = c220010q;
        if (!c220010q.A02) {
            AnonymousClass127 anonymousClass127 = this.A0A;
            synchronized (anonymousClass127) {
                anonymousClass127.A00++;
                int i2 = anonymousClass127.A01;
                if (i2 > 0) {
                    C223211z[] c223211zArr = anonymousClass127.A03;
                    int i3 = i2 - 1;
                    anonymousClass127.A01 = i3;
                    c223211z = c223211zArr[i3];
                    c223211zArr[i3] = null;
                } else {
                    c223211z = new C223211z(new byte[anonymousClass127.A04]);
                }
            }
            c220010q2 = this.A05;
            C220010q c220010q3 = new C220010q(c220010q2.A03, this.A07);
            c220010q.A01 = c223211z;
            c220010q.A00 = c220010q3;
            c220010q.A02 = true;
        }
        return Math.min(i, (int) (c220010q2.A03 - this.A00));
    }

    public int A01(long j, boolean z) {
        C219910p c219910p = this.A09;
        synchronized (c219910p) {
            int i = c219910p.A04 + c219910p.A03;
            int i2 = c219910p.A01;
            if (i >= i2) {
                i -= i2;
            }
            if (c219910p.A01()) {
                long[] jArr = c219910p.A0F;
                if (j >= jArr[i] && (j <= c219910p.A06 || z)) {
                    int i3 = c219910p.A02;
                    int i4 = c219910p.A03;
                    int i5 = i3 - i4;
                    int i6 = -1;
                    for (int i7 = 0; i7 < i5 && jArr[i] <= j; i7++) {
                        if ((c219910p.A0B[i] & 1) != 0) {
                            i6 = i7;
                        }
                        i++;
                        if (i == c219910p.A01) {
                            i = 0;
                        }
                    }
                    if (i6 == -1) {
                        return -1;
                    }
                    c219910p.A03 = i4 + i6;
                    return i6;
                }
            }
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r6 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A02(X.C21740zp r14, int r15) {
        /*
            r13 = this;
            int r10 = r13.A00(r15)
            X.10q r1 = r13.A05
            X.11z r0 = r1.A01
            byte[] r8 = r0.A00
            long r2 = r13.A00
            long r0 = r1.A04
            long r2 = r2 - r0
            int r9 = (int) r2
            r11 = 0
            int r9 = r9 + r11
            r7 = r14
            int r0 = r14.A00
            if (r0 == 0) goto L25
            int r6 = java.lang.Math.min(r0, r10)
            byte[] r0 = r14.A03
            java.lang.System.arraycopy(r0, r11, r8, r9, r6)
            r14.A02(r6)
            if (r6 != 0) goto L2a
        L25:
            r12 = 1
            int r6 = r7.A00(r8, r9, r10, r11, r12)
        L2a:
            r0 = -1
            if (r6 == r0) goto L33
            long r2 = r14.A02
            long r0 = (long) r6
            long r2 = r2 + r0
            r14.A02 = r2
        L33:
            r0 = -1
            if (r6 != r0) goto L3c
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L3c:
            long r4 = r13.A00
            long r0 = (long) r6
            long r4 = r4 + r0
            r13.A00 = r4
            X.10q r3 = r13.A05
            long r1 = r3.A03
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L4e
            X.10q r0 = r3.A00
            r13.A05 = r0
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30021Zk.A02(X.0zp, int):int");
    }

    public long A03() {
        long j;
        C219910p c219910p = this.A09;
        synchronized (c219910p) {
            j = c219910p.A06;
        }
        return j;
    }

    public void A04() {
        long A00;
        C219910p c219910p = this.A09;
        synchronized (c219910p) {
            int i = c219910p.A02;
            if (i != 0) {
                A00 = c219910p.A00(i);
            } else {
                A00 = -1;
            }
        }
        A06(A00);
    }

    public void A05() {
        C219910p c219910p = this.A09;
        int i = 0;
        c219910p.A02 = 0;
        c219910p.A00 = 0;
        c219910p.A04 = 0;
        c219910p.A03 = 0;
        c219910p.A0A = true;
        c219910p.A05 = Long.MIN_VALUE;
        c219910p.A06 = Long.MIN_VALUE;
        c219910p.A08 = false;
        C220010q c220010q = this.A03;
        if (c220010q.A02) {
            C220010q c220010q2 = this.A05;
            int i2 = (((int) (c220010q2.A04 - c220010q.A04)) / this.A07) + (c220010q2.A02 ? 1 : 0);
            C223211z[] c223211zArr = new C223211z[i2];
            while (i < i2) {
                c223211zArr[i] = c220010q.A01;
                c220010q.A01 = null;
                C220010q c220010q3 = c220010q.A00;
                c220010q.A00 = null;
                i++;
                c220010q = c220010q3;
            }
            this.A0A.A02(c223211zArr);
        }
        C220010q c220010q4 = new C220010q(0L, this.A07);
        this.A03 = c220010q4;
        this.A04 = c220010q4;
        this.A05 = c220010q4;
        this.A00 = 0L;
        this.A0A.A00();
    }

    public final void A06(long j) {
        C220010q c220010q;
        if (j == -1) {
            return;
        }
        while (true) {
            c220010q = this.A03;
            if (j < c220010q.A03) {
                break;
            }
            AnonymousClass127 anonymousClass127 = this.A0A;
            C223211z c223211z = c220010q.A01;
            synchronized (anonymousClass127) {
                C223211z[] c223211zArr = anonymousClass127.A06;
                c223211zArr[0] = c223211z;
                anonymousClass127.A02(c223211zArr);
            }
            C220010q c220010q2 = this.A03;
            c220010q2.A01 = null;
            C220010q c220010q3 = c220010q2.A00;
            c220010q2.A00 = null;
            this.A03 = c220010q3;
        }
        if (this.A04.A04 < c220010q.A04) {
            this.A04 = c220010q;
        }
    }

    public final void A07(long j, byte[] bArr, int i) {
        C220010q c220010q;
        while (true) {
            c220010q = this.A04;
            if (j < c220010q.A03) {
                break;
            }
            this.A04 = c220010q.A00;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (c220010q.A03 - j));
            System.arraycopy(c220010q.A01.A00, ((int) (j - c220010q.A04)) + 0, bArr, i - i2, min);
            i2 -= min;
            j += min;
            c220010q = this.A04;
            if (j == c220010q.A03) {
                c220010q = c220010q.A00;
                this.A04 = c220010q;
            }
        }
    }
}
