package X;

import java.io.IOException;

/* renamed from: X.400  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass400 extends C0AZ implements C0AY {
    public static final AnonymousClass400 A09;
    public static volatile C0RQ A0A;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C0AN A04;
    public C0AN A05;
    public C0AN A06;
    public String A07;
    public String A08;

    static {
        AnonymousClass400 anonymousClass400 = new AnonymousClass400();
        A09 = anonymousClass400;
        anonymousClass400.A0E();
    }

    public AnonymousClass400() {
        C0AN c0an = C0AN.A01;
        this.A05 = c0an;
        this.A06 = c0an;
        this.A04 = c0an;
        this.A07 = "";
        this.A08 = "";
    }

    public static void A09(AnonymousClass400 anonymousClass400, C0AN c0an) {
        anonymousClass400.A00 |= 1;
        anonymousClass400.A05 = c0an;
    }

    public static void A0A(AnonymousClass400 anonymousClass400, C0AN c0an) {
        anonymousClass400.A00 |= 4;
        anonymousClass400.A06 = c0an;
    }

    public static void A0B(AnonymousClass400 anonymousClass400, C0AN c0an) {
        anonymousClass400.A00 |= 8;
        anonymousClass400.A04 = c0an;
    }

    public static void A0C(AnonymousClass400 anonymousClass400, EnumC79243lL enumC79243lL) {
        if (enumC79243lL != null) {
            anonymousClass400.A00 |= 32;
            anonymousClass400.A02 = enumC79243lL.value;
            return;
        }
        throw null;
    }

    public static void A0D(AnonymousClass400 anonymousClass400, String str) {
        anonymousClass400.A00 |= 16;
        anonymousClass400.A07 = str;
    }

    public static void A0E(AnonymousClass400 anonymousClass400, String str) {
        if (str != null) {
            anonymousClass400.A00 |= 128;
            anonymousClass400.A08 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC79243lL enumC79243lL;
        switch (c0rl.ordinal()) {
            case 0:
                return A09;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass400 anonymousClass400 = (AnonymousClass400) obj2;
                this.A05 = c0rm.AW2((this.A00 & 1) == 1, this.A05, (anonymousClass400.A00 & 1) == 1, anonymousClass400.A05);
                int i = this.A00;
                boolean z = (i & 2) == 2;
                long j = this.A03;
                int i2 = anonymousClass400.A00;
                this.A03 = c0rm.AW8(z, j, (i2 & 2) == 2, anonymousClass400.A03);
                this.A06 = c0rm.AW2((i & 4) == 4, this.A06, (i2 & 4) == 4, anonymousClass400.A06);
                this.A04 = c0rm.AW2((this.A00 & 8) == 8, this.A04, (anonymousClass400.A00 & 8) == 8, anonymousClass400.A04);
                int i3 = this.A00;
                boolean z2 = (i3 & 16) == 16;
                String str = this.A07;
                int i4 = anonymousClass400.A00;
                this.A07 = c0rm.AWD(z2, str, (i4 & 16) == 16, anonymousClass400.A07);
                this.A02 = c0rm.AW5((i3 & 32) == 32, this.A02, (i4 & 32) == 32, anonymousClass400.A02);
                this.A01 = c0rm.AW5((i3 & 64) == 64, this.A01, (i4 & 64) == 64, anonymousClass400.A01);
                this.A08 = c0rm.AWD((i3 & 128) == 128, this.A08, (i4 & 128) == 128, anonymousClass400.A08);
                if (c0rm == C0RN.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                this.A00 |= 1;
                                this.A05 = c0ro.A08();
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A03 = c0ro.A06();
                            } else if (A03 == 26) {
                                this.A00 |= 4;
                                this.A06 = c0ro.A08();
                            } else if (A03 == 34) {
                                this.A00 |= 8;
                                this.A04 = c0ro.A08();
                            } else if (A03 == 42) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 16;
                                this.A07 = A0A2;
                            } else if (A03 == 48) {
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC79243lL = EnumC79243lL.INITIAL_BOOTSTRAP;
                                } else if (A02 == 1) {
                                    enumC79243lL = EnumC79243lL.INITIAL_STATUS_V3;
                                } else if (A02 == 2) {
                                    enumC79243lL = EnumC79243lL.FULL;
                                } else if (A02 != 3) {
                                    enumC79243lL = A02 != 4 ? null : EnumC79243lL.PUSH_NAME;
                                } else {
                                    enumC79243lL = EnumC79243lL.RECENT;
                                }
                                if (enumC79243lL == null) {
                                    super.A0F(6, A02);
                                } else {
                                    this.A00 |= 32;
                                    this.A02 = A02;
                                }
                            } else if (A03 == 56) {
                                this.A00 |= 64;
                                this.A01 = c0ro.A02();
                            } else if (A03 != 66) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A08 = A0A3;
                            }
                        }
                        z3 = true;
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
                return new AnonymousClass400();
            case 5:
                return new C0CT() { // from class: X.3zz
                    {
                        AnonymousClass400 anonymousClass4002 = AnonymousClass400.A09;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (AnonymousClass400.class) {
                        if (A0A == null) {
                            A0A = new C0RR(A09);
                        }
                    }
                }
                return A0A;
            default:
                throw new UnsupportedOperationException();
        }
        return A09;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A092 = (i2 & 1) == 1 ? 0 + C0RS.A09(1, this.A05) : 0;
        if ((i2 & 2) == 2) {
            A092 += C0RS.A08(2, this.A03);
        }
        if ((i2 & 4) == 4) {
            A092 += C0RS.A09(3, this.A06);
        }
        if ((i2 & 8) == 8) {
            A092 += C0RS.A09(4, this.A04);
        }
        if ((i2 & 16) == 16) {
            A092 += C0RS.A0B(5, this.A07);
        }
        int i3 = this.A00;
        if ((i3 & 32) == 32) {
            A092 += C0RS.A04(6, this.A02);
        }
        if ((i3 & 64) == 64) {
            A092 += C0RS.A06(7, this.A01);
        }
        if ((i3 & 128) == 128) {
            A092 += C0RS.A0B(8, this.A08);
        }
        int A00 = this.unknownFields.A00() + A092;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A05);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A04);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(5, this.A07);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0I(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0K(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A08);
        }
        this.unknownFields.A02(c0rs);
    }
}
