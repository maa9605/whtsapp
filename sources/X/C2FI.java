package X;

import java.io.IOException;

/* renamed from: X.2FI */
/* loaded from: classes2.dex */
public final class C2FI extends C0AZ implements C0AY {
    public static final C2FI A08;
    public static volatile C0RQ A09;
    public int A00;
    public int A02;
    public C40521sP A04;
    public Object A05;
    public int A01 = 0;
    public String A06 = "";
    public String A07 = "";
    public C0CX A03 = C0RU.A01;

    static {
        C2FI c2fi = new C2FI();
        A08 = c2fi;
        c2fi.A0E();
    }

    public static void A09(C2FI c2fi, C40521sP c40521sP) {
        if (c40521sP != null) {
            c2fi.A04 = c40521sP;
            c2fi.A00 |= 128;
            return;
        }
        throw null;
    }

    public static void A0A(C2FI c2fi, EnumC55382kK enumC55382kK) {
        if (enumC55382kK != null) {
            c2fi.A00 |= 256;
            c2fi.A02 = enumC55382kK.value;
            return;
        }
        throw null;
    }

    public static void A0B(C2FI c2fi, C2FV c2fv) {
        if (c2fi != null) {
            c2fi.A05 = c2fv.A01();
            c2fi.A01 = 2;
            return;
        }
        throw null;
    }

    public static void A0C(C2FI c2fi, AnonymousClass249 anonymousClass249) {
        if (anonymousClass249 != null) {
            c2fi.A05 = anonymousClass249;
            c2fi.A01 = 3;
            return;
        }
        throw null;
    }

    public static void A0D(C2FI c2fi, C48422Fe c48422Fe) {
        if (c2fi != null) {
            c2fi.A05 = c48422Fe.A01();
            c2fi.A01 = 5;
            return;
        }
        throw null;
    }

    public static void A0E(C2FI c2fi, C48622Fy c48622Fy) {
        if (c2fi != null) {
            c2fi.A05 = c48622Fy.A01();
            c2fi.A01 = 4;
            return;
        }
        throw null;
    }

