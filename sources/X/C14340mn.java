package X;

import java.io.IOException;

/* renamed from: X.0mn */
/* loaded from: classes.dex */
public final class C14340mn extends C0AZ implements C0AY {
    public static final C14340mn A04;
    public static volatile C0RQ A05;
    public int A00;
    public int A01;
    public C13900m0 A02;
    public C13900m0 A03;

    static {
        C14340mn c14340mn = new C14340mn();
        A04 = c14340mn;
        c14340mn.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C879241b c879241b;
        C879241b c879241b2;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C14340mn c14340mn = (C14340mn) obj2;
                this.A01 = c0rm.AW5((this.A00 & 1) == 1, this.A01, (c14340mn.A00 & 1) == 1, c14340mn.A01);
                this.A02 = (C13900m0) c0rm.AW9(this.A02, c14340mn.A02);
                this.A03 = (C13900m0) c0rm.AW9(this.A03, c14340mn.A03);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c14340mn.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int A03 = c0ro.A03();
                            if (A03 != 0) {
                                if (A03 == 8) {
                                    this.A00 |= 1;
                                    this.A01 = c0ro.A02();
                                } else if (A03 == 18) {
                                    if ((this.A00 & 2) == 2) {
                                        c879241b2 = (C879241b) this.A02.AVX();
                                    } else {
                                        c879241b2 = null;
                                    }
                                    C13900m0 c13900m0 = (C13900m0) c0ro.A09(C13900m0.A03.A0C(), c0rp);
                                    this.A02 = c13900m0;
                                    if (c879241b2 != null) {
                                        c879241b2.A03(c13900m0);
                                        this.A02 = (C13900m0) c879241b2.A00();
                                    }
                                    this.A00 |= 2;
                                } else if (A03 != 26) {
                                    if (!A0I(A03, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 4) == 4) {
                                        c879241b = (C879241b) this.A03.AVX();
                                    } else {
                                        c879241b = null;
                                    }
                                    C13900m0 c13900m02 = (C13900m0) c0ro.A09(C13900m0.A03.A0C(), c0rp);
                                    this.A03 = c13900m02;
                                    if (c879241b != null) {
                                        c879241b.A03(c13900m02);
                                        this.A03 = (C13900m0) c879241b.A00();
                                    }
                                    this.A00 |= 4;
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
                return null;
            case 4:
                return new C14340mn();
            case 5:
                return new C879141a(null);
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C14340mn.class) {
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
        int i2 = this.A00;
        int A06 = (i2 & 1) == 1 ? 0 + C0RS.A06(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            C13900m0 c13900m0 = this.A02;
            if (c13900m0 == null) {
                c13900m0 = C13900m0.A03;
            }
            A06 += C0RS.A0A(2, c13900m0);
        }
        if ((this.A00 & 4) == 4) {
            C13900m0 c13900m02 = this.A03;
            if (c13900m02 == null) {
                c13900m02 = C13900m0.A03;
            }
            A06 += C0RS.A0A(3, c13900m02);
        }
        int A00 = this.unknownFields.A00() + A06;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0K(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            C13900m0 c13900m0 = this.A02;
            if (c13900m0 == null) {
                c13900m0 = C13900m0.A03;
            }
            c0rs.A0O(2, c13900m0);
        }
        if ((this.A00 & 4) == 4) {
            C13900m0 c13900m02 = this.A03;
            if (c13900m02 == null) {
                c13900m02 = C13900m0.A03;
            }
            c0rs.A0O(3, c13900m02);
        }
        this.unknownFields.A02(c0rs);
    }
}
