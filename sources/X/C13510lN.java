package X;

import java.io.IOException;

/* renamed from: X.0lN */
/* loaded from: classes.dex */
public final class C13510lN extends C0AZ implements C0AY {
    public static final C13510lN A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01;
    public C0CX A02 = C0RU.A01;
    public C75093eL A03;

    static {
        C13510lN c13510lN = new C13510lN();
        A04 = c13510lN;
        c13510lN.A0E();
    }

    public static void A09(C13510lN c13510lN, C75103eM c75103eM) {
        if (c13510lN != null) {
            c13510lN.A03 = (C75093eL) c75103eM.A01();
            c13510lN.A00 |= 2;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C75103eM c75103eM;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C13510lN c13510lN = (C13510lN) obj2;
                this.A01 = c0rm.AW5((this.A00 & 1) == 1, this.A01, (c13510lN.A00 & 1) == 1, c13510lN.A01);
                this.A02 = c0rm.AW7(this.A02, c13510lN.A02);
                this.A03 = (C75093eL) c0rm.AW9(this.A03, c13510lN.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c13510lN.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 8) {
                                this.A00 |= 1;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 18) {
                                C0CX c0cx = this.A02;
                                C0CX c0cx2 = c0cx;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx2 = C0AZ.A05(c0cx);
                                    this.A02 = c0cx2;
                                }
                                c0cx2.add(c0ro.A09(C881041t.A03.A0C(), c0rp));
                            } else if (A03 != 26) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 2) == 2) {
                                    c75103eM = (C75103eM) this.A03.AVX();
                                } else {
                                    c75103eM = null;
                                }
                                C75093eL c75093eL = (C75093eL) c0ro.A09(C75093eL.A03.A0C(), c0rp);
                                this.A03 = c75093eL;
                                if (c75103eM != null) {
                                    c75103eM.A03(c75093eL);
                                    this.A03 = (C75093eL) c75103eM.A00();
                                }
                                this.A00 |= 2;
                            }
                        }
                        r3 = true;
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
                ((C0CY) this.A02).A00 = false;
                return null;
            case 4:
                return new C13510lN();
            case 5:
                return new C880341m(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C13510lN.class) {
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

    public C75093eL A0i() {
        C75093eL c75093eL = this.A03;
        return c75093eL == null ? C75093eL.A03 : c75093eL;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A06(1, this.A01) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += C0RS.A0A(2, (C0AX) this.A02.get(i3));
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0A(3, A0i());
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A01);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0O(2, (C0AX) this.A02.get(i));
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0O(3, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
