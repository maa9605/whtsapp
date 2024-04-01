package X;

import java.io.IOException;

/* renamed from: X.2Fv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48592Fv extends C0AZ implements C0AY {
    public static final C48592Fv A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public C40521sP A02;
    public String A04 = "";
    public String A03 = "";

    static {
        C48592Fv c48592Fv = new C48592Fv();
        A05 = c48592Fv;
        c48592Fv.A0E();
    }

    public static void A09(C48592Fv c48592Fv, C40521sP c40521sP) {
        if (c40521sP != null) {
            c48592Fv.A02 = c40521sP;
            c48592Fv.A00 |= 4;
            return;
        }
        throw null;
    }

    public static void A0A(C48592Fv c48592Fv, String str) {
        if (str != null) {
            c48592Fv.A00 |= 1;
            c48592Fv.A04 = str;
            return;
        }
        throw null;
    }

    public static void A0B(C48592Fv c48592Fv, String str) {
        if (str != null) {
            c48592Fv.A00 |= 2;
            c48592Fv.A03 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87333zU c87333zU;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48592Fv c48592Fv = (C48592Fv) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A04;
                int i2 = c48592Fv.A00;
                this.A04 = c0rm.AWD(z, str, (i2 & 1) == 1, c48592Fv.A04);
                this.A03 = c0rm.AWD((i & 2) == 2, this.A03, (i2 & 2) == 2, c48592Fv.A03);
                this.A02 = (C40521sP) c0rm.AW9(this.A02, c48592Fv.A02);
                int i3 = this.A00;
                boolean z2 = (i3 & 8) == 8;
                int i4 = this.A01;
                int i5 = c48592Fv.A00;
                this.A01 = c0rm.AW5(z2, i4, (i5 & 8) == 8, c48592Fv.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i3 | i5;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A04 = A0A;
                            } else if (A03 == 18) {
                                String A0A2 = c0ro.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A2;
                            } else if (A03 == 26) {
                                if ((this.A00 & 4) == 4) {
                                    c87333zU = (C87333zU) this.A02.AVX();
                                } else {
                                    c87333zU = null;
                                }
                                C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                this.A02 = c40521sP;
                                if (c87333zU != null) {
                                    c87333zU.A03(c40521sP);
                                    this.A02 = (C40521sP) c87333zU.A00();
                                }
                                this.A00 |= 4;
                            } else if (A03 != 32) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 8;
                                this.A01 = c0ro.A02();
                            }
                        }
                        r5 = true;
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
                return new C48592Fv();
            case 5:
                return new C0CT() { // from class: X.2Fu
                    {
                        C48592Fv c48592Fv2 = C48592Fv.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C48592Fv.class) {
                        if (A06 == null) {
                            A06 = new C0RR(A05);
                        }
                    }
                }
                return A06;
            default:
                throw new UnsupportedOperationException();
        }
        return A05;
    }

    public C40521sP A0i() {
        C40521sP c40521sP = this.A02;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A04) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            A0B += C0RS.A0A(3, A0i());
        }
        if ((this.A00 & 8) == 8) {
            A0B += C0RS.A06(4, this.A01);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A04);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(3, A0i());
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0K(4, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
