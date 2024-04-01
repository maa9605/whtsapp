package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.util.List;

/* renamed from: X.0vf */
/* loaded from: classes.dex */
public class C19580vf extends AbstractC24681Cl {
    public static boolean A0b;
    public static boolean A0c;
    public static final int[] A0d = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public Surface A0M;
    public Surface A0N;
    public C225812z A0O;
    public AnonymousClass130 A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final AnonymousClass134 A0W;
    public final AnonymousClass136 A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    public C19580vf(Context context, C10C c10c, InterfaceC21720zn interfaceC21720zn, Handler handler, AnonymousClass137 anonymousClass137) {
        super(2, c10c, interfaceC21720zn, 30.0f);
        this.A0U = 5000L;
        this.A0T = 50;
        Context applicationContext = context.getApplicationContext();
        this.A0V = applicationContext;
        this.A0W = new AnonymousClass134(applicationContext);
        this.A0X = new AnonymousClass136(handler, anonymousClass137);
        this.A0Y = "NVIDIA".equals(C08M.A03);
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0L = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A07 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0E = 1;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
    }

    public static int A00(C10A c10a, C21030yg c21030yg) {
        int i = c21030yg.A09;
        if (i != -1) {
            List list = c21030yg.A0Q;
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return i + i2;
        }
        return A01(c10a, c21030yg.A0P, c21030yg.A0F, c21030yg.A08);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0014, code lost:
        if (r5.equals("video/x-vnd.on2.vp9") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x001d, code lost:
        if (r5.equals("video/x-vnd.on2.vp8") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0067, code lost:
        if (r5.equals("video/mp4v-es") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0070, code lost:
        if (r5.equals("video/hevc") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0072, code lost:
        r6 = r6 * r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x007a, code lost:
        if (r5.equals("video/3gpp") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x007c, code lost:
        r6 = r6 * r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(X.C10A r4, java.lang.String r5, int r6, int r7) {
        /*
            r1 = -1
            if (r6 == r1) goto L84
            if (r7 == r1) goto L84
            int r0 = r5.hashCode()
            r2 = 4
            switch(r0) {
                case -1664118616: goto L74;
                case -1662541442: goto L6a;
                case 1187890754: goto L61;
                case 1331836730: goto L20;
                case 1599127256: goto L17;
                case 1599127257: goto Le;
                default: goto Ld;
            }
        Ld:
            return r1
        Le:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
            goto L72
        L17:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
            goto L7c
        L20:
            java.lang.String r0 = "video/avc"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
            java.lang.String r3 = X.C08M.A04
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L50
            java.lang.String r2 = X.C08M.A03
            java.lang.String r0 = "Amazon"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L51
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L50
            java.lang.String r0 = "AFTS"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L51
            boolean r0 = r4.A06
            if (r0 == 0) goto L51
        L50:
            return r1
        L51:
            r2 = 16
            int r6 = r6 + r2
            int r1 = r6 + (-1)
            int r1 = r1 / r2
            int r7 = r7 + r2
            int r0 = r7 + (-1)
            int r0 = r0 / r2
            int r0 = r0 * r1
            int r0 = r0 << 4
            int r6 = r0 << 4
            goto L7d
        L61:
            java.lang.String r0 = "video/mp4v-es"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
            goto L7c
        L6a:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
        L72:
            int r6 = r6 * r7
            goto L7e
        L74:
            java.lang.String r0 = "video/3gpp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
        L7c:
            int r6 = r6 * r7
        L7d:
            r2 = 2
        L7e:
            int r1 = r6 * 3
            int r0 = r2 << 1
            int r1 = r1 / r0
            return r1
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580vf.A01(X.10A, java.lang.String, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:807:0x050f, code lost:
        if (r1.equals("HWWAS-H") != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x0529, code lost:
        if (r4.equals("AFTA") != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580vf.A02(java.lang.String):boolean");
    }

    @Override // X.AbstractC39181pi
    public void A07() {
        this.A08 = 0;
        this.A0G = SystemClock.elapsedRealtime();
        this.A0K = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // X.AbstractC39181pi
    public void A08() {
        this.A0I = -9223372036854775807L;
        A0a();
    }

    @Override // X.AbstractC24681Cl, X.AbstractC39181pi
    public void A09() {
        this.A07 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0L = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A09 = 0;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
        A0Z();
        AnonymousClass134 anonymousClass134 = this.A0W;
        if (anonymousClass134.A09 != null) {
            AnonymousClass132 anonymousClass132 = anonymousClass134.A0A;
            if (anonymousClass132 != null) {
                anonymousClass132.A00.unregisterDisplayListener(anonymousClass132);
            }
            anonymousClass134.A0B.A02.sendEmptyMessage(2);
        }
        this.A0P = null;
        this.A0S = false;
        try {
            super.A09();
            synchronized (super.A0C) {
            }
            final AnonymousClass136 anonymousClass136 = this.A0X;
            final C21630ze c21630ze = super.A0C;
            if (anonymousClass136.A01 != null) {
                anonymousClass136.A00.post(new Runnable() { // from class: X.12t
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass136 anonymousClass1362 = anonymousClass136;
                        C21630ze c21630ze2 = c21630ze;
                        synchronized (c21630ze2) {
                        }
                        anonymousClass1362.A01.AQK(c21630ze2);
                    }
                });
            }
        } catch (Throwable th) {
            synchronized (super.A0C) {
                final AnonymousClass136 anonymousClass1362 = this.A0X;
                final C21630ze c21630ze2 = super.A0C;
                if (anonymousClass1362.A01 != null) {
                    anonymousClass1362.A00.post(new Runnable() { // from class: X.12t
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass136 anonymousClass13622 = anonymousClass1362;
                            C21630ze c21630ze22 = c21630ze2;
                            synchronized (c21630ze22) {
                            }
                            anonymousClass13622.A01.AQK(c21630ze22);
                        }
                    });
                }
                throw th;
            }
        }
    }

    @Override // X.AbstractC24681Cl, X.AbstractC39181pi
    public void A0A(long j, boolean z) {
        long j2;
        super.A0A(j, z);
        A0Z();
        this.A0H = -9223372036854775807L;
        this.A04 = 0;
        this.A0J = -9223372036854775807L;
        int i = this.A09;
        if (i != 0) {
            this.A0L = this.A0Z[i - 1];
            this.A09 = 0;
        }
        if (z) {
            long j3 = this.A0U;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A0I = j2;
            return;
        }
        this.A0I = -9223372036854775807L;
    }

    @Override // X.AbstractC39181pi
    public void A0B(boolean z) {
        final C21630ze c21630ze = new C21630ze();
        super.A0C = c21630ze;
        int i = ((AbstractC39181pi) this).A03.A00;
        this.A0F = i;
        this.A0S = i != 0;
        final AnonymousClass136 anonymousClass136 = this.A0X;
        if (anonymousClass136.A01 != null) {
            anonymousClass136.A00.post(new Runnable() { // from class: X.12s
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass136 anonymousClass1362 = anonymousClass136;
                    anonymousClass1362.A01.AQL(c21630ze);
                }
            });
        }
        AnonymousClass134 anonymousClass134 = this.A0W;
        anonymousClass134.A08 = false;
        if (anonymousClass134.A09 != null) {
            anonymousClass134.A0B.A02.sendEmptyMessage(1);
            AnonymousClass132 anonymousClass132 = anonymousClass134.A0A;
            if (anonymousClass132 != null) {
                anonymousClass132.A00.registerDisplayListener(anonymousClass132, null);
            }
            anonymousClass134.A00();
        }
    }

    @Override // X.AbstractC39181pi
    public void A0C(C21030yg[] c21030ygArr, long j) {
        if (this.A0L == -9223372036854775807L) {
            this.A0L = j;
            return;
        }
        int i = this.A09;
        long[] jArr = this.A0Z;
        if (i == jArr.length) {
            StringBuilder A0P = C000200d.A0P("Too many stream changes, so dropping offset: ");
            A0P.append(jArr[i - 1]);
            Log.w("MediaCodecVideoRenderer", A0P.toString());
        } else {
            this.A09 = i + 1;
        }
        int i2 = this.A09 - 1;
        jArr[i2] = j;
        this.A0a[i2] = this.A0J;
    }

    @Override // X.AbstractC24681Cl
    public float A0D(float f, C21030yg c21030yg, C21030yg[] c21030ygArr) {
        float f2 = -1.0f;
        for (C21030yg c21030yg2 : c21030ygArr) {
            float f3 = c21030yg2.A01;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 != -1.0f) {
            return f2 * f;
        }
        return -1.0f;
    }

    @Override // X.AbstractC24681Cl
    public int A0E(MediaCodec mediaCodec, C10A c10a, C21030yg c21030yg, C21030yg c21030yg2) {
        if (c10a.A04(c21030yg, c21030yg2, true)) {
            int i = c21030yg2.A0F;
            C225812z c225812z = this.A0O;
            if (i > c225812z.A02 || c21030yg2.A08 > c225812z.A00 || A00(c10a, c21030yg2) > this.A0O.A01) {
                return 0;
            }
            return !c21030yg.A03(c21030yg2) ? 3 : 1;
        }
        return 0;
    }

    @Override // X.AbstractC24681Cl
    public int A0F(C10C c10c, InterfaceC21720zn interfaceC21720zn, C21030yg c21030yg) {
        String str = c21030yg.A0P;
        if (!"video".equals(C223412b.A02(str))) {
            return 0;
        }
        C21690zk c21690zk = c21030yg.A0H;
        boolean z = false;
        if (c21690zk != null) {
            for (int i = 0; i < c21690zk.A01; i++) {
                z |= c21690zk.A03[i].A04;
            }
        }
        List A9j = c10c.A9j(str, z);
        if (A9j.isEmpty()) {
            return (!z || c10c.A9j(str, false).isEmpty()) ? 1 : 2;
        } else if (AbstractC39181pi.A03(interfaceC21720zn, c21690zk)) {
            C10A c10a = (C10A) A9j.get(0);
            return (c10a.A02(c21030yg) ? 4 : 3) | (c10a.A03(c21030yg) ? 16 : 8) | (c10a.A07 ? 32 : 0);
        } else {
            return 2;
        }
    }

    @Override // X.AbstractC24681Cl
    public void A0I() {
        super.A0I();
        this.A03 = 0;
    }

    @Override // X.AbstractC24681Cl
    public void A0J() {
        try {
            super.A0J();
        } finally {
            this.A03 = 0;
            Surface surface = this.A0M;
            if (surface != null) {
                if (this.A0N == surface) {
                    this.A0N = null;
                }
                surface.release();
                this.A0M = null;
            }
        }
    }

    @Override // X.AbstractC24681Cl
    public void A0P(long j) {
        this.A03--;
        while (true) {
            int i = this.A09;
            if (i == 0) {
                return;
            }
            long[] jArr = this.A0a;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.A0Z;
            this.A0L = jArr2[0];
            int i2 = i - 1;
            this.A09 = i2;
            System.arraycopy(jArr2, 1, jArr2, 0, i2);
            System.arraycopy(jArr, 1, jArr, 0, this.A09);
        }
    }

    @Override // X.AbstractC24681Cl
    public void A0Q(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        A0f(mediaCodec, integer, integer2);
    }

    @Override // X.AbstractC24681Cl
    public void A0R(final C21030yg c21030yg) {
        super.A0R(c21030yg);
        final AnonymousClass136 anonymousClass136 = this.A0X;
        if (anonymousClass136.A01 != null) {
            anonymousClass136.A00.post(new Runnable() { // from class: X.12o
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass136 anonymousClass1362 = anonymousClass136;
                    anonymousClass1362.A01.AQM(c21030yg);
                }
            });
        }
        this.A01 = c21030yg.A02;
        this.A0A = c21030yg.A0B;
    }

    @Override // X.AbstractC24681Cl
    public void A0S(C1ZK c1zk) {
        this.A03++;
        long j = c1zk.A00;
        this.A0J = Math.max(j, this.A0J);
        if (C08M.A00 < 23 && this.A0S) {
            C21030yg A0G = A0G(j);
            if (A0G != null) {
                A0f(((AbstractC24681Cl) this).A08, A0G.A0F, A0G.A08);
            }
            A0b();
            A0Y();
            A0P(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x011d, code lost:
        if (r14.A08 == (-1)) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01a5 A[SYNTHETIC] */
    @Override // X.AbstractC24681Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0T(X.C10A r23, android.media.MediaCodec r24, X.C21030yg r25, android.media.MediaCrypto r26, float r27) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580vf.A0T(X.10A, android.media.MediaCodec, X.0yg, android.media.MediaCrypto, float):void");
    }

    @Override // X.AbstractC24681Cl
    public void A0U(final String str, final long j, final long j2) {
        final AnonymousClass136 anonymousClass136 = this.A0X;
        if (anonymousClass136.A01 != null) {
            anonymousClass136.A00.post(new Runnable() { // from class: X.12r
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass136 anonymousClass1362 = anonymousClass136;
                    anonymousClass1362.A01.AQJ(str, j, j2);
                }
            });
        }
        this.A0Q = A02(str);
    }

    @Override // X.AbstractC24681Cl
    public boolean A0V() {
        return this.A0S;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0184  */
    @Override // X.AbstractC24681Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0W(long r29, long r31, android.media.MediaCodec r33, java.nio.ByteBuffer r34, int r35, int r36, long r37, boolean r39, X.C21030yg r40) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580vf.A0W(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, X.0yg):boolean");
    }

    @Override // X.AbstractC24681Cl
    public boolean A0X(C10A c10a) {
        return this.A0N != null || A0h(c10a);
    }

    public void A0Y() {
        if (this.A0R) {
            return;
        }
        this.A0R = true;
        AnonymousClass136 anonymousClass136 = this.A0X;
        Surface surface = this.A0N;
        if (anonymousClass136.A01 != null) {
            anonymousClass136.A00.post(new RunnableC224812p(anonymousClass136, surface));
        }
    }

    public final void A0Z() {
        MediaCodec mediaCodec;
        this.A0R = false;
        if (C08M.A00 < 23 || !this.A0S || (mediaCodec = ((AbstractC24681Cl) this).A08) == null) {
            return;
        }
        this.A0P = new AnonymousClass130(this, mediaCodec);
    }

    public final void A0a() {
        final int i = this.A08;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.A0G;
            final AnonymousClass136 anonymousClass136 = this.A0X;
            if (anonymousClass136.A01 != null) {
                anonymousClass136.A00.post(new Runnable() { // from class: X.12u
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass136 anonymousClass1362 = anonymousClass136;
                        anonymousClass1362.A01.AJd(i, j);
                    }
                });
            }
            this.A08 = 0;
            this.A0G = elapsedRealtime;
        }
    }

    public final void A0b() {
        int i = this.A07;
        if (i == -1 && this.A05 == -1) {
            return;
        }
        if (this.A0D == i && this.A0B == this.A05 && this.A0C == this.A06 && this.A02 == this.A00) {
            return;
        }
        AnonymousClass136 anonymousClass136 = this.A0X;
        int i2 = this.A05;
        int i3 = this.A06;
        float f = this.A00;
        if (anonymousClass136.A01 != null) {
            anonymousClass136.A00.post(new RunnableC224912q(anonymousClass136, i, i2, i3, f));
        }
        this.A0D = this.A07;
        this.A0B = this.A05;
        this.A0C = this.A06;
        this.A02 = this.A00;
    }

    public final void A0c() {
        int i = this.A0D;
        if (i != -1 || this.A0B != -1) {
            AnonymousClass136 anonymousClass136 = this.A0X;
            int i2 = this.A0B;
            int i3 = this.A0C;
            float f = this.A02;
            if (anonymousClass136.A01 != null) {
                anonymousClass136.A00.post(new RunnableC224912q(anonymousClass136, i, i2, i3, f));
            }
        }
    }

    public void A0d(int i) {
        C21630ze c21630ze = super.A0C;
        c21630ze.A02 += i;
        int i2 = this.A08 + i;
        this.A08 = i2;
        int i3 = this.A04 + i;
        this.A04 = i3;
        c21630ze.A05 = Math.max(i3, c21630ze.A05);
        int i4 = this.A0T;
        if (i4 <= 0 || i2 < i4) {
            return;
        }
        A0a();
    }

    public void A0e(MediaCodec mediaCodec, int i) {
        A0b();
        C07K.A1R("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C07K.A12();
        this.A0K = SystemClock.elapsedRealtime() * 1000;
        super.A0C.A06++;
        this.A04 = 0;
        A0Y();
    }

    public final void A0f(MediaCodec mediaCodec, int i, int i2) {
        this.A07 = i;
        this.A05 = i2;
        float f = this.A01;
        this.A00 = f;
        if (C08M.A00 >= 21) {
            int i3 = this.A0A;
            if (i3 == 90 || i3 == 270) {
                this.A07 = i2;
                this.A05 = i;
                this.A00 = 1.0f / f;
            }
        } else {
            this.A06 = this.A0A;
        }
        mediaCodec.setVideoScalingMode(this.A0E);
    }

    public void A0g(MediaCodec mediaCodec, int i, long j) {
        A0b();
        C07K.A1R("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        C07K.A12();
        this.A0K = SystemClock.elapsedRealtime() * 1000;
        super.A0C.A06++;
        this.A04 = 0;
        A0Y();
    }

    public final boolean A0h(C10A c10a) {
        if (C08M.A00 < 23 || this.A0S || A02(c10a.A02)) {
            return false;
        }
        return !c10a.A06 || C225712y.A02(this.A0V);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0054, code lost:
        if (r8 != null) goto L22;
     */
    @Override // X.AbstractC39181pi, X.InterfaceC21150ys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AEG(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            r5 = 1
            if (r7 != r5) goto L8c
            android.view.Surface r8 = (android.view.Surface) r8
            if (r8 != 0) goto Lc
            android.view.Surface r0 = r6.A0M
            if (r0 == 0) goto L77
            r8 = r0
        Lc:
            android.view.Surface r0 = r6.A0N
            if (r0 == r8) goto L57
            r6.A0N = r8
            int r4 = r6.A01
            r3 = 2
            if (r4 == r5) goto L19
            if (r4 != r3) goto L54
        L19:
            android.media.MediaCodec r2 = r6.A08
            int r1 = X.C08M.A00
            r0 = 23
            if (r1 < r0) goto L4e
            if (r2 == 0) goto L4e
            if (r8 == 0) goto L4e
            boolean r0 = r6.A0Q
            if (r0 != 0) goto L4e
            r2.setOutputSurface(r8)
        L2c:
            android.view.Surface r0 = r6.A0M
            if (r8 == r0) goto L9f
            r6.A0c()
            r6.A0Z()
            if (r4 != r3) goto L47
            long r3 = r6.A0U
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L48
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 + r3
        L45:
            r6.A0I = r0
        L47:
            return
        L48:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L45
        L4e:
            r6.A0J()
            r6.A0L()
        L54:
            if (r8 == 0) goto L9f
            goto L2c
        L57:
            if (r8 == 0) goto L47
            android.view.Surface r0 = r6.A0M
            if (r8 == r0) goto L47
            r6.A0c()
            boolean r0 = r6.A0R
            if (r0 == 0) goto L47
            X.136 r3 = r6.A0X
            android.view.Surface r2 = r6.A0N
            X.137 r0 = r3.A01
            if (r0 == 0) goto L47
            android.os.Handler r1 = r3.A00
            X.12p r0 = new X.12p
            r0.<init>(r3, r2)
            r1.post(r0)
            return
        L77:
            X.10A r2 = r6.A0D
            if (r2 == 0) goto Lc
            boolean r0 = r6.A0h(r2)
            if (r0 == 0) goto Lc
            android.content.Context r1 = r6.A0V
            boolean r0 = r2.A06
            X.12y r8 = X.C225712y.A01(r1, r0)
            r6.A0M = r8
            goto Lc
        L8c:
            r0 = 4
            if (r7 != r0) goto L47
            java.lang.Number r8 = (java.lang.Number) r8
            int r1 = r8.intValue()
            r6.A0E = r1
            android.media.MediaCodec r0 = r6.A08
            if (r0 == 0) goto L47
            r0.setVideoScalingMode(r1)
            return
        L9f:
            r1 = -1
            r6.A0D = r1
            r6.A0B = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6.A02 = r0
            r6.A0C = r1
            r6.A0Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19580vf.AEG(int, java.lang.Object):void");
    }

    @Override // X.AbstractC24681Cl, X.C1Z6
    public boolean AFf() {
        Surface surface;
        if (super.AFf() && (this.A0R || (((surface = this.A0M) != null && this.A0N == surface) || ((AbstractC24681Cl) this).A08 == null || this.A0S))) {
            this.A0I = -9223372036854775807L;
            return true;
        }
        long j = this.A0I;
        if (j == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < j) {
            return true;
        }
        this.A0I = -9223372036854775807L;
        return false;
    }
}
