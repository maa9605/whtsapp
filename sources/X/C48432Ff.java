package X;

import java.io.IOException;

/* renamed from: X.2Ff  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48432Ff extends C0AZ implements C0AY {
    public static final C48432Ff A0D;
    public static volatile C0RQ A0E;
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public C40521sP A07;
    public boolean A0C;
    public String A0A = "";
    public String A08 = "";
    public String A0B = "";
    public String A09 = "";
    public C0AN A06 = C0AN.A01;

    static {
        C48432Ff c48432Ff = new C48432Ff();
        A0D = c48432Ff;
        c48432Ff.A0E();
    }

    public static void A09(C48432Ff c48432Ff, C0AN c0an) {
        c48432Ff.A04 |= 1024;
        c48432Ff.A06 = c0an;
    }

    public static void A0A(C48432Ff c48432Ff, C40521sP c40521sP) {
        if (c40521sP != null) {
            c48432Ff.A07 = c40521sP;
            c48432Ff.A04 |= 2048;
            return;
        }
        throw null;
    }

    public static void A0B(C48432Ff c48432Ff, String str) {
        if (str != null) {
            c48432Ff.A04 |= 4;
            c48432Ff.A0A = str;
            return;
        }
        throw null;
    }

    public static void A0C(C48432Ff c48432Ff, String str) {
        if (str != null) {
            c48432Ff.A04 |= 8;
            c48432Ff.A08 = str;
            return;
        }
        throw null;
    }

    public static void A0D(C48432Ff c48432Ff, String str) {
        if (str != null) {
            c48432Ff.A04 |= 16;
            c48432Ff.A0B = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        int i = 1024;
        int i2 = 512;
        switch (c0rl.ordinal()) {
            case 0:
                return A0D;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48432Ff c48432Ff = (C48432Ff) obj2;
                int i3 = this.A04;
                boolean z = (i3 & 1) == 1;
                double d = this.A00;
                int i4 = c48432Ff.A04;
                this.A00 = c0rm.AW3(z, d, (i4 & 1) == 1, c48432Ff.A00);
                this.A01 = c0rm.AW3((i3 & 2) == 2, this.A01, (i4 & 2) == 2, c48432Ff.A01);
                this.A0A = c0rm.AWD((i3 & 4) == 4, this.A0A, (i4 & 4) == 4, c48432Ff.A0A);
                this.A08 = c0rm.AWD((i3 & 8) == 8, this.A08, (i4 & 8) == 8, c48432Ff.A08);
                this.A0B = c0rm.AWD((i3 & 16) == 16, this.A0B, (i4 & 16) == 16, c48432Ff.A0B);
                this.A0C = c0rm.AW1((i3 & 32) == 32, this.A0C, (i4 & 32) == 32, c48432Ff.A0C);
                this.A03 = c0rm.AW5((i3 & 64) == 64, this.A03, (i4 & 64) == 64, c48432Ff.A03);
                this.A02 = c0rm.AW4((i3 & 128) == 128, this.A02, (i4 & 128) == 128, c48432Ff.A02);
                this.A05 = c0rm.AW5((i3 & 256) == 256, this.A05, (i4 & 256) == 256, c48432Ff.A05);
                this.A09 = c0rm.AWD((i3 & 512) == 512, this.A09, (i4 & 512) == 512, c48432Ff.A09);
                this.A06 = c0rm.AW2((i3 & 1024) == 1024, this.A06, (i4 & 1024) == 1024, c48432Ff.A06);
                this.A07 = (C40521sP) c0rm.AW9(this.A07, c48432Ff.A07);
                if (c0rm == C0RN.A00) {
                    this.A04 |= c48432Ff.A04;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    break;
                                case 9:
                                    this.A04 |= 1;
                                    this.A00 = Double.longBitsToDouble(c0ro.A05());
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 17:
                                    this.A04 |= 2;
                                    this.A01 = Double.longBitsToDouble(c0ro.A05());
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 26:
                                    String A0A = c0ro.A0A();
                                    this.A04 |= 4;
                                    this.A0A = A0A;
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 34:
                                    String A0A2 = c0ro.A0A();
                                    this.A04 |= 8;
                                    this.A08 = A0A2;
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 42:
                                    String A0A3 = c0ro.A0A();
                                    this.A04 |= 16;
                                    this.A0B = A0A3;
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 48:
                                    this.A04 |= 32;
                                    this.A0C = c0ro.A0F();
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 56:
                                    this.A04 |= 64;
                                    this.A03 = c0ro.A02();
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 69:
                                    this.A04 |= 128;
                                    this.A02 = Float.intBitsToFloat(c0ro.A01());
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case C0M6.A02 /* 72 */:
                                    this.A04 |= 256;
                                    this.A05 = c0ro.A02();
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 90:
                                    String A0A4 = c0ro.A0A();
                                    this.A04 |= i2;
                                    this.A09 = A0A4;
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 130:
                                    this.A04 |= i;
                                    this.A06 = c0ro.A08();
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                case 138:
                                    if ((this.A04 & 2048) == 2048) {
                                        c87333zU = (C87333zU) this.A07.AVX();
                                    } else {
                                        c87333zU = null;
                                    }
                                    C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                    this.A07 = c40521sP;
                                    if (c87333zU != null) {
                                        c87333zU.A03(c40521sP);
                                        this.A07 = (C40521sP) c87333zU.A00();
                                    }
                                    this.A04 |= 2048;
                                    continue;
                                    i = 1024;
                                    i2 = 512;
                                default:
                                    if (!A0I(A03, c0ro)) {
                                        break;
                                    } else {
                                        continue;
                                        i = 1024;
                                        i2 = 512;
                                    }
                            }
                            z2 = true;
                            i = 1024;
                            i2 = 512;
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
                return null;
            case 4:
                return new C48432Ff();
            case 5:
                return new C0CT() { // from class: X.2Fe
                    {
                        C48432Ff c48432Ff2 = C48432Ff.A0D;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0E == null) {
                    synchronized (C48432Ff.class) {
                        if (A0E == null) {
                            A0E = new C0RR(A0D);
                        }
                    }
                }
                return A0E;
            default:
                throw new UnsupportedOperationException();
        }
        return A0D;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A07;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A04;
        int A01 = (i2 & 1) == 1 ? 0 + C0RS.A01(1) : 0;
        if ((i2 & 2) == 2) {
            A01 += C0RS.A01(2);
        }
        if ((i2 & 4) == 4) {
            A01 += C0RS.A0B(3, this.A0A);
        }
        if ((this.A04 & 8) == 8) {
            A01 += C0RS.A0B(4, this.A08);
        }
        if ((this.A04 & 16) == 16) {
            A01 += C0RS.A0B(5, this.A0B);
        }
        int i3 = this.A04;
        if ((i3 & 32) == 32) {
            A01 += C0RS.A00(6);
        }
        if ((i3 & 64) == 64) {
            A01 += C0RS.A06(7, this.A03);
        }
        if ((i3 & 128) == 128) {
            A01 += C0RS.A03(64) + 4;
        }
        if ((i3 & 256) == 256) {
            A01 += C0RS.A06(9, this.A05);
        }
        if ((i3 & 512) == 512) {
            A01 += C0RS.A0B(11, this.A09);
        }
        int i4 = this.A04;
        if ((i4 & 1024) == 1024) {
            A01 += C0RS.A09(16, this.A06);
        }
        if ((i4 & 2048) == 2048) {
            A01 += C0RS.A0A(17, A0i());
        }
        int A00 = this.unknownFields.A00() + A01;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A04 & 1) == 1) {
            c0rs.A0G(1, this.A00);
        }
        if ((this.A04 & 2) == 2) {
            c0rs.A0G(2, this.A01);
        }
        if ((this.A04 & 4) == 4) {
            c0rs.A0P(3, this.A0A);
        }
        if ((this.A04 & 8) == 8) {
            c0rs.A0P(4, this.A08);
        }
        if ((this.A04 & 16) == 16) {
            c0rs.A0P(5, this.A0B);
        }
        if ((this.A04 & 32) == 32) {
            c0rs.A0Q(6, this.A0C);
        }
        if ((this.A04 & 64) == 64) {
            c0rs.A0K(7, this.A03);
        }
        if ((this.A04 & 128) == 128) {
            c0rs.A0H(8, Float.floatToRawIntBits(this.A02));
        }
        if ((this.A04 & 256) == 256) {
            c0rs.A0K(9, this.A05);
        }
        if ((this.A04 & 512) == 512) {
            c0rs.A0P(11, this.A09);
        }
        if ((this.A04 & 1024) == 1024) {
            c0rs.A0N(16, this.A06);
        }
        if ((this.A04 & 2048) == 2048) {
            c0rs.A0O(17, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
