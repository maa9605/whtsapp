package X;

import java.io.IOException;

/* renamed from: X.2kN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55412kN extends C0AZ implements C0AY {
    public static final C55412kN A05;
    public static volatile C0RQ A06;
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;

    static {
        C55412kN c55412kN = new C55412kN();
        A05 = c55412kN;
        c55412kN.A0E();
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A02;
        int A052 = (i2 & 1) == 1 ? 0 + C0RS.A05(1, this.A03) : 0;
        if ((i2 & 2) == 2) {
            A052 += C0RS.A05(2, this.A04);
        }
        if ((i2 & 4) == 4) {
            A052 += C0RS.A01(3);
        }
        if ((i2 & 8) == 8) {
            A052 += C0RS.A01(4);
        }
        int A00 = this.unknownFields.A00() + A052;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A02 & 1) == 1) {
            c0rs.A0I(1, this.A03);
        }
        if ((this.A02 & 2) == 2) {
            c0rs.A0I(2, this.A04);
        }
        if ((this.A02 & 4) == 4) {
            c0rs.A0G(3, this.A00);
        }
        if ((this.A02 & 8) == 8) {
            c0rs.A0G(4, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C55412kN c55412kN = (C55412kN) obj2;
                int i = this.A02;
                boolean z2 = (i & 1) == 1;
                int i2 = this.A03;
                int i3 = c55412kN.A02;
                this.A03 = c0rm.AW5(z2, i2, (i3 & 1) == 1, c55412kN.A03);
                this.A04 = c0rm.AW5((i & 2) == 2, this.A04, (i3 & 2) == 2, c55412kN.A04);
                this.A00 = c0rm.AW3((i & 4) == 4, this.A00, (i3 & 4) == 4, c55412kN.A00);
                this.A01 = c0rm.AW3((i & 8) == 8, this.A01, (i3 & 8) == 8, c55412kN.A01);
                if (c0rm == C0RN.A00) {
                    this.A02 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!z) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 8) {
                                    this.A02 |= 1;
                                    this.A03 = c0ro.A02();
                                } else if (A03 == 16) {
                                    this.A02 |= 2;
                                    this.A04 = c0ro.A02();
                                } else if (A03 == 25) {
                                    this.A02 |= 4;
                                    this.A00 = Double.longBitsToDouble(c0ro.A05());
                                } else if (A03 == 33) {
                                    this.A02 |= 8;
                                    this.A01 = Double.longBitsToDouble(c0ro.A05());
                                } else if (!A0I(A03, c0ro)) {
                                }
                            }
                            z = true;
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
                return new C55412kN();
            case 5:
                return new C0CT() { // from class: X.40N
                    {
                        C55412kN c55412kN2 = C55412kN.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C55412kN.class) {
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
}
