package X;

import java.io.IOException;

/* renamed from: X.2kR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55452kR extends C0AZ implements C0AY {
    public static final C55452kR A06;
    public static volatile C0RQ A07;
    public int A00;
    public int A01 = 0;
    public C0CX A02 = C0RU.A01;
    public C2G3 A03;
    public C2G3 A04;
    public Object A05;

    static {
        C55452kR c55452kR = new C55452kR();
        A06 = c55452kR;
        c55452kR.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C2G8 c2g8;
        C2G8 c2g82;
        C48422Fe c48422Fe;
        C48622Fy c48622Fy;
        C2G6 c2g6;
        C2G8 c2g83;
        C2FV c2fv;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C55452kR c55452kR = (C55452kR) obj2;
                this.A03 = (C2G3) c0rm.AW9(this.A03, c55452kR.A03);
                this.A04 = (C2G3) c0rm.AW9(this.A04, c55452kR.A04);
                this.A02 = c0rm.AW7(this.A02, c55452kR.A02);
                int ordinal = c55452kR.A0k().ordinal();
                if (ordinal == 0) {
                    this.A05 = c0rm.AWA(this.A01 == 1, this.A05, c55452kR.A05);
                } else if (ordinal == 1) {
                    this.A05 = c0rm.AWA(this.A01 == 2, this.A05, c55452kR.A05);
                } else if (ordinal == 2) {
                    this.A05 = c0rm.AWA(this.A01 == 3, this.A05, c55452kR.A05);
                } else if (ordinal == 3) {
                    this.A05 = c0rm.AWA(this.A01 == 4, this.A05, c55452kR.A05);
                } else if (ordinal == 4) {
                    this.A05 = c0rm.AWA(this.A01 == 5, this.A05, c55452kR.A05);
                } else if (ordinal == 5) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i = c55452kR.A01;
                    if (i != 0) {
                        this.A01 = i;
                    }
                    this.A00 |= c55452kR.A00;
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
                                if (this.A01 == 1) {
                                    c2fv = (C2FV) ((C24B) this.A05).AVX();
                                } else {
                                    c2fv = null;
                                }
                                C0AX A09 = c0ro.A09(C24B.A0K.A0C(), c0rp);
                                this.A05 = A09;
                                if (c2fv != null) {
                                    c2fv.A03((C24B) A09);
                                    this.A05 = c2fv.A00();
                                }
                                this.A01 = 1;
                            } else if (A03 == 18) {
                                if (this.A01 == 2) {
                                    c2g83 = (C2G8) ((C2G3) this.A05).AVX();
                                } else {
                                    c2g83 = null;
                                }
                                C0AX A092 = c0ro.A09(C2G3.A0A.A0C(), c0rp);
                                this.A05 = A092;
                                if (c2g83 != null) {
                                    c2g83.A03((C2G3) A092);
                                    this.A05 = c2g83.A00();
                                }
                                this.A01 = 2;
                            } else if (A03 == 26) {
                                if (this.A01 == 3) {
                                    c2g6 = (C2G6) ((AnonymousClass249) this.A05).AVX();
                                } else {
                                    c2g6 = null;
                                }
                                C0AX A093 = c0ro.A09(AnonymousClass249.A0Q.A0C(), c0rp);
                                this.A05 = A093;
                                if (c2g6 != null) {
                                    c2g6.A03((AnonymousClass249) A093);
                                    this.A05 = c2g6.A00();
                                }
                                this.A01 = 3;
                            } else if (A03 == 34) {
                                if (this.A01 == 4) {
                                    c48622Fy = (C48622Fy) ((C24D) this.A05).AVX();
                                } else {
                                    c48622Fy = null;
                                }
                                C0AX A094 = c0ro.A09(C24D.A0N.A0C(), c0rp);
                                this.A05 = A094;
                                if (c48622Fy != null) {
                                    c48622Fy.A03((C24D) A094);
                                    this.A05 = c48622Fy.A00();
                                }
                                this.A01 = 4;
                            } else if (A03 == 42) {
                                if (this.A01 == 5) {
                                    c48422Fe = (C48422Fe) ((C48432Ff) this.A05).AVX();
                                } else {
                                    c48422Fe = null;
                                }
                                C0AX A095 = c0ro.A09(C48432Ff.A0D.A0C(), c0rp);
                                this.A05 = A095;
                                if (c48422Fe != null) {
                                    c48422Fe.A03((C48432Ff) A095);
                                    this.A05 = c48422Fe.A00();
                                }
                                this.A01 = 5;
                            } else if (A03 == 50) {
                                if ((this.A00 & 32) == 32) {
                                    c2g82 = (C2G8) this.A03.AVX();
                                } else {
                                    c2g82 = null;
                                }
                                C2G3 c2g3 = (C2G3) c0ro.A09(C2G3.A0A.A0C(), c0rp);
                                this.A03 = c2g3;
                                if (c2g82 != null) {
                                    c2g82.A03(c2g3);
                                    this.A03 = (C2G3) c2g82.A00();
                                }
                                this.A00 |= 32;
                            } else if (A03 == 58) {
                                if ((this.A00 & 64) == 64) {
                                    c2g8 = (C2G8) this.A04.AVX();
                                } else {
                                    c2g8 = null;
                                }
                                C2G3 c2g32 = (C2G3) c0ro.A09(C2G3.A0A.A0C(), c0rp);
                                this.A04 = c2g32;
                                if (c2g8 != null) {
                                    c2g8.A03(c2g32);
                                    this.A04 = (C2G3) c2g8.A00();
                                }
                                this.A00 |= 64;
                            } else if (A03 != 66) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                C0CX c0cx = this.A02;
                                C0CX c0cx2 = c0cx;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx2 = C0AZ.A05(c0cx);
                                    this.A02 = c0cx2;
                                }
                                c0cx2.add(c0ro.A09(C40V.A04.A0C(), c0rp));
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
                ((C0CY) this.A02).A00 = false;
                return null;
            case 4:
                return new C55452kR();
            case 5:
                return new C0CT() { // from class: X.40L
                    {
                        C55452kR c55452kR2 = C55452kR.A06;
                    }
                };
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C55452kR.class) {
                        if (A07 == null) {
                            A07 = new C0RR(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    public C2G3 A0i() {
        C2G3 c2g3 = this.A03;
        return c2g3 == null ? C2G3.A0A : c2g3;
    }

    public C2G3 A0j() {
        if (this.A01 == 2) {
            return (C2G3) this.A05;
        }
        return C2G3.A0A;
    }

    public EnumC55462kS A0k() {
        int i = this.A01;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return EnumC55462kS.LOCATION_MESSAGE;
                        }
                        return EnumC55462kS.VIDEO_MESSAGE;
                    }
                    return EnumC55462kS.IMAGE_MESSAGE;
                }
                return EnumC55462kS.HIGHLY_STRUCTURED_MESSAGE;
            }
            return EnumC55462kS.DOCUMENT_MESSAGE;
        }
        return EnumC55462kS.TITLE_NOT_SET;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if (this.A01 == 1) {
            i = C0RS.A0A(1, (C0Aa) this.A05) + 0;
        } else {
            i = 0;
        }
        if (this.A01 == 2) {
            i += C0RS.A0A(2, (C0Aa) this.A05);
        }
        if (this.A01 == 3) {
            i += C0RS.A0A(3, (C0Aa) this.A05);
        }
        if (this.A01 == 4) {
            i += C0RS.A0A(4, (C0Aa) this.A05);
        }
        if (this.A01 == 5) {
            i += C0RS.A0A(5, (C0Aa) this.A05);
        }
        if ((this.A00 & 32) == 32) {
            i += C0RS.A0A(6, A0i());
        }
        if ((this.A00 & 64) == 64) {
            C2G3 c2g3 = this.A04;
            if (c2g3 == null) {
                c2g3 = C2G3.A0A;
            }
            i += C0RS.A0A(7, c2g3);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += C0RS.A0A(8, (C0AX) this.A02.get(i3));
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if (this.A01 == 1) {
            c0rs.A0O(1, (C0Aa) this.A05);
        }
        if (this.A01 == 2) {
            c0rs.A0O(2, (C0Aa) this.A05);
        }
        if (this.A01 == 3) {
            c0rs.A0O(3, (C0Aa) this.A05);
        }
        if (this.A01 == 4) {
            c0rs.A0O(4, (C0Aa) this.A05);
        }
        if (this.A01 == 5) {
            c0rs.A0O(5, (C0Aa) this.A05);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0O(6, A0i());
        }
        if ((this.A00 & 64) == 64) {
            C2G3 c2g3 = this.A04;
            if (c2g3 == null) {
                c2g3 = C2G3.A0A;
            }
            c0rs.A0O(7, c2g3);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0O(8, (C0AX) this.A02.get(i));
        }
        this.unknownFields.A02(c0rs);
    }
}
