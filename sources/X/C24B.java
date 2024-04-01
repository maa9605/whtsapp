package X;

import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.24B  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C24B extends C0AZ implements C0AY {
    public static final C24B A0K;
    public static volatile C0RQ A0L;
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
    public C0AN A0B;
    public C40521sP A0C;
    public String A0D;
    public String A0E;
    public String A0G;
    public boolean A0J;
    public String A0I = "";
    public String A0F = "";
    public String A0H = "";

    static {
        C24B c24b = new C24B();
        A0K = c24b;
        c24b.A0E();
    }

    public C24B() {
        C0AN c0an = C0AN.A01;
        this.A07 = c0an;
        this.A09 = c0an;
        this.A0E = "";
        this.A06 = c0an;
        this.A0D = "";
        this.A0G = "";
        this.A0B = c0an;
        this.A0A = c0an;
        this.A08 = c0an;
    }

    public static void A09(C24B c24b, C0AN c0an) {
        c24b.A00 |= 8;
        c24b.A07 = c0an;
    }

    public static void A0A(C24B c24b, C0AN c0an) {
        c24b.A00 |= 64;
        c24b.A09 = c0an;
    }

    public static void A0B(C24B c24b, C0AN c0an) {
        c24b.A00 |= 256;
        c24b.A06 = c0an;
    }

    public static void A0C(C24B c24b, C0AN c0an) {
        c24b.A00 |= 8192;
        c24b.A0B = c0an;
    }

    public static void A0D(C24B c24b, C0AN c0an) {
        c24b.A00 |= 16384;
        c24b.A0A = c0an;
    }

    public static void A0E(C24B c24b, C0AN c0an) {
        c24b.A00 |= 32768;
        c24b.A08 = c0an;
    }

    public static void A0F(C24B c24b, C40521sP c40521sP) {
        if (c40521sP != null) {
            c24b.A0C = c40521sP;
            c24b.A00 |= 65536;
            return;
        }
        throw null;
    }

    public static void A0G(C24B c24b, String str) {
        if (str != null) {
            c24b.A00 |= 1;
            c24b.A0I = str;
            return;
        }
        throw null;
    }

    public static void A0H(C24B c24b, String str) {
        c24b.A00 |= 2;
        c24b.A0F = str;
    }

    public static void A0I(C24B c24b, String str) {
        c24b.A00 |= 4;
        c24b.A0H = str;
    }

    public static void A0J(C24B c24b, String str) {
        if (str != null) {
            c24b.A00 |= 128;
            c24b.A0E = str;
            return;
        }
        throw null;
    }

    public static void A0K(C24B c24b, String str) {
        if (str != null) {
            c24b.A00 |= 512;
            c24b.A0D = str;
            return;
        }
        throw null;
    }

    public static void A0L(C24B c24b, String str) {
        if (str != null) {
            c24b.A00 |= 4096;
            c24b.A0G = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        int ordinal = c0rl.ordinal();
        int i = 262144;
        int i2 = C42271vT.A09;
        boolean z = false;
        switch (ordinal) {
            case 0:
                return A0K;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24B c24b = (C24B) obj2;
                int i3 = this.A00;
                boolean z2 = (i3 & 1) == 1;
                String str = this.A0I;
                int i4 = c24b.A00;
                this.A0I = c0rm.AWD(z2, str, (i4 & 1) == 1, c24b.A0I);
                this.A0F = c0rm.AWD((i3 & 2) == 2, this.A0F, (i4 & 2) == 2, c24b.A0F);
                this.A0H = c0rm.AWD((i3 & 4) == 4, this.A0H, (i4 & 4) == 4, c24b.A0H);
                this.A07 = c0rm.AW2((i3 & 8) == 8, this.A07, (i4 & 8) == 8, c24b.A07);
                int i5 = this.A00;
                boolean z3 = (i5 & 16) == 16;
                long j = this.A04;
                int i6 = c24b.A00;
                this.A04 = c0rm.AW8(z3, j, (i6 & 16) == 16, c24b.A04);
                this.A01 = c0rm.AW5((i5 & 32) == 32, this.A01, (i6 & 32) == 32, c24b.A01);
                this.A09 = c0rm.AW2((i5 & 64) == 64, this.A09, (i6 & 64) == 64, c24b.A09);
                int i7 = this.A00;
                boolean z4 = (i7 & 128) == 128;
                String str2 = this.A0E;
                int i8 = c24b.A00;
                this.A0E = c0rm.AWD(z4, str2, (i8 & 128) == 128, c24b.A0E);
                this.A06 = c0rm.AW2((i7 & 256) == 256, this.A06, (i8 & 256) == 256, c24b.A06);
                int i9 = this.A00;
                boolean z5 = (i9 & 512) == 512;
                String str3 = this.A0D;
                int i10 = c24b.A00;
                this.A0D = c0rm.AWD(z5, str3, (i10 & 512) == 512, c24b.A0D);
                this.A05 = c0rm.AW8((i9 & 1024) == 1024, this.A05, (i10 & 1024) == 1024, c24b.A05);
                this.A0J = c0rm.AW1((i9 & 2048) == 2048, this.A0J, (i10 & 2048) == 2048, c24b.A0J);
                this.A0G = c0rm.AWD((i9 & 4096) == 4096, this.A0G, (i10 & 4096) == 4096, c24b.A0G);
                this.A0B = c0rm.AW2((i9 & 8192) == 8192, this.A0B, (i10 & 8192) == 8192, c24b.A0B);
                this.A0A = c0rm.AW2((this.A00 & 16384) == 16384, this.A0A, (c24b.A00 & 16384) == 16384, c24b.A0A);
                this.A08 = c0rm.AW2((this.A00 & 32768) == 32768, this.A08, (c24b.A00 & 32768) == 32768, c24b.A08);
                this.A0C = (C40521sP) c0rm.AW9(this.A0C, c24b.A0C);
                int i11 = this.A00;
                boolean z6 = (i11 & C42271vT.A09) == 131072;
                int i12 = this.A02;
                int i13 = c24b.A00;
                this.A02 = c0rm.AW5(z6, i12, (i13 & C42271vT.A09) == 131072, c24b.A02);
                this.A03 = c0rm.AW5((i11 & 262144) == 262144, this.A03, (i13 & 262144) == 262144, c24b.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 = i11 | i13;
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
                                this.A0I = A0A;
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 18:
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A0F = A0A2;
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 26:
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 4;
                                this.A0H = A0A3;
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 34:
                                this.A00 |= 8;
                                this.A07 = c0ro.A08();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 40:
                                this.A00 |= 16;
                                this.A04 = c0ro.A06();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 48:
                                this.A00 |= 32;
                                this.A01 = c0ro.A02();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 58:
                                this.A00 |= 64;
                                this.A09 = c0ro.A08();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 66:
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A0E = A0A4;
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 74:
                                this.A00 |= 256;
                                this.A06 = c0ro.A08();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 82:
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 512;
                                this.A0D = A0A5;
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 88:
                                this.A00 |= 1024;
                                this.A05 = c0ro.A06();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 96:
                                this.A00 |= 2048;
                                this.A0J = c0ro.A0F();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 106:
                                String A0A6 = c0ro.A0A();
                                this.A00 |= 4096;
                                this.A0G = A0A6;
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 114:
                                this.A00 |= 8192;
                                this.A0B = c0ro.A08();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 122:
                                this.A00 |= 16384;
                                this.A0A = c0ro.A08();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 130:
                                this.A00 |= 32768;
                                this.A08 = c0ro.A08();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 138:
                                if ((this.A00 & 65536) == 65536) {
                                    c87333zU = (C87333zU) this.A0C.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A0C = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A0C = (C40521sP) c87333zU.A00();
                                }
                                this.A00 = 65536 | this.A00;
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /* 144 */:
                                this.A00 |= i2;
                                this.A02 = c0ro.A02();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            case 152:
                                this.A00 |= i;
                                this.A03 = c0ro.A02();
                                continue;
                                i = 262144;
                                i2 = C42271vT.A09;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                    i = 262144;
                                    i2 = C42271vT.A09;
                                }
                        }
                        z = true;
                        i = 262144;
                        i2 = C42271vT.A09;
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
                return new C24B();
            case 5:
                return new C0CT() { // from class: X.2FV
                    {
                        C24B c24b2 = C24B.A0K;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0L == null) {
                    synchronized (C24B.class) {
                        if (A0L == null) {
                            A0L = new C0RR(A0K);
                        }
                    }
                }
                return A0L;
            default:
                throw new UnsupportedOperationException();
        }
        return A0K;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A0C;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A0I) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A0F);
        }
        if ((this.A00 & 4) == 4) {
            A0B += C0RS.A0B(3, this.A0H);
        }
        int i2 = this.A00;
        if ((i2 & 8) == 8) {
            A0B += C0RS.A09(4, this.A07);
        }
        if ((i2 & 16) == 16) {
            A0B += C0RS.A08(5, this.A04);
        }
        if ((i2 & 32) == 32) {
            A0B += C0RS.A06(6, this.A01);
        }
        if ((i2 & 64) == 64) {
            A0B += C0RS.A09(7, this.A09);
        }
        if ((i2 & 128) == 128) {
            A0B += C0RS.A0B(8, this.A0E);
        }
        int i3 = this.A00;
        if ((i3 & 256) == 256) {
            A0B += C0RS.A09(9, this.A06);
        }
        if ((i3 & 512) == 512) {
            A0B += C0RS.A0B(10, this.A0D);
        }
        int i4 = this.A00;
        if ((i4 & 1024) == 1024) {
            A0B += C0RS.A07(11, this.A05);
        }
        if ((i4 & 2048) == 2048) {
            A0B += C0RS.A00(12);
        }
        if ((i4 & 4096) == 4096) {
            A0B += C0RS.A0B(13, this.A0G);
        }
        int i5 = this.A00;
        if ((i5 & 8192) == 8192) {
            A0B += C0RS.A09(14, this.A0B);
        }
        if ((i5 & 16384) == 16384) {
            A0B += C0RS.A09(15, this.A0A);
        }
        if ((i5 & 32768) == 32768) {
            A0B += C0RS.A09(16, this.A08);
        }
        if ((i5 & 65536) == 65536) {
            A0B += C0RS.A0A(17, A0i());
        }
        int i6 = this.A00;
        if ((i6 & C42271vT.A09) == 131072) {
            A0B += C0RS.A06(18, this.A02);
        }
        if ((i6 & 262144) == 262144) {
            A0B += C0RS.A06(19, this.A03);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A0I);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A0F);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A0H);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A07);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0M(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0K(6, this.A01);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0N(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A0E);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0N(9, this.A06);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0P(10, this.A0D);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0M(11, this.A05);
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0Q(12, this.A0J);
        }
        if ((this.A00 & 4096) == 4096) {
            c0rs.A0P(13, this.A0G);
        }
        if ((this.A00 & 8192) == 8192) {
            c0rs.A0N(14, this.A0B);
        }
        if ((this.A00 & 16384) == 16384) {
            c0rs.A0N(15, this.A0A);
        }
        if ((this.A00 & 32768) == 32768) {
            c0rs.A0N(16, this.A08);
        }
        if ((this.A00 & 65536) == 65536) {
            c0rs.A0O(17, A0i());
        }
        if ((this.A00 & C42271vT.A09) == 131072) {
            c0rs.A0K(18, this.A02);
        }
        if ((this.A00 & 262144) == 262144) {
            c0rs.A0K(19, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
