package X;

/* renamed from: X.1oD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38481oD extends AbstractC28611St {
    public C28601Ss A00;
    public C38441o9 A01;

    public C38481oD(C0YF c0yf) {
        super(c0yf);
        C28601Ss c28601Ss = new C28601Ss(this);
        this.A00 = c28601Ss;
        this.A01 = null;
        this.A05.A04 = EnumC12250j6.TOP;
        this.A04.A04 = EnumC12250j6.BOTTOM;
        c28601Ss.A04 = EnumC12250j6.BASELINE;
        super.A01 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC28611St
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38481oD.A07():void");
    }

    @Override // X.AbstractC28611St
    public void A08() {
        C28601Ss c28601Ss = this.A05;
        if (c28601Ss.A0B) {
            this.A03.A0Q = c28601Ss.A02;
        }
    }

    @Override // X.AbstractC28611St
    public void A09() {
        this.A07 = null;
        this.A05.A00();
        this.A04.A00();
        this.A00.A00();
        this.A06.A00();
        this.A09 = false;
    }

    @Override // X.AbstractC28611St
    public boolean A0A() {
        return this.A02 != C0YH.MATCH_CONSTRAINT || this.A03.A0C == 0;
    }

    public void A0B() {
        this.A09 = false;
        this.A05.A00();
        this.A05.A0B = false;
        this.A04.A00();
        this.A04.A0B = false;
        this.A00.A00();
        this.A00.A0B = false;
        this.A06.A0B = false;
    }

    @Override // X.AbstractC28611St, X.InterfaceC12230j4
    public void AVk(InterfaceC12230j4 interfaceC12230j4) {
        C38441o9 c38441o9;
        float f;
        float f2;
        float f3;
        int i;
        C0YH c0yh = C0YH.MATCH_CONSTRAINT;
        int ordinal = this.A08.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal == 3) {
            C0YF c0yf = this.A03;
            A05(c0yf.A0Y, c0yf.A0S, 1);
            return;
        }
        C38441o9 c38441o92 = this.A06;
        if (c38441o92.A0A && !c38441o92.A0B && this.A02 == c0yh) {
            C0YF c0yf2 = this.A03;
            int i2 = c0yf2.A0C;
            if (i2 == 2) {
                C0YF c0yf3 = c0yf2.A0Z;
                if (c0yf3 != null) {
                    if (c0yf3.A0d.A06.A0B) {
                        c38441o92.A01((int) ((c38441o9.A02 * c0yf2.A03) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C38441o9 c38441o93 = c0yf2.A0c.A06;
                if (c38441o93.A0B) {
                    int i3 = c0yf2.A08;
                    if (i3 == -1) {
                        f = c38441o93.A02;
                        f2 = c0yf2.A01;
                    } else if (i3 == 0) {
                        f3 = c38441o93.A02 * c0yf2.A01;
                        i = (int) (f3 + 0.5f);
                        c38441o92.A01(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c38441o92.A01(i);
                    } else {
                        f = c38441o93.A02;
                        f2 = c0yf2.A01;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c38441o92.A01(i);
                }
            }
        }
        C28601Ss c28601Ss = this.A05;
        if (c28601Ss.A0A) {
            C28601Ss c28601Ss2 = this.A04;
            if (c28601Ss2.A0A) {
                if (c28601Ss.A0B && c28601Ss2.A0B && this.A06.A0B) {
                    return;
                }
                boolean z = this.A06.A0B;
                if (!z && this.A02 == c0yh) {
                    C0YF c0yf4 = this.A03;
                    if (c0yf4.A0D == 0 && !c0yf4.A0I()) {
                        int i4 = ((C28601Ss) c28601Ss.A08.get(0)).A02;
                        C28601Ss c28601Ss3 = this.A05;
                        int i5 = i4 + c28601Ss3.A00;
                        int i6 = ((C28601Ss) this.A04.A08.get(0)).A02 + this.A04.A00;
                        c28601Ss3.A01(i5);
                        this.A04.A01(i6);
                        this.A06.A01(i6 - i5);
                        return;
                    }
                }
                if (!z && this.A02 == c0yh && super.A00 == 1 && c28601Ss.A08.size() > 0 && this.A04.A08.size() > 0) {
                    int i7 = (((C28601Ss) this.A04.A08.get(0)).A02 + this.A04.A00) - (((C28601Ss) this.A05.A08.get(0)).A02 + this.A05.A00);
                    C38441o9 c38441o94 = this.A06;
                    int i8 = c38441o94.A00;
                    if (i7 < i8) {
                        c38441o94.A01(i7);
                    } else {
                        c38441o94.A01(i8);
                    }
                }
                if (this.A06.A0B && this.A05.A08.size() > 0 && this.A04.A08.size() > 0) {
                    C28601Ss c28601Ss4 = (C28601Ss) this.A05.A08.get(0);
                    C28601Ss c28601Ss5 = (C28601Ss) this.A04.A08.get(0);
                    int i9 = c28601Ss4.A02;
                    C28601Ss c28601Ss6 = this.A05;
                    int i10 = c28601Ss6.A00 + i9;
                    int i11 = c28601Ss5.A02;
                    int i12 = this.A04.A00 + i11;
                    float f4 = this.A03.A06;
                    if (c28601Ss4 == c28601Ss5) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    c28601Ss6.A01((int) ((((i11 - i9) - this.A06.A02) * f4) + i9 + 0.5f));
                    this.A04.A01(this.A05.A02 + this.A06.A02);
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0P = C000200d.A0P("VerticalRun ");
        A0P.append(this.A03.A0f);
        return A0P.toString();
    }
}
