package X;

import java.io.IOException;

/* renamed from: X.2gu */
/* loaded from: classes2.dex */
public final class C53432gu extends C0AZ implements C0AY {
    public static final C53432gu A07;
    public static volatile C0RQ A08;
    public int A00;
    public Object A03;
    public int A01 = 0;
    public String A04 = "";
    public String A05 = "";
    public C0CX A02 = C0RU.A01;
    public String A06 = "";

    static {
        C53432gu c53432gu = new C53432gu();
        A07 = c53432gu;
        c53432gu.A0E();
    }

    public static void A09(C53432gu c53432gu, C2FV c2fv) {
        if (c53432gu != null) {
            c53432gu.A03 = c2fv.A01();
            c53432gu.A01 = 1;
            return;
        }
        throw null;
    }

    public static void A0A(C53432gu c53432gu, C2G6 c2g6) {
        if (c53432gu != null) {
            c53432gu.A03 = c2g6.A01();
            c53432gu.A01 = 3;
            return;
        }
        throw null;
    }

    public static void A0B(C53432gu c53432gu, C48422Fe c48422Fe) {
        if (c53432gu != null) {
            c53432gu.A03 = c48422Fe.A01();
            c53432gu.A01 = 5;
            return;
        }
        throw null;
    }

    public static void A0C(C53432gu c53432gu, C48622Fy c48622Fy) {
        if (c53432gu != null) {
            c53432gu.A03 = c48622Fy.A01();
            c53432gu.A01 = 4;
            return;
        }
        throw null;
    }

