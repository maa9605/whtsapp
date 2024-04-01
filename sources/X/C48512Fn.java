package X;

import java.io.IOException;

/* renamed from: X.2Fn */
/* loaded from: classes2.dex */
public final class C48512Fn extends C0AZ implements C0AY {
    public static final C48512Fn A0A;
    public static volatile C0RQ A0B;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C55292kB A04;
    public C55312kD A05;
    public C55302kC A06;
    public AnonymousClass400 A07;
    public AnonymousClass402 A08;
    public C452421a A09;

    static {
        C48512Fn c48512Fn = new C48512Fn();
        A0A = c48512Fn;
        c48512Fn.A0E();
    }

    public static void A09(C48512Fn c48512Fn, C87643zz c87643zz) {
        if (c48512Fn != null) {
            c48512Fn.A07 = (AnonymousClass400) c87643zz.A01();
            c48512Fn.A00 |= 16;
            return;
        }
        throw null;
    }

    public static void A0A(C48512Fn c48512Fn, AnonymousClass401 anonymousClass401) {
        if (c48512Fn != null) {
            c48512Fn.A08 = (AnonymousClass402) anonymousClass401.A01();
            c48512Fn.A00 |= 128;
            return;
        }
        throw null;
    }

    public static void A0B(C48512Fn c48512Fn, EnumC55282kA enumC55282kA) {
        if (enumC55282kA != null) {
            c48512Fn.A00 |= 2;
            c48512Fn.A02 = enumC55282kA.value;
            return;
        }
        throw null;
    }

