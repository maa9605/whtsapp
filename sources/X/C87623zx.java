package X;

import java.io.IOException;

/* renamed from: X.3zx  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87623zx extends C0AZ implements C0AY {
    public static final C87623zx A03;
    public static volatile C0RQ A04;
    public int A00;
    public int A01 = 0;
    public Object A02;

    static {
        C87623zx c87623zx = new C87623zx();
        A03 = c87623zx;
        c87623zx.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        C87603zv c87603zv;
        C87583zt c87583zt;
        EnumC79213lH enumC79213lH;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87623zx c87623zx = (C87623zx) obj2;
                int i = c87623zx.A01;
                if (i == 0) {
                    enumC79213lH = EnumC79213lH.DATETIMEONEOF_NOT_SET;
                } else if (i != 1) {
                    enumC79213lH = i != 2 ? null : EnumC79213lH.UNIX_EPOCH;
                } else {
                    enumC79213lH = EnumC79213lH.COMPONENT;
                }
                int ordinal = enumC79213lH.ordinal();
                if (ordinal == 0) {
                    this.A02 = c0rm.AWA(this.A01 == 1, this.A02, c87623zx.A02);
                } else if (ordinal == 1) {
                    this.A02 = c0rm.AWA(this.A01 == 2, this.A02, c87623zx.A02);
                } else if (ordinal == 2) {
                    c0rm.AWB(this.A01 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i2 = c87623zx.A01;
                    if (i2 != 0) {
                        this.A01 = i2;
                    }
                    this.A00 |= c87623zx.A00;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                C0RP c0rp = (C0RP) obj2;
                while (!z) {
                    try {
                        try {
                            int A032 = c0ro.A03();
                            if (A032 != 0) {
                                if (A032 == 10) {
                                    if (this.A01 == 1) {
                                        c87583zt = (C87583zt) ((C87593zu) this.A02).AVX();
                                    } else {
                                        c87583zt = null;
                                    }
                                    C0AX A09 = c0ro.A09(C87593zu.A08.A0C(), c0rp);
                                    this.A02 = A09;
                                    if (c87583zt != null) {
                                        c87583zt.A03((C87593zu) A09);
                                        this.A02 = c87583zt.A00();
                                    }
                                    this.A01 = 1;
                                } else if (A032 != 18) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    if (this.A01 == 2) {
                                        c87603zv = (C87603zv) ((C87613zw) this.A02).AVX();
                                    } else {
                                        c87603zv = null;
                                    }
                                    C0AX A092 = c0ro.A09(C87613zw.A02.A0C(), c0rp);
                                    this.A02 = A092;
                                    if (c87603zv != null) {
                                        c87603zv.A03((C87613zw) A092);
                                        this.A02 = c87603zv.A00();
                                    }
                                    this.A01 = 2;
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
                return new C87623zx();
            case 5:
                return new C0CT() { // from class: X.3zs
                    {
                        C87623zx c87623zx2 = C87623zx.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C87623zx.class) {
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
        int A0A = this.A01 == 1 ? 0 + C0RS.A0A(1, (C0Aa) this.A02) : 0;
        if (this.A01 == 2) {
            A0A += C0RS.A0A(2, (C0Aa) this.A02);
        }
        int A00 = this.unknownFields.A00() + A0A;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if (this.A01 == 1) {
            c0rs.A0O(1, (C0Aa) this.A02);
        }
        if (this.A01 == 2) {
            c0rs.A0O(2, (C0Aa) this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
