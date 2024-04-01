package X;

import java.io.IOException;

/* renamed from: X.2Ct  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47832Ct extends C0AZ implements C0AY {
    public static final C47832Ct A09;
    public static volatile C0RQ A0A;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A07 = "";
    public String A06 = "";
    public String A08 = "";

    static {
        C47832Ct c47832Ct = new C47832Ct();
        A09 = c47832Ct;
        c47832Ct.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC79103l5 enumC79103l5;
        EnumC79123l7 enumC79123l7;
        switch (c0rl.ordinal()) {
            case 0:
                return A09;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C47832Ct c47832Ct = (C47832Ct) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A07;
                int i2 = c47832Ct.A00;
                this.A07 = c0rm.AWD(z, str, (i2 & 1) == 1, c47832Ct.A07);
                this.A06 = c0rm.AWD((i & 2) == 2, this.A06, (i2 & 2) == 2, c47832Ct.A06);
                this.A04 = c0rm.AW5((i & 4) == 4, this.A04, (i2 & 4) == 4, c47832Ct.A04);
                this.A05 = c0rm.AW5((i & 8) == 8, this.A05, (i2 & 8) == 8, c47832Ct.A05);
                this.A03 = c0rm.AW5((i & 16) == 16, this.A03, (i2 & 16) == 16, c47832Ct.A03);
                this.A02 = c0rm.AW5((i & 32) == 32, this.A02, (i2 & 32) == 32, c47832Ct.A02);
                this.A01 = c0rm.AW5((i & 64) == 64, this.A01, (i2 & 64) == 64, c47832Ct.A01);
                this.A08 = c0rm.AWD((i & 128) == 128, this.A08, (i2 & 128) == 128, c47832Ct.A08);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r8) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 1;
                                this.A07 = A0A2;
                            } else if (A03 == 18) {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A06 = A0A3;
                            } else if (A03 == 24) {
                                this.A00 |= 4;
                                this.A04 = c0ro.A02();
                            } else if (A03 == 32) {
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC79123l7 = EnumC79123l7.TITLE;
                                } else if (A02 == 1) {
                                    enumC79123l7 = EnumC79123l7.CONTENT;
                                } else if (A02 != 2) {
                                    enumC79123l7 = A02 != 3 ? null : EnumC79123l7.BUTTON;
                                } else {
                                    enumC79123l7 = EnumC79123l7.FOOTER;
                                }
                                if (enumC79123l7 == null) {
                                    super.A0F(4, A02);
                                } else {
                                    this.A00 |= 8;
                                    this.A05 = A02;
                                }
                            } else if (A03 == 40) {
                                int A022 = c0ro.A02();
                                if (EnumC79113l6.A00(A022) == null) {
                                    super.A0F(5, A022);
                                } else {
                                    this.A00 |= 16;
                                    this.A03 = A022;
                                }
                            } else if (A03 == 48) {
                                this.A00 |= 32;
                                this.A02 = c0ro.A02();
                            } else if (A03 == 56) {
                                int A023 = c0ro.A02();
                                if (A023 == 0) {
                                    enumC79103l5 = EnumC79103l5.DISPLAY_TEXT;
                                } else if (A023 != 1) {
                                    enumC79103l5 = A023 != 2 ? null : EnumC79103l5.PHONE_NUMBER;
                                } else {
                                    enumC79103l5 = EnumC79103l5.URL;
                                }
                                if (enumC79103l5 == null) {
                                    super.A0F(7, A023);
                                } else {
                                    this.A00 |= 64;
                                    this.A01 = A023;
                                }
                            } else if (A03 != 66) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A08 = A0A4;
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
                return new C47832Ct();
            case 5:
                return new C0CT() { // from class: X.3zL
                    {
                        C47832Ct c47832Ct2 = C47832Ct.A09;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C47832Ct.class) {
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
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A07) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A06);
        }
        int i2 = this.A00;
        if ((i2 & 4) == 4) {
            A0B += C0RS.A06(3, this.A04);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A04(4, this.A05);
        }
        if ((i2 & 16) == 16) {
            A0B += C0RS.A04(5, this.A03);
        }
        if ((i2 & 32) == 32) {
            A0B += C0RS.A06(6, this.A02);
        }
        if ((i2 & 64) == 64) {
            A0B += C0RS.A04(7, this.A01);
        }
        if ((i2 & 128) == 128) {
            A0B += C0RS.A0B(8, this.A08);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0I(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0I(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0K(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0I(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A08);
        }
        this.unknownFields.A02(c0rs);
    }
}
