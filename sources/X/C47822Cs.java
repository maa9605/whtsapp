package X;

import java.io.IOException;

/* renamed from: X.2Cs */
/* loaded from: classes2.dex */
public final class C47822Cs extends C0AZ implements C0AY {
    public static final C47822Cs A08;
    public static volatile C0RQ A09;
    public int A00;
    public int A02;
    public Object A04;
    public int A01 = 0;
    public String A07 = "";
    public C0CX A03 = C0RU.A01;
    public String A05 = "";
    public String A06 = "";

    static {
        C47822Cs c47822Cs = new C47822Cs();
        A08 = c47822Cs;
        c47822Cs.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87163zD c87163zD;
        C87243zL c87243zL;
        EnumC79133l8 enumC79133l8 = null;
        switch (c0rl.ordinal()) {
            case 0:
                return A08;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C47822Cs c47822Cs = (C47822Cs) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A07;
                int i2 = c47822Cs.A00;
                this.A07 = c0rm.AWD(z, str, (i2 & 1) == 1, c47822Cs.A07);
                this.A02 = c0rm.AW5((i & 2) == 2, this.A02, (i2 & 2) == 2, c47822Cs.A02);
                this.A03 = c0rm.AW7(this.A03, c47822Cs.A03);
                int i3 = this.A00;
                boolean z2 = (i3 & 4) == 4;
                String str2 = this.A05;
                int i4 = c47822Cs.A00;
                this.A05 = c0rm.AWD(z2, str2, (i4 & 4) == 4, c47822Cs.A05);
                this.A06 = c0rm.AWD((i3 & 32) == 32, this.A06, (i4 & 32) == 32, c47822Cs.A06);
                int i5 = c47822Cs.A01;
                if (i5 == 0) {
                    enumC79133l8 = EnumC79133l8.HSMELEMENT_NOT_SET;
                } else if (i5 == 1) {
                    enumC79133l8 = EnumC79133l8.TEXT_ELEMENT;
                } else if (i5 == 6) {
                    enumC79133l8 = EnumC79133l8.BUTTON_ELEMENT;
                }
                int ordinal = enumC79133l8.ordinal();
                if (ordinal == 0) {
                    this.A04 = c0rm.AWA(this.A01 == 1, this.A04, c47822Cs.A04);
                } else if (ordinal == 1) {
                    this.A04 = c0rm.AWA(this.A01 == 6, this.A04, c47822Cs.A04);
                } else if (ordinal == 2) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i6 = c47822Cs.A01;
                    if (i6 != 0) {
                        this.A01 = i6;
                    }
                    this.A00 |= c47822Cs.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r4) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    if (this.A01 == 1) {
                                        c87243zL = (C87243zL) ((C47832Ct) this.A04).AVX();
                                    } else {
                                        c87243zL = null;
                                    }
                                    C0AX A092 = c0ro.A09(C47832Ct.A09.A0C(), c0rp);
                                    this.A04 = A092;
                                    if (c87243zL != null) {
                                        c87243zL.A03((C47832Ct) A092);
                                        this.A04 = c87243zL.A00();
                                    }
                                    this.A01 = 1;
                                } else if (A03 == 18) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A07 = A0A;
                                } else if (A03 == 24) {
                                    this.A00 |= 2;
                                    this.A02 = c0ro.A02();
                                } else if (A03 == 34) {
                                    C0CX c0cx = this.A03;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A03 = c0cx;
                                    }
                                    c0cx.add(c0ro.A09(C87263zN.A03.A0C(), c0rp));
                                } else if (A03 == 42) {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A05 = A0A2;
                                } else if (A03 == 50) {
                                    if (this.A01 == 6) {
                                        c87163zD = (C87163zD) ((C87233zK) this.A04).AVX();
                                    } else {
                                        c87163zD = null;
                                    }
                                    C0AX A093 = c0ro.A09(C87233zK.A04.A0C(), c0rp);
                                    this.A04 = A093;
                                    if (c87163zD != null) {
                                        c87163zD.A03((C87233zK) A093);
                                        this.A04 = c87163zD.A00();
                                    }
                                    this.A01 = 6;
                                } else if (A03 != 58) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    String A0A3 = c0ro.A0A();
                                    this.A00 |= 32;
                                    this.A06 = A0A3;
                                }
                            }
                            r4 = true;
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
                ((C0CY) this.A03).A00 = false;
                return null;
            case 4:
                return new C47822Cs();
            case 5:
                return new C0CT() { // from class: X.3zC
                    {
                        C47822Cs c47822Cs2 = C47822Cs.A08;
                    }
                };
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C47822Cs.class) {
                        if (A09 == null) {
                            A09 = new C0RR(A08);
                        }
                    }
                }
                return A09;
            default:
                throw new UnsupportedOperationException();
        }
        return A08;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if (this.A01 == 1) {
            i = C0RS.A0A(1, (C0Aa) this.A04) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 1) == 1) {
            i += C0RS.A0B(2, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A06(3, this.A02);
        }
        for (int i3 = 0; i3 < this.A03.size(); i3++) {
            i += C0RS.A0A(4, (C0AX) this.A03.get(i3));
        }
        if ((this.A00 & 4) == 4) {
            i += C0RS.A0B(5, this.A05);
        }
        if (this.A01 == 6) {
            i += C0RS.A0A(6, (C0Aa) this.A04);
        }
        if ((this.A00 & 32) == 32) {
            i += C0RS.A0B(7, this.A06);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if (this.A01 == 1) {
            c0rs.A0O(1, (C0Aa) this.A04);
        }
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(2, this.A07);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0K(3, this.A02);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            c0rs.A0O(4, (C0AX) this.A03.get(i));
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(5, this.A05);
        }
        if (this.A01 == 6) {
            c0rs.A0O(6, (C0Aa) this.A04);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(7, this.A06);
        }
        this.unknownFields.A02(c0rs);
    }
}
