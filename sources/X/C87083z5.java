package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.3z5 */
/* loaded from: classes2.dex */
public final class C87083z5 extends C0AZ implements C0AY {
    public static final C87083z5 A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public C87063z3 A02;
    public C87103z7 A03;
    public C87123z9 A04;

    static {
        C87083z5 c87083z5 = new C87083z5();
        A05 = c87083z5;
        c87083z5.A0E();
    }

    public static C87083z5 A09(InputStream inputStream) {
        return (C87083z5) C0AZ.A02(A05, inputStream);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87053z2 c87053z2;
        C87093z6 c87093z6;
        C87113z8 c87113z8;
        EnumC79083l3 enumC79083l3;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87083z5 c87083z5 = (C87083z5) obj2;
                this.A01 = c0rm.AW5((this.A00 & 1) == 1, this.A01, (c87083z5.A00 & 1) == 1, c87083z5.A01);
                this.A04 = (C87123z9) c0rm.AW9(this.A04, c87083z5.A04);
                this.A03 = (C87103z7) c0rm.AW9(this.A03, c87083z5.A03);
                this.A02 = (C87063z3) c0rm.AW9(this.A02, c87083z5.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c87083z5.A00;
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
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC79083l3 = EnumC79083l3.WA_PROVIDED;
                                } else {
                                    enumC79083l3 = A02 != 1 ? null : EnumC79083l3.HSM_CONTROLLED;
                                }
                                if (enumC79083l3 == null) {
                                    super.A0F(1, A02);
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A02;
                                }
                            } else if (A03 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    c87113z8 = (C87113z8) this.A04.AVX();
                                } else {
                                    c87113z8 = null;
                                }
                                C87123z9 c87123z9 = (C87123z9) c0ro.A09(C87123z9.A06.A0C(), c0rp);
                                this.A04 = c87123z9;
                                if (c87113z8 != null) {
                                    c87113z8.A03(c87123z9);
                                    this.A04 = (C87123z9) c87113z8.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    c87093z6 = (C87093z6) this.A03.AVX();
                                } else {
                                    c87093z6 = null;
                                }
                                C87103z7 c87103z7 = (C87103z7) c0ro.A09(C87103z7.A02.A0C(), c0rp);
                                this.A03 = c87103z7;
                                if (c87093z6 != null) {
                                    c87093z6.A03(c87103z7);
                                    this.A03 = (C87103z7) c87093z6.A00();
                                }
                                this.A00 |= 4;
                            } else if (A03 != 34) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 8) == 8) {
                                    c87053z2 = (C87053z2) this.A02.AVX();
                                } else {
                                    c87053z2 = null;
                                }
                                C87063z3 c87063z3 = (C87063z3) c0ro.A09(C87063z3.A04.A0C(), c0rp);
                                this.A02 = c87063z3;
                                if (c87053z2 != null) {
                                    c87053z2.A03(c87063z3);
                                    this.A02 = (C87063z3) c87053z2.A00();
                                }
                                this.A00 |= 8;
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
                return null;
            case 4:
                return new C87083z5();
            case 5:
                return new C0CT() { // from class: X.3z4
                    {
                        C87083z5 c87083z52 = C87083z5.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C87083z5.class) {
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

    public C87063z3 A0i() {
        C87063z3 c87063z3 = this.A02;
        return c87063z3 == null ? C87063z3.A04 : c87063z3;
    }

    public EnumC79083l3 A0j() {
        EnumC79083l3 enumC79083l3;
        EnumC79083l3 enumC79083l32 = EnumC79083l3.WA_PROVIDED;
        int i = this.A01;
        if (i != 0) {
            if (i == 1) {
                enumC79083l3 = EnumC79083l3.HSM_CONTROLLED;
            }
        }
        enumC79083l3 = enumC79083l32;
        return enumC79083l3 != null ? enumC79083l3 : enumC79083l32;
    }

    public C87103z7 A0k() {
        C87103z7 c87103z7 = this.A03;
        return c87103z7 == null ? C87103z7.A02 : c87103z7;
    }

    public C87123z9 A0l() {
        C87123z9 c87123z9 = this.A04;
        return c87123z9 == null ? C87123z9.A06 : c87123z9;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A04 = (i2 & 1) == 1 ? 0 + C0RS.A04(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A04 += C0RS.A0A(2, A0l());
        }
        if ((this.A00 & 4) == 4) {
            A04 += C0RS.A0A(3, A0k());
        }
        if ((this.A00 & 8) == 8) {
            A04 += C0RS.A0A(4, A0i());
        }
        int A00 = this.unknownFields.A00() + A04;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0I(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0O(2, A0l());
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(3, A0k());
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0O(4, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
