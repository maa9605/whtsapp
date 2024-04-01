package X;

import java.io.IOException;

/* renamed from: X.2Fc  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48402Fc extends C0AZ implements C0AY {
    public static final C48402Fc A09;
    public static volatile C0RQ A0A;
    public int A00;
    public int A01;
    public C40521sP A03;
    public AnonymousClass408 A04;
    public String A08 = "";
    public String A06 = "";
    public String A05 = "";
    public C0CX A02 = C0RU.A01;
    public String A07 = "";

    static {
        C48402Fc c48402Fc = new C48402Fc();
        A09 = c48402Fc;
        c48402Fc.A0E();
    }

    public static void A09(C48402Fc c48402Fc, C40521sP c40521sP) {
        if (c40521sP != null) {
            c48402Fc.A03 = c40521sP;
            c48402Fc.A00 |= 64;
            return;
        }
        throw null;
    }

    public static void A0A(C48402Fc c48402Fc, EnumC55362kI enumC55362kI) {
        if (enumC55362kI != null) {
            c48402Fc.A00 |= 8;
            c48402Fc.A01 = enumC55362kI.value;
            return;
        }
        throw null;
    }

    public static void A0B(C48402Fc c48402Fc, AnonymousClass408 anonymousClass408) {
        if (anonymousClass408 != null) {
            c48402Fc.A04 = anonymousClass408;
            c48402Fc.A00 |= 16;
            return;
        }
        throw null;
    }

    public static void A0C(C48402Fc c48402Fc, C40E c40e) {
        if (c40e != null) {
            C0CX c0cx = c48402Fc.A02;
            if (!((C0CY) c0cx).A00) {
                c0cx = C0AZ.A05(c0cx);
                c48402Fc.A02 = c0cx;
            }
            c0cx.add(c40e);
            return;
        }
        throw null;
    }

    public static void A0D(C48402Fc c48402Fc, String str) {
        if (str != null) {
            c48402Fc.A00 |= 1;
            c48402Fc.A08 = str;
            return;
        }
        throw null;
    }

    public static void A0E(C48402Fc c48402Fc, String str) {
        if (str != null) {
            c48402Fc.A00 |= 2;
            c48402Fc.A06 = str;
            return;
        }
        throw null;
    }

    public static void A0F(C48402Fc c48402Fc, String str) {
        if (str != null) {
            c48402Fc.A00 |= 4;
            c48402Fc.A05 = str;
            return;
        }
        throw null;
    }

    public static void A0G(C48402Fc c48402Fc, String str) {
        if (str != null) {
            c48402Fc.A00 |= 32;
            c48402Fc.A07 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        AnonymousClass407 anonymousClass407;
        EnumC55362kI enumC55362kI;
        switch (c0rl.ordinal()) {
            case 0:
                return A09;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48402Fc c48402Fc = (C48402Fc) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A08;
                int i2 = c48402Fc.A00;
                this.A08 = c0rm.AWD(z, str, (i2 & 1) == 1, c48402Fc.A08);
                this.A06 = c0rm.AWD((i & 2) == 2, this.A06, (i2 & 2) == 2, c48402Fc.A06);
                this.A05 = c0rm.AWD((i & 4) == 4, this.A05, (i2 & 4) == 4, c48402Fc.A05);
                this.A01 = c0rm.AW5((i & 8) == 8, this.A01, (i2 & 8) == 8, c48402Fc.A01);
                this.A02 = c0rm.AW7(this.A02, c48402Fc.A02);
                this.A04 = (AnonymousClass408) c0rm.AW9(this.A04, c48402Fc.A04);
                this.A07 = c0rm.AWD((this.A00 & 32) == 32, this.A07, (c48402Fc.A00 & 32) == 32, c48402Fc.A07);
                this.A03 = (C40521sP) c0rm.AW9(this.A03, c48402Fc.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c48402Fc.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 1;
                                this.A08 = A0A2;
                            } else if (A03 == 18) {
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A06 = A0A3;
                            } else if (A03 == 26) {
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 4;
                                this.A05 = A0A4;
                            } else if (A03 == 32) {
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC55362kI = EnumC55362kI.UNKNOWN;
                                } else if (A02 != 1) {
                                    enumC55362kI = A02 != 2 ? null : EnumC55362kI.PRODUCT_LIST;
                                } else {
                                    enumC55362kI = EnumC55362kI.SINGLE_SELECT;
                                }
                                if (enumC55362kI == null) {
                                    super.A0F(4, A02);
                                } else {
                                    this.A00 |= 8;
                                    this.A01 = A02;
                                }
                            } else if (A03 == 42) {
                                C0CX c0cx = this.A02;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A02 = c0cx;
                                }
                                c0cx.add(c0ro.A09(C40E.A03.A0C(), c0rp));
                            } else if (A03 == 50) {
                                if ((this.A00 & 16) == 16) {
                                    anonymousClass407 = (AnonymousClass407) this.A04.AVX();
                                } else {
                                    anonymousClass407 = null;
                                }
                                AnonymousClass408 anonymousClass408 = (AnonymousClass408) c0ro.A09(AnonymousClass408.A04.A0C(), c0rp);
                                this.A04 = anonymousClass408;
                                if (anonymousClass407 != null) {
                                    anonymousClass407.A03(anonymousClass408);
                                    this.A04 = (AnonymousClass408) anonymousClass407.A00();
                                }
                                this.A00 |= 16;
                            } else if (A03 == 58) {
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 32;
                                this.A07 = A0A5;
                            } else if (A03 != 66) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 64) == 64) {
                                    c87333zU = (C87333zU) this.A03.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A03 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A03 = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 64;
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
                ((C0CY) this.A02).A00 = false;
                return null;
            case 4:
                return new C48402Fc();
            case 5:
                return new C0CT() { // from class: X.2GA
                    {
                        C48402Fc c48402Fc2 = C48402Fc.A09;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C48402Fc.class) {
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

    public C40521sP A0i() {
        C40521sP c40521sP = this.A03;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    public EnumC55362kI A0j() {
        EnumC55362kI enumC55362kI;
        int i = this.A01;
        if (i == 0) {
            enumC55362kI = EnumC55362kI.UNKNOWN;
        } else if (i != 1) {
            if (i == 2) {
                enumC55362kI = EnumC55362kI.PRODUCT_LIST;
            }
            return EnumC55362kI.UNKNOWN;
        } else {
            enumC55362kI = EnumC55362kI.SINGLE_SELECT;
        }
        if (enumC55362kI != null) {
            return enumC55362kI;
        }
        return EnumC55362kI.UNKNOWN;
    }

    public AnonymousClass408 A0k() {
        AnonymousClass408 anonymousClass408 = this.A04;
        return anonymousClass408 == null ? AnonymousClass408.A04 : anonymousClass408;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A08) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0B(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            i += C0RS.A0B(3, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            i += C0RS.A04(4, this.A01);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i += C0RS.A0A(5, (C0AX) this.A02.get(i3));
        }
        if ((this.A00 & 16) == 16) {
            i += C0RS.A0A(6, A0k());
        }
        if ((this.A00 & 32) == 32) {
            i += C0RS.A0B(7, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            i += C0RS.A0A(8, A0i());
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A08);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0I(4, this.A01);
        }
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0O(5, (C0AX) this.A02.get(i));
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0O(6, A0k());
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(7, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0O(8, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
