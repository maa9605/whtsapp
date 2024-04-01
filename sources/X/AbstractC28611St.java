package X;

/* renamed from: X.1St */
/* loaded from: classes.dex */
public abstract class AbstractC28611St implements InterfaceC12230j4 {
    public int A00;
    public C0YH A02;
    public C0YF A03;
    public C12260j7 A07;
    public C38441o9 A06 = new C38441o9(this);
    public int A01 = 0;
    public boolean A09 = false;
    public C28601Ss A05 = new C28601Ss(this);
    public C28601Ss A04 = new C28601Ss(this);
    public EnumC12270j8 A08 = EnumC12270j8.NONE;

    public abstract void A07();

    public abstract void A08();

    public abstract void A09();

    public abstract boolean A0A();

    @Override // X.InterfaceC12230j4
    public void AVk(InterfaceC12230j4 interfaceC12230j4) {
    }

    public AbstractC28611St(C0YF c0yf) {
        this.A03 = c0yf;
    }

    public static final C28601Ss A00(C0YJ c0yj) {
        C0YJ c0yj2 = c0yj.A03;
        if (c0yj2 == null) {
            return null;
        }
        C0YF c0yf = c0yj2.A06;
        int ordinal = c0yj2.A05.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return c0yf.A0d.A00;
                        }
                        return null;
                    }
                    return c0yf.A0d.A04;
                }
                return c0yf.A0c.A04;
            }
            return c0yf.A0d.A05;
        }
        return c0yf.A0c.A05;
    }

    public static final C28601Ss A01(C0YJ c0yj, int i) {
        AbstractC28611St abstractC28611St;
        C0YJ c0yj2 = c0yj.A03;
        if (c0yj2 == null) {
            return null;
        }
        C0YF c0yf = c0yj2.A06;
        if (i == 0) {
            abstractC28611St = c0yf.A0c;
        } else {
            abstractC28611St = c0yf.A0d;
        }
        int ordinal = c0yj2.A05.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return abstractC28611St.A05;
        }
        if (ordinal == 3 || ordinal == 4) {
            return abstractC28611St.A04;
        }
        return null;
    }

    public static final void A02(C28601Ss c28601Ss, C28601Ss c28601Ss2, int i) {
        c28601Ss.A08.add(c28601Ss2);
        c28601Ss.A00 = i;
        c28601Ss2.A07.add(c28601Ss);
    }

    public final int A03(int i, int i2) {
        if (i2 == 0) {
            C0YF c0yf = this.A03;
            int i3 = c0yf.A0F;
            int max = Math.max(c0yf.A0H, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C0YF c0yf2 = this.A03;
            int i4 = c0yf2.A0E;
            int max2 = Math.max(c0yf2.A0G, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long A04() {
        C38441o9 c38441o9 = this.A06;
        if (c38441o9.A0B) {
            return c38441o9.A02;
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0051, code lost:
        if (((X.AbstractC28611St) r8).A00 == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05(X.C0YJ r16, X.C0YJ r17, int r18) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28611St.A05(X.0YJ, X.0YJ, int):void");
    }

    public final void A06(C28601Ss c28601Ss, C28601Ss c28601Ss2, int i, C38441o9 c38441o9) {
        c28601Ss.A08.add(c28601Ss2);
        c28601Ss.A08.add(this.A06);
        c28601Ss.A01 = i;
        c28601Ss.A05 = c38441o9;
        c28601Ss2.A07.add(c28601Ss);
        c38441o9.A07.add(c28601Ss);
    }
}
