package X;

import java.io.IOException;

/* renamed from: X.2Fj  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48472Fj extends C0AZ implements C0AY {
    public static final C48472Fj A03;
    public static volatile C0RQ A04;
    public int A00;
    public int A01;
    public long A02;

    static {
        C48472Fj c48472Fj = new C48472Fj();
        A03 = c48472Fj;
        c48472Fj.A0E();
    }

    public static void A09(C48472Fj c48472Fj, EnumC79293lQ enumC79293lQ) {
        if (enumC79293lQ != null) {
            c48472Fj.A00 |= 1;
            c48472Fj.A01 = enumC79293lQ.value;
            return;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        boolean z = false;
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C48472Fj c48472Fj = (C48472Fj) obj2;
                int i = this.A00;
                boolean z2 = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c48472Fj.A00;
                this.A01 = c0rm.AW5(z2, i2, (i3 & 1) == 1, c48472Fj.A01);
                this.A02 = c0rm.AW8((i & 2) == 2, this.A02, (i3 & 2) == 2, c48472Fj.A02);
                if (c0rm == C0RN.A00) {
                    this.A00 = i | i3;
                }
                return this;
            case 2:
                C0RO c0ro = (C0RO) obj;
                while (!z) {
                    try {
                        int A032 = c0ro.A03();
                        if (A032 != 0) {
                            if (A032 == 8) {
                                int A02 = c0ro.A02();
                                if (EnumC79293lQ.A00(A02) == null) {
                                    super.A0F(1, A02);
                                } else {
                                    this.A00 |= 1;
                                    this.A01 = A02;
                                }
                            } else if (A032 != 16) {
                                if (!A0I(A032, c0ro)) {
                                }
                            } else {
                                this.A00 |= 2;
                                this.A02 = c0ro.A06();
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
                return new C48472Fj();
            case 5:
                return new C0CT() { // from class: X.2Fi
                    {
                        C48472Fj c48472Fj2 = C48472Fj.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C48472Fj.class) {
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
        int A042 = (i2 & 1) == 1 ? 0 + C0RS.A04(1, this.A01) : 0;
        if ((i2 & 2) == 2) {
            A042 += C0RS.A07(2, this.A02);
        }
        int A00 = this.unknownFields.A00() + A042;
        ((C0AZ) this).A00 = A00;
        return A00;
    }

    @Override // X.C0AX
    public void AWK(C0RS c0rs) {
        if ((this.A00 & 1) == 1) {
            c0rs.A0I(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            c0rs.A0M(2, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
