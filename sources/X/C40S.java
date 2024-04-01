package X;

import java.io.IOException;

/* renamed from: X.40S  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40S extends C0AZ implements C0AY {
    public static final C40S A03;
    public static volatile C0RQ A04;
    public int A00;
    public C2G3 A01;
    public String A02 = "";

    static {
        C40S c40s = new C40S();
        A03 = c40s;
        c40s.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40S c40s = (C40S) obj2;
                this.A01 = (C2G3) c0rm.AW9(this.A01, c40s.A01);
                int i = this.A00;
                boolean z = (i & 2) == 2;
                String str = this.A02;
                int i2 = c40s.A00;
                this.A02 = c0rm.AWD(z, str, (i2 & 2) == 2, c40s.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i2;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!r5) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 10) {
                                C2G8 c2g8 = (this.A00 & 1) == 1 ? (C2G8) this.A01.AVX() : null;
                                C2G3 c2g3 = (C2G3) c0ro.A09(C2G3.A0A.A0C(), c0rp);
                                this.A01 = c2g3;
                                if (c2g8 != null) {
                                    c2g8.A03(c2g3);
                                    this.A01 = (C2G3) c2g8.A00();
                                }
                                this.A00 |= 1;
                            } else if (A032 == 18) {
                                String A0A = c0ro.A0A();
                                this.A00 |= 2;
                                this.A02 = A0A;
                            } else if (!A0I(A032, c0ro)) {
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
                return new C40S();
            case 5:
                return new C0CT() { // from class: X.40R
                    {
                        C40S c40s2 = C40S.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C40S.class) {
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
        int i2 = 0;
        if ((this.A00 & 1) == 1) {
            C2G3 c2g3 = this.A01;
            if (c2g3 == null) {
                c2g3 = C2G3.A0A;
            }
            i2 = 0 + C0RS.A0A(1, c2g3);
        }
        if ((this.A00 & 2) == 2) {
            i2 += C0RS.A0B(2, this.A02);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            C2G3 c2g3 = this.A01;
            if (c2g3 == null) {
                c2g3 = C2G3.A0A;
            }
            c0rs.A0O(1, c2g3);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0P(2, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
