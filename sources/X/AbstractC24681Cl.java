package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Cl */
/* loaded from: classes.dex */
public abstract class AbstractC24681Cl extends AbstractC39181pi {
    public static final byte[] A0j;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public MediaCodec A08;
    public C21030yg A09;
    public C21030yg A0A;
    public C21030yg A0B;
    public C21630ze A0C;
    public C10A A0D;
    public C10B A0E;
    public ByteBuffer A0F;
    public ArrayDeque A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public ByteBuffer[] A0Y;
    public ByteBuffer[] A0Z;
    public final float A0a;
    public final MediaCodec.BufferInfo A0b;
    public final C21040yh A0c;
    public final C1ZK A0d;
    public final C1ZK A0e;
    public final InterfaceC21720zn A0f;
    public final C10C A0g;
    public final C224612n A0h;
    public final List A0i;

    @Override // X.AbstractC39181pi
    public final int A04() {
        return 8;
    }

    public abstract float A0D(float f, C21030yg c21030yg, C21030yg[] c21030ygArr);

    public abstract int A0E(MediaCodec mediaCodec, C10A c10a, C21030yg c21030yg, C21030yg c21030yg2);

    public abstract int A0F(C10C c10c, InterfaceC21720zn interfaceC21720zn, C21030yg c21030yg);

    public void A0K() {
    }

    public abstract void A0P(long j);

    public abstract void A0Q(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void A0S(C1ZK c1zk);

    public abstract void A0T(C10A c10a, MediaCodec mediaCodec, C21030yg c21030yg, MediaCrypto mediaCrypto, float f);

    public abstract void A0U(String str, long j, long j2);

    public boolean A0V() {
        return false;
    }

    public abstract boolean A0W(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, C21030yg c21030yg);

    public boolean A0X(C10A c10a) {
        return true;
    }

    static {
        int length = "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2), 16) << 4));
        }
        A0j = bArr;
    }

    public AbstractC24681Cl(int i, C10C c10c, InterfaceC21720zn interfaceC21720zn, float f) {
        super(i);
        C002701i.A1K(C08M.A00 >= 16);
        this.A0g = c10c;
        this.A0f = interfaceC21720zn;
        this.A0a = f;
        this.A0d = new C1ZK(0);
        this.A0e = new C1ZK(0);
        this.A0c = new C21040yh();
        this.A0h = new C224612n();
        this.A0i = new ArrayList();
        this.A0b = new MediaCodec.BufferInfo();
        this.A03 = 0;
        this.A04 = 0;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
    }

    @Override // X.AbstractC39181pi
    public final int A05(C21030yg c21030yg) {
        try {
            return A0F(this.A0g, null, c21030yg);
        } catch (C10E e) {
            throw new C20930yW(1, e, super.A00);
        }
    }

    @Override // X.AbstractC39181pi
    public void A09() {
        this.A09 = null;
        this.A0G = null;
        A0J();
    }

