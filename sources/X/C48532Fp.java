package X;

import java.io.IOException;

/* renamed from: X.2Fp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48532Fp extends C0AZ implements C0AY {
    public static final C48532Fp A07;
    public static volatile C0RQ A08;
    public int A00;
    public long A01;
    public long A02;
    public C40531sQ A03;
    public C55332kF A04;
    public String A05 = "";
    public String A06 = "";

    static {
        C48532Fp c48532Fp = new C48532Fp();
        A07 = c48532Fp;
        c48532Fp.A0E();
    }

    public static void A09(C48532Fp c48532Fp, C40541sR c40541sR) {
        if (c48532Fp != null) {
            c48532Fp.A03 = (C40531sQ) c40541sR.A01();
            c48532Fp.A00 |= 1;
            return;
        }
        throw null;
    }

    public static void A0A(C48532Fp c48532Fp, C55332kF c55332kF) {
        if (c55332kF != null) {
            c48532Fp.A04 = c55332kF;
            c48532Fp.A00 |= 32;
            return;
        }
        throw null;
    }

    public static void A0B(C48532Fp c48532Fp, String str) {
        if (str != null) {
            c48532Fp.A00 |= 2;
            c48532Fp.A05 = str;
            return;
        }
        throw null;
    }

    public static void A0C(C48532Fp c48532Fp, String str) {
        if (str != null) {
            c48532Fp.A00 |= 8;
            c48532Fp.A06 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C40M c40m;
        C40541sR c40541sR;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A07;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48532Fp c48532Fp = (C48532Fp) obj2;
                this.A03 = (C40531sQ) c0rm.AW9(this.A03, c48532Fp.A03);
                int i = this.A00;
                boolean z2 = (i & 2) == 2;
                String str = this.A05;
                int i2 = c48532Fp.A00;
                this.A05 = c0rm.AWD(z2, str, (i2 & 2) == 2, c48532Fp.A05);
                this.A01 = c0rm.AW8((i & 4) == 4, this.A01, (i2 & 4) == 4, c48532Fp.A01);
                this.A06 = c0rm.AWD((i & 8) == 8, this.A06, (i2 & 8) == 8, c48532Fp.A06);
                this.A02 = c0rm.AW8((i & 16) == 16, this.A02, (i2 & 16) == 16, c48532Fp.A02);
                this.A04 = (C55332kF) c0rm.AW9(this.A04, c48532Fp.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c48532Fp.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 2;
                                this.A05 = A0A;
                            } else if (A03 == 16) {
                                this.A00 |= 4;
                                this.A01 = c0ro.A06();
                            } else if (A03 == 26) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 8;
                                this.A06 = A0A2;
                            } else if (A03 == 34) {
                                if ((this.A00 & 1) == 1) {
                                    c40541sR = (C40541sR) this.A03.AVX();
                                } else {
                                    c40541sR = null;
                                }
                                C40531sQ c40531sQ = (C40531sQ) c0ro.A09(C40531sQ.A0c.A0C(), c0rp);
                                this.A03 = c40531sQ;
                                if (c40541sR != null) {
                                    c40541sR.A03(c40531sQ);
                                    this.A03 = (C40531sQ) c40541sR.A00();
                                }
                                this.A00 |= 1;
                            } else if (A03 == 40) {
                                this.A00 |= 16;
                                this.A02 = c0ro.A06();
                            } else if (A03 != 50) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 32) == 32) {
                                    c40m = (C40M) this.A04.AVX();
                                } else {
                                    c40m = null;
                                }
                                C55332kF c55332kF = (C55332kF) c0ro.A09(C55332kF.A04.A0C(), c0rp);
                                this.A04 = c55332kF;
                                if (c40m != null) {
                                    c40m.A03(c55332kF);
                                    this.A04 = (C55332kF) c40m.A00();
                                }
                                this.A00 |= 32;
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
                return null;
            case 4:
                return new C48532Fp();
            case 5:
                return new C0CT() { // from class: X.2Fo
                    {
                        C48532Fp c48532Fp2 = C48532Fp.A07;
                    }
                };
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C48532Fp.class) {
                        if (A08 == null) {
                            A08 = new C0RR(A07);
                        }
                    }
                }
                return A08;
            default:
                throw new UnsupportedOperationException();
        }
        return A07;
    }

    public C40531sQ A0i() {
        C40531sQ c40531sQ = this.A03;
        return c40531sQ == null ? C40531sQ.A0c : c40531sQ;
    }

    public C55332kF A0j() {
        C55332kF c55332kF = this.A04;
        return c55332kF == null ? C55332kF.A04 : c55332kF;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 2) == 2 ? 0 + C0RS.A0B(1, this.A05) : 0;
        int i2 = this.A00;
        if ((i2 & 4) == 4) {
            A0B += C0RS.A08(2, this.A01);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A0B(3, this.A06);
        }
        if ((this.A00 & 1) == 1) {
            A0B += C0RS.A0A(4, A0i());
        }
        int i3 = this.A00;
        if ((i3 & 16) == 16) {
            A0B += C0RS.A07(5, this.A02);
        }
        if ((i3 & 32) == 32) {
            A0B += C0RS.A0A(6, A0j());
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(1, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0M(2, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(3, this.A06);
        }
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(4, A0i());
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0M(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0O(6, A0j());
        }
        this.unknownFields.A02(c0rs);
    }
}
