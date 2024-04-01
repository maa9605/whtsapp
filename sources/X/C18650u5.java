package X;

/* renamed from: X.0u5  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C18650u5 {
    public int A00;
    public C18760uH A04;
    public C18760uH A05;
    public C18760uH A06;
    public int A03 = -1;
    public int A01 = -1;
    public int A02 = 0;

    public C18650u5() {
        C18760uH A00 = C18760uH.A00(-1, -1);
        this.A06 = A00;
        A00.A02 = 0;
        A00.A03 = 0;
        A00.A04 = 0;
        this.A04 = A00;
        this.A05 = A00;
        this.A00 = 0;
    }

    public final String A00(C18760uH c18760uH, int i) {
        C18760uH[] c18760uHArr;
        if (i < 0) {
            return "<snip>";
        }
        if (c18760uH == null) {
            return "\n{x}";
        }
        StringBuilder A0P = C000200d.A0P("\n");
        A0P.append(c18760uH.toString());
        String obj = A0P.toString();
        for (C18760uH c18760uH2 : c18760uH.A0B) {
            StringBuilder A0P2 = C000200d.A0P(obj);
            A0P2.append(A00(c18760uH2, i - 1).replace("\n", "\n-"));
            obj = A0P2.toString();
        }
        return obj;
    }

    public void A01() {
        boolean z;
        C18760uH[] c18760uHArr;
        long nanoTime = System.nanoTime();
        try {
            int i = this.A01;
            if (i != -1) {
                int i2 = i - this.A02;
                int i3 = this.A03;
                int i4 = 1 << (i3 << 1);
                if (i3 == -1) {
                    i4 = 0;
                }
                int i5 = i2 + i4;
                if (this.A00 > i5) {
                    for (C18760uH c18760uH = this.A04; this.A00 > i5 && c18760uH != null; c18760uH = c18760uH.A09) {
                        if (c18760uH.A02() != null && c18760uH.A04 != this.A03 && c18760uH.A0C == 0) {
                            synchronized (c18760uH) {
                                if (c18760uH.A06 != null) {
                                    c18760uH.A04();
                                }
                                c18760uH.A06 = null;
                            }
                            this.A00--;
                        }
                    }
                    do {
                        z = false;
                        for (C18760uH c18760uH2 = this.A04; c18760uH2 != null; c18760uH2 = c18760uH2.A09) {
                            for (int i6 = 0; i6 < 4; i6++) {
                                C18760uH c18760uH3 = c18760uH2.A0B[i6];
                                if (c18760uH3 != null && c18760uH3.A0C == 0 && c18760uH3.A02() == null) {
                                    int i7 = 0;
                                    int i8 = 0;
                                    int i9 = -1;
                                    do {
                                        c18760uHArr = c18760uH3.A0B;
                                        if (c18760uHArr[i7] != null) {
                                            i8++;
                                            i9 = i7;
                                        }
                                        i7++;
                                    } while (i7 < 4);
                                    if (i8 == 1) {
                                        c18760uH2.A0B[i6] = c18760uHArr[i9];
                                        A05(c18760uH3);
                                        c18760uH3.A03();
                                    } else if (i8 == 0) {
                                        c18760uH2.A0B[i6] = null;
                                        A05(c18760uH3);
                                        c18760uH3.A03();
                                    }
                                    z = true;
                                }
                            }
                        }
                    } while (z);
                }
            }
        } finally {
            C18680u8.A0U.A03(System.nanoTime() - nanoTime);
        }
    }

    public void A02(int i, int i2, int i3, C18580ty c18580ty) {
        int i4 = 0;
        c18580ty.A03 = 0;
        c18580ty.A06 = null;
        c18580ty.A05 = null;
        int i5 = 0;
        do {
            c18580ty.A07[i5] = null;
            i5++;
        } while (i5 < 4);
        c18580ty.A00 = i;
        c18580ty.A01 = i2;
        c18580ty.A02 = i3;
        C18760uH c18760uH = this.A06;
        while (c18760uH.A04 < i3) {
            if (c18760uH.A02() != null) {
                c18580ty.A05 = c18760uH;
            }
            int i6 = (i3 - c18760uH.A04) - 1;
            C18760uH c18760uH2 = c18760uH.A0B[(((i >> i6) & 1) << 1) + ((i2 >> i6) & 1)];
            if (c18760uH2 == null) {
                break;
            }
            c18760uH = c18760uH2;
        }
        if (c18760uH.A04 == i3 && c18760uH.A02 == i && c18760uH.A03 == i2) {
            if (c18760uH.A02() != null) {
                c18580ty.A06 = c18760uH;
            } else {
                c18580ty.A03 = c18760uH.A0C;
                C18760uH[] c18760uHArr = c18760uH.A0B;
                System.arraycopy(c18760uHArr, 0, c18580ty.A07, 0, 4);
                do {
                    A04(c18760uHArr[i4]);
                    i4++;
                } while (i4 < 4);
            }
        }
        C18760uH c18760uH3 = c18580ty.A06;
        if (c18760uH3 != null) {
            A04(c18760uH3);
            return;
        }
        C18760uH c18760uH4 = c18580ty.A05;
        if (c18760uH4 == null) {
            return;
        }
        A04(c18760uH4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        r10 = r6.A0B;
        r8 = r10[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r8 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        r10[r11] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        A04(r14);
        A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        r7 = r8.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r3 >= r7) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
        r10[r11] = r14;
        r1 = (r7 - r3) - 1;
        r14.A0B[(((r8.A02 >> r1) & 1) << 1) + ((r8.A03 >> r1) & 1)] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r7 != r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r8.A02 != r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r8.A03 != r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
        A05(r8);
        java.lang.System.arraycopy(r8.A0B, 0, r14.A0B, 0, 4);
        r10[r11] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r8.A02() == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r13.A00--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a6, code lost:
        r8.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
        r3 = r3 - r7;
        r5 = r5 >> r3;
        r4 = r4 >> r3;
        r1 = r8.A02;
        r0 = r8.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        if (r5 != r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (r4 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
        r6 = X.C18760uH.A00(-1, -1);
        r6.A02 = r5;
        r6.A03 = r4;
        r6.A04 = r7;
        r10[r11] = r6;
        r4 = r6.A0B;
        r3 = r8.A02;
        r2 = r8.A03;
        r1 = (r8.A04 - r7) - 1;
        r4[(((r3 >> r1) & 1) << 1) + ((r2 >> r1) & 1)] = r8;
        r3 = r14.A02;
        r2 = r14.A03;
        r1 = (r14.A04 - r7) - 1;
        r4[(((r3 >> r1) & 1) << 1) + ((r2 >> r1) & 1)] = r14;
        A04(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f1, code lost:
        r5 = r5 >> 1;
        r4 = r4 >> 1;
        r1 = r1 >> 1;
        r0 = r0 >> 1;
        r7 = r7 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(X.C18760uH r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18650u5.A03(X.0uH):void");
    }

    public final void A04(C18760uH c18760uH) {
        if (c18760uH == null) {
            return;
        }
        A05(c18760uH);
        C18760uH c18760uH2 = this.A05;
        c18760uH2.A09 = c18760uH;
        c18760uH.A08 = c18760uH2;
        this.A05 = c18760uH;
    }

    public final void A05(C18760uH c18760uH) {
        if (c18760uH == this.A04) {
            this.A04 = c18760uH.A09;
        }
        if (c18760uH == this.A05) {
            this.A05 = c18760uH.A08;
        }
        C18760uH c18760uH2 = c18760uH.A09;
        if (c18760uH2 != null) {
            c18760uH2.A08 = c18760uH.A08;
        }
        C18760uH c18760uH3 = c18760uH.A08;
        if (c18760uH3 != null) {
            c18760uH3.A09 = c18760uH2;
        }
        c18760uH.A09 = null;
        c18760uH.A08 = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(this.A06, 10));
        sb.append("\n");
        return sb.toString();
    }
}
