package X;

import java.io.IOException;

/* renamed from: X.2G1 */
/* loaded from: classes2.dex */
public final class C2G1 extends C0AZ implements C0AY {
    public static final C2G1 A03;
    public static volatile C0RQ A04;
    public int A00;
    public String A02 = "";
    public C0AN A01 = C0AN.A01;

    static {
        C2G1 c2g1 = new C2G1();
        A03 = c2g1;
        c2g1.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2G1 c2g1 = (C2G1) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A02;
                int i2 = c2g1.A00;
                this.A02 = c0rm.AWD(z, str, (i2 & 1) == 1, c2g1.A02);
                this.A01 = c0rm.AW2((i & 2) == 2, this.A01, (i2 & 2) == 2, c2g1.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2g1.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A02 = A0A;
                            } else if (A032 != 18) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                this.A00 |= 2;
                                this.A01 = c0ro.A08();
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
                return new C2G1();
            case 5:
                return new C2G5();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C2G1.class) {
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
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A02) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A09(2, this.A01);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
