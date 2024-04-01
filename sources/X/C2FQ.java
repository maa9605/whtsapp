package X;

import java.io.IOException;

/* renamed from: X.2FQ  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2FQ extends C0AZ implements C0AY {
    public static final C2FQ A04;
    public static volatile C0RQ A05;
    public int A00;
    public C40521sP A01;
    public String A02 = "";
    public String A03 = "";

    static {
        C2FQ c2fq = new C2FQ();
        A04 = c2fq;
        c2fq.A0E();
    }

    public static void A09(C2FQ c2fq, C40521sP c40521sP) {
        if (c40521sP != null) {
            c2fq.A01 = c40521sP;
            c2fq.A00 |= 4;
            return;
        }
        throw null;
    }

    public static void A0A(C2FQ c2fq, String str) {
        if (str != null) {
            c2fq.A00 |= 2;
            c2fq.A03 = str;
            return;
        }
        throw null;
    }

    public static void A0B(C2FQ c2fq, String str) {
        if (str != null) {
            c2fq.A00 |= 1;
            c2fq.A02 = str;
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
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2FQ c2fq = (C2FQ) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A02;
                int i2 = c2fq.A00;
                this.A02 = c0rm.AWD(z, str, (i2 & 1) == 1, c2fq.A02);
                this.A03 = c0rm.AWD((i & 2) == 2, this.A03, (i2 & 2) == 2, c2fq.A03);
                this.A01 = (C40521sP) c0rm.AW9(this.A01, c2fq.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c2fq.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r6) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A02 = A0A;
                                } else if (A03 == 130) {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A03 = A0A2;
                                } else if (A03 != 138) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 4) == 4) {
                                        c87333zU = (C87333zU) this.A01.AVX();
                                    } else {
                                        c87333zU = null;
                                    }
                                    C40521sP c40521sP = (C40521sP) c0ro.A09(C40521sP.A0H.A0C(), c0rp);
                                    this.A01 = c40521sP;
                                    if (c87333zU != null) {
                                        c87333zU.A03(c40521sP);
                                        this.A01 = (C40521sP) c87333zU.A00();
                                    }
                                    this.A00 |= 4;
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
                return new C2FQ();
            case 5:
                return new C0CT() { // from class: X.2FP
                    {
                        C2FQ c2fq2 = C2FQ.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C2FQ.class) {
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

    public C40521sP A0i() {
        C40521sP c40521sP = this.A01;
        return c40521sP == null ? C40521sP.A0H : c40521sP;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A02) : 0;
        if ((this.A00 & 2) == 2) {
            A0B += C0RS.A0B(16, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            A0B += C0RS.A0A(17, A0i());
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(16, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0O(17, A0i());
        }
        this.unknownFields.A02(c0rs);
    }
}
