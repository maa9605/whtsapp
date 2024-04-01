package X;

import java.io.IOException;

/* renamed from: X.40K  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40K extends C0AZ implements C0AY {
    public static final C40K A0C;
    public static volatile C0RQ A0D;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass249 A04;
    public String A08 = "";
    public String A0A = "";
    public String A06 = "";
    public String A05 = "";
    public String A09 = "";
    public String A0B = "";
    public String A07 = "";

    static {
        C40K c40k = new C40K();
        A0C = c40k;
        c40k.A0E();
    }

    public static void A09(C40K c40k, C2G6 c2g6) {
        if (c40k != null) {
            c40k.A04 = (AnonymousClass249) c2g6.A01();
            c40k.A00 |= 1;
            return;
        }
        throw null;
    }

    public static void A0A(C40K c40k, String str) {
        if (str != null) {
            c40k.A00 |= 2;
            c40k.A08 = str;
            return;
        }
        throw null;
    }

    public static void A0B(C40K c40k, String str) {
        if (str != null) {
            c40k.A00 |= 4;
            c40k.A0A = str;
            return;
        }
        throw null;
    }

    public static void A0C(C40K c40k, String str) {
        if (str != null) {
            c40k.A00 |= 8;
            c40k.A06 = str;
            return;
        }
        throw null;
    }

    public static void A0D(C40K c40k, String str) {
        if (str != null) {
            c40k.A00 |= 16;
            c40k.A05 = str;
            return;
        }
        throw null;
    }

    public static void A0E(C40K c40k, String str) {
        if (str != null) {
            c40k.A00 |= 64;
            c40k.A09 = str;
            return;
        }
        throw null;
    }

    public static void A0F(C40K c40k, String str) {
        if (str != null) {
            c40k.A00 |= 128;
            c40k.A0B = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C2G6 c2g6;
        int i = 1024;
        switch (c0rl.ordinal()) {
            case 0:
                return A0C;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40K c40k = (C40K) obj2;
                this.A04 = (AnonymousClass249) c0rm.AW9(this.A04, c40k.A04);
                int i2 = this.A00;
                boolean z = (i2 & 2) == 2;
                String str = this.A08;
                int i3 = c40k.A00;
                this.A08 = c0rm.AWD(z, str, (i3 & 2) == 2, c40k.A08);
                this.A0A = c0rm.AWD((i2 & 4) == 4, this.A0A, (i3 & 4) == 4, c40k.A0A);
                this.A06 = c0rm.AWD((i2 & 8) == 8, this.A06, (i3 & 8) == 8, c40k.A06);
                this.A05 = c0rm.AWD((i2 & 16) == 16, this.A05, (i3 & 16) == 16, c40k.A05);
                this.A02 = c0rm.AW8((i2 & 32) == 32, this.A02, (i3 & 32) == 32, c40k.A02);
                this.A09 = c0rm.AWD((i2 & 64) == 64, this.A09, (i3 & 64) == 64, c40k.A09);
                this.A0B = c0rm.AWD((i2 & 128) == 128, this.A0B, (i3 & 128) == 128, c40k.A0B);
                this.A01 = c0rm.AW5((i2 & 256) == 256, this.A01, (i3 & 256) == 256, c40k.A01);
                this.A07 = c0rm.AWD((i2 & 512) == 512, this.A07, (i3 & 512) == 512, c40k.A07);
                this.A03 = c0rm.AW8((i2 & 1024) == 1024, this.A03, (i3 & 1024) == 1024, c40k.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 = i2 | i3;
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
                                case 10:
                                    if ((this.A00 & 1) == 1) {
                                        c2g6 = (C2G6) this.A04.AVX();
                                    } else {
                                        c2g6 = null;
                                    }
                                    AnonymousClass249 anonymousClass249 = (AnonymousClass249) c0ro.A09(AnonymousClass249.A0Q.A0C(), c0rp);
                                    this.A04 = anonymousClass249;
                                    if (c2g6 != null) {
                                        c2g6.A03(anonymousClass249);
                                        this.A04 = (AnonymousClass249) c2g6.A00();
                                    }
                                    this.A00 |= 1;
                                    continue;
                                    i = 1024;
                                case 18:
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A08 = A0A;
                                    continue;
                                    i = 1024;
                                case 26:
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A0A = A0A2;
                                    continue;
                                    i = 1024;
                                case 34:
                                    String A0A3 = c0ro.A0A();
                                    this.A00 |= 8;
                                    this.A06 = A0A3;
                                    continue;
                                    i = 1024;
                                case 42:
                                    String A0A4 = c0ro.A0A();
                                    this.A00 |= 16;
                                    this.A05 = A0A4;
                                    continue;
                                    i = 1024;
                                case 48:
                                    this.A00 |= 32;
                                    this.A02 = c0ro.A06();
                                    continue;
                                    i = 1024;
                                case 58:
                                    String A0A5 = c0ro.A0A();
                                    this.A00 |= 64;
                                    this.A09 = A0A5;
                                    continue;
                                    i = 1024;
                                case 66:
                                    String A0A6 = c0ro.A0A();
                                    this.A00 |= 128;
                                    this.A0B = A0A6;
                                    continue;
                                    i = 1024;
                                case C0M6.A02 /* 72 */:
                                    this.A00 |= 256;
                                    this.A01 = c0ro.A02();
                                    continue;
                                    i = 1024;
                                case 90:
                                    String A0A7 = c0ro.A0A();
                                    this.A00 |= 512;
                                    this.A07 = A0A7;
                                    continue;
                                    i = 1024;
                                case 96:
                                    this.A00 |= i;
                                    this.A03 = c0ro.A06();
                                    continue;
                                    i = 1024;
                                default:
                                    if (!A0I(A03, c0ro)) {
                                        break;
                                    } else {
                                        continue;
                                        i = 1024;
                                    }
                            }
                            z2 = true;
                            i = 1024;
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
                return new C40K();
            case 5:
                return new C0CT() { // from class: X.40J
                    {
                        C40K c40k2 = C40K.A0C;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0D == null) {
                    synchronized (C40K.class) {
                        if (A0D == null) {
                            A0D = new C0RR(A0C);
                        }
                    }
                }
                return A0D;
            default:
                throw new UnsupportedOperationException();
        }
        return A0C;
    }

    public AnonymousClass249 A0i() {
        AnonymousClass249 anonymousClass249 = this.A04;
        return anonymousClass249 == null ? AnonymousClass249.A0Q : anonymousClass249;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = (this.A00 & 1) == 1 ? 0 + C0RS.A0A(1, A0i()) : 0;
        if ((this.A00 & 2) == 2) {
            A0A += C0RS.A0B(2, this.A08);
        }
        if ((this.A00 & 4) == 4) {
            A0A += C0RS.A0B(3, this.A0A);
        }
        if ((this.A00 & 8) == 8) {
            A0A += C0RS.A0B(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            A0A += C0RS.A0B(5, this.A05);
        }
        int i2 = this.A00;
        if ((i2 & 32) == 32) {
            A0A += C0RS.A07(6, this.A02);
        }
        if ((i2 & 64) == 64) {
            A0A += C0RS.A0B(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            A0A += C0RS.A0B(8, this.A0B);
        }
        int i3 = this.A00;
        if ((i3 & 256) == 256) {
            A0A += C0RS.A06(9, this.A01);
        }
        if ((i3 & 512) == 512) {
            A0A += C0RS.A0B(11, this.A07);
        }
        if ((this.A00 & 1024) == 1024) {
            A0A += C0RS.A07(12, this.A03);
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(1, A0i());
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A08);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A0A);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(5, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0M(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0P(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0K(9, this.A01);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0P(11, this.A07);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0M(12, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
