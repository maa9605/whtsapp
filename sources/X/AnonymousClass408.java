package X;

import java.io.IOException;

/* renamed from: X.408  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass408 extends C0AZ implements C0AY {
    public static final AnonymousClass408 A04;
    public static volatile C0RQ A05;
    public int A00;
    public AnonymousClass406 A02;
    public C0CX A01 = C0RU.A01;
    public String A03 = "";

    static {
        AnonymousClass408 anonymousClass408 = new AnonymousClass408();
        A04 = anonymousClass408;
        anonymousClass408.A0E();
    }

    public static void A09(AnonymousClass408 anonymousClass408, AnonymousClass405 anonymousClass405) {
        if (anonymousClass408 != null) {
            anonymousClass408.A02 = (AnonymousClass406) anonymousClass405.A01();
            anonymousClass408.A00 |= 1;
            return;
        }
        throw null;
    }

    public static void A0A(AnonymousClass408 anonymousClass408, C40A c40a) {
        if (c40a != null) {
            C0CX c0cx = anonymousClass408.A01;
            if (!((C0CY) c0cx).A00) {
                c0cx = C0AZ.A05(c0cx);
                anonymousClass408.A01 = c0cx;
            }
            c0cx.add(c40a);
            return;
        }
        throw null;
    }

    public static void A0B(AnonymousClass408 anonymousClass408, String str) {
        if (str != null) {
            anonymousClass408.A00 |= 2;
            anonymousClass408.A03 = str;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        AnonymousClass405 anonymousClass405;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                AnonymousClass408 anonymousClass408 = (AnonymousClass408) obj2;
                this.A01 = c0rm.AW7(this.A01, anonymousClass408.A01);
                this.A02 = (AnonymousClass406) c0rm.AW9(this.A02, anonymousClass408.A02);
                int i = this.A00;
                boolean z = (i & 2) == 2;
                String str = this.A03;
                int i2 = anonymousClass408.A00;
                this.A03 = c0rm.AWD(z, str, (i2 & 2) == 2, anonymousClass408.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
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
                                C0CX c0cx = this.A01;
                                if (!((C0CY) c0cx).A00) {
                                    c0cx = C0AZ.A05(c0cx);
                                    this.A01 = c0cx;
                                }
                                c0cx.add(c0ro.A09(C40A.A03.A0C(), c0rp));
                            } else if (A03 == 18) {
                                if ((this.A00 & 1) == 1) {
                                    anonymousClass405 = (AnonymousClass405) this.A02.AVX();
                                } else {
                                    anonymousClass405 = null;
                                }
                                AnonymousClass406 anonymousClass406 = (AnonymousClass406) c0ro.A09(AnonymousClass406.A03.A0C(), c0rp);
                                this.A02 = anonymousClass406;
                                if (anonymousClass405 != null) {
                                    anonymousClass405.A03(anonymousClass406);
                                    this.A02 = (AnonymousClass406) anonymousClass405.A00();
                                }
                                this.A00 |= 1;
                            } else if (A03 != 26) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                String A0A = c0ro.A0A();
                                this.A00 |= 2;
                                this.A03 = A0A;
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
                ((C0CY) this.A01).A00 = false;
                return null;
            case 4:
                return new AnonymousClass408();
            case 5:
                return new C0CT() { // from class: X.407
                    {
                        AnonymousClass408 anonymousClass4082 = AnonymousClass408.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (AnonymousClass408.class) {
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

    public AnonymousClass406 A0i() {
        AnonymousClass406 anonymousClass406 = this.A02;
        return anonymousClass406 == null ? AnonymousClass406.A03 : anonymousClass406;
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A01.size(); i3++) {
            i2 += C0RS.A0A(1, (C0AX) this.A01.get(i3));
        }
        if ((this.A00 & 1) == 1) {
            i2 += C0RS.A0A(2, A0i());
        }
        if ((this.A00 & 2) == 2) {
            i2 += C0RS.A0B(3, this.A03);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        for (int i = 0; i < this.A01.size(); i++) {
            c0rs.A0O(1, (C0AX) this.A01.get(i));
        }
        if ((this.A00 & 1) == 1) {
            c0rs.A0O(2, A0i());
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(3, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
