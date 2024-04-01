package X;

import java.io.IOException;

/* renamed from: X.24L */
/* loaded from: classes2.dex */
public final class C24L extends C0AZ implements C0AY {
    public static final C24L A09;
    public static volatile C0RQ A0A;
    public int A00;
    public int A01;
    public C0AN A02;
    public C0AN A03;
    public C0CX A04 = C0RU.A01;
    public C40Y A05;
    public C24M A06;
    public C24Z A07;
    public C24S A08;

    static {
        C24L c24l = new C24L();
        A09 = c24l;
        c24l.A0E();
    }

    public C24L() {
        C0AN c0an = C0AN.A01;
        this.A03 = c0an;
        this.A02 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C40X c40x;
        C876540a c876540a;
        C40Z c40z;
        C877240h c877240h;
        switch (c0rl.ordinal()) {
            case 0:
                return A09;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24L c24l = (C24L) obj2;
                this.A08 = (C24S) c0rm.AW9(this.A08, c24l.A08);
                this.A04 = c0rm.AW7(this.A04, c24l.A04);
                this.A06 = (C24M) c0rm.AW9(this.A06, c24l.A06);
                this.A03 = c0rm.AW2((this.A00 & 4) == 4, this.A03, (c24l.A00 & 4) == 4, c24l.A03);
                this.A02 = c0rm.AW2((this.A00 & 8) == 8, this.A02, (c24l.A00 & 8) == 8, c24l.A02);
                this.A07 = (C24Z) c0rm.AW9(this.A07, c24l.A07);
                this.A05 = (C40Y) c0rm.AW9(this.A05, c24l.A05);
                int i = this.A00;
                boolean z = (i & 64) == 64;
                int i2 = this.A01;
                int i3 = c24l.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 64) == 64, c24l.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    c877240h = (C877240h) this.A08.AVX();
                                } else {
                                    c877240h = null;
                                }
                                C24S c24s = (C24S) c0ro.A09(C24S.A02.A0C(), c0rp);
                                this.A08 = c24s;
                                if (c877240h != null) {
                                    c877240h.A03(c24s);
                                    this.A08 = (C24S) c877240h.A00();
                                }
                                this.A00 |= 1;
                            } else if (A03 == 18) {
                                C0CX c0cx = this.A04;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A04 = c0cx;
                                }
                                c0cx.add(c0ro.A09(C24X.A03.A0C(), c0rp));
                            } else if (A03 == 26) {
                                if ((this.A00 & 2) == 2) {
                                    c40z = (C40Z) this.A06.AVX();
                                } else {
                                    c40z = null;
                                }
                                C24M c24m = (C24M) c0ro.A09(C24M.A07.A0C(), c0rp);
                                this.A06 = c24m;
                                if (c40z != null) {
                                    c40z.A03(c24m);
                                    this.A06 = (C24M) c40z.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 == 34) {
                                this.A00 |= 4;
                                this.A03 = c0ro.A08();
                            } else if (A03 == 42) {
                                this.A00 |= 8;
                                this.A02 = c0ro.A08();
                            } else if (A03 == 50) {
                                if ((this.A00 & 16) == 16) {
                                    c876540a = (C876540a) this.A07.AVX();
                                } else {
                                    c876540a = null;
                                }
                                C24Z c24z = (C24Z) c0ro.A09(C24Z.A02.A0C(), c0rp);
                                this.A07 = c24z;
                                if (c876540a != null) {
                                    c876540a.A03(c24z);
                                    this.A07 = (C24Z) c876540a.A00();
                                }
                                this.A00 |= 16;
                            } else if (A03 == 58) {
                                if ((this.A00 & 32) == 32) {
                                    c40x = (C40X) this.A05.AVX();
                                } else {
                                    c40x = null;
                                }
                                C40Y c40y = (C40Y) c0ro.A09(C40Y.A03.A0C(), c0rp);
                                this.A05 = c40y;
                                if (c40x != null) {
                                    c40x.A03(c40y);
                                    this.A05 = (C40Y) c40x.A00();
                                }
                                this.A00 |= 32;
                            } else if (A03 != 64) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 64;
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
                ((C0CY) this.A04).A00 = false;
                return null;
            case 4:
                return new C24L();
            case 5:
                return new C0CT() { // from class: X.40e
                    {
                        C24L c24l2 = C24L.A09;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C24L.class) {
                        if (A0A == null) {
                            A0A = new C0RR(A09);
                        }
                    }
                }
                return A0A;
            default:
                throw new UnsupportedOperationException();
        }
        return A09;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            C24S c24s = this.A08;
            if (c24s == null) {
                c24s = C24S.A02;
            }
            i = C0RS.A0A(1, c24s) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A04.size(); i3++) {
            i += C0RS.A0A(2, (C0AX) this.A04.get(i3));
        }
        if ((this.A00 & 2) == 2) {
            C24M c24m = this.A06;
            if (c24m == null) {
                c24m = C24M.A07;
            }
            i += C0RS.A0A(3, c24m);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i += C0RS.A09(4, this.A03);
        }
        if ((i4 & 8) == 8) {
            i += C0RS.A09(5, this.A02);
        }
        if ((i4 & 16) == 16) {
            C24Z c24z = this.A07;
            if (c24z == null) {
                c24z = C24Z.A02;
            }
            i += C0RS.A0A(6, c24z);
        }
        if ((this.A00 & 32) == 32) {
            C40Y c40y = this.A05;
            if (c40y == null) {
                c40y = C40Y.A03;
            }
            i += C0RS.A0A(7, c40y);
        }
        if ((this.A00 & 64) == 64) {
            i += C0RS.A06(8, this.A01);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            C24S c24s = this.A08;
            if (c24s == null) {
                c24s = C24S.A02;
            }
            c0rs.A0O(1, c24s);
        }
        for (int i = 0; i < this.A04.size(); i++) {
            c0rs.A0O(2, (C0AX) this.A04.get(i));
        }
        if ((this.A00 & 2) == 2) {
            C24M c24m = this.A06;
            if (c24m == null) {
                c24m = C24M.A07;
            }
            c0rs.A0O(3, c24m);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(4, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(5, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            C24Z c24z = this.A07;
            if (c24z == null) {
                c24z = C24Z.A02;
            }
            c0rs.A0O(6, c24z);
        }
        if ((this.A00 & 32) == 32) {
            C40Y c40y = this.A05;
            if (c40y == null) {
                c40y = C40Y.A03;
            }
            c0rs.A0O(7, c40y);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0K(8, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
