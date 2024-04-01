package X;

import java.io.IOException;

/* renamed from: X.2VT  reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2VT extends C0AZ implements C0AY {
    public static final C2VT A03;
    public static volatile C0RQ A04;
    public int A00;
    public int A01;
    public boolean A02;

    static {
        C2VT c2vt = new C2VT();
        A03 = c2vt;
        c2vt.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C2VS c2vs;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C2VT c2vt = (C2VT) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c2vt.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c2vt.A01);
                this.A02 = c0rm.AW1((i & 2) == 2, this.A02, (i3 & 2) == 2, c2vt.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!r5) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 120) {
                                    int A02 = c0ro.A02();
                                    if (A02 == 0) {
                                        c2vs = C2VS.SYSTEM;
                                    } else if (A02 == 1) {
                                        c2vs = C2VS.GOOGLE;
                                    } else if (A02 == 2) {
                                        c2vs = C2VS.HARDCODED;
                                    } else if (A02 != 3) {
                                        c2vs = A02 != 4 ? null : C2VS.FALLBACK;
                                    } else {
                                        c2vs = C2VS.OVERRIDE;
                                    }
                                    if (c2vs == null) {
                                        super.A0F(15, A02);
                                    } else {
                                        this.A00 |= 1;
                                        this.A01 = A02;
                                    }
                                } else if (A032 != 128) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    this.A00 |= 2;
                                    this.A02 = c0ro.A0F();
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
                return new C2VT();
            case 5:
                return new C0CT() { // from class: X.2hE
                    {
                        C2VT c2vt2 = C2VT.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C2VT.class) {
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
        int i2 = this.A00;
        int A042 = (i2 & 1) == 1 ? 0 + C0RS.A04(15, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A042 += C0RS.A00(16);
        }
        int A00 = this.unknownFields.A00() + A042;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0I(15, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0Q(16, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
