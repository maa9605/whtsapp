package X;

import java.io.IOException;

/* renamed from: X.2Fl */
/* loaded from: classes2.dex */
public final class C48492Fl extends C0AZ implements C0AY {
    public static final C48492Fl A05;
    public static volatile C0RQ A06;
    public int A00;
    public C40521sP A01;
    public C40I A02;
    public C40K A03;
    public String A04 = "";

    static {
        C48492Fl c48492Fl = new C48492Fl();
        A05 = c48492Fl;
        c48492Fl.A0E();
    }

    public static void A09(C48492Fl c48492Fl, C40521sP c40521sP) {
        if (c40521sP != null) {
            c48492Fl.A01 = c40521sP;
            c48492Fl.A00 |= 8;
            return;
        }
        throw null;
    }

    public static void A0A(C48492Fl c48492Fl, C40H c40h) {
        if (c48492Fl != null) {
            c48492Fl.A02 = (C40I) c40h.A01();
            c48492Fl.A00 |= 4;
            return;
        }
        throw null;
    }

    public static void A0B(C48492Fl c48492Fl, C40J c40j) {
        if (c48492Fl != null) {
            c48492Fl.A03 = (C40K) c40j.A01();
            c48492Fl.A00 |= 1;
            return;
        }
        throw null;
    }

    public static void A0C(C48492Fl c48492Fl, String str) {
        if (str != null) {
            c48492Fl.A00 |= 2;
            c48492Fl.A04 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        C40H c40h;
        C40J c40j;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48492Fl c48492Fl = (C48492Fl) obj2;
                this.A03 = (C40K) c0rm.AW9(this.A03, c48492Fl.A03);
                this.A04 = c0rm.AWD((this.A00 & 2) == 2, this.A04, (c48492Fl.A00 & 2) == 2, c48492Fl.A04);
                this.A02 = (C40I) c0rm.AW9(this.A02, c48492Fl.A02);
                this.A01 = (C40521sP) c0rm.AW9(this.A01, c48492Fl.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c48492Fl.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    if ((this.A00 & 1) == 1) {
                                        c40j = (C40J) this.A03.AVX();
                                    } else {
                                        c40j = null;
                                    }
                                    C40K c40k = (C40K) c0ro.A09(C40K.A0C.A0C(), c0rp);
                                    this.A03 = c40k;
                                    if (c40j != null) {
                                        c40j.A03(c40k);
                                        this.A03 = (C40K) c40j.A00();
                                    }
                                    this.A00 |= 1;
                                } else if (A03 == 18) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A04 = A0A;
                                } else if (A03 == 34) {
                                    if ((this.A00 & 4) == 4) {
                                        c40h = (C40H) this.A02.AVX();
                                    } else {
                                        c40h = null;
                                    }
                                    C40I c40i = (C40I) c0ro.A09(C40I.A04.A0C(), c0rp);
                                    this.A02 = c40i;
                                    if (c40h != null) {
                                        c40h.A03(c40i);
                                        this.A02 = (C40I) c40h.A00();
                                    }
                                    this.A00 |= 4;
                                } else if (A03 != 138) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 8) == 8) {
                                        c87333zU = (C87333zU) this.A01.AVX();
                                    } else {
                                        c87333zU = null;
                                    }
                                    C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                    this.A01 = c40521sP;
                                    if (c87333zU != null) {
                                        c87333zU.A03(c40521sP);
                                        this.A01 = (C40521sP) c87333zU.A00();
                                    }
                                    this.A00 |= 8;
                                }
                            }
                            r3 = true;
                        } catch (IOException e) {
                            C0JX c0jx = new C0JX(e.getMessage());
                            c0jx.unfinishedMessage = this;
                            throw new RuntimeException(c0jx);
                        }
                    } catch (C0JX e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C48492Fl();
            case 5:
                return new C0CT() { // from class: X.2Fk
                    {
                        C48492Fl c48492Fl2 = C48492Fl.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C48492Fl.class) {
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

    public C40521sP A0i() {
        C40521sP c40521sP = this.A01;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    public C40I A0j() {
        C40I c40i = this.A02;
        return c40i == null ? C40I.A04 : c40i;
    }

    public C40K A0k() {
        C40K c40k = this.A03;
        return c40k == null ? C40K.A0C : c40k;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = (this.A00 & 1) == 1 ? 0 + C0RS.A0A(1, A0k()) : 0;
        if ((this.A00 & 2) == 2) {
            A0A += C0RS.A0B(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            A0A += C0RS.A0A(4, A0j());
        }
        if ((this.A00 & 8) == 8) {
            A0A += C0RS.A0A(17, A0i());
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(1, A0k());
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(4, A0j());
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0O(17, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
