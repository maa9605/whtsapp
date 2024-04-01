package X;

import java.io.IOException;

/* renamed from: X.2G0  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2G0 extends C0AZ implements C0AY {
    public static final C2G0 A03;
    public static volatile C0RQ A04;
    public int A00;
    public int A01;
    public C55432kP A02;

    static {
        C2G0 c2g0 = new C2G0();
        A03 = c2g0;
        c2g0.A0E();
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = (this.A00 & 1) == 1 ? 0 + C0RS.A0A(1, A0i()) : 0;
        if ((this.A00 & 2) == 2) {
            A0A += C0RS.A05(2, this.A01);
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(1, A0i());
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0I(2, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }

    public static void A09(C2G0 c2g0, C55442kQ c55442kQ) {
        if (c2g0 == null) {
            throw null;
        }
        c2g0.A02 = (C55432kP) c55442kQ.A01();
        c2g0.A00 |= 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2G0 c2g0 = (C2G0) obj2;
                this.A02 = (C55432kP) c0rm.AW9(this.A02, c2g0.A02);
                int i = this.A00;
                boolean z = (i & 2) == 2;
                int i2 = this.A01;
                int i3 = c2g0.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 2) == 2, c2g0.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                C55442kQ c55442kQ = (this.A00 & 1) == 1 ? (C55442kQ) this.A02.AVX() : null;
                                C55432kP c55432kP = (C55432kP) c0ro.A09(C55432kP.A09.A0C(), c0rp);
                                this.A02 = c55432kP;
                                if (c55442kQ != null) {
                                    c55442kQ.A03(c55432kP);
                                    this.A02 = (C55432kP) c55442kQ.A00();
                                }
                                this.A00 |= 1;
                            } else if (A032 == 16) {
                                this.A00 |= 2;
                                this.A01 = c0ro.A02();
                            } else if (!A0I(A032, c0ro)) {
                            }
                        }
                        r5 = true;
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
                return new C2G0();
            case 5:
                return new C0CT() { // from class: X.2Fz
                    {
                        C2G0 c2g02 = C2G0.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C2G0.class) {
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

    public C55432kP A0i() {
        C55432kP c55432kP = this.A02;
        return c55432kP == null ? C55432kP.A09 : c55432kP;
    }
}
