package X;

import java.io.IOException;

/* renamed from: X.22k  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C455222k extends C0AZ implements C0AY {
    public static final C455222k A0H;
    public static volatile C0RQ A0I;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public byte A00 = -1;
    public String A09 = "";
    public C0CX A08 = C0RU.A01;
    public String A0B = "";
    public String A0C = "";
    public String A0A = "";
    public String A0D = "";

    static {
        C455222k c455222k = new C455222k();
        A0H = c455222k;
        c455222k.A0E();
    }

    public static void A09(C455222k c455222k, EnumC455122j enumC455122j) {
        if (enumC455122j != null) {
            c455222k.A01 |= 512;
            c455222k.A02 = enumC455122j.value;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC455122j enumC455122j;
        switch (c0rl.ordinal()) {
            case 0:
                byte b = this.A00;
                if (b == 1) {
                    return A0H;
                }
                if (b == 0) {
                    return null;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (!((this.A01 & 1) == 1)) {
                    if (booleanValue) {
                        this.A00 = (byte) 0;
                    }
                    return null;
                }
                for (int i = 0; i < this.A08.size(); i++) {
                    if (!((C0AZ) this.A08.get(i)).A0H()) {
                        if (booleanValue) {
                            this.A00 = (byte) 0;
                        }
                        return null;
                    }
                }
                if (booleanValue) {
                    this.A00 = (byte) 1;
                }
                return A0H;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C455222k c455222k = (C455222k) obj2;
                this.A09 = c0rm.AWD((this.A01 & 1) == 1, this.A09, (c455222k.A01 & 1) == 1, c455222k.A09);
                this.A08 = c0rm.AW7(this.A08, c455222k.A08);
                int i2 = this.A01;
                boolean z = (i2 & 2) == 2;
                String str = this.A0B;
                int i3 = c455222k.A01;
                this.A0B = c0rm.AWD(z, str, (i3 & 2) == 2, c455222k.A0B);
                this.A0C = c0rm.AWD((i2 & 4) == 4, this.A0C, (i3 & 4) == 4, c455222k.A0C);
                this.A07 = c0rm.AW8((i2 & 8) == 8, this.A07, (i3 & 8) == 8, c455222k.A07);
                this.A04 = c0rm.AW5((i2 & 16) == 16, this.A04, (i3 & 16) == 16, c455222k.A04);
                this.A0G = c0rm.AW1((i2 & 32) == 32, this.A0G, (i3 & 32) == 32, c455222k.A0G);
                this.A0E = c0rm.AW1((i2 & 64) == 64, this.A0E, (i3 & 64) == 64, c455222k.A0E);
                this.A03 = c0rm.AW5((i2 & 128) == 128, this.A03, (i3 & 128) == 128, c455222k.A03);
                this.A06 = c0rm.AW8((i2 & 256) == 256, this.A06, (i3 & 256) == 256, c455222k.A06);
                this.A02 = c0rm.AW5((i2 & 512) == 512, this.A02, (i3 & 512) == 512, c455222k.A02);
                this.A05 = c0rm.AW8((i2 & 1024) == 1024, this.A05, (i3 & 1024) == 1024, c455222k.A05);
                this.A0A = c0rm.AWD((i2 & 2048) == 2048, this.A0A, (i3 & 2048) == 2048, c455222k.A0A);
                this.A0D = c0rm.AWD((i2 & 4096) == 4096, this.A0D, (i3 & 4096) == 4096, c455222k.A0D);
                this.A0F = c0rm.AW1((i2 & 8192) == 8192, this.A0F, (i3 & 8192) == 8192, c455222k.A0F);
                if (c0rm == C0RN.A00) {
                    this.A01 = i2 | i3;
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
                            case 10:
                                String A0A = c0ro.A0A();
                                this.A01 |= 1;
                                this.A09 = A0A;
                                continue;
                            case 18:
                                C0CX c0cx = this.A08;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A08 = c0cx;
                                }
                                c0cx.add(c0ro.A09(C24E.A04.A0C(), c0rp));
                                continue;
                            case 26:
                                String A0A2 = c0ro.A0A();
                                this.A01 |= 2;
                                this.A0B = A0A2;
                                continue;
                            case 34:
                                String A0A3 = c0ro.A0A();
                                this.A01 |= 4;
                                this.A0C = A0A3;
                                continue;
                            case 40:
                                this.A01 |= 8;
                                this.A07 = c0ro.A06();
                                continue;
                            case 48:
                                this.A01 |= 16;
                                this.A04 = c0ro.A02();
                                continue;
                            case 56:
                                this.A01 |= 32;
                                this.A0G = c0ro.A0F();
                                continue;
                            case 64:
                                this.A01 |= 64;
                                this.A0E = c0ro.A0F();
                                continue;
                            case C0M6.A02 /* 72 */:
                                this.A01 |= 128;
                                this.A03 = c0ro.A02();
                                continue;
                            case 80:
                                this.A01 |= 256;
                                this.A06 = c0ro.A06();
                                continue;
                            case 88:
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC455122j = EnumC455122j.COMPLETE_BUT_MORE_MESSAGES_REMAIN_ON_PRIMARY;
                                } else {
                                    enumC455122j = A02 != 1 ? null : EnumC455122j.COMPLETE_AND_NO_MORE_MESSAGE_REMAIN_ON_PRIMARY;
                                }
                                if (enumC455122j == null) {
                                    super.A0F(11, A02);
                                } else {
                                    this.A01 |= 512;
                                    this.A02 = A02;
                                    continue;
                                }
                            case 96:
                                this.A01 |= 1024;
                                this.A05 = c0ro.A06();
                                continue;
                            case 106:
                                String A0A4 = c0ro.A0A();
                                this.A01 |= 2048;
                                this.A0A = A0A4;
                                continue;
                            case 114:
                                String A0A5 = c0ro.A0A();
                                this.A01 |= 4096;
                                this.A0D = A0A5;
                                continue;
                            case 120:
                                this.A01 |= 8192;
                                this.A0F = c0ro.A0F();
                                continue;
                            default:
                                if (!A0I(A03, c0ro)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                        z2 = true;
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
                ((C0CY) this.A08).A00 = false;
                return null;
            case 4:
                return new C455222k();
            case 5:
                return new C0CT() { // from class: X.22i
                    {
                        C455222k c455222k2 = C455222k.A0H;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0I == null) {
                    synchronized (C455222k.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        if ((this.A01 & 1) == 1) {
            i = C0RS.A0B(1, this.A09) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.A08.size(); i3++) {
            i += C0RS.A0A(2, (C0AX) this.A08.get(i3));
        }
        if ((this.A01 & 2) == 2) {
            i += C0RS.A0B(3, this.A0B);
        }
        if ((this.A01 & 4) == 4) {
            i += C0RS.A0B(4, this.A0C);
        }
        int i4 = this.A01;
        if ((i4 & 8) == 8) {
            i += C0RS.A08(5, this.A07);
        }
        if ((i4 & 16) == 16) {
            i += C0RS.A06(6, this.A04);
        }
        if ((i4 & 32) == 32) {
            i += C0RS.A00(7);
        }
        if ((i4 & 64) == 64) {
            i += C0RS.A00(8);
        }
        if ((i4 & 128) == 128) {
            i += C0RS.A06(9, this.A03);
        }
        if ((i4 & 256) == 256) {
            i += C0RS.A07(10, this.A06);
        }
        if ((i4 & 512) == 512) {
            i += C0RS.A04(11, this.A02);
        }
        if ((i4 & 1024) == 1024) {
            i += C0RS.A08(12, this.A05);
        }
        if ((i4 & 2048) == 2048) {
            i += C0RS.A0B(13, this.A0A);
        }
        if ((this.A01 & 4096) == 4096) {
            i += C0RS.A0B(14, this.A0D);
        }
        if ((this.A01 & 8192) == 8192) {
            i += C0RS.A00(15);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A01 & 1) == 1) {
            c0rs.A0P(1, this.A09);
        }
        for (int i = 0; i < this.A08.size(); i++) {
            c0rs.A0O(2, (C0AX) this.A08.get(i));
        }
        if ((this.A01 & 2) == 2) {
            c0rs.A0P(3, this.A0B);
        }
        if ((this.A01 & 4) == 4) {
            c0rs.A0P(4, this.A0C);
        }
        if ((this.A01 & 8) == 8) {
            c0rs.A0M(5, this.A07);
        }
        if ((this.A01 & 16) == 16) {
            c0rs.A0K(6, this.A04);
        }
        if ((this.A01 & 32) == 32) {
            c0rs.A0Q(7, this.A0G);
        }
        if ((this.A01 & 64) == 64) {
            c0rs.A0Q(8, this.A0E);
        }
        if ((this.A01 & 128) == 128) {
            c0rs.A0K(9, this.A03);
        }
        if ((this.A01 & 256) == 256) {
            c0rs.A0M(10, this.A06);
        }
        if ((this.A01 & 512) == 512) {
            c0rs.A0I(11, this.A02);
        }
        if ((this.A01 & 1024) == 1024) {
            c0rs.A0M(12, this.A05);
        }
        if ((this.A01 & 2048) == 2048) {
            c0rs.A0P(13, this.A0A);
        }
        if ((this.A01 & 4096) == 4096) {
            c0rs.A0P(14, this.A0D);
        }
        if ((this.A01 & 8192) == 8192) {
            c0rs.A0Q(15, this.A0F);
        }
        this.unknownFields.A02(c0rs);
    }
}
