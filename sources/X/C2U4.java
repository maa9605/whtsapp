package X;

import java.io.IOException;

/* renamed from: X.2U4 */
/* loaded from: classes2.dex */
public final class C2U4 extends C0AZ implements C0AY {
    public static final C2U4 A0E;
    public static volatile C0RQ A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C0AN A05;
    public C0AN A06;
    public C0AN A07;
    public C0AN A08;
    public C0CX A09;
    public C74893e1 A0A;
    public C74873dz A0B;
    public C71353Vu A0C;
    public boolean A0D;

    static {
        C2U4 c2u4 = new C2U4();
        A0E = c2u4;
        c2u4.A0E();
    }

    public C2U4() {
        C0AN c0an = C0AN.A01;
        this.A06 = c0an;
        this.A07 = c0an;
        this.A08 = c0an;
        this.A09 = C0RU.A01;
        this.A05 = c0an;
    }

    public static void A09(C2U4 c2u4) {
        c2u4.A0k();
        c2u4.A09.remove(0);
    }

    public static void A0A(C2U4 c2u4, C0AN c0an) {
        c2u4.A00 |= 2;
        c2u4.A06 = c0an;
    }

    public static void A0B(C2U4 c2u4, C0AN c0an) {
        c2u4.A00 |= 4;
        c2u4.A07 = c0an;
    }

    public static void A0C(C2U4 c2u4, C0AN c0an) {
        c2u4.A00 |= 8;
        c2u4.A08 = c0an;
    }

    public static void A0D(C2U4 c2u4, C0AN c0an) {
        c2u4.A00 |= 2048;
        c2u4.A05 = c0an;
    }

    public static void A0E(C2U4 c2u4, C74893e1 c74893e1) {
        if (c74893e1 != null) {
            c2u4.A0A = c74893e1;
            c2u4.A00 |= 32;
            return;
        }
        throw null;
    }

    public static void A0F(C2U4 c2u4, C74893e1 c74893e1) {
        if (c74893e1 != null) {
            c2u4.A0k();
            c2u4.A09.add(c74893e1);
            return;
        }
        throw null;
    }