    public static void A0C(C48512Fn c48512Fn, C452521b c452521b) {
        if (c48512Fn != null) {
            c48512Fn.A09 = (C452421a) c452521b.A01();
            c48512Fn.A00 |= 1;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87413zc c87413zc;
        AnonymousClass401 anonymousClass401;
        C87493zk c87493zk;
        C87503zl c87503zl;
        C87643zz c87643zz;
        C452521b c452521b;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A0A;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48512Fn c48512Fn = (C48512Fn) obj2;
                this.A09 = (C452421a) c0rm.AW9(this.A09, c48512Fn.A09);
                int i = this.A00;
                boolean z2 = (i & 2) == 2;
                int i2 = this.A02;
                int i3 = c48512Fn.A00;
                this.A02 = c0rm.AW5(z2, i2, (i3 & 2) == 2, c48512Fn.A02);
                this.A01 = c0rm.AW5((i & 4) == 4, this.A01, (i3 & 4) == 4, c48512Fn.A01);
                this.A03 = c0rm.AW8((i & 8) == 8, this.A03, (i3 & 8) == 8, c48512Fn.A03);
                this.A07 = (AnonymousClass400) c0rm.AW9(this.A07, c48512Fn.A07);
                this.A06 = (C55302kC) c0rm.AW9(this.A06, c48512Fn.A06);
                this.A05 = (C55312kD) c0rm.AW9(this.A05, c48512Fn.A05);
                this.A08 = (AnonymousClass402) c0rm.AW9(this.A08, c48512Fn.A08);
                this.A04 = (C55292kB) c0rm.AW9(this.A04, c48512Fn.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c48512Fn.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    if ((this.A00 & 1) == 1) {
                                        c452521b = (C452521b) this.A09.AVX();
                                    } else {
                                        c452521b = null;
                                    }
                                    C452421a c452421a = (C452421a) c0ro.A09(C452421a.A05.A0C(), c0rp);
                                    this.A09 = c452421a;
                                    if (c452521b != null) {
                                        c452521b.A03(c452421a);
                                        this.A09 = (C452421a) c452521b.A00();
                                    }
                                    this.A00 |= 1;
                                } else if (A03 == 16) {
                                    int A02 = c0ro.A02();
                                    if (EnumC55282kA.A00(A02) == null) {
                                        super.A0F(2, A02);
                                    } else {
                                        this.A00 |= 2;
                                        this.A02 = A02;
                                    }
                                } else if (A03 == 32) {
                                    this.A00 |= 4;
                                    this.A01 = c0ro.A02();
                                } else if (A03 == 40) {
                                    this.A00 |= 8;
                                    this.A03 = c0ro.A06();
                                } else if (A03 == 50) {
                                    if ((this.A00 & 16) == 16) {
                                        c87643zz = (C87643zz) this.A07.AVX();
                                    } else {
                                        c87643zz = null;
                                    }
                                    AnonymousClass400 anonymousClass400 = (AnonymousClass400) c0ro.A09(AnonymousClass400.A09.A0C(), c0rp);
                                    this.A07 = anonymousClass400;
                                    if (c87643zz != null) {
                                        c87643zz.A03(anonymousClass400);
                                        this.A07 = (AnonymousClass400) c87643zz.A00();
                                    }
                                    this.A00 |= 16;
                                } else if (A03 == 58) {
                                    if ((this.A00 & 32) == 32) {
                                        c87503zl = (C87503zl) this.A06.AVX();
                                    } else {
                                        c87503zl = null;
                                    }
                                    C55302kC c55302kC = (C55302kC) c0ro.A09(C55302kC.A01.A0C(), c0rp);
                                    this.A06 = c55302kC;
                                    if (c87503zl != null) {
                                        c87503zl.A03(c55302kC);
                                        this.A06 = (C55302kC) c87503zl.A00();
                                    }
                                    this.A00 |= 32;
                                } else if (A03 == 66) {
                                    if ((this.A00 & 64) == 64) {
                                        c87493zk = (C87493zk) this.A05.AVX();
                                    } else {
                                        c87493zk = null;
                                    }
                                    C55312kD c55312kD = (C55312kD) c0ro.A09(C55312kD.A01.A0C(), c0rp);
                                    this.A05 = c55312kD;
                                    if (c87493zk != null) {
                                        c87493zk.A03(c55312kD);
                                        this.A05 = (C55312kD) c87493zk.A00();
                                    }
                                    this.A00 |= 64;
                                } else if (A03 == 74) {
                                    if ((this.A00 & 128) == 128) {
                                        anonymousClass401 = (AnonymousClass401) this.A08.AVX();
                                    } else {
                                        anonymousClass401 = null;
                                    }
                                    AnonymousClass402 anonymousClass402 = (AnonymousClass402) c0ro.A09(AnonymousClass402.A02.A0C(), c0rp);
                                    this.A08 = anonymousClass402;
                                    if (anonymousClass401 != null) {
                                        anonymousClass401.A03(anonymousClass402);
                                        this.A08 = (AnonymousClass402) anonymousClass401.A00();
                                    }
                                    this.A00 |= 128;
                                } else if (A03 != 82) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 256) == 256) {
                                        c87413zc = (C87413zc) this.A04.AVX();
                                    } else {
                                        c87413zc = null;
                                    }
                                    C55292kB c55292kB = (C55292kB) c0ro.A09(C55292kB.A03.A0C(), c0rp);
                                    this.A04 = c55292kB;
                                    if (c87413zc != null) {
                                        c87413zc.A03(c55292kB);
                                        this.A04 = (C55292kB) c87413zc.A00();
                                    }
                                    this.A00 |= 256;
                                }
                            }
                            z = true;
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
                return new C48512Fn();
            case 5:
                return new C0CT() { // from class: X.2Fm
                    {
                        C48512Fn c48512Fn2 = C48512Fn.A0A;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0B == null) {
                    synchronized (C48512Fn.class) {
                        if (A0B == null) {
                            A0B = new C0RR(A0A);
                        }
                    }
                }
                return A0B;
            default:
                throw new UnsupportedOperationException();
        }
        return A0A;
    }

    public C55292kB A0i() {
        C55292kB c55292kB = this.A04;
        return c55292kB == null ? C55292kB.A03 : c55292kB;
    }

    public C55312kD A0j() {
        C55312kD c55312kD = this.A05;
        return c55312kD == null ? C55312kD.A01 : c55312kD;
    }

    public C55302kC A0k() {
        C55302kC c55302kC = this.A06;
        return c55302kC == null ? C55302kC.A01 : c55302kC;
    }

    public AnonymousClass400 A0l() {
        AnonymousClass400 anonymousClass400 = this.A07;
        return anonymousClass400 == null ? AnonymousClass400.A09 : anonymousClass400;
    }

    public AnonymousClass402 A0m() {
        AnonymousClass402 anonymousClass402 = this.A08;
        return anonymousClass402 == null ? AnonymousClass402.A02 : anonymousClass402;
    }

    public EnumC55282kA A0n() {
        EnumC55282kA A00 = EnumC55282kA.A00(this.A02);
        return A00 == null ? EnumC55282kA.REVOKE : A00;
    }

    public C452421a A0o() {
        C452421a c452421a = this.A09;
        return c452421a == null ? C452421a.A05 : c452421a;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A2 = (this.A00 & 1) == 1 ? 0 + C0RS.A0A(1, A0o()) : 0;
        int i2 = this.A00;
        if ((i2 & 2) == 2) {
            A0A2 += C0RS.A04(2, this.A02);
        }
        if ((i2 & 4) == 4) {
            A0A2 += C0RS.A06(4, this.A01);
        }
        if ((i2 & 8) == 8) {
            A0A2 += C0RS.A07(5, this.A03);
        }
        if ((i2 & 16) == 16) {
            A0A2 += C0RS.A0A(6, A0l());
        }
        if ((this.A00 & 32) == 32) {
            A0A2 += C0RS.A0A(7, A0k());
        }
        if ((this.A00 & 64) == 64) {
            A0A2 += C0RS.A0A(8, A0j());
        }
        if ((this.A00 & 128) == 128) {
            A0A2 += C0RS.A0A(9, A0m());
        }
        if ((this.A00 & 256) == 256) {
            A0A2 += C0RS.A0A(10, A0i());
        }
        int A00 = this.unknownFields.A00() + A0A2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(1, A0o());
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0I(2, this.A02);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0K(4, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0M(5, this.A03);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0O(6, A0l());
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0O(7, A0k());
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0O(8, A0j());
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0O(9, A0m());
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0O(10, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