    public static void A0F(C2FI c2fi, String str) {
        if (str != null) {
            c2fi.A01 = 1;
            c2fi.A05 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        C48422Fe c48422Fe;
        C48622Fy c48622Fy;
        C2G6 c2g6;
        C2FV c2fv;
        EnumC79173lD enumC79173lD = null;
        switch (c0rl.ordinal()) {
            case 0:
                return A08;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2FI c2fi = (C2FI) obj2;
                int i = this.A00;
                boolean z = (i & 32) == 32;
                String str = this.A06;
                int i2 = c2fi.A00;
                this.A06 = c0rm.AWD(z, str, (i2 & 32) == 32, c2fi.A06);
                this.A07 = c0rm.AWD((i & 64) == 64, this.A07, (i2 & 64) == 64, c2fi.A07);
                this.A04 = (C40521sP) c0rm.AW9(this.A04, c2fi.A04);
                this.A03 = c0rm.AW7(this.A03, c2fi.A03);
                this.A02 = c0rm.AW5((this.A00 & 256) == 256, this.A02, (c2fi.A00 & 256) == 256, c2fi.A02);
                int i3 = c2fi.A01;
                if (i3 == 0) {
                    enumC79173lD = EnumC79173lD.HEADER_NOT_SET;
                } else if (i3 == 1) {
                    enumC79173lD = EnumC79173lD.TEXT;
                } else if (i3 == 2) {
                    enumC79173lD = EnumC79173lD.DOCUMENT_MESSAGE;
                } else if (i3 == 3) {
                    enumC79173lD = EnumC79173lD.IMAGE_MESSAGE;
                } else if (i3 == 4) {
                    enumC79173lD = EnumC79173lD.VIDEO_MESSAGE;
                } else if (i3 == 5) {
                    enumC79173lD = EnumC79173lD.LOCATION_MESSAGE;
                }
                int ordinal = enumC79173lD.ordinal();
                if (ordinal == 0) {
                    this.A05 = c0rm.AWC(this.A01 == 1, this.A05, c2fi.A05);
                } else if (ordinal == 1) {
                    this.A05 = c0rm.AWA(this.A01 == 2, this.A05, c2fi.A05);
                } else if (ordinal == 2) {
                    this.A05 = c0rm.AWA(this.A01 == 3, this.A05, c2fi.A05);
                } else if (ordinal == 3) {
                    this.A05 = c0rm.AWA(this.A01 == 4, this.A05, c2fi.A05);
                } else if (ordinal == 4) {
                    this.A05 = c0rm.AWA(this.A01 == 5, this.A05, c2fi.A05);
                } else if (ordinal == 5) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i4 = c2fi.A01;
                    if (i4 != 0) {
                        this.A01 = i4;
                    }
                    this.A00 |= c2fi.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    break;
                                case 10:
                                    String A0A = c0ro.A0A();
                                    this.A01 = 1;
                                    this.A05 = A0A;
                                    continue;
                                case 18:
                                    if (this.A01 == 2) {
                                        c2fv = (C2FV) ((C24B) this.A05).AVX();
                                    } else {
                                        c2fv = null;
                                    }
                                    C0AX A092 = c0ro.A09(C24B.A0K.A0C(), c0rp);
                                    this.A05 = A092;
                                    if (c2fv != null) {
                                        c2fv.A03((C24B) A092);
                                        this.A05 = c2fv.A00();
                                    }
                                    this.A01 = 2;
                                    continue;
                                case 26:
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
                                    continue;
                                case 34:
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
                                    continue;
                                case 42:
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
                                    continue;
                                case 50:
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 32;
                                    this.A06 = A0A2;
                                    continue;
                                case 58:
                                    String A0A3 = c0ro.A0A();
                                    this.A00 |= 64;
                                    this.A07 = A0A3;
                                    continue;
                                case 66:
                                    if ((this.A00 & 128) == 128) {
                                        c87333zU = (C87333zU) this.A04.AVX();
                                    } else {
                                        c87333zU = null;
                                    }
                                    C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                    this.A04 = c40521sP;
                                    if (c87333zU != null) {
                                        c87333zU.A03(c40521sP);
                                        this.A04 = (C40521sP) c87333zU.A00();
                                    }
                                    this.A00 |= 128;
                                    continue;
                                case 74:
                                    C0CX c0cx = this.A03;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A03 = c0cx;
                                    }
                                    c0cx.add(c0ro.A09(C53522h3.A05.A0C(), c0rp));
                                    continue;
                                case 80:
                                    int A02 = c0ro.A02();
                                    if (EnumC55382kK.A00(A02) == null) {
                                        super.A0F(10, A02);
                                    } else {
                                        this.A00 |= 256;
                                        this.A02 = A02;
                                        continue;
                                    }
                                default:
                                    if (!A0I(A03, c0ro)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            r5 = true;
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
                ((C0CY) this.A03).A00 = false;
                return null;
            case 4:
                return new C2FI();
            case 5:
                return new C0CT() { // from class: X.2GC
                    {
                        C2FI c2fi2 = C2FI.A08;
                    }
                };
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C2FI.class) {
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

    public C40521sP A0i() {
        C40521sP c40521sP = this.A04;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    public String A0j() {
        return this.A01 == 1 ? (String) this.A05 : "";
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if (this.A01 == 1) {
            i = C0RS.A0B(1, A0j()) + 0;
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
            i += C0RS.A0B(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            i += C0RS.A0B(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            i += C0RS.A0A(8, A0i());
        }
        for (int i3 = 0; i3 < this.A03.size(); i3++) {
            i += C0RS.A0A(9, (C0AX) this.A03.get(i3));
        }
        if ((this.A00 & 256) == 256) {
            i += C0RS.A04(10, this.A02);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if (this.A01 == 1) {
            c0rs.A0P(1, A0j());
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
            c0rs.A0P(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0P(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0O(8, A0i());
        }
        for (int i = 0; i < this.A03.size(); i++) {
            c0rs.A0O(9, (C0AX) this.A03.get(i));
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0I(10, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
