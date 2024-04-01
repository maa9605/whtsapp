package X;

import java.io.IOException;

/* renamed from: X.3ze */
/* loaded from: classes2.dex */
public final class C87433ze extends C0AZ implements C0AY {
    public static final C87433ze A03;
    public static volatile C0RQ A04;
    public int A00;
    public C87453zg A01;
    public C87483zj A02;

    static {
        C87433ze c87433ze = new C87433ze();
        A03 = c87433ze;
        c87433ze.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87443zf c87443zf;
        C87473zi c87473zi;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87433ze c87433ze = (C87433ze) obj2;
                this.A02 = (C87483zj) c0rm.AW9(this.A02, c87433ze.A02);
                this.A01 = (C87453zg) c0rm.AW9(this.A01, c87433ze.A01);
                if (c0rm == C0RN.A00) {
                    this.A00 |= c87433ze.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 10) {
                                    if ((this.A00 & 1) == 1) {
                                        c87473zi = (C87473zi) this.A02.AVX();
                                    } else {
                                        c87473zi = null;
                                    }
                                    C87483zj c87483zj = (C87483zj) c0ro.A09(C87483zj.A02.A0C(), c0rp);
                                    this.A02 = c87483zj;
                                    if (c87473zi != null) {
                                        c87473zi.A03(c87483zj);
                                        this.A02 = (C87483zj) c87473zi.A00();
                                    }
                                    this.A00 |= 1;
                                } else if (A032 != 18) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    if ((this.A00 & 2) == 2) {
                                        c87443zf = (C87443zf) this.A01.AVX();
                                    } else {
                                        c87443zf = null;
                                    }
                                    C87453zg c87453zg = (C87453zg) c0ro.A09(C87453zg.A04.A0C(), c0rp);
                                    this.A01 = c87453zg;
                                    if (c87443zf != null) {
                                        c87443zf.A03(c87453zg);
                                        this.A01 = (C87453zg) c87443zf.A00();
                                    }
                                    this.A00 |= 2;
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            C0JX c0jx = new C0JX(e.getMessage());
                            c0jx.unfinishedMessage = this;
                            throw new RuntimeException(c0jx);
                        }
                    } catch (C0JX e2) {
                        e2.unfinishedMessage = this;
                        throw new RuntimeException(e2);
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new C87433ze();
            case 5:
                return new C0CT() { // from class: X.3zd
                    {
                        C87433ze c87433ze2 = C87433ze.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C87433ze.class) {
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
            C87483zj c87483zj = this.A02;
            if (c87483zj == null) {
                c87483zj = C87483zj.A02;
            }
            i2 = 0 + C0RS.A0A(1, c87483zj);
        }
        if ((this.A00 & 2) == 2) {
            C87453zg c87453zg = this.A01;
            if (c87453zg == null) {
                c87453zg = C87453zg.A04;
            }
            i2 += C0RS.A0A(2, c87453zg);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            C87483zj c87483zj = this.A02;
            if (c87483zj == null) {
                c87483zj = C87483zj.A02;
            }
            c0rs.A0O(1, c87483zj);
        }
        if ((this.A00 & 2) == 2) {
            C87453zg c87453zg = this.A01;
            if (c87453zg == null) {
                c87453zg = C87453zg.A04;
            }
            c0rs.A0O(2, c87453zg);
        }
        this.unknownFields.A02(c0rs);
    }
}
