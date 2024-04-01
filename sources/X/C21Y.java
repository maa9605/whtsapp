package X;

import java.io.IOException;

/* renamed from: X.21Y  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C21Y extends C0AZ implements C0AY {
    public static final C21Y A0B;
    public static volatile C0RQ A0C;
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public C40521sP A09;
    public String A0A = "";
    public C0AN A08 = C0AN.A01;

    static {
        C21Y c21y = new C21Y();
        A0B = c21y;
        c21y.A0E();
    }

    public static void A09(C21Y c21y, C0AN c0an) {
        c21y.A04 |= 256;
        c21y.A08 = c0an;
    }

    public static void A0A(C21Y c21y, C40521sP c40521sP) {
        if (c40521sP != null) {
            c21y.A09 = c40521sP;
            c21y.A04 |= 512;
            return;
        }
        throw null;
    }

    public static void A0B(C21Y c21y, String str) {
        if (str != null) {
            c21y.A04 |= 32;
            c21y.A0A = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU = null;
        switch (c0rl.ordinal()) {
            case 0:
                return A0B;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C21Y c21y = (C21Y) obj2;
                int i = this.A04;
                boolean z = (i & 1) == 1;
                double d = this.A00;
                int i2 = c21y.A04;
                this.A00 = c0rm.AW3(z, d, (i2 & 1) == 1, c21y.A00);
                this.A01 = c0rm.AW3((i & 2) == 2, this.A01, (i2 & 2) == 2, c21y.A01);
                this.A03 = c0rm.AW5((i & 4) == 4, this.A03, (i2 & 4) == 4, c21y.A03);
                this.A02 = c0rm.AW4((i & 8) == 8, this.A02, (i2 & 8) == 8, c21y.A02);
                this.A05 = c0rm.AW5((i & 16) == 16, this.A05, (i2 & 16) == 16, c21y.A05);
                this.A0A = c0rm.AWD((i & 32) == 32, this.A0A, (i2 & 32) == 32, c21y.A0A);
                this.A07 = c0rm.AW8((i & 64) == 64, this.A07, (i2 & 64) == 64, c21y.A07);
                this.A06 = c0rm.AW5((i & 128) == 128, this.A06, (i2 & 128) == 128, c21y.A06);
                this.A08 = c0rm.AW2((i & 256) == 256, this.A08, (i2 & 256) == 256, c21y.A08);
                this.A09 = (C40521sP) c0rm.AW9(this.A09, c21y.A09);
                if (c0rm == C0RN.A00) {
                    this.A04 |= c21y.A04;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z2 = false;
                while (!z2) {
                    try {
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                z2 = true;
                            case 9:
                                this.A04 |= 1;
                                this.A00 = Double.longBitsToDouble(c0ro.A05());
                                c87333zU = null;
                            case 17:
                                this.A04 |= 2;
                                this.A01 = Double.longBitsToDouble(c0ro.A05());
                                c87333zU = null;
                            case 24:
                                this.A04 |= 4;
                                this.A03 = c0ro.A02();
                                c87333zU = null;
                            case 37:
                                this.A04 |= 8;
                                this.A02 = Float.intBitsToFloat(c0ro.A01());
                                c87333zU = null;
                            case 40:
                                this.A04 |= 16;
                                this.A05 = c0ro.A02();
                                c87333zU = null;
                            case 50:
                                String A0A = c0ro.A0A();
                                this.A04 |= 32;
                                this.A0A = A0A;
                                c87333zU = null;
                            case 56:
                                this.A04 |= 64;
                                this.A07 = c0ro.A06();
                                c87333zU = null;
                            case 64:
                                this.A04 |= 128;
                                this.A06 = c0ro.A02();
                                c87333zU = null;
                            case 130:
                                this.A04 |= 256;
                                this.A08 = c0ro.A08();
                                c87333zU = null;
                            case 138:
                                if ((this.A04 & 512) == 512) {
                                    c87333zU = (C87333zU) this.A09.AVX();
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A09 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A09 = (C40521sP) c87333zU.A00();
                                }
                                this.A04 |= 512;
                                c87333zU = null;
                            default:
                                if (A0I(A03, c0ro)) {
                                    c87333zU = null;
                                } else {
                                    z2 = true;
                                }
                        }
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
                return new C21Y();
            case 5:
                return new C0CT() { // from class: X.21X
                    {
                        C21Y c21y2 = C21Y.A0B;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C21Y.class) {
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

    public C40521sP A0i() {
        C40521sP c40521sP = this.A09;
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
            A01 += C0RS.A06(3, this.A03);
        }
        if ((i2 & 8) == 8) {
            A01 += C0RS.A03(32) + 4;
        }
        if ((i2 & 16) == 16) {
            A01 += C0RS.A06(5, this.A05);
        }
        if ((i2 & 32) == 32) {
            A01 += C0RS.A0B(6, this.A0A);
        }
        int i3 = this.A04;
        if ((i3 & 64) == 64) {
            A01 += C0RS.A07(7, this.A07);
        }
        if ((i3 & 128) == 128) {
            A01 += C0RS.A06(8, this.A06);
        }
        if ((i3 & 256) == 256) {
            A01 += C0RS.A09(16, this.A08);
        }
        if ((i3 & 512) == 512) {
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
            c0rs.A0K(3, this.A03);
        }
        if ((this.A04 & 8) == 8) {
            c0rs.A0H(4, Float.floatToRawIntBits(this.A02));
        }
        if ((this.A04 & 16) == 16) {
            c0rs.A0K(5, this.A05);
        }
        if ((this.A04 & 32) == 32) {
            c0rs.A0P(6, this.A0A);
        }
        if ((this.A04 & 64) == 64) {
            c0rs.A0M(7, this.A07);
        }
        if ((this.A04 & 128) == 128) {
            c0rs.A0K(8, this.A06);
        }
        if ((this.A04 & 256) == 256) {
            c0rs.A0N(16, this.A08);
        }
        if ((this.A04 & 512) == 512) {
            c0rs.A0O(17, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
