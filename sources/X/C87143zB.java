package X;

import java.io.IOException;

/* renamed from: X.3zB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87143zB extends C0AZ implements C0AY {
    public static final C87143zB A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    static {
        C87143zB c87143zB = new C87143zB();
        A05 = c87143zB;
        c87143zB.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87143zB c87143zB = (C87143zB) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c87143zB.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c87143zB.A01);
                this.A04 = c0rm.AW5((i & 2) == 2, this.A04, (i3 & 2) == 2, c87143zB.A04);
                this.A02 = c0rm.AW5((i & 4) == 4, this.A02, (i3 & 4) == 4, c87143zB.A02);
                this.A03 = c0rm.AW5((i & 8) == 8, this.A03, (i3 & 8) == 8, c87143zB.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r5) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A04 = c0ro.A02();
                            } else if (A03 == 24) {
                                this.A00 |= 4;
                                this.A02 = c0ro.A02();
                            } else if (A03 != 32) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 8;
                                this.A03 = c0ro.A02();
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
                return new C87143zB();
            case 5:
                return new C0CT() { // from class: X.3zA
                    {
                        C87143zB c87143zB2 = C87143zB.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C87143zB.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A062 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A062 += C0RS.A06(2, this.A04);
        }
        if ((i2 & 4) == 4) {
            A062 += C0RS.A06(3, this.A02);
        }
        if ((i2 & 8) == 8) {
            A062 += C0RS.A06(4, this.A03);
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
            c0rs.A0K(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0K(4, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
