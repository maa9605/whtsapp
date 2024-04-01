package X;

import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.io.IOException;

/* renamed from: X.2V2  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2V2 extends C0AZ implements C0AY {
    public static final C2V2 A0E;
    public static volatile C0RQ A0F;
    public int A00;
    public int A01;
    public int A02;
    public C2V5 A03;
    public String A09 = "";
    public String A0A = "";
    public String A0C = "";
    public String A08 = "";
    public String A05 = "";
    public String A0B = "";
    public String A0D = "";
    public String A07 = "";
    public String A06 = "";
    public String A04 = "";

    static {
        C2V2 c2v2 = new C2V2();
        A0E = c2v2;
        c2v2.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC47952Df enumC47952Df;
        C2V6 c2v6;
        C2V4 c2v4;
        int i = 4096;
        switch (c0rl.ordinal()) {
            case 0:
                return A0E;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2V2 c2v2 = (C2V2) obj2;
                this.A01 = c0rm.AW5((this.A00 & 1) == 1, this.A01, (c2v2.A00 & 1) == 1, c2v2.A01);
                this.A03 = (C2V5) c0rm.AW9(this.A03, c2v2.A03);
                int i2 = this.A00;
                boolean z = (i2 & 4) == 4;
                String str = this.A09;
                int i3 = c2v2.A00;
                this.A09 = c0rm.AWD(z, str, (i3 & 4) == 4, c2v2.A09);
                this.A0A = c0rm.AWD((i2 & 8) == 8, this.A0A, (i3 & 8) == 8, c2v2.A0A);
                this.A0C = c0rm.AWD((i2 & 16) == 16, this.A0C, (i3 & 16) == 16, c2v2.A0C);
                this.A08 = c0rm.AWD((i2 & 32) == 32, this.A08, (i3 & 32) == 32, c2v2.A08);
                this.A05 = c0rm.AWD((i2 & 64) == 64, this.A05, (i3 & 64) == 64, c2v2.A05);
                this.A0B = c0rm.AWD((i2 & 128) == 128, this.A0B, (i3 & 128) == 128, c2v2.A0B);
                this.A0D = c0rm.AWD((i2 & 256) == 256, this.A0D, (i3 & 256) == 256, c2v2.A0D);
                this.A02 = c0rm.AW5((i2 & 512) == 512, this.A02, (i3 & 512) == 512, c2v2.A02);
                this.A07 = c0rm.AWD((i2 & 1024) == 1024, this.A07, (i3 & 1024) == 1024, c2v2.A07);
                this.A06 = c0rm.AWD((i2 & 2048) == 2048, this.A06, (i3 & 2048) == 2048, c2v2.A06);
                this.A04 = c0rm.AWD((i2 & 4096) == 4096, this.A04, (i3 & 4096) == 4096, c2v2.A04);
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
                        int A03 = c0ro.A03();
                        switch (A03) {
                            case 0:
                                break;
                            case 8:
                                int A02 = c0ro.A02();
                                if (A02 == 23) {
                                    c2v4 = C2V4.PAGE;
                                } else {
                                    switch (A02) {
                                        case 0:
                                            c2v4 = C2V4.ANDROID;
                                            break;
                                        case 1:
                                            c2v4 = C2V4.IOS;
                                            break;
                                        case 2:
                                            c2v4 = C2V4.WINDOWS_PHONE;
                                            break;
                                        case 3:
                                            c2v4 = C2V4.BLACKBERRY;
                                            break;
                                        case 4:
                                            c2v4 = C2V4.BLACKBERRYX;
                                            break;
                                        case 5:
                                            c2v4 = C2V4.S40;
                                            break;
                                        case 6:
                                            c2v4 = C2V4.S60;
                                            break;
                                        case 7:
                                            c2v4 = C2V4.PYTHON_CLIENT;
                                            break;
                                        case 8:
                                            c2v4 = C2V4.TIZEN;
                                            break;
                                        case 9:
                                            c2v4 = C2V4.ENTERPRISE;
                                            break;
                                        case 10:
                                            c2v4 = C2V4.SMB_ANDROID;
                                            break;
                                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                                            c2v4 = C2V4.KAIOS;
                                            break;
                                        case 12:
                                            c2v4 = C2V4.SMB_IOS;
                                            break;
                                        case 13:
                                            c2v4 = C2V4.WINDOWS;
                                            break;
                                        case 14:
                                            c2v4 = C2V4.WEB;
                                            break;
                                        default:
                                            c2v4 = null;
                                            break;
                                    }
                                }
                                if (c2v4 == null) {
                                    super.A0F(1, A02);
                                    continue;
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A02;
                                }
                                i = 4096;
                            case 18:
                                if ((this.A00 & 2) == 2) {
                                    c2v6 = (C2V6) this.A03.AVX();
                                } else {
                                    c2v6 = null;
                                }
                                C2V5 c2v5 = (C2V5) c0ro.A09(C2V5.A05.A0C(), c0rp);
                                this.A03 = c2v5;
                                if (c2v6 != null) {
                                    c2v6.A03(c2v5);
                                    this.A03 = (C2V5) c2v6.A00();
                                }
                                this.A00 |= 2;
                                continue;
                                i = 4096;
                            case 26:
                                String A0A = c0ro.A0A();
                                this.A00 |= 4;
                                this.A09 = A0A;
                                continue;
                                i = 4096;
                            case 34:
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 8;
                                this.A0A = A0A2;
                                continue;
                                i = 4096;
                            case 42:
                                String A0A3 = c0ro.A0A();
                                this.A00 |= 16;
                                this.A0C = A0A3;
                                continue;
                                i = 4096;
                            case 50:
                                String A0A4 = c0ro.A0A();
                                this.A00 |= 32;
                                this.A08 = A0A4;
                                continue;
                                i = 4096;
                            case 58:
                                String A0A5 = c0ro.A0A();
                                this.A00 |= 64;
                                this.A05 = A0A5;
                                continue;
                                i = 4096;
                            case 66:
                                String A0A6 = c0ro.A0A();
                                this.A00 |= 128;
                                this.A0B = A0A6;
                                continue;
                                i = 4096;
                            case 74:
                                String A0A7 = c0ro.A0A();
                                this.A00 |= 256;
                                this.A0D = A0A7;
                                continue;
                                i = 4096;
                            case 80:
                                int A022 = c0ro.A02();
                                if (A022 == 0) {
                                    enumC47952Df = EnumC47952Df.RELEASE;
                                } else if (A022 == 1) {
                                    enumC47952Df = EnumC47952Df.BETA;
                                } else if (A022 != 2) {
                                    enumC47952Df = A022 != 3 ? null : EnumC47952Df.DEBUG;
                                } else {
                                    enumC47952Df = EnumC47952Df.ALPHA;
                                }
                                if (enumC47952Df == null) {
                                    super.A0F(10, A022);
                                    continue;
                                } else {
                                    this.A00 |= 512;
                                    this.A02 = A022;
                                }
                                i = 4096;
                            case 90:
                                String A0A8 = c0ro.A0A();
                                this.A00 |= 1024;
                                this.A07 = A0A8;
                                continue;
                                i = 4096;
                            case 98:
                                String A0A9 = c0ro.A0A();
                                this.A00 |= 2048;
                                this.A06 = A0A9;
                                continue;
                                i = 4096;
                            case 106:
                                String A0A10 = c0ro.A0A();
                                this.A00 |= i;
                                this.A04 = A0A10;
                                continue;
                                i = 4096;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                    i = 4096;
                                }
                        }
                        z2 = true;
                        i = 4096;
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
                return new C2V2();
            case 5:
                return new C0CT() { // from class: X.2V3
                    {
                        C2V2 c2v22 = C2V2.A0E;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0F == null) {
                    synchronized (C2V2.class) {
                        if (A0F == null) {
                            A0F = new C0RR(A0E);
                        }
                    }
                }
                return A0F;
            default:
                throw new UnsupportedOperationException();
        }
        return A0E;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A04 = (i2 & 1) == 1 ? 0 + C0RS.A04(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            C2V5 c2v5 = this.A03;
            if (c2v5 == null) {
                c2v5 = C2V5.A05;
            }
            A04 += C0RS.A0A(2, c2v5);
        }
        if ((this.A00 & 4) == 4) {
            A04 += C0RS.A0B(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            A04 += C0RS.A0B(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            A04 += C0RS.A0B(5, this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            A04 += C0RS.A0B(6, this.A08);
        }
        if ((this.A00 & 64) == 64) {
            A04 += C0RS.A0B(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            A04 += C0RS.A0B(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            A04 += C0RS.A0B(9, this.A0D);
        }
        int i3 = this.A00;
        if ((i3 & 512) == 512) {
            A04 += C0RS.A04(10, this.A02);
        }
        if ((i3 & 1024) == 1024) {
            A04 += C0RS.A0B(11, this.A07);
        }
        if ((this.A00 & 2048) == 2048) {
            A04 += C0RS.A0B(12, this.A06);
        }
        if ((this.A00 & 4096) == 4096) {
            A04 += C0RS.A0B(13, this.A04);
        }
        int A00 = this.unknownFields.A00() + A04;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0I(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C2V5 c2v5 = this.A03;
            if (c2v5 == null) {
                c2v5 = C2V5.A05;
            }
            c0rs.A0O(2, c2v5);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0P(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0P(5, this.A0C);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0P(6, this.A08);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0P(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0P(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0P(9, this.A0D);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0I(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0P(11, this.A07);
        }
        if ((this.A00 & 2048) == 2048) {
            c0rs.A0P(12, this.A06);
        }
        if ((this.A00 & 4096) == 4096) {
            c0rs.A0P(13, this.A04);
        }
        this.unknownFields.A02(c0rs);
    }
}
