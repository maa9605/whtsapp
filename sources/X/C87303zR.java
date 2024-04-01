package X;

import java.io.IOException;

/* renamed from: X.3zR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87303zR extends C0AZ implements C0AY {
    public static final C87303zR A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public C87283zP A02;
    public String A03 = "";
    public boolean A04;

    static {
        C87303zR c87303zR = new C87303zR();
        A05 = c87303zR;
        c87303zR.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87273zO c87273zO;
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87303zR c87303zR = (C87303zR) obj2;
                this.A03 = c0rm.AWD((this.A00 & 1) == 1, this.A03, (c87303zR.A00 & 1) == 1, c87303zR.A03);
                this.A02 = (C87283zP) c0rm.AW9(this.A02, c87303zR.A02);
                int i = this.A00;
                boolean z = (i & 4) == 4;
                int i2 = this.A01;
                int i3 = c87303zR.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 4) == 4, c87303zR.A01);
                this.A04 = c0rm.AW1((i & 8) == 8, this.A04, (i3 & 8) == 8, c87303zR.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
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
                                this.A03 = A0A;
                            } else if (A03 == 18) {
                                if ((this.A00 & 2) == 2) {
                                    c87273zO = (C87273zO) this.A02.AVX();
                                } else {
                                    c87273zO = null;
                                }
                                C87283zP c87283zP = (C87283zP) c0ro.A09(C87283zP.A05.A0C(), c0rp);
                                this.A02 = c87283zP;
                                if (c87273zO != null) {
                                    c87273zO.A03(c87283zP);
                                    this.A02 = (C87283zP) c87273zO.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 == 24) {
                                int A02 = c0ro.A02();
                                if (C0L3.A00(A02) == null) {
                                    super.A0F(3, A02);
                                } else {
                                    this.A00 |= 4;
                                    this.A01 = A02;
                                }
                            } else if (A03 != 32) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                this.A00 |= 8;
                                this.A04 = c0ro.A0F();
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
                return new C87303zR();
            case 5:
                return new C0CT() { // from class: X.3zQ
                    {
                        C87303zR c87303zR2 = C87303zR.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C87303zR.class) {
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

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A03) : 0;
        if ((this.A00 & 2) == 2) {
            C87283zP c87283zP = this.A02;
            if (c87283zP == null) {
                c87283zP = C87283zP.A05;
            }
            A0B += C0RS.A0A(2, c87283zP);
        }
        int i2 = this.A00;
        if ((i2 & 4) == 4) {
            A0B += C0RS.A04(3, this.A01);
        }
        if ((i2 & 8) == 8) {
            A0B += C0RS.A00(4);
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
        if ((this.A00 & 2) == 2) {
            C87283zP c87283zP = this.A02;
            if (c87283zP == null) {
                c87283zP = C87283zP.A05;
            }
            c0rs.A0O(2, c87283zP);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0I(3, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0Q(4, this.A04);
        }
        this.unknownFields.A02(c0rs);
    }
}
