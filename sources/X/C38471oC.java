package X;

/* renamed from: X.1oC */
/* loaded from: classes.dex */
public class C38471oC extends AbstractC28611St {
    public static int[] A00 = new int[2];

    public C38471oC(C0YF c0yf) {
        super(c0yf);
        this.A05.A04 = EnumC12250j6.LEFT;
        this.A04.A04 = EnumC12250j6.RIGHT;
        this.A01 = 0;
    }

    public static final void A03(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 == 1) {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            } else {
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i6 > i6 || i9 > i7) {
        } else {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    @Override // X.AbstractC28611St
    public void A07() {
        C0YF c0yf;
        C0YF c0yf2;
        C0YF c0yf3;
        C0YF c0yf4;
        C0YH c0yh = C0YH.MATCH_CONSTRAINT;
        C0YH c0yh2 = C0YH.FIXED;
        C0YH c0yh3 = C0YH.MATCH_PARENT;
        C0YF c0yf5 = this.A03;
        if (c0yf5.A0i) {
            this.A06.A01(c0yf5.A01());
        }
        C38441o9 c38441o9 = this.A06;
        if (!c38441o9.A0B) {
            C0YF c0yf6 = this.A03;
            C0YH c0yh4 = c0yf6.A0o[0];
            this.A02 = c0yh4;
            if (c0yh4 != c0yh) {
                if (c0yh4 == c0yh3 && (((c0yf4 = c0yf6.A0Z) != null && c0yf4.A0o[0] == c0yh2) || c0yf4.A0o[0] == c0yh3)) {
                    int A01 = c0yf4.A01();
                    int A002 = c0yf6.A0W.A00();
                    int A003 = (A01 - A002) - c0yf6.A0X.A00();
                    AbstractC28611St.A02(this.A05, c0yf4.A0c.A05, A002);
                    AbstractC28611St.A02(this.A04, c0yf4.A0c.A04, -this.A03.A0X.A00());
                    this.A06.A01(A003);
                    return;
                } else if (c0yh4 == c0yh2) {
                    c38441o9.A01(c0yf6.A01());
                }
            }
        } else if (this.A02 == c0yh3 && (((c0yf2 = (c0yf = this.A03).A0Z) != null && c0yf2.A0o[0] == c0yh2) || c0yf2.A0o[0] == c0yh3)) {
            AbstractC28611St.A02(this.A05, c0yf2.A0c.A05, c0yf.A0W.A00());
            AbstractC28611St.A02(this.A04, c0yf2.A0c.A04, -this.A03.A0X.A00());
            return;
        }
        C38441o9 c38441o92 = this.A06;
        if (c38441o92.A0B) {
            C0YF c0yf7 = this.A03;
            if (c0yf7.A0i) {
                C0YJ[] c0yjArr = c0yf7.A0n;
                C0YJ c0yj = c0yjArr[0];
                C0YJ c0yj2 = c0yj.A03;
                if (c0yj2 != null) {
                    C0YJ c0yj3 = c0yjArr[1];
                    if (c0yj3.A03 != null) {
                        if (c0yf7.A0H()) {
                            this.A05.A00 = c0yj.A00();
                            this.A04.A00 = -c0yj3.A00();
                            return;
                        }
                        C28601Ss A004 = AbstractC28611St.A00(c0yj);
                        if (A004 != null) {
                            C28601Ss c28601Ss = this.A05;
                            int A005 = c0yj.A00();
                            c28601Ss.A08.add(A004);
                            c28601Ss.A00 = A005;
                            A004.A07.add(c28601Ss);
                        }
                        C0YJ c0yj4 = this.A03.A0n[1];
                        C28601Ss A006 = AbstractC28611St.A00(c0yj4);
                        if (A006 != null) {
                            C28601Ss c28601Ss2 = this.A04;
                            int i = -c0yj4.A00();
                            c28601Ss2.A08.add(A006);
                            c28601Ss2.A00 = i;
                            A006.A07.add(c28601Ss2);
                        }
                        this.A05.A09 = true;
                        this.A04.A09 = true;
                        return;
                    }
                }
                if (c0yj2 != null) {
                    C28601Ss A007 = AbstractC28611St.A00(c0yj);
                    if (A007 == null) {
                        return;
                    }
                    C28601Ss c28601Ss3 = this.A05;
                    int A008 = c0yj.A00();
                    c28601Ss3.A08.add(A007);
                    c28601Ss3.A00 = A008;
                    A007.A07.add(c28601Ss3);
                    AbstractC28611St.A02(this.A04, this.A05, this.A06.A02);
                    return;
                }
                C0YJ c0yj5 = c0yjArr[1];
                if (c0yj5.A03 != null) {
                    C28601Ss A009 = AbstractC28611St.A00(c0yj5);
                    if (A009 == null) {
                        return;
                    }
                    C28601Ss c28601Ss4 = this.A04;
                    int i2 = -c0yj5.A00();
                    c28601Ss4.A08.add(A009);
                    c28601Ss4.A00 = i2;
                    A009.A07.add(c28601Ss4);
                    AbstractC28611St.A02(this.A05, this.A04, -this.A06.A02);
                    return;
                } else if ((c0yf7 instanceof InterfaceC12180iz) || c0yf7.A0Z == null || c0yf7.A04(EnumC12170iy.CENTER).A03 != null) {
                    return;
                } else {
                    C0YF c0yf8 = this.A03;
                    AbstractC28611St.A02(this.A05, c0yf8.A0Z.A0c.A05, c0yf8.A02());
                    AbstractC28611St.A02(this.A04, this.A05, this.A06.A02);
                    return;
                }
            }
        }
        if (this.A02 == c0yh) {
            C0YF c0yf9 = this.A03;
            int i3 = c0yf9.A0D;
            if (i3 == 2) {
                C0YF c0yf10 = c0yf9.A0Z;
                if (c0yf10 != null) {
                    C38441o9 c38441o93 = c0yf10.A0d.A06;
                    c38441o92.A08.add(c38441o93);
                    c38441o93.A07.add(this.A06);
                    C38441o9 c38441o94 = this.A06;
                    c38441o94.A09 = true;
                    c38441o94.A07.add(this.A05);
                    this.A06.A07.add(this.A04);
                }
            } else if (i3 == 3) {
                if (c0yf9.A0C == 3) {
                    this.A05.A03 = this;
                    this.A04.A03 = this;
                    C38481oD c38481oD = c0yf9.A0d;
                    c38481oD.A05.A03 = this;
                    c38481oD.A04.A03 = this;
                    c38441o92.A03 = this;
                    if (c0yf9.A0I()) {
                        c38441o92.A08.add(c38481oD.A06);
                        this.A03.A0d.A06.A07.add(this.A06);
                        C38481oD c38481oD2 = this.A03.A0d;
                        c38481oD2.A06.A03 = this;
                        this.A06.A08.add(c38481oD2.A05);
                        this.A06.A08.add(this.A03.A0d.A04);
                        this.A03.A0d.A05.A07.add(this.A06);
                        this.A03.A0d.A04.A07.add(this.A06);
                    } else if (c0yf9.A0H()) {
                        c38481oD.A06.A08.add(c38441o92);
                        this.A06.A07.add(this.A03.A0d.A06);
                    } else {
                        c38481oD.A06.A08.add(c38441o92);
                    }
                } else {
                    C38441o9 c38441o95 = c0yf9.A0d.A06;
                    c38441o92.A08.add(c38441o95);
                    c38441o95.A07.add(this.A06);
                    this.A03.A0d.A05.A07.add(this.A06);
                    this.A03.A0d.A04.A07.add(this.A06);
                    C38441o9 c38441o96 = this.A06;
                    c38441o96.A09 = true;
                    c38441o96.A07.add(this.A05);
                    this.A06.A07.add(this.A04);
                    this.A05.A08.add(this.A06);
                    this.A04.A08.add(this.A06);
                }
            }
        }
        C0YF c0yf11 = this.A03;
        C0YJ[] c0yjArr2 = c0yf11.A0n;
        C0YJ c0yj6 = c0yjArr2[0];
        C0YJ c0yj7 = c0yj6.A03;
        if (c0yj7 != null) {
            C0YJ c0yj8 = c0yjArr2[1];
            if (c0yj8.A03 != null) {
                if (c0yf11.A0H()) {
                    this.A05.A00 = c0yj6.A00();
                    this.A04.A00 = -c0yj8.A00();
                    return;
                }
                C28601Ss A0010 = AbstractC28611St.A00(c0yj6);
                C28601Ss A0011 = AbstractC28611St.A00(c0yj8);
                A0010.A07.add(this);
                if (A0010.A0B) {
                    AVk(this);
                }
                A0011.A07.add(this);
                if (A0011.A0B) {
                    AVk(this);
                }
                this.A08 = EnumC12270j8.CENTER;
                return;
            }
        }
        if (c0yj7 != null) {
            C28601Ss A0012 = AbstractC28611St.A00(c0yj6);
            if (A0012 == null) {
                return;
            }
            C28601Ss c28601Ss5 = this.A05;
            int A0013 = c0yj6.A00();
            c28601Ss5.A08.add(A0012);
            c28601Ss5.A00 = A0013;
            A0012.A07.add(c28601Ss5);
            A06(this.A04, this.A05, 1, this.A06);
            return;
        }
        C0YJ c0yj9 = c0yjArr2[1];
        if (c0yj9.A03 != null) {
            C28601Ss A0014 = AbstractC28611St.A00(c0yj9);
            if (A0014 == null) {
                return;
            }
            C28601Ss c28601Ss6 = this.A04;
            int i4 = -c0yj9.A00();
            c28601Ss6.A08.add(A0014);
            c28601Ss6.A00 = i4;
            A0014.A07.add(c28601Ss6);
            A06(this.A05, this.A04, -1, this.A06);
        } else if ((c0yf11 instanceof InterfaceC12180iz) || (c0yf3 = c0yf11.A0Z) == null) {
        } else {
            AbstractC28611St.A02(this.A05, c0yf3.A0c.A05, c0yf11.A02());
            A06(this.A04, this.A05, 1, this.A06);
        }
    }

    @Override // X.AbstractC28611St
    public void A08() {
        C28601Ss c28601Ss = this.A05;
        if (c28601Ss.A0B) {
            this.A03.A0P = c28601Ss.A02;
        }
    }

    @Override // X.AbstractC28611St
    public void A09() {
        this.A07 = null;
        this.A05.A00();
        this.A04.A00();
        this.A06.A00();
        this.A09 = false;
    }

    @Override // X.AbstractC28611St
    public boolean A0A() {
        return this.A02 != C0YH.MATCH_CONSTRAINT || this.A03.A0D == 0;
    }

    public void A0B() {
        this.A09 = false;
        this.A05.A00();
        this.A05.A0B = false;
        this.A04.A00();
        this.A04.A0B = false;
        this.A06.A0B = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x01de, code lost:
        if (r10 != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x025a, code lost:
        if (r11 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0286, code lost:
        if (r15 != 1) goto L126;
     */
    @Override // X.AbstractC28611St, X.InterfaceC12230j4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AVk(X.InterfaceC12230j4 r24) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38471oC.AVk(X.0j4):void");
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("HorizontalRun ");
        A0P.append(this.A03.A0f);
        return A0P.toString();
    }
}
