package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.IOException;

/* renamed from: X.24D */
/* loaded from: classes2.dex */
public final class C24D extends C0AZ implements C0AY {
    public static final C24D A0N;
    public static volatile C0RQ A0O;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C0AN A07;
    public C0AN A08;
    public C0AN A09;
    public C0AN A0A;
    public C0AN A0B;
    public C0AN A0C;
    public C0AN A0D;
    public C0CX A0E;
    public C40521sP A0F;
    public String A0G;
    public String A0H;
    public String A0J;
    public boolean A0L;
    public boolean A0M;
    public String A0K = "";
    public String A0I = "";

    static {
        C24D c24d = new C24D();
        A0N = c24d;
        c24d.A0E();
    }

    public C24D() {
        C0AN c0an = C0AN.A01;
        this.A08 = c0an;
        this.A0A = c0an;
        this.A0G = "";
        this.A07 = c0an;
        this.A0E = C0RU.A01;
        this.A0H = "";
        this.A09 = c0an;
        this.A0B = c0an;
        this.A0J = "";
        this.A0D = c0an;
        this.A0C = c0an;
    }

    public static void A09(C24D c24d, C0AN c0an) {
        c24d.A00 |= 4;
        c24d.A08 = c0an;
    }

    public static void A0A(C24D c24d, C0AN c0an) {
        c24d.A00 |= 32;
        c24d.A0A = c0an;
    }

    public static void A0B(C24D c24d, C0AN c0an) {
        c24d.A00 |= 1024;
        c24d.A07 = c0an;
    }

    public static void A0C(C24D c24d, C0AN c0an) {
        c24d.A00 |= 8192;
        c24d.A09 = c0an;
    }

    public static void A0D(C24D c24d, C0AN c0an) {
        c24d.A00 |= 32768;
        c24d.A0B = c0an;
    }

    public static void A0E(C24D c24d, C0AN c0an) {
        c24d.A00 |= 524288;
        c24d.A0D = c0an;
    }

    public static void A0F(C24D c24d, C0AN c0an) {
        c24d.A00 |= 1048576;
        c24d.A0C = c0an;
    }

    public static void A0G(C24D c24d, C40521sP c40521sP) {
        if (c40521sP != null) {
            c24d.A0F = c40521sP;
            c24d.A00 |= 16384;
            return;
        }
        throw null;
    }

    public static void A0H(C24D c24d, EnumC55262k8 enumC55262k8) {
        if (enumC55262k8 != null) {
            c24d.A00 |= 65536;
            c24d.A01 = enumC55262k8.value;
            return;
        }
        throw null;
    }

    public static void A0I(C24D c24d, String str) {
        if (str != null) {
            c24d.A00 |= 1;
            c24d.A0K = str;
            return;
        }
        throw null;
    }

    public static void A0J(C24D c24d, String str) {
        if (str != null) {
            c24d.A00 |= 2;
            c24d.A0I = str;
            return;
        }
        throw null;
    }

    public static void A0K(C24D c24d, String str) {
        if (str != null) {
            c24d.A00 |= 64;
            c24d.A0G = str;
            return;
        }
        throw null;
    }

    public static void A0L(C24D c24d, String str) {
        if (str != null) {
            c24d.A00 |= 2048;
            c24d.A0H = str;
            return;
        }
        throw null;
    }

