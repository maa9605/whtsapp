package X;

import java.io.IOException;

/* renamed from: X.41i */
/* loaded from: classes2.dex */
public final class C879941i extends C0AZ implements C0AY {
    public static final C879941i A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01;
    public int A02;
    public C0AN A03 = C0AN.A01;

    static {
        C879941i c879941i = new C879941i();
        A04 = c879941i;
        c879941i.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C879941i c879941i = (C879941i) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c879941i.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c879941i.A01);
                this.A02 = c0rm.AW5((i & 2) == 2, this.A02, (i3 & 2) == 2, c879941i.A02);
                this.A03 = c0rm.AW2((i & 4) == 4, this.A03, (i3 & 4) == 4, c879941i.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c879941i.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A02 = c0ro.A02();
                            } else if (A03 != 26) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 4;
                                this.A03 = c0ro.A08();
                            }
                        }
                        z2 = true;
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
                return new C879941i();
            case 5:
                return new C879841h(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C879941i.class) {
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
        int A06 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A06 += C0RS.A06(2, this.A02);
        }
        if ((i2 & 4) == 4) {
            A06 += C0RS.A09(3, this.A03);
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
            c0rs.A0K(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}