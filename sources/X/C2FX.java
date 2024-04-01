package X;

import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.2FX */
/* loaded from: classes2.dex */
public final class C2FX extends C0AZ implements C0AY {
    public static final C2FX A0D;
    public static volatile C0RQ A0E;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C40521sP A06;
    public boolean A0C;
    public String A0A = "";
    public String A09 = "";
    public String A07 = "";
    public String A08 = "";
    public String A0B = "";
    public C0AN A05 = C0AN.A01;

    static {
        C2FX c2fx = new C2FX();
        A0D = c2fx;
        c2fx.A0E();
    }

    public static void A09(C2FX c2fx, C0AN c0an) {
        c2fx.A01 |= 512;
        c2fx.A05 = c0an;
    }

    public static void A0A(C2FX c2fx, C40521sP c40521sP) {
        if (c40521sP != null) {
            c2fx.A06 = c40521sP;
            c2fx.A01 |= 1024;
            return;
        }
        throw null;
    }

    public static void A0B(C2FX c2fx, EnumC79193lF enumC79193lF) {
        if (enumC79193lF != null) {
            c2fx.A01 |= 128;
            c2fx.A02 = enumC79193lF.value;
            return;
        }
        throw null;
    }

    public static void A0C(C2FX c2fx, EnumC79203lG enumC79203lG) {
        if (enumC79203lG != null) {
            c2fx.A01 |= 256;
            c2fx.A03 = enumC79203lG.value;
            return;
        }
        throw null;
    }

    public static void A0D(C2FX c2fx, String str) {
        if (str != null) {
            c2fx.A01 |= 2;
            c2fx.A09 = str;
            return;
        }
        throw null;
    }

    public static void A0E(C2FX c2fx, String str) {
        if (str != null) {
            c2fx.A01 |= 4;
            c2fx.A07 = str;
            return;
        }
        throw null;
    }

    public static void A0F(C2FX c2fx, String str) {
        if (str != null) {
            c2fx.A01 |= 8;
            c2fx.A08 = str;
            return;
        }
        throw null;
    }

