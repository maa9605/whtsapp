package X;

import java.io.IOException;

/* renamed from: X.2Cr */
/* loaded from: classes2.dex */
public final class C47812Cr extends C0AZ implements C0AY {
    public static final C47812Cr A07;
    public static volatile C0RQ A08;
    public int A00;
    public int A01;
    public C87143zB A03;
    public String A06 = "";
    public String A05 = "";
    public String A04 = "";
    public C0CX A02 = C0RU.A01;

    static {
        C47812Cr c47812Cr = new C47812Cr();
        A07 = c47812Cr;
        c47812Cr.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87133zA c87133zA;
        switch (c0rl.ordinal()) {
            case 0:
                return A07;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C47812Cr c47812Cr = (C47812Cr) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A06;
                int i2 = c47812Cr.A00;
                this.A06 = c0rm.AWD(z, str, (i2 & 1) == 1, c47812Cr.A06);
                this.A05 = c0rm.AWD((i & 2) == 2, this.A05, (i2 & 2) == 2, c47812Cr.A05);
                this.A04 = c0rm.AWD((i & 4) == 4, this.A04, (i2 & 4) == 4, c47812Cr.A04);
                this.A01 = c0rm.AW5((i & 8) == 8, this.A01, (i2 & 8) == 8, c47812Cr.A01);
                this.A02 = c0rm.AW7(this.A02, c47812Cr.A02);
                this.A03 = (C87143zB) c0rm.AW9(this.A03, c47812Cr.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c47812Cr.A00;
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
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A06 = A0A;
                            } else if (A03 == 18) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A05 = A0A2;
                            } else if (A03 == 26) {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 4;
                                this.A04 = A0A3;
                            } else if (A03 == 32) {
                                this.A00 |= 8;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 42) {
                                C0CX c0cx = this.A02;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A02 = c0cx;
                                }
                                c0cx.add(c0ro.A09(C47822Cs.A08.A0C(), c0rp));
                            } else if (A03 != 50) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 16) == 16) {
                                    c87133zA = (C87133zA) this.A03.AVX();
                                } else {
                                    c87133zA = null;
                                }
                                C87143zB c87143zB = (C87143zB) c0ro.A09(C87143zB.A05.A0C(), c0rp);
                                this.A03 = c87143zB;
                                if (c87133zA != null) {
                                    c87133zA.A03(c87143zB);
                                    this.A03 = (C87143zB) c87133zA.A00();
                                }
                                this.A00 |= 16;
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
                ((C0CY) this.A02).A00 = false;
                return null;
            case 4:
                return new C47812Cr();
            case 5:
                return new C0CT() { // from class: X.2Cv
                    {
                        C47812Cr c47812Cr2 = C47812Cr.A07;
                    }
                };
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C47812Cr.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A06) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0B(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            i += C0RS.A0B(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            i += C0RS.A06(4, this.A01);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += C0RS.A0A(5, (C0AX) this.A02.get(i3));
        }
        if ((this.A00 & 16) == 16) {
            C87143zB c87143zB = this.A03;
            if (c87143zB == null) {
                c87143zB = C87143zB.A05;
            }
            i += C0RS.A0A(6, c87143zB);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A06);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0K(4, this.A01);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0O(5, (C0AX) this.A02.get(i));
        }
        if ((this.A00 & 16) == 16) {
            C87143zB c87143zB = this.A03;
            if (c87143zB == null) {
                c87143zB = C87143zB.A05;
            }
            c0rs.A0O(6, c87143zB);
        }
        this.unknownFields.A02(c0rs);
    }
}
