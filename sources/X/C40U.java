package X;

import java.io.IOException;

/* renamed from: X.40U  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40U extends C0AZ implements C0AY {
    public static final C40U A03;
    public static volatile C0RQ A04;
    public int A00;
    public C2G3 A01;
    public C2G3 A02;

    static {
        C40U c40u = new C40U();
        A03 = c40u;
        c40u.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        int i;
        int i2;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C40U c40u = (C40U) obj2;
                this.A01 = (C2G3) c0rm.AW9(this.A01, c40u.A01);
                this.A02 = (C2G3) c0rm.AW9(this.A02, c40u.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c40u.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z = false;
                while (!z) {
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
                                i = this.A00;
                                i2 = 1;
                            } else if (A032 == 18) {
                                i2 = 2;
                                C2G8 c2g82 = (this.A00 & 2) == 2 ? (C2G8) this.A02.AVX() : null;
                                C2G3 c2g32 = (C2G3) c0ro.A09(C2G3.A0A.A0C(), c0rp);
                                this.A02 = c2g32;
                                if (c2g82 != null) {
                                    c2g82.A03(c2g32);
                                    this.A02 = (C2G3) c2g82.A00();
                                }
                                i = this.A00;
                            } else if (!A0I(A032, c0ro)) {
                            }
                            this.A00 = i | i2;
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
                return new C40U();
            case 5:
                return new C0CT() { // from class: X.40T
                    {
                        C40U c40u2 = C40U.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C40U.class) {
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
            C2G3 c2g32 = this.A02;
            if (c2g32 == null) {
                c2g32 = C2G3.A0A;
            }
            i2 += C0RS.A0A(2, c2g32);
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
            C2G3 c2g32 = this.A02;
            if (c2g32 == null) {
                c2g32 = C2G3.A0A;
            }
            c0rs.A0O(2, c2g32);
        }
        this.unknownFields.A02(c0rs);
    }
}