    public static void A0M(C24D c24d, String str) {
        if (str != null) {
            c24d.A00 |= 262144;
            c24d.A0J = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        int i = 1048576;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A0N;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24D c24d = (C24D) obj2;
                int i2 = this.A00;
                boolean z2 = (i2 & 1) == 1;
                String str = this.A0K;
                int i3 = c24d.A00;
                this.A0K = c0rm.AWD(z2, str, (i3 & 1) == 1, c24d.A0K);
                this.A0I = c0rm.AWD((i2 & 2) == 2, this.A0I, (i3 & 2) == 2, c24d.A0I);
                this.A08 = c0rm.AW2((i2 & 4) == 4, this.A08, (i3 & 4) == 4, c24d.A08);
                int i4 = this.A00;
                boolean z3 = (i4 & 8) == 8;
                long j = this.A05;
                int i5 = c24d.A00;
                this.A05 = c0rm.AW8(z3, j, (i5 & 8) == 8, c24d.A05);
                this.A03 = c0rm.AW5((i4 & 16) == 16, this.A03, (i5 & 16) == 16, c24d.A03);
                this.A0A = c0rm.AW2((i4 & 32) == 32, this.A0A, (i5 & 32) == 32, c24d.A0A);
                int i6 = this.A00;
                boolean z4 = (i6 & 64) == 64;
                String str2 = this.A0G;
                int i7 = c24d.A00;
                this.A0G = c0rm.AWD(z4, str2, (i7 & 64) == 64, c24d.A0G);
                this.A0L = c0rm.AW1((i6 & 128) == 128, this.A0L, (i7 & 128) == 128, c24d.A0L);
                this.A02 = c0rm.AW5((i6 & 256) == 256, this.A02, (i7 & 256) == 256, c24d.A02);
                this.A04 = c0rm.AW5((i6 & 512) == 512, this.A04, (i7 & 512) == 512, c24d.A04);
                this.A07 = c0rm.AW2((i6 & 1024) == 1024, this.A07, (i7 & 1024) == 1024, c24d.A07);
                this.A0E = c0rm.AW7(this.A0E, c24d.A0E);
                int i8 = this.A00;
                boolean z5 = (i8 & 2048) == 2048;
                String str3 = this.A0H;
                int i9 = c24d.A00;
                this.A0H = c0rm.AWD(z5, str3, (i9 & 2048) == 2048, c24d.A0H);
                this.A06 = c0rm.AW8((i8 & 4096) == 4096, this.A06, (i9 & 4096) == 4096, c24d.A06);
                this.A09 = c0rm.AW2((i8 & 8192) == 8192, this.A09, (i9 & 8192) == 8192, c24d.A09);
                this.A0F = (C40521sP) c0rm.AW9(this.A0F, c24d.A0F);
                this.A0B = c0rm.AW2((this.A00 & 32768) == 32768, this.A0B, (c24d.A00 & 32768) == 32768, c24d.A0B);
                int i10 = this.A00;
                boolean z6 = (i10 & 65536) == 65536;
                int i11 = this.A01;
                int i12 = c24d.A00;
                this.A01 = c0rm.AW5(z6, i11, (i12 & 65536) == 65536, c24d.A01);
                this.A0M = c0rm.AW1((i10 & C42271vT.A09) == 131072, this.A0M, (i12 & C42271vT.A09) == 131072, c24d.A0M);
                this.A0J = c0rm.AWD((i10 & 262144) == 262144, this.A0J, (i12 & 262144) == 262144, c24d.A0J);
                this.A0D = c0rm.AW2((i10 & 524288) == 524288, this.A0D, (i12 & 524288) == 524288, c24d.A0D);
                this.A0C = c0rm.AW2((this.A00 & 1048576) == 1048576, this.A0C, (c24d.A00 & 1048576) == 1048576, c24d.A0C);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c24d.A00;
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
                                this.A0K = A0A;
                                continue;
                                i = 1048576;
                            case 18:
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A0I = A0A2;
                                continue;
                                i = 1048576;
                            case 26:
                                this.A00 |= 4;
                                this.A08 = c0ro.A08();
                                continue;
                                i = 1048576;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                this.A00 |= 8;
                                this.A05 = c0ro.A06();
                                continue;
                                i = 1048576;
                            case 40:
                                this.A00 |= 16;
                                this.A03 = c0ro.A02();
                                continue;
                                i = 1048576;
                            case 50:
                                this.A00 |= 32;
                                this.A0A = c0ro.A08();
                                continue;
                                i = 1048576;
                            case 58:
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 64;
                                this.A0G = A0A3;
                                continue;
                                i = 1048576;
                            case 64:
                                this.A00 |= 128;
                                this.A0L = c0ro.A0F();
                                continue;
                                i = 1048576;
                            case C0M6.A02 /* 72 */:
                                this.A00 |= 256;
                                this.A02 = c0ro.A02();
                                continue;
                                i = 1048576;
                            case 80:
                                this.A00 |= 512;
                                this.A04 = c0ro.A02();
                                continue;
                                i = 1048576;
                            case 90:
                                this.A00 |= 1024;
                                this.A07 = c0ro.A08();
                                continue;
                                i = 1048576;
                            case 98:
                                C0CX c0cx = this.A0E;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A0E = c0cx;
                                }
                                c0cx.add(c0ro.A09(C55402kM.A04.A0C(), c0rp));
                                continue;
                                i = 1048576;
                            case 106:
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 2048;
                                this.A0H = A0A4;
                                continue;
                                i = 1048576;
                            case 112:
                                this.A00 |= 4096;
                                this.A06 = c0ro.A06();
                                continue;
                                i = 1048576;
                            case 130:
                                this.A00 |= 8192;
                                this.A09 = c0ro.A08();
                                continue;
                                i = 1048576;
                            case 138:
                                if ((this.A00 & 16384) == 16384) {
                                    c87333zU = (C87333zU) this.A0F.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A0F = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A0F = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 16384;
                                continue;
                                i = 1048576;
                            case 146:
                                this.A00 |= 32768;
                                this.A0B = c0ro.A08();
                                continue;
                                i = 1048576;
                            case 152:
                                int A02 = c0ro.A02();
                                if (EnumC55262k8.A00(A02) == null) {
                                    super.A0F(19, A02);
                                    continue;
                                } else {
                                    this.A00 |= 65536;
                                    this.A01 = A02;
                                }
                                i = 1048576;
                            case 160:
                                this.A00 |= C42271vT.A09;
                                this.A0M = c0ro.A0F();
                                continue;
                                i = 1048576;
                            case 170:
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 262144;
                                this.A0J = A0A5;
                                continue;
                                i = 1048576;
                            case 178:
                                this.A00 |= 524288;
                                this.A0D = c0ro.A08();
                                continue;
                                i = 1048576;
                            case 186:
                                this.A00 |= i;
                                this.A0C = c0ro.A08();
                                continue;
                                i = 1048576;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                    i = 1048576;
                                }
                        }
                        z = true;
                        i = 1048576;
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
                ((C0CY) this.A0E).A00 = false;
                return null;
            case 4:
                return new C24D();
            case 5:
                return new C0CT() { // from class: X.2Fy
                    {
                        C24D c24d2 = C24D.A0N;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0O == null) {
                    synchronized (C24D.class) {
                        if (A0O == null) {
                            A0O = new C0RR(A0N);
                        }
                    }
                }
                return A0O;
            default:
                throw new UnsupportedOperationException();
        }
        return A0N;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A0F;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A0K) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0B(2, this.A0I);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            i += C0RS.A09(3, this.A08);
        }
        if ((i3 & 8) == 8) {
            i += C0RS.A08(4, this.A05);
        }
        if ((i3 & 16) == 16) {
            i += C0RS.A06(5, this.A03);
        }
        if ((i3 & 32) == 32) {
            i += C0RS.A09(6, this.A0A);
        }
        if ((i3 & 64) == 64) {
            i += C0RS.A0B(7, this.A0G);
        }
        int i4 = this.A00;
        if ((i4 & 128) == 128) {
            i += C0RS.A00(8);
        }
        if ((i4 & 256) == 256) {
            i += C0RS.A06(9, this.A02);
        }
        if ((i4 & 512) == 512) {
            i += C0RS.A06(10, this.A04);
        }
        if ((i4 & 1024) == 1024) {
            i += C0RS.A09(11, this.A07);
        }
        for (int i5 = 0; i5 < this.A0E.size(); i5++) {
            i += C0RS.A0A(12, (C0AX) this.A0E.get(i5));
        }
        if ((this.A00 & 2048) == 2048) {
            i += C0RS.A0B(13, this.A0H);
        }
        int i6 = this.A00;
        if ((i6 & 4096) == 4096) {
            i += C0RS.A07(14, this.A06);
        }
        if ((i6 & 8192) == 8192) {
            i += C0RS.A09(16, this.A09);
        }
        if ((i6 & 16384) == 16384) {
            i += C0RS.A0A(17, A0i());
        }
        int i7 = this.A00;
        if ((i7 & 32768) == 32768) {
            i += C0RS.A09(18, this.A0B);
        }
        if ((i7 & 65536) == 65536) {
            i += C0RS.A04(19, this.A01);
        }
        if ((i7 & C42271vT.A09) == 131072) {
            i += C0RS.A00(20);
        }
        if ((i7 & 262144) == 262144) {
            i += C0RS.A0B(21, this.A0J);
        }
        int i8 = this.A00;
        if ((i8 & 524288) == 524288) {
            i += C0RS.A09(22, this.A0D);
        }
        if ((i8 & 1048576) == 1048576) {
            i += C0RS.A09(23, this.A0C);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A0K);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A0I);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(3, this.A08);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0M(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0K(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0N(6, this.A0A);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0P(7, this.A0G);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0Q(8, this.A0L);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0K(9, this.A02);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0K(10, this.A04);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0N(11, this.A07);
        }
        for (int i = 0; i < this.A0E.size(); i++) {
            c0rs.A0O(12, (C0AX) this.A0E.get(i));
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0P(13, this.A0H);
        }
        if ((this.A00 & 4096) == 4096) {
            c0rs.A0M(14, this.A06);
        }
        if ((this.A00 & 8192) == 8192) {
            c0rs.A0N(16, this.A09);
        }
        if ((this.A00 & 16384) == 16384) {
            c0rs.A0O(17, A0i());
        }
        if ((this.A00 & 32768) == 32768) {
            c0rs.A0N(18, this.A0B);
        }
        if ((this.A00 & 65536) == 65536) {
            c0rs.A0I(19, this.A01);
        }
        if ((this.A00 & C42271vT.A09) == 131072) {
            c0rs.A0Q(20, this.A0M);
        }
        if ((this.A00 & 262144) == 262144) {
            c0rs.A0P(21, this.A0J);
        }
        if ((this.A00 & 524288) == 524288) {
            c0rs.A0N(22, this.A0D);
        }
        if ((this.A00 & 1048576) == 1048576) {
            c0rs.A0N(23, this.A0C);
        }
        this.unknownFields.A02(c0rs);
    }
}
