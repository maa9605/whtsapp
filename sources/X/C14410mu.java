package X;

import java.io.IOException;

/* renamed from: X.0mu  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14410mu extends C0AZ implements C0AY {
    public static final C14410mu A06;
    public static volatile C0RQ A07;
    public int A00;
    public long A01;
    public long A02;
    public String A04 = "";
    public String A05 = "";
    public C0CX A03 = C0RU.A01;

    static {
        C14410mu c14410mu = new C14410mu();
        A06 = c14410mu;
        c14410mu.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A06;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C14410mu c14410mu = (C14410mu) obj2;
                int i = this.A00;
                boolean z2 = (i & 1) == 1;
                long j = this.A02;
                int i2 = c14410mu.A00;
                this.A02 = c0rm.AW8(z2, j, (i2 & 1) == 1, c14410mu.A02);
                this.A04 = c0rm.AWD((i & 2) == 2, this.A04, (i2 & 2) == 2, c14410mu.A04);
                this.A05 = c0rm.AWD((i & 4) == 4, this.A05, (i2 & 4) == 4, c14410mu.A05);
                this.A03 = c0rm.AW7(this.A03, c14410mu.A03);
                int i3 = this.A00;
                boolean z3 = (i3 & 8) == 8;
                long j2 = this.A01;
                int i4 = c14410mu.A00;
                this.A01 = c0rm.AW8(z3, j2, (i4 & 8) == 8, c14410mu.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 = i3 | i4;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 8) {
                                    this.A00 |= 1;
                                    this.A02 = c0ro.A06();
                                } else if (A03 == 18) {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A04 = A0A;
                                } else if (A03 == 34) {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A05 = A0A2;
                                } else if (A03 == 66) {
                                    C0CX c0cx = this.A03;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx = C0AZ.A05(c0cx);
                                        this.A03 = c0cx;
                                    }
                                    c0cx.add(c0ro.A09(C14420mv.A04.A0C(), c0rp));
                                } else if (A03 != 80) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 8;
                                    this.A01 = c0ro.A06();
                                }
                            }
                            z = true;
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
                ((C0CY) this.A03).A00 = false;
                return null;
            case 4:
                return new C14410mu();
            case 5:
                return new C0CT() { // from class: X.41M
                    {
                        C14410mu c14410mu2 = C14410mu.A06;
                    }
                };
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C14410mu.class) {
                        if (A07 == null) {
                            A07 = new C0RR(A06);
                        }
                    }
                }
                return A07;
            default:
                throw new UnsupportedOperationException();
        }
        return A06;
    }

    @Override // X.C0AX
    public int AD4() {
        int i;
        int i2 = ((C0AZ) this).A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        if ((i3 & 1) == 1) {
            i = C0RS.A08(1, this.A02) + 0;
        } else {
            i = 0;
        }
        if ((i3 & 2) == 2) {
            i += C0RS.A0B(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            i += C0RS.A0B(4, this.A05);
        }
        for (int i4 = 0; i4 < this.A03.size(); i4++) {
            i += C0RS.A0A(8, (C0AX) this.A03.get(i4));
        }
        if ((this.A00 & 8) == 8) {
            i += C0RS.A08(10, this.A01);
        }
        int A00 = this.unknownFields.A00() + i;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0M(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(4, this.A05);
        }
        for (int i = 0; i < this.A03.size(); i++) {
            c0rs.A0O(8, (C0AX) this.A03.get(i));
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0M(10, this.A01);
        }
        this.unknownFields.A02(c0rs);
    }
}
