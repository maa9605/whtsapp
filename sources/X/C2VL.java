package X;

import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;

/* renamed from: X.2VL  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VL extends C0AZ implements C0AY {
    public static final C2VL A0C;
    public static volatile C0RQ A0D;
    public int A00;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public String A02 = "";
    public C0AN A01 = C0AN.A01;

    static {
        C2VL c2vl = new C2VL();
        A0C = c2vl;
        c2vl.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A0C;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2VL c2vl = (C2VL) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                boolean z2 = this.A0B;
                int i2 = c2vl.A00;
                this.A0B = c0rm.AW1(z, z2, (i2 & 1) == 1, c2vl.A0B);
                this.A09 = c0rm.AW1((i & 2) == 2, this.A09, (i2 & 2) == 2, c2vl.A09);
                this.A03 = c0rm.AW1((i & 4) == 4, this.A03, (i2 & 4) == 4, c2vl.A03);
                this.A0A = c0rm.AW1((i & 8) == 8, this.A0A, (i2 & 8) == 8, c2vl.A0A);
                this.A08 = c0rm.AW1((i & 16) == 16, this.A08, (i2 & 16) == 16, c2vl.A08);
                this.A06 = c0rm.AW1((i & 32) == 32, this.A06, (i2 & 32) == 32, c2vl.A06);
                this.A07 = c0rm.AW1((i & 64) == 64, this.A07, (i2 & 64) == 64, c2vl.A07);
                this.A04 = c0rm.AW1((i & 128) == 128, this.A04, (i2 & 128) == 128, c2vl.A04);
                this.A05 = c0rm.AW1((i & 256) == 256, this.A05, (i2 & 256) == 256, c2vl.A05);
                this.A02 = c0rm.AWD((i & 512) == 512, this.A02, (i2 & 512) == 512, c2vl.A02);
                this.A01 = c0rm.AW2((i & 1024) == 1024, this.A01, (i2 & 1024) == 1024, c2vl.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2vl.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                boolean z3 = false;
                while (!z3) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    break;
                                case 8:
                                    this.A00 |= 1;
                                    this.A0B = c0ro.A0F();
                                    continue;
                                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                    this.A00 |= 2;
                                    this.A09 = c0ro.A0F();
                                    continue;
                                case 24:
                                    this.A00 |= 4;
                                    this.A03 = c0ro.A0F();
                                    continue;
                                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                    this.A00 |= 8;
                                    this.A0A = c0ro.A0F();
                                    continue;
                                case 40:
                                    this.A00 |= 16;
                                    this.A08 = c0ro.A0F();
                                    continue;
                                case 48:
                                    this.A00 |= 32;
                                    this.A06 = c0ro.A0F();
                                    continue;
                                case 56:
                                    this.A00 |= 64;
                                    this.A07 = c0ro.A0F();
                                    continue;
                                case 64:
                                    this.A00 |= 128;
                                    this.A04 = c0ro.A0F();
                                    continue;
                                case C0M6.A02 /* 72 */:
                                    this.A00 |= 256;
                                    this.A05 = c0ro.A0F();
                                    continue;
                                case 82:
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 512;
                                    this.A02 = A0A;
                                    continue;
                                case 90:
                                    this.A00 |= 1024;
                                    this.A01 = c0ro.A08();
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
                        }
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
                return new C2VL();
            case 5:
                return new C0CT() { // from class: X.2VM
                    {
                        C2VL c2vl2 = C2VL.A0C;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0D == null) {
                    synchronized (C2VL.class) {
                        if (A0D == null) {
                            A0D = new C0RR(A0C);
                        }
                    }
                }
                return A0D;
            default:
                throw new UnsupportedOperationException();
        }
        return A0C;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A00 = (i2 & 1) == 1 ? 0 + C0RS.A00(1) : 0;
        if ((i2 & 2) == 2) {
            A00 += C0RS.A00(2);
        }
        if ((i2 & 4) == 4) {
            A00 += C0RS.A00(3);
        }
        if ((i2 & 8) == 8) {
            A00 += C0RS.A00(4);
        }
        if ((i2 & 16) == 16) {
            A00 += C0RS.A00(5);
        }
        if ((i2 & 32) == 32) {
            A00 += C0RS.A00(6);
        }
        if ((i2 & 64) == 64) {
            A00 += C0RS.A00(7);
        }
        if ((i2 & 128) == 128) {
            A00 += C0RS.A00(8);
        }
        if ((i2 & 256) == 256) {
            A00 += C0RS.A00(9);
        }
        if ((i2 & 512) == 512) {
            A00 += C0RS.A0B(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            A00 += C0RS.A09(11, this.A01);
        }
        int A002 = this.unknownFields.A00() + A00;
        ((C0AZ) this).A00 = A002;
        return A002;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0Q(1, this.A0B);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0Q(2, this.A09);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0Q(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0Q(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0Q(5, this.A08);
        }
        if ((this.A00 & 32) == 32) {
            c0rs.A0Q(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0Q(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0Q(8, this.A04);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0Q(9, this.A05);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0P(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            c0rs.A0N(11, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
