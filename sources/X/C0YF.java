package X;

import java.util.ArrayList;

/* renamed from: X.0YF */
/* loaded from: classes.dex */
public class C0YF {
    public float A01;
    public float A02;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0I;
    public int A0J;
    public int A0L;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public C0YJ A0R;
    public C0YJ A0S;
    public C0YJ A0T;
    public C0YJ A0U;
    public C0YJ A0V;
    public C0YJ A0W;
    public C0YJ A0X;
    public C0YJ A0Y;
    public C0YF A0Z;
    public C38431o8 A0a;
    public C38431o8 A0b;
    public Object A0e;
    public String A0f;
    public ArrayList A0g;
    public float[] A0j;
    public C0YJ[] A0n;
    public C0YH[] A0o;
    public C0YF[] A0p;
    public C0YF[] A0q;
    public boolean[] A0s;
    public boolean A0i = false;
    public C38471oC A0c = new C38471oC(this);
    public C38481oD A0d = new C38481oD(this);
    public boolean[] A0r = {true, true};
    public int[] A0m = {0, 0, 0, 0};
    public int A0B = -1;
    public int A0M = -1;
    public int A0D = 0;
    public int A0C = 0;
    public int[] A0l = new int[2];
    public int A0H = 0;
    public int A0F = 0;
    public float A04 = 1.0f;
    public int A0G = 0;
    public int A0E = 0;
    public float A03 = 1.0f;
    public int A0K = -1;
    public float A05 = 1.0f;
    public int[] A0k = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float A00 = 0.0f;
    public boolean A0h = false;

    public C0YF() {
        C0YJ c0yj = new C0YJ(this, EnumC12170iy.LEFT);
        this.A0W = c0yj;
        C0YJ c0yj2 = new C0YJ(this, EnumC12170iy.TOP);
        this.A0Y = c0yj2;
        C0YJ c0yj3 = new C0YJ(this, EnumC12170iy.RIGHT);
        this.A0X = c0yj3;
        C0YJ c0yj4 = new C0YJ(this, EnumC12170iy.BOTTOM);
        this.A0S = c0yj4;
        C0YJ c0yj5 = new C0YJ(this, EnumC12170iy.BASELINE);
        this.A0R = c0yj5;
        this.A0U = new C0YJ(this, EnumC12170iy.CENTER_X);
        this.A0V = new C0YJ(this, EnumC12170iy.CENTER_Y);
        C0YJ c0yj6 = new C0YJ(this, EnumC12170iy.CENTER);
        this.A0T = c0yj6;
        this.A0n = new C0YJ[]{c0yj, c0yj3, c0yj2, c0yj4, c0yj5, c0yj6};
        ArrayList arrayList = new ArrayList();
        this.A0g = arrayList;
        this.A0s = new boolean[2];
        C0YH c0yh = C0YH.FIXED;
        this.A0o = new C0YH[]{c0yh, c0yh};
        this.A0Z = null;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        this.A0N = 0;
        this.A0f = null;
        this.A0A = 0;
        this.A0L = 0;
        this.A0j = new float[]{-1.0f, -1.0f};
        this.A0p = new C0YF[]{null, null};
        this.A0q = new C0YF[]{null, null};
        arrayList.add(this.A0W);
        ArrayList arrayList2 = this.A0g;
        arrayList2.add(this.A0Y);
        arrayList2.add(this.A0X);
        arrayList2.add(this.A0S);
        arrayList2.add(this.A0U);
        arrayList2.add(this.A0V);
        arrayList2.add(this.A0T);
        arrayList2.add(this.A0R);
    }

