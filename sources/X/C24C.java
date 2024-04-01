package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.IOException;

/* renamed from: X.24C  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C24C extends C0AZ implements C0AY {
    public static final C24C A0D;
    public static volatile C0RQ A0E;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C0AN A04;
    public C0AN A05;
    public C0AN A06;
    public C0AN A07;
    public C40521sP A08;
    public String A09;
    public boolean A0C;
    public String A0B = "";
    public String A0A = "";

    static {
        C24C c24c = new C24C();
        A0D = c24c;
        c24c.A0E();
    }

    public C24C() {
        C0AN c0an = C0AN.A01;
        this.A05 = c0an;
        this.A06 = c0an;
        this.A04 = c0an;
        this.A09 = "";
        this.A07 = c0an;
    }

    public static void A09(C24C c24c, C0AN c0an) {
        c24c.A00 |= 4;
        c24c.A05 = c0an;
    }

    public static void A0A(C24C c24c, C0AN c0an) {
        c24c.A00 |= 64;
        c24c.A06 = c0an;
    }

    public static void A0B(C24C c24c, C0AN c0an) {
        c24c.A00 |= 128;
        c24c.A04 = c0an;
    }

    public static void A0C(C24C c24c, C40521sP c40521sP) {
        if (c40521sP != null) {
            c24c.A08 = c40521sP;
            c24c.A00 |= 1024;
            return;
        }
        throw null;
    }

    public static void A0D(C24C c24c, String str) {
        if (str != null) {
            c24c.A00 |= 1;
            c24c.A0B = str;
            return;
        }
        throw null;
    }

    public static void A0E(C24C c24c, String str) {
        if (str != null) {
            c24c.A00 |= 2;
            c24c.A0A = str;
            return;
        }
        throw null;
    }

    public static void A0F(C24C c24c, String str) {
        if (str != null) {
            c24c.A00 |= 256;
            c24c.A09 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        int i = 2048;
        switch (c0rl.ordinal()) {
            case 0:
                return A0D;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24C c24c = (C24C) obj2;
                int i2 = this.A00;
                boolean z = (i2 & 1) == 1;
                String str = this.A0B;
                int i3 = c24c.A00;
                this.A0B = c0rm.AWD(z, str, (i3 & 1) == 1, c24c.A0B);
                this.A0A = c0rm.AWD((i2 & 2) == 2, this.A0A, (i3 & 2) == 2, c24c.A0A);
                this.A05 = c0rm.AW2((i2 & 4) == 4, this.A05, (i3 & 4) == 4, c24c.A05);
                int i4 = this.A00;
                boolean z2 = (i4 & 8) == 8;
                long j = this.A02;
                int i5 = c24c.A00;
                this.A02 = c0rm.AW8(z2, j, (i5 & 8) == 8, c24c.A02);
                this.A01 = c0rm.AW5((i4 & 16) == 16, this.A01, (i5 & 16) == 16, c24c.A01);
                this.A0C = c0rm.AW1((i4 & 32) == 32, this.A0C, (i5 & 32) == 32, c24c.A0C);
                this.A06 = c0rm.AW2((i4 & 64) == 64, this.A06, (i5 & 64) == 64, c24c.A06);
                this.A04 = c0rm.AW2((this.A00 & 128) == 128, this.A04, (c24c.A00 & 128) == 128, c24c.A04);
                int i6 = this.A00;
                boolean z3 = (i6 & 256) == 256;
                String str2 = this.A09;
                int i7 = c24c.A00;
                this.A09 = c0rm.AWD(z3, str2, (i7 & 256) == 256, c24c.A09);
                this.A03 = c0rm.AW8((i6 & 512) == 512, this.A03, (i7 & 512) == 512, c24c.A03);
                this.A08 = (C40521sP) c0rm.AW9(this.A08, c24c.A08);
                this.A07 = c0rm.AW2((this.A00 & 2048) == 2048, this.A07, (c24c.A00 & 2048) == 2048, c24c.A07);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c24c.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z4 = false;
                while (!z4) {
                    try {
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                break;
                            case 10:
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A0B = A0A;
                                continue;
                                i = 2048;
                            case 18:
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A0A = A0A2;
                                continue;
                                i = 2048;
                            case 26:
                                this.A00 |= 4;
                                this.A05 = c0ro.A08();
                                continue;
                                i = 2048;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                this.A00 |= 8;
                                this.A02 = c0ro.A06();
                                continue;
                                i = 2048;
                            case 40:
                                this.A00 |= 16;
                                this.A01 = c0ro.A02();
                                continue;
                                i = 2048;
                            case 48:
                                this.A00 |= 32;
                                this.A0C = c0ro.A0F();
                                continue;
                                i = 2048;
                            case 58:
                                this.A00 |= 64;
                                this.A06 = c0ro.A08();
                                continue;
                                i = 2048;
                            case 66:
                                this.A00 |= 128;
                                this.A04 = c0ro.A08();
                                continue;
                                i = 2048;
                            case 74:
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 256;
                                this.A09 = A0A3;
                                continue;
                                i = 2048;
                            case 80:
                                this.A00 |= 512;
                                this.A03 = c0ro.A06();
                                continue;
                                i = 2048;
                            case 138:
                                if ((this.A00 & 1024) == 1024) {
                                    c87333zU = (C87333zU) this.A08.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A08 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A08 = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 1024;
                                continue;
                                i = 2048;
                            case 146:
                                this.A00 |= i;
                                this.A07 = c0ro.A08();
                                continue;
                                i = 2048;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                    i = 2048;
                                }
                        }
                        z4 = true;
                        i = 2048;
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
                return new C24C();
            case 5:
                return new C0CT() { // from class: X.2FH
                    {
                        C24C c24c2 = C24C.A0D;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0E == null) {
                    synchronized (C24C.class) {
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
        C40521sP c40521sP = this.A08;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A0B) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A0A);
        }
        int i2 = this.A00;
        if ((i2 & 4) == 4) {
            A0B += C0RS.A09(3, this.A05);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A08(4, this.A02);
        }
        if ((i2 & 16) == 16) {
            A0B += C0RS.A06(5, this.A01);
        }
        if ((i2 & 32) == 32) {
            A0B += C0RS.A00(6);
        }
        if ((i2 & 64) == 64) {
            A0B += C0RS.A09(7, this.A06);
        }
        if ((i2 & 128) == 128) {
            A0B += C0RS.A09(8, this.A04);
        }
        if ((i2 & 256) == 256) {
            A0B += C0RS.A0B(9, this.A09);
        }
        int i3 = this.A00;
        if ((i3 & 512) == 512) {
            A0B += C0RS.A07(10, this.A03);
        }
        if ((i3 & 1024) == 1024) {
            A0B += C0RS.A0A(17, A0i());
        }
        if ((this.A00 & 2048) == 2048) {
            A0B += C0RS.A09(18, this.A07);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A0B);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A0A);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0M(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0K(5, this.A01);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0Q(6, this.A0C);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0N(7, this.A06);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0N(8, this.A04);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0P(9, this.A09);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0M(10, this.A03);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0O(17, A0i());
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0N(18, this.A07);
        }
        this.unknownFields.A02(c0rs);
    }
}
