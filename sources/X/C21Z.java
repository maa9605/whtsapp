package X;

import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;

/* renamed from: X.21Z  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C21Z extends C0AZ implements C0AY {
    public static final C21Z A0B;
    public static volatile C0RQ A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C452421a A07;
    public boolean A0A;
    public String A09 = "";
    public String A08 = "";

    static {
        C21Z c21z = new C21Z();
        A0B = c21z;
        c21z.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC452621c enumC452621c;
        EnumC452721d enumC452721d;
        EnumC79333lU enumC79333lU;
        C452521b c452521b = null;
        switch (c0rl.ordinal()) {
            case 0:
                return A0B;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C21Z c21z = (C21Z) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c21z.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c21z.A01);
                this.A04 = c0rm.AW8((i & 2) == 2, this.A04, (i3 & 2) == 2, c21z.A04);
                this.A09 = c0rm.AWD((i & 4) == 4, this.A09, (i3 & 4) == 4, c21z.A09);
                this.A02 = c0rm.AW5((i & 8) == 8, this.A02, (i3 & 8) == 8, c21z.A02);
                this.A06 = c0rm.AW8((i & 16) == 16, this.A06, (i3 & 16) == 16, c21z.A06);
                this.A07 = (C452421a) c0rm.AW9(this.A07, c21z.A07);
                int i4 = this.A00;
                boolean z2 = (i4 & 64) == 64;
                long j = this.A05;
                int i5 = c21z.A00;
                this.A05 = c0rm.AW8(z2, j, (i5 & 64) == 64, c21z.A05);
                this.A0A = c0rm.AW1((i4 & 128) == 128, this.A0A, (i5 & 128) == 128, c21z.A0A);
                this.A08 = c0rm.AWD((i4 & 256) == 256, this.A08, (i5 & 256) == 256, c21z.A08);
                this.A03 = c0rm.AW5((i4 & 512) == 512, this.A03, (i5 & 512) == 512, c21z.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            switch (A03) {
                                case 0:
                                    z3 = true;
                                case 8:
                                    int A02 = c0ro.A02();
                                    if (A02 == 0) {
                                        enumC79333lU = EnumC79333lU.UNKNOWN_CURRENCY;
                                    } else {
                                        enumC79333lU = A02 != 1 ? null : EnumC79333lU.INR;
                                    }
                                    if (enumC79333lU == null) {
                                        super.A0F(1, A02);
                                    } else {
                                        this.A00 |= 1;
                                        this.A01 = A02;
                                    }
                                    c452521b = null;
                                case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                    this.A00 |= 2;
                                    this.A04 = c0ro.A06();
                                    c452521b = null;
                                case 26:
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A09 = A0A;
                                    c452521b = null;
                                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /* 32 */:
                                    int A022 = c0ro.A02();
                                    switch (A022) {
                                        case 0:
                                            enumC452721d = EnumC452721d.UNKNOWN_STATUS;
                                            break;
                                        case 1:
                                            enumC452721d = EnumC452721d.PROCESSING;
                                            break;
                                        case 2:
                                            enumC452721d = EnumC452721d.SENT;
                                            break;
                                        case 3:
                                            enumC452721d = EnumC452721d.NEED_TO_ACCEPT;
                                            break;
                                        case 4:
                                            enumC452721d = EnumC452721d.COMPLETE;
                                            break;
                                        case 5:
                                            enumC452721d = EnumC452721d.COULD_NOT_COMPLETE;
                                            break;
                                        case 6:
                                            enumC452721d = EnumC452721d.REFUNDED;
                                            break;
                                        case 7:
                                            enumC452721d = EnumC452721d.EXPIRED;
                                            break;
                                        case 8:
                                            enumC452721d = EnumC452721d.REJECTED;
                                            break;
                                        case 9:
                                            enumC452721d = EnumC452721d.CANCELLED;
                                            break;
                                        case 10:
                                            enumC452721d = EnumC452721d.WAITING_FOR_PAYER;
                                            break;
                                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                                            enumC452721d = EnumC452721d.WAITING;
                                            break;
                                        default:
                                            enumC452721d = null;
                                            break;
                                    }
                                    if (enumC452721d == null) {
                                        super.A0F(4, A022);
                                    } else {
                                        this.A00 |= 8;
                                        this.A02 = A022;
                                    }
                                    c452521b = null;
                                case 40:
                                    this.A00 |= 16;
                                    this.A06 = c0ro.A06();
                                    c452521b = null;
                                case 50:
                                    if ((this.A00 & 32) == 32) {
                                        c452521b = (C452521b) this.A07.AVX();
                                    }
                                    C452421a c452421a = (C452421a) c0ro.A09(C452421a.A05.A0C(), c0rp);
                                    this.A07 = c452421a;
                                    if (c452521b != null) {
                                        c452521b.A03(c452421a);
                                        this.A07 = (C452421a) c452521b.A00();
                                    }
                                    this.A00 |= 32;
                                    c452521b = null;
                                case 56:
                                    this.A00 |= 64;
                                    this.A05 = c0ro.A06();
                                    c452521b = null;
                                case 64:
                                    this.A00 |= 128;
                                    this.A0A = c0ro.A0F();
                                    c452521b = null;
                                case 74:
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 256;
                                    this.A08 = A0A2;
                                    c452521b = null;
                                case 80:
                                    int A023 = c0ro.A02();
                                    switch (A023) {
                                        case 0:
                                            enumC452621c = EnumC452621c.UNKNOWN;
                                            break;
                                        case 1:
                                            enumC452621c = EnumC452621c.PENDING_SETUP;
                                            break;
                                        case 2:
                                            enumC452621c = EnumC452621c.PENDING_RECEIVER_SETUP;
                                            break;
                                        case 3:
                                            enumC452621c = EnumC452621c.INIT;
                                            break;
                                        case 4:
                                            enumC452621c = EnumC452621c.SUCCESS;
                                            break;
                                        case 5:
                                            enumC452621c = EnumC452621c.COMPLETED;
                                            break;
                                        case 6:
                                            enumC452621c = EnumC452621c.FAILED;
                                            break;
                                        case 7:
                                            enumC452621c = EnumC452621c.FAILED_RISK;
                                            break;
                                        case 8:
                                            enumC452621c = EnumC452621c.FAILED_PROCESSING;
                                            break;
                                        case 9:
                                            enumC452621c = EnumC452621c.FAILED_RECEIVER_PROCESSING;
                                            break;
                                        case 10:
                                            enumC452621c = EnumC452621c.FAILED_DA;
                                            break;
                                        case GoogleMigrateImporterActivity.A0E /* 11 */:
                                            enumC452621c = EnumC452621c.FAILED_DA_FINAL;
                                            break;
                                        case 12:
                                            enumC452621c = EnumC452621c.REFUNDED_TXN;
                                            break;
                                        case 13:
                                            enumC452621c = EnumC452621c.REFUND_FAILED;
                                            break;
                                        case 14:
                                            enumC452621c = EnumC452621c.REFUND_FAILED_PROCESSING;
                                            break;
                                        case 15:
                                            enumC452621c = EnumC452621c.REFUND_FAILED_DA;
                                            break;
                                        case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                                            enumC452621c = EnumC452621c.EXPIRED_TXN;
                                            break;
                                        case 17:
                                            enumC452621c = EnumC452621c.AUTH_CANCELED;
                                            break;
                                        case 18:
                                            enumC452621c = EnumC452621c.AUTH_CANCEL_FAILED_PROCESSING;
                                            break;
                                        case 19:
                                            enumC452621c = EnumC452621c.AUTH_CANCEL_FAILED;
                                            break;
                                        case C0M6.A01 /* 20 */:
                                            enumC452621c = EnumC452621c.COLLECT_INIT;
                                            break;
                                        case 21:
                                            enumC452621c = EnumC452621c.COLLECT_SUCCESS;
                                            break;
                                        case 22:
                                            enumC452621c = EnumC452621c.COLLECT_FAILED;
                                            break;
                                        case 23:
                                            enumC452621c = EnumC452621c.COLLECT_FAILED_RISK;
                                            break;
                                        case 24:
                                            enumC452621c = EnumC452621c.COLLECT_REJECTED;
                                            break;
                                        case 25:
                                            enumC452621c = EnumC452621c.COLLECT_EXPIRED;
                                            break;
                                        case 26:
                                            enumC452621c = EnumC452621c.COLLECT_CANCELED;
                                            break;
                                        case 27:
                                            enumC452621c = EnumC452621c.COLLECT_CANCELLING;
                                            break;
                                        default:
                                            enumC452621c = null;
                                            break;
                                    }
                                    if (enumC452621c == null) {
                                        super.A0F(10, A023);
                                    } else {
                                        this.A00 |= 512;
                                        this.A03 = A023;
                                    }
                                    c452521b = null;
                                default:
                                    if (A0I(A03, c0ro)) {
                                        c452521b = null;
                                    } else {
                                        z3 = true;
                                    }
                            }
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
                return new C21Z();
            case 5:
                return new C0CT() { // from class: X.2GF
                    {
                        C21Z c21z2 = C21Z.A0B;
                    }
                };
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C21Z.class) {
                        if (A0C == null) {
                            A0C = new C0RR(A0B);
                        }
                    }
                }
                return A0C;
            default:
                throw new UnsupportedOperationException();
        }
        return A0B;
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
            A04 += C0RS.A08(2, this.A04);
        }
        if ((i2 & 4) == 4) {
            A04 += C0RS.A0B(3, this.A09);
        }
        int i3 = this.A00;
        if ((i3 & 8) == 8) {
            A04 += C0RS.A04(4, this.A02);
        }
        if ((i3 & 16) == 16) {
            A04 += C0RS.A08(5, this.A06);
        }
        if ((i3 & 32) == 32) {
            C452421a c452421a = this.A07;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            A04 += C0RS.A0A(6, c452421a);
        }
        int i4 = this.A00;
        if ((i4 & 64) == 64) {
            A04 += C0RS.A08(7, this.A05);
        }
        if ((i4 & 128) == 128) {
            A04 += C0RS.A00(8);
        }
        if ((i4 & 256) == 256) {
            A04 += C0RS.A0B(9, this.A08);
        }
        if ((this.A00 & 512) == 512) {
            A04 += C0RS.A04(10, this.A03);
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
            c0rs.A0M(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A09);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0I(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            c0rs.A0M(5, this.A06);
        }
        if ((this.A00 & 32) == 32) {
            C452421a c452421a = this.A07;
            if (c452421a == null) {
                c452421a = C452421a.A05;
            }
            c0rs.A0O(6, c452421a);
        }
        if ((this.A00 & 64) == 64) {
            c0rs.A0M(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            c0rs.A0Q(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            c0rs.A0P(9, this.A08);
        }
        if ((this.A00 & 512) == 512) {
            c0rs.A0I(10, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
