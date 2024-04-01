package X;

import java.io.IOException;

/* renamed from: X.2h3  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C53522h3 extends C0AZ implements C0AY {
    public static final C53522h3 A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public C2h5 A02;
    public C55372kJ A03;
    public String A04 = "";

    static {
        C53522h3 c53522h3 = new C53522h3();
        A05 = c53522h3;
        c53522h3.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87533zo c87533zo;
        EnumC53532h4 enumC53532h4;
        C87523zn c87523zn;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C53522h3 c53522h3 = (C53522h3) obj2;
                this.A04 = c0rm.AWD((this.A00 & 1) == 1, this.A04, (c53522h3.A00 & 1) == 1, c53522h3.A04);
                this.A02 = (C2h5) c0rm.AW9(this.A02, c53522h3.A02);
                this.A01 = c0rm.AW5((this.A00 & 4) == 4, this.A01, (c53522h3.A00 & 4) == 4, c53522h3.A01);
                this.A03 = (C55372kJ) c0rm.AW9(this.A03, c53522h3.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c53522h3.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A04 = A0A;
                                } else if (A03 == 18) {
                                    if ((this.A00 & 2) == 2) {
                                        c87523zn = (C87523zn) this.A02.AVX();
                                    } else {
                                        c87523zn = null;
                                    }
                                    C2h5 c2h5 = (C2h5) c0ro.A09(C2h5.A02.A0C(), c0rp);
                                    this.A02 = c2h5;
                                    if (c87523zn != null) {
                                        c87523zn.A03(c2h5);
                                        this.A02 = (C2h5) c87523zn.A00();
                                    }
                                    this.A00 |= 2;
                                } else if (A03 == 24) {
                                    int A02 = c0ro.A02();
                                    if (A02 == 0) {
                                        enumC53532h4 = EnumC53532h4.UNKNOWN;
                                    } else if (A02 != 1) {
                                        enumC53532h4 = A02 != 2 ? null : EnumC53532h4.NATIVE_FLOW;
                                    } else {
                                        enumC53532h4 = EnumC53532h4.RESPONSE;
                                    }
                                    if (enumC53532h4 == null) {
                                        super.A0F(3, A02);
                                    } else {
                                        this.A00 |= 4;
                                        this.A01 = A02;
                                    }
                                } else if (A03 != 34) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 8) == 8) {
                                        c87533zo = (C87533zo) this.A03.AVX();
                                    } else {
                                        c87533zo = null;
                                    }
                                    C55372kJ c55372kJ = (C55372kJ) c0ro.A09(C55372kJ.A03.A0C(), c0rp);
                                    this.A03 = c55372kJ;
                                    if (c87533zo != null) {
                                        c87533zo.A03(c55372kJ);
                                        this.A03 = (C55372kJ) c87533zo.A00();
                                    }
                                    this.A00 |= 8;
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
                return new C53522h3();
            case 5:
                return new C0CT() { // from class: X.3zm
                    {
                        C53522h3 c53522h32 = C53522h3.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C53522h3.class) {
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

    public C2h5 A0i() {
        C2h5 c2h5 = this.A02;
        return c2h5 == null ? C2h5.A02 : c2h5;
    }

    public C55372kJ A0j() {
        C55372kJ c55372kJ = this.A03;
        return c55372kJ == null ? C55372kJ.A03 : c55372kJ;
    }

    public EnumC53532h4 A0k() {
        EnumC53532h4 enumC53532h4;
        int i = this.A01;
        if (i == 0) {
            enumC53532h4 = EnumC53532h4.UNKNOWN;
        } else if (i != 1) {
            if (i == 2) {
                enumC53532h4 = EnumC53532h4.NATIVE_FLOW;
            }
            return EnumC53532h4.UNKNOWN;
        } else {
            enumC53532h4 = EnumC53532h4.RESPONSE;
        }
        if (enumC53532h4 != null) {
            return enumC53532h4;
        }
        return EnumC53532h4.UNKNOWN;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A04) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0A(2, A0i());
        }
        int i2 = this.A00;
        if ((i2 & 4) == 4) {
            A0B += C0RS.A04(3, this.A01);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A0A(4, A0j());
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0O(2, A0i());
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0I(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0O(4, A0j());
        }
        this.unknownFields.A02(c0rs);
    }
}
