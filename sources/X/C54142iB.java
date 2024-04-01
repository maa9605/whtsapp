package X;

import java.io.IOException;

/* renamed from: X.2iB  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54142iB extends C0AZ implements C0AY {
    public static final C54142iB A04;
    public static volatile C0RQ A05;
    public int A00;
    public C0AN A01;
    public C0AN A02;
    public C0AN A03;

    static {
        C54142iB c54142iB = new C54142iB();
        A04 = c54142iB;
        c54142iB.A0E();
    }

    public C54142iB() {
        C0AN c0an = C0AN.A01;
        this.A01 = c0an;
        this.A03 = c0an;
        this.A02 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C54142iB c54142iB = (C54142iB) obj2;
                this.A01 = c0rm.AW2((this.A00 & 1) == 1, this.A01, (c54142iB.A00 & 1) == 1, c54142iB.A01);
                this.A03 = c0rm.AW2((this.A00 & 2) == 2, this.A03, (c54142iB.A00 & 2) == 2, c54142iB.A03);
                this.A02 = c0rm.AW2((this.A00 & 4) == 4, this.A02, (c54142iB.A00 & 4) == 4, c54142iB.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c54142iB.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r4) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A08();
                            } else if (A03 == 18) {
                                this.A00 |= 2;
                                this.A03 = c0ro.A08();
                            } else if (A03 != 26) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 4;
                                this.A02 = c0ro.A08();
                            }
                        }
                        r4 = true;
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
                return new C54142iB();
            case 5:
                return new C0CT() { // from class: X.2ih
                    {
                        C54142iB c54142iB2 = C54142iB.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C54142iB.class) {
                        if (A05 == null) {
                            A05 = new C0RR(A04);
                        }
                    }
                }
                return A05;
            default:
                throw new UnsupportedOperationException();
        }
        return A04;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A09 = (i2 & 1) == 1 ? 0 + C0RS.A09(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A09 += C0RS.A09(2, this.A03);
        }
        if ((i2 & 4) == 4) {
            A09 += C0RS.A09(3, this.A02);
        }
        int A00 = this.unknownFields.A00() + A09;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
