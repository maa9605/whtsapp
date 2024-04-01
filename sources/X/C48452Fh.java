package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.IOException;

/* renamed from: X.2Fh  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48452Fh extends C0AZ implements C0AY {
    public static final C48452Fh A0D;
    public static volatile C0RQ A0E;
    public int A00;
    public int A01;
    public long A04;
    public C40521sP A06;
    public String A08 = "";
    public C0AN A05 = C0AN.A01;
    public int A02 = 1;
    public int A03 = 1;
    public String A07 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public String A0C = "";

    static {
        C48452Fh c48452Fh = new C48452Fh();
        A0D = c48452Fh;
        c48452Fh.A0E();
    }

    public static void A09(C48452Fh c48452Fh, C0AN c0an) {
        c48452Fh.A00 |= 2;
        c48452Fh.A05 = c0an;
    }

    public static void A0A(C48452Fh c48452Fh, C40521sP c40521sP) {
        if (c40521sP != null) {
            c48452Fh.A06 = c40521sP;
            c48452Fh.A00 |= 2048;
            return;
        }
        throw null;
    }

    public static void A0B(C48452Fh c48452Fh, EnumC79273lO enumC79273lO) {
        c48452Fh.A00 |= 8;
        c48452Fh.A02 = enumC79273lO.value;
    }

    public static void A0C(C48452Fh c48452Fh, EnumC79283lP enumC79283lP) {
        c48452Fh.A00 |= 16;
        c48452Fh.A03 = enumC79283lP.value;
    }

    public static void A0D(C48452Fh c48452Fh, String str) {
        c48452Fh.A00 |= 1;
        c48452Fh.A08 = str;
    }

    public static void A0E(C48452Fh c48452Fh, String str) {
        c48452Fh.A00 |= 32;
        c48452Fh.A07 = str;
    }

    public static void A0F(C48452Fh c48452Fh, String str) {
        c48452Fh.A00 |= 64;
        c48452Fh.A09 = str;
    }

    public static void A0G(C48452Fh c48452Fh, String str) {
        if (str != null) {
            c48452Fh.A00 |= 128;
            c48452Fh.A0A = str;
            return;
        }
        throw null;
    }

    public static void A0H(C48452Fh c48452Fh, String str) {
        c48452Fh.A00 |= 256;
        c48452Fh.A0B = str;
    }

    public static void A0I(C48452Fh c48452Fh, String str) {
        if (str != null) {
            c48452Fh.A00 |= 1024;
            c48452Fh.A0C = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        EnumC79283lP enumC79283lP;
        EnumC79273lO enumC79273lO;
        switch (c0rl.ordinal()) {
            case 0:
                return A0D;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48452Fh c48452Fh = (C48452Fh) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A08;
                int i2 = c48452Fh.A00;
                this.A08 = c0rm.AWD(z, str, (i2 & 1) == 1, c48452Fh.A08);
                this.A05 = c0rm.AW2((i & 2) == 2, this.A05, (i2 & 2) == 2, c48452Fh.A05);
                int i3 = this.A00;
                boolean z2 = (i3 & 4) == 4;
                int i4 = this.A01;
                int i5 = c48452Fh.A00;
                this.A01 = c0rm.AW5(z2, i4, (i5 & 4) == 4, c48452Fh.A01);
                this.A02 = c0rm.AW5((i3 & 8) == 8, this.A02, (i5 & 8) == 8, c48452Fh.A02);
                this.A03 = c0rm.AW5((i3 & 16) == 16, this.A03, (i5 & 16) == 16, c48452Fh.A03);
                this.A07 = c0rm.AWD((i3 & 32) == 32, this.A07, (i5 & 32) == 32, c48452Fh.A07);
                this.A09 = c0rm.AWD((i3 & 64) == 64, this.A09, (i5 & 64) == 64, c48452Fh.A09);
                this.A0A = c0rm.AWD((i3 & 128) == 128, this.A0A, (i5 & 128) == 128, c48452Fh.A0A);
                this.A0B = c0rm.AWD((i3 & 256) == 256, this.A0B, (i5 & 256) == 256, c48452Fh.A0B);
                this.A04 = c0rm.AW8((i3 & 512) == 512, this.A04, (i5 & 512) == 512, c48452Fh.A04);
                this.A0C = c0rm.AWD((i3 & 1024) == 1024, this.A0C, (i5 & 1024) == 1024, c48452Fh.A0C);
                this.A06 = (C40521sP) c0rm.AW9(this.A06, c48452Fh.A06);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c48452Fh.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                break;
                            case 10:
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A08 = A0A;
                                continue;
                            case 18:
                                this.A00 |= 2;
                                this.A05 = c0ro.A08();
                                continue;
                            case 24:
                                this.A00 |= 4;
                                this.A01 = c0ro.A02();
                                continue;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                int A02 = c0ro.A02();
                                if (A02 == 1) {
                                    enumC79273lO = EnumC79273lO.A01;
                                } else {
                                    enumC79273lO = null;
                                }
                                if (enumC79273lO == null) {
                                    super.A0F(4, A02);
                                } else {
                                    this.A00 |= 8;
                                    this.A02 = A02;
                                    continue;
                                }
                            case 40:
                                int A022 = c0ro.A02();
                                if (A022 == 1) {
                                    enumC79283lP = EnumC79283lP.A01;
                                } else {
                                    enumC79283lP = null;
                                }
                                if (enumC79283lP == null) {
                                    super.A0F(5, A022);
                                } else {
                                    this.A00 |= 16;
                                    this.A03 = A022;
                                    continue;
                                }
                            case 50:
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 32;
                                this.A07 = A0A2;
                                continue;
                            case 58:
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 64;
                                this.A09 = A0A3;
                                continue;
                            case 66:
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A0A = A0A4;
                                continue;
                            case 74:
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 256;
                                this.A0B = A0A5;
                                continue;
                            case 80:
                                this.A00 |= 512;
                                this.A04 = c0ro.A06();
                                continue;
                            case 90:
                                String A0A6 = c0ro.A0A();
                                this.A00 |= 1024;
                                this.A0C = A0A6;
                                continue;
                            case 138:
                                if ((this.A00 & 2048) == 2048) {
                                    c87333zU = (C87333zU) this.A06.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A06 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A06 = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 2048;
                                continue;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z3 = true;
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
                return new C48452Fh();
            case 5:
                return new C0CT() { // from class: X.2Fg
                    {
                        C48452Fh c48452Fh2 = C48452Fh.A0D;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0E == null) {
                    synchronized (C48452Fh.class) {
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
        C40521sP c40521sP = this.A06;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A08) : 0;
        int i2 = this.A00;
        if ((i2 & 2) == 2) {
            A0B += C0RS.A09(2, this.A05);
        }
        if ((i2 & 4) == 4) {
            A0B += C0RS.A05(3, this.A01);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A04(4, this.A02);
        }
        if ((i2 & 16) == 16) {
            A0B += C0RS.A04(5, this.A03);
        }
        if ((i2 & 32) == 32) {
            A0B += C0RS.A0B(6, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            A0B += C0RS.A0B(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            A0B += C0RS.A0B(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            A0B += C0RS.A0B(9, this.A0B);
        }
        int i3 = this.A00;
        if ((i3 & 512) == 512) {
            A0B += C0RS.A07(10, this.A04);
        }
        if ((i3 & 1024) == 1024) {
            A0B += C0RS.A0B(11, this.A0C);
        }
        if ((this.A00 & 2048) == 2048) {
            A0B += C0RS.A0A(17, A0i());
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A08);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0N(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0I(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0I(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0I(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(6, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0P(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0P(9, this.A0B);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0M(10, this.A04);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0P(11, this.A0C);
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0O(17, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
