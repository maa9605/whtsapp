package X;

import java.io.IOException;

/* renamed from: X.24Y  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C24Y extends C0AZ implements C0AY {
    public static final C24Y A04;
    public static volatile C0RQ A05;
    public int A00;
    public C24Z A01;
    public C458624a A02;
    public C458724b A03;

    static {
        C24Y c24y = new C24Y();
        A04 = c24y;
        c24y.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C876540a c876540a;
        C877140g c877140g;
        C876640b c876640b;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C24Y c24y = (C24Y) obj2;
                this.A02 = (C458624a) c0rm.AW9(this.A02, c24y.A02);
                this.A03 = (C458724b) c0rm.AW9(this.A03, c24y.A03);
                this.A01 = (C24Z) c0rm.AW9(this.A01, c24y.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c24y.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                if ((this.A00 & 1) == 1) {
                                    c876640b = (C876640b) this.A02.AVX();
                                } else {
                                    c876640b = null;
                                }
                                C458624a c458624a = (C458624a) c0ro.A09(C458624a.A02.A0C(), c0rp);
                                this.A02 = c458624a;
                                if (c876640b != null) {
                                    c876640b.A03(c458624a);
                                    this.A02 = (C458624a) c876640b.A00();
                                }
                                this.A00 |= 1;
                            } else if (A03 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    c877140g = (C877140g) this.A03.AVX();
                                } else {
                                    c877140g = null;
                                }
                                C458724b c458724b = (C458724b) c0ro.A09(C458724b.A02.A0C(), c0rp);
                                this.A03 = c458724b;
                                if (c877140g != null) {
                                    c877140g.A03(c458724b);
                                    this.A03 = (C458724b) c877140g.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 != 26) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 4) == 4) {
                                    c876540a = (C876540a) this.A01.AVX();
                                } else {
                                    c876540a = null;
                                }
                                C24Z c24z = (C24Z) c0ro.A09(C24Z.A02.A0C(), c0rp);
                                this.A01 = c24z;
                                if (c876540a != null) {
                                    c876540a.A03(c24z);
                                    this.A01 = (C24Z) c876540a.A00();
                                }
                                this.A00 |= 4;
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
                return new C24Y();
            case 5:
                return new C0CT() { // from class: X.40f
                    {
                        C24Y c24y2 = C24Y.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C24Y.class) {
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
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            C458624a c458624a = this.A02;
            if (c458624a == null) {
                c458624a = C458624a.A02;
            }
            i2 = 0 + C0RS.A0A(1, c458624a);
        }
        if ((this.A00 & 2) == 2) {
            C458724b c458724b = this.A03;
            if (c458724b == null) {
                c458724b = C458724b.A02;
            }
            i2 += C0RS.A0A(2, c458724b);
        }
        if ((this.A00 & 4) == 4) {
            C24Z c24z = this.A01;
            if (c24z == null) {
                c24z = C24Z.A02;
            }
            i2 += C0RS.A0A(3, c24z);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            C458624a c458624a = this.A02;
            if (c458624a == null) {
                c458624a = C458624a.A02;
            }
            c0rs.A0O(1, c458624a);
        }
        if ((this.A00 & 2) == 2) {
            C458724b c458724b = this.A03;
            if (c458724b == null) {
                c458724b = C458724b.A02;
            }
            c0rs.A0O(2, c458724b);
        }
        if ((this.A00 & 4) == 4) {
            C24Z c24z = this.A01;
            if (c24z == null) {
                c24z = C24Z.A02;
            }
            c0rs.A0O(3, c24z);
        }
        this.unknownFields.A02(c0rs);
    }
}
