package X;

import java.io.IOException;

/* renamed from: X.0jg */
/* loaded from: classes.dex */
public final class C12560jg extends C0AZ implements C0AY {
    public static final C12560jg A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public C0CX A02 = C0RU.A01;
    public C881041t A03;
    public C75093eL A04;

    static {
        C12560jg c12560jg = new C12560jg();
        A05 = c12560jg;
        c12560jg.A0E();
    }

    public static void A09(C12560jg c12560jg, C881041t c881041t) {
        if (c881041t != null) {
            c12560jg.A03 = c881041t;
            c12560jg.A00 |= 2;
            return;
        }
        throw null;
    }

    public static void A0A(C12560jg c12560jg, C75103eM c75103eM) {
        if (c12560jg != null) {
            c12560jg.A04 = (C75093eL) c75103eM.A01();
            c12560jg.A00 |= 4;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C75103eM c75103eM;
        C880941s c880941s;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C12560jg c12560jg = (C12560jg) obj2;
                this.A01 = c0rm.AW5((this.A00 & 1) == 1, this.A01, (c12560jg.A00 & 1) == 1, c12560jg.A01);
                this.A03 = (C881041t) c0rm.AW9(this.A03, c12560jg.A03);
                this.A04 = (C75093eL) c0rm.AW9(this.A04, c12560jg.A04);
                this.A02 = c0rm.AW7(this.A02, c12560jg.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c12560jg.A00;
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
                                if ((this.A00 & 2) == 2) {
                                    c880941s = (C880941s) this.A03.AVX();
                                } else {
                                    c880941s = null;
                                }
                                C881041t c881041t = (C881041t) c0ro.A09(C881041t.A03.A0C(), c0rp);
                                this.A03 = c881041t;
                                if (c880941s != null) {
                                    c880941s.A03(c881041t);
                                    this.A03 = (C881041t) c880941s.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    c75103eM = (C75103eM) this.A04.AVX();
                                } else {
                                    c75103eM = null;
                                }
                                C75093eL c75093eL = (C75093eL) c0ro.A09(C75093eL.A03.A0C(), c0rp);
                                this.A04 = c75093eL;
                                if (c75103eM != null) {
                                    c75103eM.A03(c75093eL);
                                    this.A04 = (C75093eL) c75103eM.A00();
                                }
                                this.A00 |= 4;
                            } else if (A03 != 34) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                C0CX c0cx = this.A02;
                                C0CX c0cx2 = c0cx;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx2 = C0AZ.A05(c0cx);
                                    this.A02 = c0cx2;
                                }
                                c0cx2.add(c0ro.A09(C75333ej.A03.A0C(), c0rp));
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
                return new C12560jg();
            case 5:
                return new C880841r(null);
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C12560jg.class) {
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

    public C881041t A0i() {
        C881041t c881041t = this.A03;
        return c881041t == null ? C881041t.A03 : c881041t;
    }

    public C75093eL A0j() {
        C75093eL c75093eL = this.A04;
        return c75093eL == null ? C75093eL.A03 : c75093eL;
    }

    public final void A0k() {
        C0CX c0cx = this.A02;
        if (((C0CY) c0cx).A00) {
            return;
        }
        this.A02 = C0AZ.A05(c0cx);
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
            i += C0RS.A0A(2, A0i());
        }
        if ((this.A00 & 4) == 4) {
            i += C0RS.A0A(3, A0j());
        }
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i += C0RS.A0A(4, (C0AX) this.A02.get(i4));
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
        if ((this.A00 & 2) == 2) {
            c0rs.A0O(2, A0i());
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(3, A0j());
        }
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0O(4, (C0AX) this.A02.get(i));
        }
        this.unknownFields.A02(c0rs);
    }
}
