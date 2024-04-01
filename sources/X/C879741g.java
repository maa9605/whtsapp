package X;

import java.io.IOException;

/* renamed from: X.41g */
/* loaded from: classes2.dex */
public final class C879741g extends C0AZ implements C0AY {
    public static final C879741g A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public int A02;
    public C0AN A03;
    public C0AN A04;

    static {
        C879741g c879741g = new C879741g();
        A05 = c879741g;
        c879741g.A0E();
    }

    public C879741g() {
        C0AN c0an = C0AN.A01;
        this.A03 = c0an;
        this.A04 = c0an;
    }

    public static void A09(C879741g c879741g, C0AN c0an) {
        c879741g.A00 |= 4;
        c879741g.A03 = c0an;
    }

    public static void A0A(C879741g c879741g, C0AN c0an) {
        c879741g.A00 |= 8;
        c879741g.A04 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C879741g c879741g = (C879741g) obj2;
                this.A01 = c0rm.AW5(A0j(), this.A01, c879741g.A0j(), c879741g.A01);
                this.A02 = c0rm.AW5(A0k(), this.A02, c879741g.A0k(), c879741g.A02);
                this.A03 = c0rm.AW2(A0i(), this.A03, c879741g.A0i(), c879741g.A03);
                this.A04 = c0rm.AW2(A0l(), this.A04, c879741g.A0l(), c879741g.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c879741g.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                boolean z = false;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A02 = c0ro.A02();
                            } else if (A03 == 26) {
                                this.A00 |= 4;
                                this.A03 = c0ro.A08();
                            } else if (A03 != 34) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 8;
                                this.A04 = c0ro.A08();
                            }
                        }
                        z = true;
                    } catch (C0JX e) {
                        e.unfinishedMessage = this;
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        C0JX c0jx = new C0JX(e2.getMessage());
                        c0jx.unfinishedMessage = this;
                        throw new RuntimeException(c0jx);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C879741g();
            case 5:
                return new C879641f(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C879741g.class) {
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

    public boolean A0i() {
        return (this.A00 & 4) == 4;
    }

    public boolean A0j() {
        return (this.A00 & 1) == 1;
    }

    public boolean A0k() {
        return (this.A00 & 2) == 2;
    }

    public boolean A0l() {
        return (this.A00 & 8) == 8;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A062 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A062 += C0RS.A06(2, this.A02);
        }
        if ((i2 & 4) == 4) {
            A062 += C0RS.A09(3, this.A03);
        }
        if ((i2 & 8) == 8) {
            A062 += C0RS.A09(4, this.A04);
        }
        int A00 = this.unknownFields.A00() + A062;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0K(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A04);
        }
        this.unknownFields.A02(c0rs);
    }
}
