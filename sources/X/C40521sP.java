package X;

import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1sP */
/* loaded from: classes2.dex */
public final class C40521sP extends C0AZ implements C0AY {
    public static final C40521sP A0H;
    public static volatile C0RQ A0I;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C0AN A05;
    public C0AN A06;
    public C87323zT A08;
    public C40561sT A09;
    public C40531sQ A0A;
    public C452421a A0B;
    public boolean A0G;
    public String A0F = "";
    public String A0D = "";
    public String A0E = "";
    public C0CX A07 = C0RU.A01;
    public String A0C = "";

    static {
        C40521sP c40521sP = new C40521sP();
        A0H = c40521sP;
        c40521sP.A0E();
    }

    public C40521sP() {
        C0AN c0an = C0AN.A01;
        this.A05 = c0an;
        this.A06 = c0an;
    }

    public static void A09(C40521sP c40521sP, C0AN c0an) {
        c40521sP.A00 |= 32;
        c40521sP.A05 = c0an;
    }

    public static void A0A(C40521sP c40521sP, C0AN c0an) {
        c40521sP.A00 |= 8192;
        c40521sP.A06 = c0an;
    }

    public static void A0B(C40521sP c40521sP, C40561sT c40561sT) {
        if (c40561sT != null) {
            c40521sP.A09 = c40561sT;
            c40521sP.A00 |= 16384;
            return;
        }
        throw null;
    }

    public static void A0C(C40521sP c40521sP, C40541sR c40541sR) {
        if (c40521sP != null) {
            c40521sP.A0A = (C40531sQ) c40541sR.A01();
            c40521sP.A00 |= 4;
            return;
        }
        throw null;
    }

    public static void A0D(C40521sP c40521sP, String str) {
        if (str != null) {
            c40521sP.A00 |= 1;
            c40521sP.A0F = str;
            return;
        }
        throw null;
    }

    public static void A0E(C40521sP c40521sP, String str) {
        if (str != null) {
            c40521sP.A00 |= 2;
            c40521sP.A0D = str;
            return;
        }
        throw null;
    }

    public static void A0F(C40521sP c40521sP, String str) {
        if (str != null) {
            c40521sP.A00 |= 8;
            c40521sP.A0E = str;
            return;
        }
        throw null;
    }

