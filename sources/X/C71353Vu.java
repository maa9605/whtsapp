package X;

import java.io.IOException;

/* renamed from: X.3Vu */
/* loaded from: classes2.dex */
public final class C71353Vu extends C0AZ implements C0AY {
    public static final C71353Vu A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01;
    public int A02;
    public C0AN A03 = C0AN.A01;

    static {
        C71353Vu c71353Vu = new C71353Vu();
        A04 = c71353Vu;
        c71353Vu.A0E();
    }

    public static void A09(C71353Vu c71353Vu, C0AN c0an) {
        c71353Vu.A00 |= 4;
        c71353Vu.A03 = c0an;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C71353Vu c71353Vu = (C71353Vu) obj2;
                this.A01 = c0rm.AW5(A0i(), this.A01, c71353Vu.A0i(), c71353Vu.A01);
                int i = this.A00;
                boolean z = (i & 2) == 2;
                int i2 = this.A02;
                int i3 = c71353Vu.A00;
                this.A02 = c0rm.AW5(z, i2, (i3 & 2) == 2, c71353Vu.A02);
                this.A03 = c0rm.AW2((i & 4) == 4, this.A03, (i3 & 4) == 4, c71353Vu.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c71353Vu.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r6) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 8) {
                                    this.A00 |= 1;
                                    this.A01 = c0ro.A02();
                                } else if (A03 == 18) {
                                    this.A00 |= 4;
                                    this.A03 = c0ro.A08();
                                } else if (A03 != 24) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 2;
                                    this.A02 = c0ro.A02();
                                }
                            }
                            r6 = true;
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
                return new C71353Vu();
            case 5:
                return new C71483Wh(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C71353Vu.class) {
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

    public boolean A0i() {
        return (this.A00 & 1) == 1;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A06 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 4) == 4) {
            A06 += C0RS.A09(2, this.A03);
        }
        if ((i2 & 2) == 2) {
            A06 += C0RS.A05(3, this.A02);
        }
        int A00 = this.unknownFields.A00() + A06;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0N(2, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0I(3, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}