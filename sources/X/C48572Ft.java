package X;

import java.io.IOException;

/* renamed from: X.2Ft  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48572Ft extends C0AZ implements C0AY {
    public static final C48572Ft A0G;
    public static volatile C0RQ A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C0AN A06;
    public C0AN A07;
    public C0AN A08;
    public C0AN A09;
    public C0AN A0A;
    public C40521sP A0B;
    public String A0C;
    public String A0D;
    public String A0E = "";
    public boolean A0F;

    static {
        C48572Ft c48572Ft = new C48572Ft();
        A0G = c48572Ft;
        c48572Ft.A0E();
    }

    public C48572Ft() {
        C0AN c0an = C0AN.A01;
        this.A07 = c0an;
        this.A06 = c0an;
        this.A09 = c0an;
        this.A0D = "";
        this.A0C = "";
        this.A08 = c0an;
        this.A0A = c0an;
    }

    public static void A09(C48572Ft c48572Ft, C0AN c0an) {
        c48572Ft.A00 |= 2;
        c48572Ft.A07 = c0an;
    }

    public static void A0A(C48572Ft c48572Ft, C0AN c0an) {
        c48572Ft.A00 |= 4;
        c48572Ft.A06 = c0an;
    }

    public static void A0B(C48572Ft c48572Ft, C0AN c0an) {
        c48572Ft.A00 |= 8;
        c48572Ft.A09 = c0an;
    }

    public static void A0C(C48572Ft c48572Ft, C0AN c0an) {
        c48572Ft.A00 |= 2048;
        c48572Ft.A08 = c0an;
    }

    public static void A0D(C48572Ft c48572Ft, C40521sP c40521sP) {
        if (c40521sP != null) {
            c48572Ft.A0B = c40521sP;
            c48572Ft.A00 |= 16384;
            return;
        }
        throw null;
    }

    public static void A0E(C48572Ft c48572Ft, String str) {
        c48572Ft.A00 |= 1;
        c48572Ft.A0E = str;
    }

    public static void A0F(C48572Ft c48572Ft, String str) {
        c48572Ft.A00 |= 16;
        c48572Ft.A0D = str;
    }

    public static void A0G(C48572Ft c48572Ft, String str) {
        if (str != null) {
            c48572Ft.A00 |= 128;
            c48572Ft.A0C = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A0G;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48572Ft c48572Ft = (C48572Ft) obj2;
                int i = this.A00;
                boolean z2 = (i & 1) == 1;
                String str = this.A0E;
                int i2 = c48572Ft.A00;
                this.A0E = c0rm.AWD(z2, str, (i2 & 1) == 1, c48572Ft.A0E);
                this.A07 = c0rm.AW2((i & 2) == 2, this.A07, (i2 & 2) == 2, c48572Ft.A07);
                this.A06 = c0rm.AW2((this.A00 & 4) == 4, this.A06, (c48572Ft.A00 & 4) == 4, c48572Ft.A06);
                this.A09 = c0rm.AW2((this.A00 & 8) == 8, this.A09, (c48572Ft.A00 & 8) == 8, c48572Ft.A09);
                int i3 = this.A00;
                boolean z3 = (i3 & 16) == 16;
                String str2 = this.A0D;
                int i4 = c48572Ft.A00;
                this.A0D = c0rm.AWD(z3, str2, (i4 & 16) == 16, c48572Ft.A0D);
                this.A02 = c0rm.AW5((i3 & 32) == 32, this.A02, (i4 & 32) == 32, c48572Ft.A02);
                this.A03 = c0rm.AW5((i3 & 64) == 64, this.A03, (i4 & 64) == 64, c48572Ft.A03);
                this.A0C = c0rm.AWD((i3 & 128) == 128, this.A0C, (i4 & 128) == 128, c48572Ft.A0C);
                this.A04 = c0rm.AW8((i3 & 256) == 256, this.A04, (i4 & 256) == 256, c48572Ft.A04);
                this.A05 = c0rm.AW8((i3 & 512) == 512, this.A05, (i4 & 512) == 512, c48572Ft.A05);
                this.A01 = c0rm.AW5((i3 & 1024) == 1024, this.A01, (i4 & 1024) == 1024, c48572Ft.A01);
                this.A08 = c0rm.AW2((i3 & 2048) == 2048, this.A08, (i4 & 2048) == 2048, c48572Ft.A08);
                int i5 = this.A00;
                boolean z4 = (i5 & 4096) == 4096;
                boolean z5 = this.A0F;
                int i6 = c48572Ft.A00;
                this.A0F = c0rm.AW1(z4, z5, (i6 & 4096) == 4096, c48572Ft.A0F);
                this.A0A = c0rm.AW2((i5 & 8192) == 8192, this.A0A, (i6 & 8192) == 8192, c48572Ft.A0A);
                this.A0B = (C40521sP) c0rm.AW9(this.A0B, c48572Ft.A0B);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c48572Ft.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                break;
                            case 10:
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A0E = A0A;
                                continue;
                            case 18:
                                this.A00 |= 2;
                                this.A07 = c0ro.A08();
                                continue;
                            case 26:
                                this.A00 |= 4;
                                this.A06 = c0ro.A08();
                                continue;
                            case 34:
                                this.A00 |= 8;
                                this.A09 = c0ro.A08();
                                continue;
                            case 42:
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 16;
                                this.A0D = A0A2;
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A02 = c0ro.A02();
                                continue;
                            case 56:
                                this.A00 |= 64;
                                this.A03 = c0ro.A02();
                                continue;
                            case 66:
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A0C = A0A3;
                                continue;
                            case C0M6.A02 /* 72 */:
                                this.A00 |= 256;
                                this.A04 = c0ro.A06();
                                continue;
                            case 80:
                                this.A00 |= 512;
                                this.A05 = c0ro.A06();
                                continue;
                            case 88:
                                this.A00 |= 1024;
                                this.A01 = c0ro.A02();
                                continue;
                            case 98:
                                this.A00 |= 2048;
                                this.A08 = c0ro.A08();
                                continue;
                            case 104:
                                this.A00 |= 4096;
                                this.A0F = c0ro.A0F();
                                continue;
                            case 130:
                                this.A00 |= 8192;
                                this.A0A = c0ro.A08();
                                continue;
                            case 138:
                                if ((this.A00 & 16384) == 16384) {
                                    c87333zU = (C87333zU) this.A0B.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A0B = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A0B = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 16384;
                                continue;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
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
                return null;
            case 4:
                return new C48572Ft();
            case 5:
                return new C0CT() { // from class: X.2Fs
                    {
                        C48572Ft c48572Ft2 = C48572Ft.A0G;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0H == null) {
                    synchronized (C48572Ft.class) {
                        if (A0H == null) {
                            A0H = new C0RR(A0G);
                        }
                    }
                }
                return A0H;
            default:
                throw new UnsupportedOperationException();
        }
        return A0G;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A0B;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A0E) : 0;
        int i2 = this.A00;
        if ((i2 & 2) == 2) {
            A0B += C0RS.A09(2, this.A07);
        }
        if ((i2 & 4) == 4) {
            A0B += C0RS.A09(3, this.A06);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A09(4, this.A09);
        }
        if ((i2 & 16) == 16) {
            A0B += C0RS.A0B(5, this.A0D);
        }
        int i3 = this.A00;
        if ((i3 & 32) == 32) {
            A0B += C0RS.A06(6, this.A02);
        }
        if ((i3 & 64) == 64) {
            A0B += C0RS.A06(7, this.A03);
        }
        if ((i3 & 128) == 128) {
            A0B += C0RS.A0B(8, this.A0C);
        }
        int i4 = this.A00;
        if ((i4 & 256) == 256) {
            A0B += C0RS.A08(9, this.A04);
        }
        if ((i4 & 512) == 512) {
            A0B += C0RS.A07(10, this.A05);
        }
        if ((i4 & 1024) == 1024) {
            A0B += C0RS.A06(11, this.A01);
        }
        if ((i4 & 2048) == 2048) {
            A0B += C0RS.A09(12, this.A08);
        }
        if ((i4 & 4096) == 4096) {
            A0B += C0RS.A00(13);
        }
        if ((i4 & 8192) == 8192) {
            A0B += C0RS.A09(16, this.A0A);
        }
        if ((i4 & 16384) == 16384) {
            A0B += C0RS.A0A(17, A0i());
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A0E);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A09);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(5, this.A0D);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0K(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0K(7, this.A03);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A0C);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0M(9, this.A04);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0M(10, this.A05);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0K(11, this.A01);
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0N(12, this.A08);
        }
        if ((this.A00 & 4096) == 4096) {
            c0rs.A0Q(13, this.A0F);
        }
        if ((this.A00 & 8192) == 8192) {
            c0rs.A0N(16, this.A0A);
        }
        if ((this.A00 & 16384) == 16384) {
            c0rs.A0O(17, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