    public static void A0G(C2U4 c2u4, C71353Vu c71353Vu) {
        if (c71353Vu != null) {
            c2u4.A0C = c71353Vu;
            c2u4.A00 |= 128;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C71483Wh c71483Wh;
        C74883e0 c74883e0;
        C74943e6 c74943e6;
        switch (c0rl.ordinal()) {
            case 0:
                return A0E;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2U4 c2u4 = (C2U4) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A04;
                int i3 = c2u4.A00;
                this.A04 = c0rm.AW5(z, i2, (i3 & 1) == 1, c2u4.A04);
                this.A06 = c0rm.AW2((i & 2) == 2, this.A06, (i3 & 2) == 2, c2u4.A06);
                this.A07 = c0rm.AW2(A0l(), this.A07, c2u4.A0l(), c2u4.A07);
                this.A08 = c0rm.AW2((this.A00 & 8) == 8, this.A08, (c2u4.A00 & 8) == 8, c2u4.A08);
                this.A02 = c0rm.AW5((this.A00 & 16) == 16, this.A02, (c2u4.A00 & 16) == 16, c2u4.A02);
                this.A0A = (C74893e1) c0rm.AW9(this.A0A, c2u4.A0A);
                this.A09 = c0rm.AW7(this.A09, c2u4.A09);
                this.A0B = (C74873dz) c0rm.AW9(this.A0B, c2u4.A0B);
                this.A0C = (C71353Vu) c0rm.AW9(this.A0C, c2u4.A0C);
                int i4 = this.A00;
                boolean z2 = (i4 & 256) == 256;
                int i5 = this.A03;
                int i6 = c2u4.A00;
                this.A03 = c0rm.AW5(z2, i5, (i6 & 256) == 256, c2u4.A03);
                this.A01 = c0rm.AW5((i4 & 512) == 512, this.A01, (i6 & 512) == 512, c2u4.A01);
                this.A0D = c0rm.AW1((i4 & 1024) == 1024, this.A0D, (i6 & 1024) == 1024, c2u4.A0D);
                this.A05 = c0rm.AW2((i4 & 2048) == 2048, this.A05, (i6 & 2048) == 2048, c2u4.A05);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2u4.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r7) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    break;
                                case 8:
                                    this.A00 |= 1;
                                    this.A04 = c0ro.A02();
                                    continue;
                                case 18:
                                    this.A00 |= 2;
                                    this.A06 = c0ro.A08();
                                    continue;
                                case 26:
                                    this.A00 |= 4;
                                    this.A07 = c0ro.A08();
                                    continue;
                                case 34:
                                    this.A00 |= 8;
                                    this.A08 = c0ro.A08();
                                    continue;
                                case 40:
                                    this.A00 |= 16;
                                    this.A02 = c0ro.A02();
                                    continue;
                                case 50:
                                    if ((this.A00 & 32) == 32) {
                                        c74943e6 = (C74943e6) this.A0A.AVX();
                                    } else {
                                        c74943e6 = null;
                                    }
                                    C74893e1 c74893e1 = (C74893e1) c0ro.A09(C74893e1.A05.A0C(), c0rp);
                                    this.A0A = c74893e1;
                                    if (c74943e6 != null) {
                                        c74943e6.A03(c74893e1);
                                        this.A0A = (C74893e1) c74943e6.A00();
                                    }
                                    this.A00 |= 32;
                                    continue;
                                case 58:
                                    C0CX c0cx = this.A09;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A09 = c0cx;
                                    }
                                    c0cx.add(c0ro.A09(C74893e1.A05.A0C(), c0rp));
                                    continue;
                                case 66:
                                    if ((this.A00 & 64) == 64) {
                                        c74883e0 = (C74883e0) this.A0B.AVX();
                                    } else {
                                        c74883e0 = null;
                                    }
                                    C74873dz c74873dz = (C74873dz) c0ro.A09(C74873dz.A08.A0C(), c0rp);
                                    this.A0B = c74873dz;
                                    if (c74883e0 != null) {
                                        c74883e0.A03(c74873dz);
                                        this.A0B = (C74873dz) c74883e0.A00();
                                    }
                                    this.A00 |= 64;
                                    continue;
                                case 74:
                                    if ((this.A00 & 128) == 128) {
                                        c71483Wh = (C71483Wh) this.A0C.AVX();
                                    } else {
                                        c71483Wh = null;
                                    }
                                    C71353Vu c71353Vu = (C71353Vu) c0ro.A09(C71353Vu.A04.A0C(), c0rp);
                                    this.A0C = c71353Vu;
                                    if (c71483Wh != null) {
                                        c71483Wh.A03(c71353Vu);
                                        this.A0C = (C71353Vu) c71483Wh.A00();
                                    }
                                    this.A00 |= 128;
                                    continue;
                                case 80:
                                    this.A00 |= 256;
                                    this.A03 = c0ro.A02();
                                    continue;
                                case 88:
                                    this.A00 |= 512;
                                    this.A01 = c0ro.A02();
                                    continue;
                                case 96:
                                    this.A00 |= 1024;
                                    this.A0D = c0ro.A0F();
                                    continue;
                                case 106:
                                    this.A00 |= 2048;
                                    this.A05 = c0ro.A08();
                                    continue;
                                default:
                                    if (!A0I(A03, c0ro)) {
                                        break;
                                    } else {
                                        continue;
                                    }
                            }
                            r7 = true;
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
                ((C0CY) this.A09).A00 = false;
                return null;
            case 4:
                return new C2U4();
            case 5:
                return new C74953e7(null);
            case 6:
                break;
            case 7:
                if (A0F == null) {
                    synchronized (C2U4.class) {
                        if (A0F == null) {
                            A0F = new C0RR(A0E);
                        }
                    }
                }
                return A0F;
            default:
                throw new UnsupportedOperationException();
        }
        return A0E;
    }

    public C74893e1 A0i() {
        C74893e1 c74893e1 = this.A0A;
        return c74893e1 == null ? C74893e1.A05 : c74893e1;
    }

    public C71353Vu A0j() {
        C71353Vu c71353Vu = this.A0C;
        return c71353Vu == null ? C71353Vu.A04 : c71353Vu;
    }

    public final void A0k() {
        C0CX c0cx = this.A09;
        if (((C0CY) c0cx).A00) {
            return;
        }
        this.A09 = C0AZ.A05(c0cx);
    }

    public boolean A0l() {
        return (this.A00 & 4) == 4;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = C0RS.A06(1, this.A04) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += C0RS.A09(2, this.A06);
        }
        if ((i3 & 4) == 4) {
            i += C0RS.A09(3, this.A07);
        }
        if ((i3 & 8) == 8) {
            i += C0RS.A09(4, this.A08);
        }
        if ((i3 & 16) == 16) {
            i += C0RS.A06(5, this.A02);
        }
        if ((i3 & 32) == 32) {
            i += C0RS.A0A(6, A0i());
        }
        for (int i4 = 0; i4 < this.A09.size(); i4++) {
            i += C0RS.A0A(7, (C0AX) this.A09.get(i4));
        }
        if ((this.A00 & 64) == 64) {
            C74873dz c74873dz = this.A0B;
            if (c74873dz == null) {
                c74873dz = C74873dz.A08;
            }
            i += C0RS.A0A(8, c74873dz);
        }
        if ((this.A00 & 128) == 128) {
            i += C0RS.A0A(9, A0j());
        }
        int i5 = this.A00;
        if ((i5 & 256) == 256) {
            i += C0RS.A06(10, this.A03);
        }
        if ((i5 & 512) == 512) {
            i += C0RS.A06(11, this.A01);
        }
        if ((i5 & 1024) == 1024) {
            i += C0RS.A00(12);
        }
        if ((i5 & 2048) == 2048) {
            i += C0RS.A09(13, this.A05);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A07);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0K(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0O(6, A0i());
        }
        for (int i = 0; i < this.A09.size(); i++) {
            c0rs.A0O(7, (C0AX) this.A09.get(i));
        }
        if ((this.A00 & 64) == 64) {
            C74873dz c74873dz = this.A0B;
            if (c74873dz == null) {
                c74873dz = C74873dz.A08;
            }
            c0rs.A0O(8, c74873dz);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0O(9, A0j());
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0K(10, this.A03);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0K(11, this.A01);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0Q(12, this.A0D);
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0N(13, this.A05);
        }
        this.unknownFields.A02(c0rs);
    }
}