    public static void A0G(C2FX c2fx, String str) {
        if (str != null) {
            c2fx.A01 |= 16;
            c2fx.A0B = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        EnumC79203lG enumC79203lG;
        int i = 2048;
        switch (c0rl.ordinal()) {
            case 0:
                return A0D;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2FX c2fx = (C2FX) obj2;
                int i2 = this.A01;
                boolean z = (i2 & 1) == 1;
                String str = this.A0A;
                int i3 = c2fx.A01;
                this.A0A = c0rm.AWD(z, str, (i3 & 1) == 1, c2fx.A0A);
                this.A09 = c0rm.AWD((i2 & 2) == 2, this.A09, (i3 & 2) == 2, c2fx.A09);
                this.A07 = c0rm.AWD((i2 & 4) == 4, this.A07, (i3 & 4) == 4, c2fx.A07);
                this.A08 = c0rm.AWD((i2 & 8) == 8, this.A08, (i3 & 8) == 8, c2fx.A08);
                this.A0B = c0rm.AWD((i2 & 16) == 16, this.A0B, (i3 & 16) == 16, c2fx.A0B);
                this.A04 = c0rm.AW5((i2 & 32) == 32, this.A04, (i3 & 32) == 32, c2fx.A04);
                this.A00 = c0rm.AW5((i2 & 64) == 64, this.A00, (i3 & 64) == 64, c2fx.A00);
                this.A02 = c0rm.AW5((i2 & 128) == 128, this.A02, (i3 & 128) == 128, c2fx.A02);
                this.A03 = c0rm.AW5((i2 & 256) == 256, this.A03, (i3 & 256) == 256, c2fx.A03);
                this.A05 = c0rm.AW2((i2 & 512) == 512, this.A05, (i3 & 512) == 512, c2fx.A05);
                this.A06 = (C40521sP) c0rm.AW9(this.A06, c2fx.A06);
                int i4 = this.A01;
                boolean z2 = (i4 & 2048) == 2048;
                boolean z3 = this.A0C;
                int i5 = c2fx.A01;
                this.A0C = c0rm.AW1(z2, z3, (i5 & 2048) == 2048, c2fx.A0C);
                if (c0rm == C0RN.A00) {
                    this.A01 = i4 | i5;
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
                                this.A01 |= 1;
                                this.A0A = A0A;
                                continue;
                                i = 2048;
                            case 18:
                                String A0A2 = c0ro.A0A();
                                this.A01 |= 2;
                                this.A09 = A0A2;
                                continue;
                                i = 2048;
                            case 34:
                                String A0A3 = c0ro.A0A();
                                this.A01 |= 4;
                                this.A07 = A0A3;
                                continue;
                                i = 2048;
                            case 42:
                                String A0A4 = c0ro.A0A();
                                this.A01 |= 8;
                                this.A08 = A0A4;
                                continue;
                                i = 2048;
                            case 50:
                                String A0A5 = c0ro.A0A();
                                this.A01 |= 16;
                                this.A0B = A0A5;
                                continue;
                                i = 2048;
                            case 61:
                                this.A01 |= 32;
                                this.A04 = c0ro.A01();
                                continue;
                                i = 2048;
                            case 69:
                                this.A01 |= 64;
                                this.A00 = c0ro.A01();
                                continue;
                                i = 2048;
                            case C0M6.A02 /* 72 */:
                                int A02 = c0ro.A02();
                                if (EnumC79193lF.A00(A02) == null) {
                                    super.A0F(9, A02);
                                    continue;
                                } else {
                                    this.A01 |= 128;
                                    this.A02 = A02;
                                }
                                i = 2048;
                            case 80:
                                int A022 = c0ro.A02();
                                if (A022 == 0) {
                                    enumC79203lG = EnumC79203lG.NONE;
                                } else {
                                    enumC79203lG = A022 != 1 ? null : EnumC79203lG.VIDEO;
                                }
                                if (enumC79203lG == null) {
                                    super.A0F(10, A022);
                                    continue;
                                } else {
                                    this.A01 |= 256;
                                    this.A03 = A022;
                                }
                                i = 2048;
                            case 130:
                                this.A01 |= 512;
                                this.A05 = c0ro.A08();
                                continue;
                                i = 2048;
                            case 138:
                                if ((this.A01 & 1024) == 1024) {
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
                                this.A01 |= 1024;
                                continue;
                                i = 2048;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /* 144 */:
                                this.A01 |= i;
                                this.A0C = c0ro.A0F();
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
                return new C2FX();
            case 5:
                return new C2FW();
            case 6:
                break;
            case 7:
                if (A0E == null) {
                    synchronized (C2FX.class) {
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
        int A0B = (this.A01 & 1) == 1 ? 0 + C0RS.A0B(1, this.A0A) : 0;
        if ((this.A01 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A09);
        }
        if ((this.A01 & 4) == 4) {
            A0B += C0RS.A0B(4, this.A07);
        }
        if ((this.A01 & 8) == 8) {
            A0B += C0RS.A0B(5, this.A08);
        }
        if ((this.A01 & 16) == 16) {
            A0B += C0RS.A0B(6, this.A0B);
        }
        int i2 = this.A01;
        if ((i2 & 32) == 32) {
            A0B += C0RS.A03(56) + 4;
        }
        if ((i2 & 64) == 64) {
            A0B += C0RS.A03(64) + 4;
        }
        if ((i2 & 128) == 128) {
            A0B += C0RS.A04(9, this.A02);
        }
        if ((i2 & 256) == 256) {
            A0B += C0RS.A04(10, this.A03);
        }
        if ((i2 & 512) == 512) {
            A0B += C0RS.A09(16, this.A05);
        }
        if ((i2 & 1024) == 1024) {
            A0B += C0RS.A0A(17, A0i());
        }
        if ((this.A01 & 2048) == 2048) {
            A0B += C0RS.A00(18);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            c0rs.A0P(1, this.A0A);
        }
        if ((this.A01 & 2) == 2) {
            c0rs.A0P(2, this.A09);
        }
        if ((this.A01 & 4) == 4) {
            c0rs.A0P(4, this.A07);
        }
        if ((this.A01 & 8) == 8) {
            c0rs.A0P(5, this.A08);
        }
        if ((this.A01 & 16) == 16) {
            c0rs.A0P(6, this.A0B);
        }
        if ((this.A01 & 32) == 32) {
            c0rs.A0H(7, this.A04);
        }
        if ((this.A01 & 64) == 64) {
            c0rs.A0H(8, this.A00);
        }
        if ((this.A01 & 128) == 128) {
            c0rs.A0I(9, this.A02);
        }
        if ((this.A01 & 256) == 256) {
            c0rs.A0I(10, this.A03);
        }
        if ((this.A01 & 512) == 512) {
            c0rs.A0N(16, this.A05);
        }
        if ((this.A01 & 1024) == 1024) {
            c0rs.A0O(17, A0i());
        }
        if ((this.A01 & 2048) == 2048) {
            c0rs.A0Q(18, this.A0C);
        }
        this.unknownFields.A02(c0rs);
    }
}
