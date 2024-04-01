package X;

import java.io.IOException;

/* renamed from: X.1sT  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40561sT extends C0AZ implements C0AY {
    public static final C40561sT A0A;
    public static volatile C0RQ A0B;
    public int A00;
    public int A01;
    public String A09 = "";
    public String A03 = "";
    public String A08 = "";
    public String A04 = "";
    public C0AN A02 = C0AN.A01;
    public String A06 = "";
    public String A05 = "";
    public String A07 = "";

    static {
        C40561sT c40561sT = new C40561sT();
        A0A = c40561sT;
        c40561sT.A0E();
    }

    public static void A09(C40561sT c40561sT, C0AN c0an) {
        c40561sT.A00 |= 32;
        c40561sT.A02 = c0an;
    }

    public static void A0A(C40561sT c40561sT, EnumC40571sU enumC40571sU) {
        if (enumC40571sU != null) {
            c40561sT.A00 |= 4;
            c40561sT.A01 = enumC40571sU.value;
            return;
        }
        throw null;
    }

    public static void A0B(C40561sT c40561sT, String str) {
        if (str != null) {
            c40561sT.A00 |= 1;
            c40561sT.A09 = str;
            return;
        }
        throw null;
    }

    public static void A0C(C40561sT c40561sT, String str) {
        if (str != null) {
            c40561sT.A00 |= 2;
            c40561sT.A03 = str;
            return;
        }
        throw null;
    }

    public static void A0D(C40561sT c40561sT, String str) {
        if (str != null) {
            c40561sT.A00 |= 8;
            c40561sT.A08 = str;
            return;
        }
        throw null;
    }

    public static void A0E(C40561sT c40561sT, String str) {
        if (str != null) {
            c40561sT.A00 |= 16;
            c40561sT.A04 = str;
            return;
        }
        throw null;
    }

    public static void A0F(C40561sT c40561sT, String str) {
        if (str != null) {
            c40561sT.A00 |= 64;
            c40561sT.A06 = str;
            return;
        }
        throw null;
    }

    public static void A0G(C40561sT c40561sT, String str) {
        if (str != null) {
            c40561sT.A00 |= 128;
            c40561sT.A05 = str;
            return;
        }
        throw null;
    }

    public static void A0H(C40561sT c40561sT, String str) {
        if (str != null) {
            c40561sT.A00 |= 256;
            c40561sT.A07 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A0A;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40561sT c40561sT = (C40561sT) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A09;
                int i2 = c40561sT.A00;
                this.A09 = c0rm.AWD(z, str, (i2 & 1) == 1, c40561sT.A09);
                this.A03 = c0rm.AWD((i & 2) == 2, this.A03, (i2 & 2) == 2, c40561sT.A03);
                this.A01 = c0rm.AW5((i & 4) == 4, this.A01, (i2 & 4) == 4, c40561sT.A01);
                this.A08 = c0rm.AWD((i & 8) == 8, this.A08, (i2 & 8) == 8, c40561sT.A08);
                this.A04 = c0rm.AWD((i & 16) == 16, this.A04, (i2 & 16) == 16, c40561sT.A04);
                this.A02 = c0rm.AW2((i & 32) == 32, this.A02, (i2 & 32) == 32, c40561sT.A02);
                int i3 = this.A00;
                boolean z2 = (i3 & 64) == 64;
                String str2 = this.A06;
                int i4 = c40561sT.A00;
                this.A06 = c0rm.AWD(z2, str2, (i4 & 64) == 64, c40561sT.A06);
                this.A05 = c0rm.AWD((i3 & 128) == 128, this.A05, (i4 & 128) == 128, c40561sT.A05);
                this.A07 = c0rm.AWD((i3 & 256) == 256, this.A07, (i4 & 256) == 256, c40561sT.A07);
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
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 1;
                                this.A09 = A0A2;
                            } else if (A03 == 18) {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A3;
                            } else if (A03 == 24) {
                                int A02 = c0ro.A02();
                                if (EnumC40571sU.A00(A02) == null) {
                                    super.A0F(3, A02);
                                } else {
                                    this.A00 |= 4;
                                    this.A01 = A02;
                                }
                            } else if (A03 == 34) {
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 8;
                                this.A08 = A0A4;
                            } else if (A03 == 42) {
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 16;
                                this.A04 = A0A5;
                            } else if (A03 == 50) {
                                this.A00 |= 32;
                                this.A02 = c0ro.A08();
                            } else if (A03 == 58) {
                                String A0A6 = c0ro.A0A();
                                this.A00 |= 64;
                                this.A06 = A0A6;
                            } else if (A03 == 66) {
                                String A0A7 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A05 = A0A7;
                            } else if (A03 != 74) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                String A0A8 = c0ro.A0A();
                                this.A00 |= 256;
                                this.A07 = A0A8;
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
                return new C40561sT();
            case 5:
                return new C0CT() { // from class: X.3zV
                    {
                        C40561sT c40561sT2 = C40561sT.A0A;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0B == null) {
                    synchronized (C40561sT.class) {
                        if (A0B == null) {
                            A0B = new C0RR(A0A);
                        }
                    }
                }
                return A0B;
            default:
                throw new UnsupportedOperationException();
        }
        return A0A;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B2 = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A09) : 0;
        if ((this.A00 & 2) == 2) {
            A0B2 += C0RS.A0B(2, this.A03);
        }
        int i2 = this.A00;
        if ((i2 & 4) == 4) {
            A0B2 += C0RS.A04(3, this.A01);
        }
        if ((i2 & 8) == 8) {
            A0B2 += C0RS.A0B(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            A0B2 += C0RS.A0B(5, this.A04);
        }
        int i3 = this.A00;
        if ((i3 & 32) == 32) {
            A0B2 += C0RS.A09(6, this.A02);
        }
        if ((i3 & 64) == 64) {
            A0B2 += C0RS.A0B(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            A0B2 += C0RS.A0B(8, this.A05);
        }
        if ((this.A00 & 256) == 256) {
            A0B2 += C0RS.A0B(9, this.A07);
        }
        int A00 = this.unknownFields.A00() + A0B2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0I(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0N(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0P(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A05);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0P(9, this.A07);
        }
        this.unknownFields.A02(c0rs);
    }
}
