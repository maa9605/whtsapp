package X;

import java.io.IOException;

/* renamed from: X.2h7  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C53552h7 extends C0AZ implements C0AY {
    public static final C53552h7 A09;
    public static volatile C0RQ A0A;
    public int A00;
    public C0AN A01;
    public C0AN A02;
    public C0AN A03;
    public C0AN A04;
    public C0AN A05;
    public C0AN A06;
    public C0AN A07;
    public C0AN A08;

    static {
        C53552h7 c53552h7 = new C53552h7();
        A09 = c53552h7;
        c53552h7.A0E();
    }

    public C53552h7() {
        C0AN c0an = C0AN.A01;
        this.A05 = c0an;
        this.A04 = c0an;
        this.A03 = c0an;
        this.A06 = c0an;
        this.A08 = c0an;
        this.A07 = c0an;
        this.A01 = c0an;
        this.A02 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A09;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C53552h7 c53552h7 = (C53552h7) obj2;
                this.A05 = c0rm.AW2((this.A00 & 1) == 1, this.A05, (c53552h7.A00 & 1) == 1, c53552h7.A05);
                this.A04 = c0rm.AW2((this.A00 & 2) == 2, this.A04, (c53552h7.A00 & 2) == 2, c53552h7.A04);
                this.A03 = c0rm.AW2((this.A00 & 4) == 4, this.A03, (c53552h7.A00 & 4) == 4, c53552h7.A03);
                this.A06 = c0rm.AW2((this.A00 & 8) == 8, this.A06, (c53552h7.A00 & 8) == 8, c53552h7.A06);
                this.A08 = c0rm.AW2((this.A00 & 16) == 16, this.A08, (c53552h7.A00 & 16) == 16, c53552h7.A08);
                this.A07 = c0rm.AW2((this.A00 & 32) == 32, this.A07, (c53552h7.A00 & 32) == 32, c53552h7.A07);
                this.A01 = c0rm.AW2((this.A00 & 64) == 64, this.A01, (c53552h7.A00 & 64) == 64, c53552h7.A01);
                this.A02 = c0rm.AW2((this.A00 & 128) == 128, this.A02, (c53552h7.A00 & 128) == 128, c53552h7.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c53552h7.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    this.A00 |= 1;
                                    this.A05 = c0ro.A08();
                                } else if (A03 == 18) {
                                    this.A00 |= 2;
                                    this.A04 = c0ro.A08();
                                } else if (A03 == 26) {
                                    this.A00 |= 4;
                                    this.A03 = c0ro.A08();
                                } else if (A03 == 34) {
                                    this.A00 |= 8;
                                    this.A06 = c0ro.A08();
                                } else if (A03 == 42) {
                                    this.A00 |= 16;
                                    this.A08 = c0ro.A08();
                                } else if (A03 == 50) {
                                    this.A00 |= 32;
                                    this.A07 = c0ro.A08();
                                } else if (A03 == 58) {
                                    this.A00 |= 64;
                                    this.A01 = c0ro.A08();
                                } else if (A03 != 66) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 128;
                                    this.A02 = c0ro.A08();
                                }
                            }
                            r6 = true;
                        } catch (C0JX e) {
                            e.unfinishedMessage = this;
                            throw new RuntimeException(e);
                        }
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
                return new C53552h7();
            case 5:
                return new C0CT() { // from class: X.2hJ
                    {
                        C53552h7 c53552h72 = C53552h7.A09;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C53552h7.class) {
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
            A092 += C0RS.A09(2, this.A04);
        }
        if ((i2 & 4) == 4) {
            A092 += C0RS.A09(3, this.A03);
        }
        if ((i2 & 8) == 8) {
            A092 += C0RS.A09(4, this.A06);
        }
        if ((i2 & 16) == 16) {
            A092 += C0RS.A09(5, this.A08);
        }
        if ((i2 & 32) == 32) {
            A092 += C0RS.A09(6, this.A07);
        }
        if ((i2 & 64) == 64) {
            A092 += C0RS.A09(7, this.A01);
        }
        if ((i2 & 128) == 128) {
            A092 += C0RS.A09(8, this.A02);
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
            c0rs.A0N(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0N(5, this.A08);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0N(6, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0N(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0N(8, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
