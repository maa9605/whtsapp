package X;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: X.0YG */
/* loaded from: classes.dex */
public class C0YG {
    public static int A0E = 1000;
    public static boolean A0F = true;
    public static long A0G;
    public static long A0H;
    public C0YM A07;
    public C0YM A08;
    public C0YL[] A0A;
    public final C12120it A0D;
    public int A06 = 0;
    public int A00 = 32;
    public int A01 = 32;
    public boolean A09 = false;
    public boolean[] A0C = new boolean[32];
    public int A03 = 1;
    public int A04 = 0;
    public int A02 = 32;
    public C0YK[] A0B = new C0YK[A0E];
    public int A05 = 0;

    public C0YG() {
        this.A0A = null;
        this.A0A = new C0YL[32];
        A08();
        C12120it c12120it = new C12120it();
        this.A0D = c12120it;
        this.A07 = new C0YL(c12120it) { // from class: X.1o5
            public int A00 = 128;
            public C0YK[] A03 = new C0YK[128];
            public C0YK[] A04 = new C0YK[128];
            public int A01 = 0;
            public C12150iw A02 = new C12150iw(this);

            @Override // X.C0YL
            public void A01(C0YL c0yl, boolean z) {
                C0YK c0yk = c0yl.A02;
                if (c0yk == null) {
                    return;
                }
                C0YN c0yn = c0yl.A01;
                int A9W = c0yn.A9W();
                for (int i = 0; i < A9W; i++) {
                    C0YK ADm = c0yn.ADm(i);
                    float ADn = c0yn.ADn(i);
                    C12150iw c12150iw = this.A02;
                    c12150iw.A00 = ADm;
                    boolean z2 = true;
                    if (ADm.A07) {
                        int i2 = 0;
                        do {
                            float[] fArr = ADm.A09;
                            float f = (c0yk.A09[i2] * ADn) + fArr[i2];
                            fArr[i2] = f;
                            if (Math.abs(f) < 1.0E-4f) {
                                fArr[i2] = 0.0f;
                            } else {
                                z2 = false;
                            }
                            i2++;
                        } while (i2 < 9);
                        if (z2) {
                            c12150iw.A01.A07(ADm);
                        }
                    } else {
                        int i3 = 0;
                        do {
                            float f2 = c0yk.A09[i3];
                            if (f2 != 0.0f) {
                                float f3 = f2 * ADn;
                                if (Math.abs(f3) < 1.0E-4f) {
                                    f3 = 0.0f;
                                }
                                ADm.A09[i3] = f3;
                            } else {
                                ADm.A09[i3] = 0.0f;
                            }
                            i3++;
                        } while (i3 < 9);
                        A06(ADm);
                    }
                    super.A00 = (c0yl.A00 * ADn) + super.A00;
                }
                A07(c0yk);
            }

            public final void A06(C0YK c0yk) {
                int i = this.A01 + 1;
                C0YK[] c0ykArr = this.A03;
                int length = c0ykArr.length;
                if (i > length) {
                    C0YK[] c0ykArr2 = (C0YK[]) Arrays.copyOf(c0ykArr, length << 1);
                    this.A03 = c0ykArr2;
                    this.A04 = (C0YK[]) Arrays.copyOf(c0ykArr2, c0ykArr2.length << 1);
                }
                C0YK[] c0ykArr3 = this.A03;
                int i2 = this.A01;
                c0ykArr3[i2] = c0yk;
                int i3 = i2 + 1;
                this.A01 = i3;
                if (i3 > 1 && c0ykArr3[i3 - 1].A02 > c0yk.A02) {
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.A04[i4] = c0ykArr3[i4];
                    }
                    Arrays.sort(this.A04, 0, i3, new Comparator() { // from class: X.0iv
                        @Override // java.util.Comparator
                        public int compare(Object obj, Object obj2) {
                            return ((C0YK) obj).A02 - ((C0YK) obj2).A02;
                        }
                    });
                    for (int i5 = 0; i5 < this.A01; i5++) {
                        this.A03[i5] = this.A04[i5];
                    }
                }
                c0yk.A07 = true;
                c0yk.A01(this);
            }

            public final void A07(C0YK c0yk) {
                int i = 0;
                while (true) {
                    int i2 = this.A01;
                    if (i >= i2) {
                        return;
                    }
                    C0YK[] c0ykArr = this.A03;
                    if (c0ykArr[i] != c0yk) {
                        i++;
                    } else {
                        while (true) {
                            int i3 = i2 - 1;
                            if (i < i3) {
                                int i4 = i + 1;
                                c0ykArr[i] = c0ykArr[i4];
                                i = i4;
                            } else {
                                this.A01 = i3;
                                c0yk.A07 = false;
                                return;
                            }
                        }
                    }
                }
            }

            @Override // X.C0YL, X.C0YM
            public void A5A(C0YK c0yk) {
                this.A02.A00 = c0yk;
                Arrays.fill(c0yk.A09, 0.0f);
                c0yk.A09[c0yk.A04] = 1.0f;
                A06(c0yk);
            }

            @Override // X.C0YL, X.C0YM
            public C0YK ACP(C0YG c0yg, boolean[] zArr) {
                int i = -1;
                for (int i2 = 0; i2 < this.A01; i2++) {
                    C0YK[] c0ykArr = this.A03;
                    C0YK c0yk = c0ykArr[i2];
                    if (!zArr[c0yk.A02]) {
                        this.A02.A00 = c0yk;
                        int i3 = 8;
                        if (i != -1) {
                            C0YK c0yk2 = c0ykArr[i];
                            while (true) {
                                float f = c0yk2.A09[i3];
                                float f2 = c0yk.A09[i3];
                                if (f2 == f) {
                                    i3--;
                                    if (i3 < 0) {
                                        break;
                                    }
                                } else if (f2 >= f) {
                                }
                            }
                        } else {
                            do {
                                float f3 = c0yk.A09[i3];
                                if (f3 > 0.0f) {
                                    break;
                                }
                                if (f3 < 0.0f) {
                                    i = i2;
                                    break;
                                }
                                i3--;
                            } while (i3 >= 0);
                        }
                    }
                }
                if (i == -1) {
                    return null;
                }
                return this.A03[i];
            }

            @Override // X.C0YL, X.C0YM
            public void clear() {
                this.A01 = 0;
                super.A00 = 0.0f;
            }

            @Override // X.C0YL
            public String toString() {
                StringBuilder A0V = C000200d.A0V("", " goal -> (");
                A0V.append(super.A00);
                A0V.append(") : ");
                String obj = A0V.toString();
                for (int i = 0; i < this.A01; i++) {
                    C0YK c0yk = this.A03[i];
                    C12150iw c12150iw = this.A02;
                    c12150iw.A00 = c0yk;
                    StringBuilder A0P = C000200d.A0P(obj);
                    A0P.append(c12150iw);
                    A0P.append(" ");
                    obj = A0P.toString();
                }
                return obj;
            }
        };
        if (A0F) {
            this.A08 = new C38391o4(c12120it);
        } else {
            this.A08 = new C0YL(c12120it);
        }
    }

    public static int A00(Object obj) {
        C0YK c0yk = ((C0YJ) obj).A02;
        if (c0yk != null) {
            return (int) (c0yk.A00 + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v10 */
    public C0YL A01() {
        C0YL c0yl;
        C0YL c0yl2;
        C0YL c0yl3;
        if (A0F) {
            C12120it c12120it = this.A0D;
            C12130iu c12130iu = c12120it.A01;
            int i = c12130iu.A00;
            if (i > 0) {
                int i2 = i - 1;
                ?? r0 = c12130iu.A01;
                ?? r2 = r0[i2];
                r0[i2] = 0;
                c12130iu.A00 = i2;
                c0yl3 = r2;
            } else {
                c0yl3 = null;
            }
            c0yl2 = c0yl3;
            if (c0yl2 == null) {
                c0yl2 = new C38391o4(c12120it);
                A0H++;
            } else {
                c0yl2.A02 = null;
                c0yl2.A01.clear();
                c0yl2.A00 = 0.0f;
                c0yl2.A04 = false;
            }
        } else {
            C12120it c12120it2 = this.A0D;
            C12130iu c12130iu2 = c12120it2.A00;
            int i3 = c12130iu2.A00;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object[] objArr = c12130iu2.A01;
                Object obj = objArr[i4];
                objArr[i4] = null;
                c12130iu2.A00 = i4;
                c0yl = obj;
            } else {
                c0yl = null;
            }
            c0yl2 = c0yl;
            if (c0yl2 == null) {
                c0yl2 = new C0YL(c12120it2);
                A0G++;
            } else {
                c0yl2.A02 = null;
                c0yl2.A01.clear();
                c0yl2.A00 = 0.0f;
                c0yl2.A04 = false;
            }
        }
        C0YK.A0C++;
        return c0yl2;
    }

    public C0YK A02() {
        if (this.A03 + 1 >= this.A01) {
            A07();
        }
        C0YK A04 = A04(EnumC12160ix.SLACK);
        int i = this.A06 + 1;
        this.A06 = i;
        this.A03++;
        A04.A02 = i;
        this.A0D.A03[i] = A04;
        return A04;
    }

    public C0YK A03(int i) {
        if (this.A03 + 1 >= this.A01) {
            A07();
        }
        C0YK A04 = A04(EnumC12160ix.ERROR);
        int i2 = this.A06 + 1;
        this.A06 = i2;
        this.A03++;
        A04.A02 = i2;
        A04.A04 = i;
        this.A0D.A03[i2] = A04;
        this.A07.A5A(A04);
        return A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final C0YK A04(EnumC12160ix enumC12160ix) {
        C0YK c0yk;
        C12130iu c12130iu = this.A0D.A02;
        int i = c12130iu.A00;
        if (i > 0) {
            int i2 = i - 1;
            ?? r0 = c12130iu.A01;
            ?? r3 = r0[i2];
            r0[i2] = 0;
            c12130iu.A00 = i2;
            c0yk = r3;
        } else {
            c0yk = null;
        }
        C0YK c0yk2 = c0yk;
        if (c0yk2 == null) {
            c0yk2 = new C0YK(enumC12160ix);
            c0yk2.A06 = enumC12160ix;
        } else {
            c0yk2.A00();
            c0yk2.A06 = enumC12160ix;
        }
        int i3 = this.A05;
        int i4 = A0E;
        if (i3 >= i4) {
            int i5 = i4 << 1;
            A0E = i5;
            this.A0B = (C0YK[]) Arrays.copyOf(this.A0B, i5);
        }
        C0YK[] c0ykArr = this.A0B;
        int i6 = this.A05;
        this.A05 = i6 + 1;
        c0ykArr[i6] = c0yk2;
        return c0yk2;
    }

    public C0YK A05(Object obj) {
        C0YK c0yk = null;
        if (obj == null) {
            return null;
        }
        if (this.A03 + 1 >= this.A01) {
            A07();
        }
        if (obj instanceof C0YJ) {
            C0YJ c0yj = (C0YJ) obj;
            c0yk = c0yj.A02;
            if (c0yk == null) {
                c0yj.A02();
                c0yk = c0yj.A02;
            }
            int i = c0yk.A02;
            if (i == -1 || i > this.A06 || this.A0D.A03[i] == null) {
                if (i != -1) {
                    c0yk.A00();
                }
                int i2 = this.A06 + 1;
                this.A06 = i2;
                this.A03++;
                c0yk.A02 = i2;
                c0yk.A06 = EnumC12160ix.UNRESTRICTED;
                this.A0D.A03[i2] = c0yk;
            }
        }
        return c0yk;
    }

    public void A06() {
        C12120it c12120it;
        C0YK[] c0ykArr;
        int i = 0;
        while (true) {
            c12120it = this.A0D;
            c0ykArr = c12120it.A03;
            if (i >= c0ykArr.length) {
                break;
            }
            C0YK c0yk = c0ykArr[i];
            if (c0yk != null) {
                c0yk.A00();
            }
            i++;
        }
        C12130iu c12130iu = c12120it.A02;
        C0YK[] c0ykArr2 = this.A0B;
        int i2 = this.A05;
        if (c12130iu != null) {
            int length = c0ykArr2.length;
            if (i2 > length) {
                i2 = length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                C0YK c0yk2 = c0ykArr2[i3];
                int i4 = c12130iu.A00;
                Object[] objArr = c12130iu.A01;
                if (i4 < objArr.length) {
                    objArr[i4] = c0yk2;
                    c12130iu.A00 = i4 + 1;
                }
            }
            this.A05 = 0;
            Arrays.fill(c0ykArr, (Object) null);
            this.A06 = 0;
            this.A07.clear();
            this.A03 = 1;
            for (int i5 = 0; i5 < this.A04; i5++) {
            }
            A08();
            this.A04 = 0;
            if (A0F) {
                this.A08 = new C38391o4(c12120it);
                return;
            } else {
                this.A08 = new C0YL(c12120it);
                return;
            }
        }
        throw null;
    }

    public final void A07() {
        int i = this.A00 << 1;
        this.A00 = i;
        this.A0A = (C0YL[]) Arrays.copyOf(this.A0A, i);
        C12120it c12120it = this.A0D;
        c12120it.A03 = (C0YK[]) Arrays.copyOf(c12120it.A03, this.A00);
        int i2 = this.A00;
        this.A0C = new boolean[i2];
        this.A01 = i2;
        this.A02 = i2;
    }

    public final void A08() {
        int i = 0;
        if (A0F) {
            while (true) {
                C0YL[] c0ylArr = this.A0A;
                if (i >= c0ylArr.length) {
                    return;
                }
                C0YL c0yl = c0ylArr[i];
                if (c0yl != null) {
                    this.A0D.A01.A00(c0yl);
                }
                c0ylArr[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0YL[] c0ylArr2 = this.A0A;
                if (i >= c0ylArr2.length) {
                    return;
                }
                C0YL c0yl2 = c0ylArr2[i];
                if (c0yl2 != null) {
                    this.A0D.A00.A00(c0yl2);
                }
                c0ylArr2[i] = null;
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x019b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(X.C0YL r18) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YG.A09(X.0YL):void");
    }

    public final void A0A(C0YL c0yl) {
        C0YL[] c0ylArr;
        int i;
        if (A0F) {
            c0ylArr = this.A0A;
            i = this.A04;
            C0YL c0yl2 = c0ylArr[i];
            if (c0yl2 != null) {
                this.A0D.A01.A00(c0yl2);
            }
        } else {
            c0ylArr = this.A0A;
            i = this.A04;
            C0YL c0yl3 = c0ylArr[i];
            if (c0yl3 != null) {
                this.A0D.A00.A00(c0yl3);
            }
        }
        c0ylArr[i] = c0yl;
        C0YK c0yk = c0yl.A02;
        c0yk.A01 = i;
        this.A04 = i + 1;
        c0yk.A03(c0yl);
    }

    public void A0B(C0YM c0ym) {
        EnumC12160ix enumC12160ix = EnumC12160ix.UNRESTRICTED;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= this.A04) {
                break;
            }
            C0YL[] c0ylArr = this.A0A;
            if (c0ylArr[i].A02.A06 != enumC12160ix && c0ylArr[i].A00 < 0.0f) {
                boolean z = false;
                int i3 = 0;
                do {
                    i3 += i2;
                    float f = Float.MAX_VALUE;
                    int i4 = -1;
                    int i5 = -1;
                    int i6 = 0;
                    for (int i7 = 0; i7 < this.A04; i7++) {
                        C0YL c0yl = this.A0A[i7];
                        if (c0yl.A02.A06 != enumC12160ix && !c0yl.A04 && c0yl.A00 < 0.0f) {
                            for (int i8 = 1; i8 < this.A03; i8++) {
                                C0YK c0yk = this.A0D.A03[i8];
                                float A8C = c0yl.A01.A8C(c0yk);
                                int i9 = 0;
                                if (A8C > 0.0f) {
                                    do {
                                        float f2 = c0yk.A0A[i9] / A8C;
                                        if ((f2 < f && i9 == i6) || i9 > i6) {
                                            i6 = i9;
                                            f = f2;
                                            i4 = i7;
                                            i5 = i8;
                                        }
                                        i9++;
                                    } while (i9 < 9);
                                }
                            }
                        }
                    }
                    if (i4 != -1) {
                        C0YL c0yl2 = this.A0A[i4];
                        c0yl2.A02.A01 = -1;
                        c0yl2.A02(this.A0D.A03[i5]);
                        C0YK c0yk2 = c0yl2.A02;
                        c0yk2.A01 = i4;
                        c0yk2.A03(c0yl2);
                    } else {
                        z = true;
                    }
                    if (i3 > (this.A03 >> 1)) {
                        break;
                    }
                    i2 = 1;
                } while (!z);
            } else {
                i++;
            }
        }
        A0C(c0ym);
        for (int i10 = 0; i10 < this.A04; i10++) {
            C0YL c0yl3 = this.A0A[i10];
            c0yl3.A02.A00 = c0yl3.A00;
        }
    }

    public final void A0C(C0YM c0ym) {
        for (int i = 0; i < this.A03; i++) {
            this.A0C[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 >= (this.A03 << 1)) {
                return;
            }
            C0YK c0yk = ((C0YL) c0ym).A02;
            if (c0yk != null) {
                this.A0C[c0yk.A02] = true;
            }
            boolean[] zArr = this.A0C;
            C0YK ACP = c0ym.ACP(this, zArr);
            if (ACP == null) {
                return;
            }
            int i3 = ACP.A02;
            if (zArr[i3]) {
                return;
            }
            zArr[i3] = true;
            float f = Float.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < this.A04; i5++) {
                C0YL c0yl = this.A0A[i5];
                if (c0yl.A02.A06 != EnumC12160ix.UNRESTRICTED && !c0yl.A04 && c0yl.A01.A6U(ACP)) {
                    float A8C = c0yl.A01.A8C(ACP);
                    if (A8C < 0.0f) {
                        float f2 = (-c0yl.A00) / A8C;
                        if (f2 < f) {
                            i4 = i5;
                            f = f2;
                        }
                    }
                }
            }
            if (i4 > -1) {
                C0YL c0yl2 = this.A0A[i4];
                c0yl2.A02.A01 = -1;
                c0yl2.A02(ACP);
                C0YK c0yk2 = c0yl2.A02;
                c0yk2.A01 = i4;
                c0yk2.A03(c0yl2);
            }
        }
    }

    public void A0D(C0YK c0yk, int i) {
        int i2 = c0yk.A01;
        if (i2 == -1) {
            c0yk.A00 = i;
            c0yk.A08 = true;
            int i3 = c0yk.A03;
            for (int i4 = 0; i4 < i3; i4++) {
                c0yk.A0B[i4].A05(c0yk, false);
            }
            c0yk.A03 = 0;
        } else if (i2 != -1) {
            C0YL c0yl = this.A0A[i2];
            if (c0yl.A04) {
                c0yl.A00 = i;
            } else if (c0yl.A01.A9W() == 0) {
                c0yl.A04 = true;
                c0yl.A00 = i;
            } else {
                C0YL A01 = A01();
                if (i < 0) {
                    A01.A00 = -i;
                    A01.A01.AQx(c0yk, 1.0f);
                } else {
                    A01.A00 = i;
                    A01.A01.AQx(c0yk, -1.0f);
                }
                A09(A01);
            }
        } else {
            C0YL A012 = A01();
            A012.A02 = c0yk;
            float f = i;
            c0yk.A00 = f;
            A012.A00 = f;
            A012.A04 = true;
            A09(A012);
        }
    }

    public void A0E(C0YK c0yk, C0YK c0yk2, int i, float f, C0YK c0yk3, C0YK c0yk4, int i2, int i3) {
        C0YL A01 = A01();
        if (c0yk2 == c0yk3) {
            A01.A01.AQx(c0yk, 1.0f);
            A01.A01.AQx(c0yk4, 1.0f);
            A01.A01.AQx(c0yk2, -2.0f);
        } else if (f == 0.5f) {
            A01.A01.AQx(c0yk, 1.0f);
            A01.A01.AQx(c0yk2, -1.0f);
            A01.A01.AQx(c0yk3, -1.0f);
            A01.A01.AQx(c0yk4, 1.0f);
            if (i > 0 || i2 > 0) {
                A01.A00 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            A01.A01.AQx(c0yk, -1.0f);
            A01.A01.AQx(c0yk2, 1.0f);
            A01.A00 = i;
        } else if (f >= 1.0f) {
            A01.A01.AQx(c0yk4, -1.0f);
            A01.A01.AQx(c0yk3, 1.0f);
            A01.A00 = -i2;
        } else {
            float f2 = 1.0f - f;
            A01.A01.AQx(c0yk, f2 * 1.0f);
            A01.A01.AQx(c0yk2, f2 * (-1.0f));
            A01.A01.AQx(c0yk3, (-1.0f) * f);
            A01.A01.AQx(c0yk4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                A01.A00 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            A01.A01.AQx(A03(i3), 1.0f);
            A01.A01.AQx(A03(i3), -1.0f);
        }
        A09(A01);
    }

    public void A0F(C0YK c0yk, C0YK c0yk2, int i, int i2) {
        if (i2 == 8 && c0yk2.A08 && c0yk.A01 == -1) {
            c0yk.A00 = c0yk2.A00 + i;
            c0yk.A08 = true;
            int i3 = c0yk.A03;
            for (int i4 = 0; i4 < i3; i4++) {
                c0yk.A0B[i4].A05(c0yk, false);
            }
            c0yk.A03 = 0;
            return;
        }
        C0YL A01 = A01();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            A01.A00 = i;
        }
        if (!z) {
            A01.A01.AQx(c0yk, -1.0f);
            A01.A01.AQx(c0yk2, 1.0f);
        } else {
            A01.A01.AQx(c0yk, 1.0f);
            A01.A01.AQx(c0yk2, -1.0f);
        }
        if (i2 != 8) {
            A01.A01.AQx(A03(i2), 1.0f);
            A01.A01.AQx(A03(i2), -1.0f);
        }
        A09(A01);
    }

    public void A0G(C0YK c0yk, C0YK c0yk2, int i, int i2) {
        C0YL A01 = A01();
        C0YK A02 = A02();
        A02.A04 = 0;
        A01.A03(c0yk, c0yk2, A02, i);
        if (i2 != 8) {
            int A8C = (int) (A01.A01.A8C(A02) * (-1.0f));
            A01.A01.AQx(A03(i2), A8C);
        }
        A09(A01);
    }

    public void A0H(C0YK c0yk, C0YK c0yk2, int i, int i2) {
        C0YL A01 = A01();
        C0YK A02 = A02();
        A02.A04 = 0;
        A01.A04(c0yk, c0yk2, A02, i);
        if (i2 != 8) {
            int A8C = (int) (A01.A01.A8C(A02) * (-1.0f));
            A01.A01.AQx(A03(i2), A8C);
        }
        A09(A01);
    }

    public void A0I(C0YK c0yk, C0YK c0yk2, C0YK c0yk3, C0YK c0yk4, float f) {
        C0YL A01 = A01();
        A01.A01.AQx(c0yk, -1.0f);
        A01.A01.AQx(c0yk2, 1.0f);
        A01.A01.AQx(c0yk3, f);
        A01.A01.AQx(c0yk4, -f);
        A09(A01);
    }
}
