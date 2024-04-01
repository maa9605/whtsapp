package X;

import java.io.IOException;

/* renamed from: X.2Fx */
/* loaded from: classes2.dex */
public final class C48612Fx extends C0AZ implements C0AY {
    public static final C48612Fx A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01 = 0;
    public C40521sP A02;
    public C53432gu A03;
    public Object A04;

    static {
        C48612Fx c48612Fx = new C48612Fx();
        A05 = c48612Fx;
        c48612Fx.A0E();
    }

    public static void A09(C48612Fx c48612Fx, C53442gv c53442gv) {
        if (c48612Fx != null) {
            c48612Fx.A04 = c53442gv.A01();
            c48612Fx.A01 = 2;
            return;
        }
        throw null;
    }

    public static void A0A(C48612Fx c48612Fx, C53442gv c53442gv) {
        if (c48612Fx != null) {
            c48612Fx.A03 = (C53432gu) c53442gv.A01();
            c48612Fx.A00 |= 8;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C53442gv c53442gv;
        C87333zU c87333zU;
        C53442gv c53442gv2;
        C40L c40l;
        boolean z = false;
        EnumC79303lR enumC79303lR = null;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48612Fx c48612Fx = (C48612Fx) obj2;
                this.A02 = (C40521sP) c0rm.AW9(this.A02, c48612Fx.A02);
                this.A03 = (C53432gu) c0rm.AW9(this.A03, c48612Fx.A03);
                int i = c48612Fx.A01;
                if (i == 0) {
                    enumC79303lR = EnumC79303lR.FORMAT_NOT_SET;
                } else if (i == 1) {
                    enumC79303lR = EnumC79303lR.FOUR_ROW_TEMPLATE;
                } else if (i == 2) {
                    enumC79303lR = EnumC79303lR.HYDRATED_FOUR_ROW_TEMPLATE;
                }
                int ordinal = enumC79303lR.ordinal();
                if (ordinal == 0) {
                    this.A04 = c0rm.AWA(this.A01 == 1, this.A04, c48612Fx.A04);
                } else if (ordinal == 1) {
                    this.A04 = c0rm.AWA(this.A01 == 2, this.A04, c48612Fx.A04);
                } else if (ordinal == 2) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i2 = c48612Fx.A01;
                    if (i2 != 0) {
                        this.A01 = i2;
                    }
                    this.A00 |= c48612Fx.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                if (this.A01 == 1) {
                                    c40l = (C40L) ((C55452kR) this.A04).AVX();
                                } else {
                                    c40l = null;
                                }
                                C0AX A09 = c0ro.A09(C55452kR.A06.A0C(), c0rp);
                                this.A04 = A09;
                                if (c40l != null) {
                                    c40l.A03((C55452kR) A09);
                                    this.A04 = c40l.A00();
                                }
                                this.A01 = 1;
                            } else if (A03 == 18) {
                                if (this.A01 == 2) {
                                    c53442gv2 = (C53442gv) ((C53432gu) this.A04).AVX();
                                } else {
                                    c53442gv2 = null;
                                }
                                C0AX A092 = c0ro.A09(C53432gu.A07.A0C(), c0rp);
                                this.A04 = A092;
                                if (c53442gv2 != null) {
                                    c53442gv2.A03((C53432gu) A092);
                                    this.A04 = c53442gv2.A00();
                                }
                                this.A01 = 2;
                            } else if (A03 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    c87333zU = (C87333zU) this.A02.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A02 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A02 = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 4;
                            } else if (A03 != 34) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 8) == 8) {
                                    c53442gv = (C53442gv) this.A03.AVX();
                                } else {
                                    c53442gv = null;
                                }
                                C53432gu c53432gu = (C53432gu) c0ro.A09(C53432gu.A07.A0C(), c0rp);
                                this.A03 = c53432gu;
                                if (c53442gv != null) {
                                    c53442gv.A03(c53432gu);
                                    this.A03 = (C53432gu) c53442gv.A00();
                                }
                                this.A00 |= 8;
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
                return new C48612Fx();
            case 5:
                return new C0CT() { // from class: X.2Fw
                    {
                        C48612Fx c48612Fx2 = C48612Fx.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C48612Fx.class) {
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

    public C55452kR A0i() {
        if (this.A01 == 1) {
            return (C55452kR) this.A04;
        }
        return C55452kR.A06;
    }

    public C53432gu A0j() {
        C53432gu c53432gu = this.A03;
        return c53432gu == null ? C53432gu.A07 : c53432gu;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = this.A01 == 1 ? 0 + C0RS.A0A(1, (C0Aa) this.A04) : 0;
        if (this.A01 == 2) {
            A0A += C0RS.A0A(2, (C0Aa) this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C40521sP c40521sP = this.A02;
            if (c40521sP == null) {
                c40521sP = C40521sP.A0H;
            }
            A0A += C0RS.A0A(3, c40521sP);
        }
        if ((this.A00 & 8) == 8) {
            A0A += C0RS.A0A(4, A0j());
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if (this.A01 == 1) {
            c0rs.A0O(1, (C0Aa) this.A04);
        }
        if (this.A01 == 2) {
            c0rs.A0O(2, (C0Aa) this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C40521sP c40521sP = this.A02;
            if (c40521sP == null) {
                c40521sP = C40521sP.A0H;
            }
            c0rs.A0O(3, c40521sP);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0O(4, A0j());
        }
        this.unknownFields.A02(c0rs);
    }
}