    @Override // X.AbstractC39181pi
    public void A0A(long j, boolean z) {
        this.A0T = false;
        this.A0U = false;
        if (this.A08 != null) {
            A0I();
        }
        this.A0h.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final C21030yg A0G(long j) {
        C21030yg c21030yg;
        C224612n c224612n = this.A0h;
        synchronized (c224612n) {
            c21030yg = null;
            while (true) {
                int i = c224612n.A01;
                if (i <= 0) {
                    break;
                }
                long[] jArr = c224612n.A02;
                int i2 = c224612n.A00;
                if (j - jArr[i2] < 0) {
                    break;
                }
                ?? r0 = c224612n.A03;
                ?? r2 = r0[i2];
                r0[i2] = 0;
                c224612n.A00 = (i2 + 1) % r0.length;
                c224612n.A01 = i - 1;
                c21030yg = r2;
            }
        }
        C21030yg c21030yg2 = c21030yg;
        if (c21030yg2 != null) {
            this.A0A = c21030yg2;
        }
        return c21030yg2;
    }

    public List A0H(C10C c10c, C21030yg c21030yg, boolean z) {
        return c10c.A9j(c21030yg.A0P, z);
    }

    public void A0I() {
        this.A07 = -9223372036854775807L;
        A0N();
        this.A06 = -1;
        this.A0F = null;
        this.A0X = true;
        this.A0W = false;
        this.A0i.clear();
        this.A0I = false;
        this.A0V = false;
        if (this.A0N || (this.A0K && this.A0R)) {
            A0J();
            A0L();
        } else if (this.A04 != 0) {
            A0J();
            A0L();
        } else {
            this.A08.flush();
            this.A0Q = false;
        }
        if (!this.A0S || this.A09 == null) {
            return;
        }
        this.A03 = 1;
    }

    public void A0J() {
        this.A07 = -9223372036854775807L;
        A0N();
        this.A06 = -1;
        this.A0F = null;
        this.A0W = false;
        this.A0i.clear();
        if (C08M.A00 < 21) {
            this.A0Y = null;
            this.A0Z = null;
        }
        this.A0D = null;
        this.A0S = false;
        this.A0Q = false;
        this.A0J = false;
        this.A0N = false;
        this.A02 = 0;
        this.A0P = false;
        this.A0K = false;
        this.A0O = false;
        this.A0I = false;
        this.A0V = false;
        this.A0M = false;
        this.A0R = false;
        this.A03 = 0;
        this.A04 = 0;
        this.A0H = false;
        MediaCodec mediaCodec = this.A08;
        if (mediaCodec != null) {
            this.A0C.A01++;
            try {
                mediaCodec.stop();
                try {
                    this.A08.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.A08.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:259:0x01ae, code lost:
        if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(r8) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x01c6, code lost:
        if ("OMX.MTK.VIDEO.DECODER.AVC".equals(r8) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0204, code lost:
        if ("stvm8".equals(r6) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0214, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r8) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0222, code lost:
        if ("OMX.google.aac.decoder".equals(r8) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0236, code lost:
        if ("OMX.MTK.AUDIO.DECODER.MP3".equals(r8) != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L() {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC24681Cl.A0L():void");
    }

    public final void A0M() {
        if (this.A04 == 2) {
            A0J();
            A0L();
            return;
        }
        this.A0U = true;
        A0K();
    }

    public final void A0N() {
        this.A05 = -1;
        this.A0d.A01 = null;
    }

    public final void A0O() {
        C21030yg c21030yg = this.A09;
        if (c21030yg == null || C08M.A00 < 23) {
            return;
        }
        float A0D = A0D(this.A01, c21030yg, super.A07);
        if (this.A00 == A0D) {
            return;
        }
        this.A00 = A0D;
        if (this.A08 == null || this.A04 != 0) {
            return;
        }
        if (A0D == -1.0f && this.A0H) {
            this.A0G = null;
            if (this.A0Q) {
                this.A04 = 1;
                return;
            }
            A0J();
            A0L();
        } else if (A0D != -1.0f) {
            if (this.A0H || A0D > this.A0a) {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", A0D);
                this.A08.setParameters(bundle);
                this.A0H = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x005b, code lost:
        if (r2.A08 == r4.A08) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0R(X.C21030yg r8) {
        /*
            r7 = this;
            X.0yg r4 = r7.A09
            r7.A09 = r8
            r7.A0B = r8
            X.0zk r1 = r8.A0H
            r6 = 0
            if (r4 != 0) goto L2a
            r0 = r6
        Lc:
            boolean r0 = X.C08M.A08(r1, r0)
            r5 = 1
            r0 = r0 ^ r5
            r3 = 0
            if (r0 == 0) goto L2d
            X.0yg r0 = r7.A09
            X.0zk r0 = r0.A0H
            if (r0 == 0) goto L2d
            java.lang.String r0 = "Media requires a DrmSessionManager"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            int r1 = r7.A00
            X.0yW r0 = new X.0yW
            r0.<init>(r5, r2, r1)
            throw r0
        L2a:
            X.0zk r0 = r4.A0H
            goto Lc
        L2d:
            android.media.MediaCodec r2 = r7.A08
            if (r2 == 0) goto L6a
            X.10A r1 = r7.A0D
            X.0yg r0 = r7.A09
            int r1 = r7.A0E(r2, r1, r4, r0)
            if (r1 == 0) goto L6a
            if (r1 == r5) goto L60
            r0 = 3
            if (r1 != r0) goto L64
            boolean r0 = r7.A0P
            if (r0 != 0) goto L6a
            r7.A0S = r5
            r7.A03 = r5
            int r1 = r7.A02
            r0 = 2
            if (r1 == r0) goto L5d
            if (r1 != r5) goto L5e
            X.0yg r2 = r7.A09
            int r1 = r2.A0F
            int r0 = r4.A0F
            if (r1 != r0) goto L5e
            int r1 = r2.A08
            int r0 = r4.A08
            if (r1 != r0) goto L5e
        L5d:
            r3 = 1
        L5e:
            r7.A0I = r3
        L60:
            r7.A0O()
            return
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L6a:
            r7.A0G = r6
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L73
            r7.A04 = r5
            return
        L73:
            r7.A0J()
            r7.A0L()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC24681Cl.A0R(X.0yg):void");
    }

    @Override // X.C1Z6
    public boolean AFE() {
        return this.A0U;
    }

    @Override // X.C1Z6
    public boolean AFf() {
        if (this.A09 != null) {
            if (!(super.A05 ? super.A06 : super.A04.AFf()) && this.A06 < 0) {
                long j = this.A07;
                if (j == -9223372036854775807L || SystemClock.elapsedRealtime() >= j) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:320:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0124 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // X.C1Z6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ARV(long r29, long r31) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC24681Cl.ARV(long, long):void");
    }

    @Override // X.AbstractC39181pi, X.C1Z6
    public final void ATY(float f) {
        this.A01 = f;
        A0O();
    }
}
