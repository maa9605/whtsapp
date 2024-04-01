package X;

import java.io.IOException;

/* renamed from: X.24M  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C24M extends C0AZ implements C0AY {
    public static final C24M A07;
    public static volatile C0RQ A08;
    public int A00;
    public long A01;
    public C0AN A02;
    public C0AN A03;
    public C0AN A04;
    public String A05;
    public String A06;

    static {
        C24M c24m = new C24M();
        A07 = c24m;
        c24m.A0E();
    }

    public C24M() {
        C0AN c0an = C0AN.A01;
        this.A04 = c0an;
        this.A05 = "";
        this.A06 = "";
        this.A03 = c0an;
        this.A02 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A07;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24M c24m = (C24M) obj2;
                this.A04 = c0rm.AW2((this.A00 & 1) == 1, this.A04, (c24m.A00 & 1) == 1, c24m.A04);
                int i = this.A00;
                boolean z = (i & 2) == 2;
                String str = this.A05;
                int i2 = c24m.A00;
                this.A05 = c0rm.AWD(z, str, (i2 & 2) == 2, c24m.A05);
                this.A06 = c0rm.AWD((i & 4) == 4, this.A06, (i2 & 4) == 4, c24m.A06);
                this.A01 = c0rm.AW8((i & 8) == 8, this.A01, (i2 & 8) == 8, c24m.A01);
                this.A03 = c0rm.AW2((i & 16) == 16, this.A03, (i2 & 16) == 16, c24m.A03);
                this.A02 = c0rm.AW2((this.A00 & 32) == 32, this.A02, (c24m.A00 & 32) == 32, c24m.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c24m.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                this.A00 |= 1;
                                this.A04 = c0ro.A08();
                            } else if (A03 == 18) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 2;
                                this.A05 = A0A;
                            } else if (A03 == 26) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 4;
                                this.A06 = A0A2;
                            } else if (A03 == 32) {
                                this.A00 |= 8;
                                this.A01 = c0ro.A06();
                            } else if (A03 == 42) {
                                this.A00 |= 16;
                                this.A03 = c0ro.A08();
                            } else if (A03 != 50) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 32;
                                this.A02 = c0ro.A08();
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
                return new C24M();
            case 5:
                return new C0CT() { // from class: X.40Z
                    {
                        C24M c24m2 = C24M.A07;
                    }
                };
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C24M.class) {
                        if (A08 == null) {
                            A08 = new C0RR(A07);
                        }
                    }
                }
                return A08;
            default:
                throw new UnsupportedOperationException();
        }
        return A07;
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
            A09 += C0RS.A0B(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            A09 += C0RS.A0B(3, this.A06);
        }
        int i3 = this.A00;
        if ((i3 & 8) == 8) {
            A09 += C0RS.A08(4, this.A01);
        }
        if ((i3 & 16) == 16) {
            A09 += C0RS.A09(5, this.A03);
        }
        if ((i3 & 32) == 32) {
            A09 += C0RS.A09(6, this.A02);
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
            c0rs.A0P(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0M(4, this.A01);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0N(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0N(6, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
