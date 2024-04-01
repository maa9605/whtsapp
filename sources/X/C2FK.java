package X;

import java.io.IOException;

/* renamed from: X.2FK  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2FK extends C0AZ implements C0AY {
    public static final C2FK A06;
    public static volatile C0RQ A07;
    public int A00;
    public int A02;
    public C40521sP A03;
    public Object A04;
    public int A01 = 0;
    public String A05 = "";

    static {
        C2FK c2fk = new C2FK();
        A06 = c2fk;
        c2fk.A0E();
    }

    public static void A09(C2FK c2fk, C40521sP c40521sP) {
        if (c40521sP != null) {
            c2fk.A03 = c40521sP;
            c2fk.A00 |= 4;
            return;
        }
        throw null;
    }

    public static void A0A(C2FK c2fk, EnumC55272k9 enumC55272k9) {
        c2fk.A00 |= 8;
        c2fk.A02 = enumC55272k9.value;
    }

    public static void A0B(C2FK c2fk, String str) {
        if (str != null) {
            c2fk.A00 |= 1;
            c2fk.A05 = str;
            return;
        }
        throw null;
    }

    public static void A0C(C2FK c2fk, String str) {
        if (str != null) {
            c2fk.A01 = 2;
            c2fk.A04 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC55272k9 enumC55272k9;
        C87333zU c87333zU;
        EnumC79183lE enumC79183lE = null;
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2FK c2fk = (C2FK) obj2;
                this.A05 = c0rm.AWD((this.A00 & 1) == 1, this.A05, (c2fk.A00 & 1) == 1, c2fk.A05);
                this.A03 = (C40521sP) c0rm.AW9(this.A03, c2fk.A03);
                this.A02 = c0rm.AW5((this.A00 & 8) == 8, this.A02, (c2fk.A00 & 8) == 8, c2fk.A02);
                int i = c2fk.A01;
                if (i == 0) {
                    enumC79183lE = EnumC79183lE.RESPONSE_NOT_SET;
                } else if (i == 2) {
                    enumC79183lE = EnumC79183lE.SELECTED_DISPLAY_TEXT;
                }
                int ordinal = enumC79183lE.ordinal();
                if (ordinal == 0) {
                    this.A04 = c0rm.AWC(this.A01 == 2, this.A04, c2fk.A04);
                } else if (ordinal == 1) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i2 = c2fk.A01;
                    if (i2 != 0) {
                        this.A01 = i2;
                    }
                    this.A00 |= c2fk.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r4) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A05 = A0A;
                            } else if (A03 == 18) {
                                String A0A2 = c0ro.A0A();
                                this.A01 = 2;
                                this.A04 = A0A2;
                            } else if (A03 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    c87333zU = (C87333zU) this.A03.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A03 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A03 = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 4;
                            } else if (A03 != 32) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC55272k9 = EnumC55272k9.UNKNOWN;
                                } else {
                                    enumC55272k9 = A02 != 1 ? null : EnumC55272k9.DISPLAY_TEXT;
                                }
                                if (enumC55272k9 == null) {
                                    super.A0F(4, A02);
                                } else {
                                    this.A00 |= 8;
                                    this.A02 = A02;
                                }
                            }
                        }
                        r4 = true;
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
                return new C2FK();
            case 5:
                return new C0CT() { // from class: X.2FJ
                    {
                        C2FK c2fk2 = C2FK.A06;
                    }
                };
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C2FK.class) {
                        if (A07 == null) {
                            A07 = new C0RR(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A03;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    public String A0j() {
        return this.A01 == 2 ? (String) this.A04 : "";
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A05) : 0;
        if (this.A01 == 2) {
            A0B += C0RS.A0B(2, A0j());
        }
        if ((this.A00 & 4) == 4) {
            A0B += C0RS.A0A(3, A0i());
        }
        if ((this.A00 & 8) == 8) {
            A0B += C0RS.A04(4, this.A02);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A05);
        }
        if (this.A01 == 2) {
            c0rs.A0P(2, A0j());
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(3, A0i());
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0I(4, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
