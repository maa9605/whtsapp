package X;

import java.io.IOException;

/* renamed from: X.3zg  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87453zg extends C0AZ implements C0AY {
    public static final C87453zg A04;
    public static volatile C0RQ A05;
    public int A00;
    public long A01;
    public C0AN A02 = C0AN.A01;
    public AnonymousClass201 A03;

    static {
        C87453zg c87453zg = new C87453zg();
        A04 = c87453zg;
        c87453zg.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87463zh c87463zh;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87453zg c87453zg = (C87453zg) obj2;
                this.A02 = c0rm.AW2((this.A00 & 1) == 1, this.A02, (c87453zg.A00 & 1) == 1, c87453zg.A02);
                this.A03 = (AnonymousClass201) c0rm.AW9(this.A03, c87453zg.A03);
                int i = this.A00;
                boolean z2 = (i & 4) == 4;
                long j = this.A01;
                int i2 = c87453zg.A00;
                this.A01 = c0rm.AW8(z2, j, (i2 & 4) == 4, c87453zg.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                this.A00 |= 1;
                                this.A02 = c0ro.A08();
                            } else if (A03 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    c87463zh = (C87463zh) this.A03.AVX();
                                } else {
                                    c87463zh = null;
                                }
                                AnonymousClass201 anonymousClass201 = (AnonymousClass201) c0ro.A09(AnonymousClass201.A05.A0C(), c0rp);
                                this.A03 = anonymousClass201;
                                if (c87463zh != null) {
                                    c87463zh.A03(anonymousClass201);
                                    this.A03 = (AnonymousClass201) c87463zh.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 != 24) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 4;
                                this.A01 = c0ro.A06();
                            }
                        }
                        z = true;
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
                return new C87453zg();
            case 5:
                return new C0CT() { // from class: X.3zf
                    {
                        C87453zg c87453zg2 = C87453zg.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C87453zg.class) {
                        if (A05 == null) {
                            A05 = new C0RR(A04);
                        }
                    }
                }
                return A05;
            default:
                throw new UnsupportedOperationException();
        }
        return A04;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A09 = (i2 & 1) == 1 ? 0 + C0RS.A09(1, this.A02) : 0;
        if ((i2 & 2) == 2) {
            AnonymousClass201 anonymousClass201 = this.A03;
            if (anonymousClass201 == null) {
                anonymousClass201 = AnonymousClass201.A05;
            }
            A09 += C0RS.A0A(2, anonymousClass201);
        }
        if ((this.A00 & 4) == 4) {
            A09 += C0RS.A07(3, this.A01);
        }
        int A00 = this.unknownFields.A00() + A09;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0N(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            AnonymousClass201 anonymousClass201 = this.A03;
            if (anonymousClass201 == null) {
                anonymousClass201 = AnonymousClass201.A05;
            }
            c0rs.A0O(2, anonymousClass201);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0M(3, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
