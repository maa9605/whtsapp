package X;

import java.io.IOException;

/* renamed from: X.2kP */
/* loaded from: classes2.dex */
public final class C55432kP extends C0AZ implements C0AY {
    public static final C55432kP A09;
    public static volatile C0RQ A0A;
    public int A00;
    public long A03;
    public long A04;
    public C0AN A05;
    public C0AN A06;
    public C0O0 A07;
    public C0O0 A08;
    public int A02 = -1;
    public int A01 = -1;

    static {
        C55432kP c55432kP = new C55432kP();
        A09 = c55432kP;
        c55432kP.A0E();
    }

    public C55432kP() {
        C0AN c0an = C0AN.A01;
        this.A06 = c0an;
        C09550eI c09550eI = C09550eI.A02;
        this.A08 = c09550eI;
        this.A05 = c0an;
        this.A07 = c09550eI;
    }

    public static void A09(C55432kP c55432kP, C0AN c0an) {
        c55432kP.A00 |= 1;
        c55432kP.A06 = c0an;
    }

    public static void A0A(C55432kP c55432kP, C0AN c0an) {
        c55432kP.A00 |= 4;
        c55432kP.A05 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        int A02;
        C09550eI c09550eI;
        int i;
        switch (c0rl.ordinal()) {
            case 0:
                return A09;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C55432kP c55432kP = (C55432kP) obj2;
                this.A06 = c0rm.AW2((this.A00 & 1) == 1, this.A06, (c55432kP.A00 & 1) == 1, c55432kP.A06);
                this.A04 = c0rm.AW8((this.A00 & 2) == 2, this.A04, (c55432kP.A00 & 2) == 2, c55432kP.A04);
                this.A08 = c0rm.AW6(this.A08, c55432kP.A08);
                this.A05 = c0rm.AW2((this.A00 & 4) == 4, this.A05, (c55432kP.A00 & 4) == 4, c55432kP.A05);
                this.A03 = c0rm.AW8((this.A00 & 8) == 8, this.A03, (c55432kP.A00 & 8) == 8, c55432kP.A03);
                this.A07 = c0rm.AW6(this.A07, c55432kP.A07);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c55432kP.A00;
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
                                this.A06 = c0ro.A08();
                            } else if (A03 != 16) {
                                if (A03 != 24) {
                                    if (A03 == 26) {
                                        int A04 = c0ro.A04(c0ro.A02());
                                        C0O0 c0o0 = this.A08;
                                        if (!((C0CY) c0o0).A00 && c0ro.A00() > 0) {
                                            this.A08 = C0AZ.A04(c0o0);
                                        }
                                        while (c0ro.A00() > 0) {
                                            C09550eI c09550eI2 = (C09550eI) this.A08;
                                            c09550eI2.A03(c09550eI2.A00, c0ro.A02());
                                        }
                                        c0ro.A03 = A04;
                                    } else if (A03 == 66) {
                                        this.A00 |= 4;
                                        this.A05 = c0ro.A08();
                                    } else if (A03 == 72) {
                                        this.A00 |= 8;
                                        this.A03 = c0ro.A06();
                                    } else if (A03 == 80) {
                                        C0O0 c0o02 = this.A07;
                                        C0O0 c0o03 = c0o02;
                                        if (!((C0CY) c0o02).A00) {
                                            c0o03 = C0AZ.A04(c0o02);
                                            this.A07 = c0o03;
                                        }
                                        A02 = c0ro.A02();
                                        c09550eI = (C09550eI) c0o03;
                                        i = c09550eI.A00;
                                    } else if (A03 == 82) {
                                        int A042 = c0ro.A04(c0ro.A02());
                                        C0O0 c0o04 = this.A07;
                                        if (!((C0CY) c0o04).A00 && c0ro.A00() > 0) {
                                            this.A07 = C0AZ.A04(c0o04);
                                        }
                                        while (c0ro.A00() > 0) {
                                            C09550eI c09550eI3 = (C09550eI) this.A07;
                                            c09550eI3.A03(c09550eI3.A00, c0ro.A02());
                                        }
                                        c0ro.A03 = A042;
                                    } else if (!A0I(A03, c0ro)) {
                                    }
                                    c0ro.A0B();
                                } else {
                                    C0O0 c0o05 = this.A08;
                                    C0O0 c0o06 = c0o05;
                                    if (!((C0CY) c0o05).A00) {
                                        c0o06 = C0AZ.A04(c0o05);
                                        this.A08 = c0o06;
                                    }
                                    A02 = c0ro.A02();
                                    c09550eI = (C09550eI) c0o06;
                                    i = c09550eI.A00;
                                }
                                c09550eI.A03(i, A02);
                            } else {
                                this.A00 |= 2;
                                this.A04 = c0ro.A06();
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
                ((C0CY) this.A08).A00 = false;
                ((C0CY) this.A07).A00 = false;
                return null;
            case 4:
                return new C55432kP();
            case 5:
                return new C0CT() { // from class: X.2kQ
                    {
                        C55432kP c55432kP2 = C55432kP.A09;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C55432kP.class) {
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
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A092 = (i2 & 1) == 1 ? C0RS.A09(1, this.A06) + 0 : 0;
        if ((i2 & 2) == 2) {
            A092 += C0RS.A08(2, this.A04);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A08.size(); i4++) {
            C09550eI c09550eI = (C09550eI) this.A08;
            c09550eI.A02(i4);
            i3 += C0RS.A03(c09550eI.A01[i4]);
        }
        int i5 = A092 + i3;
        if (!this.A08.isEmpty()) {
            i5 = i5 + 1 + C0RS.A02(i3);
        }
        this.A02 = i3;
        int i6 = this.A00;
        if ((i6 & 4) == 4) {
            i5 += C0RS.A09(8, this.A05);
        }
        if ((i6 & 8) == 8) {
            i5 += C0RS.A08(9, this.A03);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.A07.size(); i8++) {
            C09550eI c09550eI2 = (C09550eI) this.A07;
            c09550eI2.A02(i8);
            i7 += C0RS.A03(c09550eI2.A01[i8]);
        }
        int i9 = i5 + i7;
        if (!this.A07.isEmpty()) {
            i9 = i9 + 1 + C0RS.A02(i7);
        }
        this.A01 = i7;
        int A00 = this.unknownFields.A00() + i9;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        AD4();
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A06);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A04);
        }
        if (this.A08.size() > 0) {
            c0rs.A0F(26);
            c0rs.A0F(this.A02);
        }
        for (int i = 0; i < this.A08.size(); i++) {
            C09550eI c09550eI = (C09550eI) this.A08;
            c09550eI.A02(i);
            c0rs.A0F(c09550eI.A01[i]);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(8, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0M(9, this.A03);
        }
        if (this.A07.size() > 0) {
            c0rs.A0F(82);
            c0rs.A0F(this.A01);
        }
        for (int i2 = 0; i2 < this.A07.size(); i2++) {
            C09550eI c09550eI2 = (C09550eI) this.A07;
            c09550eI2.A02(i2);
            c0rs.A0F(c09550eI2.A01[i2]);
        }
        this.unknownFields.A02(c0rs);
    }
}
