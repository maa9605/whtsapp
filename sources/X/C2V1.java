package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.2V1  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2V1 extends C0AZ implements C0AY {
    public static final C2V1 A0J;
    public static volatile C0RQ A0K;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public C0O0 A09;
    public C0O0 A0A;
    public C53552h7 A0B;
    public C2VT A0C;
    public C2V2 A0D;
    public C2VH A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    static {
        C2V1 c2v1 = new C2V1();
        A0J = c2v1;
        c2v1.A0E();
    }

    public C2V1() {
        C09550eI c09550eI = C09550eI.A02;
        this.A09 = c09550eI;
        this.A0F = "";
        this.A0A = c09550eI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC53672hK enumC53672hK;
        C53662hJ c53662hJ;
        C53612hE c53612hE;
        EnumC53602hD enumC53602hD;
        C2VP c2vp;
        C2VI c2vi;
        C2V3 c2v3;
        EnumC53592hC enumC53592hC;
        EnumC53592hC enumC53592hC2;
        int i = 8192;
        int i2 = 32768;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A0J;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2V1 c2v1 = (C2V1) obj2;
                int i3 = this.A01;
                boolean z2 = (i3 & 1) == 1;
                long j = this.A08;
                int i4 = c2v1.A01;
                this.A08 = c0rm.AW8(z2, j, (i4 & 1) == 1, c2v1.A08);
                this.A0H = c0rm.AW1((i3 & 2) == 2, this.A0H, (i4 & 2) == 2, c2v1.A0H);
                this.A09 = c0rm.AW6(this.A09, c2v1.A09);
                this.A0D = (C2V2) c0rm.AW9(this.A0D, c2v1.A0D);
                this.A0E = (C2VH) c0rm.AW9(this.A0E, c2v1.A0E);
                int i5 = this.A01;
                boolean z3 = (i5 & 16) == 16;
                String str = this.A0F;
                int i6 = c2v1.A01;
                this.A0F = c0rm.AWD(z3, str, (i6 & 16) == 16, c2v1.A0F);
                this.A07 = c0rm.AW5((i5 & 32) == 32, this.A07, (i6 & 32) == 32, c2v1.A07);
                this.A0I = c0rm.AW1((i5 & 64) == 64, this.A0I, (i6 & 64) == 64, c2v1.A0I);
                this.A06 = c0rm.AW5((i5 & 128) == 128, this.A06, (i6 & 128) == 128, c2v1.A06);
                this.A04 = c0rm.AW5((i5 & 256) == 256, this.A04, (i6 & 256) == 256, c2v1.A04);
                this.A03 = c0rm.AW5((i5 & 512) == 512, this.A03, (i6 & 512) == 512, c2v1.A03);
                this.A0A = c0rm.AW6(this.A0A, c2v1.A0A);
                this.A0C = (C2VT) c0rm.AW9(this.A0C, c2v1.A0C);
                int i7 = this.A01;
                boolean z4 = (i7 & 2048) == 2048;
                int i8 = this.A02;
                int i9 = c2v1.A01;
                this.A02 = c0rm.AW5(z4, i8, (i9 & 2048) == 2048, c2v1.A02);
                this.A00 = c0rm.AW5((i7 & 4096) == 4096, this.A00, (i9 & 4096) == 4096, c2v1.A00);
                this.A05 = c0rm.AW5((i7 & 8192) == 8192, this.A05, (i9 & 8192) == 8192, c2v1.A05);
                this.A0B = (C53552h7) c0rm.AW9(this.A0B, c2v1.A0B);
                int i10 = this.A01;
                boolean z5 = (i10 & 32768) == 32768;
                boolean z6 = this.A0G;
                int i11 = c2v1.A01;
                this.A0G = c0rm.AW1(z5, z6, (i11 & 32768) == 32768, c2v1.A0G);
                if (c0rm == C0RN.A00) {
                    this.A01 = i10 | i11;
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
                            case 8:
                                this.A01 |= 1;
                                this.A08 = c0ro.A06();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 24:
                                this.A01 |= 2;
                                this.A0H = c0ro.A0F();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                C0O0 c0o0 = this.A09;
                                if (!((C0CY) c0o0).A00) {
                                    this.A09 = C0AZ.A04(c0o0);
                                }
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC53592hC2 = EnumC53592hC.A01;
                                } else {
                                    enumC53592hC2 = null;
                                }
                                if (enumC53592hC2 == null) {
                                    super.A0F(4, A02);
                                    continue;
                                } else {
                                    C09550eI c09550eI = (C09550eI) this.A09;
                                    c09550eI.A03(c09550eI.A00, A02);
                                }
                                i = 8192;
                                i2 = 32768;
                            case 34:
                                C0O0 c0o02 = this.A09;
                                if (!((C0CY) c0o02).A00) {
                                    this.A09 = C0AZ.A04(c0o02);
                                }
                                int A04 = c0ro.A04(c0ro.A02());
                                while (c0ro.A00() > 0) {
                                    int A022 = c0ro.A02();
                                    if (A022 == 0) {
                                        enumC53592hC = EnumC53592hC.A01;
                                    } else {
                                        enumC53592hC = null;
                                    }
                                    if (enumC53592hC == null) {
                                        super.A0F(4, A022);
                                    } else {
                                        C09550eI c09550eI2 = (C09550eI) this.A09;
                                        c09550eI2.A03(c09550eI2.A00, A022);
                                    }
                                }
                                c0ro.A03 = A04;
                                c0ro.A0B();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 42:
                                if ((this.A01 & 4) == 4) {
                                    c2v3 = (C2V3) this.A0D.AVX();
                                } else {
                                    c2v3 = null;
                                }
                                C2V2 c2v2 = (C2V2) c0ro.A09(C2V2.A0E.A0C(), c0rp);
                                this.A0D = c2v2;
                                if (c2v3 != null) {
                                    c2v3.A03(c2v2);
                                    this.A0D = (C2V2) c2v3.A00();
                                }
                                this.A01 = 4 | this.A01;
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 50:
                                if ((this.A01 & 8) == 8) {
                                    c2vi = (C2VI) this.A0E.AVX();
                                } else {
                                    c2vi = null;
                                }
                                C2VH c2vh = (C2VH) c0ro.A09(C2VH.A05.A0C(), c0rp);
                                this.A0E = c2vh;
                                if (c2vi != null) {
                                    c2vi.A03(c2vh);
                                    this.A0E = (C2VH) c2vi.A00();
                                }
                                this.A01 |= 8;
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 58:
                                String A0A = c0ro.A0A();
                                this.A01 |= 16;
                                this.A0F = A0A;
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 77:
                                this.A01 |= 32;
                                this.A07 = c0ro.A01();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 80:
                                this.A01 |= 64;
                                this.A0I = c0ro.A0F();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 96:
                                int A023 = c0ro.A02();
                                if (A023 == 0) {
                                    c2vp = C2VP.CELLULAR_UNKNOWN;
                                } else if (A023 != 1) {
                                    switch (A023) {
                                        case C42311vX.A0A /* 100 */:
                                            c2vp = C2VP.CELLULAR_EDGE;
                                            break;
                                        case 101:
                                            c2vp = C2VP.CELLULAR_IDEN;
                                            break;
                                        case 102:
                                            c2vp = C2VP.CELLULAR_UMTS;
                                            break;
                                        case 103:
                                            c2vp = C2VP.CELLULAR_EVDO;
                                            break;
                                        case 104:
                                            c2vp = C2VP.CELLULAR_GPRS;
                                            break;
                                        case 105:
                                            c2vp = C2VP.CELLULAR_HSDPA;
                                            break;
                                        case 106:
                                            c2vp = C2VP.CELLULAR_HSUPA;
                                            break;
                                        case 107:
                                            c2vp = C2VP.CELLULAR_HSPA;
                                            break;
                                        case C0M6.A03 /* 108 */:
                                            c2vp = C2VP.CELLULAR_CDMA;
                                            break;
                                        case 109:
                                            c2vp = C2VP.CELLULAR_1XRTT;
                                            break;
                                        case 110:
                                            c2vp = C2VP.CELLULAR_EHRPD;
                                            break;
                                        case 111:
                                            c2vp = C2VP.CELLULAR_LTE;
                                            break;
                                        case 112:
                                            c2vp = C2VP.CELLULAR_HSPAP;
                                            break;
                                        default:
                                            c2vp = null;
                                            break;
                                    }
                                } else {
                                    c2vp = C2VP.WIFI_UNKNOWN;
                                }
                                if (c2vp == null) {
                                    super.A0F(12, A023);
                                    continue;
                                } else {
                                    this.A01 |= 256;
                                    this.A04 = A023;
                                }
                                i = 8192;
                                i2 = 32768;
                            case 104:
                                int A024 = c0ro.A02();
                                if (A024 == 0) {
                                    enumC53602hD = EnumC53602hD.PUSH;
                                } else if (A024 == 1) {
                                    enumC53602hD = EnumC53602hD.USER_ACTIVATED;
                                } else if (A024 == 2) {
                                    enumC53602hD = EnumC53602hD.SCHEDULED;
                                } else if (A024 == 3) {
                                    enumC53602hD = EnumC53602hD.ERROR_RECONNECT;
                                } else if (A024 != 4) {
                                    enumC53602hD = A024 != 5 ? null : EnumC53602hD.PING_RECONNECT;
                                } else {
                                    enumC53602hD = EnumC53602hD.NETWORK_SWITCH;
                                }
                                if (enumC53602hD == null) {
                                    super.A0F(13, A024);
                                    continue;
                                } else {
                                    this.A01 |= 512;
                                    this.A03 = A024;
                                }
                                i = 8192;
                                i2 = 32768;
                            case 112:
                                C0O0 c0o03 = this.A0A;
                                if (!((C0CY) c0o03).A00) {
                                    c0o03 = C0AZ.A04(c0o03);
                                    this.A0A = c0o03;
                                }
                                C09550eI c09550eI3 = (C09550eI) c0o03;
                                c09550eI3.A03(c09550eI3.A00, c0ro.A02());
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 114:
                                int A042 = c0ro.A04(c0ro.A02());
                                C0O0 c0o04 = this.A0A;
                                if (!((C0CY) c0o04).A00 && c0ro.A00() > 0) {
                                    this.A0A = C0AZ.A04(c0o04);
                                }
                                while (c0ro.A00() > 0) {
                                    C09550eI c09550eI4 = (C09550eI) this.A0A;
                                    c09550eI4.A03(c09550eI4.A00, c0ro.A02());
                                }
                                c0ro.A03 = A042;
                                c0ro.A0B();
                                continue;
                                i = 8192;
                                i2 = 32768;
                                break;
                            case 122:
                                if ((this.A01 & 1024) == 1024) {
                                    c53612hE = (C53612hE) this.A0C.AVX();
                                } else {
                                    c53612hE = null;
                                }
                                C2VT c2vt = (C2VT) c0ro.A09(C2VT.A03.A0C(), c0rp);
                                this.A0C = c2vt;
                                if (c53612hE != null) {
                                    c53612hE.A03(c2vt);
                                    this.A0C = (C2VT) c53612hE.A00();
                                }
                                this.A01 |= 1024;
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 128:
                                this.A01 |= 2048;
                                this.A02 = c0ro.A02();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 136:
                                this.A01 |= 4096;
                                this.A00 = c0ro.A02();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /* 144 */:
                                this.A01 |= i;
                                this.A05 = c0ro.A02();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 154:
                                if ((this.A01 & 16384) == 16384) {
                                    c53662hJ = (C53662hJ) this.A0B.AVX();
                                } else {
                                    c53662hJ = null;
                                }
                                C53552h7 c53552h7 = (C53552h7) c0ro.A09(C53552h7.A09.A0C(), c0rp);
                                this.A0B = c53552h7;
                                if (c53662hJ != null) {
                                    c53662hJ.A03(c53552h7);
                                    this.A0B = (C53552h7) c53662hJ.A00();
                                }
                                this.A01 |= 16384;
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 184:
                                this.A01 |= i2;
                                this.A0G = c0ro.A0F();
                                continue;
                                i = 8192;
                                i2 = 32768;
                            case 240:
                                int A025 = c0ro.A02();
                                if (A025 == 0) {
                                    enumC53672hK = EnumC53672hK.SHARE_EXTENSION;
                                } else if (A025 != 1) {
                                    enumC53672hK = A025 != 2 ? null : EnumC53672hK.INTENTS_EXTENSION;
                                } else {
                                    enumC53672hK = EnumC53672hK.SERVICE_EXTENSION;
                                }
                                if (enumC53672hK == null) {
                                    super.A0F(30, A025);
                                    continue;
                                } else {
                                    this.A01 |= 128;
                                    this.A06 = A025;
                                }
                                i = 8192;
                                i2 = 32768;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                    i = 8192;
                                    i2 = 32768;
                                }
                        }
                        z = true;
                        i = 8192;
                        i2 = 32768;
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
                ((C0CY) this.A09).A00 = false;
                ((C0CY) this.A0A).A00 = false;
                return null;
            case 4:
                return new C2V1();
            case 5:
                return new C0CT() { // from class: X.2hA
                    {
                        C2V1 c2v12 = C2V1.A0J;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0K == null) {
                    synchronized (C2V1.class) {
                        if (A0K == null) {
                            A0K = new C0RR(A0J);
                        }
                    }
                }
                return A0K;
            default:
                throw new UnsupportedOperationException();
        }
        return A0J;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A01;
        if ((i3 & 1) == 1) {
            i = C0RS.A08(1, this.A08) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += C0RS.A00(3);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A09.size(); i5++) {
            C09550eI c09550eI = (C09550eI) this.A09;
            c09550eI.A02(i5);
            i4 += C0RS.A02(c09550eI.A01[i5]);
        }
        int size = this.A09.size() + i + i4;
        if ((this.A01 & 4) == 4) {
            C2V2 c2v2 = this.A0D;
            if (c2v2 == null) {
                c2v2 = C2V2.A0E;
            }
            size += C0RS.A0A(5, c2v2);
        }
        if ((this.A01 & 8) == 8) {
            C2VH c2vh = this.A0E;
            if (c2vh == null) {
                c2vh = C2VH.A05;
            }
            size += C0RS.A0A(6, c2vh);
        }
        if ((this.A01 & 16) == 16) {
            size += C0RS.A0B(7, this.A0F);
        }
        int i6 = this.A01;
        if ((i6 & 32) == 32) {
            size += C0RS.A03(72) + 4;
        }
        if ((i6 & 64) == 64) {
            size += C0RS.A00(10);
        }
        if ((i6 & 256) == 256) {
            size += C0RS.A04(12, this.A04);
        }
        if ((i6 & 512) == 512) {
            size += C0RS.A04(13, this.A03);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.A0A.size(); i8++) {
            C09550eI c09550eI2 = (C09550eI) this.A0A;
            c09550eI2.A02(i8);
            i7 += C0RS.A02(c09550eI2.A01[i8]);
        }
        int size2 = this.A0A.size() + size + i7;
        if ((this.A01 & 1024) == 1024) {
            C2VT c2vt = this.A0C;
            if (c2vt == null) {
                c2vt = C2VT.A03;
            }
            size2 += C0RS.A0A(15, c2vt);
        }
        int i9 = this.A01;
        if ((i9 & 2048) == 2048) {
            size2 += C0RS.A06(16, this.A02);
        }
        if ((i9 & 4096) == 4096) {
            size2 += C0RS.A06(17, this.A00);
        }
        if ((i9 & 8192) == 8192) {
            size2 += C0RS.A06(18, this.A05);
        }
        if ((i9 & 16384) == 16384) {
            C53552h7 c53552h7 = this.A0B;
            if (c53552h7 == null) {
                c53552h7 = C53552h7.A09;
            }
            size2 += C0RS.A0A(19, c53552h7);
        }
        int i10 = this.A01;
        if ((i10 & 32768) == 32768) {
            size2 += C0RS.A00(23);
        }
        if ((i10 & 128) == 128) {
            size2 += C0RS.A04(30, this.A06);
        }
        int A00 = this.unknownFields.A00() + size2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            c0rs.A0M(1, this.A08);
        }
        if ((this.A01 & 2) == 2) {
            c0rs.A0Q(3, this.A0H);
        }
        for (int i = 0; i < this.A09.size(); i++) {
            C09550eI c09550eI = (C09550eI) this.A09;
            c09550eI.A02(i);
            c0rs.A0I(4, c09550eI.A01[i]);
        }
        if ((this.A01 & 4) == 4) {
            C2V2 c2v2 = this.A0D;
            if (c2v2 == null) {
                c2v2 = C2V2.A0E;
            }
            c0rs.A0O(5, c2v2);
        }
        if ((this.A01 & 8) == 8) {
            C2VH c2vh = this.A0E;
            if (c2vh == null) {
                c2vh = C2VH.A05;
            }
            c0rs.A0O(6, c2vh);
        }
        if ((this.A01 & 16) == 16) {
            c0rs.A0P(7, this.A0F);
        }
        if ((this.A01 & 32) == 32) {
            c0rs.A0H(9, this.A07);
        }
        if ((this.A01 & 64) == 64) {
            c0rs.A0Q(10, this.A0I);
        }
        if ((this.A01 & 256) == 256) {
            c0rs.A0I(12, this.A04);
        }
        if ((this.A01 & 512) == 512) {
            c0rs.A0I(13, this.A03);
        }
        for (int i2 = 0; i2 < this.A0A.size(); i2++) {
            C09550eI c09550eI2 = (C09550eI) this.A0A;
            c09550eI2.A02(i2);
            c0rs.A0I(14, c09550eI2.A01[i2]);
        }
        if ((this.A01 & 1024) == 1024) {
            C2VT c2vt = this.A0C;
            if (c2vt == null) {
                c2vt = C2VT.A03;
            }
            c0rs.A0O(15, c2vt);
        }
        if ((this.A01 & 2048) == 2048) {
            c0rs.A0K(16, this.A02);
        }
        if ((this.A01 & 4096) == 4096) {
            c0rs.A0K(17, this.A00);
        }
        if ((this.A01 & 8192) == 8192) {
            c0rs.A0K(18, this.A05);
        }
        if ((this.A01 & 16384) == 16384) {
            C53552h7 c53552h7 = this.A0B;
            if (c53552h7 == null) {
                c53552h7 = C53552h7.A09;
            }
            c0rs.A0O(19, c53552h7);
        }
        if ((this.A01 & 32768) == 32768) {
            c0rs.A0Q(23, this.A0G);
        }
        if ((this.A01 & 128) == 128) {
            c0rs.A0I(30, this.A06);
        }
        this.unknownFields.A02(c0rs);
    }
}
