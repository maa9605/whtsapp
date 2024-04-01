package X;

import java.io.IOException;

/* renamed from: X.2G3 */
/* loaded from: classes2.dex */
public final class C2G3 extends C0AZ implements C0AY {
    public static final C2G3 A0A;
    public static volatile C0RQ A0B;
    public int A00;
    public C0CX A01;
    public C0CX A02;
    public C48612Fx A03;
    public String A04;
    public String A05;
    public String A07;
    public String A08;
    public String A09 = "";
    public String A06 = "";

    static {
        C2G3 c2g3 = new C2G3();
        A0A = c2g3;
        c2g3.A0E();
    }

    public C2G3() {
        C0RU c0ru = C0RU.A01;
        this.A02 = c0ru;
        this.A08 = "";
        this.A07 = "";
        this.A01 = c0ru;
        this.A05 = "";
        this.A04 = "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C48602Fw c48602Fw;
        switch (c0rl.ordinal()) {
            case 0:
                return A0A;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2G3 c2g3 = (C2G3) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A09;
                int i2 = c2g3.A00;
                this.A09 = c0rm.AWD(z, str, (i2 & 1) == 1, c2g3.A09);
                this.A06 = c0rm.AWD((i & 2) == 2, this.A06, (i2 & 2) == 2, c2g3.A06);
                this.A02 = c0rm.AW7(this.A02, c2g3.A02);
                int i3 = this.A00;
                boolean z2 = (i3 & 4) == 4;
                String str2 = this.A08;
                int i4 = c2g3.A00;
                this.A08 = c0rm.AWD(z2, str2, (i4 & 4) == 4, c2g3.A08);
                this.A07 = c0rm.AWD((i3 & 8) == 8, this.A07, (i4 & 8) == 8, c2g3.A07);
                this.A01 = c0rm.AW7(this.A01, c2g3.A01);
                int i5 = this.A00;
                boolean z3 = (i5 & 16) == 16;
                String str3 = this.A05;
                int i6 = c2g3.A00;
                this.A05 = c0rm.AWD(z3, str3, (i6 & 16) == 16, c2g3.A05);
                this.A04 = c0rm.AWD((i5 & 32) == 32, this.A04, (i6 & 32) == 32, c2g3.A04);
                this.A03 = (C48612Fx) c0rm.AW9(this.A03, c2g3.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2g3.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r8) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A09 = A0A2;
                                } else if (A03 == 18) {
                                    String A0A3 = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A06 = A0A3;
                                } else if (A03 == 26) {
                                    String A0A4 = c0ro.A0A();
                                    C0CX c0cx = this.A02;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A02 = c0cx;
                                    }
                                    c0cx.add(A0A4);
                                } else if (A03 == 34) {
                                    String A0A5 = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A08 = A0A5;
                                } else if (A03 == 42) {
                                    String A0A6 = c0ro.A0A();
                                    this.A00 |= 8;
                                    this.A07 = A0A6;
                                } else if (A03 == 50) {
                                    C0CX c0cx2 = this.A01;
                                    if (!((C0CY) c0cx2).A00) {
                                        c0cx2 = C0AZ.A05(c0cx2);
                                        this.A01 = c0cx2;
                                    }
                                    c0cx2.add(c0ro.A09(C87633zy.A04.A0C(), c0rp));
                                } else if (A03 == 58) {
                                    String A0A7 = c0ro.A0A();
                                    this.A00 |= 16;
                                    this.A05 = A0A7;
                                } else if (A03 == 66) {
                                    String A0A8 = c0ro.A0A();
                                    this.A00 |= 32;
                                    this.A04 = A0A8;
                                } else if (A03 != 74) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 64) == 64) {
                                        c48602Fw = (C48602Fw) this.A03.AVX();
                                    } else {
                                        c48602Fw = null;
                                    }
                                    C48612Fx c48612Fx = (C48612Fx) c0ro.A09(C48612Fx.A05.A0C(), c0rp);
                                    this.A03 = c48612Fx;
                                    if (c48602Fw != null) {
                                        c48602Fw.A03(c48612Fx);
                                        this.A03 = (C48612Fx) c48602Fw.A00();
                                    }
                                    this.A00 |= 64;
                                }
                            }
                            r8 = true;
                        } catch (C0JX e) {
                            e.unfinishedMessage = this;
                            throw new RuntimeException(e);
                        }
                    } catch (IOException e2) {
                        C0JX c0jx = new C0JX(e2.getMessage());
                        c0jx.unfinishedMessage = this;
                        throw new RuntimeException(c0jx);
                    }
                }
                break;
            case 3:
                ((C0CY) this.A02).A00 = false;
                ((C0CY) this.A01).A00 = false;
                return null;
            case 4:
                return new C2G3();
            case 5:
                return new C0CT() { // from class: X.2G8
                    {
                        C2G3 c2g32 = C2G3.A0A;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0B == null) {
                    synchronized (C2G3.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A09) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0B(2, this.A06);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i3 += C0RS.A0D((String) this.A02.get(i4));
        }
        int size = this.A02.size() + i + i3;
        if ((this.A00 & 4) == 4) {
            size += C0RS.A0B(4, this.A08);
        }
        if ((this.A00 & 8) == 8) {
            size += C0RS.A0B(5, this.A07);
        }
        for (int i5 = 0; i5 < this.A01.size(); i5++) {
            size += C0RS.A0A(6, (C0AX) this.A01.get(i5));
        }
        if ((this.A00 & 16) == 16) {
            size += C0RS.A0B(7, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            size += C0RS.A0B(8, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            C48612Fx c48612Fx = this.A03;
            if (c48612Fx == null) {
                c48612Fx = C48612Fx.A05;
            }
            size += C0RS.A0A(9, c48612Fx);
        }
        int A00 = this.unknownFields.A00() + size;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A06);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0P(3, (String) this.A02.get(i));
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(4, this.A08);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(5, this.A07);
        }
        for (int i2 = 0; i2 < this.A01.size(); i2++) {
            c0rs.A0O(6, (C0AX) this.A01.get(i2));
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(7, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(8, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            C48612Fx c48612Fx = this.A03;
            if (c48612Fx == null) {
                c48612Fx = C48612Fx.A05;
            }
            c0rs.A0O(9, c48612Fx);
        }
        this.unknownFields.A02(c0rs);
    }
}
