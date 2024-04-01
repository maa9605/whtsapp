package X;

import java.io.IOException;

/* renamed from: X.2Fb */
/* loaded from: classes2.dex */
public final class C48392Fb extends C0AZ implements C0AY {
    public static final C48392Fb A0B;
    public static volatile C0RQ A0C;
    public int A00;
    public int A01;
    public long A02;
    public C0AN A03;
    public C0AN A04;
    public C0AN A05;
    public C0AN A06;
    public String A07;
    public String A09 = "";
    public String A0A = "";
    public String A08 = "";

    static {
        C48392Fb c48392Fb = new C48392Fb();
        A0B = c48392Fb;
        c48392Fb.A0E();
    }

    public C48392Fb() {
        C0AN c0an = C0AN.A01;
        this.A06 = c0an;
        this.A04 = c0an;
        this.A03 = c0an;
        this.A07 = "";
        this.A05 = c0an;
    }

    public static void A09(C48392Fb c48392Fb, C0AN c0an) {
        c48392Fb.A01 |= 16;
        c48392Fb.A06 = c0an;
    }

    public static void A0A(C48392Fb c48392Fb, C0AN c0an) {
        c48392Fb.A01 |= 64;
        c48392Fb.A04 = c0an;
    }

    public static void A0B(C48392Fb c48392Fb, C0AN c0an) {
        c48392Fb.A01 |= 128;
        c48392Fb.A03 = c0an;
    }

    public static void A0C(C48392Fb c48392Fb, C0AN c0an) {
        c48392Fb.A01 |= 512;
        c48392Fb.A05 = c0an;
    }

    public static void A0D(C48392Fb c48392Fb, EnumC79253lM enumC79253lM) {
        if (enumC79253lM != null) {
            c48392Fb.A01 |= 4;
            c48392Fb.A00 = enumC79253lM.value;
            return;
        }
        throw null;
    }

    public static void A0E(C48392Fb c48392Fb, String str) {
        if (str != null) {
            c48392Fb.A01 |= 1;
            c48392Fb.A09 = str;
            return;
        }
        throw null;
    }

    public static void A0F(C48392Fb c48392Fb, String str) {
        if (str != null) {
            c48392Fb.A01 |= 2;
            c48392Fb.A0A = str;
            return;
        }
        throw null;
    }

    public static void A0G(C48392Fb c48392Fb, String str) {
        if (str != null) {
            c48392Fb.A01 |= 8;
            c48392Fb.A08 = str;
            return;
        }
        throw null;
    }

