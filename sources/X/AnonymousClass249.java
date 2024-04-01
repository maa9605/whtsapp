package X;

import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.249 */
/* loaded from: classes2.dex */
public final class AnonymousClass249 extends C0AZ implements C0AY {
    public static final AnonymousClass249 A0Q;
    public static volatile C0RQ A0R;
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
    public C0AN A0E;
    public C0AN A0F;
    public C0AN A0G;
    public C0O0 A0H;
    public C0CX A0I;
    public C40521sP A0J;
    public String A0L;
    public String A0N;
    public boolean A0P;
    public String A0O = "";
    public String A0M = "";
    public String A0K = "";

    static {
        AnonymousClass249 anonymousClass249 = new AnonymousClass249();
        A0Q = anonymousClass249;
        anonymousClass249.A0E();
    }

    public AnonymousClass249() {
        C0AN c0an = C0AN.A01;
        this.A08 = c0an;
        this.A0B = c0an;
        this.A07 = c0an;
        this.A0I = C0RU.A01;
        this.A0L = "";
        this.A0A = c0an;
        this.A09 = c0an;
        this.A0E = c0an;
        this.A0H = C09550eI.A02;
        this.A0D = c0an;
        this.A0C = c0an;
        this.A0N = "";
        this.A0G = c0an;
        this.A0F = c0an;
    }

    public static void A09(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= 8;
        anonymousClass249.A08 = c0an;
    }

    public static void A0A(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= 128;
        anonymousClass249.A0B = c0an;
    }

    public static void A0B(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= 256;
        anonymousClass249.A07 = c0an;
    }

    public static void A0C(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= 2048;
        anonymousClass249.A0A = c0an;
    }

    public static void A0D(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= 65536;
        anonymousClass249.A0E = c0an;
    }

    public static void A0E(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= C42271vT.A09;
        anonymousClass249.A0D = c0an;
    }

    public static void A0F(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= 2097152;
        anonymousClass249.A0G = c0an;
    }

    public static void A0G(AnonymousClass249 anonymousClass249, C0AN c0an) {
        anonymousClass249.A00 |= 4194304;
        anonymousClass249.A0F = c0an;
    }

    public static void A0H(AnonymousClass249 anonymousClass249, C40521sP c40521sP) {
        if (c40521sP != null) {
            anonymousClass249.A0J = c40521sP;
            anonymousClass249.A00 |= 4096;
            return;
        }
        throw null;
    }

    public static void A0I(AnonymousClass249 anonymousClass249, String str) {
        if (str != null) {
            anonymousClass249.A00 |= 2;
            anonymousClass249.A0M = str;
            return;
        }
        throw null;
    }

    public static void A0J(AnonymousClass249 anonymousClass249, String str) {
        if (str != null) {
            anonymousClass249.A00 |= 4;
            anonymousClass249.A0K = str;
            return;
        }
        throw null;
    }

    public static void A0K(AnonymousClass249 anonymousClass249, String str) {
        if (str != null) {
            anonymousClass249.A00 |= 512;
            anonymousClass249.A0L = str;
            return;
        }
        throw null;
    }

    public static void A0L(AnonymousClass249 anonymousClass249, String str) {
        if (str != null) {
            anonymousClass249.A00 |= 1048576;
            anonymousClass249.A0N = str;
            return;
        }
        throw null;
    }

