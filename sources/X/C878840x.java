package X;

import java.io.IOException;

/* renamed from: X.40x  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C878840x extends C0AZ implements C0AY {
    public static final C878840x A05;
    public static volatile C0RQ A06;
    public int A00;
    public int A01;
    public int A02;
    public String A03 = "";
    public boolean A04;

    static {
        C878840x c878840x = new C878840x();
        A05 = c878840x;
        c878840x.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A05;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C878840x c878840x = (C878840x) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                String str = this.A03;
                int i2 = c878840x.A00;
                this.A03 = c0rm.AWD(z, str, (i2 & 1) == 1, c878840x.A03);
                this.A01 = c0rm.AW5((i & 2) == 2, this.A01, (i2 & 2) == 2, c878840x.A01);
                this.A02 = c0rm.AW5((i & 4) == 4, this.A02, (i2 & 4) == 4, c878840x.A02);
                this.A04 = c0rm.AW1((i & 8) == 8, this.A04, (i2 & 8) == 8, c878840x.A04);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r5) {
                    try {
                        int A03 = c0ro.A03();
                        if (A03 != 0) {
                            if (A03 == 10) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 1;
                                this.A03 = A0A;
                            } else if (A03 == 16) {
                                this.A00 |= 2;
                                this.A01 = c0ro.A02();
                            } else if (A03 == 24) {
                                this.A00 |= 4;
                                this.A02 = c0ro.A02();
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
                return new C878840x();
            case 5:
                return new C0CT() { // from class: X.40w
                    {
                        C878840x c878840x2 = C878840x.A05;
                    }
                };
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C878840x.class) {
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
        int i2 = this.A00;
        if ((i2 & 2) == 2) {
            A0B += C0RS.A05(2, this.A01);
        }
        if ((i2 & 4) == 4) {
            A0B += C0RS.A05(3, this.A02);
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
            c0rs.A0I(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0I(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            c0rs.A0Q(4, this.A04);
        }
        this.unknownFields.A02(c0rs);
    }
}
