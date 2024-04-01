package X;

import java.io.IOException;

/* renamed from: X.3e1 */
/* loaded from: classes2.dex */
public final class C74893e1 extends C0AZ implements C0AY {
    public static final C74893e1 A05;
    public static volatile C0RQ A06;
    public int A00;
    public C0AN A01;
    public C0AN A02;
    public C0CX A03;
    public C74923e4 A04;

    static {
        C74893e1 c74893e1 = new C74893e1();
        A05 = c74893e1;
        c74893e1.A0E();
    }

    public C74893e1() {
        C0AN c0an = C0AN.A01;
        this.A02 = c0an;
        this.A01 = c0an;
        this.A03 = C0RU.A01;
    }

    public static void A09(C74893e1 c74893e1) {
        if (c74893e1 != null) {
            c74893e1.A03 = C0RU.A01;
            return;
        }
        throw null;
    }

    public static void A0A(C74893e1 c74893e1) {
        c74893e1.A0j();
        c74893e1.A03.remove(0);
    }

    public static void A0B(C74893e1 c74893e1, C0AN c0an) {
        c74893e1.A00 |= 1;
        c74893e1.A02 = c0an;
    }

    public static void A0C(C74893e1 c74893e1, C0AN c0an) {
        c74893e1.A00 |= 2;
        c74893e1.A01 = c0an;
    }

    public static void A0D(C74893e1 c74893e1, Iterable iterable) {
        c74893e1.A0j();
        C0Aa.A08(iterable, c74893e1.A03);
    }

    public static void A0E(C74893e1 c74893e1, C74923e4 c74923e4) {
        if (c74923e4 != null) {
            c74893e1.A04 = c74923e4;
            c74893e1.A00 |= 4;
            return;
        }
        throw null;
    }

    public static void A0F(C74893e1 c74893e1, C74903e2 c74903e2) {
        if (c74903e2 != null) {
            c74893e1.A0j();
            c74893e1.A03.add(c74903e2);
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C74933e5 c74933e5;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C74893e1 c74893e1 = (C74893e1) obj2;
                this.A02 = c0rm.AW2((this.A00 & 1) == 1, this.A02, (c74893e1.A00 & 1) == 1, c74893e1.A02);
                this.A01 = c0rm.AW2((this.A00 & 2) == 2, this.A01, (c74893e1.A00 & 2) == 2, c74893e1.A01);
                this.A04 = (C74923e4) c0rm.AW9(this.A04, c74893e1.A04);
                this.A03 = c0rm.AW7(this.A03, c74893e1.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c74893e1.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r4) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    this.A00 |= 1;
                                    this.A02 = c0ro.A08();
                                } else if (A03 == 18) {
                                    this.A00 |= 2;
                                    this.A01 = c0ro.A08();
                                } else if (A03 == 26) {
                                    if ((this.A00 & 4) == 4) {
                                        c74933e5 = (C74933e5) this.A04.AVX();
                                    } else {
                                        c74933e5 = null;
                                    }
                                    C74923e4 c74923e4 = (C74923e4) c0ro.A09(C74923e4.A03.A0C(), c0rp);
                                    this.A04 = c74923e4;
                                    if (c74933e5 != null) {
                                        c74933e5.A03(c74923e4);
                                        this.A04 = (C74923e4) c74933e5.A00();
                                    }
                                    this.A00 |= 4;
                                } else if (A03 != 34) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    C0CX c0cx = this.A03;
                                    C0CX c0cx2 = c0cx;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx2 = C0AZ.A05(c0cx);
                                        this.A03 = c0cx2;
                                    }
                                    c0cx2.add(c0ro.A09(C74903e2.A05.A0C(), c0rp));
                                }
                            }
                            r4 = true;
                        } catch (C0JX e) {
                            e.unfinishedMessage = this;
                            throw new RuntimeException(e);
                        }
                    } catch (IOException e2) {
                        C0JX c0jx = new C0JX(e2.getMessage());
                        c0jx.unfinishedMessage = this;
                        throw new RuntimeException(c0jx);
                    }
                }
                break;
            case 3:
                ((C0CY) this.A03).A00 = false;
                return null;
            case 4:
                return new C74893e1();
            case 5:
                return new C74943e6(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C74893e1.class) {
                        if (A06 == null) {
                            A06 = new C0RR(A05);
                        }
                    }
                }
                return A06;
            default:
                throw new UnsupportedOperationException();
        }
        return A05;
    }

    public C74923e4 A0i() {
        C74923e4 c74923e4 = this.A04;
        return c74923e4 == null ? C74923e4.A03 : c74923e4;
    }

    public final void A0j() {
        C0CX c0cx = this.A03;
        if (((C0CY) c0cx).A00) {
            return;
        }
        this.A03 = C0AZ.A05(c0cx);
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = C0RS.A09(1, this.A02) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += C0RS.A09(2, this.A01);
        }
        if ((i3 & 4) == 4) {
            i += C0RS.A0A(3, A0i());
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            i += C0RS.A0A(4, (C0AX) this.A03.get(i4));
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(3, A0i());
        }
        for (int i = 0; i < this.A03.size(); i++) {
            c0rs.A0O(4, (C0AX) this.A03.get(i));
        }
        this.unknownFields.A02(c0rs);
    }
}
