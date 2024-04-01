package X;

import java.io.IOException;

/* renamed from: X.2iK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54232iK extends C0AZ implements C0AY {
    public static final C54232iK A06;
    public static volatile C0RQ A07;
    public int A00;
    public int A01;
    public long A02;
    public String A04 = "";
    public String A05 = "";
    public C0AN A03 = C0AN.A01;

    static {
        C54232iK c54232iK = new C54232iK();
        A06 = c54232iK;
        c54232iK.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C54232iK c54232iK = (C54232iK) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c54232iK.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c54232iK.A01);
                this.A04 = c0rm.AWD((i & 2) == 2, this.A04, (i3 & 2) == 2, c54232iK.A04);
                this.A02 = c0rm.AW8((i & 4) == 4, this.A02, (i3 & 4) == 4, c54232iK.A02);
                this.A05 = c0rm.AWD((i & 8) == 8, this.A05, (i3 & 8) == 8, c54232iK.A05);
                this.A03 = c0rm.AW2((i & 16) == 16, this.A03, (i3 & 16) == 16, c54232iK.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c54232iK.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r7) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 18) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 2;
                                this.A04 = A0A;
                            } else if (A03 == 24) {
                                this.A00 |= 4;
                                this.A02 = c0ro.A06();
                            } else if (A03 == 34) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 8;
                                this.A05 = A0A2;
                            } else if (A03 != 42) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 16;
                                this.A03 = c0ro.A08();
                            }
                        }
                        r7 = true;
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
                return new C54232iK();
            case 5:
                return new C0CT() { // from class: X.41O
                    {
                        C54232iK c54232iK2 = C54232iK.A06;
                    }
                };
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C54232iK.class) {
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
            A062 += C0RS.A0B(2, this.A04);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            A062 += C0RS.A08(3, this.A02);
        }
        if ((i3 & 8) == 8) {
            A062 += C0RS.A0B(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            A062 += C0RS.A09(5, this.A03);
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
            c0rs.A0P(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0M(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0N(5, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
