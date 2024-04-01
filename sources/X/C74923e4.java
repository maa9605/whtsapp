package X;

import java.io.IOException;

/* renamed from: X.3e4 */
/* loaded from: classes2.dex */
public final class C74923e4 extends C0AZ implements C0AY {
    public static final C74923e4 A03;
    public static volatile C0RQ A04;
    public int A00;
    public int A01;
    public C0AN A02 = C0AN.A01;

    static {
        C74923e4 c74923e4 = new C74923e4();
        A03 = c74923e4;
        c74923e4.A0E();
    }

    public static C74933e5 A09() {
        return (C74933e5) A03.AVX();
    }

    public static void A0A(C74923e4 c74923e4, C0AN c0an) {
        c74923e4.A00 |= 2;
        c74923e4.A02 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C74923e4 c74923e4 = (C74923e4) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c74923e4.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c74923e4.A01);
                this.A02 = c0rm.AW2((i & 2) == 2, this.A02, (i3 & 2) == 2, c74923e4.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c74923e4.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A032 != 18) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                this.A00 |= 2;
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
                return new C74923e4();
            case 5:
                return new C74933e5(null);
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C74923e4.class) {
                        if (A04 == null) {
                            A04 = new C0RR(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
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
            A06 += C0RS.A09(2, this.A02);
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
            c0rs.A0N(2, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