    public int A00() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A09;
    }

    public int A01() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A0O;
    }

    public int A02() {
        C0YF c0yf = this.A0Z;
        if (c0yf != null && (c0yf instanceof C0YD)) {
            return ((C0YD) c0yf).A02 + this.A0P;
        }
        return this.A0P;
    }

    public int A03() {
        C0YF c0yf = this.A0Z;
        if (c0yf != null && (c0yf instanceof C0YD)) {
            return ((C0YD) c0yf).A03 + this.A0Q;
        }
        return this.A0Q;
    }

    public C0YJ A04(EnumC12170iy enumC12170iy) {
        switch (enumC12170iy.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.A0W;
            case 2:
                return this.A0Y;
            case 3:
                return this.A0X;
            case 4:
                return this.A0S;
            case 5:
                return this.A0R;
            case 6:
                return this.A0T;
            case 7:
                return this.A0U;
            case 8:
                return this.A0V;
            default:
                throw new AssertionError(enumC12170iy.name());
        }
    }

    public C0YF A05(int i) {
        C0YJ c0yj;
        C0YJ c0yj2;
        if (i != 0) {
            if (i == 1 && (c0yj2 = (c0yj = this.A0S).A03) != null && c0yj2.A03 == c0yj) {
                return c0yj2.A06;
            }
            return null;
        }
        C0YJ c0yj3 = this.A0X;
        C0YJ c0yj4 = c0yj3.A03;
        if (c0yj4 == null || c0yj4.A03 != c0yj3) {
            return null;
        }
        return c0yj4.A06;
    }

    public C0YF A06(int i) {
        C0YJ c0yj;
        C0YJ c0yj2;
        if (i != 0) {
            if (i == 1 && (c0yj2 = (c0yj = this.A0Y).A03) != null && c0yj2.A03 == c0yj) {
                return c0yj2.A06;
            }
            return null;
        }
        C0YJ c0yj3 = this.A0W;
        C0YJ c0yj4 = c0yj3.A03;
        if (c0yj4 == null || c0yj4.A03 != c0yj3) {
            return null;
        }
        return c0yj4.A06;
    }

    public void A07() {
        this.A0W.A01();
        this.A0Y.A01();
        this.A0X.A01();
        this.A0S.A01();
        this.A0R.A01();
        this.A0U.A01();
        this.A0V.A01();
        this.A0T.A01();
        this.A0Z = null;
        this.A00 = 0.0f;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A0J = 0;
        this.A0I = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        C0YH[] c0yhArr = this.A0o;
        C0YH c0yh = C0YH.FIXED;
        c0yhArr[0] = c0yh;
        c0yhArr[1] = c0yh;
        this.A0e = null;
        this.A0N = 0;
        this.A0A = 0;
        this.A0L = 0;
        float[] fArr = this.A0j;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.A0B = -1;
        this.A0M = -1;
        int[] iArr = this.A0k;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.A0D = 0;
        this.A0C = 0;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0H = 0;
        this.A0G = 0;
        this.A0K = -1;
        this.A05 = 1.0f;
        boolean[] zArr = this.A0r;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.A0s;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void A08(int i) {
        this.A09 = i;
        int i2 = this.A0I;
        if (i < i2) {
            this.A09 = i2;
        }
    }

    public void A09(int i) {
        this.A0O = i;
        int i2 = this.A0J;
        if (i < i2) {
            this.A0O = i2;
        }
    }

    public void A0A(C12120it c12120it) {
        this.A0W.A02();
        this.A0Y.A02();
        this.A0X.A02();
        this.A0S.A02();
        this.A0R.A02();
        this.A0T.A02();
        this.A0U.A02();
        this.A0V.A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:319:0x0088, code lost:
        if (r2 != r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x00d4, code lost:
        if (r7[1] != r4) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x01d6, code lost:
        if ((r77.A0S.A03 != null) == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x01f5, code lost:
        if ((r77 instanceof X.C0YD) == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x04c2, code lost:
        if ((r77.A0X.A03 != null) == false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x04ef, code lost:
        if ((r77.A0X.A03 != null) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0512, code lost:
        if (r8 == (-1)) goto L257;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x04e7  */
    /* JADX WARN: Type inference failed for: r2v112 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    /* JADX WARN: Type inference failed for: r78v0, types: [X.0YG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0B(X.C0YG r78) {
        /*
            Method dump skipped, instructions count: 1406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YF.A0B(X.0YG):void");
    }

    public void A0C(C0YG c0yg) {
        c0yg.A05(this.A0W);
        c0yg.A05(this.A0Y);
        c0yg.A05(this.A0X);
        c0yg.A05(this.A0S);
        if (this.A07 > 0) {
            c0yg.A05(this.A0R);
        }
    }

    public void A0D(C0YG c0yg) {
        int i;
        int i2;
        int A00 = C0YG.A00(this.A0W);
        int A002 = C0YG.A00(this.A0Y);
        int A003 = C0YG.A00(this.A0X);
        int A004 = C0YG.A00(this.A0S);
        C38471oC c38471oC = this.A0c;
        C28601Ss c28601Ss = c38471oC.A05;
        if (c28601Ss.A0B) {
            C28601Ss c28601Ss2 = c38471oC.A04;
            if (c28601Ss2.A0B) {
                A00 = c28601Ss.A02;
                A003 = c28601Ss2.A02;
            }
        }
        C38481oD c38481oD = this.A0d;
        C28601Ss c28601Ss3 = c38481oD.A05;
        if (c28601Ss3.A0B) {
            C28601Ss c28601Ss4 = c38481oD.A04;
            if (c28601Ss4.A0B) {
                A002 = c28601Ss3.A02;
                A004 = c28601Ss4.A02;
            }
        }
        int i3 = A004 - A002;
        if (A003 - A00 < 0 || i3 < 0 || A00 == Integer.MIN_VALUE || A00 == Integer.MAX_VALUE || A002 == Integer.MIN_VALUE || A002 == Integer.MAX_VALUE || A003 == Integer.MIN_VALUE || A003 == Integer.MAX_VALUE || A004 == Integer.MIN_VALUE || A004 == Integer.MAX_VALUE) {
            A004 = 0;
            A00 = 0;
            A002 = 0;
            A003 = 0;
        }
        C0YH c0yh = C0YH.FIXED;
        int i4 = A003 - A00;
        int i5 = A004 - A002;
        this.A0P = A00;
        this.A0Q = A002;
        if (this.A0N == 8) {
            this.A0O = 0;
            this.A09 = 0;
            return;
        }
        C0YH[] c0yhArr = this.A0o;
        if (c0yhArr[0] == c0yh && i4 < (i2 = this.A0O)) {
            i4 = i2;
        }
        if (c0yhArr[1] == c0yh && i5 < (i = this.A09)) {
            i5 = i;
        }
        this.A0O = i4;
        this.A09 = i5;
        int i6 = this.A0I;
        if (i5 < i6) {
            this.A09 = i6;
        }
        int i7 = this.A0J;
        if (i4 >= i7) {
            return;
        }
        this.A0O = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x006a, code lost:
        if (r2 == 4) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x012b, code lost:
        if (r2 != 1) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x01c1, code lost:
        if (r16 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01f2, code lost:
        if (r17 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x01f5, code lost:
        if (r18 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01f7, code lost:
        if (r17 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x01f9, code lost:
        r7 = r45.A03.A06;
        r5 = r46.A03.A06;
        r8 = r35.A0Z;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0208, code lost:
        if (r20 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x020a, code lost:
        if (r2 != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x020c, code lost:
        if (r6 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x020e, code lost:
        r11 = false;
        r19 = true;
        r6 = 8;
        r17 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0215, code lost:
        if (r14 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0217, code lost:
        r11 = true;
        r19 = false;
        r6 = 5;
        r17 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x021f, code lost:
        if ((r7 instanceof X.C38411o6) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0221, code lost:
        r31 = 6;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0227, code lost:
        if ((r5 instanceof X.C38411o6) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0229, code lost:
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x022b, code lost:
        r31 = 6;
        r17 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x022f, code lost:
        if (r16 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0233, code lost:
        if (r12 != r21) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0235, code lost:
        if (r7 == r8) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0237, code lost:
        r18 = false;
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x023b, code lost:
        if (r11 == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0241, code lost:
        if (r35.A0N != 8) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0243, code lost:
        r31 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0245, code lost:
        r9 = r12;
        r36.A0E(r1, r12, r45.A00(), r51, r21, r0, r46.A00(), r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0265, code lost:
        if (r35.A0N != 8) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0267, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0268, code lost:
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x026a, code lost:
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x026e, code lost:
        if (r2 != 1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0270, code lost:
        r6 = 8;
        r11 = true;
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0275, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0279, code lost:
        if (r2 != 3) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x027e, code lost:
        if (r35.A0K != (-1)) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0280, code lost:
        if (r54 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0282, code lost:
        r31 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0284, code lost:
        if (r38 == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0286, code lost:
        r31 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0288, code lost:
        r6 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x028a, code lost:
        r11 = true;
        r19 = true;
        r17 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x028f, code lost:
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0292, code lost:
        r31 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0295, code lost:
        if (r52 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x029a, code lost:
        if (r57 == 2) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x029c, code lost:
        r6 = 8;
        r17 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x02a1, code lost:
        if (r57 != 1) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x02a3, code lost:
        r6 = 5;
        r17 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02a6, code lost:
        r31 = 6;
        r11 = true;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x02ac, code lost:
        if (r6 <= 0) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x02ae, code lost:
        r31 = 6;
        r6 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x02b2, code lost:
        if (r6 != 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x02b4, code lost:
        if (r14 != 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x02b6, code lost:
        if (r54 != false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x02b8, code lost:
        r31 = 6;
        r11 = true;
        r19 = true;
        r6 = 5;
        r17 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x02c1, code lost:
        if (r7 == r8) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x02c3, code lost:
        r6 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x02c4, code lost:
        if (r5 != r8) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x02c6, code lost:
        r6 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x02c7, code lost:
        r11 = true;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x02cb, code lost:
        r16 = true;
        r11 = true;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x02d1, code lost:
        r16 = false;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x02d5, code lost:
        r16 = true;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x02d8, code lost:
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x02da, code lost:
        r6 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x02dd, code lost:
        if (r16 == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x02df, code lost:
        if (r38 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02e3, code lost:
        if (r12 == r21) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02e5, code lost:
        if (r20 != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x02e9, code lost:
        if ((r7 instanceof X.C38411o6) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x02ed, code lost:
        if ((r5 instanceof X.C38411o6) == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x02ef, code lost:
        r6 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x02f0, code lost:
        r36.A0G(r1, r12, r45.A00(), r6);
        r36.A0H(r0, r21, -r46.A00(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0305, code lost:
        if (r38 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0307, code lost:
        if (r55 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x030b, code lost:
        if ((r7 instanceof X.C38411o6) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x030d, code lost:
        r11 = 6;
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0311, code lost:
        if ((r5 instanceof X.C38411o6) == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0313, code lost:
        r11 = r6;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0316, code lost:
        if (r18 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0318, code lost:
        if (r19 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x031a, code lost:
        if (r54 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x031c, code lost:
        if (r39 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x031e, code lost:
        if (r7 == r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0320, code lost:
        if (r5 == r8) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0322, code lost:
        r10 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0325, code lost:
        if ((r7 instanceof X.C28581Sq) != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0329, code lost:
        if ((r5 instanceof X.C28581Sq) == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x032b, code lost:
        r10 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x032e, code lost:
        if ((r7 instanceof X.C38411o6) != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0332, code lost:
        if ((r5 instanceof X.C38411o6) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0334, code lost:
        r10 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0335, code lost:
        if (r54 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0337, code lost:
        r10 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0338, code lost:
        r4 = java.lang.Math.max(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x033c, code lost:
        if (r38 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x033e, code lost:
        r4 = java.lang.Math.min(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0342, code lost:
        if (r52 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0344, code lost:
        if (r54 != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0346, code lost:
        if (r7 == r8) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0348, code lost:
        if (r5 != r8) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x034a, code lost:
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x034b, code lost:
        r36.A0F(r1, r9, r45.A00(), r4);
        r36.A0F(r0, r21, -r46.A00(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x035c, code lost:
        if (r38 == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x035e, code lost:
        if (r41 != r9) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0360, code lost:
        r5 = r45.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0364, code lost:
        if (r9 == r41) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0366, code lost:
        r36.A0G(r1, r41, r5, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x036a, code lost:
        if (r20 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x036c, code lost:
        if (r49 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x036e, code lost:
        if (r14 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0371, code lost:
        if (r2 != 3) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0373, code lost:
        r36.A0G(r0, r1, 0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x037b, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x037d, code lost:
        r36.A0G(r0, r1, 0, 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:312:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:538:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(X.C0YG r36, boolean r37, boolean r38, boolean r39, boolean r40, X.C0YK r41, X.C0YK r42, X.C0YH r43, boolean r44, X.C0YJ r45, X.C0YJ r46, int r47, int r48, int r49, int r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, int r56, int r57, int r58, int r59, float r60, boolean r61) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YF.A0E(X.0YG, boolean, boolean, boolean, boolean, X.0YK, X.0YK, X.0YH, boolean, X.0YJ, X.0YJ, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void A0F(boolean z, boolean z2) {
        int i;
        int i2;
        C0YH c0yh = C0YH.FIXED;
        C38471oC c38471oC = this.A0c;
        boolean z3 = z & c38471oC.A09;
        C38481oD c38481oD = this.A0d;
        boolean z4 = z2 & c38481oD.A09;
        int i3 = c38471oC.A05.A02;
        int i4 = c38481oD.A05.A02;
        int i5 = c38471oC.A04.A02;
        int i6 = c38481oD.A04.A02;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.A0P = i3;
        }
        if (z4) {
            this.A0Q = i4;
        }
        if (this.A0N == 8) {
            this.A0O = 0;
            this.A09 = 0;
            return;
        }
        if (z3) {
            if (this.A0o[0] == c0yh && i8 < (i2 = this.A0O)) {
                i8 = i2;
            }
            this.A0O = i8;
            int i10 = this.A0J;
            if (i8 < i10) {
                this.A0O = i10;
            }
        }
        if (z4) {
            if (this.A0o[1] == c0yh && i9 < (i = this.A09)) {
                i9 = i;
            }
            this.A09 = i9;
            int i11 = this.A0I;
            if (i9 < i11) {
                this.A09 = i11;
            }
        }
    }

    public boolean A0G() {
        return this.A0N != 8;
    }

    public boolean A0H() {
        C0YJ c0yj = this.A0W;
        C0YJ c0yj2 = c0yj.A03;
        if (c0yj2 == null || c0yj2.A03 != c0yj) {
            C0YJ c0yj3 = this.A0X;
            C0YJ c0yj4 = c0yj3.A03;
            return c0yj4 != null && c0yj4.A03 == c0yj3;
        }
        return true;
    }

    public boolean A0I() {
        C0YJ c0yj = this.A0Y;
        C0YJ c0yj2 = c0yj.A03;
        if (c0yj2 == null || c0yj2.A03 != c0yj) {
            C0YJ c0yj3 = this.A0S;
            C0YJ c0yj4 = c0yj3.A03;
            return c0yj4 != null && c0yj4.A03 == c0yj3;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        String str = this.A0f;
        sb.append(str != null ? C000200d.A0L(C000200d.A0P("id: "), str, " ") : "");
        sb.append("(");
        sb.append(this.A0P);
        sb.append(", ");
        sb.append(this.A0Q);
        sb.append(") - (");
        sb.append(this.A0O);
        sb.append(" x ");
        return C000200d.A0K(sb, this.A09, ")");
    }
}
