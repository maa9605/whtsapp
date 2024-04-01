package X;

import java.io.IOException;

/* renamed from: X.3zy  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87633zy extends C0AZ implements C0AY {
    public static final C87633zy A04;
    public static volatile C0RQ A05;
    public int A00;
    public Object A02;
    public int A01 = 0;
    public String A03 = "";

    static {
        C87633zy c87633zy = new C87633zy();
        A04 = c87633zy;
        c87633zy.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87573zs c87573zs;
        C87553zq c87553zq;
        C3lK c3lK;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87633zy c87633zy = (C87633zy) obj2;
                this.A03 = c0rm.AWD((this.A00 & 1) == 1, this.A03, (c87633zy.A00 & 1) == 1, c87633zy.A03);
                int i = c87633zy.A01;
                if (i == 0) {
                    c3lK = C3lK.PARAMONEOF_NOT_SET;
                } else if (i != 2) {
                    c3lK = i != 3 ? null : C3lK.DATE_TIME;
                } else {
                    c3lK = C3lK.CURRENCY;
                }
                int ordinal = c3lK.ordinal();
                if (ordinal == 0) {
                    this.A02 = c0rm.AWA(this.A01 == 2, this.A02, c87633zy.A02);
                } else if (ordinal == 1) {
                    this.A02 = c0rm.AWA(this.A01 == 3, this.A02, c87633zy.A02);
                } else if (ordinal == 2) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i2 = c87633zy.A01;
                    if (i2 != 0) {
                        this.A01 = i2;
                    }
                    this.A00 |= c87633zy.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r2) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A03 = A0A;
                            } else if (A03 == 18) {
                                if (this.A01 == 2) {
                                    c87553zq = (C87553zq) ((C87563zr) this.A02).AVX();
                                } else {
                                    c87553zq = null;
                                }
                                C0AX A09 = c0ro.A09(C87563zr.A03.A0C(), c0rp);
                                this.A02 = A09;
                                if (c87553zq != null) {
                                    c87553zq.A03((C87563zr) A09);
                                    this.A02 = c87553zq.A00();
                                }
                                this.A01 = 2;
                            } else if (A03 != 26) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if (this.A01 == 3) {
                                    c87573zs = (C87573zs) ((C87623zx) this.A02).AVX();
                                } else {
                                    c87573zs = null;
                                }
                                C0AX A092 = c0ro.A09(C87623zx.A03.A0C(), c0rp);
                                this.A02 = A092;
                                if (c87573zs != null) {
                                    c87573zs.A03((C87623zx) A092);
                                    this.A02 = c87573zs.A00();
                                }
                                this.A01 = 3;
                            }
                        }
                        r2 = true;
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
                return new C87633zy();
            case 5:
                return new C0CT() { // from class: X.3zp
                    {
                        C87633zy c87633zy2 = C87633zy.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C87633zy.class) {
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
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A03) : 0;
        if (this.A01 == 2) {
            A0B += C0RS.A0A(2, (C0Aa) this.A02);
        }
        if (this.A01 == 3) {
            A0B += C0RS.A0A(3, (C0Aa) this.A02);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A03);
        }
        if (this.A01 == 2) {
            c0rs.A0O(2, (C0Aa) this.A02);
        }
        if (this.A01 == 3) {
            c0rs.A0O(3, (C0Aa) this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
