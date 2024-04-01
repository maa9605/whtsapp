package X;

import java.io.IOException;

/* renamed from: X.3zN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87263zN extends C0AZ implements C0AY {
    public static final C87263zN A03;
    public static volatile C0RQ A04;
    public int A00;
    public int A01;
    public String A02 = "";

    static {
        C87263zN c87263zN = new C87263zN();
        A03 = c87263zN;
        c87263zN.A0E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C0AZ
    public final Object A0h(C0RL c0rl, Object obj, Object obj2) {
        switch (c0rl.ordinal()) {
            case 0:
                return A03;
            case 1:
                C0RM c0rm = (C0RM) obj;
                C87263zN c87263zN = (C87263zN) obj2;
                int i = this.A00;
                boolean z = (i & 1) == 1;
                int i2 = this.A01;
                int i3 = c87263zN.A00;
                this.A01 = c0rm.AW5(z, i2, (i3 & 1) == 1, c87263zN.A01);
                this.A02 = c0rm.AWD((i & 2) == 2, this.A02, (i3 & 2) == 2, c87263zN.A02);
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
                                if (A032 == 8) {
                                    int A02 = c0ro.A02();
                                    if (C3l9.A00(A02) == null) {
                                        super.A0F(1, A02);
                                    } else {
                                        this.A00 |= 1;
                                        this.A01 = A02;
                                    }
                                } else if (A032 != 18) {
                                    if (!A0I(A032, c0ro)) {
                                    }
                                } else {
                                    String A0A = c0ro.A0A();
                                    this.A00 |= 2;
                                    this.A02 = A0A;
                                }
                            }
                            r5 = true;
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
                return new C87263zN();
            case 5:
                return new C0CT() { // from class: X.3zM
                    {
                        C87263zN c87263zN2 = C87263zN.A03;
                    }
                };
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C87263zN.class) {
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
            A042 += C0RS.A0B(2, this.A02);
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
            c0rs.A0P(2, this.A02);
        }
        this.unknownFields.A02(c0rs);
    }
}
