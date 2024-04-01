package X;

import java.io.IOException;

/* renamed from: X.2GD  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2GD extends C0AZ implements C0AY {
    public static final C2GD A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01;
    public C0AN A02;
    public C0AN A03;

    static {
        C2GD c2gd = new C2GD();
        A04 = c2gd;
        c2gd.A0E();
    }

    public C2GD() {
        C0AN c0an = C0AN.A01;
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
                C2GD c2gd = (C2GD) obj2;
                this.A03 = c0rm.AW2((this.A00 & 1) == 1, this.A03, (c2gd.A00 & 1) == 1, c2gd.A03);
                this.A02 = c0rm.AW2((this.A00 & 2) == 2, this.A02, (c2gd.A00 & 2) == 2, c2gd.A02);
                int i = this.A00;
                boolean z = (i & 4) == 4;
                int i2 = this.A01;
                int i3 = c2gd.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 4) == 4, c2gd.A01);
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
                            if (A03 == 10) {
                                this.A00 |= 1;
                                this.A03 = c0ro.A08();
                            } else if (A03 == 18) {
                                this.A00 |= 2;
                                this.A02 = c0ro.A08();
                            } else if (A03 != 24) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 4;
                                this.A01 = c0ro.A02();
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
                return new C2GD();
            case 5:
                return new C0CT() { // from class: X.2GI
                    {
                        C2GD c2gd2 = C2GD.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C2GD.class) {
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
        int A09 = (i2 & 1) == 1 ? 0 + C0RS.A09(1, this.A03) : 0;
        if ((i2 & 2) == 2) {
            A09 += C0RS.A09(2, this.A02);
        }
        if ((i2 & 4) == 4) {
            A09 += C0RS.A06(3, this.A01);
        }
        int A00 = this.unknownFields.A00() + A09;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(3, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
