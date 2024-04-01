package X;

import java.io.IOException;

/* renamed from: X.3dz */
/* loaded from: classes2.dex */
public final class C74873dz extends C0AZ implements C0AY {
    public static final C74873dz A08;
    public static volatile C0RQ A09;
    public int A00;
    public int A01;
    public C0AN A02;
    public C0AN A03;
    public C0AN A04;
    public C0AN A05;
    public C0AN A06;
    public C0AN A07;

    static {
        C74873dz c74873dz = new C74873dz();
        A08 = c74873dz;
        c74873dz.A0E();
    }

    public C74873dz() {
        C0AN c0an = C0AN.A01;
        this.A03 = c0an;
        this.A02 = c0an;
        this.A07 = c0an;
        this.A06 = c0an;
        this.A05 = c0an;
        this.A04 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A08;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C74873dz c74873dz = (C74873dz) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c74873dz.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c74873dz.A01);
                this.A03 = c0rm.AW2((i & 2) == 2, this.A03, (i3 & 2) == 2, c74873dz.A03);
                this.A02 = c0rm.AW2((this.A00 & 4) == 4, this.A02, (c74873dz.A00 & 4) == 4, c74873dz.A02);
                this.A07 = c0rm.AW2((this.A00 & 8) == 8, this.A07, (c74873dz.A00 & 8) == 8, c74873dz.A07);
                this.A06 = c0rm.AW2((this.A00 & 16) == 16, this.A06, (c74873dz.A00 & 16) == 16, c74873dz.A06);
                this.A05 = c0rm.AW2((this.A00 & 32) == 32, this.A05, (c74873dz.A00 & 32) == 32, c74873dz.A05);
                this.A04 = c0rm.AW2((this.A00 & 64) == 64, this.A04, (c74873dz.A00 & 64) == 64, c74873dz.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c74873dz.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 18) {
                                this.A00 |= 2;
                                this.A03 = c0ro.A08();
                            } else if (A03 == 26) {
                                this.A00 |= 4;
                                this.A02 = c0ro.A08();
                            } else if (A03 == 34) {
                                this.A00 |= 8;
                                this.A07 = c0ro.A08();
                            } else if (A03 == 42) {
                                this.A00 |= 16;
                                this.A06 = c0ro.A08();
                            } else if (A03 == 58) {
                                this.A00 |= 32;
                                this.A05 = c0ro.A08();
                            } else if (A03 != 66) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 64;
                                this.A04 = c0ro.A08();
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
                return new C74873dz();
            case 5:
                return new C74883e0(null);
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C74873dz.class) {
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
        int A06 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A06 += C0RS.A09(2, this.A03);
        }
        if ((i2 & 4) == 4) {
            A06 += C0RS.A09(3, this.A02);
        }
        if ((i2 & 8) == 8) {
            A06 += C0RS.A09(4, this.A07);
        }
        if ((i2 & 16) == 16) {
            A06 += C0RS.A09(5, this.A06);
        }
        if ((i2 & 32) == 32) {
            A06 += C0RS.A09(7, this.A05);
        }
        if ((i2 & 64) == 64) {
            A06 += C0RS.A09(8, this.A04);
        }
        int A00 = this.unknownFields.A00() + A06;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A07);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0N(5, this.A06);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0N(7, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0N(8, this.A04);
        }
        this.unknownFields.A02(c0rs);
    }
}
