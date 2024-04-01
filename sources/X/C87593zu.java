package X;

import java.io.IOException;

/* renamed from: X.3zu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87593zu extends C0AZ implements C0AY {
    public static final C87593zu A08;
    public static volatile C0RQ A09;
    public int A00;
    public int A02;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A03 = 1;
    public int A01 = 1;

    static {
        C87593zu c87593zu = new C87593zu();
        A08 = c87593zu;
        c87593zu.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC79223lI enumC79223lI;
        switch (c0rl.ordinal()) {
            case 0:
                return A08;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87593zu c87593zu = (C87593zu) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A03;
                int i3 = c87593zu.A00;
                this.A03 = c0rm.AW5(z, i2, (i3 & 1) == 1, c87593zu.A03);
                this.A07 = c0rm.AW5((i & 2) == 2, this.A07, (i3 & 2) == 2, c87593zu.A07);
                this.A06 = c0rm.AW5((i & 4) == 4, this.A06, (i3 & 4) == 4, c87593zu.A06);
                this.A02 = c0rm.AW5((i & 8) == 8, this.A02, (i3 & 8) == 8, c87593zu.A02);
                this.A04 = c0rm.AW5((i & 16) == 16, this.A04, (i3 & 16) == 16, c87593zu.A04);
                this.A05 = c0rm.AW5((i & 32) == 32, this.A05, (i3 & 32) == 32, c87593zu.A05);
                this.A01 = c0rm.AW5((i & 64) == 64, this.A01, (i3 & 64) == 64, c87593zu.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r8) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                int A02 = c0ro.A02();
                                if (EnumC79233lJ.A00(A02) == null) {
                                    super.A0F(1, A02);
                                } else {
                                    this.A00 |= 1;
                                    this.A03 = A02;
                                }
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A07 = c0ro.A02();
                            } else if (A03 == 24) {
                                this.A00 |= 4;
                                this.A06 = c0ro.A02();
                            } else if (A03 == 32) {
                                this.A00 |= 8;
                                this.A02 = c0ro.A02();
                            } else if (A03 == 40) {
                                this.A00 |= 16;
                                this.A04 = c0ro.A02();
                            } else if (A03 == 48) {
                                this.A00 |= 32;
                                this.A05 = c0ro.A02();
                            } else if (A03 != 56) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                int A022 = c0ro.A02();
                                if (A022 == 1) {
                                    enumC79223lI = EnumC79223lI.GREGORIAN;
                                } else {
                                    enumC79223lI = A022 != 2 ? null : EnumC79223lI.SOLAR_HIJRI;
                                }
                                if (enumC79223lI == null) {
                                    super.A0F(7, A022);
                                } else {
                                    this.A00 |= 64;
                                    this.A01 = A022;
                                }
                            }
                        }
                        r8 = true;
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
                return new C87593zu();
            case 5:
                return new C0CT() { // from class: X.3zt
                    {
                        C87593zu c87593zu2 = C87593zu.A08;
                    }
                };
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C87593zu.class) {
                        if (A09 == null) {
                            A09 = new C0RR(A08);
                        }
                    }
                }
                return A09;
            default:
                throw new UnsupportedOperationException();
        }
        return A08;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A04 = (i2 & 1) == 1 ? 0 + C0RS.A04(1, this.A03) : 0;
        if ((i2 & 2) == 2) {
            A04 += C0RS.A06(2, this.A07);
        }
        if ((i2 & 4) == 4) {
            A04 += C0RS.A06(3, this.A06);
        }
        if ((i2 & 8) == 8) {
            A04 += C0RS.A06(4, this.A02);
        }
        if ((i2 & 16) == 16) {
            A04 += C0RS.A06(5, this.A04);
        }
        if ((i2 & 32) == 32) {
            A04 += C0RS.A06(6, this.A05);
        }
        if ((i2 & 64) == 64) {
            A04 += C0RS.A04(7, this.A01);
        }
        int A00 = this.unknownFields.A00() + A04;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0I(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0K(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0K(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0K(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0K(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0I(7, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
