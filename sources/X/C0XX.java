package X;

import java.io.IOException;

/* renamed from: X.0XX */
/* loaded from: classes.dex */
public final class C0XX extends C0AZ implements C0AY {
    public static final C0XX A06;
    public static volatile C0RQ A07;
    public int A00;
    public int A01;
    public long A02;
    public C0AN A03;
    public C0AN A04;
    public C0AN A05;

    static {
        C0XX c0xx = new C0XX();
        A06 = c0xx;
        c0xx.A0E();
    }

    public C0XX() {
        C0AN c0an = C0AN.A01;
        this.A04 = c0an;
        this.A03 = c0an;
        this.A05 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C0XX c0xx = (C0XX) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c0xx.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c0xx.A01);
                this.A04 = c0rm.AW2((i & 2) == 2, this.A04, (i3 & 2) == 2, c0xx.A04);
                this.A03 = c0rm.AW2((this.A00 & 4) == 4, this.A03, (c0xx.A00 & 4) == 4, c0xx.A03);
                this.A05 = c0rm.AW2((this.A00 & 8) == 8, this.A05, (c0xx.A00 & 8) == 8, c0xx.A05);
                int i4 = this.A00;
                boolean z2 = (i4 & 16) == 16;
                long j = this.A02;
                int i5 = c0xx.A00;
                this.A02 = c0rm.AW8(z2, j, (i5 & 16) == 16, c0xx.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (true) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 == 0) {
                                break;
                            } else if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 18) {
                                this.A00 |= 2;
                                this.A04 = c0ro.A08();
                            } else if (A03 == 26) {
                                this.A00 |= 4;
                                this.A03 = c0ro.A08();
                            } else if (A03 == 34) {
                                this.A00 |= 8;
                                this.A05 = c0ro.A08();
                            } else if (A03 != 41) {
                                if (!A0I(A03, c0ro)) {
                                    break;
                                }
                            } else {
                                this.A00 |= 16;
                                this.A02 = c0ro.A05();
                            }
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
            case 3:
                return null;
            case 4:
                return new C0XX();
            case 5:
                return new C12550jf(null);
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C0XX.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A062 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A062 += C0RS.A09(2, this.A04);
        }
        if ((i2 & 4) == 4) {
            A062 += C0RS.A09(3, this.A03);
        }
        if ((i2 & 8) == 8) {
            A062 += C0RS.A09(4, this.A05);
        }
        if ((i2 & 16) == 16) {
            A062 += C0RS.A03(40) + 8;
        }
        int A00 = this.unknownFields.A00() + A062;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0L(5, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
