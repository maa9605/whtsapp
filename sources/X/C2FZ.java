package X;

import java.io.IOException;

/* renamed from: X.2FZ  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2FZ extends C0AZ implements C0AY {
    public static final C2FZ A08;
    public static volatile C0RQ A09;
    public int A00;
    public long A01;
    public C40521sP A03;
    public String A05 = "";
    public String A07 = "";
    public String A06 = "";
    public C0AN A02 = C0AN.A01;
    public String A04 = "";

    static {
        C2FZ c2fz = new C2FZ();
        A08 = c2fz;
        c2fz.A0E();
    }

    public static void A09(C2FZ c2fz, C0AN c0an) {
        c2fz.A00 |= 16;
        c2fz.A02 = c0an;
    }

    public static void A0A(C2FZ c2fz, C40521sP c40521sP) {
        if (c40521sP != null) {
            c2fz.A03 = c40521sP;
            c2fz.A00 |= 64;
            return;
        }
        throw null;
    }

    public static void A0B(C2FZ c2fz, String str) {
        if (str != null) {
            c2fz.A00 |= 1;
            c2fz.A05 = str;
            return;
        }
        throw null;
    }

    public static void A0C(C2FZ c2fz, String str) {
        c2fz.A00 |= 2;
        c2fz.A07 = str;
    }

    public static void A0D(C2FZ c2fz, String str) {
        c2fz.A00 |= 8;
        c2fz.A06 = str;
    }

    public static void A0E(C2FZ c2fz, String str) {
        if (str != null) {
            c2fz.A00 |= 32;
            c2fz.A04 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        switch (c0rl.ordinal()) {
            case 0:
                return A08;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2FZ c2fz = (C2FZ) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A05;
                int i2 = c2fz.A00;
                this.A05 = c0rm.AWD(z, str, (i2 & 1) == 1, c2fz.A05);
                this.A07 = c0rm.AWD((i & 2) == 2, this.A07, (i2 & 2) == 2, c2fz.A07);
                this.A01 = c0rm.AW8((i & 4) == 4, this.A01, (i2 & 4) == 4, c2fz.A01);
                this.A06 = c0rm.AWD((i & 8) == 8, this.A06, (i2 & 8) == 8, c2fz.A06);
                this.A02 = c0rm.AW2((i & 16) == 16, this.A02, (i2 & 16) == 16, c2fz.A02);
                this.A04 = c0rm.AWD((this.A00 & 32) == 32, this.A04, (c2fz.A00 & 32) == 32, c2fz.A04);
                this.A03 = (C40521sP) c0rm.AW9(this.A03, c2fz.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2fz.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r6) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A05 = A0A;
                            } else if (A03 == 18) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A07 = A0A2;
                            } else if (A03 == 24) {
                                this.A00 |= 4;
                                this.A01 = c0ro.A06();
                            } else if (A03 == 34) {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 8;
                                this.A06 = A0A3;
                            } else if (A03 == 42) {
                                this.A00 |= 16;
                                this.A02 = c0ro.A08();
                            } else if (A03 == 50) {
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 32;
                                this.A04 = A0A4;
                            } else if (A03 != 58) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 64) == 64) {
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
                                this.A00 |= 64;
                            }
                        }
                        r6 = true;
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
                return new C2FZ();
            case 5:
                return new C0CT() { // from class: X.2FY
                    {
                        C2FZ c2fz2 = C2FZ.A08;
                    }
                };
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C2FZ.class) {
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

    public C40521sP A0i() {
        C40521sP c40521sP = this.A03;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A05) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A07);
        }
        int i2 = this.A00;
        if ((i2 & 4) == 4) {
            A0B += C0RS.A07(3, this.A01);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A0B(4, this.A06);
        }
        int i3 = this.A00;
        if ((i3 & 16) == 16) {
            A0B += C0RS.A09(5, this.A02);
        }
        if ((i3 & 32) == 32) {
            A0B += C0RS.A0B(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            A0B += C0RS.A0A(7, A0i());
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
            c0rs.A0P(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0M(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0N(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0O(7, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
