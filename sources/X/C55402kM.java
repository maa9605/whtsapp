package X;

import java.io.IOException;

/* renamed from: X.2kM  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55402kM extends C0AZ implements C0AY {
    public static final C55402kM A04;
    public static volatile C0RQ A05;
    public int A01;
    public Object A03;
    public int A00 = 0;
    public C0CX A02 = C0RU.A01;

    static {
        C55402kM c55402kM = new C55402kM();
        A04 = c55402kM;
        c55402kM.A0E();
    }

    @Override // X.C0AX
    public int AD4() {
        int i = ((C0AZ) this).A00;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            i2 += C0RS.A0A(1, (C0AX) this.A02.get(i3));
        }
        if (this.A00 == 2) {
            i2 += C0RS.A0A(2, (C0Aa) this.A03);
        }
        int A00 = this.unknownFields.A00() + i2;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        for (int i = 0; i < this.A02.size(); i++) {
            c0rs.A0O(1, (C0AX) this.A02.get(i));
        }
        if (this.A00 == 2) {
            c0rs.A0O(2, (C0Aa) this.A03);
        }
        this.unknownFields.A02(c0rs);
    }

    public static void A09(C55402kM c55402kM, C55412kN c55412kN) {
        if (c55412kN == null) {
            throw null;
        }
        C0CX c0cx = c55402kM.A02;
        if (!((C0CY) c0cx).A00) {
            c0cx = C0AZ.A05(c0cx);
            c55402kM.A02 = c0cx;
        }
        c0cx.add(c55412kN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        EnumC79163lC enumC79163lC = null;
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A04;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C55402kM c55402kM = (C55402kM) obj2;
                this.A02 = c0rm.AW7(this.A02, c55402kM.A02);
                int i = c55402kM.A00;
                if (i == 0) {
                    enumC79163lC = EnumC79163lC.ACTION_NOT_SET;
                } else if (i == 2) {
                    enumC79163lC = EnumC79163lC.LOCATION;
                }
                int ordinal = enumC79163lC.ordinal();
                if (ordinal == 0) {
                    this.A03 = c0rm.AWA(this.A00 == 2, this.A03, c55402kM.A03);
                } else if (ordinal == 1) {
                    c0rm.AWB(this.A00 != 0);
                }
                if (c0rm == C0RN.A00) {
                    int i2 = c55402kM.A00;
                    if (i2 != 0) {
                        this.A00 = i2;
                    }
                    this.A01 |= c55402kM.A01;
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
                                if (A03 == 10) {
                                    C0CX c0cx = this.A02;
                                    C0CX c0cx2 = c0cx;
                                    if (!((C0CY) c0cx).A00) {
                                        c0cx2 = C0AZ.A05(c0cx);
                                        this.A02 = c0cx2;
                                    }
                                    c0cx2.add(c0ro.A09(C55412kN.A05.A0C(), c0rp));
                                } else if (A03 == 18) {
                                    C87403zb c87403zb = this.A00 == 2 ? (C87403zb) ((C55422kO) this.A03).AVX() : null;
                                    C0AX A09 = c0ro.A09(C55422kO.A04.A0C(), c0rp);
                                    this.A03 = A09;
                                    if (c87403zb != null) {
                                        c87403zb.A03((C55422kO) A09);
                                        this.A03 = c87403zb.A00();
                                    }
                                    this.A00 = 2;
                                } else if (!A0I(A03, c0ro)) {
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
                ((C0CY) this.A02).A00 = false;
                return null;
            case 4:
                return new C55402kM();
            case 5:
                return new C0CT() { // from class: X.3za
                    {
                        C55402kM c55402kM2 = C55402kM.A04;
                    }
                };
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C55402kM.class) {
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

    public C55422kO A0i() {
        return this.A00 == 2 ? (C55422kO) this.A03 : C55422kO.A04;
    }
}
