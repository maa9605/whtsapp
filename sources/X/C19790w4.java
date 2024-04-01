package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0w4 */
/* loaded from: classes.dex */
public class C19790w4 extends AbstractC24681Cl implements InterfaceC223312a {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public MediaFormat A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C21430zK A0F;
    public final InterfaceC21490zQ A0G;
    public final long[] A0H;

    @Override // X.AbstractC39181pi, X.C1Z6
    public InterfaceC223312a AB9() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19790w4(Context context, C10C c10c, InterfaceC21720zn interfaceC21720zn, Handler handler, InterfaceC21440zL interfaceC21440zL, C21360zD c21360zD, InterfaceC21420zJ... interfaceC21420zJArr) {
        super(1, c10c, interfaceC21720zn, 44100.0f);
        C1ZD c1zd = new C1ZD(c21360zD, interfaceC21420zJArr);
        this.A0E = context.getApplicationContext();
        this.A0G = c1zd;
        this.A07 = -9223372036854775807L;
        this.A0H = new long[10];
        this.A0F = new C21430zK(handler, interfaceC21440zL);
        c1zd.A0Q = new C1ZF(this);
    }

    @Override // X.AbstractC39181pi
    public void A07() {
        C1ZD c1zd = (C1ZD) this.A0G;
        c1zd.A0Y = true;
        if (c1zd.A0M != null) {
            C21510zS c21510zS = c1zd.A0g.A0I;
            if (c21510zS != null) {
                c21510zS.A00();
                c1zd.A0M.play();
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC39181pi
    public void A08() {
        A0Z();
        C1ZD c1zd = (C1ZD) this.A0G;
        c1zd.A0Y = false;
        if (c1zd.A0M != null) {
            C21530zU c21530zU = c1zd.A0g;
            c21530zU.A0E = 0L;
            c21530zU.A04 = 0;
            c21530zU.A01 = 0;
            c21530zU.A09 = 0L;
            if (c21530zU.A0G == -9223372036854775807L) {
                C21510zS c21510zS = c21530zU.A0I;
                if (c21510zS != null) {
                    c21510zS.A00();
                    c1zd.A0M.pause();
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.AbstractC24681Cl, X.AbstractC39181pi
    public void A09() {
        try {
            this.A07 = -9223372036854775807L;
            this.A05 = 0;
            C1ZD c1zd = (C1ZD) this.A0G;
            c1zd.A01();
            for (InterfaceC21420zJ interfaceC21420zJ : c1zd.A0m) {
                interfaceC21420zJ.reset();
            }
            for (InterfaceC21420zJ interfaceC21420zJ2 : c1zd.A0l) {
                interfaceC21420zJ2.reset();
            }
            c1zd.A01 = 0;
            c1zd.A0Y = false;
            try {
                super.A09();
                synchronized (super.A0C) {
                }
                this.A0F.A00(super.A0C);
            } catch (Throwable th) {
                synchronized (super.A0C) {
                    this.A0F.A00(super.A0C);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                super.A09();
                synchronized (super.A0C) {
                    this.A0F.A00(super.A0C);
                    throw th2;
                }
            } catch (Throwable th3) {
                synchronized (super.A0C) {
                    this.A0F.A00(super.A0C);
                    throw th3;
                }
            }
        }
    }

    @Override // X.AbstractC24681Cl, X.AbstractC39181pi
    public void A0A(long j, boolean z) {
        super.A0A(j, z);
        ((C1ZD) this.A0G).A01();
        this.A06 = j;
        this.A09 = true;
        this.A0A = true;
        this.A07 = -9223372036854775807L;
        this.A05 = 0;
    }

    @Override // X.AbstractC39181pi
    public void A0B(boolean z) {
        final C21630ze c21630ze = new C21630ze();
        super.A0C = c21630ze;
        final C21430zK c21430zK = this.A0F;
        if (c21430zK.A01 != null) {
            c21430zK.A00.post(new Runnable() { // from class: X.0z7
                @Override // java.lang.Runnable
                public final void run() {
                    C21430zK c21430zK2 = c21430zK;
                    c21430zK2.A01.AHS(c21630ze);
                }
            });
        }
        int i = ((AbstractC39181pi) this).A03.A00;
        if (i != 0) {
            C1ZD c1zd = (C1ZD) this.A0G;
            if (c1zd != null) {
                C002701i.A1K(C08M.A00 >= 21);
                if (!c1zd.A0a || c1zd.A01 != i) {
                    c1zd.A0a = true;
                    c1zd.A01 = i;
                    c1zd.A01();
                    return;
                }
                return;
            }
            throw null;
        }
        C1ZD c1zd2 = (C1ZD) this.A0G;
        if (!c1zd2.A0a) {
            return;
        }
        c1zd2.A0a = false;
        c1zd2.A01 = 0;
        c1zd2.A01();
    }

    @Override // X.AbstractC39181pi
    public void A0C(C21030yg[] c21030ygArr, long j) {
        if (this.A07 != -9223372036854775807L) {
            int i = this.A05;
            long[] jArr = this.A0H;
            if (i == jArr.length) {
                StringBuilder A0P = C000200d.A0P("Too many stream changes, so dropping change at ");
                A0P.append(jArr[i - 1]);
                Log.w("MediaCodecAudioRenderer", A0P.toString());
            } else {
                this.A05 = i + 1;
            }
            jArr[this.A05 - 1] = this.A07;
        }
    }

    @Override // X.AbstractC24681Cl
    public float A0D(float f, C21030yg c21030yg, C21030yg[] c21030ygArr) {
        int i = -1;
        for (C21030yg c21030yg2 : c21030ygArr) {
            int i2 = c21030yg2.A0C;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    @Override // X.AbstractC24681Cl
    public int A0E(MediaCodec mediaCodec, C10A c10a, C21030yg c21030yg, C21030yg c21030yg2) {
        return (A0Y(c10a, c21030yg2) <= this.A01 && c10a.A04(c21030yg, c21030yg2, true) && c21030yg.A06 == 0 && c21030yg.A07 == 0 && c21030yg2.A06 == 0 && c21030yg2.A07 == 0) ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0053, code lost:
        if (((X.C1ZD) r12.A0G).A07(r15.A05, r15.A0A) != false) goto L21;
     */
    @Override // X.AbstractC24681Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A0F(X.C10C r13, X.InterfaceC21720zn r14, X.C21030yg r15) {
        /*
            r12 = this;
            java.lang.String r5 = r15.A0P
            java.lang.String r1 = X.C223412b.A02(r5)
            java.lang.String r0 = "audio"
            boolean r0 = r0.equals(r1)
            r4 = 0
            if (r0 != 0) goto L10
            return r4
        L10:
            int r1 = X.C08M.A00
            r0 = 21
            r11 = 0
            if (r1 < r0) goto L19
            r11 = 32
        L19:
            X.0zk r6 = r15.A0H
            boolean r10 = X.AbstractC39181pi.A03(r14, r6)
            r9 = 4
            r8 = 8
            if (r10 == 0) goto L3e
            int r2 = r15.A05
            X.0zQ r1 = r12.A0G
            int r0 = X.C223412b.A00(r5)
            X.1ZD r1 = (X.C1ZD) r1
            boolean r0 = r1.A07(r2, r0)
            if (r0 == 0) goto L3e
            X.10A r0 = r13.ABv()
            if (r0 == 0) goto L3e
            r0 = r11 | 8
            r0 = r0 | r9
            return r0
        L3e:
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r5)
            r7 = 1
            if (r0 == 0) goto L55
            X.0zQ r2 = r12.A0G
            int r1 = r15.A05
            int r0 = r15.A0A
            X.1ZD r2 = (X.C1ZD) r2
            boolean r0 = r2.A07(r1, r0)
            if (r0 == 0) goto La8
        L55:
            X.0zQ r1 = r12.A0G
            int r0 = r15.A05
            X.1ZD r1 = (X.C1ZD) r1
            r3 = 2
            boolean r0 = r1.A07(r0, r3)
            if (r0 == 0) goto La8
            r2 = 0
            if (r6 == 0) goto L74
            r1 = 0
        L66:
            int r0 = r6.A01
            if (r1 >= r0) goto L74
            X.0zj[] r0 = r6.A03
            r0 = r0[r1]
            boolean r0 = r0.A04
            r2 = r2 | r0
            int r1 = r1 + 1
            goto L66
        L74:
            java.util.List r1 = r13.A9j(r5, r2)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8c
            if (r2 == 0) goto L8b
            java.util.List r0 = r13.A9j(r5, r4)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8b
            r7 = 2
        L8b:
            return r7
        L8c:
            if (r10 != 0) goto L8f
            return r3
        L8f:
            java.lang.Object r1 = r1.get(r4)
            X.10A r1 = (X.C10A) r1
            boolean r0 = r1.A02(r15)
            if (r0 == 0) goto La6
            boolean r0 = r1.A03(r15)
            if (r0 == 0) goto La3
            r8 = 16
        La3:
            r8 = r8 | r11
            r8 = r8 | r9
            return r8
        La6:
            r9 = 3
            goto La3
        La8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19790w4.A0F(X.10C, X.0zn, X.0yg):int");
    }

    @Override // X.AbstractC24681Cl
    public List A0H(C10C c10c, C21030yg c21030yg, boolean z) {
        C10A ABv;
        int i = c21030yg.A05;
        String str = c21030yg.A0P;
        if (((C1ZD) this.A0G).A07(i, C223412b.A00(str)) && (ABv = c10c.ABv()) != null) {
            return Collections.singletonList(ABv);
        }
        return c10c.A9j(str, z);
    }

    @Override // X.AbstractC24681Cl
    public void A0K() {
        try {
            C1ZD c1zd = (C1ZD) this.A0G;
            if (c1zd.A0W) {
                return;
            }
            if ((c1zd.A0M != null) && c1zd.A06()) {
                C21530zU c21530zU = c1zd.A0g;
                long A00 = c1zd.A00();
                c21530zU.A0F = c21530zU.A00();
                c21530zU.A0G = SystemClock.elapsedRealtime() * 1000;
                c21530zU.A06 = A00;
                c1zd.A0M.stop();
                c1zd.A03 = 0;
                c1zd.A0W = true;
            }
        } catch (C21480zP e) {
            throw new C20930yW(1, e, ((AbstractC39181pi) this).A00);
        }
    }

    @Override // X.AbstractC24681Cl
    public void A0P(long j) {
        while (true) {
            int i = this.A05;
            if (i == 0) {
                return;
            }
            long[] jArr = this.A0H;
            if (j < jArr[0]) {
                return;
            }
            C1ZD c1zd = (C1ZD) this.A0G;
            if (c1zd.A0D == 1) {
                c1zd.A0D = 2;
            }
            int i2 = i - 1;
            this.A05 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0058, code lost:
        if (r11 == 4) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0133 A[Catch: 0zM -> 0x01ac, TryCatch #1 {0zM -> 0x01ac, blocks: (B:152:0x0039, B:154:0x0041, B:156:0x004d, B:157:0x0053, B:162:0x005b, B:166:0x006a, B:167:0x006d, B:171:0x0076, B:173:0x0088, B:174:0x008a, B:175:0x008e, B:177:0x0096, B:178:0x00a2, B:180:0x00a6, B:181:0x00ab, B:183:0x00ae, B:198:0x00cd, B:220:0x010f, B:224:0x0117, B:226:0x011b, B:228:0x011f, B:231:0x0124, B:233:0x0133, B:234:0x0137, B:236:0x0143, B:241:0x0154, B:258:0x01a3, B:242:0x0178, B:253:0x0190, B:257:0x019f, B:260:0x01a6, B:261:0x01ab, B:201:0x00dc, B:218:0x0103, B:219:0x010e), top: B:267:0x0039, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0143 A[Catch: 0zM -> 0x01ac, TryCatch #1 {0zM -> 0x01ac, blocks: (B:152:0x0039, B:154:0x0041, B:156:0x004d, B:157:0x0053, B:162:0x005b, B:166:0x006a, B:167:0x006d, B:171:0x0076, B:173:0x0088, B:174:0x008a, B:175:0x008e, B:177:0x0096, B:178:0x00a2, B:180:0x00a6, B:181:0x00ab, B:183:0x00ae, B:198:0x00cd, B:220:0x010f, B:224:0x0117, B:226:0x011b, B:228:0x011f, B:231:0x0124, B:233:0x0133, B:234:0x0137, B:236:0x0143, B:241:0x0154, B:258:0x01a3, B:242:0x0178, B:253:0x0190, B:257:0x019f, B:260:0x01a6, B:261:0x01ab, B:201:0x00dc, B:218:0x0103, B:219:0x010e), top: B:267:0x0039, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0178 A[Catch: 0zM -> 0x01ac, TryCatch #1 {0zM -> 0x01ac, blocks: (B:152:0x0039, B:154:0x0041, B:156:0x004d, B:157:0x0053, B:162:0x005b, B:166:0x006a, B:167:0x006d, B:171:0x0076, B:173:0x0088, B:174:0x008a, B:175:0x008e, B:177:0x0096, B:178:0x00a2, B:180:0x00a6, B:181:0x00ab, B:183:0x00ae, B:198:0x00cd, B:220:0x010f, B:224:0x0117, B:226:0x011b, B:228:0x011f, B:231:0x0124, B:233:0x0133, B:234:0x0137, B:236:0x0143, B:241:0x0154, B:258:0x01a3, B:242:0x0178, B:253:0x0190, B:257:0x019f, B:260:0x01a6, B:261:0x01ab, B:201:0x00dc, B:218:0x0103, B:219:0x010e), top: B:267:0x0039, inners: #0 }] */
    @Override // X.AbstractC24681Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0Q(android.media.MediaCodec r21, android.media.MediaFormat r22) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19790w4.A0Q(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // X.AbstractC24681Cl
    public void A0R(final C21030yg c21030yg) {
        super.A0R(c21030yg);
        final C21430zK c21430zK = this.A0F;
        if (c21430zK.A01 != null) {
            c21430zK.A00.post(new Runnable() { // from class: X.0z5
                @Override // java.lang.Runnable
                public final void run() {
                    C21430zK c21430zK2 = c21430zK;
                    c21430zK2.A01.AHT(c21030yg);
                }
            });
        }
        this.A04 = "audio/raw".equals(c21030yg.A0P) ? c21030yg.A0A : 2;
        this.A00 = c21030yg.A05;
        this.A02 = c21030yg.A06;
        this.A03 = c21030yg.A07;
    }

    @Override // X.AbstractC24681Cl
    public void A0S(C1ZK c1zk) {
        if (this.A09 && !c1zk.A00()) {
            long j = c1zk.A00;
            if (Math.abs(j - this.A06) > 500000) {
                this.A06 = j;
            }
            this.A09 = false;
        }
        this.A07 = Math.max(c1zk.A00, this.A07);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x009e, code lost:
        if (r1.startsWith("ms01") == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0078  */
    @Override // X.AbstractC24681Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0T(X.C10A r9, android.media.MediaCodec r10, X.C21030yg r11, android.media.MediaCrypto r12, float r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19790w4.A0T(X.10A, android.media.MediaCodec, X.0yg, android.media.MediaCrypto, float):void");
    }

    @Override // X.AbstractC24681Cl
    public void A0U(final String str, final long j, final long j2) {
        final C21430zK c21430zK = this.A0F;
        if (c21430zK.A01 != null) {
            c21430zK.A00.post(new Runnable() { // from class: X.0z6
                @Override // java.lang.Runnable
                public final void run() {
                    C21430zK c21430zK2 = c21430zK;
                    c21430zK2.A01.AHQ(str, j, j2);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x0060, code lost:
        if (r37 == r1) goto L232;
     */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0408 A[Catch: 0zN -> 0x0463, 0zN | 0zP -> 0x0465, TryCatch #3 {0zN | 0zP -> 0x0465, blocks: (B:260:0x0055, B:262:0x0059, B:267:0x0063, B:272:0x0075, B:274:0x0080, B:276:0x0084, B:277:0x0099, B:296:0x011e, B:297:0x012b, B:299:0x0131, B:301:0x013b, B:303:0x0141, B:305:0x014b, B:306:0x0155, B:308:0x0159, B:309:0x015a, B:311:0x015e, B:312:0x0166, B:321:0x0199, B:325:0x01aa, B:326:0x01b2, B:328:0x01d2, B:336:0x01ec, B:338:0x01f0, B:464:0x0462, B:313:0x0189, B:334:0x01e0, B:335:0x01eb, B:280:0x00bb, B:282:0x00c5, B:284:0x00cd, B:292:0x00e4, B:294:0x00e8, B:295:0x0102, B:339:0x01f8, B:341:0x0202, B:344:0x020c, B:347:0x0213, B:350:0x021e, B:354:0x022c, B:356:0x0230, B:357:0x023b, B:359:0x0241, B:361:0x0247, B:363:0x024b, B:365:0x024f, B:409:0x033f, B:373:0x0263, B:375:0x0273, B:376:0x0285, B:379:0x028d, B:381:0x029a, B:385:0x02ad, B:387:0x02b0, B:390:0x02c2, B:408:0x0334, B:384:0x02aa, B:394:0x02d2, B:395:0x02dd, B:396:0x02de, B:401:0x02ef, B:406:0x032c, B:407:0x032e, B:402:0x02fe, B:404:0x031b, B:403:0x030d, B:405:0x031e, B:412:0x0345, B:414:0x0349, B:416:0x034f, B:417:0x037c, B:419:0x0380, B:420:0x038a, B:422:0x038e, B:423:0x0398, B:424:0x039b, B:425:0x03a4, B:427:0x03aa, B:428:0x03b0, B:430:0x03c0, B:432:0x03cd, B:433:0x03e8, B:441:0x0402, B:443:0x0408, B:445:0x040d, B:438:0x03f9, B:452:0x041f, B:446:0x040e, B:448:0x0412, B:449:0x0415, B:451:0x041d, B:453:0x0430, B:457:0x0445, B:459:0x0450, B:460:0x045b, B:463:0x0461), top: B:473:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x040d A[Catch: 0zN -> 0x0463, 0zN | 0zP -> 0x0465, TryCatch #3 {0zN | 0zP -> 0x0465, blocks: (B:260:0x0055, B:262:0x0059, B:267:0x0063, B:272:0x0075, B:274:0x0080, B:276:0x0084, B:277:0x0099, B:296:0x011e, B:297:0x012b, B:299:0x0131, B:301:0x013b, B:303:0x0141, B:305:0x014b, B:306:0x0155, B:308:0x0159, B:309:0x015a, B:311:0x015e, B:312:0x0166, B:321:0x0199, B:325:0x01aa, B:326:0x01b2, B:328:0x01d2, B:336:0x01ec, B:338:0x01f0, B:464:0x0462, B:313:0x0189, B:334:0x01e0, B:335:0x01eb, B:280:0x00bb, B:282:0x00c5, B:284:0x00cd, B:292:0x00e4, B:294:0x00e8, B:295:0x0102, B:339:0x01f8, B:341:0x0202, B:344:0x020c, B:347:0x0213, B:350:0x021e, B:354:0x022c, B:356:0x0230, B:357:0x023b, B:359:0x0241, B:361:0x0247, B:363:0x024b, B:365:0x024f, B:409:0x033f, B:373:0x0263, B:375:0x0273, B:376:0x0285, B:379:0x028d, B:381:0x029a, B:385:0x02ad, B:387:0x02b0, B:390:0x02c2, B:408:0x0334, B:384:0x02aa, B:394:0x02d2, B:395:0x02dd, B:396:0x02de, B:401:0x02ef, B:406:0x032c, B:407:0x032e, B:402:0x02fe, B:404:0x031b, B:403:0x030d, B:405:0x031e, B:412:0x0345, B:414:0x0349, B:416:0x034f, B:417:0x037c, B:419:0x0380, B:420:0x038a, B:422:0x038e, B:423:0x0398, B:424:0x039b, B:425:0x03a4, B:427:0x03aa, B:428:0x03b0, B:430:0x03c0, B:432:0x03cd, B:433:0x03e8, B:441:0x0402, B:443:0x0408, B:445:0x040d, B:438:0x03f9, B:452:0x041f, B:446:0x040e, B:448:0x0412, B:449:0x0415, B:451:0x041d, B:453:0x0430, B:457:0x0445, B:459:0x0450, B:460:0x045b, B:463:0x0461), top: B:473:0x0055 }] */
    @Override // X.AbstractC24681Cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0W(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42, X.C21030yg r43) {
        /*
            Method dump skipped, instructions count: 1156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19790w4.A0W(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, X.0yg):boolean");
    }

    public final int A0Y(C10A c10a, C21030yg c21030yg) {
        PackageManager packageManager;
        int i = C08M.A00;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(c10a.A02) || (i == 23 && (packageManager = this.A0E.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return c21030yg.A09;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x018a A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:243:0x0186, B:245:0x018a, B:247:0x01ab, B:250:0x01b5), top: B:306:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0Z() {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19790w4.A0Z():void");
    }

    @Override // X.InterfaceC223312a
    public C21120yp ACS() {
        return ((C1ZD) this.A0G).A0O;
    }

    @Override // X.InterfaceC223312a
    public long ACX() {
        if (((AbstractC39181pi) this).A01 == 2) {
            A0Z();
        }
        return this.A06;
    }

    @Override // X.AbstractC39181pi, X.InterfaceC21150ys
    public void AEG(int i, Object obj) {
        if (i == 2) {
            InterfaceC21490zQ interfaceC21490zQ = this.A0G;
            float floatValue = ((Number) obj).floatValue();
            C1ZD c1zd = (C1ZD) interfaceC21490zQ;
            if (c1zd.A00 == floatValue) {
                return;
            }
            c1zd.A00 = floatValue;
            c1zd.A02();
        } else if (i != 3) {
            if (i == 5) {
                C21540zV c21540zV = (C21540zV) obj;
                C1ZD c1zd2 = (C1ZD) this.A0G;
                if (!c1zd2.A0R.equals(c21540zV)) {
                    c1zd2.A0R = c21540zV;
                }
            }
        } else {
            C21350zC c21350zC = (C21350zC) obj;
            C1ZD c1zd3 = (C1ZD) this.A0G;
            if (c1zd3.A0P.equals(c21350zC)) {
                return;
            }
            c1zd3.A0P = c21350zC;
            if (c1zd3.A0a) {
                return;
            }
            c1zd3.A01();
            c1zd3.A01 = 0;
        }
    }

    @Override // X.AbstractC24681Cl, X.C1Z6
    public boolean AFE() {
        if (this.A0U) {
            C1ZD c1zd = (C1ZD) this.A0G;
            boolean z = c1zd.A0M != null;
            if (!z) {
                return true;
            }
            if (c1zd.A0W && (!z || !c1zd.A0g.A01(c1zd.A00()))) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC24681Cl, X.C1Z6
    public boolean AFf() {
        C1ZD c1zd = (C1ZD) this.A0G;
        return ((c1zd.A0M != null) && c1zd.A0g.A01(c1zd.A00())) || super.AFf();
    }

    @Override // X.InterfaceC223312a
    public C21120yp ATd(C21120yp c21120yp) {
        C1ZD c1zd = (C1ZD) this.A0G;
        if ((c1zd.A0M != null) && !c1zd.A0V) {
            C21120yp c21120yp2 = C21120yp.A04;
            c1zd.A0O = c21120yp2;
            return c21120yp2;
        }
        C21120yp c21120yp3 = c1zd.A0N;
        if (c21120yp3 == null) {
            ArrayDeque arrayDeque = c1zd.A0k;
            if (!arrayDeque.isEmpty()) {
                c21120yp3 = ((C21570zY) arrayDeque.getLast()).A02;
            } else {
                c21120yp3 = c1zd.A0O;
            }
        }
        if (!c21120yp.equals(c21120yp3)) {
            if (c1zd.A0M != null) {
                c1zd.A0N = c21120yp;
            } else {
                c1zd.A0O = c1zd.A0i.A5X(c21120yp);
            }
        }
        return c1zd.A0O;
    }
}
