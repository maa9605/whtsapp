package X;

import java.io.IOException;

/* renamed from: X.41d */
/* loaded from: classes2.dex */
public final class C879441d extends C0AZ implements C0AY {
    public static final C879441d A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public int A02;
    public C0CX A04 = C0RU.A01;
    public C0AN A03 = C0AN.A01;

    static {
        C879441d c879441d = new C879441d();
        A05 = c879441d;
        c879441d.A0E();
    }

    public static void A09(C879441d c879441d, C0AN c0an) {
        C0CX c0cx = c879441d.A04;
        if (!((C0CY) c0cx).A00) {
            c0cx = C0AZ.A05(c0cx);
            c879441d.A04 = c0cx;
        }
        c0cx.add(c0an);
    }

    public static void A0A(C879441d c879441d, C0AN c0an) {
        c879441d.A00 |= 4;
        c879441d.A03 = c0an;
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
                C879441d c879441d = (C879441d) obj2;
                this.A01 = c0rm.AW5(A0i(), this.A01, c879441d.A0i(), c879441d.A01);
                this.A02 = c0rm.AW5(A0j(), this.A02, c879441d.A0j(), c879441d.A02);
                this.A04 = c0rm.AW7(this.A04, c879441d.A04);
                this.A03 = c0rm.AW2(A0k(), this.A03, c879441d.A0k(), c879441d.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c879441d.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A02 = c0ro.A02();
                            } else if (A03 == 26) {
                                C0CX c0cx = this.A04;
                                C0CX c0cx2 = c0cx;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx2 = C0AZ.A05(c0cx);
                                    this.A04 = c0cx2;
                                }
                                c0cx2.add(c0ro.A08());
                            } else if (A03 != 34) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 4;
                                this.A03 = c0ro.A08();
                            }
                        }
                        z = true;
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
                ((C0CY) this.A04).A00 = false;
                return null;
            case 4:
                return new C879441d();
            case 5:
                return new C879341c(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C879441d.class) {
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

    public boolean A0i() {
        return (this.A00 & 1) == 1;
    }

    public boolean A0j() {
        return (this.A00 & 2) == 2;
    }

    public boolean A0k() {
        return (this.A00 & 4) == 4;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = C0RS.A06(1, this.A01) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += C0RS.A06(2, this.A02);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A04.size(); i5++) {
            int A03 = ((C0AN) this.A04.get(i5)).A03();
            i4 += C0RS.A03(A03) + A03;
        }
        int size = this.A04.size() + i + i4;
        if ((this.A00 & 4) == 4) {
            size += C0RS.A09(4, this.A03);
        }
        int A00 = this.unknownFields.A00() + size;
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
        for (int i = 0; i < this.A04.size(); i++) {
            c0rs.A0N(3, (C0AN) this.A04.get(i));
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(4, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
