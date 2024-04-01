package X;

import java.io.IOException;

/* renamed from: X.40I  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40I extends C0AZ implements C0AY {
    public static final C40I A04;
    public static volatile C0RQ A05;
    public int A00;
    public AnonymousClass249 A01;
    public String A03 = "";
    public String A02 = "";

    static {
        C40I c40i = new C40I();
        A04 = c40i;
        c40i.A0E();
    }

    public static void A09(C40I c40i, C2G6 c2g6) {
        if (c40i != null) {
            c40i.A01 = (AnonymousClass249) c2g6.A01();
            c40i.A00 |= 1;
            return;
        }
        throw null;
    }

    public static void A0A(C40I c40i, String str) {
        if (str != null) {
            c40i.A00 |= 2;
            c40i.A03 = str;
            return;
        }
        throw null;
    }

    public static void A0B(C40I c40i, String str) {
        if (str != null) {
            c40i.A00 |= 4;
            c40i.A02 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C2G6 c2g6;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40I c40i = (C40I) obj2;
                this.A01 = (AnonymousClass249) c0rm.AW9(this.A01, c40i.A01);
                int i = this.A00;
                boolean z = (i & 2) == 2;
                String str = this.A03;
                int i2 = c40i.A00;
                this.A03 = c0rm.AWD(z, str, (i2 & 2) == 2, c40i.A03);
                this.A02 = c0rm.AWD((i & 4) == 4, this.A02, (i2 & 4) == 4, c40i.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 10) {
                                    if ((this.A00 & 1) == 1) {
                                        c2g6 = (C2G6) this.A01.AVX();
                                    } else {
                                        c2g6 = null;
                                    }
                                    AnonymousClass249 anonymousClass249 = (AnonymousClass249) c0ro.A09(AnonymousClass249.A0Q.A0C(), c0rp);
                                    this.A01 = anonymousClass249;
                                    if (c2g6 != null) {
                                        c2g6.A03(anonymousClass249);
                                        this.A01 = (AnonymousClass249) c2g6.A00();
                                    }
                                    this.A00 |= 1;
                                } else if (A03 == 18) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A03 = A0A;
                                } else if (A03 != 26) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A02 = A0A2;
                                }
                            }
                            r5 = true;
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
                return new C40I();
            case 5:
                return new C0CT() { // from class: X.40H
                    {
                        C40I c40i2 = C40I.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C40I.class) {
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

    public AnonymousClass249 A0i() {
        AnonymousClass249 anonymousClass249 = this.A01;
        return anonymousClass249 == null ? AnonymousClass249.A0Q : anonymousClass249;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0A = (this.A00 & 1) == 1 ? 0 + C0RS.A0A(1, A0i()) : 0;
        if ((this.A00 & 2) == 2) {
            A0A += C0RS.A0B(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            A0A += C0RS.A0B(3, this.A02);
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(1, A0i());
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A03);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
