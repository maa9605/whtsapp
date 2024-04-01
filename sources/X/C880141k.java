package X;

import java.io.IOException;

/* renamed from: X.41k */
/* loaded from: classes2.dex */
public final class C880141k extends C0AZ implements C0AY {
    public static final C880141k A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public int A02;
    public C0AN A03;
    public C0AN A04;

    static {
        C880141k c880141k = new C880141k();
        A05 = c880141k;
        c880141k.A0E();
    }

    public C880141k() {
        C0AN c0an = C0AN.A01;
        this.A04 = c0an;
        this.A03 = c0an;
    }

    public static void A09(C880141k c880141k, C0AN c0an) {
        c880141k.A00 |= 1;
        c880141k.A04 = c0an;
    }

    public static void A0A(C880141k c880141k, C0AN c0an) {
        c880141k.A00 |= 8;
        c880141k.A03 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C880141k c880141k = (C880141k) obj2;
                this.A04 = c0rm.AW2(A0k(), this.A04, c880141k.A0k(), c880141k.A04);
                this.A01 = c0rm.AW5(A0j(), this.A01, c880141k.A0j(), c880141k.A01);
                this.A02 = c0rm.AW5((this.A00 & 4) == 4, this.A02, (c880141k.A00 & 4) == 4, c880141k.A02);
                this.A03 = c0rm.AW2(A0i(), this.A03, c880141k.A0i(), c880141k.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c880141k.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r4) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    this.A00 |= 1;
                                    this.A04 = c0ro.A08();
                                } else if (A03 == 16) {
                                    this.A00 |= 2;
                                    this.A01 = c0ro.A02();
                                } else if (A03 == 24) {
                                    this.A00 |= 4;
                                    this.A02 = c0ro.A02();
                                } else if (A03 != 34) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 8;
                                    this.A03 = c0ro.A08();
                                }
                            }
                            r4 = true;
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
                return new C880141k();
            case 5:
                return new C880041j(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C880141k.class) {
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

    public boolean A0i() {
        return (this.A00 & 8) == 8;
    }

    public boolean A0j() {
        return (this.A00 & 2) == 2;
    }

    public boolean A0k() {
        return (this.A00 & 1) == 1;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A09 = (i2 & 1) == 1 ? 0 + C0RS.A09(1, this.A04) : 0;
        if ((i2 & 2) == 2) {
            A09 += C0RS.A06(2, this.A01);
        }
        if ((i2 & 4) == 4) {
            A09 += C0RS.A06(3, this.A02);
        }
        if ((i2 & 8) == 8) {
            A09 += C0RS.A09(4, this.A03);
        }
        int A00 = this.unknownFields.A00() + A09;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0K(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