    public static void A0H(C48392Fb c48392Fb, String str) {
        if (str != null) {
            c48392Fb.A01 |= 256;
            c48392Fb.A07 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC79253lM enumC79253lM;
        switch (c0rl.ordinal()) {
            case 0:
                return A0B;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48392Fb c48392Fb = (C48392Fb) obj2;
                int i = this.A01;
                boolean z = (i & 1) == 1;
                String str = this.A09;
                int i2 = c48392Fb.A01;
                this.A09 = c0rm.AWD(z, str, (i2 & 1) == 1, c48392Fb.A09);
                this.A0A = c0rm.AWD((i & 2) == 2, this.A0A, (i2 & 2) == 2, c48392Fb.A0A);
                this.A00 = c0rm.AW5((i & 4) == 4, this.A00, (i2 & 4) == 4, c48392Fb.A00);
                this.A08 = c0rm.AWD((i & 8) == 8, this.A08, (i2 & 8) == 8, c48392Fb.A08);
                this.A06 = c0rm.AW2((i & 16) == 16, this.A06, (i2 & 16) == 16, c48392Fb.A06);
                int i3 = this.A01;
                boolean z2 = (i3 & 32) == 32;
                long j = this.A02;
                int i4 = c48392Fb.A01;
                this.A02 = c0rm.AW8(z2, j, (i4 & 32) == 32, c48392Fb.A02);
                this.A04 = c0rm.AW2((i3 & 64) == 64, this.A04, (i4 & 64) == 64, c48392Fb.A04);
                this.A03 = c0rm.AW2((this.A01 & 128) == 128, this.A03, (c48392Fb.A01 & 128) == 128, c48392Fb.A03);
                int i5 = this.A01;
                boolean z3 = (i5 & 256) == 256;
                String str2 = this.A07;
                int i6 = c48392Fb.A01;
                this.A07 = c0rm.AWD(z3, str2, (i6 & 256) == 256, c48392Fb.A07);
                this.A05 = c0rm.AW2((i5 & 512) == 512, this.A05, (i6 & 512) == 512, c48392Fb.A05);
                if (c0rm == C0RN.A00) {
                    this.A01 |= c48392Fb.A01;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                boolean z4 = false;
                while (!z4) {
                    try {
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                break;
                            case 10:
                                String A0A = c0ro.A0A();
                                this.A01 |= 1;
                                this.A09 = A0A;
                                continue;
                            case 18:
                                String A0A2 = c0ro.A0A();
                                this.A01 |= 2;
                                this.A0A = A0A2;
                                continue;
                            case 24:
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC79253lM = EnumC79253lM.IMAGE;
                                } else {
                                    enumC79253lM = A02 != 1 ? null : EnumC79253lM.PDF;
                                }
                                if (enumC79253lM == null) {
                                    super.A0F(3, A02);
                                } else {
                                    this.A01 |= 4;
                                    this.A00 = A02;
                                    continue;
                                }
                            case 34:
                                String A0A3 = c0ro.A0A();
                                this.A01 |= 8;
                                this.A08 = A0A3;
                                continue;
                            case 42:
                                this.A01 |= 16;
                                this.A06 = c0ro.A08();
                                continue;
                            case 48:
                                this.A01 |= 32;
                                this.A02 = c0ro.A06();
                                continue;
                            case 58:
                                this.A01 |= 64;
                                this.A04 = c0ro.A08();
                                continue;
                            case 66:
                                this.A01 |= 128;
                                this.A03 = c0ro.A08();
                                continue;
                            case 74:
                                String A0A4 = c0ro.A0A();
                                this.A01 |= 256;
                                this.A07 = A0A4;
                                continue;
                            case 82:
                                this.A01 |= 512;
                                this.A05 = c0ro.A08();
                                continue;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z4 = true;
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
                return new C48392Fb();
            case 5:
                return new C0CT() { // from class: X.2Fa
                    {
                        C48392Fb c48392Fb2 = C48392Fb.A0B;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C48392Fb.class) {
                        if (A0C == null) {
                            A0C = new C0RR(A0B);
                        }
                    }
                }
                return A0C;
            default:
                throw new UnsupportedOperationException();
        }
        return A0B;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B2 = (this.A01 & 1) == 1 ? 0 + C0RS.A0B(1, this.A09) : 0;
        if ((this.A01 & 2) == 2) {
            A0B2 += C0RS.A0B(2, this.A0A);
        }
        int i2 = this.A01;
        if ((i2 & 4) == 4) {
            A0B2 += C0RS.A04(3, this.A00);
        }
        if ((i2 & 8) == 8) {
            A0B2 += C0RS.A0B(4, this.A08);
        }
        int i3 = this.A01;
        if ((i3 & 16) == 16) {
            A0B2 += C0RS.A09(5, this.A06);
        }
        if ((i3 & 32) == 32) {
            A0B2 += C0RS.A07(6, this.A02);
        }
        if ((i3 & 64) == 64) {
            A0B2 += C0RS.A09(7, this.A04);
        }
        if ((i3 & 128) == 128) {
            A0B2 += C0RS.A09(8, this.A03);
        }
        if ((i3 & 256) == 256) {
            A0B2 += C0RS.A0B(9, this.A07);
        }
        if ((this.A01 & 512) == 512) {
            A0B2 += C0RS.A09(10, this.A05);
        }
        int A00 = this.unknownFields.A00() + A0B2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            c0rs.A0P(1, this.A09);
        }
        if ((this.A01 & 2) == 2) {
            c0rs.A0P(2, this.A0A);
        }
        if ((this.A01 & 4) == 4) {
            c0rs.A0I(3, this.A00);
        }
        if ((this.A01 & 8) == 8) {
            c0rs.A0P(4, this.A08);
        }
        if ((this.A01 & 16) == 16) {
            c0rs.A0N(5, this.A06);
        }
        if ((this.A01 & 32) == 32) {
            c0rs.A0M(6, this.A02);
        }
        if ((this.A01 & 64) == 64) {
            c0rs.A0N(7, this.A04);
        }
        if ((this.A01 & 128) == 128) {
            c0rs.A0N(8, this.A03);
        }
        if ((this.A01 & 256) == 256) {
            c0rs.A0P(9, this.A07);
        }
        if ((this.A01 & 512) == 512) {
            c0rs.A0N(10, this.A05);
        }
        this.unknownFields.A02(c0rs);
    }
}