    public static void A0G(C40521sP c40521sP, String str) {
        if (str != null) {
            c40521sP.A00 |= 16;
            c40521sP.A0C = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87343zV c87343zV;
        C452521b c452521b;
        C87313zS c87313zS;
        C40541sR c40541sR;
        switch (c0rl.ordinal()) {
            case 0:
                return A0H;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40521sP c40521sP = (C40521sP) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A0F;
                int i2 = c40521sP.A00;
                this.A0F = c0rm.AWD(z, str, (i2 & 1) == 1, c40521sP.A0F);
                this.A0D = c0rm.AWD((i & 2) == 2, this.A0D, (i2 & 2) == 2, c40521sP.A0D);
                this.A0A = (C40531sQ) c0rm.AW9(this.A0A, c40521sP.A0A);
                this.A0E = c0rm.AWD((this.A00 & 8) == 8, this.A0E, (c40521sP.A00 & 8) == 8, c40521sP.A0E);
                this.A07 = c0rm.AW7(this.A07, c40521sP.A07);
                int i3 = this.A00;
                boolean z2 = (i3 & 16) == 16;
                String str2 = this.A0C;
                int i4 = c40521sP.A00;
                this.A0C = c0rm.AWD(z2, str2, (i4 & 16) == 16, c40521sP.A0C);
                this.A05 = c0rm.AW2((i3 & 32) == 32, this.A05, (i4 & 32) == 32, c40521sP.A05);
                int i5 = this.A00;
                boolean z3 = (i5 & 64) == 64;
                int i6 = this.A01;
                int i7 = c40521sP.A00;
                this.A01 = c0rm.AW5(z3, i6, (i7 & 64) == 64, c40521sP.A01);
                this.A03 = c0rm.AW5((i5 & 128) == 128, this.A03, (i7 & 128) == 128, c40521sP.A03);
                this.A0G = c0rm.AW1((i5 & 256) == 256, this.A0G, (i7 & 256) == 256, c40521sP.A0G);
                this.A08 = (C87323zT) c0rm.AW9(this.A08, c40521sP.A08);
                this.A0B = (C452421a) c0rm.AW9(this.A0B, c40521sP.A0B);
                int i8 = this.A00;
                boolean z4 = (i8 & 2048) == 2048;
                int i9 = this.A02;
                int i10 = c40521sP.A00;
                this.A02 = c0rm.AW5(z4, i9, (i10 & 2048) == 2048, c40521sP.A02);
                this.A04 = c0rm.AW8((i8 & 4096) == 4096, this.A04, (i10 & 4096) == 4096, c40521sP.A04);
                this.A06 = c0rm.AW2((i8 & 8192) == 8192, this.A06, (i10 & 8192) == 8192, c40521sP.A06);
                this.A09 = (C40561sT) c0rm.AW9(this.A09, c40521sP.A09);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c40521sP.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    break;
                                case 10:
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A0F = A0A;
                                    continue;
                                case 18:
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A0D = A0A2;
                                    continue;
                                case 26:
                                    if ((this.A00 & 4) == 4) {
                                        c40541sR = (C40541sR) this.A0A.AVX();
                                    } else {
                                        c40541sR = null;
                                    }
                                    C40531sQ c40531sQ = (C40531sQ) c0ro.A09(C40531sQ.A0c.A0C(), c0rp);
                                    this.A0A = c40531sQ;
                                    if (c40541sR != null) {
                                        c40541sR.A03(c40531sQ);
                                        this.A0A = (C40531sQ) c40541sR.A00();
                                    }
                                    this.A00 |= 4;
                                    continue;
                                case 34:
                                    String A0A3 = c0ro.A0A();
                                    this.A00 |= 8;
                                    this.A0E = A0A3;
                                    continue;
                                case 122:
                                    String A0A4 = c0ro.A0A();
                                    C0CX c0cx = this.A07;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A07 = c0cx;
                                    }
                                    c0cx.add(A0A4);
                                    continue;
                                case 146:
                                    String A0A5 = c0ro.A0A();
                                    this.A00 |= 16;
                                    this.A0C = A0A5;
                                    continue;
                                case 154:
                                    this.A00 |= 32;
                                    this.A05 = c0ro.A08();
                                    continue;
                                case 160:
                                    this.A00 |= 64;
                                    this.A01 = c0ro.A02();
                                    continue;
                                case 168:
                                    this.A00 |= 128;
                                    this.A03 = c0ro.A02();
                                    continue;
                                case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /* 176 */:
                                    this.A00 |= 256;
                                    this.A0G = c0ro.A0F();
                                    continue;
                                case 186:
                                    if ((this.A00 & 512) == 512) {
                                        c87313zS = (C87313zS) this.A08.AVX();
                                    } else {
                                        c87313zS = null;
                                    }
                                    C87323zT c87323zT = (C87323zT) c0ro.A09(C87323zT.A05.A0C(), c0rp);
                                    this.A08 = c87323zT;
                                    if (c87313zS != null) {
                                        c87313zS.A03(c87323zT);
                                        this.A08 = (C87323zT) c87313zS.A00();
                                    }
                                    this.A00 |= 512;
                                    continue;
                                case 194:
                                    if ((this.A00 & 1024) == 1024) {
                                        c452521b = (C452521b) this.A0B.AVX();
                                    } else {
                                        c452521b = null;
                                    }
                                    C452421a c452421a = (C452421a) c0ro.A09(C452421a.A05.A0C(), c0rp);
                                    this.A0B = c452421a;
                                    if (c452521b != null) {
                                        c452521b.A03(c452421a);
                                        this.A0B = (C452421a) c452521b.A00();
                                    }
                                    this.A00 |= 1024;
                                    continue;
                                case 200:
                                    this.A00 |= 2048;
                                    this.A02 = c0ro.A02();
                                    continue;
                                case 208:
                                    this.A00 |= 4096;
                                    this.A04 = c0ro.A06();
                                    continue;
                                case 218:
                                    this.A00 |= 8192;
                                    this.A06 = c0ro.A08();
                                    continue;
                                case 226:
                                    if ((this.A00 & 16384) == 16384) {
                                        c87343zV = (C87343zV) this.A09.AVX();
                                    } else {
                                        c87343zV = null;
                                    }
                                    C40561sT c40561sT = (C40561sT) c0ro.A09(C40561sT.A0A.A0C(), c0rp);
                                    this.A09 = c40561sT;
                                    if (c87343zV != null) {
                                        c87343zV.A03(c40561sT);
                                        this.A09 = (C40561sT) c87343zV.A00();
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
                            z5 = true;
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
                ((C0CY) this.A07).A00 = false;
                return null;
            case 4:
                return new C40521sP();
            case 5:
                return new C0CT() { // from class: X.3zU
                    {
                        C40521sP c40521sP2 = C40521sP.A0H;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0I == null) {
                    synchronized (C40521sP.class) {
                        if (A0I == null) {
                            A0I = new C0RR(A0H);
                        }
                    }
                }
                return A0I;
            default:
                throw new UnsupportedOperationException();
        }
        return A0H;
    }

    public C40561sT A0i() {
        C40561sT c40561sT = this.A09;
        return c40561sT == null ? C40561sT.A0A : c40561sT;
    }

    public C40531sQ A0j() {
        C40531sQ c40531sQ = this.A0A;
        return c40531sQ == null ? C40531sQ.A0c : c40531sQ;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A00 & 1) == 1) {
            i = C0RS.A0B(1, this.A0F) + 0;
        } else {
            i = 0;
        }
        if ((this.A00 & 2) == 2) {
            i += C0RS.A0B(2, this.A0D);
        }
        if ((this.A00 & 4) == 4) {
            i += C0RS.A0A(3, A0j());
        }
        if ((this.A00 & 8) == 8) {
            i += C0RS.A0B(4, this.A0E);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.A07.size(); i4++) {
            i3 += C0RS.A0D((String) this.A07.get(i4));
        }
        int size = this.A07.size() + i + i3;
        if ((this.A00 & 16) == 16) {
            size += C0RS.A0B(18, this.A0C);
        }
        int i5 = this.A00;
        if ((i5 & 32) == 32) {
            size += C0RS.A09(19, this.A05);
        }
        if ((i5 & 64) == 64) {
            size += C0RS.A06(20, this.A01);
        }
        if ((i5 & 128) == 128) {
            size += C0RS.A06(21, this.A03);
        }
        if ((i5 & 256) == 256) {
            size += C0RS.A00(22);
        }
        if ((i5 & 512) == 512) {
            C87323zT c87323zT = this.A08;
            if (c87323zT == null) {
                c87323zT = C87323zT.A05;
            }
            size += C0RS.A0A(23, c87323zT);
        }
        if ((this.A00 & 1024) == 1024) {
            C452421a c452421a = this.A0B;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            size += C0RS.A0A(24, c452421a);
        }
        int i6 = this.A00;
        if ((i6 & 2048) == 2048) {
            size += C0RS.A06(25, this.A02);
        }
        if ((i6 & 4096) == 4096) {
            size += C0RS.A07(26, this.A04);
        }
        if ((i6 & 8192) == 8192) {
            size += C0RS.A09(27, this.A06);
        }
        if ((i6 & 16384) == 16384) {
            size += C0RS.A0A(28, A0i());
        }
        int A00 = this.unknownFields.A00() + size;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A0F);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A0D);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(3, A0j());
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(4, this.A0E);
        }
        for (int i = 0; i < this.A07.size(); i++) {
            c0rs.A0P(15, (String) this.A07.get(i));
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(18, this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0N(19, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0K(20, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0K(21, this.A03);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0Q(22, this.A0G);
        }
        if ((this.A00 & 512) == 512) {
            C87323zT c87323zT = this.A08;
            if (c87323zT == null) {
                c87323zT = C87323zT.A05;
            }
            c0rs.A0O(23, c87323zT);
        }
        if ((this.A00 & 1024) == 1024) {
            C452421a c452421a = this.A0B;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            c0rs.A0O(24, c452421a);
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0K(25, this.A02);
        }
        if ((this.A00 & 4096) == 4096) {
            c0rs.A0M(26, this.A04);
        }
        if ((this.A00 & 8192) == 8192) {
            c0rs.A0N(27, this.A06);
        }
        if ((this.A00 & 16384) == 16384) {
            c0rs.A0O(28, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