    public static void A0M(AnonymousClass249 anonymousClass249, String str) {
        if (str != null) {
            anonymousClass249.A00 |= 1;
            anonymousClass249.A0O = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        int i = 524288;
        int i2 = 4194304;
        switch (c0rl.ordinal()) {
            case 0:
                return A0Q;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass249 anonymousClass249 = (AnonymousClass249) obj2;
                int i3 = this.A00;
                boolean z = (i3 & 1) == 1;
                String str = this.A0O;
                int i4 = anonymousClass249.A00;
                this.A0O = c0rm.AWD(z, str, (i4 & 1) == 1, anonymousClass249.A0O);
                this.A0M = c0rm.AWD((i3 & 2) == 2, this.A0M, (i4 & 2) == 2, anonymousClass249.A0M);
                this.A0K = c0rm.AWD((i3 & 4) == 4, this.A0K, (i4 & 4) == 4, anonymousClass249.A0K);
                this.A08 = c0rm.AW2((i3 & 8) == 8, this.A08, (i4 & 8) == 8, anonymousClass249.A08);
                int i5 = this.A00;
                boolean z2 = (i5 & 16) == 16;
                long j = this.A05;
                int i6 = anonymousClass249.A00;
                this.A05 = c0rm.AW8(z2, j, (i6 & 16) == 16, anonymousClass249.A05);
                this.A03 = c0rm.AW5((i5 & 32) == 32, this.A03, (i6 & 32) == 32, anonymousClass249.A03);
                this.A04 = c0rm.AW5((i5 & 64) == 64, this.A04, (i6 & 64) == 64, anonymousClass249.A04);
                this.A0B = c0rm.AW2((i5 & 128) == 128, this.A0B, (i6 & 128) == 128, anonymousClass249.A0B);
                this.A07 = c0rm.AW2((this.A00 & 256) == 256, this.A07, (anonymousClass249.A00 & 256) == 256, anonymousClass249.A07);
                this.A0I = c0rm.AW7(this.A0I, anonymousClass249.A0I);
                int i7 = this.A00;
                boolean z3 = (i7 & 512) == 512;
                String str2 = this.A0L;
                int i8 = anonymousClass249.A00;
                this.A0L = c0rm.AWD(z3, str2, (i8 & 512) == 512, anonymousClass249.A0L);
                this.A06 = c0rm.AW8((i7 & 1024) == 1024, this.A06, (i8 & 1024) == 1024, anonymousClass249.A06);
                this.A0A = c0rm.AW2((i7 & 2048) == 2048, this.A0A, (i8 & 2048) == 2048, anonymousClass249.A0A);
                this.A0J = (C40521sP) c0rm.AW9(this.A0J, anonymousClass249.A0J);
                this.A09 = c0rm.AW2((this.A00 & 8192) == 8192, this.A09, (anonymousClass249.A00 & 8192) == 8192, anonymousClass249.A09);
                int i9 = this.A00;
                boolean z4 = (i9 & 16384) == 16384;
                int i10 = this.A02;
                int i11 = anonymousClass249.A00;
                this.A02 = c0rm.AW5(z4, i10, (i11 & 16384) == 16384, anonymousClass249.A02);
                this.A01 = c0rm.AW5((i9 & 32768) == 32768, this.A01, (i11 & 32768) == 32768, anonymousClass249.A01);
                this.A0E = c0rm.AW2((i9 & 65536) == 65536, this.A0E, (i11 & 65536) == 65536, anonymousClass249.A0E);
                this.A0H = c0rm.AW6(this.A0H, anonymousClass249.A0H);
                this.A0D = c0rm.AW2((this.A00 & C42271vT.A09) == 131072, this.A0D, (anonymousClass249.A00 & C42271vT.A09) == 131072, anonymousClass249.A0D);
                this.A0C = c0rm.AW2((this.A00 & 262144) == 262144, this.A0C, (anonymousClass249.A00 & 262144) == 262144, anonymousClass249.A0C);
                int i12 = this.A00;
                boolean z5 = (i12 & 524288) == 524288;
                boolean z6 = this.A0P;
                int i13 = anonymousClass249.A00;
                this.A0P = c0rm.AW1(z5, z6, (i13 & 524288) == 524288, anonymousClass249.A0P);
                this.A0N = c0rm.AWD((i12 & 1048576) == 1048576, this.A0N, (i13 & 1048576) == 1048576, anonymousClass249.A0N);
                this.A0G = c0rm.AW2((i12 & 2097152) == 2097152, this.A0G, (i13 & 2097152) == 2097152, anonymousClass249.A0G);
                this.A0F = c0rm.AW2((this.A00 & 4194304) == 4194304, this.A0F, (anonymousClass249.A00 & 4194304) == 4194304, anonymousClass249.A0F);
                if (c0rm == C0RN.A00) {
                    this.A00 |= anonymousClass249.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r7) {
                    try {
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                break;
                            case 10:
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A0O = A0A;
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 18:
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A0M = A0A2;
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 26:
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 4;
                                this.A0K = A0A3;
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 34:
                                this.A00 |= 8;
                                this.A08 = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 40:
                                this.A00 |= 16;
                                this.A05 = c0ro.A06();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 48:
                                this.A00 |= 32;
                                this.A03 = c0ro.A02();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 56:
                                this.A00 |= 64;
                                this.A04 = c0ro.A02();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 66:
                                this.A00 |= 128;
                                this.A0B = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 74:
                                this.A00 |= 256;
                                this.A07 = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 82:
                                C0CX c0cx = this.A0I;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A0I = c0cx;
                                }
                                c0cx.add(c0ro.A09(C55402kM.A04.A0C(), c0rp));
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 90:
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 512;
                                this.A0L = A0A4;
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 96:
                                this.A00 |= 1024;
                                this.A06 = c0ro.A06();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 130:
                                this.A00 |= 2048;
                                this.A0A = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 138:
                                if ((this.A00 & 4096) == 4096) {
                                    c87333zU = (C87333zU) this.A0J.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A0J = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A0J = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 4096;
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 146:
                                this.A00 |= 8192;
                                this.A09 = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 152:
                                this.A00 |= 16384;
                                this.A02 = c0ro.A02();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 160:
                                this.A00 |= 32768;
                                this.A01 = c0ro.A02();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 170:
                                this.A00 |= 65536;
                                this.A0E = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /* 176 */:
                                C0O0 c0o0 = this.A0H;
                                if (!((C0CY) c0o0).A00) {
                                    c0o0 = C0AZ.A04(c0o0);
                                    this.A0H = c0o0;
                                }
                                C09550eI c09550eI = (C09550eI) c0o0;
                                c09550eI.A03(c09550eI.A00, c0ro.A02());
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 178:
                                int A04 = c0ro.A04(c0ro.A02());
                                C0O0 c0o02 = this.A0H;
                                if (!((C0CY) c0o02).A00 && c0ro.A00() > 0) {
                                    this.A0H = C0AZ.A04(c0o02);
                                }
                                while (c0ro.A00() > 0) {
                                    C09550eI c09550eI2 = (C09550eI) this.A0H;
                                    c09550eI2.A03(c09550eI2.A00, c0ro.A02());
                                }
                                c0ro.A03 = A04;
                                c0ro.A0B();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                                break;
                            case 186:
                                this.A00 |= C42271vT.A09;
                                this.A0D = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 194:
                                this.A00 |= 262144;
                                this.A0C = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 200:
                                this.A00 |= i;
                                this.A0P = c0ro.A0F();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 210:
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 1048576;
                                this.A0N = A0A5;
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 218:
                                this.A00 |= 2097152;
                                this.A0G = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            case 226:
                                this.A00 |= i2;
                                this.A0F = c0ro.A08();
                                continue;
                                i = 524288;
                                i2 = 4194304;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                    i = 524288;
                                    i2 = 4194304;
                                }
                        }
                        r7 = true;
                        i = 524288;
                        i2 = 4194304;
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
                ((C0CY) this.A0I).A00 = false;
                ((C0CY) this.A0H).A00 = false;
                return null;
            case 4:
                return new AnonymousClass249();
            case 5:
                return new C0CT() { // from class: X.2G6
                    {
                        AnonymousClass249 anonymousClass2492 = AnonymousClass249.A0Q;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0R == null) {
                    synchronized (AnonymousClass249.class) {
                        if (A0R == null) {
                            A0R = new C0RR(A0Q);
                        }
                    }
                }
                return A0R;
            default:
                throw new UnsupportedOperationException();
        }
        return A0Q;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A0J;
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
            i = C0RS.A0B(1, this.A0O) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0B(2, this.A0M);
        }
        if ((this.A00 & 4) == 4) {
            i += C0RS.A0B(3, this.A0K);
        }
        int i3 = this.A00;
        if ((i3 & 8) == 8) {
            i += C0RS.A09(4, this.A08);
        }
        if ((i3 & 16) == 16) {
            i += C0RS.A08(5, this.A05);
        }
        if ((i3 & 32) == 32) {
            i += C0RS.A06(6, this.A03);
        }
        if ((i3 & 64) == 64) {
            i += C0RS.A06(7, this.A04);
        }
        if ((i3 & 128) == 128) {
            i += C0RS.A09(8, this.A0B);
        }
        if ((i3 & 256) == 256) {
            i += C0RS.A09(9, this.A07);
        }
        for (int i4 = 0; i4 < this.A0I.size(); i4++) {
            i += C0RS.A0A(10, (C0AX) this.A0I.get(i4));
        }
        if ((this.A00 & 512) == 512) {
            i += C0RS.A0B(11, this.A0L);
        }
        int i5 = this.A00;
        if ((i5 & 1024) == 1024) {
            i += C0RS.A07(12, this.A06);
        }
        if ((i5 & 2048) == 2048) {
            i += C0RS.A09(16, this.A0A);
        }
        if ((i5 & 4096) == 4096) {
            i += C0RS.A0A(17, A0i());
        }
        int i6 = this.A00;
        if ((i6 & 8192) == 8192) {
            i += C0RS.A09(18, this.A09);
        }
        if ((i6 & 16384) == 16384) {
            i += C0RS.A06(19, this.A02);
        }
        if ((i6 & 32768) == 32768) {
            i += C0RS.A06(20, this.A01);
        }
        if ((i6 & 65536) == 65536) {
            i += C0RS.A09(21, this.A0E);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.A0H.size(); i8++) {
            C09550eI c09550eI = (C09550eI) this.A0H;
            c09550eI.A02(i8);
            i7 += C0RS.A03(c09550eI.A01[i8]);
        }
        int size = (this.A0H.size() << 1) + i + i7;
        int i9 = this.A00;
        if ((i9 & C42271vT.A09) == 131072) {
            size += C0RS.A09(23, this.A0D);
        }
        if ((i9 & 262144) == 262144) {
            size += C0RS.A09(24, this.A0C);
        }
        if ((i9 & 524288) == 524288) {
            size += C0RS.A00(25);
        }
        if ((i9 & 1048576) == 1048576) {
            size += C0RS.A0B(26, this.A0N);
        }
        int i10 = this.A00;
        if ((i10 & 2097152) == 2097152) {
            size += C0RS.A09(27, this.A0G);
        }
        if ((i10 & 4194304) == 4194304) {
            size += C0RS.A09(28, this.A0F);
        }
        int A00 = this.unknownFields.A00() + size;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A0O);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A0M);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A0K);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0N(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0M(5, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0K(6, this.A03);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0K(7, this.A04);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0N(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0N(9, this.A07);
        }
        for (int i = 0; i < this.A0I.size(); i++) {
            c0rs.A0O(10, (C0AX) this.A0I.get(i));
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0P(11, this.A0L);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0M(12, this.A06);
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0N(16, this.A0A);
        }
        if ((this.A00 & 4096) == 4096) {
            c0rs.A0O(17, A0i());
        }
        if ((this.A00 & 8192) == 8192) {
            c0rs.A0N(18, this.A09);
        }
        if ((this.A00 & 16384) == 16384) {
            c0rs.A0K(19, this.A02);
        }
        if ((this.A00 & 32768) == 32768) {
            c0rs.A0K(20, this.A01);
        }
        if ((this.A00 & 65536) == 65536) {
            c0rs.A0N(21, this.A0E);
        }
        for (int i2 = 0; i2 < this.A0H.size(); i2++) {
            C09550eI c09550eI = (C09550eI) this.A0H;
            c09550eI.A02(i2);
            c0rs.A0K(22, c09550eI.A01[i2]);
        }
        if ((this.A00 & C42271vT.A09) == 131072) {
            c0rs.A0N(23, this.A0D);
        }
        if ((this.A00 & 262144) == 262144) {
            c0rs.A0N(24, this.A0C);
        }
        if ((this.A00 & 524288) == 524288) {
            c0rs.A0Q(25, this.A0P);
        }
        if ((this.A00 & 1048576) == 1048576) {
            c0rs.A0P(26, this.A0N);
        }
        if ((this.A00 & 2097152) == 2097152) {
            c0rs.A0N(27, this.A0G);
        }
        if ((this.A00 & 4194304) == 4194304) {
            c0rs.A0N(28, this.A0F);
        }
        this.unknownFields.A02(c0rs);
    }
}