    public static void A0D(C53432gu c53432gu, String str) {
        if (str != null) {
            c53432gu.A01 = 2;
            c53432gu.A03 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C48422Fe c48422Fe;
        C48622Fy c48622Fy;
        C2G6 c2g6;
        C2FV c2fv;
        switch (c0rl.ordinal()) {
            case 0:
                return A07;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C53432gu c53432gu = (C53432gu) obj2;
                int i = this.A00;
                boolean z = (i & 32) == 32;
                String str = this.A04;
                int i2 = c53432gu.A00;
                this.A04 = c0rm.AWD(z, str, (i2 & 32) == 32, c53432gu.A04);
                this.A05 = c0rm.AWD((i & 64) == 64, this.A05, (i2 & 64) == 64, c53432gu.A05);
                this.A02 = c0rm.AW7(this.A02, c53432gu.A02);
                this.A06 = c0rm.AWD((this.A00 & 128) == 128, this.A06, (c53432gu.A00 & 128) == 128, c53432gu.A06);
                int ordinal = c53432gu.A0i().ordinal();
                if (ordinal == 0) {
                    this.A03 = c0rm.AWA(this.A01 == 1, this.A03, c53432gu.A03);
                } else if (ordinal == 1) {
                    this.A03 = c0rm.AWC(this.A01 == 2, this.A03, c53432gu.A03);
                } else if (ordinal == 2) {
                    this.A03 = c0rm.AWA(this.A01 == 3, this.A03, c53432gu.A03);
                } else if (ordinal == 3) {
                    this.A03 = c0rm.AWA(this.A01 == 4, this.A03, c53432gu.A03);
                } else if (ordinal == 4) {
                    this.A03 = c0rm.AWA(this.A01 == 5, this.A03, c53432gu.A03);
                } else if (ordinal == 5) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i3 = c53432gu.A01;
                    if (i3 != 0) {
                        this.A01 = i3;
                    }
                    this.A00 |= c53432gu.A00;
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
                                if (this.A01 == 1) {
                                    c2fv = (C2FV) ((C24B) this.A03).AVX();
                                } else {
                                    c2fv = null;
                                }
                                C0AX A09 = c0ro.A09(C24B.A0K.A0C(), c0rp);
                                this.A03 = A09;
                                if (c2fv != null) {
                                    c2fv.A03((C24B) A09);
                                    this.A03 = c2fv.A00();
                                }
                                this.A01 = 1;
                            } else if (A03 == 18) {
                                String A0A = c0ro.A0A();
                                this.A01 = 2;
                                this.A03 = A0A;
                            } else if (A03 == 26) {
                                if (this.A01 == 3) {
                                    c2g6 = (C2G6) ((AnonymousClass249) this.A03).AVX();
                                } else {
                                    c2g6 = null;
                                }
                                C0AX A092 = c0ro.A09(AnonymousClass249.A0Q.A0C(), c0rp);
                                this.A03 = A092;
                                if (c2g6 != null) {
                                    c2g6.A03((AnonymousClass249) A092);
                                    this.A03 = c2g6.A00();
                                }
                                this.A01 = 3;
                            } else if (A03 == 34) {
                                if (this.A01 == 4) {
                                    c48622Fy = (C48622Fy) ((C24D) this.A03).AVX();
                                } else {
                                    c48622Fy = null;
                                }
                                C0AX A093 = c0ro.A09(C24D.A0N.A0C(), c0rp);
                                this.A03 = A093;
                                if (c48622Fy != null) {
                                    c48622Fy.A03((C24D) A093);
                                    this.A03 = c48622Fy.A00();
                                }
                                this.A01 = 4;
                            } else if (A03 == 42) {
                                if (this.A01 == 5) {
                                    c48422Fe = (C48422Fe) ((C48432Ff) this.A03).AVX();
                                } else {
                                    c48422Fe = null;
                                }
                                C0AX A094 = c0ro.A09(C48432Ff.A0D.A0C(), c0rp);
                                this.A03 = A094;
                                if (c48422Fe != null) {
                                    c48422Fe.A03((C48432Ff) A094);
                                    this.A03 = c48422Fe.A00();
                                }
                                this.A01 = 5;
                            } else if (A03 == 50) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 32;
                                this.A04 = A0A2;
                            } else if (A03 == 58) {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 64;
                                this.A05 = A0A3;
                            } else if (A03 == 66) {
                                C0CX c0cx = this.A02;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A02 = c0cx;
                                }
                                c0cx.add(c0ro.A09(C53452gw.A04.A0C(), c0rp));
                            } else if (A03 != 74) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A06 = A0A4;
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
                return new C53432gu();
            case 5:
                return new C0CT() { // from class: X.2gv
                    {
                        C53432gu c53432gu2 = C53432gu.A07;
                    }
                };
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C53432gu.class) {
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

    public EnumC55472kT A0i() {
        int i = this.A01;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return EnumC55472kT.LOCATION_MESSAGE;
                        }
                        return EnumC55472kT.VIDEO_MESSAGE;
                    }
                    return EnumC55472kT.IMAGE_MESSAGE;
                }
                return EnumC55472kT.HYDRATED_TITLE_TEXT;
            }
            return EnumC55472kT.DOCUMENT_MESSAGE;
        }
        return EnumC55472kT.TITLE_NOT_SET;
    }

    public C24D A0j() {
        if (this.A01 == 4) {
            return (C24D) this.A03;
        }
        return C24D.A0N;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        String str;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if (this.A01 == 1) {
            i = C0RS.A0A(1, (C0Aa) this.A03) + 0;
        } else {
            i = 0;
        }
        int i3 = this.A01;
        if (i3 == 2) {
            if (i3 == 2) {
                str = (String) this.A03;
            } else {
                str = "";
            }
            i += C0RS.A0B(2, str);
        }
        if (this.A01 == 3) {
            i += C0RS.A0A(3, (C0Aa) this.A03);
        }
        if (this.A01 == 4) {
            i += C0RS.A0A(4, (C0Aa) this.A03);
        }
        if (this.A01 == 5) {
            i += C0RS.A0A(5, (C0Aa) this.A03);
        }
        if ((this.A00 & 32) == 32) {
            i += C0RS.A0B(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            i += C0RS.A0B(7, this.A05);
        }
        for (int i4 = 0; i4 < this.A02.size(); i4++) {
            i += C0RS.A0A(8, (C0AX) this.A02.get(i4));
        }
        if ((this.A00 & 128) == 128) {
            i += C0RS.A0B(9, this.A06);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        String str;
        if (this.A01 == 1) {
            c0rs.A0O(1, (C0Aa) this.A03);
        }
        int i = this.A01;
        if (i == 2) {
            if (i == 2) {
                str = (String) this.A03;
            } else {
                str = "";
            }
            c0rs.A0P(2, str);
        }
        if (this.A01 == 3) {
            c0rs.A0O(3, (C0Aa) this.A03);
        }
        if (this.A01 == 4) {
            c0rs.A0O(4, (C0Aa) this.A03);
        }
        if (this.A01 == 5) {
            c0rs.A0O(5, (C0Aa) this.A03);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(6, this.A04);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0P(7, this.A05);
        }
        for (int i2 = 0; i2 < this.A02.size(); i2++) {
            c0rs.A0O(8, (C0AX) this.A02.get(i2));
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(9, this.A06);
        }
        this.unknownFields.A02(c0rs);
    }
}
