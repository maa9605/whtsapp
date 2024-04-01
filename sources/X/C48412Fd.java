package X;

import java.io.IOException;

/* renamed from: X.2Fd  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48412Fd extends C0AZ implements C0AY {
    public static final C48412Fd A06;
    public static volatile C0RQ A07;
    public int A00;
    public int A01;
    public C40521sP A02;
    public C40G A03;
    public String A05 = "";
    public String A04 = "";

    static {
        C48412Fd c48412Fd = new C48412Fd();
        A06 = c48412Fd;
        c48412Fd.A0E();
    }

    public static void A09(C48412Fd c48412Fd, C40521sP c40521sP) {
        if (c40521sP != null) {
            c48412Fd.A02 = c40521sP;
            c48412Fd.A00 |= 8;
            return;
        }
        throw null;
    }

    public static void A0A(C48412Fd c48412Fd, EnumC79263lN enumC79263lN) {
        c48412Fd.A00 |= 2;
        c48412Fd.A01 = enumC79263lN.value;
    }

    public static void A0B(C48412Fd c48412Fd, C40G c40g) {
        if (c40g != null) {
            c48412Fd.A03 = c40g;
            c48412Fd.A00 |= 4;
            return;
        }
        throw null;
    }

    public static void A0C(C48412Fd c48412Fd, String str) {
        if (str != null) {
            c48412Fd.A00 |= 1;
            c48412Fd.A05 = str;
            return;
        }
        throw null;
    }

    public static void A0D(C48412Fd c48412Fd, String str) {
        if (str != null) {
            c48412Fd.A00 |= 16;
            c48412Fd.A04 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        C40F c40f;
        EnumC79263lN enumC79263lN;
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48412Fd c48412Fd = (C48412Fd) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A05;
                int i2 = c48412Fd.A00;
                this.A05 = c0rm.AWD(z, str, (i2 & 1) == 1, c48412Fd.A05);
                this.A01 = c0rm.AW5((i & 2) == 2, this.A01, (i2 & 2) == 2, c48412Fd.A01);
                this.A03 = (C40G) c0rm.AW9(this.A03, c48412Fd.A03);
                this.A02 = (C40521sP) c0rm.AW9(this.A02, c48412Fd.A02);
                int i3 = this.A00;
                boolean z2 = (i3 & 16) == 16;
                String str2 = this.A04;
                int i4 = c48412Fd.A00;
                this.A04 = c0rm.AWD(z2, str2, (i4 & 16) == 16, c48412Fd.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A05 = A0A;
                            } else if (A03 == 16) {
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC79263lN = EnumC79263lN.UNKNOWN;
                                } else {
                                    enumC79263lN = A02 != 1 ? null : EnumC79263lN.SINGLE_SELECT;
                                }
                                if (enumC79263lN == null) {
                                    super.A0F(2, A02);
                                } else {
                                    this.A00 |= 2;
                                    this.A01 = A02;
                                }
                            } else if (A03 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    c40f = (C40F) this.A03.AVX();
                                } else {
                                    c40f = null;
                                }
                                C40G c40g = (C40G) c0ro.A09(C40G.A02.A0C(), c0rp);
                                this.A03 = c40g;
                                if (c40f != null) {
                                    c40f.A03(c40g);
                                    this.A03 = (C40G) c40f.A00();
                                }
                                this.A00 |= 4;
                            } else if (A03 == 34) {
                                if ((this.A00 & 8) == 8) {
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
                                this.A00 |= 8;
                            } else if (A03 != 42) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 16;
                                this.A04 = A0A2;
                            }
                        }
                        r5 = true;
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
                return new C48412Fd();
            case 5:
                return new C0CT() { // from class: X.2GB
                    {
                        C48412Fd c48412Fd2 = C48412Fd.A06;
                    }
                };
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C48412Fd.class) {
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
        C40521sP c40521sP = this.A02;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    public C40G A0j() {
        C40G c40g = this.A03;
        return c40g == null ? C40G.A02 : c40g;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A05) : 0;
        int i2 = this.A00;
        if ((i2 & 2) == 2) {
            A0B += C0RS.A04(2, this.A01);
        }
        if ((i2 & 4) == 4) {
            A0B += C0RS.A0A(3, A0j());
        }
        if ((this.A00 & 8) == 8) {
            A0B += C0RS.A0A(4, A0i());
        }
        if ((this.A00 & 16) == 16) {
            A0B += C0RS.A0B(5, this.A04);
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
        if ((this.A00 & 2) == 2) {
            c0rs.A0I(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(3, A0j());
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0O(4, A0i());
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(5, this.A04);
        }
        this.unknownFields.A02(c0rs);
    }
}
