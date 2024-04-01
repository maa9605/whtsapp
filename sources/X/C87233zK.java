package X;

import java.io.IOException;

/* renamed from: X.3zK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87233zK extends C0AZ implements C0AY {
    public static final C87233zK A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01 = 0;
    public int A02;
    public Object A03;

    static {
        C87233zK c87233zK = new C87233zK();
        A04 = c87233zK;
        c87233zK.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87173zE c87173zE;
        C87213zI c87213zI;
        C87193zG c87193zG;
        EnumC79093l4 enumC79093l4 = null;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87233zK c87233zK = (C87233zK) obj2;
                this.A02 = c0rm.AW5((this.A00 & 8) == 8, this.A02, (c87233zK.A00 & 8) == 8, c87233zK.A02);
                int i = c87233zK.A01;
                if (i == 0) {
                    enumC79093l4 = EnumC79093l4.BUTTON_NOT_SET;
                } else if (i == 1) {
                    enumC79093l4 = EnumC79093l4.QUICK_REPLY_BUTTON;
                } else if (i == 2) {
                    enumC79093l4 = EnumC79093l4.URL_BUTTON;
                } else if (i == 3) {
                    enumC79093l4 = EnumC79093l4.CALL_BUTTON;
                }
                int ordinal = enumC79093l4.ordinal();
                if (ordinal == 0) {
                    this.A03 = c0rm.AWA(this.A01 == 1, this.A03, c87233zK.A03);
                } else if (ordinal == 1) {
                    this.A03 = c0rm.AWA(this.A01 == 2, this.A03, c87233zK.A03);
                } else if (ordinal == 2) {
                    this.A03 = c0rm.AWA(this.A01 == 3, this.A03, c87233zK.A03);
                } else if (ordinal == 3) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i2 = c87233zK.A01;
                    if (i2 != 0) {
                        this.A01 = i2;
                    }
                    this.A00 |= c87233zK.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r2) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                if (this.A01 == 1) {
                                    c87193zG = (C87193zG) ((C87203zH) this.A03).AVX();
                                } else {
                                    c87193zG = null;
                                }
                                C0AX A09 = c0ro.A09(C87203zH.A02.A0C(), c0rp);
                                this.A03 = A09;
                                if (c87193zG != null) {
                                    c87193zG.A03((C87203zH) A09);
                                    this.A03 = c87193zG.A00();
                                }
                                this.A01 = 1;
                            } else if (A03 == 18) {
                                if (this.A01 == 2) {
                                    c87213zI = (C87213zI) ((C87223zJ) this.A03).AVX();
                                } else {
                                    c87213zI = null;
                                }
                                C0AX A092 = c0ro.A09(C87223zJ.A03.A0C(), c0rp);
                                this.A03 = A092;
                                if (c87213zI != null) {
                                    c87213zI.A03((C87223zJ) A092);
                                    this.A03 = c87213zI.A00();
                                }
                                this.A01 = 2;
                            } else if (A03 == 26) {
                                if (this.A01 == 3) {
                                    c87173zE = (C87173zE) ((C87183zF) this.A03).AVX();
                                } else {
                                    c87173zE = null;
                                }
                                C0AX A093 = c0ro.A09(C87183zF.A03.A0C(), c0rp);
                                this.A03 = A093;
                                if (c87173zE != null) {
                                    c87173zE.A03((C87183zF) A093);
                                    this.A03 = c87173zE.A00();
                                }
                                this.A01 = 3;
                            } else if (A03 != 32) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 8;
                                this.A02 = c0ro.A02();
                            }
                        }
                        r2 = true;
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
                return new C87233zK();
            case 5:
                return new C0CT() { // from class: X.3zD
                    {
                        C87233zK c87233zK2 = C87233zK.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C87233zK.class) {
                        if (A05 == null) {
                            A05 = new C0RR(A04);
                        }
                    }
                }
                return A05;
            default:
                throw new UnsupportedOperationException();
        }
        return A04;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = this.A01 == 1 ? 0 + C0RS.A0A(1, (C0Aa) this.A03) : 0;
        if (this.A01 == 2) {
            A0A += C0RS.A0A(2, (C0Aa) this.A03);
        }
        if (this.A01 == 3) {
            A0A += C0RS.A0A(3, (C0Aa) this.A03);
        }
        if ((this.A00 & 8) == 8) {
            A0A += C0RS.A06(4, this.A02);
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if (this.A01 == 1) {
            c0rs.A0O(1, (C0Aa) this.A03);
        }
        if (this.A01 == 2) {
            c0rs.A0O(2, (C0Aa) this.A03);
        }
        if (this.A01 == 3) {
            c0rs.A0O(3, (C0Aa) this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0K(4, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
