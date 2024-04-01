package X;

import java.io.IOException;

/* renamed from: X.29B */
/* loaded from: classes2.dex */
public final class C29B extends C0AZ implements C0AY {
    public static final C29B A07;
    public static volatile C0RQ A08;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C0AN A04;
    public C0AN A05;
    public C0AN A06;

    static {
        C29B c29b = new C29B();
        A07 = c29b;
        c29b.A0E();
    }

    public C29B() {
        C0AN c0an = C0AN.A01;
        this.A04 = c0an;
        this.A05 = c0an;
        this.A06 = c0an;
    }

    public static void A09(C29B c29b, C0AN c0an) {
        c29b.A00 |= 8;
        c29b.A04 = c0an;
    }

    public static void A0A(C29B c29b, C0AN c0an) {
        c29b.A00 |= 16;
        c29b.A05 = c0an;
    }

    public static void A0B(C29B c29b, C0AN c0an) {
        c29b.A00 |= 32;
        c29b.A06 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A07;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C29B c29b = (C29B) obj2;
                this.A02 = c0rm.AW5((this.A00 & 1) == 1, this.A02, (c29b.A00 & 1) == 1, c29b.A02);
                this.A01 = c0rm.AW5(A0l(), this.A01, c29b.A0l(), c29b.A01);
                this.A03 = c0rm.AW5(A0m(), this.A03, c29b.A0m(), c29b.A03);
                this.A04 = c0rm.AW2(A0i(), this.A04, c29b.A0i(), c29b.A04);
                this.A05 = c0rm.AW2(A0j(), this.A05, c29b.A0j(), c29b.A05);
                this.A06 = c0rm.AW2(A0k(), this.A06, c29b.A0k(), c29b.A06);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c29b.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r3) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 8) {
                                    this.A00 |= 2;
                                    this.A01 = c0ro.A02();
                                } else if (A03 == 18) {
                                    this.A00 |= 8;
                                    this.A04 = c0ro.A08();
                                } else if (A03 == 26) {
                                    this.A00 |= 16;
                                    this.A05 = c0ro.A08();
                                } else if (A03 == 34) {
                                    this.A00 |= 32;
                                    this.A06 = c0ro.A08();
                                } else if (A03 == 40) {
                                    this.A00 |= 1;
                                    this.A02 = c0ro.A02();
                                } else if (A03 != 48) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 4;
                                    this.A03 = c0ro.A02();
                                }
                            }
                            r3 = true;
                        } catch (IOException e) {
                            C0JX c0jx = new C0JX(e.getMessage());
                            c0jx.unfinishedMessage = this;
                            throw new RuntimeException(c0jx);
                        }
                    } catch (C0JX e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C29B();
            case 5:
                return new C879541e(null);
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C29B.class) {
                        if (A08 == null) {
                            A08 = new C0RR(A07);
                        }
                    }
                }
                return A08;
            default:
                throw new UnsupportedOperationException();
        }
        return A07;
    }

    public boolean A0i() {
        return (this.A00 & 8) == 8;
    }

    public boolean A0j() {
        return (this.A00 & 16) == 16;
    }

    public boolean A0k() {
        return (this.A00 & 32) == 32;
    }

    public boolean A0l() {
        return (this.A00 & 2) == 2;
    }

    public boolean A0m() {
        return (this.A00 & 4) == 4;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A06 = (i2 & 2) == 2 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 8) == 8) {
            A06 += C0RS.A09(2, this.A04);
        }
        if ((i2 & 16) == 16) {
            A06 += C0RS.A09(3, this.A05);
        }
        if ((i2 & 32) == 32) {
            A06 += C0RS.A09(4, this.A06);
        }
        if ((i2 & 1) == 1) {
            A06 += C0RS.A06(5, this.A02);
        }
        if ((i2 & 4) == 4) {
            A06 += C0RS.A06(6, this.A03);
        }
        int A00 = this.unknownFields.A00() + A06;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 2) == 2) {
            c0rs.A0K(1, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(2, this.A04);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0N(3, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0N(4, this.A06);
        }
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(5, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(6, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
