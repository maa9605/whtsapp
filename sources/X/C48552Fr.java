package X;

import java.io.IOException;

/* renamed from: X.2Fr  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48552Fr extends C0AZ implements C0AY {
    public static final C48552Fr A03;
    public static volatile C0RQ A04;
    public int A00;
    public C40531sQ A01;
    public C452421a A02;

    static {
        C48552Fr c48552Fr = new C48552Fr();
        A03 = c48552Fr;
        c48552Fr.A0E();
    }

    public static void A09(C48552Fr c48552Fr, C40541sR c40541sR) {
        if (c48552Fr != null) {
            c48552Fr.A01 = (C40531sQ) c40541sR.A01();
            c48552Fr.A00 |= 1;
            return;
        }
        throw null;
    }

    public static void A0A(C48552Fr c48552Fr, C452421a c452421a) {
        if (c452421a != null) {
            c48552Fr.A02 = c452421a;
            c48552Fr.A00 |= 2;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C452521b c452521b;
        C40541sR c40541sR;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48552Fr c48552Fr = (C48552Fr) obj2;
                this.A01 = (C40531sQ) c0rm.AW9(this.A01, c48552Fr.A01);
                this.A02 = (C452421a) c0rm.AW9(this.A02, c48552Fr.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c48552Fr.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 18) {
                                    if ((this.A00 & 1) == 1) {
                                        c40541sR = (C40541sR) this.A01.AVX();
                                    } else {
                                        c40541sR = null;
                                    }
                                    C40531sQ c40531sQ = (C40531sQ) c0ro.A09(C40531sQ.A0c.A0C(), c0rp);
                                    this.A01 = c40531sQ;
                                    if (c40541sR != null) {
                                        c40541sR.A03(c40531sQ);
                                        this.A01 = (C40531sQ) c40541sR.A00();
                                    }
                                    this.A00 |= 1;
                                } else if (A032 != 26) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 2) == 2) {
                                        c452521b = (C452521b) this.A02.AVX();
                                    } else {
                                        c452521b = null;
                                    }
                                    C452421a c452421a = (C452421a) c0ro.A09(C452421a.A05.A0C(), c0rp);
                                    this.A02 = c452421a;
                                    if (c452521b != null) {
                                        c452521b.A03(c452421a);
                                        this.A02 = (C452421a) c452521b.A00();
                                    }
                                    this.A00 |= 2;
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            C0JX c0jx = new C0JX(e.getMessage());
                            c0jx.unfinishedMessage = this;
                            throw new RuntimeException(c0jx);
                        }
                    } catch (C0JX e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C48552Fr();
            case 5:
                return new C0CT() { // from class: X.2Fq
                    {
                        C48552Fr c48552Fr2 = C48552Fr.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C48552Fr.class) {
                        if (A04 == null) {
                            A04 = new C0RR(A03);
                        }
                    }
                }
                return A04;
            default:
                throw new UnsupportedOperationException();
        }
        return A03;
    }

    public C40531sQ A0i() {
        C40531sQ c40531sQ = this.A01;
        return c40531sQ == null ? C40531sQ.A0c : c40531sQ;
    }

    public C452421a A0j() {
        C452421a c452421a = this.A02;
        return c452421a == null ? C452421a.A05 : c452421a;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = (this.A00 & 1) == 1 ? 0 + C0RS.A0A(2, A0i()) : 0;
        if ((this.A00 & 2) == 2) {
            A0A += C0RS.A0A(3, A0j());
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(2, A0i());
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0O(3, A0j());
        }
        this.unknownFields.A02(c0rs);
    }
}
