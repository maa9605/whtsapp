package X;

import java.io.IOException;

/* renamed from: X.2G4  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2G4 extends C0AZ implements C0AY {
    public static final C2G4 A04;
    public static volatile C0RQ A05;
    public int A00;
    public C40531sQ A01;
    public String A02 = "";
    public String A03 = "";

    static {
        C2G4 c2g4 = new C2G4();
        A04 = c2g4;
        c2g4.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C40541sR c40541sR;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2G4 c2g4 = (C2G4) obj2;
                this.A02 = c0rm.AWD((this.A00 & 1) == 1, this.A02, (c2g4.A00 & 1) == 1, c2g4.A02);
                this.A01 = (C40531sQ) c0rm.AW9(this.A01, c2g4.A01);
                int i = this.A00;
                boolean z = (i & 4) == 4;
                String str = this.A03;
                int i2 = c2g4.A00;
                this.A03 = c0rm.AWD(z, str, (i2 & 4) == 4, c2g4.A03);
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
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 1;
                                    this.A02 = A0A;
                                } else if (A03 == 18) {
                                    if ((this.A00 & 2) == 2) {
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
                                    this.A00 |= 2;
                                } else if (A03 != 26) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    String A0A2 = c0ro.A0A();
                                    this.A00 |= 4;
                                    this.A03 = A0A2;
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
                return new C2G4();
            case 5:
                return new C0CT() { // from class: X.2G9
                    {
                        C2G4 c2g42 = C2G4.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C2G4.class) {
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
        int A0B = (this.A00 & 1) == 1 ? 0 + C0RS.A0B(1, this.A02) : 0;
        if ((this.A00 & 2) == 2) {
            C40531sQ c40531sQ = this.A01;
            if (c40531sQ == null) {
                c40531sQ = C40531sQ.A0c;
            }
            A0B += C0RS.A0A(2, c40531sQ);
        }
        if ((this.A00 & 4) == 4) {
            A0B += C0RS.A0B(3, this.A03);
        }
        int A00 = this.unknownFields.A00() + A0B;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0P(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            C40531sQ c40531sQ = this.A01;
            if (c40531sQ == null) {
                c40531sQ = C40531sQ.A0c;
            }
            c0rs.A0O(2, c40531sQ);
        }
        if ((this.A00 & 4) == 4) {
            c0rs.A0P(3, this.A03);
        }
        this.unknownFields.A02(c0rs);
    }
}
