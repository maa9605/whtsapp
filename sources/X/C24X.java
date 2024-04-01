package X;

import java.io.IOException;

/* renamed from: X.24X */
/* loaded from: classes2.dex */
public final class C24X extends C0AZ implements C0AY {
    public static final C24X A03;
    public static volatile C0RQ A04;
    public int A00;
    public int A01;
    public C24Y A02;

    static {
        C24X c24x = new C24X();
        A03 = c24x;
        c24x.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C877040f c877040f;
        EnumC458824c enumC458824c;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24X c24x = (C24X) obj2;
                this.A01 = c0rm.AW5((this.A00 & 1) == 1, this.A01, (c24x.A00 & 1) == 1, c24x.A01);
                this.A02 = (C24Y) c0rm.AW9(this.A02, c24x.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c24x.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r3) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                int A02 = c0ro.A02();
                                if (A02 == 0) {
                                    enumC458824c = EnumC458824c.SET;
                                } else {
                                    enumC458824c = A02 != 1 ? null : EnumC458824c.REMOVE;
                                }
                                if (enumC458824c == null) {
                                    super.A0F(1, A02);
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A02;
                                }
                            } else if (A032 != 18) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 2) == 2) {
                                    c877040f = (C877040f) this.A02.AVX();
                                } else {
                                    c877040f = null;
                                }
                                C24Y c24y = (C24Y) c0ro.A09(C24Y.A04.A0C(), c0rp);
                                this.A02 = c24y;
                                if (c877040f != null) {
                                    c877040f.A03(c24y);
                                    this.A02 = (C24Y) c877040f.A00();
                                }
                                this.A00 |= 2;
                            }
                        }
                        r3 = true;
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
                return new C24X();
            case 5:
                return new C0CT() { // from class: X.40c
                    {
                        C24X c24x2 = C24X.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C24X.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = this.A00;
        int A042 = (i2 & 1) == 1 ? 0 + C0RS.A04(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            C24Y c24y = this.A02;
            if (c24y == null) {
                c24y = C24Y.A04;
            }
            A042 += C0RS.A0A(2, c24y);
        }
        int A00 = this.unknownFields.A00() + A042;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0I(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C24Y c24y = this.A02;
            if (c24y == null) {
                c24y = C24Y.A04;
            }
            c0rs.A0O(2, c24y);
        }
        this.unknownFields.A02(c0rs);
    }
}
