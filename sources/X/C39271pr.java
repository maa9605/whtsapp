package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1pr */
/* loaded from: classes.dex */
public final class C39271pr implements InterfaceC30011Zj, InterfaceC21760zr, InterfaceC220110r, C12C, C12G {
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC21810zw A07;
    public C218910e A08;
    public InterfaceC30001Zi A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final Uri A0M;
    public final C218710c A0O;
    public final InterfaceC218810d A0P;
    public final C219410k A0Q;
    public final InterfaceC06380Sv A0R;
    public final AnonymousClass127 A0S;
    public final C12B A0T;
    public final long A0L = 1048576;
    public final C12J A0U = new C12J();
    public final C12T A0V = new C12T();
    public final Runnable A0W = new Runnable() { // from class: X.10a
        {
            C39271pr.this = this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:130:0x009f, code lost:
            if (r7.A9r() != (-9223372036854775807L)) goto L68;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC218510a.run():void");
        }
    };
    public final Runnable A0X = new Runnable() { // from class: X.10R
        {
            C39271pr.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C39271pr c39271pr = C39271pr.this;
            if (!c39271pr.A0G) {
                InterfaceC30001Zi interfaceC30001Zi = c39271pr.A09;
                if (interfaceC30001Zi != null) {
                    interfaceC30001Zi.AJ0(c39271pr);
                    return;
                }
                throw null;
            }
        }
    };
    public final Handler A0N = new Handler();
    public int[] A0J = new int[0];
    public C30021Zk[] A0K = new C30021Zk[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;
    public int A00 = 1;

    public C39271pr(Uri uri, InterfaceC06380Sv interfaceC06380Sv, InterfaceC21750zq[] interfaceC21750zqArr, C12B c12b, C219410k c219410k, InterfaceC218810d interfaceC218810d, AnonymousClass127 anonymousClass127) {
        this.A0M = uri;
        this.A0R = interfaceC06380Sv;
        this.A0T = c12b;
        this.A0Q = c219410k;
        this.A0P = interfaceC218810d;
        this.A0S = anonymousClass127;
        this.A0O = new C218710c(interfaceC21750zqArr);
        c219410k.A02();
    }

    public final int A00() {
        int i = 0;
        for (C30021Zk c30021Zk : this.A0K) {
            C219910p c219910p = c30021Zk.A09;
            i += c219910p.A00 + c219910p.A02;
        }
        return i;
    }

    public void A01() {
        IOException iOException;
        C12J c12j = this.A0U;
        int i = this.A00 == 7 ? 6 : 3;
        IOException iOException2 = c12j.A01;
        if (iOException2 == null) {
            C12E c12e = c12j.A00;
            if (c12e != null && (iOException = c12e.A02) != null && c12e.A00 > i) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final void A02() {
        C29981Zg c29981Zg = new C29981Zg(this, this.A0M, this.A0R, this.A0O, this, this.A0V);
        if (this.A0F) {
            C218910e c218910e = this.A08;
            if (c218910e != null) {
                InterfaceC21810zw interfaceC21810zw = c218910e.A00;
                C002701i.A1K(A06());
                long j = this.A03;
                if (j != -9223372036854775807L && this.A06 >= j) {
                    this.A0B = true;
                    this.A06 = -9223372036854775807L;
                    return;
                }
                long j2 = interfaceC21810zw.AD0(this.A06).A00.A00;
                long j3 = this.A06;
                c29981Zg.A06.A00 = j2;
                c29981Zg.A01 = j3;
                c29981Zg.A03 = true;
                this.A06 = -9223372036854775807L;
            } else {
                throw null;
            }
        }
        this.A02 = A00();
        C12J c12j = this.A0U;
        int i = this.A00 == 7 ? 6 : 3;
        if (c12j != null) {
            Looper myLooper = Looper.myLooper();
            C002701i.A1K(myLooper != null);
            c12j.A01 = null;
            new C12E(c12j, myLooper, c29981Zg, this, i, SystemClock.elapsedRealtime()).A00(0L);
            C219410k c219410k = this.A0Q;
            AnonymousClass126 anonymousClass126 = c29981Zg.A02;
            long j4 = c29981Zg.A01;
            long j5 = this.A03;
            if (c219410k == null) {
                throw null;
            }
            Uri uri = anonymousClass126.A05;
            Collections.emptyMap();
            c219410k.A07(new C219510l(uri), new C219610m(1, -1, null, 0, null, c219410k.A01(j4), c219410k.A01(j5)));
            return;
        }
        throw null;
    }

    public final void A03(int i) {
        int i2;
        C218910e c218910e = this.A08;
        if (c218910e != null) {
            boolean[] zArr = c218910e.A04;
            if (zArr[i]) {
                return;
            }
            C21030yg c21030yg = c218910e.A01.A02[i].A02[0];
            C219410k c219410k = this.A0Q;
            String str = c21030yg.A0P;
            if (TextUtils.isEmpty(str)) {
                i2 = -1;
            } else if ("audio".equals(C223412b.A02(str))) {
                i2 = 1;
            } else if ("video".equals(C223412b.A02(str))) {
                i2 = 2;
            } else if ("text".equals(C223412b.A02(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
                i2 = 3;
            } else if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
                i2 = 4;
            } else if ("application/x-camera-motion".equals(str)) {
                i2 = 5;
            } else {
                ArrayList arrayList = C223412b.A00;
                if (0 < arrayList.size()) {
                    arrayList.get(0);
                    throw null;
                }
                i2 = -1;
            }
            c219410k.A09(new C219610m(1, i2, c21030yg, 0, null, c219410k.A01(this.A04), -9223372036854775807L));
            zArr[i] = true;
            return;
        }
        throw null;
    }

    public final void A04(int i) {
        C218910e c218910e = this.A08;
        if (c218910e != null) {
            boolean[] zArr = c218910e.A03;
            if (this.A0E && zArr[i] && !this.A0K[i].A09.A01()) {
                this.A06 = 0L;
                this.A0E = false;
                this.A0D = true;
                this.A04 = 0L;
                this.A02 = 0;
                for (C30021Zk c30021Zk : this.A0K) {
                    c30021Zk.A05();
                }
                InterfaceC30001Zi interfaceC30001Zi = this.A09;
                if (interfaceC30001Zi == null) {
                    throw null;
                }
                interfaceC30001Zi.AJ0(this);
                return;
            }
            return;
        }
        throw null;
    }

    public void A05(C12F c12f, long j, long j2, boolean z) {
        C29981Zg c29981Zg = (C29981Zg) c12f;
        C219410k c219410k = this.A0Q;
        c219410k.A05(new C219510l(c29981Zg.A08.A01), new C219610m(1, -1, null, 0, null, c219410k.A01(c29981Zg.A01), c219410k.A01(this.A03)));
        if (z) {
            return;
        }
        if (this.A05 == -1) {
            this.A05 = c29981Zg.A00;
        }
        for (C30021Zk c30021Zk : this.A0K) {
            c30021Zk.A05();
        }
        if (this.A01 > 0) {
            InterfaceC30001Zi interfaceC30001Zi = this.A09;
            if (interfaceC30001Zi != null) {
                interfaceC30001Zi.AJ0(this);
                return;
            }
            throw null;
        }
    }

    public final boolean A06() {
        return this.A06 != -9223372036854775807L;
    }

    @Override // X.InterfaceC30011Zj
    public boolean A6V(long j) {
        boolean z;
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        C12T c12t = this.A0V;
        synchronized (c12t) {
            if (c12t.A00) {
                z = false;
            } else {
                c12t.A00 = true;
                c12t.notifyAll();
                z = true;
            }
        }
        if (this.A0U.A00 == null) {
            A02();
            return true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0032, code lost:
        if (r0 == r3) goto L43;
     */
    @Override // X.InterfaceC30011Zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A7G(long r16, boolean r18) {
        /*
            r15 = this;
            boolean r0 = r15.A06()
            if (r0 == 0) goto L7
            return
        L7:
            X.10e r0 = r15.A08
            if (r0 == 0) goto L6a
            boolean[] r12 = r0.A02
            X.1Zk[] r0 = r15.A0K
            int r11 = r0.length
            r10 = 0
        L11:
            if (r10 >= r11) goto L69
            X.1Zk[] r0 = r15.A0K
            r9 = r0[r10]
            boolean r13 = r12[r10]
            X.10p r8 = r9.A09
            monitor-enter(r8)
            int r3 = r8.A02     // Catch: java.lang.Throwable -> L66
            r1 = -1
            if (r3 == 0) goto L5f
            long[] r7 = r8.A0F     // Catch: java.lang.Throwable -> L66
            int r6 = r8.A04     // Catch: java.lang.Throwable -> L66
            r4 = r7[r6]     // Catch: java.lang.Throwable -> L66
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 < 0) goto L5f
            if (r13 == 0) goto L34
            int r0 = r8.A03     // Catch: java.lang.Throwable -> L66
            int r5 = r0 + 1
            if (r0 != r3) goto L35
        L34:
            r5 = r3
        L35:
            r4 = -1
            r3 = 0
        L37:
            if (r3 >= r5) goto L54
            r13 = r7[r6]     // Catch: java.lang.Throwable -> L66
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 > 0) goto L54
            if (r18 == 0) goto L49
            int[] r0 = r8.A0B     // Catch: java.lang.Throwable -> L66
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L66
            r0 = r0 & 1
            if (r0 == 0) goto L4a
        L49:
            r4 = r3
        L4a:
            int r6 = r6 + 1
            int r0 = r8.A01     // Catch: java.lang.Throwable -> L66
            if (r6 != r0) goto L51
            r6 = 0
        L51:
            int r3 = r3 + 1
            goto L37
        L54:
            r0 = -1
            if (r4 != r0) goto L59
            monitor-exit(r8)
            goto L60
        L59:
            long r1 = r8.A00(r4)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r8)
            goto L60
        L5f:
            monitor-exit(r8)
        L60:
            r9.A06(r1)
            int r10 = r10 + 1
            goto L11
        L66:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L69:
            return
        L6a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39271pr.A7G(long, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0056, code lost:
        if (r7 > r13) goto L34;
     */
    @Override // X.InterfaceC30011Zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A8J(long r20, X.C21200yx r22) {
        /*
            r19 = this;
            r9 = r20
            r0 = r19
            X.10e r0 = r0.A08
            if (r0 == 0) goto L7f
            X.0zw r1 = r0.A00
            boolean r0 = r1.AFl()
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            X.0zv r1 = r1.AD0(r9)
            X.0zx r0 = r1.A00
            long r7 = r0.A01
            X.0zx r0 = r1.A01
            long r5 = r0.A01
            X.0yx r0 = X.C21200yx.A03
            r13 = r22
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L7e
            long r1 = r13.A01
            r17 = -9223372036854775808
            long r11 = r20 - r1
            long r1 = r1 ^ r20
            long r3 = r20 ^ r11
            long r1 = r1 & r3
            r15 = 0
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 < 0) goto L3c
            r17 = r11
        L3c:
            long r2 = r13.A00
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r11 = r20 + r2
            long r0 = r20 ^ r11
            long r2 = r2 ^ r11
            long r2 = r2 & r0
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 < 0) goto L4e
            r13 = r11
        L4e:
            r2 = 1
            int r0 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r0 > 0) goto L58
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L59
        L58:
            r1 = 0
        L59:
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 > 0) goto L76
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 > 0) goto L76
        L61:
            if (r1 == 0) goto L7a
            if (r2 == 0) goto L79
            long r0 = r7 - r20
            long r3 = java.lang.Math.abs(r0)
            long r0 = r5 - r20
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L78
            return r7
        L76:
            r2 = 0
            goto L61
        L78:
            return r5
        L79:
            return r7
        L7a:
            if (r2 == 0) goto L7d
            return r5
        L7d:
            return r17
        L7e:
            return r9
        L7f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39271pr.A8J(long, X.0yx):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x004e, code lost:
        if (r2 == Long.MAX_VALUE) goto L39;
     */
    @Override // X.InterfaceC30011Zj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long A8c() {
        /*
            r11 = this;
            X.10e r0 = r11.A08
            if (r0 == 0) goto L6c
            boolean[] r6 = r0.A03
            boolean r0 = r11.A0B
            r9 = -9223372036854775808
            if (r0 == 0) goto Ld
            return r9
        Ld:
            boolean r0 = r11.A06()
            if (r0 == 0) goto L16
            long r0 = r11.A06
            return r0
        L16:
            boolean r0 = r11.A0A
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L50
            X.1Zk[] r0 = r11.A0K
            int r5 = r0.length
            r4 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L28:
            if (r4 >= r5) goto L4c
            boolean r0 = r6[r4]
            if (r0 == 0) goto L46
            X.1Zk[] r0 = r11.A0K
            r0 = r0[r4]
            X.10p r1 = r0.A09
            monitor-enter(r1)
            boolean r0 = r1.A08     // Catch: java.lang.Throwable -> L49
            monitor-exit(r1)
            if (r0 != 0) goto L46
            X.1Zk[] r0 = r11.A0K
            r0 = r0[r4]
            long r0 = r0.A03()
            long r2 = java.lang.Math.min(r2, r0)
        L46:
            int r4 = r4 + 1
            goto L28
        L49:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L4c:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L65
        L50:
            X.1Zk[] r6 = r11.A0K
            int r5 = r6.length
            r2 = -9223372036854775808
            r4 = 0
        L56:
            if (r4 >= r5) goto L65
            r0 = r6[r4]
            long r0 = r0.A03()
            long r2 = java.lang.Math.max(r2, r0)
            int r4 = r4 + 1
            goto L56
        L65:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L6b
            long r2 = r11.A04
        L6b:
            return r2
        L6c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39271pr.A8c():long");
    }

    @Override // X.InterfaceC30011Zj
    public long ABb() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A8c();
    }

    @Override // X.InterfaceC30011Zj
    public C220910z ADZ() {
        C218910e c218910e = this.A08;
        if (c218910e != null) {
            return c218910e.A01;
        }
        throw null;
    }

    @Override // X.InterfaceC30011Zj
    public void AGT() {
        A01();
    }

    @Override // X.InterfaceC30011Zj
    public void AQo(InterfaceC30001Zi interfaceC30001Zi, long j) {
        this.A09 = interfaceC30001Zi;
        C12T c12t = this.A0V;
        synchronized (c12t) {
            if (!c12t.A00) {
                c12t.A00 = true;
                c12t.notifyAll();
            }
        }
        A02();
    }

    @Override // X.InterfaceC30011Zj
    public long AR7() {
        if (!this.A0C) {
            this.A0Q.A04();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                this.A0D = false;
                return this.A04;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // X.InterfaceC30011Zj
    public long ASL(long j) {
        int i;
        C218910e c218910e = this.A08;
        if (c218910e != null) {
            InterfaceC21810zw interfaceC21810zw = c218910e.A00;
            boolean[] zArr = c218910e.A03;
            if (!interfaceC21810zw.AFl()) {
                j = 0;
            }
            this.A0D = false;
            this.A04 = j;
            if (A06()) {
                this.A06 = j;
                return j;
            }
            if (this.A00 != 7) {
                int length = this.A0K.length;
                while (i < length) {
                    C30021Zk c30021Zk = this.A0K[i];
                    C219910p c219910p = c30021Zk.A09;
                    synchronized (c219910p) {
                        c219910p.A03 = 0;
                    }
                    c30021Zk.A04 = c30021Zk.A03;
                    i = (c30021Zk.A01(j, false) != -1 || (!zArr[i] && this.A0A)) ? i + 1 : 0;
                }
                return j;
            }
            this.A0E = false;
            this.A06 = j;
            this.A0B = false;
            C12E c12e = this.A0U.A00;
            if (c12e != null) {
                c12e.A01(false);
            } else {
                for (C30021Zk c30021Zk2 : this.A0K) {
                    c30021Zk2.A05();
                }
            }
            return j;
        }
        throw null;
    }

    @Override // X.InterfaceC30011Zj
    public long ASM(InterfaceC222011k[] interfaceC222011kArr, boolean[] zArr, InterfaceC220210s[] interfaceC220210sArr, boolean[] zArr2, long j) {
        int length;
        long j2 = j;
        C218910e c218910e = this.A08;
        if (c218910e != null) {
            C220910z c220910z = c218910e.A01;
            boolean[] zArr3 = c218910e.A02;
            int i = this.A01;
            int i2 = i;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                length = interfaceC222011kArr.length;
                if (i4 >= length) {
                    break;
                }
                if (interfaceC220210sArr[i4] != null && (interfaceC222011kArr[i4] == null || !zArr[i4])) {
                    int i5 = ((C29991Zh) interfaceC220210sArr[i4]).A00;
                    C002701i.A1K(zArr3[i5]);
                    i2--;
                    this.A01 = i2;
                    zArr3[i5] = false;
                    interfaceC220210sArr[i4] = null;
                }
                i4++;
            }
            boolean z = !this.A0I ? j == 0 : i != 0;
            for (int i6 = 0; i6 < length; i6++) {
                if (interfaceC220210sArr[i6] == null && interfaceC222011kArr[i6] != null) {
                    InterfaceC222011k interfaceC222011k = interfaceC222011kArr[i6];
                    C002701i.A1K(interfaceC222011k.length() == 1);
                    C002701i.A1K(interfaceC222011k.AAZ(0) == 0);
                    C220710x ADY = interfaceC222011k.ADY();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= c220910z.A01) {
                            i7 = -1;
                            break;
                        } else if (c220910z.A02[i7] == ADY) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    C002701i.A1K(!zArr3[i7]);
                    this.A01++;
                    zArr3[i7] = true;
                    interfaceC220210sArr[i6] = new C29991Zh(this, i7);
                    zArr2[i6] = true;
                    if (z) {
                        continue;
                    } else {
                        C30021Zk c30021Zk = this.A0K[i7];
                        C219910p c219910p = c30021Zk.A09;
                        synchronized (c219910p) {
                            c219910p.A03 = 0;
                        }
                        c30021Zk.A04 = c30021Zk.A03;
                        if (c30021Zk.A01(j2, true) == -1) {
                            C219910p c219910p2 = c30021Zk.A09;
                            z = true;
                            if (c219910p2.A00 + c219910p2.A03 != 0) {
                            }
                        }
                        z = false;
                    }
                }
            }
            if (this.A01 == 0) {
                this.A0E = false;
                this.A0D = false;
                C12J c12j = this.A0U;
                C12E c12e = c12j.A00;
                C30021Zk[] c30021ZkArr = this.A0K;
                int length2 = c30021ZkArr.length;
                if (c12e != null) {
                    for (C30021Zk c30021Zk2 : c30021ZkArr) {
                        c30021Zk2.A04();
                    }
                    c12j.A00.A01(false);
                } else {
                    while (i3 < length2) {
                        c30021ZkArr[i3].A05();
                        i3++;
                    }
                }
            } else if (z) {
                j2 = ASL(j2);
                while (i3 < interfaceC220210sArr.length) {
                    if (interfaceC220210sArr[i3] != null) {
                        zArr2[i3] = true;
                    }
                    i3++;
                }
            }
            this.A0I = true;
            return j2;
        }
        throw null;
    }
}
