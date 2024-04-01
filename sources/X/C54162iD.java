package X;

import java.io.IOException;

/* renamed from: X.2iD  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54162iD extends C0AZ implements C0AY {
    public static final C54162iD A04;
    public static volatile C0RQ A05;
    public int A00;
    public C54252iM A01;
    public C54142iB A02;
    public C54182iF A03;

    static {
        C54162iD c54162iD = new C54162iD();
        A04 = c54162iD;
        c54162iD.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C54432ij c54432ij;
        C54442ik c54442ik;
        C54412ih c54412ih;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C54162iD c54162iD = (C54162iD) obj2;
                this.A02 = (C54142iB) c0rm.AW9(this.A02, c54162iD.A02);
                this.A03 = (C54182iF) c0rm.AW9(this.A03, c54162iD.A03);
                this.A01 = (C54252iM) c0rm.AW9(this.A01, c54162iD.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c54162iD.A00;
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
                            if (A03 == 18) {
                                if ((this.A00 & 1) == 1) {
                                    c54412ih = (C54412ih) this.A02.AVX();
                                } else {
                                    c54412ih = null;
                                }
                                C54142iB c54142iB = (C54142iB) c0ro.A09(C54142iB.A04.A0C(), c0rp);
                                this.A02 = c54142iB;
                                if (c54412ih != null) {
                                    c54412ih.A03(c54142iB);
                                    this.A02 = (C54142iB) c54412ih.A00();
                                }
                                this.A00 |= 1;
                            } else if (A03 == 26) {
                                if ((this.A00 & 2) == 2) {
                                    c54442ik = (C54442ik) this.A03.AVX();
                                } else {
                                    c54442ik = null;
                                }
                                C54182iF c54182iF = (C54182iF) c0ro.A09(C54182iF.A04.A0C(), c0rp);
                                this.A03 = c54182iF;
                                if (c54442ik != null) {
                                    c54442ik.A03(c54182iF);
                                    this.A03 = (C54182iF) c54442ik.A00();
                                }
                                this.A00 |= 2;
                            } else if (A03 != 34) {
                                if (!A0I(A03, c0ro)) {
                                }
                            } else {
                                if ((this.A00 & 4) == 4) {
                                    c54432ij = (C54432ij) this.A01.AVX();
                                } else {
                                    c54432ij = null;
                                }
                                C54252iM c54252iM = (C54252iM) c0ro.A09(C54252iM.A03.A0C(), c0rp);
                                this.A01 = c54252iM;
                                if (c54432ij != null) {
                                    c54432ij.A03(c54252iM);
                                    this.A01 = (C54252iM) c54432ij.A00();
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
                return new C54162iD();
            case 5:
                return new C0CT() { // from class: X.2ii
                    {
                        C54162iD c54162iD2 = C54162iD.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C54162iD.class) {
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
            C54142iB c54142iB = this.A02;
            if (c54142iB == null) {
                c54142iB = C54142iB.A04;
            }
            i2 = 0 + C0RS.A0A(2, c54142iB);
        }
        if ((this.A00 & 2) == 2) {
            C54182iF c54182iF = this.A03;
            if (c54182iF == null) {
                c54182iF = C54182iF.A04;
            }
            i2 += C0RS.A0A(3, c54182iF);
        }
        if ((this.A00 & 4) == 4) {
            C54252iM c54252iM = this.A01;
            if (c54252iM == null) {
                c54252iM = C54252iM.A03;
            }
            i2 += C0RS.A0A(4, c54252iM);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            C54142iB c54142iB = this.A02;
            if (c54142iB == null) {
                c54142iB = C54142iB.A04;
            }
            c0rs.A0O(2, c54142iB);
        }
        if ((this.A00 & 2) == 2) {
            C54182iF c54182iF = this.A03;
            if (c54182iF == null) {
                c54182iF = C54182iF.A04;
            }
            c0rs.A0O(3, c54182iF);
        }
        if ((this.A00 & 4) == 4) {
            C54252iM c54252iM = this.A01;
            if (c54252iM == null) {
                c54252iM = C54252iM.A03;
            }
            c0rs.A0O(4, c54252iM);
        }
        this.unknownFields.A02(c0rs);
    }
}
